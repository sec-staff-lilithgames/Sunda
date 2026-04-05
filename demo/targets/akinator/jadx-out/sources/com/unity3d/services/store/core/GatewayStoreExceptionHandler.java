package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GatewayStoreExceptionHandler implements StoreExceptionHandler {
    @Override // com.unity3d.services.store.core.StoreExceptionHandler
    public void handleStoreException(StoreEvent storeEvent, int i10, Exception exception) throws Exception {
        e0.checkNotNullParameter(storeEvent, "storeEvent");
        e0.checkNotNullParameter(exception, "exception");
        throw exception;
    }
}
