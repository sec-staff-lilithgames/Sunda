package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m4 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f95930c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95931e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95932f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95933g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95934h;

    public m4(tw.b bVar, st.o oVar, boolean z10, int i10, int i11) {
        this.f95930c = bVar;
        this.f95931e = oVar;
        this.f95932f = z10;
        this.f95933g = i10;
        this.f95934h = i11;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        tw.b bVar = this.f95930c;
        st.o oVar = this.f95931e;
        if (za.tryScalarXMapSubscribe(bVar, cVar, oVar)) {
            return;
        }
        bVar.subscribe(c4.subscribe(cVar, oVar, this.f95932f, this.f95933g, this.f95934h));
    }
}
