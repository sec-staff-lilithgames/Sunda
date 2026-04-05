package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u0 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final Callable f96389e;

    /* renamed from: f, reason: collision with root package name */
    public final st.b f96390f;

    public u0(mt.l lVar, Callable<Object> callable, st.b bVar) {
        super(lVar);
        this.f96389e = callable;
        this.f96390f = bVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        try {
            this.f95121c.subscribe((mt.q) new t0(cVar, ut.o0.requireNonNull(this.f96389e.call(), "The initial value supplied is null"), this.f96390f));
        } catch (Throwable th2) {
            hu.d.error(th2, cVar);
        }
    }
}
