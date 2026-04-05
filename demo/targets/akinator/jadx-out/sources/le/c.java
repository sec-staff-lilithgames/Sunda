package le;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.n1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ee.g0;
import ee.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f73331a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f73332b;

    /* renamed from: c, reason: collision with root package name */
    public final long f73333c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f73331a = jArr;
        this.f73332b = jArr2;
        this.f73333c = j10 == C.TIME_UNSET ? n1.msToUs(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair a(long j10, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = n1.binarySearchFloor(jArr, j10, true, true);
        long j11 = jArr[iBinarySearchFloor];
        long j12 = jArr2[iBinarySearchFloor];
        int i10 = iBinarySearchFloor + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    public static c create(long j10, MlltFrame mlltFrame, long j11) {
        int length = mlltFrame.f27770g.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += mlltFrame.f27768e + mlltFrame.f27770g[i12];
            j12 += mlltFrame.f27769f + mlltFrame.f27771h[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    @Override // le.f
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // le.f, ee.i0
    public long getDurationUs() {
        return this.f73333c;
    }

    @Override // le.f, ee.i0
    public g0 getSeekPoints(long j10) {
        Pair pairA = a(n1.usToMs(n1.constrainValue(j10, 0L, this.f73333c)), this.f73332b, this.f73331a);
        return new g0(new j0(n1.msToUs(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue()));
    }

    @Override // le.f
    public long getTimeUs(long j10) {
        return n1.msToUs(((Long) a(j10, this.f73331a, this.f73332b).second).longValue());
    }

    @Override // le.f, ee.i0
    public boolean isSeekable() {
        return true;
    }
}
