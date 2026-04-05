package com.amazon.device.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12546c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12547e;

    public /* synthetic */ k(int i10, Object obj, Object obj2) {
        this.f12545b = i10;
        this.f12546c = obj;
        this.f12547e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12545b) {
            case 0:
                ((DTBAdRequest) this.f12546c).lambda$triggerCallBack$2((DtbMetrics) this.f12547e);
                break;
            case 1:
                ((DTBAdMRAIDBannerController) this.f12546c).lambda$expand$7((Map) this.f12547e);
                break;
            case 2:
                ((DTBAdMRAIDBannerController) this.f12546c).lambda$onAdClicked$14((View) this.f12547e);
                break;
            case 3:
                ((DTBAdMRAIDController) this.f12546c).lambda$evaluateJavascript$0((String) this.f12547e);
                break;
            case 4:
                ((DTBMetricsProcessor) this.f12546c).lambda$submitExpiredReport$0((List) this.f12547e);
                break;
            default:
                ((DtbOmSdkSessionManager) this.f12546c).lambda$registerAdView$3((WebView) this.f12547e);
                break;
        }
    }
}
