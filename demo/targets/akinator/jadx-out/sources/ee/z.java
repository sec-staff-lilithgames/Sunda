package ee;

import com.google.android.exoplayer2.util.n1;
import ee.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f54265a;

    /* renamed from: b, reason: collision with root package name */
    public final long f54266b;

    public z(a0 a0Var, long j10) {
        this.f54265a = a0Var;
        this.f54266b = j10;
    }

    @Override // ee.i0
    public long getDurationUs() {
        return this.f54265a.getDurationUs();
    }

    @Override // ee.i0
    public g0 getSeekPoints(long j10) {
        a0 a0Var = this.f54265a;
        com.google.android.exoplayer2.util.a.checkStateNotNull(a0Var.f54163k);
        a0.a aVar = a0Var.f54163k;
        long[] jArr = aVar.f54165a;
        long[] jArr2 = aVar.f54166b;
        int iBinarySearchFloor = n1.binarySearchFloor(jArr, a0Var.getSampleNumber(j10), true, false);
        long j11 = iBinarySearchFloor == -1 ? 0L : jArr[iBinarySearchFloor];
        long j12 = iBinarySearchFloor != -1 ? jArr2[iBinarySearchFloor] : 0L;
        long j13 = this.f54266b;
        j0 j0Var = new j0((j11 * 1000000) / a0Var.f54157e, j12 + j13);
        if (j0Var.f54211a == j10 || iBinarySearchFloor == jArr.length - 1) {
            return new g0(j0Var);
        }
        int i10 = iBinarySearchFloor + 1;
        return new g0(j0Var, new j0((jArr[i10] * 1000000) / a0Var.f54157e, j13 + jArr2[i10]));
    }

    @Override // ee.i0
    public boolean isSeekable() {
        return true;
    }
}
