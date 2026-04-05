package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f93544c;

    public z(a0 a0Var, mt.f fVar) {
        this.f93544c = a0Var;
        this.f93543b = fVar;
    }

    @Override // mt.f
    public void onComplete() {
        mt.f fVar = this.f93543b;
        try {
            this.f93544c.f93367c.accept(null);
            fVar.onComplete();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            fVar.onError(th2);
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        try {
            this.f93544c.f93367c.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            th2 = new qt.c(th2, th3);
        }
        this.f93543b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        this.f93543b.onSubscribe(cVar);
    }
}
