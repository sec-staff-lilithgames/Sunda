package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PurchaseHistoryRecord {

    /* renamed from: a, reason: collision with root package name */
    public final String f12663a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12664b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f12665c;

    public PurchaseHistoryRecord(String str, String str2) throws JSONException {
        this.f12663a = str;
        this.f12664b = str2;
        this.f12665c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f12665c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f12663a, purchaseHistoryRecord.getOriginalJson()) && TextUtils.equals(this.f12664b, purchaseHistoryRecord.getSignature());
    }

    public String getDeveloperPayload() {
        return this.f12665c.optString("developerPayload");
    }

    public String getOriginalJson() {
        return this.f12663a;
    }

    public List<String> getProducts() {
        return a();
    }

    public long getPurchaseTime() {
        return this.f12665c.optLong("purchaseTime");
    }

    public String getPurchaseToken() {
        JSONObject jSONObject = this.f12665c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f12665c.optInt("quantity", 1);
    }

    public String getSignature() {
        return this.f12664b;
    }

    @Deprecated
    public ArrayList<String> getSkus() {
        return a();
    }

    public int hashCode() {
        return this.f12663a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f12663a));
    }
}
