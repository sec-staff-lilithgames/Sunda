package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h3 extends hu.a implements vt.a {

    /* renamed from: b, reason: collision with root package name */
    public final vt.a f95577b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f95578c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f95579e;

    /* renamed from: f, reason: collision with root package name */
    public vt.l f95580f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95581g;

    public h3(vt.a aVar, st.a aVar2) {
        this.f95577b = aVar;
        this.f95578c = aVar2;
    }

    public final void a() {
        if (compareAndSet(0, 1)) {
            try {
                this.f95578c.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // hu.a, vt.l, tw.d
    public void cancel() {
        this.f95579e.cancel();
        a();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public void clear() {
        this.f95580f.clear();
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return this.f95580f.isEmpty();
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95577b.onComplete();
        a();
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95577b.onError(th2);
        a();
    }

    @Override // vt.a, mt.q, tw.c
    public void onNext(Object obj) {
        this.f95577b.onNext(obj);
    }

    @Override // vt.a, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95579e, dVar)) {
            this.f95579e = dVar;
            if (dVar instanceof vt.l) {
                this.f95580f = (vt.l) dVar;
            }
            this.f95577b.onSubscribe(this);
        }
    }

    @Override // hu.a, vt.l, vt.k, vt.o
    public Object poll() throws Exception {
        Object objPoll = this.f95580f.poll();
        if (objPoll == null && this.f95581g) {
            a();
        }
        return objPoll;
    }

    @Override // hu.a, vt.l, tw.d
    public void request(long j10) {
        this.f95579e.request(j10);
    }

    @Override // hu.a, vt.l, vt.k
    public int requestFusion(int i10) {
        vt.l lVar = this.f95580f;
        if (lVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = lVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f95581g = iRequestFusion == 1;
        }
        return iRequestFusion;
    }

    @Override // vt.a
    public boolean tryOnNext(Object obj) {
        return this.f95577b.tryOnNext(obj);
    }
}
