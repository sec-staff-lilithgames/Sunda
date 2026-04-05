package gu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b implements mt.q, vt.l {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f58417b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f58418c;

    /* renamed from: e, reason: collision with root package name */
    public vt.l f58419e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58420f;

    /* renamed from: g, reason: collision with root package name */
    public int f58421g;

    public b(tw.c cVar) {
        this.f58417b = cVar;
    }

    public final void a(Throwable th2) {
        qt.d.throwIfFatal(th2);
        this.f58418c.cancel();
        onError(th2);
    }

    public final int b(int i10) {
        vt.l lVar = this.f58419e;
        if (lVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = lVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f58421g = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // vt.l, tw.d
    public void cancel() {
        this.f58418c.cancel();
    }

    @Override // vt.l, vt.k, vt.o
    public void clear() {
        this.f58419e.clear();
    }

    @Override // vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return this.f58419e.isEmpty();
    }

    @Override // vt.l, vt.k, vt.o
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f58420f) {
            return;
        }
        this.f58420f = true;
        this.f58417b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f58420f) {
            mu.a.onError(th2);
        } else {
            this.f58420f = true;
            this.f58417b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // mt.q, tw.c
    public final void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f58418c, dVar)) {
            this.f58418c = dVar;
            if (dVar instanceof vt.l) {
                this.f58419e = (vt.l) dVar;
            }
            this.f58417b.onSubscribe(this);
        }
    }

    @Override // vt.l, vt.k, vt.o
    public abstract /* synthetic */ Object poll() throws Exception;

    @Override // vt.l, tw.d
    public void request(long j10) {
        this.f58418c.request(j10);
    }

    @Override // vt.l, vt.k
    public abstract /* synthetic */ int requestFusion(int i10);

    @Override // vt.l, vt.k, vt.o
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
