package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h8 extends ju.a {

    /* renamed from: b, reason: collision with root package name */
    public final ju.a f10383b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.b0 f10384c;

    public h8(ju.a aVar, mt.b0 b0Var) {
        this.f10383b = aVar;
        this.f10384c = b0Var;
    }

    @Override // ju.a
    public void connect(st.g gVar) {
        this.f10383b.connect(gVar);
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f10384c.subscribe(i0Var);
    }
}
