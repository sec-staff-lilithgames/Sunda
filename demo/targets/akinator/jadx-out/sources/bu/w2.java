package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w2 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11153b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f11154c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f11155e;

    /* renamed from: f, reason: collision with root package name */
    public final st.a f11156f;

    /* renamed from: g, reason: collision with root package name */
    public final st.a f11157g;

    /* renamed from: h, reason: collision with root package name */
    public pt.c f11158h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11159i;

    public w2(mt.i0 i0Var, st.g gVar, st.g gVar2, st.a aVar, st.a aVar2) {
        this.f11153b = i0Var;
        this.f11154c = gVar;
        this.f11155e = gVar2;
        this.f11156f = aVar;
        this.f11157g = aVar2;
    }

    @Override // pt.c
    public void dispose() {
        this.f11158h.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11158h.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11159i) {
            return;
        }
        try {
            this.f11156f.run();
            this.f11159i = true;
            this.f11153b.onComplete();
            try {
                this.f11157g.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            onError(th3);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f11159i) {
            mu.a.onError(th2);
            return;
        }
        this.f11159i = true;
        try {
            this.f11155e.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            th2 = new qt.c(th2, th3);
        }
        this.f11153b.onError(th2);
        try {
            this.f11157g.run();
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            mu.a.onError(th4);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11159i) {
            return;
        }
        try {
            this.f11154c.accept(obj);
            this.f11153b.onNext(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f11158h.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11158h, cVar)) {
            this.f11158h = cVar;
            this.f11153b.onSubscribe(this);
        }
    }
}
