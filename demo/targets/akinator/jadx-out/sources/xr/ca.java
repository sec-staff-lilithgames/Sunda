package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ca implements g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ea f92335a;

    public ca(ea eaVar) {
        this.f92335a = eaVar;
    }

    @Override // xr.g9
    public void transportTerminated() {
        this.f92335a.f92472b.shutdown();
    }

    @Override // xr.g9
    public void transportReady() {
    }

    @Override // xr.g9
    public wr.c filterTransport(wr.c cVar) {
        return cVar;
    }

    @Override // xr.g9
    public void transportInUse(boolean z10) {
    }

    @Override // xr.g9
    public void transportShutdown(wr.m6 m6Var) {
    }
}
