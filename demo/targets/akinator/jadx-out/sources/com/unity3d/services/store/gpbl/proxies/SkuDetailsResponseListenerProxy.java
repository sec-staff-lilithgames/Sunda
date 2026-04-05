package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class SkuDetailsResponseListenerProxy extends GenericListenerProxy {
    private static final String onSkuDetailsResponseMethodName = "onSkuDetailsResponse";
    private SkuDetailsResponseListener skuDetailsResponseListener;

    public SkuDetailsResponseListenerProxy(SkuDetailsResponseListener skuDetailsResponseListener) {
        this.skuDetailsResponseListener = skuDetailsResponseListener;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return com.android.billingclient.api.SkuDetailsResponseListener.class;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals(onSkuDetailsResponseMethodName)) {
            return super.invoke(obj, method, objArr);
        }
        onSkuDetailsResponse(objArr[0], (List) objArr[1]);
        return null;
    }

    public void onSkuDetailsResponse(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new SkuDetailsBridge(it.next()));
            }
        } else {
            arrayList = null;
        }
        SkuDetailsResponseListener skuDetailsResponseListener = this.skuDetailsResponseListener;
        if (skuDetailsResponseListener != null) {
            skuDetailsResponseListener.onSkuDetailsUpdated(new BillingResultBridge(obj), arrayList);
        }
    }
}
