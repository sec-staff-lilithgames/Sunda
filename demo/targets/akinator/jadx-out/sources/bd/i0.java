package bd;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i0 extends z0 {

    /* renamed from: e, reason: collision with root package name */
    public static final i0 f9089e = new i0(jc.v.class);

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectAnyFormat(oVar);
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, jc.v vVar) {
        if (vVar instanceof jc.u) {
            return ((jc.u) vVar).isEmpty(u0Var);
        }
        return false;
    }

    @Override // bd.z0, jc.w
    public void serialize(jc.v vVar, ub.o oVar, jc.u0 u0Var) throws IOException {
        vVar.serialize(oVar, u0Var);
    }

    @Override // jc.w
    public final void serializeWithType(jc.v vVar, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        vVar.serializeWithType(oVar, u0Var, jVar);
    }
}
