package com.amazon.device.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DTBAdRequest f12544c;

    public /* synthetic */ j(DTBAdRequest dTBAdRequest, int i10) {
        this.f12543b = i10;
        this.f12544c = dTBAdRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12543b) {
            case 0:
                this.f12544c.lambda$new$0();
                break;
            default:
                this.f12544c.lambda$internalLoadAd$1();
                break;
        }
    }
}
