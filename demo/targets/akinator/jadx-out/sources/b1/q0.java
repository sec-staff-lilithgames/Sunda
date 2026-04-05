package b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public s0.j f8672c;

    /* renamed from: d, reason: collision with root package name */
    public int f8673d;

    /* renamed from: e, reason: collision with root package name */
    public int f8674e;

    public q0(long j10, s0.j jVar) {
        super(j10);
        this.f8672c = jVar;
    }

    @Override // b1.y0
    public void assign(y0 y0Var) {
        synchronized (h0.f8614a) {
            kotlin.jvm.internal.e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f8672c = ((q0) y0Var).f8672c;
            this.f8673d = ((q0) y0Var).f8673d;
            this.f8674e = ((q0) y0Var).f8674e;
        }
    }

    @Override // b1.y0
    public y0 create() {
        return create(y.currentSnapshot().getSnapshotId());
    }

    public final s0.j getList$runtime() {
        return this.f8672c;
    }

    public final int getModification$runtime() {
        return this.f8673d;
    }

    public final int getStructuralChange$runtime() {
        return this.f8674e;
    }

    public final void setList$runtime(s0.j jVar) {
        this.f8672c = jVar;
    }

    public final void setModification$runtime(int i10) {
        this.f8673d = i10;
    }

    public final void setStructuralChange$runtime(int i10) {
        this.f8674e = i10;
    }

    @Override // b1.y0
    public y0 create(long j10) {
        return new q0(j10, this.f8672c);
    }
}
