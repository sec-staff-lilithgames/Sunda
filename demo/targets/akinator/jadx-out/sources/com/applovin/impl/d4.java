package com.applovin.impl;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d4 extends c4 {
    public d4(com.applovin.impl.sdk.ad.a aVar) {
        super(aVar);
    }

    @Override // com.applovin.impl.c4
    public AdSessionContext a(WebView webView) {
        try {
            return this.f13764a.getOpenMeasurementVerificationScriptResources().size() > 0 ? AdSessionContext.createNativeAdSessionContext(this.f13765b.e0().b(), this.f13765b.e0().a(), this.f13764a.getOpenMeasurementVerificationScriptResources(), this.f13764a.getOpenMeasurementContentUrl(), this.f13764a.getOpenMeasurementCustomReferenceData()) : AdSessionContext.createHtmlAdSessionContext(this.f13765b.e0().b(), webView, this.f13764a.getOpenMeasurementContentUrl(), this.f13764a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f13766c.a(this.f13767d, "Failed to create ad session context", th2);
            return null;
        }
    }

    @Override // com.applovin.impl.c4
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f13766c.a(this.f13767d, "Failed to create ad session configuration", th2);
            return null;
        }
    }
}
