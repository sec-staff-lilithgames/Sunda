package com.amazon.aps.ads.util.adview;

import android.content.Context;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface ApsAdWebViewClientListener {
    Context getAdViewContext();

    boolean isTwoPartExpand();

    void onAdLeftApplication();

    void onCrash(WebView webView, StringBuilder sb2, String str);

    void onLoadError();

    void onPageFinished(String str, WebView webView);

    void onPageLoaded();
}
