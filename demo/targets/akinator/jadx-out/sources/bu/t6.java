package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t6 implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11033b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f11034c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11035e;

    /* renamed from: f, reason: collision with root package name */
    public final tt.h f11036f = new tt.h();

    /* renamed from: g, reason: collision with root package name */
    public boolean f11037g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11038h;

    public t6(mt.i0 i0Var, st.o oVar, boolean z10) {
        this.f11033b = i0Var;
        this.f11034c = oVar;
        this.f11035e = z10;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f11038h) {
            return;
        }
        this.f11038h = true;
        this.f11037g = true;
        this.f11033b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        boolean z10 = this.f11037g;
        mt.i0 i0Var = this.f11033b;
        if (z10) {
            if (this.f11038h) {
                mu.a.onError(th2);
                return;
            } else {
                i0Var.onError(th2);
                return;
            }
        }
        this.f11037g = true;
        if (this.f11035e && !(th2 instanceof Exception)) {
            i0Var.onError(th2);
            return;
        }
        try {
            mt.g0 g0Var = (mt.g0) this.f11034c.apply(th2);
            if (g0Var != null) {
                g0Var.subscribe(this);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Observable is null");
            nullPointerException.initCause(th2);
            i0Var.onError(nullPointerException);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            i0Var.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11038h) {
            return;
        }
        this.f11033b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f11036f.replace(cVar);
    }
}
