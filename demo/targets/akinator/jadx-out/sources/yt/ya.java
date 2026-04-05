package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ya extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final Object f96607c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f96608e;

    public ya(Object obj, st.o oVar) {
        this.f96607c = obj;
        this.f96608e = oVar;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        try {
            tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f96608e.apply(this.f96607c), "The mapper returned a null Publisher");
            if (!(bVar instanceof Callable)) {
                bVar.subscribe(cVar);
                return;
            }
            try {
                Object objCall = ((Callable) bVar).call();
                if (objCall == null) {
                    hu.d.complete(cVar);
                } else {
                    cVar.onSubscribe(new hu.e(cVar, objCall));
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                hu.d.error(th2, cVar);
            }
        } catch (Throwable th3) {
            hu.d.error(th3, cVar);
        }
    }
}
