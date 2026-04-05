package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f96385b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f96386c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f96387e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f96388f;

    public u(mt.q0 q0Var, st.q qVar) {
        this.f96385b = q0Var;
        this.f96386c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f96387e.cancel();
        this.f96387e = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96387e == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96388f) {
            return;
        }
        this.f96388f = true;
        this.f96387e = hu.g.f59176b;
        this.f96385b.onSuccess(Boolean.FALSE);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96388f) {
            mu.a.onError(th2);
            return;
        }
        this.f96388f = true;
        this.f96387e = hu.g.f59176b;
        this.f96385b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        hu.g gVar = hu.g.f59176b;
        if (this.f96388f) {
            return;
        }
        try {
            if (this.f96386c.test(obj)) {
                this.f96388f = true;
                this.f96387e.cancel();
                this.f96387e = gVar;
                this.f96385b.onSuccess(Boolean.TRUE);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f96387e.cancel();
            this.f96387e = gVar;
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96387e, dVar)) {
            this.f96387e = dVar;
            this.f96385b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
