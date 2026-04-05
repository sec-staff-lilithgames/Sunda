package oc;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i1 extends mc.e {
    @Deprecated
    public i1(mc.e eVar) {
        this(eVar, 0);
    }

    public static i1 construct(jc.k kVar, mc.e eVar) {
        return new i1(eVar, 0);
    }

    @Override // mc.e, mc.f
    public Object deserializeFromObject(ub.u uVar, jc.k kVar) throws IOException {
        if (this.f74167k != null) {
            return W(uVar, kVar);
        }
        jc.q qVar = this.f74165i;
        mc.c0 c0Var = this.f74164h;
        if (qVar != null) {
            return c0Var.createUsingDelegate(kVar, qVar.deserialize(uVar, kVar));
        }
        if (this.f74162f.isAbstract()) {
            return kVar.handleMissingInstantiator(handledType(), getValueInstantiator(), uVar, "abstract type (need to add/enable type information?)", new Object[0]);
        }
        boolean zCanCreateFromString = c0Var.canCreateFromString();
        boolean zCanCreateUsingDefault = c0Var.canCreateUsingDefault();
        if (!zCanCreateFromString && !zCanCreateUsingDefault) {
            return kVar.handleMissingInstantiator(handledType(), getValueInstantiator(), uVar, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
        }
        int i10 = 0;
        Throwable thO0 = null;
        Object[] objArrCopyOf = null;
        Throwable[] thArr = null;
        while (!uVar.hasToken(ub.z.END_OBJECT)) {
            String strCurrentName = uVar.currentName();
            nc.c cVar = this.f74170n;
            mc.z zVarFind = cVar.find(strCurrentName);
            uVar.nextToken();
            if (zVarFind != null) {
                if (!"cause".equals(zVarFind.getName()) || !uVar.hasToken(ub.z.VALUE_NULL)) {
                    if (thO0 != null) {
                        zVarFind.deserializeAndSet(uVar, kVar, thO0);
                    } else {
                        if (objArrCopyOf == null) {
                            int size = cVar.size();
                            objArrCopyOf = new Object[size + size];
                        } else if (i10 == objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10 + 16);
                        }
                        int i11 = i10 + 1;
                        objArrCopyOf[i10] = zVarFind;
                        i10 += 2;
                        objArrCopyOf[i11] = zVarFind.deserialize(uVar, kVar);
                    }
                }
            } else if (PglCryptUtils.KEY_MESSAGE.equalsIgnoreCase(strCurrentName)) {
                thO0 = o0(kVar, zCanCreateFromString, uVar.getValueAsString());
            } else {
                Set set = this.f74173q;
                if (set != null && set.contains(strCurrentName)) {
                    uVar.skipChildren();
                } else if ("suppressed".equalsIgnoreCase(strCurrentName)) {
                    thArr = uVar.hasToken(ub.z.VALUE_NULL) ? null : (Throwable[]) kVar.findRootValueDeserializer(kVar.constructType(Throwable[].class)).deserialize(uVar, kVar);
                } else if ("localizedMessage".equalsIgnoreCase(strCurrentName)) {
                    uVar.skipChildren();
                } else if (this.f74172p != null) {
                    if (thO0 == null) {
                        thO0 = o0(kVar, zCanCreateFromString, null);
                    }
                    this.f74172p.deserializeAndSet(uVar, kVar, thO0, strCurrentName);
                } else if (PglCryptUtils.KEY_MESSAGE.equalsIgnoreCase(strCurrentName)) {
                    uVar.skipChildren();
                } else {
                    f0(uVar, kVar, thO0, strCurrentName);
                }
            }
            uVar.nextToken();
        }
        if (thO0 == null) {
            thO0 = o0(kVar, zCanCreateFromString, null);
        }
        if (objArrCopyOf != null) {
            for (int i12 = 0; i12 < i10; i12 += 2) {
                ((mc.z) objArrCopyOf[i12]).set(thO0, objArrCopyOf[i12 + 1]);
            }
        }
        if (thArr != null) {
            for (Throwable th2 : thArr) {
                if (th2 != null) {
                    thO0.addSuppressed(th2);
                }
            }
        }
        return thO0;
    }

    public final Throwable o0(jc.k kVar, boolean z10, String str) {
        mc.c0 c0Var = this.f74164h;
        return z10 ? str != null ? (Throwable) c0Var.createFromString(kVar, str) : (Throwable) c0Var.createFromString(kVar, null) : (Throwable) c0Var.createUsingDefault(kVar);
    }

    @Override // mc.e, mc.f, jc.q
    public jc.q unwrappingDeserializer(dd.a0 a0Var) {
        if (getClass() != i1.class) {
            return this;
        }
        i1 i1Var = new i1(this, a0Var);
        i1Var.f74169m = false;
        return i1Var;
    }

    public i1(mc.e eVar, int i10) {
        super(eVar, (dd.a0) null);
        this.f74169m = false;
    }
}
