package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.w f98742b;

    public r(mt.w wVar) {
        this.f98742b = wVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        q qVar = new q(vVar);
        vVar.onSubscribe(qVar);
        try {
            ((ks.s) this.f98742b).subscribe(qVar);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            qVar.onError(th2);
        }
    }
}
