package com.unity3d.ads.beta;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UnityAdsBeta {
    public static final void getToken(TokenConfiguration configuration, TokenListener listener) {
        e0.checkNotNullParameter(configuration, "configuration");
        e0.checkNotNullParameter(listener, "listener");
    }

    public static final String getVersion() {
        return "";
    }

    public static final void initialize(InitializationConfiguration configuration, InitializationListener listener) {
        e0.checkNotNullParameter(configuration, "configuration");
        e0.checkNotNullParameter(listener, "listener");
    }

    public static final boolean isInitialize() {
        return true;
    }
}
