package yt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k9 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final rt.a f95814c;

    /* renamed from: e, reason: collision with root package name */
    public final int f95815e;

    /* renamed from: f, reason: collision with root package name */
    public final long f95816f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeUnit f95817g;

    /* renamed from: h, reason: collision with root package name */
    public final mt.m0 f95818h;

    /* renamed from: i, reason: collision with root package name */
    public i9 f95819i;

    public k9(rt.a aVar) {
        this(aVar, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public final void e(i9 i9Var) {
        synchronized (this) {
            try {
                if (this.f95814c instanceof q8) {
                    i9 i9Var2 = this.f95819i;
                    if (i9Var2 != null && i9Var2 == i9Var) {
                        this.f95819i = null;
                        tt.h hVar = i9Var.f95679c;
                        if (hVar != null) {
                            hVar.dispose();
                            i9Var.f95679c = null;
                        }
                    }
                    long j10 = i9Var.f95680e - 1;
                    i9Var.f95680e = j10;
                    if (j10 == 0) {
                        tw.b bVar = this.f95814c;
                        if (bVar instanceof pt.c) {
                            ((pt.c) bVar).dispose();
                        } else if (bVar instanceof tt.g) {
                            ((tt.g) bVar).resetIf((pt.c) i9Var.get());
                        }
                    }
                } else {
                    i9 i9Var3 = this.f95819i;
                    if (i9Var3 != null && i9Var3 == i9Var) {
                        tt.h hVar2 = i9Var.f95679c;
                        if (hVar2 != null) {
                            hVar2.dispose();
                            i9Var.f95679c = null;
                        }
                        long j11 = i9Var.f95680e - 1;
                        i9Var.f95680e = j11;
                        if (j11 == 0) {
                            this.f95819i = null;
                            tw.b bVar2 = this.f95814c;
                            if (bVar2 instanceof pt.c) {
                                ((pt.c) bVar2).dispose();
                            } else if (bVar2 instanceof tt.g) {
                                ((tt.g) bVar2).resetIf((pt.c) i9Var.get());
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(i9 i9Var) {
        synchronized (this) {
            try {
                if (i9Var.f95680e == 0 && i9Var == this.f95819i) {
                    this.f95819i = null;
                    pt.c cVar = (pt.c) i9Var.get();
                    tt.d.dispose(i9Var);
                    tw.b bVar = this.f95814c;
                    if (bVar instanceof pt.c) {
                        ((pt.c) bVar).dispose();
                    } else if (bVar instanceof tt.g) {
                        if (cVar == null) {
                            i9Var.f95682g = true;
                        } else {
                            ((tt.g) bVar).resetIf(cVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        i9 i9Var;
        boolean z10;
        tt.h hVar;
        synchronized (this) {
            try {
                i9Var = this.f95819i;
                if (i9Var == null) {
                    i9Var = new i9(this);
                    this.f95819i = i9Var;
                }
                long j10 = i9Var.f95680e;
                if (j10 == 0 && (hVar = i9Var.f95679c) != null) {
                    hVar.dispose();
                }
                long j11 = j10 + 1;
                i9Var.f95680e = j11;
                if (i9Var.f95681f || j11 != this.f95815e) {
                    z10 = false;
                } else {
                    z10 = true;
                    i9Var.f95681f = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f95814c.subscribe((mt.q) new j9(cVar, this, i9Var));
        if (z10) {
            this.f95814c.connect(i9Var);
        }
    }

    public k9(rt.a aVar, int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f95814c = aVar;
        this.f95815e = i10;
        this.f95816f = j10;
        this.f95817g = timeUnit;
        this.f95818h = m0Var;
    }
}
