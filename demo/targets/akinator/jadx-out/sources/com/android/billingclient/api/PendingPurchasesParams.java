package com.android.billingclient.api;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class PendingPurchasesParams {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12613a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f12614a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12615b;

        public PendingPurchasesParams build() {
            if (this.f12614a) {
                return new PendingPurchasesParams(this.f12615b);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        public Builder enableOneTimeProducts() {
            this.f12614a = true;
            return this;
        }

        public Builder enablePrepaidPlans() {
            this.f12615b = true;
            return this;
        }
    }

    public PendingPurchasesParams(boolean z10) {
        this.f12613a = z10;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
