package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v0 implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f96425b;

    /* renamed from: c, reason: collision with root package name */
    public final st.b f96426c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f96427e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f96428f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f96429g;

    public v0(mt.q0 q0Var, Object obj, st.b bVar) {
        this.f96425b = q0Var;
        this.f96426c = bVar;
        this.f96427e = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f96428f.cancel();
        this.f96428f = hu.g.f59176b;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96428f == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96429g) {
            return;
        }
        this.f96429g = true;
        this.f96428f = hu.g.f59176b;
        this.f96425b.onSuccess(this.f96427e);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96429g) {
            mu.a.onError(th2);
            return;
        }
        this.f96429g = true;
        this.f96428f = hu.g.f59176b;
        this.f96425b.onError(th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96429g) {
            return;
        }
        try {
            this.f96426c.accept(this.f96427e, obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f96428f.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96428f, dVar)) {
            this.f96428f = dVar;
            this.f96425b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
