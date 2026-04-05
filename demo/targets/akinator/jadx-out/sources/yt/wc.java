package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class wc implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96513b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f96514c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96515e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96516f;

    public wc(tw.c cVar, st.q qVar) {
        this.f96513b = cVar;
        this.f96514c = qVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f96515e.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96516f) {
            return;
        }
        this.f96516f = true;
        this.f96513b.onComplete();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96516f) {
            mu.a.onError(th2);
        } else {
            this.f96516f = true;
            this.f96513b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96516f) {
            return;
        }
        tw.c cVar = this.f96513b;
        cVar.onNext(obj);
        try {
            if (this.f96514c.test(obj)) {
                this.f96516f = true;
                this.f96515e.cancel();
                cVar.onComplete();
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f96515e.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96515e, dVar)) {
            this.f96515e = dVar;
            this.f96513b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f96515e.request(j10);
    }
}
