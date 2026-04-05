package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebViewRenderingProcessGone extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public WebViewRenderingProcessGone() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ WebViewRenderingProcessGone(String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public WebViewRenderingProcessGone(String str) {
        super(Sdk.SDKError.Reason.WEBVIEW_ERROR, a.b.k("WebRenderingProcessGone: ", str), null);
    }
}
