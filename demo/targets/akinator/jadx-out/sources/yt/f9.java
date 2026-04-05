package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f9 implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f95479b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f95480c;

    /* renamed from: e, reason: collision with root package name */
    public Object f95481e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f95482f;

    public f9(mt.q0 q0Var, st.c cVar, Object obj) {
        this.f95479b = q0Var;
        this.f95481e = obj;
        this.f95480c = cVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f95482f.cancel();
        this.f95482f = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f95482f == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        Object obj = this.f95481e;
        if (obj != null) {
            this.f95481e = null;
            this.f95482f = hu.g.f59176b;
            this.f95479b.onSuccess(obj);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95481e == null) {
            mu.a.onError(th2);
            return;
        }
        this.f95481e = null;
        this.f95482f = hu.g.f59176b;
        this.f95479b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        Object obj2 = this.f95481e;
        if (obj2 != null) {
            try {
                this.f95481e = ut.o0.requireNonNull(this.f95480c.apply(obj2, obj), "The reducer returned a null value");
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                this.f95482f.cancel();
                onError(th2);
            }
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95482f, dVar)) {
            this.f95482f = dVar;
            this.f95479b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
