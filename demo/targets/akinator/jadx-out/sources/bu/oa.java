package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class oa implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10758b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f10759c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10761f = true;

    /* renamed from: e, reason: collision with root package name */
    public final tt.h f10760e = new tt.h();

    public oa(mt.g0 g0Var, mt.i0 i0Var) {
        this.f10758b = i0Var;
        this.f10759c = g0Var;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (!this.f10761f) {
            this.f10758b.onComplete();
        } else {
            this.f10761f = false;
            this.f10759c.subscribe(this);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10758b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10761f) {
            this.f10761f = false;
        }
        this.f10758b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f10760e.update(cVar);
    }
}
