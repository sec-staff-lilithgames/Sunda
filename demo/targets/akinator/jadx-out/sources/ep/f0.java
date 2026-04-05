package ep;

import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f54859a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54860b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f54861c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f54862d;

    /* renamed from: e, reason: collision with root package name */
    public final int f54863e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f54864f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f54865g;

    /* renamed from: h, reason: collision with root package name */
    public final long f54866h;

    public f0(c0 c0Var, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        io.bidmachine.media3.common.util.a.checkArgument(iArr.length == jArr2.length);
        io.bidmachine.media3.common.util.a.checkArgument(jArr.length == jArr2.length);
        io.bidmachine.media3.common.util.a.checkArgument(iArr2.length == jArr2.length);
        this.f54859a = c0Var;
        this.f54861c = jArr;
        this.f54862d = iArr;
        this.f54863e = i10;
        this.f54864f = jArr2;
        this.f54865g = iArr2;
        this.f54866h = j10;
        this.f54860b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int getIndexOfEarlierOrEqualSynchronizationSample(long j10) {
        for (int iBinarySearchFloor = a1.binarySearchFloor(this.f54864f, j10, true, false); iBinarySearchFloor >= 0; iBinarySearchFloor--) {
            if ((this.f54865g[iBinarySearchFloor] & 1) != 0) {
                return iBinarySearchFloor;
            }
        }
        return -1;
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long j10) {
        long[] jArr = this.f54864f;
        for (int iBinarySearchCeil = a1.binarySearchCeil(jArr, j10, true, false); iBinarySearchCeil < jArr.length; iBinarySearchCeil++) {
            if ((this.f54865g[iBinarySearchCeil] & 1) != 0) {
                return iBinarySearchCeil;
            }
        }
        return -1;
    }
}
