package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f92544b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3 f92545c;

    public g3(v3 v3Var, boolean z10) {
        this.f92545c = v3Var;
        this.f92544b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92545c.f93162c.setMessageCompression(this.f92544b);
    }
}
