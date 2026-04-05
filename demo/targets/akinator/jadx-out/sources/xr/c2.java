package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class c2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final wr.u0 f92302b;

    public c2(wr.u0 u0Var) {
        this.f92302b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wr.u0 u0Var = this.f92302b;
        wr.u0 u0VarAttach = u0Var.attach();
        try {
            runInContext();
        } finally {
            u0Var.detach(u0VarAttach);
        }
    }

    public abstract void runInContext();
}
