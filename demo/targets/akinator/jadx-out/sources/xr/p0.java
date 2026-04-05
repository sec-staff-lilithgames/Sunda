package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p0 implements u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f92864a;

    public p0(r0 r0Var) {
        this.f92864a = r0Var;
    }

    @Override // xr.u9
    public void onComplete() {
        r0 r0Var = this.f92864a;
        if (r0Var.f92941c.decrementAndGet() == 0) {
            r0.b(r0Var);
        }
    }
}
