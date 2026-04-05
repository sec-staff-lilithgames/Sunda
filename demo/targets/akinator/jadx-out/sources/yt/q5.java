package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q5 implements mt.q, vt.l {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96188b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f96189c;

    public q5(tw.c cVar) {
        this.f96188b = cVar;
    }

    @Override // vt.l, tw.d
    public void cancel() {
        this.f96189c.cancel();
    }

    @Override // vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return true;
    }

    @Override // vt.l, vt.k, vt.o
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96188b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f96188b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96189c, dVar)) {
            this.f96189c = dVar;
            this.f96188b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // vt.l, vt.k, vt.o
    public Object poll() {
        return null;
    }

    @Override // vt.l, vt.k
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // vt.l, vt.k, vt.o
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // vt.l, vt.k, vt.o
    public void clear() {
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
    }

    @Override // vt.l, tw.d
    public void request(long j10) {
    }
}
