package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a5 implements mt.i0, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95146b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f95147c;

    public a5(tw.c cVar) {
        this.f95146b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        this.f95147c.dispose();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f95146b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f95146b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f95146b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f95147c = cVar;
        this.f95146b.onSubscribe(this);
    }

    @Override // tw.d
    public void request(long j10) {
    }
}
