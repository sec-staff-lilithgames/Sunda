package com.unity3d.services.core.domain;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SDKDispatchers implements ISDKDispatchers {

    /* renamed from: io, reason: collision with root package name */
    private final CoroutineDispatcher f50748io = Dispatchers.getIO();

    /* renamed from: default, reason: not valid java name */
    private final CoroutineDispatcher f3378default = Dispatchers.getDefault();
    private final CoroutineDispatcher main = Dispatchers.getMain();

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public CoroutineDispatcher getDefault() {
        return this.f3378default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public CoroutineDispatcher getIo() {
        return this.f50748io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public CoroutineDispatcher getMain() {
        return this.main;
    }
}
