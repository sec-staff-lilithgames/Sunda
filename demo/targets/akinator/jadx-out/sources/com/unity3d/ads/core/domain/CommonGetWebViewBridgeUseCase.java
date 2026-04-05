package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    private final CoroutineDispatcher dispatcher;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(CoroutineDispatcher dispatcher, SendDiagnosticEvent sendDiagnosticEvent) {
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    public WebViewBridge invoke(AndroidWebViewContainer webViewContainer, CoroutineScope adPlayerScope) {
        e0.checkNotNullParameter(webViewContainer, "webViewContainer");
        e0.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, webViewContainer, adPlayerScope, this.sendDiagnosticEvent);
    }

    public /* synthetic */ CommonGetWebViewBridgeUseCase(CoroutineDispatcher coroutineDispatcher, SendDiagnosticEvent sendDiagnosticEvent, int i10, u uVar) {
        this((i10 & 1) != 0 ? Dispatchers.getDefault() : coroutineDispatcher, sendDiagnosticEvent);
    }
}
