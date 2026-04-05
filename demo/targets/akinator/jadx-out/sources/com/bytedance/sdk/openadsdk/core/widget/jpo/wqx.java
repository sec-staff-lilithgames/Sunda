package com.bytedance.sdk.openadsdk.core.widget.jpo;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.nmd;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    private final WeakReference<Context> jpo;

    /* renamed from: jd, reason: collision with root package name */
    private boolean f20936jd = true;
    private final boolean wqx = true;

    /* renamed from: cm, reason: collision with root package name */
    private final boolean f20935cm = true;
    private final boolean my = false;

    /* renamed from: jj, reason: collision with root package name */
    private final boolean f20937jj = true;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f20938qk = true;

    private wqx(Context context) {
        this.jpo = new WeakReference<>(context);
    }

    public static wqx jpo(Context context) {
        return new wqx(context);
    }

    public wqx jd(boolean z10) {
        this.f20936jd = z10;
        return this;
    }

    public static void jd(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            nmd.wqx(th2.toString(), new Object[0]);
        }
    }

    public wqx jpo(boolean z10) {
        this.f20938qk = z10;
        return this;
    }

    public void jpo(WebView webView) {
        if (webView == null || this.jpo.get() == null) {
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
        } catch (Exception e10) {
            nmd.wqx("SSWebSettings", e10.getMessage());
        }
        try {
            if (this.f20936jd) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th2) {
            nmd.wqx("SSWebSettings", th2.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.f20938qk) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th3) {
            nmd.wqx("SSWebSettings", th3.getMessage());
        }
    }

    private void jpo(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th2) {
            nmd.wqx(th2.toString(), new Object[0]);
        }
    }

    public static void jpo(com.bytedance.sdk.component.zz.jj jjVar) {
        if (jjVar == null) {
            return;
        }
        int iJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("clear_web_cache_new", 0);
        if (iJpo == 0) {
            jjVar.jpo(true);
        } else if (iJpo == 1) {
            jjVar.jpo(false);
        }
    }
}
