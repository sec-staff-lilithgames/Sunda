package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f10672b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f10673c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10674e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10675f;

    public n(mt.q0 q0Var, st.q qVar) {
        this.f10672b = q0Var;
        this.f10673c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10674e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10674e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10675f) {
            return;
        }
        this.f10675f = true;
        this.f10672b.onSuccess(Boolean.TRUE);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10675f) {
            mu.a.onError(th2);
        } else {
            this.f10675f = true;
            this.f10672b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10675f) {
            return;
        }
        try {
            if (this.f10673c.test(obj)) {
                return;
            }
            this.f10675f = true;
            this.f10674e.dispose();
            this.f10672b.onSuccess(Boolean.FALSE);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10674e.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10674e, cVar)) {
            this.f10674e = cVar;
            this.f10672b.onSubscribe(this);
        }
    }
}
