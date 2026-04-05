package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f93245c;

    public y(c0 c0Var, int i10) {
        this.f93245c = c0Var;
        this.f93244b = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93245c.f92297b.bytesRead(this.f93244b);
    }
}
