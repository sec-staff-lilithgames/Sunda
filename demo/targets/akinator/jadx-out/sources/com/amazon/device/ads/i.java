package com.amazon.device.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DTBAdMRAIDInterstitialController f12542c;

    public /* synthetic */ i(DTBAdMRAIDInterstitialController dTBAdMRAIDInterstitialController, int i10) {
        this.f12541b = i10;
        this.f12542c = dTBAdMRAIDInterstitialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12541b) {
            case 0:
                this.f12542c.lambda$onAdFailedToLoad$3();
                break;
            case 1:
                this.f12542c.lambda$onAdClicked$1();
                break;
            case 2:
                this.f12542c.lambda$onAdError$4();
                break;
            case 3:
                this.f12542c.lambda$onAdLoaded$2();
                break;
            case 4:
                this.f12542c.lambda$impressionFired$6();
                break;
            case 5:
                this.f12542c.lambda$onAdLeftApplication$5();
                break;
            case 6:
                this.f12542c.lambda$onVideoCompleted$7();
                break;
            default:
                this.f12542c.lambda$executeClose$0();
                break;
        }
    }
}
