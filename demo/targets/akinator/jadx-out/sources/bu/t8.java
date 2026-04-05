package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t8 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.d f11045c;

    public t8(mt.b0 b0Var, st.d dVar) {
        super(b0Var);
        this.f11045c = dVar;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        tt.h hVar = new tt.h();
        i0Var.onSubscribe(hVar);
        new s8(i0Var, this.f11045c, hVar, this.f10053b).a();
    }
}
