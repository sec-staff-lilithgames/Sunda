package dp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import ko.r0;
import ko.w0;
import ko.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f52453a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52454b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52455c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52456d;

    /* renamed from: e, reason: collision with root package name */
    public final long f52457e;

    /* renamed from: f, reason: collision with root package name */
    public final long f52458f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f52459g;

    public i(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f52453a = j10;
        this.f52454b = i10;
        this.f52455c = j11;
        this.f52456d = i11;
        this.f52457e = j12;
        this.f52459g = jArr;
        this.f52458f = j12 != -1 ? j10 + j12 : -1L;
    }

    public static i create(h hVar, long j10) {
        long[] jArr;
        long jComputeDurationUs = hVar.computeDurationUs();
        r0 r0Var = hVar.f52447a;
        if (jComputeDurationUs == C.TIME_UNSET) {
            return null;
        }
        long j11 = hVar.f52449c;
        return (j11 == -1 || (jArr = hVar.f52452f) == null) ? new i(j10, r0Var.f71748c, jComputeDurationUs, r0Var.f71751f, -1L, null) : new i(j10, r0Var.f71748c, jComputeDurationUs, r0Var.f71751f, j11, jArr);
    }

    @Override // dp.f
    public int getAverageBitrate() {
        return this.f52456d;
    }

    @Override // dp.f
    public long getDataEndPosition() {
        return this.f52458f;
    }

    @Override // dp.f, ko.y0
    public long getDurationUs() {
        return this.f52455c;
    }

    @Override // dp.f, ko.y0
    public w0 getSeekPoints(long j10) {
        double d10;
        double d11;
        boolean zIsSeekable = isSeekable();
        int i10 = this.f52454b;
        long j11 = this.f52453a;
        if (!zIsSeekable) {
            return new w0(new z0(0L, j11 + i10));
        }
        long jConstrainValue = a1.constrainValue(j10, 0L, this.f52455c);
        double d12 = (jConstrainValue * 100.0d) / this.f52455c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d10 = 256.0d;
        } else if (d12 >= 100.0d) {
            d10 = 256.0d;
            d13 = 256.0d;
        } else {
            int i11 = (int) d12;
            long[] jArr = (long[]) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f52459g);
            double d14 = jArr[i11];
            if (i11 == 99) {
                d10 = 256.0d;
                d11 = 256.0d;
            } else {
                d10 = 256.0d;
                d11 = jArr[i11 + 1];
            }
            d13 = ((d11 - d14) * (d12 - i11)) + d14;
        }
        long j12 = this.f52457e;
        return new w0(new z0(jConstrainValue, j11 + a1.constrainValue(Math.round((d13 / d10) * j12), i10, j12 - 1)));
    }

    @Override // dp.f
    public long getTimeUs(long j10) {
        long j11 = j10 - this.f52453a;
        if (!isSeekable() || j11 <= this.f52454b) {
            return 0L;
        }
        long[] jArr = (long[]) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f52459g);
        double d10 = (j11 * 256.0d) / this.f52457e;
        int iBinarySearchFloor = a1.binarySearchFloor(jArr, (long) d10, true, true);
        long j12 = this.f52455c;
        long j13 = (iBinarySearchFloor * j12) / 100;
        long j14 = jArr[iBinarySearchFloor];
        int i10 = iBinarySearchFloor + 1;
        long j15 = (j12 * i10) / 100;
        return Math.round((j14 == (iBinarySearchFloor == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // dp.f, ko.y0
    public boolean isSeekable() {
        return this.f52459g != null;
    }
}
