package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a8 extends a implements st.g {

    /* renamed from: e, reason: collision with root package name */
    public final st.g f95150e;

    public a8(mt.l lVar) {
        super(lVar);
        this.f95150e = this;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new z7(cVar, this.f95150e));
    }

    public a8(mt.l lVar, st.g gVar) {
        super(lVar);
        this.f95150e = gVar;
    }

    @Override // st.g
    public void accept(Object obj) {
    }
}
