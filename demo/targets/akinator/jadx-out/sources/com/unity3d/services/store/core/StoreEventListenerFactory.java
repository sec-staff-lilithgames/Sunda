package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.WebViewStoreEventListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StoreEventListenerFactory {
    private final StoreWebViewEventSender storeWebViewEventSender;

    public StoreEventListenerFactory(StoreWebViewEventSender storeWebViewEventSender) {
        e0.checkNotNullParameter(storeWebViewEventSender, "storeWebViewEventSender");
        this.storeWebViewEventSender = storeWebViewEventSender;
    }

    public static /* synthetic */ StoreEventListener invoke$default(StoreEventListenerFactory storeEventListenerFactory, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return storeEventListenerFactory.invoke(i10, z10);
    }

    public final StoreEventListener invoke() {
        return invoke$default(this, 0, false, 3, null);
    }

    public final StoreEventListener invoke(int i10) {
        return invoke$default(this, i10, false, 2, null);
    }

    public final StoreEventListener invoke(int i10, boolean z10) {
        return new WebViewStoreEventListener(i10, this.storeWebViewEventSender, z10);
    }
}
