package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HandleDebugSettings {
    public final void invoke(NativeConfigurationOuterClass.DebugSettings debugSettings) {
        e0.checkNotNullParameter(debugSettings, "debugSettings");
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
