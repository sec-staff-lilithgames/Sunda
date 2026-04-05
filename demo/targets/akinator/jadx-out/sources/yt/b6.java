package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b6 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final st.o f95223b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f95224c;

    public b6(st.o oVar, mt.m0 m0Var) {
        this.f95223b = oVar;
        this.f95224c = m0Var;
    }

    @Override // st.o
    public tw.b apply(mt.l lVar) throws Exception {
        return mt.l.fromPublisher((tw.b) ut.o0.requireNonNull(this.f95223b.apply(lVar), "The selector returned a null Publisher")).observeOn(this.f95224c);
    }
}
