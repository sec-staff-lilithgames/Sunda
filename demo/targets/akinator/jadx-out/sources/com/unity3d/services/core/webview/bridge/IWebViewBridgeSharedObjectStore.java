package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface IWebViewBridgeSharedObjectStore<T extends IWebViewSharedObject> {
    T get(String str);

    void remove(String str);

    void set(T t10);
}
