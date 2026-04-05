package com.unity3d.services.ads.operation;

import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore;
import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface IAdModule<T extends IWebViewSharedObject, T2> extends IWebViewBridgeSharedObjectStore<T> {
    void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, T2 t22);

    SDKMetricsSender getMetricSender();
}
