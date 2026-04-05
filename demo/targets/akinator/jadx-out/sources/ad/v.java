package ad;

import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v implements zc.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.c f4306b;

    public v(zc.c cVar) {
        this.f4306b = cVar;
    }

    @Override // zc.o
    public void depositSchemaProperty(zc.p pVar, yc.v vVar, u0 u0Var) throws jc.r {
        this.f4306b.depositSchemaProperty((zc.d) pVar, vVar, u0Var);
    }

    @Override // zc.o
    public void serializeAsElement(Object obj, ub.o oVar, u0 u0Var, zc.p pVar) throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override // zc.o
    public void serializeAsField(Object obj, ub.o oVar, u0 u0Var, zc.p pVar) throws Exception {
        this.f4306b.serializeAsField(obj, oVar, u0Var, (zc.d) pVar);
    }

    @Override // zc.o
    public void depositSchemaProperty(zc.p pVar, uc.m mVar, u0 u0Var) throws jc.r {
        this.f4306b.depositSchemaProperty((zc.d) pVar, mVar, u0Var);
    }
}
