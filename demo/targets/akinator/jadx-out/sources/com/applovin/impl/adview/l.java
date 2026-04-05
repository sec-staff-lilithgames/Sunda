package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.j0;
import com.applovin.impl.j8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class l extends j0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f13552c;

    public l(String str, com.applovin.impl.sdk.ad.b bVar, j8 j8Var, Context context) {
        super(context);
        this.f13552c = str;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        if (bVar.U0()) {
            applySettings(bVar);
        } else {
            settings.setAllowFileAccess(true);
            if (bVar.P0()) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        setWebViewClient(j8Var);
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }

    public void a(String str) {
        loadDataWithBaseURL(this.f13552c, str, "text/html", null, "");
    }
}
