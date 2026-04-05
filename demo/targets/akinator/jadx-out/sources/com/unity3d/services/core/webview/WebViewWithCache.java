package com.unity3d.services.core.webview;

import android.content.Context;
import android.webkit.WebSettings;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebViewWithCache extends WebView {
    /* JADX WARN: Illegal instructions before constructor call */
    public WebViewWithCache(Context context, boolean z10, IExperiments iExperiments) {
        SharedInstances sharedInstances = SharedInstances.INSTANCE;
        this(context, z10, sharedInstances.getWebViewBridge(), sharedInstances.getWebViewAppInvocationCallbackInvoker(), iExperiments);
    }

    public WebViewWithCache(Context context, boolean z10, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments) {
        super(context, z10, iWebViewBridge, iInvocationCallbackInvoker, iExperiments);
        WebSettings settings = getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        if (z10) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
    }
}
