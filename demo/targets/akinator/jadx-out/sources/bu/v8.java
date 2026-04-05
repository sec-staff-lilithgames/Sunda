package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v8 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final st.q f11124c;

    /* renamed from: e, reason: collision with root package name */
    public final long f11125e;

    public v8(mt.b0 b0Var, long j10, st.q qVar) {
        super(b0Var);
        this.f11124c = qVar;
        this.f11125e = j10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        tt.h hVar = new tt.h();
        i0Var.onSubscribe(hVar);
        new u8(i0Var, this.f11125e, this.f11124c, hVar, this.f10053b).a();
    }
}
