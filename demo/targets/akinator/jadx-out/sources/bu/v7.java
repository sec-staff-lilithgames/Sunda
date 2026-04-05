package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v7 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f11123c;

    public v7(mt.b0 b0Var, long j10) {
        super(b0Var);
        this.f11123c = j10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        tt.h hVar = new tt.h();
        i0Var.onSubscribe(hVar);
        long j10 = this.f11123c;
        new u7(i0Var, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, hVar, this.f10053b).a();
    }
}
