package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i3 extends hu.a implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95645b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f95646c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f95647e;

    /* renamed from: f, reason: collision with root package name */
    public vt.l f95648f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95649g;

    public i3(tw.c cVar, st.a aVar) {
        this.f95645b = cVar;
        this.f95646c = aVar;
    }

    public final void a() {
        if (compareAndSet(0, 1)) {
            try {
                this.f95646c.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        this.f95647e.cancel();
        a();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public void clear() {
        this.f95648f.clear();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return this.f95648f.isEmpty();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95645b.onComplete();
        a();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95645b.onError(th2);
        a();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95645b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95647e, dVar)) {
            this.f95647e = dVar;
            if (dVar instanceof vt.l) {
                this.f95648f = (vt.l) dVar;
            }
            this.f95645b.onSubscribe(this);
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll = this.f95648f.poll();
        if (objPoll == null && this.f95649g) {
            a();
        }
        return objPoll;
    }

    @Override // hu.a, vt.l, tw.d
    public void request(long j10) {
        this.f95647e.request(j10);
    }

    @Override // hu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        vt.l lVar = this.f95648f;
        if (lVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = lVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f95649g = iRequestFusion == 1;
        }
        return iRequestFusion;
    }
}
