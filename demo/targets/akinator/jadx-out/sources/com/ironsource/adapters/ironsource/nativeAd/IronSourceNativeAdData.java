package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.G8;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class IronSourceNativeAdData extends AdapterNativeAdData {
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final NativeAdDataInterface.Image icon;
    private final String title;

    public IronSourceNativeAdData(G8 nativeAdData) {
        e0.checkNotNullParameter(nativeAdData, "nativeAdData");
        this.title = nativeAdData.n();
        this.advertiser = nativeAdData.h();
        this.body = nativeAdData.i();
        this.callToAction = nativeAdData.j();
        this.icon = new NativeAdDataInterface.Image(nativeAdData.k(), null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        return this.body;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        return this.icon;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        return this.title;
    }
}
