package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s6 f91107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f91108c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u6 f91109e;

    public q6(u6 u6Var, s6 s6Var, Runnable runnable) {
        this.f91109e = u6Var;
        this.f91107b = s6Var;
        this.f91108c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f91109e.execute(this.f91107b);
    }

    public String toString() {
        return this.f91108c.toString() + "(scheduled in SynchronizationContext)";
    }
}
