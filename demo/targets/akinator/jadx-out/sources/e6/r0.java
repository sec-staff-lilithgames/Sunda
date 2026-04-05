package e6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public s0 f53872a;

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionStart(c0 c0Var, boolean z10) {
        super.onTransitionStart(c0Var, z10);
    }

    @Override // e6.j0, e6.g0
    public void onTransitionEnd(c0 c0Var) {
        s0 s0Var = this.f53872a;
        int i10 = s0Var.T - 1;
        s0Var.T = i10;
        if (i10 == 0) {
            s0Var.U = false;
            s0Var.g();
        }
        c0Var.removeListener(this);
    }

    @Override // e6.j0, e6.g0
    public void onTransitionStart(c0 c0Var) {
        s0 s0Var = this.f53872a;
        if (s0Var.U) {
            return;
        }
        s0Var.r();
        s0Var.U = true;
    }
}
