package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class gd implements wr.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd f92572a;

    public gd(hd hdVar) {
        this.f92572a = hdVar;
    }

    @Override // wr.o0
    public void cancelled(wr.u0 u0Var) {
        if (u0Var.cancellationCause() != null) {
            this.f92572a.f92593a.f92657i = true;
        }
    }
}
