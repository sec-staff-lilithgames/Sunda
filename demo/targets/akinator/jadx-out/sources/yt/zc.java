package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class zc extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.q f96654e;

    public zc(mt.l lVar, st.q qVar) {
        super(lVar);
        this.f96654e = qVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new yc(cVar, this.f96654e));
    }
}
