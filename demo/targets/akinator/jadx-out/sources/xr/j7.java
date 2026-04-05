package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u8 f92704b;

    public j7(u8 u8Var) {
        this.f92704b = u8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        u8 u8Var = this.f92704b;
        if (u8Var.O) {
            return;
        }
        u8Var.O = true;
        u8.b(u8Var);
    }
}
