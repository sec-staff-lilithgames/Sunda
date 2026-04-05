package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface h0 {
    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r a(Context context, com.moloco.sdk.internal.ortb.model.c cVar, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var);

    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar, String str, e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2);

    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r a(Context context, CoroutineScope coroutineScope, com.moloco.sdk.internal.ortb.model.c cVar, e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2, MutableStateFlow<Boolean> mutableStateFlow, boolean z10);
}
