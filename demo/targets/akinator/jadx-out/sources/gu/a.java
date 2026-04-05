package gu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a implements vt.a, vt.l {

    /* renamed from: b, reason: collision with root package name */
    public final vt.a f58412b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f58413c;

    /* renamed from: e, reason: collision with root package name */
    public vt.l f58414e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58415f;

    /* renamed from: g, reason: collision with root package name */
    public int f58416g;

    public a(vt.a aVar) {
        this.f58412b = aVar;
    }

    public final void a(Throwable th2) {
        qt.d.throwIfFatal(th2);
        this.f58413c.cancel();
        onError(th2);
    }

    public final int b(int i10) {
        vt.l lVar = this.f58414e;
        if (lVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = lVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f58416g = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // vt.l, tw.d
    public void cancel() {
        this.f58413c.cancel();
    }

    @Override // vt.l, vt.k, vt.o
    public void clear() {
        this.f58414e.clear();
    }

    @Override // vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return this.f58414e.isEmpty();
    }

    @Override // vt.l, vt.k, vt.o
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f58415f) {
            return;
        }
        this.f58415f = true;
        this.f58412b.onComplete();
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f58415f) {
            mu.a.onError(th2);
        } else {
            this.f58415f = true;
            this.f58412b.onError(th2);
        }
    }

    @Override // vt.a, mt.q, tw.c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // vt.a, mt.q, tw.c
    public final void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f58413c, dVar)) {
            this.f58413c = dVar;
            if (dVar instanceof vt.l) {
                this.f58414e = (vt.l) dVar;
            }
            this.f58412b.onSubscribe(this);
        }
    }

    @Override // vt.l, vt.k, vt.o
    public abstract /* synthetic */ Object poll() throws Exception;

    @Override // vt.l, tw.d
    public void request(long j10) {
        this.f58413c.request(j10);
    }

    @Override // vt.l, vt.k
    public abstract /* synthetic */ int requestFusion(int i10);

    @Override // vt.a
    public abstract /* synthetic */ boolean tryOnNext(Object obj);

    @Override // vt.l, vt.k, vt.o
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
