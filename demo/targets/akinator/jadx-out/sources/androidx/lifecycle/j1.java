package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 extends k1 implements v0 {

    /* renamed from: g, reason: collision with root package name */
    public final b1 f6621g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l1 f6622h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, b1 b1Var, u1 u1Var) {
        super(l1Var, u1Var);
        this.f6622h = l1Var;
        this.f6621g = b1Var;
    }

    @Override // androidx.lifecycle.k1
    public final void b() {
        this.f6621g.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.k1
    public final boolean c(b1 b1Var) {
        return this.f6621g == b1Var;
    }

    @Override // androidx.lifecycle.k1
    public final boolean d() {
        return this.f6621g.getLifecycle().getCurrentState().isAtLeast(j0.f6617f);
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 b1Var, i0 i0Var) {
        b1 b1Var2 = this.f6621g;
        j0 currentState = b1Var2.getLifecycle().getCurrentState();
        if (currentState == j0.f6614b) {
            this.f6622h.removeObserver(this.f6636b);
            return;
        }
        j0 j0Var = null;
        while (j0Var != currentState) {
            a(d());
            j0Var = currentState;
            currentState = b1Var2.getLifecycle().getCurrentState();
        }
    }
}
