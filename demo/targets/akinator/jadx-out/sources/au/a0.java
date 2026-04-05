package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.y f8009c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f8010e;

    public a0(mt.y yVar, st.o oVar) {
        this.f8009c = yVar;
        this.f8010e = oVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f8009c.subscribe(new z(cVar, this.f8010e));
    }
}
