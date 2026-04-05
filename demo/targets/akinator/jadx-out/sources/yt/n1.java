package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n1 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f95980c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95981e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95982f;

    /* renamed from: g, reason: collision with root package name */
    public final iu.k f95983g;

    public n1(tw.b bVar, st.o oVar, int i10, iu.k kVar) {
        this.f95980c = bVar;
        this.f95981e = oVar;
        this.f95982f = i10;
        this.f95983g = kVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        tw.b bVar = this.f95980c;
        st.o oVar = this.f95981e;
        if (za.tryScalarXMapSubscribe(bVar, cVar, oVar)) {
            return;
        }
        bVar.subscribe(j1.subscribe(cVar, oVar, this.f95982f, this.f95983g));
    }
}
