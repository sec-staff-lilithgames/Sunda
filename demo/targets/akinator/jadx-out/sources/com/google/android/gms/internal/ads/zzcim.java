package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzcim extends zzcil {
    public zzcim(zzcgy zzcgyVar, zzbdt zzbdtVar, boolean z10, zzegj zzegjVar) {
        super(zzcgyVar, zzbdtVar, z10, zzegjVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzaa(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
