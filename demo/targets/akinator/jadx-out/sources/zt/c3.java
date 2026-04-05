package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c3 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98557c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98558e;

    public c3(mt.y yVar, st.o oVar, boolean z10) {
        super(yVar);
        this.f98557c = oVar;
        this.f98558e = z10;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98526b.subscribe(new b3(vVar, this.f98557c, this.f98558e));
    }
}
