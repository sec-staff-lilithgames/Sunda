package com.android.billingclient.api;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class BillingResult {

    /* renamed from: a, reason: collision with root package name */
    public int f12596a;

    /* renamed from: b, reason: collision with root package name */
    public String f12597b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f12598a;

        /* renamed from: b, reason: collision with root package name */
        public String f12599b;

        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.f12596a = this.f12598a;
            billingResult.f12597b = this.f12599b;
            return billingResult;
        }

        public Builder setDebugMessage(String str) {
            this.f12599b = str;
            return this;
        }

        public Builder setResponseCode(int i10) {
            this.f12598a = i10;
            return this;
        }
    }

    public static Builder newBuilder() {
        Builder builder = new Builder();
        builder.f12599b = "";
        return builder;
    }

    public String getDebugMessage() {
        return this.f12597b;
    }

    public int getResponseCode() {
        return this.f12596a;
    }

    public String toString() {
        return a.b.m("Response Code: ", com.google.android.gms.internal.play_billing.zze.zzi(this.f12596a), ", Debug Message: ", this.f12597b);
    }
}
