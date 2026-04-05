package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i2 implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final tt.h f10407b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.i0 f10408c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j2 f10410f;

    public i2(j2 j2Var, tt.h hVar, mt.i0 i0Var) {
        this.f10410f = j2Var;
        this.f10407b = hVar;
        this.f10408c = i0Var;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10409e) {
            return;
        }
        this.f10409e = true;
        this.f10410f.f10448b.subscribe(new h2(this));
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10409e) {
            mu.a.onError(th2);
        } else {
            this.f10409e = true;
            this.f10408c.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        onComplete();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f10407b.update(cVar);
    }
}
