package com.applovin.impl;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class r4 extends WebViewClient {
    public abstract Map a();

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
        mapHashMap.putAll(a());
        if (o0.h()) {
            mapHashMap.put("source", renderProcessGoneDetail.didCrash() ? "crash" : "non_crash");
            mapHashMap.put("details", "renderer_priority_at_exit=" + renderProcessGoneDetail.rendererPriorityAtExit());
        }
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.D0;
        if (kVar != null) {
            com.applovin.impl.sdk.k.D0.E().a(c2.N0, mapHashMap, ((Long) kVar.a(v4.f15995o3)).longValue());
        }
        com.applovin.impl.sdk.o.g("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
