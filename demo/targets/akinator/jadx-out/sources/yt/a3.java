package yt;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a3 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95136e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f95137f;

    public a3(mt.l lVar, st.o oVar, Callable<? extends Collection<Object>> callable) {
        super(lVar);
        this.f95136e = oVar;
        this.f95137f = callable;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        try {
            this.f95121c.subscribe((mt.q) new z2(cVar, this.f95136e, (Collection) ut.o0.requireNonNull(this.f95137f.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            hu.d.error(th2, cVar);
        }
    }
}
