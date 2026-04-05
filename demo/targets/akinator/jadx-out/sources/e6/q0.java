package e6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f53870a;

    public q0(s0 s0Var) {
        this.f53870a = s0Var;
    }

    @Override // e6.j0, e6.g0
    public void onTransitionCancel(c0 c0Var) {
        s0 s0Var = this.f53870a;
        s0Var.R.remove(c0Var);
        if (s0Var.k()) {
            return;
        }
        s0Var.m(s0Var, i0.H8, false);
        s0Var.D = true;
        s0Var.m(s0Var, i0.G8, false);
    }

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionStart(c0 c0Var, boolean z10) {
        super.onTransitionStart(c0Var, z10);
    }
}
