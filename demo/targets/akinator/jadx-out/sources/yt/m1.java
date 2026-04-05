package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m1 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f95920c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95921e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95922f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95923g;

    /* renamed from: h, reason: collision with root package name */
    public final iu.k f95924h;

    public m1(tw.b bVar, st.o oVar, int i10, int i11, iu.k kVar) {
        this.f95920c = bVar;
        this.f95921e = oVar;
        this.f95922f = i10;
        this.f95923g = i11;
        this.f95924h = kVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95920c.subscribe(new k1(cVar, this.f95921e, this.f95922f, this.f95923g, this.f95924h));
    }
}
