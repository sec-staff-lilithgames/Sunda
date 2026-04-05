package com.android.billingclient.api;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class AcknowledgePurchaseParams {

    /* renamed from: a, reason: collision with root package name */
    public String f12562a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f12563a;

        public AcknowledgePurchaseParams build() {
            String str = this.f12563a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams();
            acknowledgePurchaseParams.f12562a = str;
            return acknowledgePurchaseParams;
        }

        public Builder setPurchaseToken(String str) {
            this.f12563a = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPurchaseToken() {
        return this.f12562a;
    }
}
