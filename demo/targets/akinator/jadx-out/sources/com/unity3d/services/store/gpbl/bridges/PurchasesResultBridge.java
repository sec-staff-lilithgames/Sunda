package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class PurchasesResultBridge extends GenericBridge {
    private static final String getBillingResultMethodName = "getBillingResult";
    private static final String getPurchasesListMethodName = "getPurchasesList";
    private final Object _purchasesResult;

    public PurchasesResultBridge(Object obj) {
        super(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.PurchasesResultBridge.1
            {
                put(PurchasesResultBridge.getBillingResultMethodName, new Class[0]);
                put(PurchasesResultBridge.getPurchasesListMethodName, new Class[0]);
            }
        });
        this._purchasesResult = obj;
    }

    public BillingResultBridge getBillingResult() {
        return new BillingResultBridge(callNonVoidMethod(getBillingResultMethodName, this._purchasesResult, new Object[0]));
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.Purchase$PurchasesResult";
    }

    public List<PurchaseBridge> getPurchasesList() {
        List list = (List) callNonVoidMethod(getPurchasesListMethodName, this._purchasesResult, new Object[0]);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new PurchaseBridge(it.next()));
            }
        }
        return arrayList;
    }
}
