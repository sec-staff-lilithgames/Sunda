package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class db extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.c f95371e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f95372f;

    public db(mt.l lVar, Callable<Object> callable, st.c cVar) {
        super(lVar);
        this.f95371e = cVar;
        this.f95372f = callable;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        try {
            this.f95121c.subscribe((mt.q) new cb(cVar, this.f95371e, ut.o0.requireNonNull(this.f95372f.call(), "The seed supplied is null"), mt.l.bufferSize()));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            hu.d.error(th2, cVar);
        }
    }
}
