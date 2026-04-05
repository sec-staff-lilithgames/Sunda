package com.android.billingclient.api;

import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class QueryProductDetailsParams {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.zzco f12670a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public com.google.android.gms.internal.play_billing.zzco f12671a;

        public QueryProductDetailsParams build() {
            if (this.f12671a != null) {
                return new QueryProductDetailsParams(this);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public Builder setProductList(List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f12671a = com.google.android.gms.internal.play_billing.zzco.zzk(list);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f12672a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12673b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class Builder {

            /* renamed from: a, reason: collision with root package name */
            public String f12674a;

            /* renamed from: b, reason: collision with root package name */
            public String f12675b;

            public Product build() {
                if ("first_party".equals(this.f12675b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f12674a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f12675b != null) {
                    return new Product(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public Builder setProductId(String str) {
                this.f12674a = str;
                return this;
            }

            public Builder setProductType(String str) {
                this.f12675b = str;
                return this;
            }
        }

        public /* synthetic */ Product(Builder builder) {
            this.f12672a = builder.f12674a;
            this.f12673b = builder.f12675b;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public final String zza() {
            return this.f12672a;
        }

        public final String zzb() {
            return this.f12673b;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder) {
        this.f12670a = builder.f12671a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final com.google.android.gms.internal.play_billing.zzco zza() {
        return this.f12670a;
    }

    public final String zzb() {
        return ((Product) this.f12670a.get(0)).zzb();
    }
}
