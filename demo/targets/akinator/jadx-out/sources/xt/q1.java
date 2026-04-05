package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q1 implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f93477b;

    public q1(r1 r1Var) {
        this.f93477b = r1Var;
    }

    @Override // mt.f
    public void onComplete() {
        r1 r1Var = this.f93477b;
        r1Var.f93486c.dispose();
        r1Var.f93487e.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        r1 r1Var = this.f93477b;
        r1Var.f93486c.dispose();
        r1Var.f93487e.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93477b.f93486c.add(cVar);
    }
}
