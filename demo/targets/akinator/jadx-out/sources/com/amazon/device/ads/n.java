package com.amazon.device.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DtbOmSdkSessionManager f12559c;

    public /* synthetic */ n(DtbOmSdkSessionManager dtbOmSdkSessionManager, int i10) {
        this.f12558b = i10;
        this.f12559c = dtbOmSdkSessionManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12558b) {
            case 0:
                this.f12559c.lambda$displayAdEventLoaded$5();
                break;
            case 1:
                this.f12559c.lambda$new$0();
                break;
            case 2:
                this.f12559c.lambda$startAdSession$4();
                break;
            case 3:
                this.f12559c.lambda$stopOmAdSession$7();
                break;
            default:
                this.f12559c.lambda$impressionOccured$6();
                break;
        }
    }
}
