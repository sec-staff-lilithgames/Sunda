package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class e {
    public static final c a(StateFlow<? extends n> currentPlaylistItem, CoroutineScope scope) {
        e0.checkNotNullParameter(currentPlaylistItem, "currentPlaylistItem");
        e0.checkNotNullParameter(scope, "scope");
        return new d(currentPlaylistItem, scope);
    }
}
