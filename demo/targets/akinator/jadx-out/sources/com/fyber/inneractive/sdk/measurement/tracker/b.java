package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.web.m;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends e {
    public b(Partner partner, m mVar) {
        super(partner, mVar);
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a(m mVar) {
        super.a(mVar);
        mVar.loadUrl("javascript:FyberMraidVideoTracker.initOmid(\"" + this.f24032d.getName() + "\",\"" + this.f24032d.getVersion() + "\");");
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final AdSessionConfiguration b() {
        try {
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            Owner owner = Owner.JAVASCRIPT;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void c() {
        WebView webView;
        if (this.f24031c || this.f24029a == null || (webView = this.f24033e) == null) {
            return;
        }
        this.f24031c = true;
        q0.a(webView, "FyberMraidVideoTracker.impression();");
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.e
    public final void a() {
        WebView webView = this.f24033e;
        if (webView != null) {
            q0.a(webView, "FyberMraidVideoTracker.adUserInteraction();");
        }
    }
}
