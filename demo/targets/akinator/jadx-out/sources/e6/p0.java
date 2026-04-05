package e6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f53868a;

    public p0(c0 c0Var) {
        this.f53868a = c0Var;
    }

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
        this.f53868a.o();
        c0Var.removeListener(this);
    }
}
