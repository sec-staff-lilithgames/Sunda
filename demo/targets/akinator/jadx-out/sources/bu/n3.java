package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n3 extends wt.b implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10679b;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f10681e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10682f;

    /* renamed from: h, reason: collision with root package name */
    public pt.c f10684h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10685i;

    /* renamed from: c, reason: collision with root package name */
    public final iu.d f10680c = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final pt.b f10683g = new pt.b();

    public n3(mt.i0 i0Var, st.o oVar, boolean z10) {
        this.f10679b = i0Var;
        this.f10681e = oVar;
        this.f10682f = z10;
        lazySet(1);
    }

    @Override // wt.b, vt.j, pt.c
    public void dispose() {
        this.f10685i = true;
        this.f10684h.dispose();
        this.f10683g.dispose();
    }

    @Override // wt.b, vt.j, pt.c
    public boolean isDisposed() {
        return this.f10684h.isDisposed();
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return true;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (decrementAndGet() == 0) {
            Throwable thTerminate = this.f10680c.terminate();
            mt.i0 i0Var = this.f10679b;
            if (thTerminate != null) {
                i0Var.onError(thTerminate);
            } else {
                i0Var.onComplete();
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        iu.d dVar = this.f10680c;
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        boolean z10 = this.f10682f;
        mt.i0 i0Var = this.f10679b;
        if (z10) {
            if (decrementAndGet() == 0) {
                i0Var.onError(dVar.terminate());
            }
        } else {
            dispose();
            if (getAndSet(0) > 0) {
                i0Var.onError(dVar.terminate());
            }
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        try {
            mt.i iVar = (mt.i) ut.o0.requireNonNull(this.f10681e.apply(obj), "The mapper returned a null CompletableSource");
            getAndIncrement();
            m3 m3Var = new m3(this);
            if (this.f10685i || !this.f10683g.add(m3Var)) {
                return;
            }
            iVar.subscribe(m3Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10684h.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10684h, cVar)) {
            this.f10684h = cVar;
            this.f10679b.onSubscribe(this);
        }
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        return null;
    }

    @Override // wt.b, vt.j, vt.k
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public void clear() {
    }
}
