package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n7 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10697b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f10698c;

    public n7(mt.g0 g0Var, st.c cVar) {
        this.f10697b = g0Var;
        this.f10698c = cVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f10697b.subscribe(new m7(vVar, this.f10698c));
    }
}
