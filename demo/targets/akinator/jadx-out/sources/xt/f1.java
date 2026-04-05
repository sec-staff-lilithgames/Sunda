package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f1 implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f93405c;

    public f1(g1 g1Var, mt.f fVar) {
        this.f93405c = g1Var;
        this.f93404b = fVar;
    }

    @Override // mt.f
    public void onComplete() {
        this.f93404b.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        mt.f fVar = this.f93404b;
        try {
            if (this.f93405c.f93414c.test(th2)) {
                fVar.onComplete();
            } else {
                fVar.onError(th2);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            fVar.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93404b.onSubscribe(cVar);
    }
}
