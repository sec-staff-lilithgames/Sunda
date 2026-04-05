package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e5 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f95420c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f95421e;

    /* renamed from: f, reason: collision with root package name */
    public final st.g f95422f;

    public e5(Callable<Object> callable, st.c cVar, st.g gVar) {
        this.f95420c = callable;
        this.f95421e = cVar;
        this.f95422f = gVar;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        try {
            cVar.onSubscribe(new d5(cVar, this.f95421e, this.f95422f, this.f95420c.call()));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            hu.d.error(th2, cVar);
        }
    }
}
