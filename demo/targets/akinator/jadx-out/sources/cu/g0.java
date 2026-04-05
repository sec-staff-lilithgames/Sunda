package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 extends gu.h {

    /* renamed from: f, reason: collision with root package name */
    public final st.c f50993f;

    /* renamed from: g, reason: collision with root package name */
    public Object f50994g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f50995h;

    public g0(tw.c cVar, Object obj, st.c cVar2) {
        super(cVar);
        this.f50994g = obj;
        this.f50993f = cVar2;
    }

    @Override // gu.h, hu.c, hu.a, vt.l, tw.d
    public void cancel() {
        super.cancel();
        this.f58433e.cancel();
    }

    @Override // gu.h, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f50995h) {
            return;
        }
        this.f50995h = true;
        Object obj = this.f50994g;
        this.f50994g = null;
        complete(obj);
    }

    @Override // gu.h, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f50995h) {
            mu.a.onError(th2);
            return;
        }
        this.f50995h = true;
        this.f50994g = null;
        this.f59162b.onError(th2);
    }

    @Override // gu.h, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f50995h) {
            return;
        }
        try {
            this.f50994g = ut.o0.requireNonNull(this.f50993f.apply(this.f50994g, obj), "The reducer returned a null value");
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            cancel();
            onError(th2);
        }
    }

    @Override // gu.h, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f58433e, dVar)) {
            this.f58433e = dVar;
            this.f59162b.onSubscribe(this);
            dVar.request(Long.MAX_VALUE);
        }
    }
}
