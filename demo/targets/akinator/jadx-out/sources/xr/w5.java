package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b6 f93214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f93215c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i6 f93216e;

    public w5(i6 i6Var, b6 b6Var, boolean z10) {
        this.f93216e = i6Var;
        this.f93214b = b6Var;
        this.f93215c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93216e.f92629v.updateObjectInUse(this.f93214b, this.f93215c);
    }
}
