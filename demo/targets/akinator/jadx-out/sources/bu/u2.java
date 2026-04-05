package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u2 extends wt.b implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11068b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f11069c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f11070e;

    /* renamed from: f, reason: collision with root package name */
    public vt.j f11071f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11072g;

    public u2(mt.i0 i0Var, st.a aVar) {
        this.f11068b = i0Var;
        this.f11069c = aVar;
    }

    public final void a() {
        if (compareAndSet(0, 1)) {
            try {
                this.f11069c.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public void clear() {
        this.f11071f.clear();
    }

    @Override // wt.b, vt.j, pt.c
    public void dispose() {
        this.f11070e.dispose();
        a();
    }

    @Override // wt.b, vt.j, pt.c
    public boolean isDisposed() {
        return this.f11070e.isDisposed();
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return this.f11071f.isEmpty();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11068b.onComplete();
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11068b.onError(th2);
        a();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11068b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11070e, cVar)) {
            this.f11070e = cVar;
            if (cVar instanceof vt.j) {
                this.f11071f = (vt.j) cVar;
            }
            this.f11068b.onSubscribe(this);
        }
    }

    @Override // wt.b, vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll = this.f11071f.poll();
        if (objPoll == null && this.f11072g) {
            a();
        }
        return objPoll;
    }

    @Override // wt.b, vt.j, vt.k
    public int requestFusion(int i10) {
        vt.j jVar = this.f11071f;
        if (jVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = jVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f11072g = iRequestFusion == 1;
        }
        return iRequestFusion;
    }
}
