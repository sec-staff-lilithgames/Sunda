package com.amazon.device.ads;

import android.content.Context;
import com.amazon.device.ads.DtbMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12549c;

    public /* synthetic */ l(Object obj, int i10) {
        this.f12548b = i10;
        this.f12549c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12548b) {
            case 0:
                ((DtbMetrics.Submitter) this.f12549c).lambda$submitMetrics$0();
                break;
            case 1:
                ((DTBInterstitialActivity) this.f12549c).lambda$useCustomButtonUpdated$0();
                break;
            case 2:
                ((DTBMetricsConfiguration) this.f12549c).lambda$loadMobileClientConfig$0();
                break;
            case 3:
                ((DTBMetricsProcessor) this.f12549c).lambda$dispenseReport$1();
                break;
            default:
                DtbOmSdkSessionManager.lambda$activateOMSDK$1((Context) this.f12549c);
                break;
        }
    }
}
