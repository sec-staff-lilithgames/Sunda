package le;

import com.google.android.exoplayer2.util.g0;
import com.google.android.exoplayer2.util.n1;
import ee.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f73327a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f73328b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f73329c;

    /* renamed from: d, reason: collision with root package name */
    public long f73330d;

    public b(long j10, long j11, long j12) {
        this.f73330d = j10;
        this.f73327a = j12;
        g0 g0Var = new g0();
        this.f73328b = g0Var;
        g0 g0Var2 = new g0();
        this.f73329c = g0Var2;
        g0Var.add(0L);
        g0Var2.add(j11);
    }

    @Override // le.f
    public long getDataEndPosition() {
        return this.f73327a;
    }

    @Override // le.f, ee.i0
    public long getDurationUs() {
        return this.f73330d;
    }

    @Override // le.f, ee.i0
    public ee.g0 getSeekPoints(long j10) {
        g0 g0Var = this.f73328b;
        int iBinarySearchFloor = n1.binarySearchFloor(g0Var, j10, true, true);
        long j11 = g0Var.get(iBinarySearchFloor);
        g0 g0Var2 = this.f73329c;
        j0 j0Var = new j0(j11, g0Var2.get(iBinarySearchFloor));
        if (j0Var.f54211a == j10 || iBinarySearchFloor == g0Var.size() - 1) {
            return new ee.g0(j0Var);
        }
        int i10 = iBinarySearchFloor + 1;
        return new ee.g0(j0Var, new j0(g0Var.get(i10), g0Var2.get(i10)));
    }

    @Override // le.f
    public long getTimeUs(long j10) {
        return this.f73328b.get(n1.binarySearchFloor(this.f73329c, j10, true, true));
    }

    @Override // le.f, ee.i0
    public boolean isSeekable() {
        return true;
    }

    public boolean isTimeUsInIndex(long j10) {
        g0 g0Var = this.f73328b;
        return j10 - g0Var.get(g0Var.size() - 1) < 100000;
    }

    public void maybeAddSeekPoint(long j10, long j11) {
        if (isTimeUsInIndex(j10)) {
            return;
        }
        this.f73328b.add(j10);
        this.f73329c.add(j11);
    }
}
