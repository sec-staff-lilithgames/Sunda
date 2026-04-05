package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t0 extends hu.c implements mt.q {

    /* renamed from: e, reason: collision with root package name */
    public final st.b f96341e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f96342f;

    /* renamed from: g, reason: collision with root package name */
    public tw.d f96343g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f96344h;

    public t0(tw.c cVar, Object obj, st.b bVar) {
        super(cVar);
        this.f96341e = bVar;
        this.f96342f = obj;
    }

    @Override // hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f96343g.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96344h) {
            return;
        }
        this.f96344h = true;
        complete(this.f96342f);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96344h) {
            mu.a.onError(th2);
        } else {
            this.f96344h = true;
            this.f59162b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96344h) {
            return;
        }
        try {
            this.f96341e.accept(this.f96342f, obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f96343g.cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f96343g, dVar)) {
            this.f96343g = dVar;
            this.f59162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
