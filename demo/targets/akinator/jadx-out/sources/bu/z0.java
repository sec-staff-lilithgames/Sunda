package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z0 extends AtomicInteger implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11275b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f11276c;

    /* renamed from: e, reason: collision with root package name */
    public final y0[] f11277e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f11278f;

    /* renamed from: g, reason: collision with root package name */
    public final eu.d f11279g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11280h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f11281i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f11282j;

    /* renamed from: k, reason: collision with root package name */
    public final iu.d f11283k = new iu.d();

    /* renamed from: l, reason: collision with root package name */
    public int f11284l;

    /* renamed from: m, reason: collision with root package name */
    public int f11285m;

    public z0(int i10, int i11, mt.i0 i0Var, st.o oVar, boolean z10) {
        this.f11275b = i0Var;
        this.f11276c = oVar;
        this.f11280h = z10;
        this.f11278f = new Object[i10];
        y0[] y0VarArr = new y0[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            y0VarArr[i12] = new y0(this, i12);
        }
        this.f11277e = y0VarArr;
        this.f11279g = new eu.d(i11);
    }

    public final void a() {
        for (y0 y0Var : this.f11277e) {
            y0Var.dispose();
        }
    }

    public final void b(eu.d dVar) {
        synchronized (this) {
            this.f11278f = null;
        }
        dVar.clear();
    }

    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        eu.d dVar = this.f11279g;
        mt.i0 i0Var = this.f11275b;
        boolean z10 = this.f11280h;
        int iAddAndGet = 1;
        while (!this.f11281i) {
            if (!z10 && this.f11283k.get() != null) {
                a();
                b(dVar);
                i0Var.onError(this.f11283k.terminate());
                return;
            }
            boolean z11 = this.f11282j;
            Object[] objArr = (Object[]) dVar.poll();
            boolean z12 = objArr == null;
            if (z11 && z12) {
                b(dVar);
                Throwable thTerminate = this.f11283k.terminate();
                if (thTerminate == null) {
                    i0Var.onComplete();
                    return;
                } else {
                    i0Var.onError(thTerminate);
                    return;
                }
            }
            if (z12) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    i0Var.onNext(ut.o0.requireNonNull(this.f11276c.apply(objArr), "The combiner returned a null value"));
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    this.f11283k.addThrowable(th2);
                    a();
                    b(dVar);
                    i0Var.onError(this.f11283k.terminate());
                    return;
                }
            }
        }
        b(dVar);
    }

    @Override // pt.c
    public void dispose() {
        if (this.f11281i) {
            return;
        }
        this.f11281i = true;
        a();
        if (getAndIncrement() == 0) {
            b(this.f11279g);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11281i;
    }

    public void subscribe(mt.g0[] g0VarArr) {
        y0[] y0VarArr = this.f11277e;
        int length = y0VarArr.length;
        this.f11275b.onSubscribe(this);
        for (int i10 = 0; i10 < length && !this.f11282j && !this.f11281i; i10++) {
            g0VarArr[i10].subscribe(y0VarArr[i10]);
        }
    }
}
