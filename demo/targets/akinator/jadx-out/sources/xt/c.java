package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final d f93382b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.f f93383c;

    public c(d dVar, mt.f fVar) {
        this.f93382b = dVar;
        this.f93383c = fVar;
    }

    @Override // mt.f
    public void onComplete() {
        this.f93383c.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93383c.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this.f93382b, cVar);
    }
}
