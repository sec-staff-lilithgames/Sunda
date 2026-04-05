package ee;

import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f54184a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f54185b;

    /* renamed from: c, reason: collision with root package name */
    public final long f54186c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f54187d;

    public e0(long[] jArr, long[] jArr2, long j10) {
        com.google.android.exoplayer2.util.a.checkArgument(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f54187d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f54184a = jArr;
            this.f54185b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f54184a = jArr3;
            long[] jArr4 = new long[i10];
            this.f54185b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f54186c = j10;
    }

    @Override // ee.i0
    public long getDurationUs() {
        return this.f54186c;
    }

    @Override // ee.i0
    public g0 getSeekPoints(long j10) {
        if (!this.f54187d) {
            return new g0(j0.f54210c);
        }
        long[] jArr = this.f54185b;
        int iBinarySearchFloor = n1.binarySearchFloor(jArr, j10, true, true);
        long j11 = jArr[iBinarySearchFloor];
        long[] jArr2 = this.f54184a;
        j0 j0Var = new j0(j11, jArr2[iBinarySearchFloor]);
        if (j0Var.f54211a == j10 || iBinarySearchFloor == jArr.length - 1) {
            return new g0(j0Var);
        }
        int i10 = iBinarySearchFloor + 1;
        return new g0(j0Var, new j0(jArr[i10], jArr2[i10]));
    }

    @Override // ee.i0
    public boolean isSeekable() {
        return this.f54187d;
    }
}
