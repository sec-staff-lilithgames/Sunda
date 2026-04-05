package e6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements r4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f53790a;

    public /* synthetic */ e0(f0 f0Var) {
        this.f53790a = f0Var;
    }

    @Override // r4.v
    public final void onAnimationEnd(r4.y yVar, boolean z10, float f10, float f11) {
        f0 f0Var = this.f53790a;
        s0 s0Var = f0Var.f53800j;
        if (z10) {
            return;
        }
        i0 i0Var = i0.G8;
        if (f10 >= 1.0f) {
            s0Var.m(s0Var, i0Var, false);
            return;
        }
        long durationMillis = f0Var.getDurationMillis();
        c0 transitionAt = s0Var.getTransitionAt(0);
        c0 c0Var = transitionAt.E;
        transitionAt.E = null;
        s0Var.q(-1L, f0Var.f53791a);
        s0Var.q(durationMillis, -1L);
        f0Var.f53791a = durationMillis;
        Runnable runnable = f0Var.f53799i;
        if (runnable != null) {
            runnable.run();
        }
        s0Var.G.clear();
        if (c0Var != null) {
            c0Var.m(c0Var, i0Var, true);
        }
    }
}
