package com.bytedance.sdk.openadsdk.core.widget.jpo;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.cm.Cif;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.utils.jr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends WebChromeClient {
    private static final String jpo = "WebChromeClient";

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.cm f20899cm;

    /* renamed from: jd, reason: collision with root package name */
    private final ef f20900jd;
    private Cif wqx;

    public cm(ef efVar) {
        this.f20900jd = efVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (!TextUtils.isEmpty(str)) {
            jpo(str);
        }
        super.onConsoleMessage(str, i10, str2);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        Cif cif = this.wqx;
        if (cif != null) {
            cif.jpo(webView, i10);
        }
        com.bytedance.sdk.openadsdk.common.cm cmVar = this.f20899cm;
        if (cmVar != null) {
            cmVar.jpo(webView, i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    private boolean jpo(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.regionMatches(true, 0, "bytedance:", 0, 10)) {
                oya.wqx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.widget.jpo.cm.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jr.jpo(Uri.parse(str), cm.this.f20900jd);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public cm(ef efVar, Cif cif, com.bytedance.sdk.openadsdk.common.cm cmVar) {
        this(efVar, cif);
        this.f20899cm = cmVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !jpo(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    public cm(ef efVar, Cif cif) {
        this.f20900jd = efVar;
        this.wqx = cif;
    }
}
