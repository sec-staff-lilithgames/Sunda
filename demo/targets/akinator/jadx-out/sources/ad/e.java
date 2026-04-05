package ad;

import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends zc.d {

    /* renamed from: v, reason: collision with root package name */
    public final zc.d f4260v;

    /* renamed from: w, reason: collision with root package name */
    public final Class f4261w;

    public e(Class cls, zc.d dVar) {
        super(dVar);
        this.f4260v = dVar;
        this.f4261w = cls;
    }

    @Override // zc.d
    public void assignNullSerializer(jc.w wVar) {
        this.f4260v.assignNullSerializer(wVar);
    }

    @Override // zc.d
    public void assignSerializer(jc.w wVar) {
        this.f4260v.assignSerializer(wVar);
    }

    @Override // zc.d, zc.p, rc.h0, jc.g
    public void depositSchemaProperty(uc.m mVar, u0 u0Var) throws jc.r {
        Class<?> activeView = u0Var.getActiveView();
        if (activeView == null || this.f4261w.isAssignableFrom(activeView)) {
            super.depositSchemaProperty(mVar, u0Var);
        }
    }

    @Override // zc.d, zc.p
    public void serializeAsElement(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        Class<?> activeView = u0Var.getActiveView();
        zc.d dVar = this.f4260v;
        if (activeView == null || this.f4261w.isAssignableFrom(activeView)) {
            dVar.serializeAsElement(obj, oVar, u0Var);
        } else {
            dVar.serializeAsPlaceholder(obj, oVar, u0Var);
        }
    }

    @Override // zc.d, zc.p
    public void serializeAsField(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        Class<?> activeView = u0Var.getActiveView();
        zc.d dVar = this.f4260v;
        if (activeView == null || this.f4261w.isAssignableFrom(activeView)) {
            dVar.serializeAsField(obj, oVar, u0Var);
        } else {
            dVar.serializeAsOmittedField(obj, oVar, u0Var);
        }
    }

    @Override // zc.d
    public e rename(dd.a0 a0Var) {
        return new e(this.f4261w, this.f4260v.rename(a0Var));
    }
}
