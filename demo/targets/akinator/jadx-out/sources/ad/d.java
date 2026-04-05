package ad;

import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends zc.d {

    /* renamed from: v, reason: collision with root package name */
    public final zc.d f4256v;

    /* renamed from: w, reason: collision with root package name */
    public final Class[] f4257w;

    public d(zc.d dVar, Class[] clsArr) {
        super(dVar);
        this.f4256v = dVar;
        this.f4257w = clsArr;
    }

    @Override // zc.d
    public void assignNullSerializer(jc.w wVar) {
        this.f4256v.assignNullSerializer(wVar);
    }

    @Override // zc.d
    public void assignSerializer(jc.w wVar) {
        this.f4256v.assignSerializer(wVar);
    }

    public final boolean d(Class cls) {
        if (cls == null) {
            return true;
        }
        for (Class cls2 : this.f4257w) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // zc.d, zc.p, rc.h0, jc.g
    public void depositSchemaProperty(uc.m mVar, u0 u0Var) throws jc.r {
        if (d(u0Var.getActiveView())) {
            super.depositSchemaProperty(mVar, u0Var);
        }
    }

    @Override // zc.d, zc.p
    public void serializeAsElement(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        boolean zD = d(u0Var.getActiveView());
        zc.d dVar = this.f4256v;
        if (zD) {
            dVar.serializeAsElement(obj, oVar, u0Var);
        } else {
            dVar.serializeAsPlaceholder(obj, oVar, u0Var);
        }
    }

    @Override // zc.d, zc.p
    public void serializeAsField(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        boolean zD = d(u0Var.getActiveView());
        zc.d dVar = this.f4256v;
        if (zD) {
            dVar.serializeAsField(obj, oVar, u0Var);
        } else {
            dVar.serializeAsOmittedField(obj, oVar, u0Var);
        }
    }

    @Override // zc.d
    public d rename(dd.a0 a0Var) {
        return new d(this.f4256v.rename(a0Var), this.f4257w);
    }
}
