package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebViewBridgeInvoker implements IWebViewBridgeInvoker {
    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
    public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
        return WebViewApp.getCurrentApp().invokeMethod(str, str2, method, objArr);
    }
}
