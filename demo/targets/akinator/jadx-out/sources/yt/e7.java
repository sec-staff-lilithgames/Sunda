package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e7 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f95424c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95425e;

    public e7(tw.b bVar, st.o oVar) {
        this.f95424c = bVar;
        this.f95425e = oVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95424c.subscribe(new a7(cVar, this.f95425e));
    }
}
