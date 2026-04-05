package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class PurchaseHistoryResponseListenerProxy extends GenericListenerProxy {
    private static final String onPurchaseHistoryResponseMethodName = "onPurchaseHistoryResponse";
    private int _maxPurchases;
    private PurchaseHistoryResponseListener purchaseHistoryResponseListener;

    public PurchaseHistoryResponseListenerProxy(PurchaseHistoryResponseListener purchaseHistoryResponseListener, int i10) {
        this.purchaseHistoryResponseListener = purchaseHistoryResponseListener;
        this._maxPurchases = i10;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return com.android.billingclient.api.PurchaseHistoryResponseListener.class;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals(onPurchaseHistoryResponseMethodName)) {
            return super.invoke(obj, method, objArr);
        }
        onPurchaseHistoryResponse(objArr[0], (List) objArr[1]);
        return null;
    }

    public void onPurchaseHistoryResponse(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (int i10 = 0; i10 < this._maxPurchases && i10 < list.size(); i10++) {
                arrayList.add(new PurchaseHistoryRecordBridge(list.get(i10)));
            }
        } else {
            arrayList = null;
        }
        PurchaseHistoryResponseListener purchaseHistoryResponseListener = this.purchaseHistoryResponseListener;
        if (purchaseHistoryResponseListener != null) {
            purchaseHistoryResponseListener.onPurchaseHistoryUpdated(new BillingResultBridge(obj), arrayList);
        }
    }
}
