package com.fyber.inneractive.sdk.activities;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j1;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberReportAdActivity f23051a;

    public a(FyberReportAdActivity fyberReportAdActivity) {
        this.f23051a = fyberReportAdActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        IAlog.f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i10), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        z.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        FyberReportAdActivity fyberReportAdActivity = this.f23051a;
        if (fyberReportAdActivity.f23022b == webView) {
            fyberReportAdActivity.f23022b = null;
        }
        if (webView != null) {
            v.a(webView);
            webView.destroy();
        }
        this.f23051a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws JSONException {
        com.fyber.inneractive.sdk.flow.h hVar;
        if (str == null) {
            return false;
        }
        if (j1.a(str)) {
            WebView webView2 = this.f23051a.f23022b;
            if (webView2 != null) {
                webView2.loadUrl("chrome://crash");
            }
            return true;
        }
        if (!str.startsWith("fybermarketplace://reportAd?") || (hVar = FyberReportAdActivity.f23021f) == null) {
            return false;
        }
        String strSubstring = str.substring(28);
        com.fyber.inneractive.sdk.flow.g gVar = (com.fyber.inneractive.sdk.flow.g) hVar;
        w wVar = new w(u.FYBER_REPORT_AD, gVar.f23643b, gVar.f23644c);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, strSubstring);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", PglCryptUtils.KEY_MESSAGE, strSubstring);
        }
        wVar.f24329f.put(jSONObject);
        wVar.f24330g = true;
        wVar.a((String) null);
        WebView webView3 = this.f23051a.f23022b;
        if (webView3 != null) {
            q0.a(webView3, "reportSent();");
        }
        return true;
    }
}
