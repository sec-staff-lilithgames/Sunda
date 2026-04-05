package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p extends mt.c {
    public p(mt.g gVar) {
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        o oVar = new o(fVar);
        fVar.onSubscribe(oVar);
        try {
            throw null;
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            oVar.onError(th2);
        }
    }
}
