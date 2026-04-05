package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14144a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f14145b;

    /* renamed from: c, reason: collision with root package name */
    private WebView f14146c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14147d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f14148e = Collections.synchronizedSet(new HashSet());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends r4 {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f14149a;

        public a(boolean z10) {
            this.f14149a = z10;
        }

        @Override // com.applovin.impl.r4
        public Map a() {
            return CollectionUtils.hashMap("name", "WebTrackerManagerWebViewClient");
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f14149a) {
                com.applovin.impl.sdk.o unused = i8.this.f14145b;
                if (com.applovin.impl.sdk.o.a()) {
                    i8.this.f14145b.a("WebTrackerManager", "Successfully initialized web view for postbacks");
                }
                i8.this.f14147d = true;
            }
        }

        @Override // com.applovin.impl.r4, android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == i8.this.f14146c) {
                AppLovinSdkUtils.runOnUiThread(new m9(this, 0));
            } else {
                i8.this.b(webView);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            i8.this.f14146c.destroy();
            i8.this.f14146c = null;
        }
    }

    public i8(com.applovin.impl.sdk.k kVar) {
        this.f14144a = kVar;
        this.f14145b = kVar.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        WebView webViewA = a(str);
        if (webViewA != null) {
            this.f14148e.add(webViewA);
            AppLovinSdkUtils.runOnUiThreadDelayed(new s8(10, this, webViewA), ((Integer) this.f14144a.a(v4.I2)).intValue());
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f14145b.b("WebTrackerManager", "Failed to fire tracker since web view could not be created");
        }
    }

    public void b() {
        AppLovinSdkUtils.runOnUiThread(new m9(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        String strAppendQueryParameters = StringUtils.appendQueryParameters(eVar.f(), eVar.i(), ((Boolean) this.f14144a.a(v4.f15931g3)).booleanValue());
        if (this.f14146c == null) {
            WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
            this.f14146c = webViewA;
            if (webViewA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14145b.b("WebTrackerManager", "Failed to fire postback since web view could not be created");
                }
                appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                return;
            }
        }
        if (c() && !this.f14147d) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14145b.b("WebTrackerManager", "Failed to fire postback since web view was not initialized in time");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "firePostback");
            mapHashMap.put("source", "webViewNotInitialized");
            mapHashMap.put("url", strAppendQueryParameters);
            this.f14144a.E().d(c2.N0, mapHashMap);
            appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
            return;
        }
        String strL = a.b.l("al_firePostback('", strAppendQueryParameters, "')");
        if (((Boolean) this.f14144a.a(v4.O2)).booleanValue()) {
            l8.a(this.f14146c, strL, this.f14144a).a(this.f14144a.r0().a("evaluateJavascriptPromise"), new ao.q0(this, 1, appLovinPostbackListener, strAppendQueryParameters));
        } else {
            l8.a(this.f14146c, strL);
            appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        WebView webViewA = a("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>", true);
        this.f14146c = webViewA;
        if (webViewA == null && com.applovin.impl.sdk.o.a()) {
            this.f14145b.b("WebTrackerManager", "Failed to preload postback web view");
        }
    }

    public void a(com.applovin.impl.sdk.network.e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new androidx.browser.customtabs.g(this, 13, eVar, appLovinPostbackListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinPostbackListener appLovinPostbackListener, String str, boolean z10, String str2, String str3) {
        if (z10) {
            appLovinPostbackListener.onPostbackSuccess(str);
            return;
        }
        appLovinPostbackListener.onPostbackFailure(str, -1);
        Map map = CollectionUtils.map("top_main_method", "firePostback");
        map.put("source", "evaluateJavascriptFailed");
        map.put("url", str);
        CollectionUtils.putStringIfValid("error_message", str3, map);
        this.f14144a.E().d(c2.N0, map);
    }

    private boolean c() {
        return ((Boolean) this.f14144a.a(v4.N2)).booleanValue();
    }

    private WebView a(String str) {
        return a(str, false);
    }

    private WebView a(String str, boolean z10) {
        k7.b();
        WebView webViewB = k7.b(com.applovin.impl.sdk.k.o(), "web tracker");
        if (webViewB == null) {
            return null;
        }
        webViewB.getSettings().setJavaScriptEnabled(true);
        webViewB.setWebViewClient(new a(z10 && c()));
        webViewB.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", C.UTF8_NAME);
        return webViewB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(WebView webView) {
        if (webView == null || !this.f14148e.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new l9(webView, 0));
    }

    public void b(String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14145b.b("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else {
            if (!str.startsWith("<script")) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14145b.b("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
                    return;
                }
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new s8(9, this, str));
        }
    }
}
