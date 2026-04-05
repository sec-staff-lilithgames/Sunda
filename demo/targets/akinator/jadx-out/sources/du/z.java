package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52887b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f52888c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f52889e;

    public z(mt.q0 q0Var, st.g gVar) {
        this.f52887b = q0Var;
        this.f52888c = gVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f52889e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f52889e.isDisposed();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52887b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52889e, cVar)) {
            this.f52889e = cVar;
            this.f52887b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52887b.onSuccess(obj);
        try {
            this.f52888c.accept(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }
}
