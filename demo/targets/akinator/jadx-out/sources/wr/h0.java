package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f90948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f90949c;

    public h0(u0 u0Var, Runnable runnable) {
        this.f90949c = u0Var;
        this.f90948b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        u0 u0Var = this.f90949c;
        u0 u0VarAttach = u0Var.attach();
        try {
            this.f90948b.run();
        } finally {
            u0Var.detach(u0VarAttach);
        }
    }
}
