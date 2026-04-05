package b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public s0.n f8572c;

    /* renamed from: d, reason: collision with root package name */
    public int f8573d;

    public a1(long j10, s0.n nVar) {
        super(j10);
        this.f8572c = nVar;
    }

    @Override // b1.y0
    public void assign(y0 y0Var) {
        synchronized (n0.f8657a) {
            kotlin.jvm.internal.e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.StateSetStateRecord>");
            this.f8572c = ((a1) y0Var).f8572c;
            this.f8573d = ((a1) y0Var).f8573d;
        }
    }

    @Override // b1.y0
    public y0 create() {
        return new a1(y.currentSnapshot().getSnapshotId(), this.f8572c);
    }

    public final int getModification$runtime() {
        return this.f8573d;
    }

    public final s0.n getSet$runtime() {
        return this.f8572c;
    }

    public final void setModification$runtime(int i10) {
        this.f8573d = i10;
    }

    public final void setSet$runtime(s0.n nVar) {
        this.f8572c = nVar;
    }

    @Override // b1.y0
    public y0 create(long j10) {
        return new a1(j10, this.f8572c);
    }
}
