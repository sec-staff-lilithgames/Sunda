package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BillingClientBridge extends BillingClientBridgeCommon {
    public static final Companion Companion = new Companion(null);
    public static final String QUERY_PRODUCT_DETAILS_ASYNC_METHOD = "queryProductDetailsAsync";
    public static final String QUERY_PURCHASES_ASYNC_METHOD = "queryPurchasesAsync";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final BillingClientBuilderBridge newBuilder(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
            e0.checkNotNullParameter(context, "context");
            return new BillingClientBuilderBridge(BillingClientBridgeCommon.callNonVoidStaticMethod("newBuilder", context));
        }

        private Companion() {
        }
    }

    public BillingClientBridge(Object obj) {
        super(obj, p1.mapOf(tu.e0.to(QUERY_PURCHASES_ASYNC_METHOD, new Class[]{QueryPurchasesParamsBridge.Companion.getClassForParams(), PurchasesResponseListenerProxy.getProxyListenerClass()}), tu.e0.to(QUERY_PRODUCT_DETAILS_ASYNC_METHOD, new Class[]{QueryProductDetailsParamsBridge.Companion.getClassForParams(), ProductDetailsResponseListenerProxy.Companion.getProxyListenerClass()})));
    }

    public static final BillingClientBuilderBridge newBuilder(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return Companion.newBuilder(context);
    }

    public final void queryProductDetailsAsync(QueryProductDetailsParamsBridge queryProductDetailsParamsBridge, ProductDetailsResponseListenerProxy productDetailsResponseListenerProxy) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(queryProductDetailsParamsBridge, "queryProductDetailsParamsBridge");
        e0.checkNotNullParameter(productDetailsResponseListenerProxy, "productDetailsResponseListenerProxy");
        callVoidMethod(QUERY_PRODUCT_DETAILS_ASYNC_METHOD, this._billingClientInternalInstance, queryProductDetailsParamsBridge.getQueryProductDetailsParamsInternalInstance(), productDetailsResponseListenerProxy.getProxyInstance());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchasesAsync(String str, PurchasesResponseListenerProxy purchasesResponseListenerProxy) throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (str != null) {
            QueryProductDetailsParamsBridge queryProductDetailsParamsBridgeBuild = QueryPurchasesParamsBridge.Companion.newBuilder().setProductType(str).build();
            Object obj = this._billingClientInternalInstance;
            Object queryProductDetailsParamsInternalInstance = queryProductDetailsParamsBridgeBuild.getQueryProductDetailsParamsInternalInstance();
            e0.checkNotNull(purchasesResponseListenerProxy);
            callVoidMethod(QUERY_PURCHASES_ASYNC_METHOD, obj, queryProductDetailsParamsInternalInstance, purchasesResponseListenerProxy.getProxyInstance());
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void querySkuDetailsAsync(SkuDetailsParamsBridge params, SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy) throws NoSuchMethodException, ClassNotFoundException {
        e0.checkNotNullParameter(params, "params");
        e0.checkNotNullParameter(skuDetailsResponseListenerProxy, "skuDetailsResponseListenerProxy");
        throw new NoSuchMethodException("querySkuDetailsAsync does not exist in Billing Library v8, use queryProductDetailsAsync instead");
    }
}
