package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class aa implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10082b;

    /* renamed from: c, reason: collision with root package name */
    public long f10083c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10084e;

    public aa(mt.i0 i0Var, long j10) {
        this.f10082b = i0Var;
        this.f10083c = j10;
    }

    @Override // pt.c
    public void dispose() {
        this.f10084e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10084e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10082b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10082b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        long j10 = this.f10083c;
        if (j10 != 0) {
            this.f10083c = j10 - 1;
        } else {
            this.f10082b.onNext(obj);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10084e, cVar)) {
            this.f10084e = cVar;
            this.f10082b.onSubscribe(this);
        }
    }
}
