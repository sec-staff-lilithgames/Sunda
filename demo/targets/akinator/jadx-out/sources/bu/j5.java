package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j5 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final st.o f10462b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f10463c;

    public j5(st.o oVar, mt.m0 m0Var) {
        this.f10462b = oVar;
        this.f10463c = m0Var;
    }

    @Override // st.o
    public mt.g0 apply(mt.b0 b0Var) throws Exception {
        return mt.b0.wrap((mt.g0) ut.o0.requireNonNull(this.f10462b.apply(b0Var), "The selector returned a null ObservableSource")).observeOn(this.f10463c);
    }
}
