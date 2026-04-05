package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2 f92693c;

    public j2(u2 u2Var, Object obj) {
        this.f92693c = u2Var;
        this.f92692b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92693c.f93077f.sendMessage(this.f92692b);
    }
}
