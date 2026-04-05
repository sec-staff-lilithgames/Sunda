package com.applovin.impl;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class l8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView) {
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    public static void b(WebView webView) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new l9(webView, 1));
    }

    public static String b(String str, Map map) {
        String str2;
        str.getClass();
        switch (str) {
            case "com.applovin.custom_tabs_failure":
                str2 = "failure";
                break;
            case "com.applovin.custom_tabs_hidden":
                str2 = "hidden";
                break;
            case "com.applovin.custom_tabs_shown":
                str2 = "shown";
                break;
            default:
                return null;
        }
        return a("al_onInAppBrowserEvent", str2, map);
    }

    public static String c(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.external_redirect_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.external_redirect_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return a("al_onExternalRedirectEvent", str2, map);
    }

    public static String d(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.preload_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.preload_failure")) {
                return null;
            }
            str2 = "failure";
        }
        return a("al_onPreloadEvent", str2, map);
    }

    public static String a(String str, Map map) {
        String str2;
        str.getClass();
        if (str.equals("com.applovin.custom_intent_launch_failure")) {
            str2 = "failure";
        } else {
            if (!str.equals("com.applovin.custom_intent_launch_success")) {
                return null;
            }
            str2 = "success";
        }
        return a("al_onCustomIntentLaunchEvent", str2, map);
    }

    public static String a(Map map) {
        return a("al_onWindowInsetsInfoCollectedEvent", "success", map);
    }

    private static String a(String str, String str2, Map map) {
        JSONObject jSONObject;
        try {
            jSONObject = CollectionUtils.toJson(map);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbB = b3.h.b("javascript:", str, "('", str2, "',");
        sbB.append(jSONObject);
        sbB.append(");");
        return sbB.toString();
    }

    public static void a(WebView webView, String str, String str2, com.applovin.impl.sdk.k kVar) {
        if (webView == null) {
            return;
        }
        try {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            AppLovinSdkUtils.runOnUiThread(new r9(webView, str, 1));
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a(str2, "Unable to forward to WebView", th2);
            }
            kVar.E().a(str2, th2, CollectionUtils.hashMap("operation", str));
        }
    }

    public static void a(WebView webView, String str) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new r9(webView, str, 0));
    }

    public static q4 a(WebView webView, String str, com.applovin.impl.sdk.k kVar) {
        q4 q4Var = new q4("evaluateJavascript");
        if (webView == null) {
            return q4Var.a("null_webview");
        }
        AppLovinSdkUtils.runOnUiThread(new androidx.browser.customtabs.g(webView, 14, str, q4Var));
        Long l9 = (Long) kVar.a(v4.P2);
        if (l9.longValue() > 0) {
            g6.a(l9.longValue(), q4Var, "timed_out", "evaluateJavascriptTimeout", kVar);
            return q4Var;
        }
        q4Var.b(null);
        return q4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView, String str, final q4 q4Var) {
        Objects.requireNonNull(q4Var);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: com.applovin.impl.s9
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                q4Var.b((String) obj);
            }
        });
    }
}
