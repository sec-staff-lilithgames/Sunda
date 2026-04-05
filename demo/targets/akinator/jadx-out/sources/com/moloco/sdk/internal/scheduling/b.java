package com.moloco.sdk.internal.scheduling;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements a {
    @Override // com.moloco.sdk.internal.scheduling.a
    public CoroutineDispatcher getDefault() {
        return Dispatchers.getDefault();
    }

    @Override // com.moloco.sdk.internal.scheduling.a
    public CoroutineDispatcher getIo() {
        return Dispatchers.getIO();
    }

    @Override // com.moloco.sdk.internal.scheduling.a
    public CoroutineDispatcher getMain() {
        return Dispatchers.getMain();
    }

    @Override // com.moloco.sdk.internal.scheduling.a
    public CoroutineDispatcher getMainImmediate() {
        return Dispatchers.getMain().getImmediate();
    }

    @Override // com.moloco.sdk.internal.scheduling.a
    public CoroutineDispatcher getUnconfined() {
        return Dispatchers.getUnconfined();
    }
}
