package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class BillingClientBridgeCommon extends GenericBridge implements IBillingClient {
    protected static final String endConnectionMethodName = "endConnection";
    protected static final String isFeatureSupportedMethodName = "isFeatureSupported";
    protected static final String isReadyMethodName = "isReady";
    protected static final String newBuilderMethodName = "newBuilder";
    protected static final String queryPurchaseHistoryAsyncMethodName = "queryPurchaseHistoryAsync";
    protected static final String startConnectionMethodName = "startConnection";
    private static final Map<String, Class<?>[]> staticMethods = new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.1
        {
            put("newBuilder", new Class[]{Context.class});
        }
    };
    protected final Object _billingClientInternalInstance;

    public BillingClientBridgeCommon(Object obj, Map<String, Class<?>[]> map) throws ClassNotFoundException {
        super(appendFunctionAnParameters(map));
        this._billingClientInternalInstance = obj;
    }

    private static Map<String, Class<?>[]> appendFunctionAnParameters(Map<String, Class<?>[]> map) throws ClassNotFoundException {
        map.putAll(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon.2
            {
                put("newBuilder", new Class[]{Context.class});
                put(BillingClientBridgeCommon.startConnectionMethodName, new Class[]{BillingClientStateListenerProxy.getProxyListenerClass()});
                put(BillingClientBridgeCommon.endConnectionMethodName, new Class[0]);
                put(BillingClientBridgeCommon.queryPurchaseHistoryAsyncMethodName, new Class[]{String.class, PurchaseHistoryResponseListenerProxy.getProxyListenerClass()});
                put(BillingClientBridgeCommon.isFeatureSupportedMethodName, new Class[]{String.class});
                put(BillingClientBridgeCommon.isReadyMethodName, new Class[0]);
            }
        });
        return map;
    }

    public static Object callNonVoidStaticMethod(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return getClassForBridge().getMethod(str, staticMethods.get(str)).invoke(null, objArr);
    }

    public static Class<?> getClassForBridge() throws ClassNotFoundException {
        return BillingClient.class;
    }

    public void endConnection() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        callVoidMethod(endConnectionMethodName, this._billingClientInternalInstance, new Object[0]);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.BillingClient";
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public BillingResultResponseCode isFeatureSupported(String str) {
        return new BillingResultBridge(callNonVoidMethod(isFeatureSupportedMethodName, this._billingClientInternalInstance, str)).getResponseCode();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public boolean isReady() {
        return ((Boolean) callNonVoidMethod(isReadyMethodName, this._billingClientInternalInstance, new Object[0])).booleanValue();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListenerProxy purchaseHistoryResponseListenerProxy) throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        callVoidMethod(queryPurchaseHistoryAsyncMethodName, this._billingClientInternalInstance, str, purchaseHistoryResponseListenerProxy.getProxyInstance());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void startConnection(BillingClientStateListenerProxy billingClientStateListenerProxy) throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        callVoidMethod(startConnectionMethodName, this._billingClientInternalInstance, billingClientStateListenerProxy.getProxyInstance());
    }
}
