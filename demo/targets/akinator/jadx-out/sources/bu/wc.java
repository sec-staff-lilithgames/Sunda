package bu;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class wc extends AtomicInteger implements mt.i0, pt.c, Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final vc f11183n = new vc(null);

    /* renamed from: o, reason: collision with root package name */
    public static final Object f11184o = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11185b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11186c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f11187e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f11188f = new AtomicInteger(1);

    /* renamed from: g, reason: collision with root package name */
    public final eu.b f11189g = new eu.b();

    /* renamed from: h, reason: collision with root package name */
    public final iu.d f11190h = new iu.d();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f11191i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    public final Callable f11192j;

    /* renamed from: k, reason: collision with root package name */
    public pt.c f11193k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f11194l;

    /* renamed from: m, reason: collision with root package name */
    public pu.h f11195m;

    public wc(mt.i0 i0Var, int i10, Callable callable) {
        this.f11185b = i0Var;
        this.f11186c = i10;
        this.f11192j = callable;
    }

    public final void a() {
        AtomicReference atomicReference = this.f11187e;
        vc vcVar = f11183n;
        pt.c cVar = (pt.c) atomicReference.getAndSet(vcVar);
        if (cVar == null || cVar == vcVar) {
            return;
        }
        cVar.dispose();
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        mt.i0 i0Var = this.f11185b;
        eu.b bVar = this.f11189g;
        iu.d dVar = this.f11190h;
        int iAddAndGet = 1;
        while (this.f11188f.get() != 0) {
            pu.h hVar = this.f11195m;
            boolean z10 = this.f11194l;
            if (z10 && dVar.get() != null) {
                bVar.clear();
                Throwable thTerminate = dVar.terminate();
                if (hVar != null) {
                    this.f11195m = null;
                    hVar.onError(thTerminate);
                }
                i0Var.onError(thTerminate);
                return;
            }
            Object objPoll = bVar.poll();
            boolean z11 = objPoll == null;
            if (z10 && z11) {
                Throwable thTerminate2 = dVar.terminate();
                if (thTerminate2 == null) {
                    if (hVar != null) {
                        this.f11195m = null;
                        hVar.onComplete();
                    }
                    i0Var.onComplete();
                    return;
                }
                if (hVar != null) {
                    this.f11195m = null;
                    hVar.onError(thTerminate2);
                }
                i0Var.onError(thTerminate2);
                return;
            }
            if (z11) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (objPoll != f11184o) {
                hVar.onNext(objPoll);
            } else {
                if (hVar != null) {
                    this.f11195m = null;
                    hVar.onComplete();
                }
                if (!this.f11191i.get()) {
                    pu.h hVarCreate = pu.h.create(this.f11186c, this);
                    this.f11195m = hVarCreate;
                    this.f11188f.getAndIncrement();
                    try {
                        mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f11192j.call(), "The other Callable returned a null ObservableSource");
                        vc vcVar = new vc(this);
                        AtomicReference atomicReference = this.f11187e;
                        while (true) {
                            if (atomicReference.compareAndSet(null, vcVar)) {
                                g0Var.subscribe(vcVar);
                                i0Var.onNext(hVarCreate);
                                break;
                            } else if (atomicReference.get() != null) {
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        qt.d.throwIfFatal(th2);
                        dVar.addThrowable(th2);
                        this.f11194l = true;
                    }
                }
            }
        }
        bVar.clear();
        this.f11195m = null;
    }

    @Override // pt.c
    public void dispose() {
        if (this.f11191i.compareAndSet(false, true)) {
            a();
            if (this.f11188f.decrementAndGet() == 0) {
                this.f11193k.dispose();
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11191i.get();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        a();
        this.f11194l = true;
        b();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        a();
        if (!this.f11190h.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            this.f11194l = true;
            b();
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11189g.offer(obj);
        b();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11193k, cVar)) {
            this.f11193k = cVar;
            this.f11185b.onSubscribe(this);
            this.f11189g.offer(f11184o);
            b();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f11188f.decrementAndGet() == 0) {
            this.f11193k.dispose();
        }
    }
}
