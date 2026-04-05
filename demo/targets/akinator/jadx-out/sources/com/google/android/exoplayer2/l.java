package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f27603a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27604b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27605c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27606d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27607e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27608f;

    /* renamed from: g, reason: collision with root package name */
    public final float f27609g;

    /* renamed from: n, reason: collision with root package name */
    public float f27616n;

    /* renamed from: o, reason: collision with root package name */
    public float f27617o;

    /* renamed from: h, reason: collision with root package name */
    public long f27610h = C.TIME_UNSET;

    /* renamed from: i, reason: collision with root package name */
    public long f27611i = C.TIME_UNSET;

    /* renamed from: k, reason: collision with root package name */
    public long f27613k = C.TIME_UNSET;

    /* renamed from: l, reason: collision with root package name */
    public long f27614l = C.TIME_UNSET;

    /* renamed from: p, reason: collision with root package name */
    public float f27618p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public long f27619q = C.TIME_UNSET;

    /* renamed from: j, reason: collision with root package name */
    public long f27612j = C.TIME_UNSET;

    /* renamed from: m, reason: collision with root package name */
    public long f27615m = C.TIME_UNSET;

    /* renamed from: r, reason: collision with root package name */
    public long f27620r = C.TIME_UNSET;

    /* renamed from: s, reason: collision with root package name */
    public long f27621s = C.TIME_UNSET;

    public l(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f27603a = f10;
        this.f27604b = f11;
        this.f27605c = j10;
        this.f27606d = f12;
        this.f27607e = j11;
        this.f27608f = j12;
        this.f27609g = f13;
        this.f27617o = f10;
        this.f27616n = f11;
    }

    public final void a() {
        long j10 = this.f27610h;
        if (j10 != C.TIME_UNSET) {
            long j11 = this.f27611i;
            if (j11 != C.TIME_UNSET) {
                j10 = j11;
            }
            long j12 = this.f27613k;
            if (j12 != C.TIME_UNSET && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f27614l;
            if (j13 != C.TIME_UNSET && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f27612j == j10) {
            return;
        }
        this.f27612j = j10;
        this.f27615m = j10;
        this.f27620r = C.TIME_UNSET;
        this.f27621s = C.TIME_UNSET;
        this.f27619q = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.d1
    public float getAdjustedPlaybackSpeed(long j10, long j11) {
        if (this.f27610h == C.TIME_UNSET) {
            return 1.0f;
        }
        long j12 = j10 - j11;
        long j13 = this.f27620r;
        if (j13 == C.TIME_UNSET) {
            this.f27620r = j12;
            this.f27621s = 0L;
        } else {
            float f10 = j13;
            float f11 = this.f27609g;
            float f12 = 1.0f - f11;
            this.f27620r = Math.max(j12, (long) ((j12 * f12) + (f10 * f11)));
            this.f27621s = (long) ((f12 * Math.abs(j12 - r9)) + (f11 * this.f27621s));
        }
        long j14 = this.f27619q;
        long j15 = this.f27605c;
        if (j14 != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.f27619q < j15) {
            return this.f27618p;
        }
        this.f27619q = SystemClock.elapsedRealtime();
        long j16 = (this.f27621s * 3) + this.f27620r;
        long j17 = this.f27615m;
        float f13 = this.f27606d;
        if (j17 > j16) {
            float fMsToUs = com.google.android.exoplayer2.util.n1.msToUs(j15);
            this.f27615m = rh.b0.max(j16, this.f27612j, this.f27615m - (((long) ((this.f27618p - 1.0f) * fMsToUs)) + ((long) ((this.f27616n - 1.0f) * fMsToUs))));
        } else {
            long jConstrainValue = com.google.android.exoplayer2.util.n1.constrainValue(j10 - ((long) (Math.max(0.0f, this.f27618p - 1.0f) / f13)), this.f27615m, j16);
            this.f27615m = jConstrainValue;
            long j18 = this.f27614l;
            if (j18 != C.TIME_UNSET && jConstrainValue > j18) {
                this.f27615m = j18;
            }
        }
        long j19 = j10 - this.f27615m;
        if (Math.abs(j19) < this.f27607e) {
            this.f27618p = 1.0f;
        } else {
            this.f27618p = com.google.android.exoplayer2.util.n1.constrainValue((f13 * j19) + 1.0f, this.f27617o, this.f27616n);
        }
        return this.f27618p;
    }

    @Override // com.google.android.exoplayer2.d1
    public long getTargetLiveOffsetUs() {
        return this.f27615m;
    }

    @Override // com.google.android.exoplayer2.d1
    public void notifyRebuffer() {
        long j10 = this.f27615m;
        if (j10 == C.TIME_UNSET) {
            return;
        }
        long j11 = j10 + this.f27608f;
        this.f27615m = j11;
        long j12 = this.f27614l;
        if (j12 != C.TIME_UNSET && j11 > j12) {
            this.f27615m = j12;
        }
        this.f27619q = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.d1
    public void setLiveConfiguration(n1 n1Var) {
        this.f27610h = com.google.android.exoplayer2.util.n1.msToUs(n1Var.f27819b);
        this.f27613k = com.google.android.exoplayer2.util.n1.msToUs(n1Var.f27820c);
        this.f27614l = com.google.android.exoplayer2.util.n1.msToUs(n1Var.f27821e);
        float f10 = n1Var.f27822f;
        if (f10 == -3.4028235E38f) {
            f10 = this.f27603a;
        }
        this.f27617o = f10;
        float f11 = n1Var.f27823g;
        if (f11 == -3.4028235E38f) {
            f11 = this.f27604b;
        }
        this.f27616n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f27610h = C.TIME_UNSET;
        }
        a();
    }

    @Override // com.google.android.exoplayer2.d1
    public void setTargetLiveOffsetOverrideUs(long j10) {
        this.f27611i = j10;
        a();
    }
}
