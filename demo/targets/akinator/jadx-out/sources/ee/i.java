package ee;

import com.google.android.exoplayer2.util.n1;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f54197a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f54198b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f54199c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f54200d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f54201e;

    /* renamed from: f, reason: collision with root package name */
    public final long f54202f;

    public i(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f54198b = iArr;
        this.f54199c = jArr;
        this.f54200d = jArr2;
        this.f54201e = jArr3;
        int length = iArr.length;
        this.f54197a = length;
        if (length > 0) {
            this.f54202f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f54202f = 0L;
        }
    }

    public int getChunkIndex(long j10) {
        return n1.binarySearchFloor(this.f54201e, j10, true, true);
    }

    @Override // ee.i0
    public long getDurationUs() {
        return this.f54202f;
    }

    @Override // ee.i0
    public g0 getSeekPoints(long j10) {
        int chunkIndex = getChunkIndex(j10);
        long[] jArr = this.f54201e;
        long j11 = jArr[chunkIndex];
        long[] jArr2 = this.f54199c;
        j0 j0Var = new j0(j11, jArr2[chunkIndex]);
        if (j0Var.f54211a >= j10 || chunkIndex == this.f54197a - 1) {
            return new g0(j0Var);
        }
        int i10 = chunkIndex + 1;
        return new g0(j0Var, new j0(jArr[i10], jArr2[i10]));
    }

    @Override // ee.i0
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f54197a + ", sizes=" + Arrays.toString(this.f54198b) + ", offsets=" + Arrays.toString(this.f54199c) + ", timeUs=" + Arrays.toString(this.f54201e) + ", durationsUs=" + Arrays.toString(this.f54200d) + ")";
    }
}
