package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v4 extends mt.l implements Callable {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f96435c;

    public v4(Callable<Object> callable) {
        this.f96435c = callable;
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return ut.o0.requireNonNull(this.f96435c.call(), "The callable returned a null value");
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        hu.c cVar2 = new hu.c(cVar);
        cVar.onSubscribe(cVar2);
        try {
            cVar2.complete(ut.o0.requireNonNull(this.f96435c.call(), "The callable returned a null value"));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            if (cVar2.isCancelled()) {
                mu.a.onError(th2);
            } else {
                cVar.onError(th2);
            }
        }
    }
}
