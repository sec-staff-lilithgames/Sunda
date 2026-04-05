package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ac implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95158b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f95159c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f95160e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f95161f;

    public ac(tw.c cVar, st.q qVar) {
        this.f95158b = cVar;
        this.f95159c = qVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f95160e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f95158b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        this.f95158b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        boolean z10 = this.f95161f;
        tw.c cVar = this.f95158b;
        if (z10) {
            cVar.onNext(obj);
            return;
        }
        try {
            if (this.f95159c.test(obj)) {
                this.f95160e.request(1L);
            } else {
                this.f95161f = true;
                cVar.onNext(obj);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95160e.cancel();
            cVar.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95160e, dVar)) {
            this.f95160e = dVar;
            this.f95158b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f95160e.request(j10);
    }
}
