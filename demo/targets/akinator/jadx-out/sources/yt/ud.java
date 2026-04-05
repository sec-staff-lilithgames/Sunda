package yt;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ud extends a {

    /* renamed from: e, reason: collision with root package name */
    public final Callable f96420e;

    public ud(mt.l lVar, Callable<Collection<Object>> callable) {
        super(lVar);
        this.f96420e = callable;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(this.f96420e.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            td tdVar = new td(cVar);
            tdVar.f59163c = collection;
            this.f95121c.subscribe((mt.q) tdVar);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            hu.d.error(th2, cVar);
        }
    }
}
