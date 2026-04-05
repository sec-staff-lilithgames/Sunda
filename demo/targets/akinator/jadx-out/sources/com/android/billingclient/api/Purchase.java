package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f12659a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12660b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f12661c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PendingPurchaseUpdate {

        /* renamed from: a, reason: collision with root package name */
        public final JSONObject f12662a;

        public PendingPurchaseUpdate(JSONObject jSONObject) {
            this.f12662a = jSONObject;
        }

        public List<String> getProducts() {
            JSONArray jSONArrayOptJSONArray;
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = this.f12662a;
            if (jSONObject.has("productIds") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds")) != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
            return arrayList;
        }

        public String getPurchaseToken() {
            return this.f12662a.optString("purchaseToken");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(String str, String str2) throws JSONException {
        this.f12659a = str;
        this.f12660b = str2;
        this.f12661c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f12661c;
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
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f12659a, purchase.getOriginalJson()) && TextUtils.equals(this.f12660b, purchase.getSignature());
    }

    public AccountIdentifiers getAccountIdentifiers() {
        JSONObject jSONObject = this.f12661c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new AccountIdentifiers(strOptString, strOptString2);
    }

    public String getDeveloperPayload() {
        return this.f12661c.optString("developerPayload");
    }

    public String getOrderId() {
        String strOptString = this.f12661c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String getOriginalJson() {
        return this.f12659a;
    }

    public String getPackageName() {
        return this.f12661c.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    public PendingPurchaseUpdate getPendingPurchaseUpdate() {
        JSONObject jSONObjectOptJSONObject = this.f12661c.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new PendingPurchaseUpdate(jSONObjectOptJSONObject);
    }

    public List<String> getProducts() {
        return a();
    }

    public int getPurchaseState() {
        return this.f12661c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.f12661c.optLong("purchaseTime");
    }

    public String getPurchaseToken() {
        JSONObject jSONObject = this.f12661c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f12661c.optInt("quantity", 1);
    }

    public String getSignature() {
        return this.f12660b;
    }

    @Deprecated
    public ArrayList<String> getSkus() {
        return a();
    }

    public int hashCode() {
        return this.f12659a.hashCode();
    }

    public boolean isAcknowledged() {
        return this.f12661c.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.f12661c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f12659a));
    }
}
