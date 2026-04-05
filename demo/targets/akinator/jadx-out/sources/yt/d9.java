package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d9 implements mt.q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f95357b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f95358c;

    /* renamed from: e, reason: collision with root package name */
    public Object f95359e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f95360f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95361g;

    public d9(mt.v vVar, st.c cVar) {
        this.f95357b = vVar;
        this.f95358c = cVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f95360f.cancel();
        this.f95361g = true;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f95361g;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95361g) {
            return;
        }
        this.f95361g = true;
        Object obj = this.f95359e;
        mt.v vVar = this.f95357b;
        if (obj != null) {
            vVar.onSuccess(obj);
        } else {
            vVar.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95361g) {
            mu.a.onError(th2);
        } else {
            this.f95361g = true;
            this.f95357b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95361g) {
            return;
        }
        Object obj2 = this.f95359e;
        if (obj2 == null) {
            this.f95359e = obj;
            return;
        }
        try {
            this.f95359e = ut.o0.requireNonNull(this.f95358c.apply(obj2, obj), "The reducer returned a null value");
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f95360f.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95360f, dVar)) {
            this.f95360f = dVar;
            this.f95357b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
