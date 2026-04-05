package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t7 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final ju.a f11039b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11040c;

    /* renamed from: e, reason: collision with root package name */
    public final long f11041e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f11042f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f11043g;

    /* renamed from: h, reason: collision with root package name */
    public r7 f11044h;

    public t7(ju.a aVar) {
        this(aVar, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public final void d(r7 r7Var) {
        synchronized (this) {
            try {
                if (this.f11039b instanceof e7) {
                    r7 r7Var2 = this.f11044h;
                    if (r7Var2 != null && r7Var2 == r7Var) {
                        this.f11044h = null;
                        tt.h hVar = r7Var.f10910c;
                        if (hVar != null) {
                            hVar.dispose();
                            r7Var.f10910c = null;
                        }
                    }
                    long j10 = r7Var.f10911e - 1;
                    r7Var.f10911e = j10;
                    if (j10 == 0) {
                        mt.g0 g0Var = this.f11039b;
                        if (g0Var instanceof pt.c) {
                            ((pt.c) g0Var).dispose();
                        } else if (g0Var instanceof tt.g) {
                            ((tt.g) g0Var).resetIf((pt.c) r7Var.get());
                        }
                    }
                } else {
                    r7 r7Var3 = this.f11044h;
                    if (r7Var3 != null && r7Var3 == r7Var) {
                        tt.h hVar2 = r7Var.f10910c;
                        if (hVar2 != null) {
                            hVar2.dispose();
                            r7Var.f10910c = null;
                        }
                        long j11 = r7Var.f10911e - 1;
                        r7Var.f10911e = j11;
                        if (j11 == 0) {
                            this.f11044h = null;
                            mt.g0 g0Var2 = this.f11039b;
                            if (g0Var2 instanceof pt.c) {
                                ((pt.c) g0Var2).dispose();
                            } else if (g0Var2 instanceof tt.g) {
                                ((tt.g) g0Var2).resetIf((pt.c) r7Var.get());
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(r7 r7Var) {
        synchronized (this) {
            try {
                if (r7Var.f10911e == 0 && r7Var == this.f11044h) {
                    this.f11044h = null;
                    pt.c cVar = (pt.c) r7Var.get();
                    tt.d.dispose(r7Var);
                    mt.g0 g0Var = this.f11039b;
                    if (g0Var instanceof pt.c) {
                        ((pt.c) g0Var).dispose();
                    } else if (g0Var instanceof tt.g) {
                        if (cVar == null) {
                            r7Var.f10913g = true;
                        } else {
                            ((tt.g) g0Var).resetIf(cVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        r7 r7Var;
        boolean z10;
        tt.h hVar;
        synchronized (this) {
            try {
                r7Var = this.f11044h;
                if (r7Var == null) {
                    r7Var = new r7(this);
                    this.f11044h = r7Var;
                }
                long j10 = r7Var.f10911e;
                if (j10 == 0 && (hVar = r7Var.f10910c) != null) {
                    hVar.dispose();
                }
                long j11 = j10 + 1;
                r7Var.f10911e = j11;
                if (r7Var.f10912f || j11 != this.f11040c) {
                    z10 = false;
                } else {
                    z10 = true;
                    r7Var.f10912f = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11039b.subscribe(new s7(i0Var, this, r7Var));
        if (z10) {
            this.f11039b.connect(r7Var);
        }
    }

    public t7(ju.a aVar, int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f11039b = aVar;
        this.f11040c = i10;
        this.f11041e = j10;
        this.f11042f = timeUnit;
        this.f11043g = m0Var;
    }
}
