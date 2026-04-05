package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e4 extends hu.a implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95412b;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95414e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95415f;

    /* renamed from: h, reason: collision with root package name */
    public final int f95417h;

    /* renamed from: i, reason: collision with root package name */
    public tw.d f95418i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f95419j;

    /* renamed from: c, reason: collision with root package name */
    public final iu.d f95413c = new iu.d();

    /* renamed from: g, reason: collision with root package name */
    public final pt.b f95416g = new pt.b();

    public e4(int i10, st.o oVar, tw.c cVar, boolean z10) {
        this.f95412b = cVar;
        this.f95414e = oVar;
        this.f95415f = z10;
        this.f95417h = i10;
        lazySet(1);
    }

    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        this.f95419j = true;
        this.f95418i.cancel();
        this.f95416g.dispose();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return true;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (decrementAndGet() != 0) {
            if (this.f95417h != Integer.MAX_VALUE) {
                this.f95418i.request(1L);
            }
        } else {
            Throwable thTerminate = this.f95413c.terminate();
            tw.c cVar = this.f95412b;
            if (thTerminate != null) {
                cVar.onError(thTerminate);
            } else {
                cVar.onComplete();
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        iu.d dVar = this.f95413c;
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        boolean z10 = this.f95415f;
        tw.c cVar = this.f95412b;
        if (!z10) {
            cancel();
            if (getAndSet(0) > 0) {
                cVar.onError(dVar.terminate());
                return;
            }
            return;
        }
        if (decrementAndGet() == 0) {
            cVar.onError(dVar.terminate());
        } else if (this.f95417h != Integer.MAX_VALUE) {
            this.f95418i.request(1L);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        try {
            mt.i iVar = (mt.i) ut.o0.requireNonNull(this.f95414e.apply(obj), "The mapper returned a null CompletableSource");
            getAndIncrement();
            d4 d4Var = new d4(this);
            if (this.f95419j || !this.f95416g.add(d4Var)) {
                return;
            }
            iVar.subscribe(d4Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95418i.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95418i, dVar)) {
            this.f95418i = dVar;
            this.f95412b.onSubscribe(this);
            int i10 = this.f95417h;
            if (i10 == Integer.MAX_VALUE) {
                dVar.request(Long.MAX_VALUE);
            } else {
                dVar.request(i10);
            }
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        return null;
    }

    @Override // hu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public void clear() {
    }

    @Override // hu.a, vt.l, tw.d
    public void request(long j10) {
    }
}
