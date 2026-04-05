package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.ErrorType;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.internal.g;
import com.iab.omid.library.vungle.internal.h;
import com.iab.omid.library.vungle.utils.c;
import com.iab.omid.library.vungle.utils.f;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private String f31464a;

    /* renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.vungle.weakreference.b f31465b;

    /* renamed from: c, reason: collision with root package name */
    private AdEvents f31466c;

    /* renamed from: d, reason: collision with root package name */
    private MediaEvents f31467d;

    /* renamed from: e, reason: collision with root package name */
    private a f31468e;

    /* renamed from: f, reason: collision with root package name */
    private long f31469f;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f31464a = str;
        this.f31465b = new com.iab.omid.library.vungle.weakreference.b(null);
    }

    public void a() {
        this.f31469f = f.b();
        this.f31468e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f31465b.clear();
    }

    public AdEvents c() {
        return this.f31466c;
    }

    public MediaEvents d() {
        return this.f31467d;
    }

    public boolean e() {
        return this.f31465b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f31464a);
    }

    public void g() {
        h.a().b(getWebView(), this.f31464a);
    }

    public WebView getWebView() {
        return this.f31465b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void a(float f10) {
        h.a().a(getWebView(), this.f31464a, f10);
    }

    public void b(String str, long j10) {
        if (j10 >= this.f31469f) {
            this.f31468e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f31464a, str);
        }
    }

    public void a(WebView webView) {
        this.f31465b = new com.iab.omid.library.vungle.weakreference.b(webView);
    }

    public void b(boolean z10) {
        if (e()) {
            h.a().a(getWebView(), this.f31464a, z10 ? "locked" : "unlocked");
        }
    }

    public void a(AdEvents adEvents) {
        this.f31466c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f31464a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f31464a, errorType, str);
    }

    public void a(com.iab.omid.library.vungle.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.vungle.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) throws JSONException {
        String strC = aVar.c();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.vungle.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.vungle.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        c.a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.5.3-Vungle");
        c.a(jSONObject4, "appId", g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), strC, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f31467d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        if (j10 >= this.f31469f) {
            a aVar = this.f31468e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f31468e = aVar2;
                h.a().b(getWebView(), this.f31464a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f31464a, str, jSONObject);
    }

    public void a(Date date) throws JSONException {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(JSONObject jSONObject) {
        h.a().b(getWebView(), this.f31464a, jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            h.a().c(getWebView(), this.f31464a, z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void i() {
    }
}
