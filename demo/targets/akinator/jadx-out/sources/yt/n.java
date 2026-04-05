package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f95969b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f95970c;

    /* renamed from: e, reason: collision with root package name */
    public tw.d f95971e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f95972f;

    public n(mt.q0 q0Var, st.q qVar) {
        this.f95969b = q0Var;
        this.f95970c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f95971e.cancel();
        this.f95971e = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f95971e == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95972f) {
            return;
        }
        this.f95972f = true;
        this.f95971e = hu.g.f59176b;
        this.f95969b.onSuccess(Boolean.TRUE);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95972f) {
            mu.a.onError(th2);
            return;
        }
        this.f95972f = true;
        this.f95971e = hu.g.f59176b;
        this.f95969b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        hu.g gVar = hu.g.f59176b;
        if (this.f95972f) {
            return;
        }
        try {
            if (this.f95970c.test(obj)) {
                return;
            }
            this.f95972f = true;
            this.f95971e.cancel();
            this.f95971e = gVar;
            this.f95969b.onSuccess(Boolean.FALSE);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95971e.cancel();
            this.f95971e = gVar;
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95971e, dVar)) {
            this.f95971e = dVar;
            this.f95969b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
