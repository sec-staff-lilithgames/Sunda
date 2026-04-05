package io.bidmachine.media3.exoplayer;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f61400a;

    /* renamed from: b, reason: collision with root package name */
    public final float f61401b;

    /* renamed from: c, reason: collision with root package name */
    public final long f61402c;

    /* renamed from: d, reason: collision with root package name */
    public final float f61403d;

    /* renamed from: e, reason: collision with root package name */
    public final long f61404e;

    /* renamed from: f, reason: collision with root package name */
    public final long f61405f;

    /* renamed from: g, reason: collision with root package name */
    public final float f61406g;

    /* renamed from: n, reason: collision with root package name */
    public float f61413n;

    /* renamed from: o, reason: collision with root package name */
    public float f61414o;

    /* renamed from: h, reason: collision with root package name */
    public long f61407h = C.TIME_UNSET;

    /* renamed from: i, reason: collision with root package name */
    public long f61408i = C.TIME_UNSET;

    /* renamed from: k, reason: collision with root package name */
    public long f61410k = C.TIME_UNSET;

    /* renamed from: l, reason: collision with root package name */
    public long f61411l = C.TIME_UNSET;

    /* renamed from: p, reason: collision with root package name */
    public float f61415p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public long f61416q = C.TIME_UNSET;

    /* renamed from: j, reason: collision with root package name */
    public long f61409j = C.TIME_UNSET;

    /* renamed from: m, reason: collision with root package name */
    public long f61412m = C.TIME_UNSET;

    /* renamed from: r, reason: collision with root package name */
    public long f61417r = C.TIME_UNSET;

    /* renamed from: s, reason: collision with root package name */
    public long f61418s = C.TIME_UNSET;

    public m(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f61400a = f10;
        this.f61401b = f11;
        this.f61402c = j10;
        this.f61403d = f12;
        this.f61404e = j11;
        this.f61405f = j12;
        this.f61406g = f13;
        this.f61414o = f10;
        this.f61413n = f11;
    }

    public final void a() {
        long j10;
        long j11 = this.f61407h;
        if (j11 != C.TIME_UNSET) {
            j10 = this.f61408i;
            if (j10 == C.TIME_UNSET) {
                long j12 = this.f61410k;
                if (j12 != C.TIME_UNSET && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f61411l;
                if (j10 == C.TIME_UNSET || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f61409j == j10) {
            return;
        }
        this.f61409j = j10;
        this.f61412m = j10;
        this.f61417r = C.TIME_UNSET;
        this.f61418s = C.TIME_UNSET;
        this.f61416q = C.TIME_UNSET;
    }

    @Override // io.bidmachine.media3.exoplayer.s0
    public float getAdjustedPlaybackSpeed(long j10, long j11) {
        if (this.f61407h == C.TIME_UNSET) {
            return 1.0f;
        }
        long j12 = j10 - j11;
        long j13 = this.f61417r;
        if (j13 == C.TIME_UNSET) {
            this.f61417r = j12;
            this.f61418s = 0L;
        } else {
            float f10 = j13;
            float f11 = this.f61406g;
            float f12 = 1.0f - f11;
            this.f61417r = Math.max(j12, (long) ((j12 * f12) + (f10 * f11)));
            this.f61418s = (long) ((f12 * Math.abs(j12 - r9)) + (f11 * this.f61418s));
        }
        long j14 = this.f61416q;
        long j15 = this.f61402c;
        if (j14 != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.f61416q < j15) {
            return this.f61415p;
        }
        this.f61416q = SystemClock.elapsedRealtime();
        long j16 = (this.f61418s * 3) + this.f61417r;
        long j17 = this.f61412m;
        float f13 = this.f61403d;
        if (j17 > j16) {
            float fMsToUs = io.bidmachine.media3.common.util.a1.msToUs(j15);
            this.f61412m = rh.b0.max(j16, this.f61409j, this.f61412m - (((long) ((this.f61415p - 1.0f) * fMsToUs)) + ((long) ((this.f61413n - 1.0f) * fMsToUs))));
        } else {
            long jConstrainValue = io.bidmachine.media3.common.util.a1.constrainValue(j10 - ((long) (Math.max(0.0f, this.f61415p - 1.0f) / f13)), this.f61412m, j16);
            this.f61412m = jConstrainValue;
            long j18 = this.f61411l;
            if (j18 != C.TIME_UNSET && jConstrainValue > j18) {
                this.f61412m = j18;
            }
        }
        long j19 = j10 - this.f61412m;
        if (Math.abs(j19) < this.f61404e) {
            this.f61415p = 1.0f;
        } else {
            this.f61415p = io.bidmachine.media3.common.util.a1.constrainValue((f13 * j19) + 1.0f, this.f61414o, this.f61413n);
        }
        return this.f61415p;
    }

    @Override // io.bidmachine.media3.exoplayer.s0
    public long getTargetLiveOffsetUs() {
        return this.f61412m;
    }

    @Override // io.bidmachine.media3.exoplayer.s0
    public void notifyRebuffer() {
        long j10 = this.f61412m;
        if (j10 == C.TIME_UNSET) {
            return;
        }
        long j11 = j10 + this.f61405f;
        this.f61412m = j11;
        long j12 = this.f61411l;
        if (j12 != C.TIME_UNSET && j11 > j12) {
            this.f61412m = j12;
        }
        this.f61416q = C.TIME_UNSET;
    }

    @Override // io.bidmachine.media3.exoplayer.s0
    public void setLiveConfiguration(gn.i0 i0Var) {
        this.f61407h = io.bidmachine.media3.common.util.a1.msToUs(i0Var.f57944a);
        this.f61410k = io.bidmachine.media3.common.util.a1.msToUs(i0Var.f57945b);
        this.f61411l = io.bidmachine.media3.common.util.a1.msToUs(i0Var.f57946c);
        float f10 = i0Var.f57947d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f61400a;
        }
        this.f61414o = f10;
        float f11 = i0Var.f57948e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f61401b;
        }
        this.f61413n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f61407h = C.TIME_UNSET;
        }
        a();
    }

    @Override // io.bidmachine.media3.exoplayer.s0
    public void setTargetLiveOffsetOverrideUs(long j10) {
        this.f61408i = j10;
        a();
    }
}
