package com.iab.omid.library.odeeoio.publisher;

import android.webkit.WebView;
import com.iab.omid.library.odeeoio.adsession.AdEvents;
import com.iab.omid.library.odeeoio.adsession.AdSessionConfiguration;
import com.iab.omid.library.odeeoio.adsession.AdSessionContext;
import com.iab.omid.library.odeeoio.adsession.ErrorType;
import com.iab.omid.library.odeeoio.adsession.VerificationScriptResource;
import com.iab.omid.library.odeeoio.adsession.media.MediaEvents;
import com.iab.omid.library.odeeoio.b.e;
import com.iab.omid.library.odeeoio.d.d;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private com.iab.omid.library.odeeoio.e.b f31212a;

    /* renamed from: b, reason: collision with root package name */
    private AdEvents f31213b;

    /* renamed from: c, reason: collision with root package name */
    private MediaEvents f31214c;

    /* renamed from: d, reason: collision with root package name */
    private a f31215d;

    /* renamed from: e, reason: collision with root package name */
    private long f31216e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        i();
        this.f31212a = new com.iab.omid.library.odeeoio.e.b(null);
    }

    public void a() {
    }

    public void b() {
        this.f31212a.clear();
    }

    public AdEvents c() {
        return this.f31213b;
    }

    public MediaEvents d() {
        return this.f31214c;
    }

    public boolean e() {
        return this.f31212a.get() != null;
    }

    public void f() {
        e.a().a(getWebView());
    }

    public void g() {
        e.a().b(getWebView());
    }

    public WebView getWebView() {
        return this.f31212a.get();
    }

    public void h() {
        e.a().c(getWebView());
    }

    public void i() {
        this.f31216e = d.a();
        this.f31215d = a.AD_STATE_IDLE;
    }

    public void a(float f10) {
        e.a().a(getWebView(), f10);
    }

    public void b(String str, long j10) {
        if (j10 >= this.f31216e) {
            a aVar = this.f31215d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f31215d = aVar2;
                e.a().b(getWebView(), str);
            }
        }
    }

    public void a(WebView webView) {
        this.f31212a = new com.iab.omid.library.odeeoio.e.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f31213b = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        e.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        e.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.odeeoio.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.odeeoio.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) throws JSONException {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        com.iab.omid.library.odeeoio.d.b.a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        com.iab.omid.library.odeeoio.d.b.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        com.iab.omid.library.odeeoio.d.b.a(jSONObject2, "deviceInfo", com.iab.omid.library.odeeoio.d.a.d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.iab.omid.library.odeeoio.d.b.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        com.iab.omid.library.odeeoio.d.b.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        com.iab.omid.library.odeeoio.d.b.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        com.iab.omid.library.odeeoio.d.b.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        com.iab.omid.library.odeeoio.d.b.a(jSONObject4, "libraryVersion", "1.3.26-Odeeoio");
        com.iab.omid.library.odeeoio.d.b.a(jSONObject4, "appId", com.iab.omid.library.odeeoio.b.d.a().b().getApplicationContext().getPackageName());
        com.iab.omid.library.odeeoio.d.b.a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            com.iab.omid.library.odeeoio.d.b.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            com.iab.omid.library.odeeoio.d.b.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            com.iab.omid.library.odeeoio.d.b.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        e.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f31214c = mediaEvents;
    }

    public void a(String str) {
        e.a().a(getWebView(), str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        if (j10 >= this.f31216e) {
            this.f31215d = a.AD_STATE_VISIBLE;
            e.a().b(getWebView(), str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        e.a().a(getWebView(), str, jSONObject);
    }

    public void a(JSONObject jSONObject) {
        e.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            e.a().c(getWebView(), z10 ? "foregrounded" : "backgrounded");
        }
    }
}
