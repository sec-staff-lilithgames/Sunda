package dp;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import ko.w0;
import ko.z0;
import yo.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f52417a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f52418b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52419c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f52417a = jArr;
        this.f52418b = jArr2;
        this.f52419c = j10 == C.TIME_UNSET ? a1.msToUs(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair a(long j10, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = a1.binarySearchFloor(jArr, j10, true, true);
        long j11 = jArr[iBinarySearchFloor];
        long j12 = jArr2[iBinarySearchFloor];
        int i10 = iBinarySearchFloor + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    public static c create(long j10, l lVar, long j11) {
        int length = lVar.f94744e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += lVar.f94742c + lVar.f94744e[i12];
            j12 += lVar.f94743d + lVar.f94745f[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    @Override // dp.f
    public int getAverageBitrate() {
        return -2147483647;
    }

    @Override // dp.f
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // dp.f, ko.y0
    public long getDurationUs() {
        return this.f52419c;
    }

    @Override // dp.f, ko.y0
    public w0 getSeekPoints(long j10) {
        Pair pairA = a(a1.usToMs(a1.constrainValue(j10, 0L, this.f52419c)), this.f52418b, this.f52417a);
        return new w0(new z0(a1.msToUs(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue()));
    }

    @Override // dp.f
    public long getTimeUs(long j10) {
        return a1.msToUs(((Long) a(j10, this.f52417a, this.f52418b).second).longValue());
    }

    @Override // dp.f, ko.y0
    public boolean isSeekable() {
        return true;
    }
}
