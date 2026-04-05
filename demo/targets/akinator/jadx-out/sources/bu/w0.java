package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w0 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f11142b;

    /* renamed from: c, reason: collision with root package name */
    public final st.b f11143c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11144e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f11145f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11146g;

    public w0(mt.q0 q0Var, Object obj, st.b bVar) {
        this.f11142b = q0Var;
        this.f11143c = bVar;
        this.f11144e = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f11145f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11145f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11146g) {
            return;
        }
        this.f11146g = true;
        this.f11142b.onSuccess(this.f11144e);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11146g) {
            mu.a.onError(th2);
        } else {
            this.f11146g = true;
            this.f11142b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11146g) {
            return;
        }
        try {
            this.f11143c.accept(this.f11144e, obj);
        } catch (Throwable th2) {
            this.f11145f.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11145f, cVar)) {
            this.f11145f = cVar;
            this.f11142b.onSubscribe(this);
        }
    }
}
