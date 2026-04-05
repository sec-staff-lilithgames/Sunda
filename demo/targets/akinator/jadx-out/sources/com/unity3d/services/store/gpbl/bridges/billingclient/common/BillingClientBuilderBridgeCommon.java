package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class BillingClientBuilderBridgeCommon extends GenericBridge implements IBillingClientBuilderBridge {
    protected static final String buildMethodName = "build";
    private static final String setListenerMethodName = "setListener";
    protected Object _billingClientBuilderInternalInstance;

    public BillingClientBuilderBridgeCommon(Object obj, Map<String, Class<?>[]> map) throws ClassNotFoundException {
        super(appendFunctionAnParameters(map));
        this._billingClientBuilderInternalInstance = obj;
    }

    private static Map<String, Class<?>[]> appendFunctionAnParameters(Map<String, Class<?>[]> map) throws ClassNotFoundException {
        map.putAll(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.1
            {
                put(BillingClientBuilderBridgeCommon.setListenerMethodName, new Class[]{PurchaseUpdatedListenerProxy.getProxyListenerClass()});
                put(BillingClientBuilderBridgeCommon.buildMethodName, new Class[0]);
            }
        });
        return map;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.BillingClient$Builder";
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public IBillingClientBuilderBridge setListener(PurchaseUpdatedListenerProxy purchaseUpdatedListenerProxy) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        this._billingClientBuilderInternalInstance = callNonVoidMethod(setListenerMethodName, this._billingClientBuilderInternalInstance, purchaseUpdatedListenerProxy.getProxyInstance());
        return this;
    }
}
