package com.amazon.device.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12519b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DTBAdMRAIDBannerController f12520c;

    public /* synthetic */ b(DTBAdMRAIDBannerController dTBAdMRAIDBannerController, int i10) {
        this.f12519b = i10;
        this.f12520c = dTBAdMRAIDBannerController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12519b) {
            case 0:
                this.f12520c.lambda$passLoadError$18();
                break;
            case 1:
                this.f12520c.lambda$onAdLoaded$16();
                break;
            case 2:
                this.f12520c.lambda$onMRAIDUnload$4();
                break;
            case 3:
                this.f12520c.lambda$onAdLeftApplication$15();
                break;
            case 4:
                this.f12520c.lambda$onAdFailedToLoad$17();
                break;
            case 5:
                this.f12520c.lambda$updateExpandedToDefaultListener$11();
                break;
            case 6:
                this.f12520c.lambda$updateExpandedToDefaultListener$12();
                break;
            case 7:
                this.f12520c.lambda$updateResizedToDefaultListener$9();
                break;
            case 8:
                this.f12520c.lambda$updateResizedToDefaultListener$10();
                break;
            case 9:
                this.f12520c.lambda$useCustomButtonUpdated$13();
                break;
            default:
                this.f12520c.lambda$impressionFired$19();
                break;
        }
    }
}
