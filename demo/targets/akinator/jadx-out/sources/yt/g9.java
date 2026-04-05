package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g9 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final tw.b f95541b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f95542c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f95543e;

    public g9(tw.b bVar, Object obj, st.c cVar) {
        this.f95541b = bVar;
        this.f95542c = obj;
        this.f95543e = cVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f95541b.subscribe(new f9(q0Var, this.f95543e, this.f95542c));
    }
}
