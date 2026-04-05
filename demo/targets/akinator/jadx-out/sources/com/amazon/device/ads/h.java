package com.amazon.device.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DTBAdMRAIDController f12540c;

    public /* synthetic */ h(DTBAdMRAIDController dTBAdMRAIDController, int i10) {
        this.f12539b = i10;
        this.f12540c = dTBAdMRAIDController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12539b) {
            case 0:
                this.f12540c.lambda$onMRAIDUnload$2();
                break;
            default:
                this.f12540c.lambda$setState$1();
                break;
        }
    }
}
