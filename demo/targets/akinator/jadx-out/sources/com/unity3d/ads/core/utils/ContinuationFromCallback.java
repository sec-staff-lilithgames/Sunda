package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import kotlin.jvm.internal.e0;
import tu.a0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ContinuationFromCallback extends WebViewCallback {
    private final d<Object> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(d<Object> continuation) {
        super("", 0);
        e0.checkNotNullParameter(continuation, "continuation");
        this.continuation = continuation;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(Enum<?> r52, Object... params) {
        e0.checkNotNullParameter(params, "params");
        d<Object> dVar = this.continuation;
        int i10 = z.f87419c;
        dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(new ExposureException("Invocation failed with: " + r52, params))));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(Object... params) {
        e0.checkNotNullParameter(params, "params");
        this.continuation.resumeWith(z.m7131constructorimpl(params));
    }
}
