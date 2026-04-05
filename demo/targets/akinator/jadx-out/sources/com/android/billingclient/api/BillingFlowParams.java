package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.internal.play_billing.zzbe;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class BillingFlowParams {
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";

    /* renamed from: a, reason: collision with root package name */
    public boolean f12572a;

    /* renamed from: b, reason: collision with root package name */
    public String f12573b;

    /* renamed from: c, reason: collision with root package name */
    public String f12574c;

    /* renamed from: d, reason: collision with root package name */
    public SubscriptionUpdateParams f12575d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.gms.internal.play_billing.zzco f12576e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f12577f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12578g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f12579a;

        /* renamed from: b, reason: collision with root package name */
        public String f12580b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f12581c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f12582d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f12583e;

        /* renamed from: f, reason: collision with root package name */
        public SubscriptionUpdateParams.Builder f12584f;

        public BillingFlowParams build() {
            ArrayList arrayList = this.f12582d;
            boolean z10 = true;
            boolean z11 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList arrayList2 = this.f12581c;
            boolean z12 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            if (!z11 && !z12) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z11 && z12) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (!z11) {
                this.f12581c.forEach(new Consumer() { // from class: com.android.billingclient.api.zzce
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        if (((BillingFlowParams.ProductDetailsParams) obj) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                });
            } else {
                if (this.f12582d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f12582d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f12582d.get(0);
                    String type = skuDetails.getType();
                    ArrayList arrayList3 = this.f12582d;
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i10);
                        if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strZzd = skuDetails.zzd();
                    ArrayList arrayList4 = this.f12582d;
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i11);
                        if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !strZzd.equals(skuDetails3.zzd())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams();
            if ((!z11 || ((SkuDetails) this.f12582d.get(0)).zzd().isEmpty()) && (!z12 || ((ProductDetailsParams) this.f12581c.get(0)).zza().zza().isEmpty())) {
                z10 = false;
            }
            billingFlowParams.f12572a = z10;
            billingFlowParams.f12573b = this.f12579a;
            billingFlowParams.f12574c = this.f12580b;
            billingFlowParams.f12575d = this.f12584f.build();
            ArrayList arrayList5 = this.f12582d;
            billingFlowParams.f12577f = arrayList5 != null ? new ArrayList(arrayList5) : new ArrayList();
            billingFlowParams.f12578g = this.f12583e;
            ArrayList arrayList6 = this.f12581c;
            billingFlowParams.f12576e = arrayList6 != null ? com.google.android.gms.internal.play_billing.zzco.zzk(arrayList6) : com.google.android.gms.internal.play_billing.zzco.zzl();
            return billingFlowParams;
        }

        public Builder setIsOfferPersonalized(boolean z10) {
            this.f12583e = z10;
            return this;
        }

        public Builder setObfuscatedAccountId(String str) {
            this.f12579a = str;
            return this;
        }

        public Builder setObfuscatedProfileId(String str) {
            this.f12580b = str;
            return this;
        }

        public Builder setProductDetailsParamsList(List<ProductDetailsParams> list) {
            this.f12581c = new ArrayList(list);
            return this;
        }

        @Deprecated
        public Builder setSkuDetails(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f12582d = arrayList;
            return this;
        }

        public Builder setSubscriptionUpdateParams(SubscriptionUpdateParams subscriptionUpdateParams) {
            SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
            builderNewBuilder.zzb(subscriptionUpdateParams.f12589a);
            builderNewBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.f12591c);
            builderNewBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.f12590b);
            this.f12584f = builderNewBuilder;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ProductDetailsParams {

        /* renamed from: a, reason: collision with root package name */
        public final ProductDetails f12585a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12586b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            public ProductDetails f12587a;

            /* renamed from: b, reason: collision with root package name */
            public String f12588b;

            public ProductDetailsParams build() {
                zzbe.zzc(this.f12587a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f12587a.getSubscriptionOfferDetails() != null) {
                    zzbe.zzc(this.f12588b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new ProductDetailsParams(this);
            }

            public Builder setOfferToken(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f12588b = str;
                return this;
            }

            public Builder setProductDetails(ProductDetails productDetails) {
                this.f12587a = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.zzb() != null) {
                        this.f12588b = oneTimePurchaseOfferDetails.zzb();
                    }
                }
                return this;
            }
        }

        public /* synthetic */ ProductDetailsParams(Builder builder) {
            this.f12585a = builder.f12587a;
            this.f12586b = builder.f12588b;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public final ProductDetails zza() {
            return this.f12585a;
        }

        public final String zzb() {
            return this.f12586b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SubscriptionUpdateParams {

        /* renamed from: a, reason: collision with root package name */
        public String f12589a;

        /* renamed from: b, reason: collision with root package name */
        public String f12590b;

        /* renamed from: c, reason: collision with root package name */
        public int f12591c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            public String f12592a;

            /* renamed from: b, reason: collision with root package name */
            public String f12593b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f12594c;

            /* renamed from: d, reason: collision with root package name */
            public int f12595d;

            public SubscriptionUpdateParams build() {
                boolean z10 = true;
                if (TextUtils.isEmpty(this.f12592a) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f12593b);
                if (z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f12594c && !z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams();
                subscriptionUpdateParams.f12589a = this.f12592a;
                subscriptionUpdateParams.f12591c = this.f12595d;
                subscriptionUpdateParams.f12590b = this.f12593b;
                return subscriptionUpdateParams;
            }

            public Builder setOldPurchaseToken(String str) {
                this.f12592a = str;
                return this;
            }

            public Builder setOriginalExternalTransactionId(String str) {
                this.f12593b = str;
                return this;
            }

            public Builder setSubscriptionReplacementMode(int i10) {
                this.f12595d = i10;
                return this;
            }

            @Deprecated
            public final Builder zzb(String str) {
                this.f12592a = str;
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @Retention(RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        public static Builder newBuilder() {
            Builder builder = new Builder();
            builder.f12595d = 0;
            return builder;
        }
    }

    public static Builder newBuilder() {
        Builder builder = new Builder();
        SubscriptionUpdateParams.Builder builderNewBuilder = SubscriptionUpdateParams.newBuilder();
        builderNewBuilder.f12594c = true;
        builder.f12584f = builderNewBuilder;
        return builder;
    }

    public final int zza() {
        return this.f12575d.f12591c;
    }

    public final String zzc() {
        return this.f12573b;
    }

    public final String zzd() {
        return this.f12574c;
    }

    public final String zze() {
        return this.f12575d.f12589a;
    }

    public final String zzf() {
        return this.f12575d.f12590b;
    }

    public final ArrayList zzg() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f12577f);
        return arrayList;
    }

    public final List zzh() {
        return this.f12576e;
    }

    public final boolean zzp() {
        return this.f12578g;
    }
}
