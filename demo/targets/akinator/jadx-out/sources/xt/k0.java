package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f93450b;

    public k0(Runnable runnable) {
        this.f93450b = runnable;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        pt.c cVarEmpty = pt.d.empty();
        fVar.onSubscribe(cVarEmpty);
        try {
            this.f93450b.run();
            if (cVarEmpty.isDisposed()) {
                return;
            }
            fVar.onComplete();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            if (cVarEmpty.isDisposed()) {
                mu.a.onError(th2);
            } else {
                fVar.onError(th2);
            }
        }
    }
}
