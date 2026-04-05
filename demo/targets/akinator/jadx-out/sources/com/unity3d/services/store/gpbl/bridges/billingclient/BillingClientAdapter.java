package com.unity3d.services.store.gpbl.bridges.billingclient;

import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class BillingClientAdapter {
    private final MutableStateFlow<Boolean> _isInitialized = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    public abstract String getAdapterVersion();

    public final MutableStateFlow<Boolean> get_isInitialized$unity_ads_defaultRelease() {
        return this._isInitialized;
    }

    public abstract void initialize(BillingInitializationListener billingInitializationListener);

    public abstract BillingResultResponseCode isFeatureSupported(String str);

    public final boolean isInitialized() {
        return this._isInitialized.getValue().booleanValue();
    }

    public abstract boolean isReady();

    public abstract void queryProductDetailsAsync(String str, String str2, ProductDetailsListener productDetailsListener);

    public abstract void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);
}
