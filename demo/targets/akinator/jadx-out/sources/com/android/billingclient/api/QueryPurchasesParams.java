package com.android.billingclient.api;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class QueryPurchasesParams {

    /* renamed from: a, reason: collision with root package name */
    public final String f12678a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f12679a;

        public QueryPurchasesParams build() {
            if (this.f12679a != null) {
                return new QueryPurchasesParams(this);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.f12679a = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder) {
        this.f12678a = builder.f12679a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final String zza() {
        return this.f12678a;
    }
}
