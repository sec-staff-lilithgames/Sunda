package au;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f8018b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8019c;

    /* renamed from: e, reason: collision with root package name */
    public final iu.k f8020e;

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f8021f = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final b0 f8022g = new b0(this);

    /* renamed from: h, reason: collision with root package name */
    public final int f8023h;

    /* renamed from: i, reason: collision with root package name */
    public vt.o f8024i;

    /* renamed from: j, reason: collision with root package name */
    public pt.c f8025j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f8026k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f8027l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f8028m;

    public c0(mt.f fVar, st.o oVar, iu.k kVar, int i10) {
        this.f8018b = fVar;
        this.f8019c = oVar;
        this.f8020e = kVar;
        this.f8023h = i10;
    }

    public final void a() {
        mt.i iVar;
        boolean z10;
        if (getAndIncrement() != 0) {
            return;
        }
        iu.d dVar = this.f8021f;
        iu.k kVar = this.f8020e;
        while (!this.f8028m) {
            if (!this.f8026k) {
                if (kVar == iu.k.f68412c && dVar.get() != null) {
                    this.f8028m = true;
                    this.f8024i.clear();
                    this.f8018b.onError(dVar.terminate());
                    return;
                }
                boolean z11 = this.f8027l;
                try {
                    Object objPoll = this.f8024i.poll();
                    if (objPoll != null) {
                        iVar = (mt.i) ut.o0.requireNonNull(this.f8019c.apply(objPoll), "The mapper returned a null CompletableSource");
                        z10 = false;
                    } else {
                        iVar = null;
                        z10 = true;
                    }
                    if (z11 && z10) {
                        this.f8028m = true;
                        Throwable thTerminate = dVar.terminate();
                        if (thTerminate != null) {
                            this.f8018b.onError(thTerminate);
                            return;
                        } else {
                            this.f8018b.onComplete();
                            return;
                        }
                    }
                    if (!z10) {
                        this.f8026k = true;
                        iVar.subscribe(this.f8022g);
                    }
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    this.f8028m = true;
                    this.f8024i.clear();
                    this.f8025j.dispose();
                    dVar.addThrowable(th2);
                    this.f8018b.onError(dVar.terminate());
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.f8024i.clear();
    }

    @Override // pt.c
    public void dispose() {
        this.f8028m = true;
        this.f8025j.dispose();
        b0 b0Var = this.f8022g;
        b0Var.getClass();
        tt.d.dispose(b0Var);
        if (getAndIncrement() == 0) {
            this.f8024i.clear();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f8028m;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f8027l = true;
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!this.f8021f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (this.f8020e != iu.k.f68411b) {
            this.f8027l = true;
            a();
            return;
        }
        this.f8028m = true;
        b0 b0Var = this.f8022g;
        b0Var.getClass();
        tt.d.dispose(b0Var);
        Throwable thTerminate = this.f8021f.terminate();
        if (thTerminate != iu.m.f68415a) {
            this.f8018b.onError(thTerminate);
        }
        if (getAndIncrement() == 0) {
            this.f8024i.clear();
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (obj != null) {
            this.f8024i.offer(obj);
        }
        a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f8025j, cVar)) {
            this.f8025j = cVar;
            if (cVar instanceof vt.j) {
                vt.j jVar = (vt.j) cVar;
                int iRequestFusion = jVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f8024i = jVar;
                    this.f8027l = true;
                    this.f8018b.onSubscribe(this);
                    a();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f8024i = jVar;
                    this.f8018b.onSubscribe(this);
                    return;
                }
            }
            this.f8024i = new eu.d(this.f8023h);
            this.f8018b.onSubscribe(this);
        }
    }
}
