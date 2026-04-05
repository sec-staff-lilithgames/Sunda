package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes4.dex */
public class SkuDetailsParams {

    /* renamed from: a, reason: collision with root package name */
    public String f12682a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f12683b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f12684a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f12685b;

        public SkuDetailsParams build() {
            String str = this.f12684a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f12685b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            skuDetailsParams.f12682a = str;
            skuDetailsParams.f12683b = this.f12685b;
            return skuDetailsParams;
        }

        public Builder setSkusList(List<String> list) {
            this.f12685b = new ArrayList(list);
            return this;
        }

        public Builder setType(String str) {
            this.f12684a = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSkuType() {
        return this.f12682a;
    }

    public List<String> getSkusList() {
        return this.f12683b;
    }
}
