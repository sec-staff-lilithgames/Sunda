package com.amazon.aps.bidder.adapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsBidderAdapterParam {
    private final String accountId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {
        private String accountId;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public ApsBidderAdapterParam build() {
            return new ApsBidderAdapterParam(this, 0);
        }

        private Builder() {
        }
    }

    public /* synthetic */ ApsBidderAdapterParam(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public String getAccountId() {
        return this.accountId;
    }

    private ApsBidderAdapterParam(Builder builder) {
        this.accountId = builder.accountId;
    }
}
