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
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ProductDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f12616a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f12617b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12618c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12619d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12620e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12621f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12622g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12623h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12624i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f12625j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f12626k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class InstallmentPlanDetails {

        /* renamed from: a, reason: collision with root package name */
        public final int f12627a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12628b;

        public InstallmentPlanDetails(JSONObject jSONObject) {
            this.f12627a = jSONObject.getInt("commitmentPaymentsCount");
            this.f12628b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.f12627a;
        }

        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.f12628b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OneTimePurchaseOfferDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f12629a;

        /* renamed from: b, reason: collision with root package name */
        public final long f12630b;

        /* renamed from: c, reason: collision with root package name */
        public final String f12631c;

        /* renamed from: d, reason: collision with root package name */
        public final String f12632d;

        /* renamed from: e, reason: collision with root package name */
        public final String f12633e;

        /* renamed from: f, reason: collision with root package name */
        public final zzcs f12634f;

        public OneTimePurchaseOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f12629a = jSONObject.optString("formattedPrice");
            this.f12630b = jSONObject.optLong("priceAmountMicros");
            this.f12631c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            zzcs zzcsVar = null;
            this.f12632d = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            com.google.android.gms.internal.play_billing.zzco.zzk(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getLong("startTimeMillis");
                jSONObjectOptJSONObject2.getLong("endTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.getInt("maximumQuantity");
                jSONObjectOptJSONObject3.getInt("remainingQuantity");
            }
            this.f12633e = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getString("rentalPeriod");
                jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            if (jSONObjectOptJSONObject6 != null) {
                zzcsVar = new zzcs();
                jSONObjectOptJSONObject6.getString("type");
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("balanceThresholds");
                ArrayList arrayList2 = new ArrayList();
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                        arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.getInt(i11)));
                    }
                }
                new PricingPhases(jSONObjectOptJSONObject6.getJSONArray("pricingPhases"));
            }
            this.f12634f = zzcsVar;
        }

        public String getFormattedPrice() {
            return this.f12629a;
        }

        public long getPriceAmountMicros() {
            return this.f12630b;
        }

        public String getPriceCurrencyCode() {
            return this.f12631c;
        }

        public final zzcs zza() {
            return this.f12634f;
        }

        public final String zzb() {
            return this.f12632d;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PricingPhase {

        /* renamed from: a, reason: collision with root package name */
        public final String f12635a;

        /* renamed from: b, reason: collision with root package name */
        public final long f12636b;

        /* renamed from: c, reason: collision with root package name */
        public final String f12637c;

        /* renamed from: d, reason: collision with root package name */
        public final String f12638d;

        /* renamed from: e, reason: collision with root package name */
        public final int f12639e;

        /* renamed from: f, reason: collision with root package name */
        public final int f12640f;

        public PricingPhase(JSONObject jSONObject) {
            this.f12638d = jSONObject.optString("billingPeriod");
            this.f12637c = jSONObject.optString("priceCurrencyCode");
            this.f12635a = jSONObject.optString("formattedPrice");
            this.f12636b = jSONObject.optLong("priceAmountMicros");
            this.f12640f = jSONObject.optInt("recurrenceMode");
            this.f12639e = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.f12639e;
        }

        public String getBillingPeriod() {
            return this.f12638d;
        }

        public String getFormattedPrice() {
            return this.f12635a;
        }

        public long getPriceAmountMicros() {
            return this.f12636b;
        }

        public String getPriceCurrencyCode() {
            return this.f12637c;
        }

        public int getRecurrenceMode() {
            return this.f12640f;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class PricingPhases {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12641a;

        public PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new PricingPhase(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f12641a = arrayList;
        }

        public List<PricingPhase> getPricingPhaseList() {
            return this.f12641a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SubscriptionOfferDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f12642a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12643b;

        /* renamed from: c, reason: collision with root package name */
        public final String f12644c;

        /* renamed from: d, reason: collision with root package name */
        public final PricingPhases f12645d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f12646e;

        /* renamed from: f, reason: collision with root package name */
        public final InstallmentPlanDetails f12647f;

        public SubscriptionOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f12642a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f12643b = true == strOptString.isEmpty() ? null : strOptString;
            this.f12644c = jSONObject.getString("offerIdToken");
            this.f12645d = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f12647f = jSONObjectOptJSONObject != null ? new InstallmentPlanDetails(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new PricingPhase(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f12646e = arrayList;
        }

        public String getBasePlanId() {
            return this.f12642a;
        }

        public InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.f12647f;
        }

        public String getOfferId() {
            return this.f12643b;
        }

        public List<String> getOfferTags() {
            return this.f12646e;
        }

        public String getOfferToken() {
            return this.f12644c;
        }

        public PricingPhases getPricingPhases() {
            return this.f12645d;
        }
    }

    public ProductDetails(String str) {
        this.f12616a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f12617b = jSONObject;
        String strOptString = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f12618c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f12619d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f12620e = jSONObject.optString("title");
        this.f12621f = jSONObject.optString("name");
        this.f12622g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f12623h = jSONObject.optString("skuDetailsToken");
        this.f12624i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new SubscriptionOfferDetails(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f12625j = arrayList;
        } else {
            this.f12625j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f12617b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f12617b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f12626k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f12626k = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(jSONObjectOptJSONObject));
            this.f12626k = arrayList2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.f12616a, ((ProductDetails) obj).f12616a);
        }
        return false;
    }

    public String getDescription() {
        return this.f12622g;
    }

    public String getName() {
        return this.f12621f;
    }

    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        ArrayList arrayList = this.f12626k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) arrayList.get(0);
    }

    public String getProductId() {
        return this.f12618c;
    }

    public String getProductType() {
        return this.f12619d;
    }

    public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.f12625j;
    }

    public String getTitle() {
        return this.f12620e;
    }

    public int hashCode() {
        return this.f12616a.hashCode();
    }

    public String toString() {
        String string = this.f12617b.toString();
        String strValueOf = String.valueOf(this.f12625j);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        com.google.android.gms.internal.play_billing.a.B(sb2, this.f12616a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f12618c);
        sb2.append("', productType='");
        sb2.append(this.f12619d);
        sb2.append("', title='");
        sb2.append(this.f12620e);
        sb2.append("', productDetailsToken='");
        return o2.r(sb2, this.f12623h, "', subscriptionOfferDetails=", strValueOf, "}");
    }

    public final String zza() {
        return this.f12617b.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    public String zzc() {
        return this.f12624i;
    }
}
