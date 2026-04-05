package com.unity3d.services.store;

import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.core.StoreLifecycleListener;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StoreMonitor {
    private final MutableStateFlow<Boolean> _isInitialized;
    private StoreBilling storeBilling;
    private final StoreExceptionHandler storeExceptionHandler;
    private StoreLifecycleListener storeLifecycleListener;

    public StoreMonitor(StoreExceptionHandler storeExceptionHandler) {
        e0.checkNotNullParameter(storeExceptionHandler, "storeExceptionHandler");
        this.storeExceptionHandler = storeExceptionHandler;
        this._isInitialized = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    public final void getPurchaseHistory(int i10, String str, int i11, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        e0.checkNotNullParameter(purchaseHistoryResponseListener, "purchaseHistoryResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getPurchaseHistory(str, i11, purchaseHistoryResponseListener);
            }
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_ERROR, i10, e10);
        }
    }

    public final void getPurchases(int i10, String str, PurchasesResponseListener purchasesResponseListener) {
        e0.checkNotNullParameter(purchasesResponseListener, "purchasesResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (storeBilling != null) {
                storeBilling.getPurchases(str, purchasesResponseListener);
            }
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASES_REQUEST_ERROR, i10, e10);
        }
    }

    public final void getSkuDetails(int i10, String str, List<String> list, SkuDetailsResponseListener skuDetailsResponseListener) {
        e0.checkNotNullParameter(skuDetailsResponseListener, "skuDetailsResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getSkuDetails(str, list, skuDetailsResponseListener);
            }
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, i10, e10);
        }
    }

    public final void initialize(BillingInitializationListener billingInitializationListener) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        e0.checkNotNullParameter(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        StoreBilling storeBilling = new StoreBilling(ClientProperties.getApplicationContext(), billingInitializationListener);
        this.storeBilling = storeBilling;
        storeBilling.initialize(billingInitializationListener);
        this._isInitialized.setValue(Boolean.TRUE);
    }

    public final int isFeatureSupported(int i10, String str, FeatureSupportedListener featureSupportedListener) {
        e0.checkNotNullParameter(featureSupportedListener, "featureSupportedListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            iIsFeatureSupported = storeBilling != null ? storeBilling.isFeatureSupported(str) : -1;
            featureSupportedListener.onFeatureSupported(iIsFeatureSupported);
            return iIsFeatureSupported;
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_ERROR, i10, e10);
            return iIsFeatureSupported;
        }
    }

    public final boolean isInitialized() {
        return this._isInitialized.getValue().booleanValue();
    }

    public final void startPurchaseTracking(ArrayList<String> purchaseTypes, StoreEventListener storeEventListener) {
        e0.checkNotNullParameter(purchaseTypes, "purchaseTypes");
        e0.checkNotNullParameter(storeEventListener, "storeEventListener");
        if (this.storeLifecycleListener != null) {
            stopPurchaseTracking();
        }
        StoreBilling storeBilling = this.storeBilling;
        e0.checkNotNull(storeBilling);
        this.storeLifecycleListener = new StoreLifecycleListener(purchaseTypes, storeBilling, storeEventListener);
        ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.storeLifecycleListener);
    }

    public final void stopPurchaseTracking() {
        if (this.storeLifecycleListener != null) {
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.storeLifecycleListener);
            this.storeLifecycleListener = null;
        }
    }
}
