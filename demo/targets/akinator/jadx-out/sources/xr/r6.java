package xr;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r6 {

    /* renamed from: h, reason: collision with root package name */
    public static final long f92952h = TimeUnit.HOURS.toNanos(2);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92953a;

    /* renamed from: b, reason: collision with root package name */
    public final long f92954b;

    /* renamed from: c, reason: collision with root package name */
    public final p6 f92955c;

    /* renamed from: d, reason: collision with root package name */
    public final long f92956d;

    /* renamed from: e, reason: collision with root package name */
    public long f92957e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92958f;

    /* renamed from: g, reason: collision with root package name */
    public int f92959g;

    public r6(boolean z10, long j10, TimeUnit timeUnit) {
        mh.p1.checkArgument(j10 >= 0, "minTime must be non-negative: %s", j10);
        this.f92953a = z10;
        this.f92954b = Math.min(timeUnit.toNanos(j10), f92952h);
        p6 p6Var = p6.f92875a;
        this.f92955c = p6Var;
        long jNanoTime = p6Var.nanoTime();
        this.f92956d = jNanoTime;
        this.f92957e = jNanoTime;
    }

    public void onTransportActive() {
        this.f92958f = true;
    }

    public void onTransportIdle() {
        this.f92958f = false;
    }

    public boolean pingAcceptable() {
        long jNanoTime = this.f92955c.nanoTime();
        if (this.f92958f || this.f92953a ? (this.f92957e + this.f92954b) - jNanoTime <= 0 : (this.f92957e + f92952h) - jNanoTime <= 0) {
            this.f92957e = jNanoTime;
            return true;
        }
        int i10 = this.f92959g + 1;
        this.f92959g = i10;
        return i10 <= 2;
    }

    public void resetCounters() {
        this.f92957e = this.f92956d;
        this.f92959g = 0;
    }
}
