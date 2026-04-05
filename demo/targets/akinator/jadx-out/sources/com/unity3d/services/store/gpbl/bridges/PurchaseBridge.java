package com.unity3d.services.store.gpbl.bridges;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class PurchaseBridge extends CommonJsonResponseBridge {
    private static final String getSignatureMethodName = "getSignature";
    private final Object _purchase;

    public PurchaseBridge(Object obj) {
        super(obj, new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.PurchaseBridge.1
            {
                put(PurchaseBridge.getSignatureMethodName, new Class[0]);
            }
        });
        this._purchase = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.Purchase";
    }

    public String getSignature() {
        return (String) callNonVoidMethod(getSignatureMethodName, this._purchase, new Object[0]);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.CommonJsonResponseBridge, com.unity3d.services.store.JsonSerializable
    public JSONObject toJson() throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseData", getOriginalJson());
            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, getSignature());
            return jSONObject;
        } catch (JSONException e10) {
            DeviceLog.warning("Could not build Purchase result Json: ", e10.getMessage());
            return jSONObject;
        }
    }
}
