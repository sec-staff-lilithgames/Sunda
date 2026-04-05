package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.PendingPurchasesParams;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class BillingClient {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public volatile PendingPurchasesParams f12565a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f12566b;

        /* renamed from: c, reason: collision with root package name */
        public volatile PurchasesUpdatedListener f12567c;

        /* renamed from: d, reason: collision with root package name */
        public volatile UserChoiceBillingListener f12568d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f12569e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f12570f;

        public /* synthetic */ Builder(Context context) {
            this.f12566b = context;
        }

        public final boolean a() {
            Context context = this.f12566b;
            try {
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }

        public BillingClient build() {
            if (this.f12566b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f12567c == null) {
                if (this.f12568d != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (!this.f12569e && !this.f12570f) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                Context context = this.f12566b;
                return a() ? new r(context) : new a(context);
            }
            if (this.f12565a == null) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            this.f12565a.getClass();
            if (this.f12567c == null) {
                PendingPurchasesParams pendingPurchasesParams = this.f12565a;
                Context context2 = this.f12566b;
                return a() ? new r(pendingPurchasesParams, context2) : new a(pendingPurchasesParams, context2);
            }
            if (this.f12568d == null) {
                PendingPurchasesParams pendingPurchasesParams2 = this.f12565a;
                Context context3 = this.f12566b;
                PurchasesUpdatedListener purchasesUpdatedListener = this.f12567c;
                return a() ? new r(pendingPurchasesParams2, context3, purchasesUpdatedListener) : new a(pendingPurchasesParams2, context3, purchasesUpdatedListener);
            }
            PendingPurchasesParams pendingPurchasesParams3 = this.f12565a;
            Context context4 = this.f12566b;
            PurchasesUpdatedListener purchasesUpdatedListener2 = this.f12567c;
            UserChoiceBillingListener userChoiceBillingListener = this.f12568d;
            return a() ? new r(pendingPurchasesParams3, context4, purchasesUpdatedListener2, userChoiceBillingListener) : new a(pendingPurchasesParams3, context4, purchasesUpdatedListener2, userChoiceBillingListener);
        }

        public Builder enableAlternativeBillingOnly() {
            this.f12569e = true;
            return this;
        }

        public Builder enableExternalOffer() {
            this.f12570f = true;
            return this;
        }

        public Builder enablePendingPurchases(PendingPurchasesParams pendingPurchasesParams) {
            this.f12565a = pendingPurchasesParams;
            return this;
        }

        public Builder enableUserChoiceBilling(UserChoiceBillingListener userChoiceBillingListener) {
            this.f12568d = userChoiceBillingListener;
            return this;
        }

        public Builder setListener(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.f12567c = purchasesUpdatedListener;
            return this;
        }

        @Deprecated
        public Builder enablePendingPurchases() {
            PendingPurchasesParams.Builder builderNewBuilder = PendingPurchasesParams.newBuilder();
            builderNewBuilder.enableOneTimeProducts();
            enablePendingPurchases(builderNewBuilder.build());
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {
        public static final String ALTERNATIVE_BILLING_ONLY = "jjj";
        public static final String BILLING_CONFIG = "ggg";
        public static final String EXTERNAL_OFFER = "kkk";
        public static final String IN_APP_MESSAGING = "bbb";
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";
        public static final String PRODUCT_DETAILS = "fff";
        public static final String SUBSCRIPTIONS = "subscriptions";
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface SkuType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context);
    }

    public abstract void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener);

    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    public abstract void createExternalOfferReportingDetailsAsync(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    public abstract void endConnection();

    public abstract void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, BillingConfigResponseListener billingConfigResponseListener);

    public abstract int getConnectionState();

    public abstract void isAlternativeBillingOnlyAvailableAsync(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    public abstract void isExternalOfferAvailableAsync(ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    public abstract BillingResult isFeatureSupported(String str);

    public abstract boolean isReady();

    public abstract BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams);

    public abstract void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener);

    @Deprecated
    public abstract void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    @Deprecated
    public abstract void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener);

    public abstract void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener);

    @Deprecated
    public abstract void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener);

    public abstract BillingResult showAlternativeBillingOnlyInformationDialog(Activity activity, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    public abstract BillingResult showExternalOfferInformationDialog(Activity activity, ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    public abstract BillingResult showInAppMessages(Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);
}
