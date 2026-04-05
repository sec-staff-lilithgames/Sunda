package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class gb implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10361b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f10362c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10363e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10364f;

    public gb(mt.i0 i0Var, st.q qVar) {
        this.f10361b = i0Var;
        this.f10362c = qVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10363e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10363e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10364f) {
            return;
        }
        this.f10364f = true;
        this.f10361b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10364f) {
            mu.a.onError(th2);
        } else {
            this.f10364f = true;
            this.f10361b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10364f) {
            return;
        }
        try {
            boolean zTest = this.f10362c.test(obj);
            mt.i0 i0Var = this.f10361b;
            if (zTest) {
                i0Var.onNext(obj);
                return;
            }
            this.f10364f = true;
            this.f10363e.dispose();
            i0Var.onComplete();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10363e.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10363e, cVar)) {
            this.f10363e = cVar;
            this.f10361b.onSubscribe(this);
        }
    }
}
