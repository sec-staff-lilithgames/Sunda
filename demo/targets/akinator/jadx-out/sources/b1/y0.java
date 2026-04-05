package b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public long f8714a;

    /* renamed from: b, reason: collision with root package name */
    public y0 f8715b;

    public y0(long j10) {
        this.f8714a = j10;
    }

    public abstract void assign(y0 y0Var);

    public abstract y0 create();

    @tu.f
    public /* synthetic */ y0 create(int i10) {
        y0 y0VarCreate = create();
        y0VarCreate.f8714a = v.toSnapshotId(i10);
        return y0VarCreate;
    }

    public final y0 getNext$runtime() {
        return this.f8715b;
    }

    public final long getSnapshotId$runtime() {
        return this.f8714a;
    }

    public final void setNext$runtime(y0 y0Var) {
        this.f8715b = y0Var;
    }

    public final void setSnapshotId$runtime(long j10) {
        this.f8714a = j10;
    }

    public y0 create(long j10) {
        y0 y0VarCreate = create();
        y0VarCreate.f8714a = j10;
        return y0VarCreate;
    }

    public y0() {
        this(y.currentSnapshot().getSnapshotId());
    }

    @tu.f
    public y0(int i10) {
        this(v.toSnapshotId(i10));
    }
}
