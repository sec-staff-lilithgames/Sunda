package nc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends mc.z {

    /* renamed from: q, reason: collision with root package name */
    public final rc.i f75936q;

    /* renamed from: r, reason: collision with root package name */
    public final transient Field f75937r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f75938s;

    public l(rc.d0 d0Var, jc.o oVar, wc.g gVar, dd.b bVar, rc.i iVar) {
        super(d0Var, oVar, gVar, bVar);
        this.f75936q = iVar;
        this.f75937r = iVar.getAnnotated();
        this.f75938s = u.isSkipper(this.f74244k);
    }

    @Override // mc.z
    public void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
        Object objDeserializeWithType;
        boolean zHasToken = uVar.hasToken(ub.z.VALUE_NULL);
        mc.v vVar = this.f74244k;
        boolean z10 = this.f75938s;
        if (!zHasToken) {
            jc.q qVar = this.f74242i;
            wc.g gVar = this.f74243j;
            if (gVar == null) {
                Object objDeserialize = qVar.deserialize(uVar, kVar);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else if (z10) {
                    return;
                } else {
                    objDeserializeWithType = vVar.getNullValue(kVar);
                }
            } else {
                objDeserializeWithType = qVar.deserializeWithType(uVar, kVar, gVar);
            }
        } else if (z10) {
            return;
        } else {
            objDeserializeWithType = vVar.getNullValue(kVar);
        }
        try {
            this.f75937r.set(obj, objDeserializeWithType);
        } catch (Exception e10) {
            a(uVar, e10, objDeserializeWithType);
            throw null;
        }
    }

    @Override // mc.z
    public Object deserializeSetAndReturn(ub.u uVar, jc.k kVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
        Object objDeserializeWithType;
        boolean zHasToken = uVar.hasToken(ub.z.VALUE_NULL);
        mc.v vVar = this.f74244k;
        boolean z10 = this.f75938s;
        if (zHasToken) {
            if (!z10) {
                objDeserializeWithType = vVar.getNullValue(kVar);
                try {
                    this.f75937r.set(obj, objDeserializeWithType);
                    return obj;
                } catch (Exception e10) {
                    a(uVar, e10, objDeserializeWithType);
                    throw null;
                }
            }
            return obj;
        }
        jc.q qVar = this.f74242i;
        wc.g gVar = this.f74243j;
        if (gVar == null) {
            Object objDeserialize = qVar.deserialize(uVar, kVar);
            if (objDeserialize == null) {
                if (!z10) {
                    objDeserializeWithType = vVar.getNullValue(kVar);
                }
                return obj;
            }
            objDeserializeWithType = objDeserialize;
        } else {
            objDeserializeWithType = qVar.deserializeWithType(uVar, kVar, gVar);
        }
        this.f75937r.set(obj, objDeserializeWithType);
        return obj;
    }

    @Override // mc.z
    public void fixAccess(jc.j jVar) {
        dd.i.checkAndFixAccess(this.f75937r, jVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // mc.z, rc.h0, jc.g
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        rc.i iVar = this.f75936q;
        if (iVar == null) {
            return null;
        }
        return (A) iVar.getAnnotation(cls);
    }

    @Override // mc.z, rc.h0, jc.g
    public rc.l getMember() {
        return this.f75936q;
    }

    @Override // mc.z
    public void set(Object obj, Object obj2) throws IllegalAccessException, IOException, IllegalArgumentException {
        if (obj2 == null && this.f75938s) {
            return;
        }
        try {
            this.f75937r.set(obj, obj2);
        } catch (Exception e10) {
            a(null, e10, obj2);
            throw null;
        }
    }

    @Override // mc.z
    public Object setAndReturn(Object obj, Object obj2) throws IllegalAccessException, IOException, IllegalArgumentException {
        if (obj2 == null && this.f75938s) {
            return obj;
        }
        try {
            this.f75937r.set(obj, obj2);
            return obj;
        } catch (Exception e10) {
            a(null, e10, obj2);
            throw null;
        }
    }

    @Override // mc.z
    public mc.z withName(jc.n0 n0Var) {
        return new l(this, n0Var);
    }

    @Override // mc.z
    public mc.z withNullProvider(mc.v vVar) {
        return new l(this, this.f74242i, vVar);
    }

    @Override // mc.z
    public mc.z withValueDeserializer(jc.q qVar) {
        jc.q qVar2 = this.f74242i;
        if (qVar2 == qVar) {
            return this;
        }
        mc.v vVar = this.f74244k;
        if (qVar2 == vVar) {
            vVar = qVar;
        }
        return new l(this, qVar, vVar);
    }

    public l(l lVar, jc.q qVar, mc.v vVar) {
        super(lVar, qVar, vVar);
        this.f75936q = lVar.f75936q;
        this.f75937r = lVar.f75937r;
        this.f75938s = u.isSkipper(vVar);
    }

    public l(l lVar, jc.n0 n0Var) {
        super(lVar, n0Var);
        this.f75936q = lVar.f75936q;
        this.f75937r = lVar.f75937r;
        this.f75938s = lVar.f75938s;
    }
}
