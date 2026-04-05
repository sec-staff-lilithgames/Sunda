package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q9 implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final p9 f10859b;

    /* renamed from: c, reason: collision with root package name */
    public final eu.d f10860c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10861e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f10862f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f10863g;

    public q9(p9 p9Var, int i10, int i11) {
        this.f10859b = p9Var;
        this.f10861e = i10;
        this.f10860c = new eu.d(i11);
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10862f = true;
        this.f10859b.a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10863g = th2;
        this.f10862f = true;
        this.f10859b.a();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10860c.offer(obj);
        this.f10859b.a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f10859b.f10801e.setResource(this.f10861e, cVar);
    }
}
