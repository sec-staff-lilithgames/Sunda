package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import j1.o2;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends WebViewClient {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f23809c;

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a f23810a;

    /* renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a f23811b;

    public b(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar2) {
        this.f23810a = aVar;
        this.f23811b = aVar2;
    }

    public final void a(String str, RenderProcessGoneDetail renderProcessGoneDetail) {
        String strValueOf;
        strValueOf = "unknown";
        if (Build.VERSION.SDK_INT >= 26) {
            strValueOf = renderProcessGoneDetail != null ? String.valueOf(renderProcessGoneDetail.didCrash()) : "unknown";
            IAlog.a("%s: onRenderProcessGone: handled, webview crashed: %s view: %s", "StorePromoWebviewClient", strValueOf, str);
        } else {
            IAlog.a("%s: onRenderProcessGone: handled, view: %s", "StorePromoWebviewClient", str);
        }
        String strM = a.b.m("Webview did crash: ", strValueOf, " on webview: ", str);
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f23811b;
        if (aVar != null) {
            aVar.a(bVar, strM, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", str, Integer.valueOf(i10), str2);
        if (a(str2)) {
            return;
        }
        String strG = o2.g(i10, str, " errCode: ");
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f23811b;
        if (aVar != null) {
            aVar.a(bVar, strG, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            a("unknown", renderProcessGoneDetail);
            return true;
        }
        a(webView.toString(), renderProcessGoneDetail);
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IAlog.a("%s: shouldOverrideUrlLoading: url: %s", "StorePromoWebviewClient", str);
        Uri uri = Uri.parse(str);
        if (uri == null || TextUtils.isEmpty(uri.getScheme()) || TextUtils.isEmpty(uri.getAuthority()) || TextUtils.isEmpty(uri.getHost()) || !"FyRemote://".toLowerCase().contains(uri.getScheme())) {
            return true;
        }
        HashMap mapA = h0.a(uri);
        String host = uri.getHost();
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar = this.f23810a;
        if (aVar == null) {
            return true;
        }
        aVar.a(host, mapA);
        return true;
    }

    static {
        String str = QpyI.hmWacLpT;
        f23809c = new String[]{str, str};
    }

    public static boolean a(String str) {
        s sVar;
        if (str == null || (sVar = IAConfigManager.O.f23226u) == null) {
            return false;
        }
        o oVar = sVar.f23394b;
        String[] strArr = f23809c;
        String strA = oVar.a("font_urls", (String) null);
        if (strA != null) {
            try {
                JSONArray jSONArray = new JSONArray(strA);
                String[] strArr2 = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr2[i10] = jSONArray.getString(i10);
                }
                strArr = strArr2;
            } catch (JSONException unused) {
            }
        }
        for (String str2 : strArr) {
            if (str.contains(str2.trim())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int errorCode;
        String string;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String string2 = "";
        if (webResourceError != null) {
            if (webResourceError.getDescription() != null) {
                string2 = webResourceError.getDescription().toString();
            }
            errorCode = webResourceError.getErrorCode();
        } else {
            errorCode = -999;
        }
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            string = webResourceRequest.getUrl().toString();
        } else {
            string = "unknown";
        }
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", string2, Integer.valueOf(errorCode), string);
        if (a(string)) {
            return;
        }
        String strG = o2.g(errorCode, string2, " errCode: ");
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f23811b;
        if (aVar != null) {
            aVar.a(bVar, strG, string);
        }
    }
}
