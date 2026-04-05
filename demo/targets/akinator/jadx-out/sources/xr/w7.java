package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ea f93217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d8 f93218c;

    public w7(d8 d8Var, ea eaVar) {
        this.f93218c = d8Var;
        this.f93217b = eaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f93218c.f92426b.P) {
            this.f93217b.shutdown();
        }
        if (this.f93218c.f92426b.Q) {
            return;
        }
        this.f93218c.f92426b.K.add(this.f93217b);
    }
}
