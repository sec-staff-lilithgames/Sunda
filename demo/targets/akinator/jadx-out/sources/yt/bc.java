package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class bc extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.q f95233e;

    public bc(mt.l lVar, st.q qVar) {
        super(lVar);
        this.f95233e = qVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new ac(cVar, this.f95233e));
    }
}
