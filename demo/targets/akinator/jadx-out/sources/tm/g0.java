package tm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g0 implements an.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f87067b;

    public g0(l0 l0Var) {
        this.f87067b = l0Var;
    }

    @Override // an.a
    public void onCloseClick() {
        qm.b bVarPlaceholder = qm.b.placeholder("Close button clicked");
        l0 l0Var = this.f87067b;
        sm.b bVar = l0Var.f87084r;
        if (bVar != null) {
            bVar.onError(bVarPlaceholder);
        }
        m0 m0Var = l0Var.f87083q;
        if (m0Var != null) {
            m0Var.onShowFailed(l0Var, bVarPlaceholder);
        }
        m0 m0Var2 = l0Var.f87083q;
        if (m0Var2 != null) {
            m0Var2.onClose(l0Var);
        }
    }

    @Override // an.a
    public void onCountDownFinish() {
    }
}
