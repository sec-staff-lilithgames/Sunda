package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d7 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95347e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f95348f;

    /* renamed from: g, reason: collision with root package name */
    public final Callable f95349g;

    public d7(mt.l lVar, st.o oVar, st.o oVar2, Callable<Object> callable) {
        super(lVar);
        this.f95347e = oVar;
        this.f95348f = oVar2;
        this.f95349g = callable;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new c7(cVar, this.f95347e, this.f95348f, this.f95349g));
    }
}
