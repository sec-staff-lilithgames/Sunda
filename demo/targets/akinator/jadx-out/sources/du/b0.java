package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52673b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f52674c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f52675e;

    public b0(mt.q0 q0Var, st.a aVar) {
        this.f52673b = q0Var;
        this.f52674c = aVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f52675e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f52675e.isDisposed();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52673b.onError(th2);
        try {
            this.f52674c.run();
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            mu.a.onError(th3);
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52675e, cVar)) {
            this.f52675e = cVar;
            this.f52673b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52673b.onSuccess(obj);
        try {
            this.f52674c.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }
}
