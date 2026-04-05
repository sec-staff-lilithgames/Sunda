package wr;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z0 implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final x0 f91210f = new x0();

    /* renamed from: g, reason: collision with root package name */
    public static final long f91211g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f91212h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f91213i;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f91214b;

    /* renamed from: c, reason: collision with root package name */
    public final long f91215c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f91216e;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f91211g = nanos;
        f91212h = -nanos;
        f91213i = TimeUnit.SECONDS.toNanos(1L);
    }

    public z0(y0 y0Var, long j10, long j11, boolean z10) {
        this.f91214b = y0Var;
        long jMin = Math.min(f91211g, Math.max(f91212h, j11));
        this.f91215c = j10 + jMin;
        this.f91216e = z10 && jMin <= 0;
    }

    public static z0 after(long j10, TimeUnit timeUnit) {
        return after(j10, timeUnit, f91210f);
    }

    public static y0 getSystemTicker() {
        return f91210f;
    }

    public final void a(z0 z0Var) {
        y0 y0Var = z0Var.f91214b;
        y0 y0Var2 = this.f91214b;
        if (y0Var2 == y0Var) {
            return;
        }
        throw new AssertionError("Tickers (" + y0Var2 + " and " + z0Var.f91214b + ") don't match. Custom Ticker should only be used in tests!");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        y0 y0Var = z0Var.f91214b;
        y0 y0Var2 = this.f91214b;
        if (y0Var2 != null ? y0Var2 == y0Var : y0Var == null) {
            return this.f91215c == z0Var.f91215c;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(this.f91214b, Long.valueOf(this.f91215c)).hashCode();
    }

    public boolean isBefore(z0 z0Var) {
        a(z0Var);
        return this.f91215c - z0Var.f91215c < 0;
    }

    public boolean isExpired() {
        if (!this.f91216e) {
            if (this.f91215c - this.f91214b.nanoTime() > 0) {
                return false;
            }
            this.f91216e = true;
        }
        return true;
    }

    public z0 minimum(z0 z0Var) {
        a(z0Var);
        return isBefore(z0Var) ? this : z0Var;
    }

    public z0 offset(long j10, TimeUnit timeUnit) {
        if (j10 == 0) {
            return this;
        }
        return new z0(this.f91214b, this.f91215c, timeUnit.toNanos(j10), isExpired());
    }

    public ScheduledFuture<?> runOnExpiration(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        if (runnable == null) {
            throw new NullPointerException("task");
        }
        if (scheduledExecutorService == null) {
            throw new NullPointerException("scheduler");
        }
        return scheduledExecutorService.schedule(runnable, this.f91215c - this.f91214b.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public long timeRemaining(TimeUnit timeUnit) {
        long jNanoTime = this.f91214b.nanoTime();
        if (!this.f91216e && this.f91215c - jNanoTime <= 0) {
            this.f91216e = true;
        }
        return timeUnit.convert(this.f91215c - jNanoTime, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long jTimeRemaining = timeRemaining(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jTimeRemaining);
        long j10 = f91213i;
        long j11 = jAbs / j10;
        long jAbs2 = Math.abs(jTimeRemaining) % j10;
        StringBuilder sb2 = new StringBuilder();
        if (jTimeRemaining < 0) {
            sb2.append('-');
        }
        sb2.append(j11);
        if (jAbs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb2.append("s from now");
        x0 x0Var = f91210f;
        y0 y0Var = this.f91214b;
        if (y0Var != x0Var) {
            sb2.append(" (ticker=" + y0Var + ")");
        }
        return sb2.toString();
    }

    public static z0 after(long j10, TimeUnit timeUnit, y0 y0Var) {
        if (timeUnit == null) {
            throw new NullPointerException("units");
        }
        return new z0(y0Var, y0Var.nanoTime(), timeUnit.toNanos(j10), true);
    }

    @Override // java.lang.Comparable
    public int compareTo(z0 z0Var) {
        a(z0Var);
        long j10 = this.f91215c - z0Var.f91215c;
        if (j10 < 0) {
            return -1;
        }
        return j10 > 0 ? 1 : 0;
    }
}
