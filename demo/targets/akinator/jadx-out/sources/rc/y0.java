package rc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f84294a;

    public y0(a1 a1Var) {
        this.f84294a = a1Var;
    }

    @Override // rc.b1
    public t0 withMember(l lVar) {
        a1 a1Var = this.f84294a;
        t0 t0VarFindObjectIdInfo = a1Var.f84109f.findObjectIdInfo(lVar);
        return t0VarFindObjectIdInfo != null ? a1Var.f84109f.findObjectReferenceInfo(lVar, t0VarFindObjectIdInfo) : t0VarFindObjectIdInfo;
    }
}
