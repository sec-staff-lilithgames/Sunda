package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u8 f92504b;

    public f7(u8 u8Var) {
        this.f92504b = u8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        u8 u8Var = this.f92504b;
        if (u8Var.N.get() || u8Var.E == null) {
            return;
        }
        u8Var.d(false);
        u8.a(u8Var);
    }
}
