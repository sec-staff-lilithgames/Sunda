package yt;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f0 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final Callable f95460e;

    /* renamed from: f, reason: collision with root package name */
    public final tw.b f95461f;

    /* renamed from: g, reason: collision with root package name */
    public final st.o f95462g;

    public f0(mt.l lVar, tw.b bVar, st.o oVar, Callable<Collection<Object>> callable) {
        super(lVar);
        this.f95461f = bVar;
        this.f95462g = oVar;
        this.f95460e = callable;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        d0 d0Var = new d0(cVar, this.f95461f, this.f95462g, this.f95460e);
        cVar.onSubscribe(d0Var);
        this.f95121c.subscribe((mt.q) d0Var);
    }
}
