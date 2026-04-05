package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u1 extends mt.b0 {
    public u1(mt.e0 e0Var) {
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        s1 s1Var = new s1(i0Var);
        i0Var.onSubscribe(s1Var);
        try {
            throw null;
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            s1Var.onError(th2);
        }
    }
}
