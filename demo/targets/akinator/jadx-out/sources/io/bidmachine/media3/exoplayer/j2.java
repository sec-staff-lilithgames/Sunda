package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class j2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f61290c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f61291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f61292f;

    public /* synthetic */ j2(Object obj, boolean z10, boolean z11, int i10) {
        this.f61289b = i10;
        this.f61292f = obj;
        this.f61290c = z10;
        this.f61291e = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61289b) {
            case 0:
                k2 k2Var = (k2) this.f61292f;
                k2Var.f61323a.updateWakeLock(this.f61290c, this.f61291e);
                break;
            default:
                l2 l2Var = (l2) this.f61292f;
                l2Var.f61394a.updateWifiLock(this.f61290c, this.f61291e);
                break;
        }
    }
}
