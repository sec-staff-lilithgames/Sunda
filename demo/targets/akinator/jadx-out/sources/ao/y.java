package ao;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class y extends gn.u1 {

    /* renamed from: e, reason: collision with root package name */
    public final gn.u1 f7904e;

    public y(gn.u1 u1Var) {
        this.f7904e = u1Var;
    }

    @Override // gn.u1
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // gn.u1
    public int getFirstWindowIndex(boolean z10) {
        return this.f7904e.getFirstWindowIndex(z10);
    }

    @Override // gn.u1
    public int getIndexOfPeriod(Object obj) {
        return this.f7904e.getIndexOfPeriod(obj);
    }

    @Override // gn.u1
    public int getLastWindowIndex(boolean z10) {
        return this.f7904e.getLastWindowIndex(z10);
    }

    @Override // gn.u1
    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        return this.f7904e.getNextWindowIndex(i10, i11, z10);
    }

    @Override // gn.u1
    public gn.r1 getPeriod(int i10, gn.r1 r1Var, boolean z10) {
        return this.f7904e.getPeriod(i10, r1Var, z10);
    }

    @Override // gn.u1
    public final gn.r1 getPeriodByUid(Object obj, gn.r1 r1Var) {
        return super.getPeriodByUid(obj, r1Var);
    }

    @Override // gn.u1
    public int getPeriodCount() {
        return this.f7904e.getPeriodCount();
    }

    @Override // gn.u1
    public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        return this.f7904e.getPreviousWindowIndex(i10, i11, z10);
    }

    @Override // gn.u1
    public Object getUidOfPeriod(int i10) {
        return this.f7904e.getUidOfPeriod(i10);
    }

    @Override // gn.u1
    public gn.t1 getWindow(int i10, gn.t1 t1Var, long j10) {
        return this.f7904e.getWindow(i10, t1Var, j10);
    }

    @Override // gn.u1
    public int getWindowCount() {
        return this.f7904e.getWindowCount();
    }

    @Override // gn.u1
    public final int hashCode() {
        return super.hashCode();
    }
}
