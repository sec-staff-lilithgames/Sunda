package io.odeeo.internal.b;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements x {

    /* renamed from: a, reason: collision with root package name */
    public final float f62716a;

    /* renamed from: b, reason: collision with root package name */
    public final float f62717b;

    /* renamed from: c, reason: collision with root package name */
    public final long f62718c;

    /* renamed from: d, reason: collision with root package name */
    public final float f62719d;

    /* renamed from: e, reason: collision with root package name */
    public final long f62720e;

    /* renamed from: f, reason: collision with root package name */
    public final long f62721f;

    /* renamed from: g, reason: collision with root package name */
    public final float f62722g;

    /* renamed from: h, reason: collision with root package name */
    public long f62723h;

    /* renamed from: i, reason: collision with root package name */
    public long f62724i;

    /* renamed from: j, reason: collision with root package name */
    public long f62725j;

    /* renamed from: k, reason: collision with root package name */
    public long f62726k;

    /* renamed from: l, reason: collision with root package name */
    public long f62727l;

    /* renamed from: m, reason: collision with root package name */
    public long f62728m;

    /* renamed from: n, reason: collision with root package name */
    public float f62729n;

    /* renamed from: o, reason: collision with root package name */
    public float f62730o;

    /* renamed from: p, reason: collision with root package name */
    public float f62731p;

    /* renamed from: q, reason: collision with root package name */
    public long f62732q;

    /* renamed from: r, reason: collision with root package name */
    public long f62733r;

    /* renamed from: s, reason: collision with root package name */
    public long f62734s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public float f62735a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        public float f62736b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        public long f62737c = 1000;

        /* renamed from: d, reason: collision with root package name */
        public float f62738d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        public long f62739e = io.odeeo.internal.q0.g0.msToUs(20);

        /* renamed from: f, reason: collision with root package name */
        public long f62740f = io.odeeo.internal.q0.g0.msToUs(500);

        /* renamed from: g, reason: collision with root package name */
        public float f62741g = 0.999f;

        public i build() {
            return new i(this.f62735a, this.f62736b, this.f62737c, this.f62738d, this.f62739e, this.f62740f, this.f62741g);
        }

        public b setFallbackMaxPlaybackSpeed(float f10) {
            io.odeeo.internal.q0.a.checkArgument(f10 >= 1.0f);
            this.f62736b = f10;
            return this;
        }

        public b setFallbackMinPlaybackSpeed(float f10) {
            io.odeeo.internal.q0.a.checkArgument(0.0f < f10 && f10 <= 1.0f);
            this.f62735a = f10;
            return this;
        }

        public b setMaxLiveOffsetErrorMsForUnitSpeed(long j10) {
            io.odeeo.internal.q0.a.checkArgument(j10 > 0);
            this.f62739e = io.odeeo.internal.q0.g0.msToUs(j10);
            return this;
        }

        public b setMinPossibleLiveOffsetSmoothingFactor(float f10) {
            io.odeeo.internal.q0.a.checkArgument(f10 >= 0.0f && f10 < 1.0f);
            this.f62741g = f10;
            return this;
        }

        public b setMinUpdateIntervalMs(long j10) {
            io.odeeo.internal.q0.a.checkArgument(j10 > 0);
            this.f62737c = j10;
            return this;
        }

        public b setProportionalControlFactor(float f10) {
            io.odeeo.internal.q0.a.checkArgument(f10 > 0.0f);
            this.f62738d = f10 / 1000000.0f;
            return this;
        }

        public b setTargetLiveOffsetIncrementOnRebufferMs(long j10) {
            io.odeeo.internal.q0.a.checkArgument(j10 >= 0);
            this.f62740f = io.odeeo.internal.q0.g0.msToUs(j10);
            return this;
        }
    }

    public static long a(long j10, long j11, float f10) {
        return (long) (((1.0f - f10) * j11) + (j10 * f10));
    }

    @Override // io.odeeo.internal.b.x
    public float getAdjustedPlaybackSpeed(long j10, long j11) {
        if (this.f62723h == C.TIME_UNSET) {
            return 1.0f;
        }
        a(j10, j11);
        if (this.f62732q != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.f62732q < this.f62718c) {
            return this.f62731p;
        }
        this.f62732q = SystemClock.elapsedRealtime();
        a(j10);
        long j12 = j10 - this.f62728m;
        if (Math.abs(j12) < this.f62720e) {
            this.f62731p = 1.0f;
        } else {
            this.f62731p = io.odeeo.internal.q0.g0.constrainValue((this.f62719d * j12) + 1.0f, this.f62730o, this.f62729n);
        }
        return this.f62731p;
    }

    @Override // io.odeeo.internal.b.x
    public long getTargetLiveOffsetUs() {
        return this.f62728m;
    }

    @Override // io.odeeo.internal.b.x
    public void notifyRebuffer() {
        long j10 = this.f62728m;
        if (j10 == C.TIME_UNSET) {
            return;
        }
        long j11 = j10 + this.f62721f;
        this.f62728m = j11;
        long j12 = this.f62727l;
        if (j12 != C.TIME_UNSET && j11 > j12) {
            this.f62728m = j12;
        }
        this.f62732q = C.TIME_UNSET;
    }

    @Override // io.odeeo.internal.b.x
    public void setLiveConfiguration(z.g gVar) {
        this.f62723h = io.odeeo.internal.q0.g0.msToUs(gVar.f63166a);
        this.f62726k = io.odeeo.internal.q0.g0.msToUs(gVar.f63167b);
        this.f62727l = io.odeeo.internal.q0.g0.msToUs(gVar.f63168c);
        float f10 = gVar.f63169d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f62716a;
        }
        this.f62730o = f10;
        float f11 = gVar.f63170e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f62717b;
        }
        this.f62729n = f11;
        a();
    }

    @Override // io.odeeo.internal.b.x
    public void setTargetLiveOffsetOverrideUs(long j10) {
        this.f62724i = j10;
        a();
    }

    public i(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f62716a = f10;
        this.f62717b = f11;
        this.f62718c = j10;
        this.f62719d = f12;
        this.f62720e = j11;
        this.f62721f = j12;
        this.f62722g = f13;
        this.f62723h = C.TIME_UNSET;
        this.f62724i = C.TIME_UNSET;
        this.f62726k = C.TIME_UNSET;
        this.f62727l = C.TIME_UNSET;
        this.f62730o = f10;
        this.f62729n = f11;
        this.f62731p = 1.0f;
        this.f62732q = C.TIME_UNSET;
        this.f62725j = C.TIME_UNSET;
        this.f62728m = C.TIME_UNSET;
        this.f62733r = C.TIME_UNSET;
        this.f62734s = C.TIME_UNSET;
    }

    public final void a() {
        long j10 = this.f62723h;
        if (j10 != C.TIME_UNSET) {
            long j11 = this.f62724i;
            if (j11 != C.TIME_UNSET) {
                j10 = j11;
            }
            long j12 = this.f62726k;
            if (j12 != C.TIME_UNSET && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f62727l;
            if (j13 != C.TIME_UNSET && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f62725j == j10) {
            return;
        }
        this.f62725j = j10;
        this.f62728m = j10;
        this.f62733r = C.TIME_UNSET;
        this.f62734s = C.TIME_UNSET;
        this.f62732q = C.TIME_UNSET;
    }

    public final void a(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f62733r;
        if (j13 == C.TIME_UNSET) {
            this.f62733r = j12;
            this.f62734s = 0L;
        } else {
            long jMax = Math.max(j12, a(j13, j12, this.f62722g));
            this.f62733r = jMax;
            this.f62734s = a(this.f62734s, Math.abs(j12 - jMax), this.f62722g);
        }
    }

    public final void a(long j10) {
        long j11 = (this.f62734s * 3) + this.f62733r;
        if (this.f62728m > j11) {
            float fMsToUs = io.odeeo.internal.q0.g0.msToUs(this.f62718c);
            this.f62728m = io.odeeo.internal.w0.e.max(j11, this.f62725j, this.f62728m - (((long) ((this.f62731p - 1.0f) * fMsToUs)) + ((long) ((this.f62729n - 1.0f) * fMsToUs))));
            return;
        }
        long jConstrainValue = io.odeeo.internal.q0.g0.constrainValue(j10 - ((long) (Math.max(0.0f, this.f62731p - 1.0f) / this.f62719d)), this.f62728m, j11);
        this.f62728m = jConstrainValue;
        long j12 = this.f62727l;
        if (j12 == C.TIME_UNSET || jConstrainValue <= j12) {
            return;
        }
        this.f62728m = j12;
    }
}
