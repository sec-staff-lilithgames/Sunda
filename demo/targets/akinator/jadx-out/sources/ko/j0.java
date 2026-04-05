package ko;

import ko.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f71672a;

    /* renamed from: b, reason: collision with root package name */
    public final long f71673b;

    public j0(k0 k0Var, long j10) {
        this.f71672a = k0Var;
        this.f71673b = j10;
    }

    @Override // ko.y0
    public long getDurationUs() {
        return this.f71672a.getDurationUs();
    }

    @Override // ko.y0
    public w0 getSeekPoints(long j10) {
        k0 k0Var = this.f71672a;
        io.bidmachine.media3.common.util.a.checkStateNotNull(k0Var.f71699k);
        k0.a aVar = k0Var.f71699k;
        long[] jArr = aVar.f71701a;
        long[] jArr2 = aVar.f71702b;
        int iBinarySearchFloor = io.bidmachine.media3.common.util.a1.binarySearchFloor(jArr, k0Var.getSampleNumber(j10), true, false);
        long j11 = iBinarySearchFloor == -1 ? 0L : jArr[iBinarySearchFloor];
        long j12 = iBinarySearchFloor != -1 ? jArr2[iBinarySearchFloor] : 0L;
        long j13 = this.f71673b;
        z0 z0Var = new z0((j11 * 1000000) / k0Var.f71693e, j12 + j13);
        if (z0Var.f71811a == j10 || iBinarySearchFloor == jArr.length - 1) {
            return new w0(z0Var);
        }
        int i10 = iBinarySearchFloor + 1;
        return new w0(z0Var, new z0((jArr[i10] * 1000000) / k0Var.f71693e, j13 + jArr2[i10]));
    }

    @Override // ko.y0
    public boolean isSeekable() {
        return true;
    }
}
