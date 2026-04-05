package com.android.billingclient.api;

import com.ironsource.C3191e4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j1.o2;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class UserChoiceDetails {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f12688a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12689b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f12690a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12691b;

        /* renamed from: c, reason: collision with root package name */
        public final String f12692c;

        public Product(JSONObject jSONObject) {
            this.f12690a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.f12691b = jSONObject.optString(C3191e4.h.f36495m);
            String strOptString = jSONObject.optString("offerToken");
            this.f12692c = true == strOptString.isEmpty() ? null : strOptString;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.f12690a.equals(product.getId()) && this.f12691b.equals(product.getType()) && Objects.equals(this.f12692c, product.getOfferToken());
        }

        public String getId() {
            return this.f12690a;
        }

        public String getOfferToken() {
            return this.f12692c;
        }

        public String getType() {
            return this.f12691b;
        }

        public int hashCode() {
            return Objects.hash(this.f12690a, this.f12691b, this.f12692c);
        }

        public String toString() {
            return o2.o(b3.h.b("{id: ", this.f12690a, ", type: ", this.f12691b, ", offer token: "), this.f12692c, "}");
        }
    }

    public UserChoiceDetails(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f12688a = jSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject));
                }
            }
        }
        this.f12689b = arrayList;
    }

    public String getExternalTransactionToken() {
        return this.f12688a.optString("externalTransactionToken");
    }

    public String getOriginalExternalTransactionId() {
        String strOptString = this.f12688a.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    public List<Product> getProducts() {
        return this.f12689b;
    }
}
