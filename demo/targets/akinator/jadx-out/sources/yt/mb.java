package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class mb extends a {

    /* renamed from: e, reason: collision with root package name */
    public final Object f95949e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95950f;

    public mb(mt.l lVar, Object obj, boolean z10) {
        super(lVar);
        this.f95949e = obj;
        this.f95950f = z10;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        this.f95121c.subscribe((mt.q) new lb(cVar, this.f95949e, this.f95950f));
    }
}
