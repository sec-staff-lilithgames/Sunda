package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class t9 extends AtomicReference implements aa {

    /* renamed from: b, reason: collision with root package name */
    public z9 f96365b;

    /* renamed from: c, reason: collision with root package name */
    public int f96366c;

    /* renamed from: e, reason: collision with root package name */
    public long f96367e;

    public t9() {
        z9 z9Var = new z9(null, 0L);
        this.f96365b = z9Var;
        set(z9Var);
    }

    public z9 b() {
        return (z9) get();
    }

    @Override // yt.aa
    public final void complete() {
        Object objA = a(iu.u.complete());
        long j10 = this.f96367e + 1;
        this.f96367e = j10;
        z9 z9Var = new z9(objA, j10);
        this.f96365b.set(z9Var);
        this.f96365b = z9Var;
        this.f96366c++;
        e();
    }

    public abstract void d();

    public void e() {
        z9 z9Var = (z9) get();
        if (z9Var.f96651b != null) {
            z9 z9Var2 = new z9(null, 0L);
            z9Var2.lazySet(z9Var.get());
            set(z9Var2);
        }
    }

    @Override // yt.aa
    public final void error(Throwable th2) {
        Object objA = a(iu.u.error(th2));
        long j10 = this.f96367e + 1;
        this.f96367e = j10;
        z9 z9Var = new z9(objA, j10);
        this.f96365b.set(z9Var);
        this.f96365b = z9Var;
        this.f96366c++;
        e();
    }

    @Override // yt.aa
    public final void next(Object obj) {
        Object objA = a(iu.u.next(obj));
        long j10 = this.f96367e + 1;
        this.f96367e = j10;
        z9 z9Var = new z9(objA, j10);
        this.f96365b.set(z9Var);
        this.f96365b = z9Var;
        this.f96366c++;
        d();
    }

    @Override // yt.aa
    public final void replay(w9 w9Var) {
        z9 z9Var;
        synchronized (w9Var) {
            try {
                if (w9Var.f96499g) {
                    w9Var.f96500h = true;
                    return;
                }
                w9Var.f96499g = true;
                while (!w9Var.isDisposed()) {
                    long j10 = w9Var.get();
                    boolean z10 = j10 == Long.MAX_VALUE;
                    z9 z9VarB = (z9) w9Var.f96497e;
                    if (z9VarB == null) {
                        z9VarB = b();
                        w9Var.f96497e = z9VarB;
                        iu.e.add(w9Var.f96498f, z9VarB.f96652c);
                    }
                    long j11 = 0;
                    while (j10 != 0 && (z9Var = (z9) z9VarB.get()) != null) {
                        Object objC = c(z9Var.f96651b);
                        try {
                            if (iu.u.accept(objC, w9Var.f96496c)) {
                                w9Var.f96497e = null;
                                return;
                            }
                            j11++;
                            j10--;
                            if (w9Var.isDisposed()) {
                                w9Var.f96497e = null;
                                return;
                            }
                            z9VarB = z9Var;
                        } catch (Throwable th2) {
                            qt.d.throwIfFatal(th2);
                            w9Var.f96497e = null;
                            w9Var.dispose();
                            if (iu.u.isError(objC) || iu.u.isComplete(objC)) {
                                return;
                            }
                            w9Var.f96496c.onError(th2);
                            return;
                        }
                    }
                    if (j11 != 0) {
                        w9Var.f96497e = z9VarB;
                        if (!z10) {
                            w9Var.produced(j11);
                        }
                    }
                    synchronized (w9Var) {
                        try {
                            if (!w9Var.f96500h) {
                                w9Var.f96499g = false;
                                return;
                            }
                            w9Var.f96500h = false;
                        } finally {
                        }
                    }
                }
                w9Var.f96497e = null;
            } finally {
            }
        }
    }

    public Object a(Object obj) {
        return obj;
    }

    public Object c(Object obj) {
        return obj;
    }
}
