package zt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j1 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98655c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f98656e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f98657f;

    public j1(mt.y yVar, st.o oVar, st.o oVar2, Callable<? extends mt.y> callable) {
        super(yVar);
        this.f98655c = oVar;
        this.f98656e = oVar2;
        this.f98657f = callable;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98526b.subscribe(new i1(vVar, this.f98655c, this.f98656e, this.f98657f));
    }
}
