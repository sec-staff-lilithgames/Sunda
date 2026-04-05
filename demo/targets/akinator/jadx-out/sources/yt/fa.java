package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class fa extends t9 {

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f95483f;

    /* renamed from: g, reason: collision with root package name */
    public final long f95484g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeUnit f95485h;

    /* renamed from: i, reason: collision with root package name */
    public final int f95486i;

    public fa(int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f95483f = m0Var;
        this.f95486i = i10;
        this.f95484g = j10;
        this.f95485h = timeUnit;
    }

    @Override // yt.t9
    public final Object a(Object obj) {
        mt.m0 m0Var = this.f95483f;
        TimeUnit timeUnit = this.f95485h;
        return new ou.k(obj, m0Var.now(timeUnit), timeUnit);
    }

    @Override // yt.t9
    public final z9 b() {
        z9 z9Var;
        long jNow = this.f95483f.now(this.f95485h) - this.f95484g;
        z9 z9Var2 = (z9) get();
        Object obj = z9Var2.get();
        while (true) {
            z9 z9Var3 = (z9) obj;
            z9Var = z9Var2;
            z9Var2 = z9Var3;
            if (z9Var2 == null) {
                break;
            }
            ou.k kVar = (ou.k) z9Var2.f96651b;
            if (iu.u.isComplete(kVar.value()) || iu.u.isError(kVar.value()) || kVar.time() > jNow) {
                break;
            }
            obj = z9Var2.get();
        }
        return z9Var;
    }

    @Override // yt.t9
    public final Object c(Object obj) {
        return ((ou.k) obj).value();
    }

    @Override // yt.t9
    public final void d() {
        z9 z9Var;
        long jNow = this.f95483f.now(this.f95485h) - this.f95484g;
        z9 z9Var2 = (z9) get();
        z9 z9Var3 = (z9) z9Var2.get();
        int i10 = 0;
        while (true) {
            z9 z9Var4 = z9Var3;
            z9Var = z9Var2;
            z9Var2 = z9Var4;
            if (z9Var2 == null) {
                break;
            }
            int i11 = this.f96366c;
            if (i11 > this.f95486i && i11 > 1) {
                i10++;
                this.f96366c = i11 - 1;
                z9Var3 = (z9) z9Var2.get();
            } else {
                if (((ou.k) z9Var2.f96651b).time() > jNow) {
                    break;
                }
                i10++;
                this.f96366c--;
                z9Var3 = (z9) z9Var2.get();
            }
        }
        if (i10 != 0) {
            set(z9Var);
        }
    }

    @Override // yt.t9
    public final void e() {
        z9 z9Var;
        long jNow = this.f95483f.now(this.f95485h) - this.f95484g;
        z9 z9Var2 = (z9) get();
        z9 z9Var3 = (z9) z9Var2.get();
        int i10 = 0;
        while (true) {
            z9 z9Var4 = z9Var3;
            z9Var = z9Var2;
            z9Var2 = z9Var4;
            if (z9Var2 == null || this.f96366c <= 1 || ((ou.k) z9Var2.f96651b).time() > jNow) {
                break;
            }
            i10++;
            this.f96366c--;
            z9Var3 = (z9) z9Var2.get();
        }
        if (i10 != 0) {
            set(z9Var);
        }
    }
}
