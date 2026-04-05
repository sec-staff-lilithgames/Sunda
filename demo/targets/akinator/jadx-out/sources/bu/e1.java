package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e1 extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final ku.m f10236b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10237c;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f10238e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10239f;

    /* renamed from: g, reason: collision with root package name */
    public vt.o f10240g;

    /* renamed from: h, reason: collision with root package name */
    public pt.c f10241h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10242i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f10243j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f10244k;

    /* renamed from: l, reason: collision with root package name */
    public int f10245l;

    public e1(ku.m mVar, st.o oVar, int i10) {
        this.f10236b = mVar;
        this.f10237c = oVar;
        this.f10239f = i10;
        this.f10238e = new d1(mVar, this);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.f10243j) {
            if (!this.f10242i) {
                boolean z10 = this.f10244k;
                try {
                    Object objPoll = this.f10240g.poll();
                    boolean z11 = objPoll == null;
                    if (z10 && z11) {
                        this.f10243j = true;
                        this.f10236b.onComplete();
                        return;
                    } else if (!z11) {
                        try {
                            mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10237c.apply(objPoll), "The mapper returned a null ObservableSource");
                            this.f10242i = true;
                            g0Var.subscribe(this.f10238e);
                        } catch (Throwable th2) {
                            qt.d.throwIfFatal(th2);
                            dispose();
                            this.f10240g.clear();
                            this.f10236b.onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    dispose();
                    this.f10240g.clear();
                    this.f10236b.onError(th3);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.f10240g.clear();
    }

    @Override // pt.c
    public void dispose() {
        this.f10243j = true;
        d1 d1Var = this.f10238e;
        d1Var.getClass();
        tt.d.dispose(d1Var);
        this.f10241h.dispose();
        if (getAndIncrement() == 0) {
            this.f10240g.clear();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10243j;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10244k) {
            return;
        }
        this.f10244k = true;
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10244k) {
            mu.a.onError(th2);
            return;
        }
        this.f10244k = true;
        dispose();
        this.f10236b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10244k) {
            return;
        }
        if (this.f10245l == 0) {
            this.f10240g.offer(obj);
        }
        a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10241h, cVar)) {
            this.f10241h = cVar;
            if (cVar instanceof vt.j) {
                vt.j jVar = (vt.j) cVar;
                int iRequestFusion = jVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f10245l = iRequestFusion;
                    this.f10240g = jVar;
                    this.f10244k = true;
                    this.f10236b.onSubscribe(this);
                    a();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f10245l = iRequestFusion;
                    this.f10240g = jVar;
                    this.f10236b.onSubscribe(this);
                    return;
                }
            }
            this.f10240g = new eu.d(this.f10239f);
            this.f10236b.onSubscribe(this);
        }
    }
}
