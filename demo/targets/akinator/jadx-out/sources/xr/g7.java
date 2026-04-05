package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u8 f92558b;

    public g7(u8 u8Var) {
        this.f92558b = u8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92558b.e();
        if (this.f92558b.F != null) {
            this.f92558b.F.requestConnection();
        }
        d8 d8Var = this.f92558b.E;
        if (d8Var != null) {
            d8Var.f92425a.getDelegate().requestConnection();
        }
    }
}
