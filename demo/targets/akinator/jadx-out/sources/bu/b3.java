package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b3 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f10112b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10113c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10114e;

    /* renamed from: f, reason: collision with root package name */
    public long f10115f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10116g;

    public b3(mt.v vVar, long j10) {
        this.f10112b = vVar;
        this.f10113c = j10;
    }

    @Override // pt.c
    public void dispose() {
        this.f10114e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10114e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10116g) {
            return;
        }
        this.f10116g = true;
        this.f10112b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10116g) {
            mu.a.onError(th2);
        } else {
            this.f10116g = true;
            this.f10112b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10116g) {
            return;
        }
        long j10 = this.f10115f;
        if (j10 != this.f10113c) {
            this.f10115f = j10 + 1;
            return;
        }
        this.f10116g = true;
        this.f10114e.dispose();
        this.f10112b.onSuccess(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10114e, cVar)) {
            this.f10114e = cVar;
            this.f10112b.onSubscribe(this);
        }
    }
}
