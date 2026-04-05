package com.unity3d.ads.adplayer;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdPlayerScope implements CoroutineScope {
    private final /* synthetic */ CoroutineScope $$delegate_0;
    private final CoroutineDispatcher defaultDispatcher;

    public AdPlayerScope(CoroutineDispatcher defaultDispatcher) {
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.defaultDispatcher = defaultDispatcher;
        this.$$delegate_0 = CoroutineScopeKt.CoroutineScope(defaultDispatcher);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
