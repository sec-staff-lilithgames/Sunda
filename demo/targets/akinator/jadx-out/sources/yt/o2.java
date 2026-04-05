package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f96031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f96032c;

    public o2(q2 q2Var, Throwable th2) {
        this.f96032c = q2Var;
        this.f96031b = th2;
    }

    @Override // java.lang.Runnable
    public void run() {
        q2 q2Var = this.f96032c;
        try {
            q2Var.f96166b.onError(this.f96031b);
        } finally {
            q2Var.f96169f.dispose();
        }
    }
}
