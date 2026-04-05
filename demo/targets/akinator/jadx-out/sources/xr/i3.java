package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f92602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3 f92603c;

    public i3(v3 v3Var, int i10) {
        this.f92603c = v3Var;
        this.f92602b = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92603c.f93162c.setMaxOutboundMessageSize(this.f92602b);
    }
}
