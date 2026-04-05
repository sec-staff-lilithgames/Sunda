package dp;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import java.math.RoundingMode;
import ko.q0;
import ko.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f52414a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52415b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f52416c;

    public b(long j10, long j11, long j12) {
        this.f52416c = new q0(new long[]{j11}, new long[]{0}, j10);
        this.f52414a = j12;
        int i10 = -2147483647;
        if (j10 == C.TIME_UNSET) {
            this.f52415b = -2147483647;
            return;
        }
        long jScaleLargeValue = a1.scaleLargeValue(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jScaleLargeValue > 0 && jScaleLargeValue <= 2147483647L) {
            i10 = (int) jScaleLargeValue;
        }
        this.f52415b = i10;
    }

    @Override // dp.f
    public int getAverageBitrate() {
        return this.f52415b;
    }

    @Override // dp.f
    public long getDataEndPosition() {
        return this.f52414a;
    }

    @Override // dp.f, ko.y0
    public long getDurationUs() {
        return this.f52416c.getDurationUs();
    }

    @Override // dp.f, ko.y0
    public w0 getSeekPoints(long j10) {
        return this.f52416c.getSeekPoints(j10);
    }

    @Override // dp.f
    public long getTimeUs(long j10) {
        return this.f52416c.getTimeUs(j10);
    }

    @Override // dp.f, ko.y0
    public boolean isSeekable() {
        return this.f52416c.isSeekable();
    }

    public boolean isTimeUsInIndex(long j10) {
        return this.f52416c.isTimeUsInIndex(j10, 100000L);
    }

    public void maybeAddSeekPoint(long j10, long j11) {
        if (isTimeUsInIndex(j10)) {
            return;
        }
        this.f52416c.addSeekPoint(j10, j11);
    }
}
