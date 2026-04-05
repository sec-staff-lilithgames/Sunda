package yq;

import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f94791a;

    /* renamed from: b, reason: collision with root package name */
    public long f94792b;

    /* renamed from: c, reason: collision with root package name */
    public long f94793c;

    /* renamed from: d, reason: collision with root package name */
    public long f94794d;

    public void a(long j10) {
        this.f94792b = j10;
        g();
    }

    public long b() {
        return this.f94792b;
    }

    public long c() {
        return this.f94793c;
    }

    public boolean d() {
        return this.f94791a;
    }

    public boolean e() {
        return this.f94793c >= this.f94792b;
    }

    public void f() {
        this.f94791a = false;
    }

    public void g() {
        this.f94793c = 0L;
        this.f94794d = SystemClock.elapsedRealtime();
    }

    public void h() {
        this.f94791a = true;
        this.f94794d = SystemClock.elapsedRealtime();
    }

    public void i() {
        this.f94794d = SystemClock.elapsedRealtime();
    }

    public void j() {
        if (d()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f94793c = Math.min(this.f94792b, this.f94793c + (jElapsedRealtime - this.f94794d));
            this.f94794d = jElapsedRealtime;
        }
    }
}
