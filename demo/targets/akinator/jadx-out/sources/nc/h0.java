package nc;

import java.io.IOException;
import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final ub.u f75905a;

    /* renamed from: b, reason: collision with root package name */
    public final jc.k f75906b;

    /* renamed from: c, reason: collision with root package name */
    public final w f75907c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f75908d;

    /* renamed from: e, reason: collision with root package name */
    public int f75909e;

    /* renamed from: f, reason: collision with root package name */
    public int f75910f;

    /* renamed from: g, reason: collision with root package name */
    public final BitSet f75911g;

    /* renamed from: h, reason: collision with root package name */
    public g0 f75912h;

    /* renamed from: i, reason: collision with root package name */
    public Object f75913i;

    /* renamed from: j, reason: collision with root package name */
    public final mc.x f75914j;

    /* renamed from: k, reason: collision with root package name */
    public d0 f75915k;

    public h0(ub.u uVar, jc.k kVar, int i10, w wVar, mc.x xVar) {
        this.f75905a = uVar;
        this.f75906b = kVar;
        this.f75909e = i10;
        this.f75907c = wVar;
        this.f75908d = new Object[i10];
        if (i10 < 32) {
            this.f75911g = null;
        } else {
            this.f75911g = new BitSet();
        }
        if (xVar == null || xVar.getParameterIndex() < 0) {
            this.f75914j = null;
        } else {
            this.f75914j = xVar;
        }
    }

    public final Object a(mc.z zVar) throws jc.i {
        mc.x xVar = this.f75914j;
        if (xVar != null && zVar.getCreatorIndex() == xVar.getParameterIndex() && this.f75915k != null) {
            return null;
        }
        Object injectableValueId = zVar.getInjectableValueId();
        jc.k kVar = this.f75906b;
        if (injectableValueId != null) {
            return kVar.findInjectableValue(zVar.getInjectableValueId(), zVar, null);
        }
        if (zVar.isRequired()) {
            kVar.reportInputMismatch(zVar, "Missing required creator property '%s' (index %d)", zVar.getName(), Integer.valueOf(zVar.getCreatorIndex()));
        }
        if (kVar.isEnabled(jc.l.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            kVar.reportInputMismatch(zVar, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", zVar.getName(), Integer.valueOf(zVar.getCreatorIndex()));
        }
        try {
            Object absentValue = zVar.getNullValueProvider().getAbsentValue(kVar);
            return absentValue != null ? absentValue : zVar.getValueDeserializer().getAbsentValue(kVar);
        } catch (jc.i e10) {
            rc.l member = zVar.getMember();
            if (member != null) {
                e10.prependPath(member.getDeclaringClass(), zVar.getName());
            }
            throw e10;
        }
    }

    public boolean assignParameter(mc.z zVar, Object obj) {
        int creatorIndex = zVar.getCreatorIndex();
        this.f75908d[creatorIndex] = obj;
        BitSet bitSet = this.f75911g;
        if (bitSet == null) {
            int i10 = this.f75910f;
            int i11 = (1 << creatorIndex) | i10;
            if (i10 != i11) {
                this.f75910f = i11;
                int i12 = this.f75909e - 1;
                this.f75909e = i12;
                if (i12 <= 0) {
                    return this.f75907c == null || this.f75913i != null;
                }
            }
        } else if (!bitSet.get(creatorIndex)) {
            bitSet.set(creatorIndex);
            this.f75909e--;
        }
        return false;
    }

    public void bufferAnyParameterProperty(mc.x xVar, String str, Object obj) {
        this.f75915k = new d0(this.f75915k, obj, xVar, str);
    }

    public void bufferAnyProperty(mc.x xVar, String str, Object obj) {
        this.f75912h = new c0(this.f75912h, obj, xVar, str);
    }

    public void bufferMapProperty(Object obj, Object obj2) {
        this.f75912h = new e0(this.f75912h, obj2, obj);
    }

    public void bufferProperty(mc.z zVar, Object obj) {
        this.f75912h = new f0(this.f75912h, obj, zVar);
    }

    public Object getParameter(mc.z zVar) throws jc.i {
        Object objCreateParameterObject;
        mc.x xVar;
        boolean zHasParameter = hasParameter(zVar);
        Object[] objArr = this.f75908d;
        if (zHasParameter) {
            objCreateParameterObject = objArr[zVar.getCreatorIndex()];
        } else {
            int creatorIndex = zVar.getCreatorIndex();
            Object objA = a(zVar);
            objArr[creatorIndex] = objA;
            objCreateParameterObject = objA;
        }
        if (objCreateParameterObject == null && (xVar = this.f75914j) != null && zVar.getCreatorIndex() == xVar.getParameterIndex()) {
            objCreateParameterObject = xVar.createParameterObject();
            for (g0 g0Var = this.f75915k; g0Var != null; g0Var = g0Var.f75900a) {
                try {
                    g0Var.setValue(objCreateParameterObject);
                } catch (jc.r e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw jc.r.fromUnexpectedIOE(e11);
                }
            }
        }
        if (objCreateParameterObject == null) {
            jc.l lVar = jc.l.FAIL_ON_NULL_CREATOR_PROPERTIES;
            jc.k kVar = this.f75906b;
            if (kVar.isEnabled(lVar)) {
                return kVar.reportInputMismatch(zVar, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", zVar.getName(), Integer.valueOf(zVar.getCreatorIndex()));
            }
        }
        return objCreateParameterObject;
    }

    public Object[] getParameters(mc.z[] zVarArr) throws IOException {
        int i10 = this.f75909e;
        Object[] objArr = this.f75908d;
        if (i10 > 0) {
            BitSet bitSet = this.f75911g;
            if (bitSet != null) {
                int length = objArr.length;
                int i11 = 0;
                while (true) {
                    int iNextClearBit = bitSet.nextClearBit(i11);
                    if (iNextClearBit >= length) {
                        break;
                    }
                    objArr[iNextClearBit] = a(zVarArr[iNextClearBit]);
                    i11 = iNextClearBit + 1;
                }
            } else {
                int i12 = this.f75910f;
                int length2 = objArr.length;
                int i13 = 0;
                while (i13 < length2) {
                    if ((i12 & 1) == 0) {
                        objArr[i13] = a(zVarArr[i13]);
                    }
                    i13++;
                    i12 >>= 1;
                }
            }
        }
        mc.x xVar = this.f75914j;
        if (xVar != null) {
            int parameterIndex = xVar.getParameterIndex();
            Object objCreateParameterObject = xVar.createParameterObject();
            for (g0 g0Var = this.f75915k; g0Var != null; g0Var = g0Var.f75900a) {
                try {
                    g0Var.setValue(objCreateParameterObject);
                } catch (jc.r e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw jc.r.fromUnexpectedIOE(e11);
                }
            }
            objArr[parameterIndex] = objCreateParameterObject;
        }
        jc.l lVar = jc.l.FAIL_ON_NULL_CREATOR_PROPERTIES;
        jc.k kVar = this.f75906b;
        if (kVar.isEnabled(lVar)) {
            for (int i14 = 0; i14 < zVarArr.length; i14++) {
                if (objArr[i14] == null) {
                    mc.z zVar = zVarArr[i14];
                    kVar.reportInputMismatch(zVar, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", zVar.getName(), Integer.valueOf(zVarArr[i14].getCreatorIndex()));
                }
            }
        }
        return objArr;
    }

    public Object handleIdValue(jc.k kVar, Object obj) throws IOException {
        w wVar = this.f75907c;
        if (wVar != null) {
            Object obj2 = this.f75913i;
            if (obj2 != null) {
                kVar.findObjectId(obj2, wVar.f75968e, wVar.f75969f).bindItem(obj);
                mc.z zVar = wVar.f75971h;
                if (zVar != null) {
                    return zVar.setAndReturn(obj, this.f75913i);
                }
            } else {
                kVar.reportUnresolvedObjectId(wVar, obj);
            }
        }
        return obj;
    }

    public final boolean hasParameter(mc.z zVar) {
        int creatorIndex = zVar.getCreatorIndex();
        BitSet bitSet = this.f75911g;
        if (bitSet == null) {
            if (((this.f75910f >> creatorIndex) & 1) == 1) {
                return true;
            }
        } else if (bitSet.get(creatorIndex)) {
            return true;
        }
        mc.x xVar = this.f75914j;
        return xVar != null && creatorIndex == xVar.getParameterIndex();
    }

    public boolean isComplete() {
        return this.f75909e <= 0;
    }

    public boolean readIdProperty(String str) throws IOException {
        w wVar = this.f75907c;
        if (wVar == null || !str.equals(wVar.f75967c.getSimpleName())) {
            return false;
        }
        this.f75913i = wVar.readObjectReference(this.f75905a, this.f75906b);
        return true;
    }

    @Deprecated
    public h0(ub.u uVar, jc.k kVar, int i10, w wVar) {
        this(uVar, kVar, i10, wVar, null);
    }
}
