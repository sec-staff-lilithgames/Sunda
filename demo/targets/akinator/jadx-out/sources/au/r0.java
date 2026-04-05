package au;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r0 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: k, reason: collision with root package name */
    public static final q0 f8177k = new q0(null);

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f8178b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8179c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8180e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f8181f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f8182g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    public pt.c f8183h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f8184i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f8185j;

    public r0(mt.i0 i0Var, st.o oVar, boolean z10) {
        this.f8178b = i0Var;
        this.f8179c = oVar;
        this.f8180e = z10;
    }

    public final void a() {
        AtomicReference atomicReference = this.f8182g;
        q0 q0Var = f8177k;
        q0 q0Var2 = (q0) atomicReference.getAndSet(q0Var);
        if (q0Var2 == null || q0Var2 == q0Var) {
            return;
        }
        tt.d.dispose(q0Var2);
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        mt.i0 i0Var = this.f8178b;
        iu.d dVar = this.f8181f;
        AtomicReference atomicReference = this.f8182g;
        int iAddAndGet = 1;
        while (!this.f8185j) {
            if (dVar.get() != null && !this.f8180e) {
                i0Var.onError(dVar.terminate());
                return;
            }
            boolean z10 = this.f8184i;
            q0 q0Var = (q0) atomicReference.get();
            boolean z11 = q0Var == null;
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
            if (z11 || q0Var.f8165c == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(q0Var, null) && atomicReference.get() == q0Var) {
                }
                i0Var.onNext(q0Var.f8165c);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f8185j = true;
        this.f8183h.dispose();
        a();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f8185j;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f8184i = true;
        b();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!this.f8181f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!this.f8180e) {
            a();
        }
        this.f8184i = true;
        b();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        q0 q0Var = f8177k;
        AtomicReference atomicReference = this.f8182g;
        q0 q0Var2 = (q0) atomicReference.get();
        if (q0Var2 != null) {
            tt.d.dispose(q0Var2);
        }
        try {
            mt.t0 t0Var = (mt.t0) ut.o0.requireNonNull(this.f8179c.apply(obj), "The mapper returned a null SingleSource");
            q0 q0Var3 = new q0(this);
            while (true) {
                q0 q0Var4 = (q0) atomicReference.get();
                if (q0Var4 == q0Var) {
                    return;
                }
                while (!atomicReference.compareAndSet(q0Var4, q0Var3)) {
                    if (atomicReference.get() != q0Var4) {
                        break;
                    }
                }
                t0Var.subscribe(q0Var3);
                return;
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f8183h.dispose();
            atomicReference.getAndSet(q0Var);
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f8183h, cVar)) {
            this.f8183h = cVar;
            this.f8178b.onSubscribe(this);
        }
    }
}
