package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlinx.coroutines.flow.SharedFlow;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface WebViewBridge {
    SharedFlow<Invocation> getOnInvocation();

    void handleCallback(String str, String str2, String str3);

    void handleInvocation(String str);

    Object request(String str, String str2, Object[] objArr, d<? super Object[]> dVar);

    Object sendEvent(WebViewEvent webViewEvent, d<? super x0> dVar);
}
