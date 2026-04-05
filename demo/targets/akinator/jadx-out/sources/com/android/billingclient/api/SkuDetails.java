package com.android.billingclient.api;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes4.dex */
public class SkuDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f12680a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f12681b;

    public SkuDetails(String str) throws JSONException {
        this.f12680a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f12681b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f12680a, ((SkuDetails) obj).f12680a);
        }
        return false;
    }

    public String getDescription() {
        return this.f12681b.optString("description");
    }

    public String getFreeTrialPeriod() {
        return this.f12681b.optString("freeTrialPeriod");
    }

    public String getIconUrl() {
        return this.f12681b.optString("iconUrl");
    }

    public String getIntroductoryPrice() {
        return this.f12681b.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.f12681b.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.f12681b.optInt("introductoryPriceCycles");
    }

    public String getIntroductoryPricePeriod() {
        return this.f12681b.optString("introductoryPricePeriod");
    }

    public String getOriginalJson() {
        return this.f12680a;
    }

    public String getOriginalPrice() {
        JSONObject jSONObject = this.f12681b;
        return jSONObject.has("original_price") ? jSONObject.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        JSONObject jSONObject = this.f12681b;
        return jSONObject.has("original_price_micros") ? jSONObject.optLong("original_price_micros") : getPriceAmountMicros();
    }

    public String getPrice() {
        return this.f12681b.optString("price");
    }

    public long getPriceAmountMicros() {
        return this.f12681b.optLong("price_amount_micros");
    }

    public String getPriceCurrencyCode() {
        return this.f12681b.optString("price_currency_code");
    }

    public String getSku() {
        return this.f12681b.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
    }

    public String getSubscriptionPeriod() {
        return this.f12681b.optString("subscriptionPeriod");
    }

    public String getTitle() {
        return this.f12681b.optString("title");
    }

    public String getType() {
        return this.f12681b.optString("type");
    }

    public int hashCode() {
        return this.f12680a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f12680a));
    }

    public int zza() {
        return this.f12681b.optInt(CampaignEx.JSON_KEY_OFFER_TYPE);
    }

    public String zzb() {
        return this.f12681b.optString("offer_id");
    }

    public String zzc() {
        JSONObject jSONObject = this.f12681b;
        String strOptString = jSONObject.optString("offerIdToken");
        return strOptString.isEmpty() ? jSONObject.optString("offer_id_token") : strOptString;
    }

    public final String zzd() {
        return this.f12681b.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    public String zze() {
        return this.f12681b.optString("serializedDocid");
    }
}
