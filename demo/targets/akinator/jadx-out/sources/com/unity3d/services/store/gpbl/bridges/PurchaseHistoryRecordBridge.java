package com.unity3d.services.store.gpbl.bridges;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class PurchaseHistoryRecordBridge extends CommonJsonResponseBridge {
    public PurchaseHistoryRecordBridge(Object obj) {
        super(obj);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.PurchaseHistoryRecord";
    }
}
