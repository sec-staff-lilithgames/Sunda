package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ha implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final ku.m f10387b;

    /* renamed from: c, reason: collision with root package name */
    public final tt.a f10388c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10389e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f10390f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10391g;

    public ha(ku.m mVar, tt.a aVar) {
        this.f10387b = mVar;
        this.f10388c = aVar;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10388c.dispose();
        this.f10387b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10388c.dispose();
        this.f10387b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10391g) {
            this.f10387b.onNext(obj);
        } else if (this.f10390f) {
            this.f10391g = true;
            this.f10387b.onNext(obj);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10389e, cVar)) {
            this.f10389e = cVar;
            this.f10388c.setResource(0, cVar);
        }
    }
}
