package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h1 implements wr.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f92575a;

    public h1(j1 j1Var) {
        this.f92575a = j1Var;
    }

    @Override // wr.o0
    public void cancelled(wr.u0 u0Var) {
        this.f92575a.f92683j.cancel(wr.w0.statusFromCancelled(u0Var));
    }
}
