package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x0 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f98820b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f98821c;

    public x0(mt.t0 t0Var, st.q qVar) {
        this.f98820b = t0Var;
        this.f98821c = qVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        this.f98820b.subscribe(new w0(vVar, this.f98821c));
    }
}
