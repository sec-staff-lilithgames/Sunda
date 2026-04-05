package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w6 extends a {
    public w6(mt.l lVar, mt.p pVar) {
        super(lVar);
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        try {
            throw null;
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
