package ko;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f71730a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f71731b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f71732c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f71733d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f71734e;

    /* renamed from: f, reason: collision with root package name */
    public final long f71735f;

    public q(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f71731b = iArr;
        this.f71732c = jArr;
        this.f71733d = jArr2;
        this.f71734e = jArr3;
        int length = iArr.length;
        this.f71730a = length;
        if (length > 0) {
            this.f71735f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f71735f = 0L;
        }
    }

    public int getChunkIndex(long j10) {
        return io.bidmachine.media3.common.util.a1.binarySearchFloor(this.f71734e, j10, true, true);
    }

    @Override // ko.y0
    public long getDurationUs() {
        return this.f71735f;
    }

    @Override // ko.y0
    public w0 getSeekPoints(long j10) {
        int chunkIndex = getChunkIndex(j10);
        long[] jArr = this.f71734e;
        long j11 = jArr[chunkIndex];
        long[] jArr2 = this.f71732c;
        z0 z0Var = new z0(j11, jArr2[chunkIndex]);
        if (z0Var.f71811a >= j10 || chunkIndex == this.f71730a - 1) {
            return new w0(z0Var);
        }
        int i10 = chunkIndex + 1;
        return new w0(z0Var, new z0(jArr[i10], jArr2[i10]));
    }

    @Override // ko.y0
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f71730a + ", sizes=" + Arrays.toString(this.f71731b) + ", offsets=" + Arrays.toString(this.f71732c) + ", timeUs=" + Arrays.toString(this.f71734e) + ", durationsUs=" + Arrays.toString(this.f71733d) + ")";
    }
}
