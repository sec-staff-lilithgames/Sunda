package yt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z4 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final Iterable f96642c;

    public z4(Iterable<Object> iterable) {
        this.f96642c = iterable;
    }

    public static <T> void subscribe(tw.c cVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                hu.d.complete(cVar);
            } else if (cVar instanceof vt.a) {
                cVar.onSubscribe(new y4((vt.a) cVar, it, 0));
            } else {
                cVar.onSubscribe(new y4(cVar, it, 1));
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            hu.d.error(th2, cVar);
        }
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        try {
            subscribe(cVar, this.f96642c.iterator());
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            hu.d.error(th2, cVar);
        }
    }
}
