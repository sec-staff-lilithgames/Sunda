package zt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final Iterable f98678c;

    public l(Iterable<? extends mt.y> iterable) {
        this.f98678c = iterable;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        try {
            k kVar = new k(cVar, (Iterator) ut.o0.requireNonNull(this.f98678c.iterator(), "The sources Iterable returned a null Iterator"));
            cVar.onSubscribe(kVar);
            kVar.a();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            hu.d.error(th2, cVar);
        }
    }
}
