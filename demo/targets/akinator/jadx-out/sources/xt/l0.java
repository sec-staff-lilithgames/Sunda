package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93454b;

    public l0(mt.f fVar) {
        this.f93454b = fVar;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f93454b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f93454b.onSubscribe(cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f93454b.onComplete();
    }
}
