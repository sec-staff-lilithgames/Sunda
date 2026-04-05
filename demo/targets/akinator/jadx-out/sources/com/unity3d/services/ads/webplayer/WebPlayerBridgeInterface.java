package com.unity3d.services.ads.webplayer;

import android.webkit.JavascriptInterface;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebPlayerBridgeInterface {
    private final String viewId;

    public WebPlayerBridgeInterface(String str) {
        this.viewId = str;
    }

    @JavascriptInterface
    public void handleEvent(String str) {
        if (WebViewApp.getCurrentApp() != null) {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.WEBPLAYER_EVENT, str, this.viewId);
        }
    }
}
