package com.unity3d.services.core.network.core;

import android.content.Context;
import kotlin.jvm.internal.e0;
import org.chromium.net.CronetEngine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CronetEngineBuilderFactory {
    public final CronetEngine.Builder createCronetEngineBuilder(Context context) {
        e0.checkNotNullParameter(context, "context");
        return new CronetEngine.Builder(context);
    }
}
