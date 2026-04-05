package com.android.billingclient.api;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ConsumeParams {

    /* renamed from: a, reason: collision with root package name */
    public String f12600a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f12601a;

        public ConsumeParams build() {
            String str = this.f12601a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams();
            consumeParams.f12600a = str;
            return consumeParams;
        }

        public Builder setPurchaseToken(String str) {
            this.f12601a = str;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPurchaseToken() {
        return this.f12600a;
    }
}
