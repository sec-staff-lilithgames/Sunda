package wt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w implements mt.f, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f91292b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f91293c;

    public w(tw.c cVar) {
        this.f91292b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f91293c.dispose();
    }

    @Override // mt.f
    public void onComplete() {
        this.f91292b.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f91292b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f91293c, cVar)) {
            this.f91293c = cVar;
            this.f91292b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
    }
}
