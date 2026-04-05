package bu;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c1 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10150b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10151c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10152e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f10153f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final b1 f10154g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10155h;

    /* renamed from: i, reason: collision with root package name */
    public vt.o f10156i;

    /* renamed from: j, reason: collision with root package name */
    public pt.c f10157j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f10158k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f10159l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f10160m;

    /* renamed from: n, reason: collision with root package name */
    public int f10161n;

    public c1(mt.i0 i0Var, st.o oVar, int i10, boolean z10) {
        this.f10150b = i0Var;
        this.f10151c = oVar;
        this.f10152e = i10;
        this.f10155h = z10;
        this.f10154g = new b1(i0Var, this);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        mt.i0 i0Var = this.f10150b;
        vt.o oVar = this.f10156i;
        iu.d dVar = this.f10153f;
        while (true) {
            if (!this.f10158k) {
                if (this.f10160m) {
                    oVar.clear();
                    return;
                }
                if (!this.f10155h && ((Throwable) dVar.get()) != null) {
                    oVar.clear();
                    this.f10160m = true;
                    i0Var.onError(dVar.terminate());
                    return;
                }
                boolean z10 = this.f10159l;
                try {
                    Object objPoll = oVar.poll();
                    boolean z11 = objPoll == null;
                    if (z10 && z11) {
                        this.f10160m = true;
                        Throwable thTerminate = dVar.terminate();
                        if (thTerminate != null) {
                            i0Var.onError(thTerminate);
                            return;
                        } else {
                            i0Var.onComplete();
                            return;
                        }
                    }
                    if (!z11) {
                        try {
                            mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10151c.apply(objPoll), "The mapper returned a null ObservableSource");
                            if (g0Var instanceof Callable) {
                                try {
                                    Object objCall = ((Callable) g0Var).call();
                                    if (objCall != null && !this.f10160m) {
                                        i0Var.onNext(objCall);
                                    }
                                } catch (Throwable th2) {
                                    qt.d.throwIfFatal(th2);
                                    dVar.addThrowable(th2);
                                }
                            } else {
                                this.f10158k = true;
                                g0Var.subscribe(this.f10154g);
                            }
                        } catch (Throwable th3) {
                            qt.d.throwIfFatal(th3);
                            this.f10160m = true;
                            this.f10157j.dispose();
                            oVar.clear();
                            dVar.addThrowable(th3);
                            i0Var.onError(dVar.terminate());
                            return;
                        }
                    }
                } catch (Throwable th4) {
                    qt.d.throwIfFatal(th4);
                    this.f10160m = true;
                    this.f10157j.dispose();
                    dVar.addThrowable(th4);
                    i0Var.onError(dVar.terminate());
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f10160m = true;
        this.f10157j.dispose();
        b1 b1Var = this.f10154g;
        b1Var.getClass();
        tt.d.dispose(b1Var);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10160m;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10159l = true;
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!this.f10153f.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            this.f10159l = true;
            a();
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10161n == 0) {
            this.f10156i.offer(obj);
        }
        a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10157j, cVar)) {
            this.f10157j = cVar;
            if (cVar instanceof vt.j) {
                vt.j jVar = (vt.j) cVar;
                int iRequestFusion = jVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f10161n = iRequestFusion;
                    this.f10156i = jVar;
                    this.f10159l = true;
                    this.f10150b.onSubscribe(this);
                    a();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f10161n = iRequestFusion;
                    this.f10156i = jVar;
                    this.f10150b.onSubscribe(this);
                    return;
                }
            }
            this.f10156i = new eu.d(this.f10152e);
            this.f10150b.onSubscribe(this);
        }
    }
}
