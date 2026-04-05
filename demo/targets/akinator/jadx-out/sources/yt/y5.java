package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y5 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final st.c f96596b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f96597c;

    public y5(st.o oVar, st.c cVar) {
        this.f96596b = cVar;
        this.f96597c = oVar;
    }

    @Override // st.o
    public tw.b apply(Object obj) throws Exception {
        return new e7((tw.b) ut.o0.requireNonNull(this.f96597c.apply(obj), "The mapper returned a null Publisher"), new x5(obj, this.f96596b));
    }
}
