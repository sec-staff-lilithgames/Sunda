package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f92755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3 f92756c;

    public l3(v3 v3Var, String str) {
        this.f92756c = v3Var;
        this.f92755b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92756c.f93162c.setAuthority(this.f92755b);
    }
}
