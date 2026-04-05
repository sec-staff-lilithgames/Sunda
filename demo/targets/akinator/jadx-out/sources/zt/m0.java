package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0 implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f98692c;

    public m0(n0 n0Var, mt.v vVar) {
        this.f98692c = n0Var;
        this.f98691b = vVar;
    }

    @Override // mt.v
    public void onComplete() {
        mt.v vVar = this.f98691b;
        try {
            this.f98692c.f98701c.run();
            vVar.onComplete();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            vVar.onError(th2);
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        try {
            this.f98692c.f98701c.run();
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            th2 = new qt.c(th2, th3);
        }
        this.f98691b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        this.f98691b.onSubscribe(cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        mt.v vVar = this.f98691b;
        try {
            this.f98692c.f98701c.run();
            vVar.onSuccess(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            vVar.onError(th2);
        }
    }
}
