package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g0 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52730b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f52731c;

    public g0(mt.t0 t0Var, st.a aVar) {
        this.f52730b = t0Var;
        this.f52731c = aVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52730b.subscribe(new f0(q0Var, this.f52731c));
    }
}
