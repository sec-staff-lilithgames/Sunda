package com.bytedance.sdk.openadsdk.nmd;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz {
    private static void jd(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            qk.jpo("WebViewSettings", "removeJavascriptInterfacesSafe error", th2);
        }
    }

    private static void jpo(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th2) {
            qk.jpo("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th2);
        }
    }

    public static void jpo(WebView webView) {
        if (webView == null) {
            return;
        }
        jd(webView);
        WebSettings settings = webView.getSettings();
        jpo(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th2) {
            qk.jpo("WebViewSettings", "setJavaScriptEnabled error", th2);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th3) {
            qk.jpo("WebViewSettings", "setSupportZoom error", th3);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        int i10 = Build.VERSION.SDK_INT;
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z10 = i10 >= 28;
        try {
        } catch (Throwable th4) {
            qk.jpo("WebViewSettings", "setLayerType error", th4);
        }
        if (!z10) {
            webView.setLayerType(0, null);
        } else {
            if (z10) {
                webView.setLayerType(2, null);
            }
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}
