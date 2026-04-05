package com.sfbx.appconsentv3.model;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class XChangeDataAddress {
    private final String country;
    private final String floor;
    private final String postCode;
    private final String region;
    private final String streetName;
    private final String streetNo;
    private final String streetType;
    private final String town;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private String country;
        private String floor;
        private String postCode;
        private String region;
        private String streetName;
        private String streetNo;
        private String streetType;
        private String town;

        public Builder() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public final XChangeDataAddress build() {
            return new XChangeDataAddress(this.country, this.floor, this.postCode, this.region, this.streetName, this.streetNo, this.streetType, this.town, null);
        }

        public final Builder country(String country) {
            e0.checkNotNullParameter(country, "country");
            this.country = country;
            return this;
        }

        public final Builder floor(String floor) {
            e0.checkNotNullParameter(floor, "floor");
            this.floor = floor;
            return this;
        }

        public final Builder postCode(String postCode) {
            e0.checkNotNullParameter(postCode, "postCode");
            this.postCode = postCode;
            return this;
        }

        public final Builder region(String region) {
            e0.checkNotNullParameter(region, "region");
            this.region = region;
            return this;
        }

        public final Builder streetName(String streetName) {
            e0.checkNotNullParameter(streetName, "streetName");
            this.streetName = streetName;
            return this;
        }

        public final Builder streetNo(String streetNo) {
            e0.checkNotNullParameter(streetNo, "streetNo");
            this.streetNo = streetNo;
            return this;
        }

        public final Builder streetType(String streetType) {
            e0.checkNotNullParameter(streetType, "streetType");
            this.streetType = streetType;
            return this;
        }

        public final Builder town(String town) {
            e0.checkNotNullParameter(town, "town");
            this.town = town;
            return this;
        }

        public Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.country = str;
            this.floor = str2;
            this.postCode = str3;
            this.region = str4;
            this.streetName = str5;
            this.streetNo = str6;
            this.streetType = str7;
            this.town = str8;
        }

        public /* synthetic */ Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8);
        }
    }

    public /* synthetic */ XChangeDataAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, u uVar) {
        this(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getFloor() {
        return this.floor;
    }

    public final String getPostCode() {
        return this.postCode;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getStreetName() {
        return this.streetName;
    }

    public final String getStreetNo() {
        return this.streetNo;
    }

    public final String getStreetType() {
        return this.streetType;
    }

    public final String getTown() {
        return this.town;
    }

    private XChangeDataAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.country = str;
        this.floor = str2;
        this.postCode = str3;
        this.region = str4;
        this.streetName = str5;
        this.streetNo = str6;
        this.streetType = str7;
        this.town = str8;
    }
}
