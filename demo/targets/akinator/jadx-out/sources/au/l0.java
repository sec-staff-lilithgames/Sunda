package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 implements mt.i0, pt.c {

    /* renamed from: j, reason: collision with root package name */
    public static final k0 f8121j = new k0(null);

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f8122b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8123c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8124e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f8125f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f8126g = new AtomicReference();

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f8127h;

    /* renamed from: i, reason: collision with root package name */
    public pt.c f8128i;

    public l0(mt.f fVar, st.o oVar, boolean z10) {
        this.f8122b = fVar;
        this.f8123c = oVar;
        this.f8124e = z10;
    }

    @Override // pt.c
    public void dispose() {
        this.f8128i.dispose();
        AtomicReference atomicReference = this.f8126g;
        k0 k0Var = f8121j;
        k0 k0Var2 = (k0) atomicReference.getAndSet(k0Var);
        if (k0Var2 == null || k0Var2 == k0Var) {
            return;
        }
        tt.d.dispose(k0Var2);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f8126g.get() == f8121j;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f8127h = true;
        if (this.f8126g.get() == null) {
            Throwable thTerminate = this.f8125f.terminate();
            if (thTerminate == null) {
                this.f8122b.onComplete();
            } else {
                this.f8122b.onError(thTerminate);
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        iu.d dVar = this.f8125f;
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (this.f8124e) {
            onComplete();
            return;
        }
        AtomicReference atomicReference = this.f8126g;
        k0 k0Var = f8121j;
        k0 k0Var2 = (k0) atomicReference.getAndSet(k0Var);
        if (k0Var2 != null && k0Var2 != k0Var) {
            tt.d.dispose(k0Var2);
        }
        Throwable thTerminate = dVar.terminate();
        if (thTerminate != iu.m.f68415a) {
            this.f8122b.onError(thTerminate);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        try {
            mt.i iVar = (mt.i) ut.o0.requireNonNull(this.f8123c.apply(obj), "The mapper returned a null CompletableSource");
            k0 k0Var = new k0(this);
            while (true) {
                AtomicReference atomicReference = this.f8126g;
                k0 k0Var2 = (k0) atomicReference.get();
                if (k0Var2 == f8121j) {
                    return;
                }
                while (!atomicReference.compareAndSet(k0Var2, k0Var)) {
                    if (atomicReference.get() != k0Var2) {
                        break;
                    }
                }
                if (k0Var2 != null) {
                    tt.d.dispose(k0Var2);
                }
                iVar.subscribe(k0Var);
                return;
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f8128i.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f8128i, cVar)) {
            this.f8128i = cVar;
            this.f8122b.onSubscribe(this);
        }
    }
}
