package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c1 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52690b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52691c;

    public c1(mt.t0 t0Var, st.o oVar) {
        this.f52690b = t0Var;
        this.f52691c = oVar;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        this.f52690b.subscribe(new b1(i0Var, this.f52691c));
    }
}
