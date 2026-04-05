package e6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f53869a;

    public q(Runnable runnable) {
        this.f53869a = runnable;
    }

    @Override // e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.g0
    public /* bridge */ /* synthetic */ void onTransitionStart(c0 c0Var, boolean z10) {
        super.onTransitionStart(c0Var, z10);
    }

    @Override // e6.g0
    public void onTransitionEnd(c0 c0Var) {
        this.f53869a.run();
    }

    @Override // e6.g0
    public void onTransitionStart(c0 c0Var) {
    }

    @Override // e6.g0
    public void onTransitionCancel(c0 c0Var) {
    }

    @Override // e6.g0
    public void onTransitionPause(c0 c0Var) {
    }

    @Override // e6.g0
    public void onTransitionResume(c0 c0Var) {
    }
}
