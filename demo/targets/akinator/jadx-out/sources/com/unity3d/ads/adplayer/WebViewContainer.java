package com.unity3d.ads.adplayer;

import android.view.InputEvent;
import kotlinx.coroutines.flow.StateFlow;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface WebViewContainer {
    Object addJavascriptInterface(WebViewBridge webViewBridge, String str, d<? super x0> dVar);

    Object destroy(d<? super x0> dVar);

    Object evaluateJavascript(String str, d<? super x0> dVar);

    StateFlow<InputEvent> getLastInputEvent();

    Object loadUrl(String str, d<? super x0> dVar);
}
