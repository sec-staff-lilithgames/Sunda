package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t9 implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final s9 f11046b;

    /* renamed from: c, reason: collision with root package name */
    public final eu.d f11047c;

    /* renamed from: e, reason: collision with root package name */
    public final int f11048e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f11049f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f11050g;

    public t9(s9 s9Var, int i10, int i11) {
        this.f11046b = s9Var;
        this.f11048e = i10;
        this.f11047c = new eu.d(i11);
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11049f = true;
        this.f11046b.a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11050g = th2;
        this.f11049f = true;
        this.f11046b.a();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11047c.offer(obj);
        this.f11046b.a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f11046b.f10970e.setResource(this.f11048e, cVar);
    }
}
