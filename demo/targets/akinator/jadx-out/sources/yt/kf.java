package yt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class kf extends a {

    /* renamed from: e, reason: collision with root package name */
    public final Iterable f95830e;

    /* renamed from: f, reason: collision with root package name */
    public final st.c f95831f;

    public kf(mt.l lVar, Iterable<Object> iterable, st.c cVar) {
        super(lVar);
        this.f95830e = iterable;
        this.f95831f = cVar;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        try {
            Iterator it = (Iterator) ut.o0.requireNonNull(this.f95830e.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    hu.d.complete(cVar);
                } else {
                    this.f95121c.subscribe((mt.q) new jf(cVar, it, this.f95831f));
                }
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
