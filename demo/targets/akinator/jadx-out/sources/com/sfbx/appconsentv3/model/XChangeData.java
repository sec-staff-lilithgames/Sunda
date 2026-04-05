package com.sfbx.appconsentv3.model;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class XChangeData {
    private final XChangeDataAddress address;
    private final String email;
    private final String externalId;
    private final String phone;
    private final Long timestampCollect;
    private final String unstructuredData;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private XChangeDataAddress address;
        private String email;
        private String externalId;
        private String phone;
        private Long timestampCollect;
        private String unstructuredData;

        public Builder() {
            this(null, null, null, null, null, null, 63, null);
        }

        public final Builder address(XChangeDataAddress xChangeDataAddress) {
            e0.checkNotNullParameter(xChangeDataAddress, "xChangeDataAddress");
            this.address = xChangeDataAddress;
            return this;
        }

        public final XChangeData build() {
            return new XChangeData(this.email, this.externalId, this.phone, this.address, this.timestampCollect, this.unstructuredData, null);
        }

        public final Builder email(String email) {
            e0.checkNotNullParameter(email, "email");
            this.email = email;
            return this;
        }

        public final Builder externalId(String externalId) {
            e0.checkNotNullParameter(externalId, "externalId");
            this.externalId = externalId;
            return this;
        }

        public final Builder phoneNumber(String phoneNumber) {
            e0.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.phone = phoneNumber;
            return this;
        }

        public final Builder unstructuredData(String unstructuredData) {
            e0.checkNotNullParameter(unstructuredData, "unstructuredData");
            this.unstructuredData = unstructuredData;
            return this;
        }

        public Builder(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l9, String str4) {
            this.email = str;
            this.externalId = str2;
            this.phone = str3;
            this.address = xChangeDataAddress;
            this.timestampCollect = l9;
            this.unstructuredData = str4;
        }

        public /* synthetic */ Builder(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l9, String str4, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : xChangeDataAddress, (i10 & 16) != 0 ? null : l9, (i10 & 32) != 0 ? null : str4);
        }
    }

    public /* synthetic */ XChangeData(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l9, String str4, u uVar) {
        this(str, str2, str3, xChangeDataAddress, l9, str4);
    }

    public final XChangeDataAddress getAddress() {
        return this.address;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final Long getTimestampCollect() {
        return this.timestampCollect;
    }

    public final String getUnstructuredData() {
        return this.unstructuredData;
    }

    private XChangeData(String str, String str2, String str3, XChangeDataAddress xChangeDataAddress, Long l9, String str4) {
        this.email = str;
        this.externalId = str2;
        this.phone = str3;
        this.address = xChangeDataAddress;
        this.timestampCollect = l9;
        this.unstructuredData = str4;
    }
}
