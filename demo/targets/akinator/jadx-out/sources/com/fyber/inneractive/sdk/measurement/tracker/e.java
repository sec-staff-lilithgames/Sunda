package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.web.m;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.Partner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public AdSession f24029a;

    /* renamed from: b, reason: collision with root package name */
    public AdEvents f24030b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24031c = false;

    /* renamed from: d, reason: collision with root package name */
    public final Partner f24032d;

    /* renamed from: e, reason: collision with root package name */
    public WebView f24033e;

    public e(Partner partner, m mVar) {
        this.f24032d = partner;
        this.f24033e = mVar;
    }

    public abstract void a();

    public void a(m mVar) {
        AdSessionContext adSessionContextCreateHtmlAdSessionContext;
        try {
            AdSessionConfiguration adSessionConfigurationB = b();
            try {
                adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(this.f24032d, mVar, "", "");
            } catch (Throwable unused) {
                adSessionContextCreateHtmlAdSessionContext = null;
            }
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationB, adSessionContextCreateHtmlAdSessionContext);
            this.f24029a = adSessionCreateAdSession;
            adSessionCreateAdSession.registerAdView(mVar);
            this.f24029a.start();
        } catch (Throwable unused2) {
        }
    }

    public abstract AdSessionConfiguration b();

    public abstract void c();
}
