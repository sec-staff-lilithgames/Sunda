package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s6 f91118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f91119c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f91120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u6 f91121f;

    public r6(u6 u6Var, s6 s6Var, Runnable runnable, long j10) {
        this.f91121f = u6Var;
        this.f91118b = s6Var;
        this.f91119c = runnable;
        this.f91120e = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f91121f.execute(this.f91118b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f91119c.toString());
        sb2.append("(scheduled in SynchronizationContext with delay of ");
        return a.b.g(this.f91120e, ")", sb2);
    }
}
