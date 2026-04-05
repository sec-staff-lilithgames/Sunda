package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y9 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f96605c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f96606e;

    public y9(Callable callable, st.o oVar) {
        this.f96605c = callable;
        this.f96606e = oVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        try {
            rt.a aVar = (rt.a) ut.o0.requireNonNull(this.f96605c.call(), "The connectableFactory returned null");
            try {
                tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f96606e.apply(aVar), "The selector returned a null Publisher");
                gu.q qVar = new gu.q(cVar);
                bVar.subscribe(qVar);
                aVar.connect(new x9(qVar));
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                hu.d.error(th2, cVar);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            hu.d.error(th3, cVar);
        }
    }
}
