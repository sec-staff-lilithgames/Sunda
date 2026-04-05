package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2 f92917c;

    public q2(t2 t2Var, Object obj) {
        this.f92917c = t2Var;
        this.f92916b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92917c.f93001a.onMessage(this.f92916b);
    }
}
