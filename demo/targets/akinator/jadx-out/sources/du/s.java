package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52836b;

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f52837c;

    public s(mt.t0 t0Var, tw.b bVar) {
        this.f52836b = t0Var;
        this.f52837c = bVar;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f52837c.subscribe(new r(q0Var, this.f52836b));
    }
}
