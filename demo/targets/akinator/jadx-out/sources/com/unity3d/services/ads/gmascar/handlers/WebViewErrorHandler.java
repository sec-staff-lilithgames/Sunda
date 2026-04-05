package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.n;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebViewErrorHandler implements d {
    private final IEventSender _eventSender;

    public WebViewErrorHandler() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public WebViewErrorHandler(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }

    @Override // com.unity3d.scar.adapter.common.d
    public void handleError(n nVar) {
        this._eventSender.sendEvent(WebViewEventCategory.valueOf(nVar.getDomain()), nVar.getErrorCategory(), nVar.getErrorArguments());
    }
}
