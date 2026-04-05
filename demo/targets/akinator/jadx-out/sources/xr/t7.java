package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t7 implements g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u8 f93011a;

    public t7(u8 u8Var) {
        this.f93011a = u8Var;
    }

    @Override // xr.g9
    public void transportInUse(boolean z10) {
        u8 u8Var = this.f93011a;
        u8Var.f93112h0.updateObjectInUse(u8Var.L, z10);
    }

    @Override // xr.g9
    public void transportShutdown(wr.m6 m6Var) {
        mh.p1.checkState(this.f93011a.N.get(), "Channel must have been shut down");
    }

    @Override // xr.g9
    public void transportTerminated() {
        u8 u8Var = this.f93011a;
        mh.p1.checkState(u8Var.N.get(), "Channel must have been shut down");
        u8Var.P = true;
        u8Var.i(false);
        u8.b(u8Var);
        u8.c(u8Var);
    }

    @Override // xr.g9
    public void transportReady() {
    }

    @Override // xr.g9
    public wr.c filterTransport(wr.c cVar) {
        return cVar;
    }
}
