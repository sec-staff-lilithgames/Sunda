package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u0 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11063b;

    /* renamed from: c, reason: collision with root package name */
    public final st.b f11064c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11065e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f11066f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11067g;

    public u0(mt.i0 i0Var, Object obj, st.b bVar) {
        this.f11063b = i0Var;
        this.f11064c = bVar;
        this.f11065e = obj;
    }

    @Override // pt.c
    public void dispose() {
        this.f11066f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11066f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11067g) {
            return;
        }
        this.f11067g = true;
        Object obj = this.f11065e;
        mt.i0 i0Var = this.f11063b;
        i0Var.onNext(obj);
        i0Var.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11067g) {
            mu.a.onError(th2);
        } else {
            this.f11067g = true;
            this.f11063b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11067g) {
            return;
        }
        try {
            this.f11064c.accept(this.f11065e, obj);
        } catch (Throwable th2) {
            this.f11066f.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11066f, cVar)) {
            this.f11066f = cVar;
            this.f11063b.onSubscribe(this);
        }
    }
}
