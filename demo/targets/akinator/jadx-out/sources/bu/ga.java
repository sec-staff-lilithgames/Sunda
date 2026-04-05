package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ga implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final tt.a f10357b;

    /* renamed from: c, reason: collision with root package name */
    public final ha f10358c;

    /* renamed from: e, reason: collision with root package name */
    public final ku.m f10359e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f10360f;

    public ga(tt.a aVar, ha haVar, ku.m mVar) {
        this.f10357b = aVar;
        this.f10358c = haVar;
        this.f10359e = mVar;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10358c.f10390f = true;
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10357b.dispose();
        this.f10359e.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10360f.dispose();
        this.f10358c.f10390f = true;
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10360f, cVar)) {
            this.f10360f = cVar;
            this.f10357b.setResource(1, cVar);
        }
    }
}
