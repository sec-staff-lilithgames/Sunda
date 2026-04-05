package au;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o0 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: k, reason: collision with root package name */
    public static final n0 f8147k = new n0(null);

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f8148b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8149c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8150e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f8151f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f8152g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    public pt.c f8153h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f8154i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f8155j;

    public o0(mt.i0 i0Var, st.o oVar, boolean z10) {
        this.f8148b = i0Var;
        this.f8149c = oVar;
        this.f8150e = z10;
    }

    public final void a() {
        AtomicReference atomicReference = this.f8152g;
        n0 n0Var = f8147k;
        n0 n0Var2 = (n0) atomicReference.getAndSet(n0Var);
        if (n0Var2 == null || n0Var2 == n0Var) {
            return;
        }
        tt.d.dispose(n0Var2);
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        mt.i0 i0Var = this.f8148b;
        iu.d dVar = this.f8151f;
        AtomicReference atomicReference = this.f8152g;
        int iAddAndGet = 1;
        while (!this.f8155j) {
            if (dVar.get() != null && !this.f8150e) {
                i0Var.onError(dVar.terminate());
                return;
            }
            boolean z10 = this.f8154i;
            n0 n0Var = (n0) atomicReference.get();
            boolean z11 = n0Var == null;
            if (z10 && z11) {
                Throwable thTerminate = dVar.terminate();
                if (thTerminate != null) {
                    i0Var.onError(thTerminate);
                    return;
                } else {
                    i0Var.onComplete();
                    return;
                }
            }
            if (z11 || n0Var.f8138c == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(n0Var, null) && atomicReference.get() == n0Var) {
                }
                i0Var.onNext(n0Var.f8138c);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f8155j = true;
        this.f8153h.dispose();
        a();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f8155j;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f8154i = true;
        b();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!this.f8151f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!this.f8150e) {
            a();
        }
        this.f8154i = true;
        b();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        n0 n0Var = f8147k;
        AtomicReference atomicReference = this.f8152g;
        n0 n0Var2 = (n0) atomicReference.get();
        if (n0Var2 != null) {
            tt.d.dispose(n0Var2);
        }
        try {
            mt.y yVar = (mt.y) ut.o0.requireNonNull(this.f8149c.apply(obj), "The mapper returned a null MaybeSource");
            n0 n0Var3 = new n0(this);
            while (true) {
                n0 n0Var4 = (n0) atomicReference.get();
                if (n0Var4 == n0Var) {
                    return;
                }
                while (!atomicReference.compareAndSet(n0Var4, n0Var3)) {
                    if (atomicReference.get() != n0Var4) {
                        break;
                    }
                }
                yVar.subscribe(n0Var3);
                return;
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f8153h.dispose();
            atomicReference.getAndSet(n0Var);
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f8153h, cVar)) {
            this.f8153h = cVar;
            this.f8148b.onSubscribe(this);
        }
    }
}
