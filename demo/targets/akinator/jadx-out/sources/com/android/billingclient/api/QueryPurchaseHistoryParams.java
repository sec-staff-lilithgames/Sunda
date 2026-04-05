package com.android.billingclient.api;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class QueryPurchaseHistoryParams {

    /* renamed from: a, reason: collision with root package name */
    public final String f12676a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f12677a;

        public QueryPurchaseHistoryParams build() {
            if (this.f12677a != null) {
                return new QueryPurchaseHistoryParams(this);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.f12677a = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchaseHistoryParams(Builder builder) {
        this.f12676a = builder.f12677a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final String zza() {
        return this.f12676a;
    }
}
