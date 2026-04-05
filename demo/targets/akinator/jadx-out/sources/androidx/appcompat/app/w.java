package androidx.appcompat.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f4885b;

    public w(t0 t0Var) {
        this.f4885b = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        t0 t0Var = this.f4885b;
        if ((t0Var.f4850c0 & 1) != 0) {
            t0Var.n(0);
        }
        if ((t0Var.f4850c0 & 4096) != 0) {
            t0Var.n(108);
        }
        t0Var.f4849b0 = false;
        t0Var.f4850c0 = 0;
    }
}
