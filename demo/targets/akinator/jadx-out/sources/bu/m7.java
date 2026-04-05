package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m7 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f10646b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f10647c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10648e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10649f;

    /* renamed from: g, reason: collision with root package name */
    public pt.c f10650g;

    public m7(mt.v vVar, st.c cVar) {
        this.f10646b = vVar;
        this.f10647c = cVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10650g.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10650g.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10648e) {
            return;
        }
        this.f10648e = true;
        Object obj = this.f10649f;
        this.f10649f = null;
        mt.v vVar = this.f10646b;
        if (obj != null) {
            vVar.onSuccess(obj);
        } else {
            vVar.onComplete();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10648e) {
            mu.a.onError(th2);
            return;
        }
        this.f10648e = true;
        this.f10649f = null;
        this.f10646b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10648e) {
            return;
        }
        Object obj2 = this.f10649f;
        if (obj2 == null) {
            this.f10649f = obj;
            return;
        }
        try {
            this.f10649f = ut.o0.requireNonNull(this.f10647c.apply(obj2, obj), "The reducer returned a null value");
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10650g.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10650g, cVar)) {
            this.f10650g = cVar;
            this.f10646b.onSubscribe(this);
        }
    }
}
