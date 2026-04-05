package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private BillingClientBridge billingClient;
    private final BillingClientBuilderBridge billingClientBuilderBridge;
    private final int detectedVersion;

    public /* synthetic */ BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge, int i10, int i11, u uVar) {
        this(billingClientBuilderBridge, (i11 & 2) != 0 ? 6 : i10);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public String getAdapterVersion() {
        return String.valueOf(this.detectedVersion);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void initialize(BillingInitializationListener billingInitializationListener) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        this.billingClientBuilderBridge.setListener(new PurchaseUpdatedListenerProxy(billingInitializationListener));
        this.billingClientBuilderBridge.enablePendingPurchases();
        BillingClientBridgeCommon billingClientBridgeCommonBuild = this.billingClientBuilderBridge.build();
        e0.checkNotNull(billingClientBridgeCommonBuild, "null cannot be cast to non-null type com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge");
        this.billingClient = (BillingClientBridge) billingClientBridgeCommonBuild;
        startConnection(billingInitializationListener);
        get_isInitialized$unity_ads_defaultRelease().setValue(Boolean.TRUE);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public BillingResultResponseCode isFeatureSupported(String str) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            e0.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isFeatureSupported(str);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public boolean isReady() {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            e0.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        return billingClientBridge.isReady();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryProductDetailsAsync(String productId, String productType, final ProductDetailsListener listener) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(productId, "productId");
        e0.checkNotNullParameter(productType, "productType");
        e0.checkNotNullParameter(listener, "listener");
        SkuDetailsParamsBridge skuDetailsParamsBridgeBuild = SkuDetailsParamsBridge.newBuilder().setSkuList(o0.listOf(productId)).setType(productType).build();
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            e0.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.querySkuDetailsAsync(skuDetailsParamsBridgeBuild, new SkuDetailsResponseListenerProxy(new SkuDetailsResponseListener() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.queryProductDetailsAsync.1
            @Override // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
            public void onSkuDetailsUpdated(BillingResultBridge billingResult, List<? extends SkuDetailsBridge> list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                e0.checkNotNullParameter(billingResult, "billingResult");
                List<? extends SkuDetailsBridge> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    listener.onProductDetailsResponse(billingResult, null);
                    return;
                }
                ProductDetailsListener productDetailsListener = listener;
                JSONObject originalJson = list.get(0).getOriginalJson();
                productDetailsListener.onProductDetailsResponse(billingResult, originalJson != null ? originalJson.toString() : null);
            }
        }));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            e0.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.queryPurchasesAsync(str, new PurchasesResponseListenerProxy(purchasesResponseListener));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void startConnection(BillingClientStateListener billingClientStateListener) throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge == null) {
            e0.throwUninitializedPropertyAccessException("billingClient");
            billingClientBridge = null;
        }
        billingClientBridge.startConnection(new BillingClientStateListenerProxy(billingClientStateListener));
    }

    public BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge, int i10) {
        e0.checkNotNullParameter(billingClientBuilderBridge, "billingClientBuilderBridge");
        this.billingClientBuilderBridge = billingClientBuilderBridge;
        this.detectedVersion = i10;
    }
}
