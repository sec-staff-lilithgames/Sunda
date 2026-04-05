package com.sfbx.appconsentv3.ui.model;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HelloReplyCore {
    private final String cmpHash;
    private final Integer cmpHashVersion;
    private final ConfigurationCore configuration;
    private final ConsentCore consent;
    private final CountryCore country;
    private final ErrorResponseCore error;
    private final FloatingConsentCore floatingConsent;
    private final String floatingExtraId;
    private final Integer floatingExtraVersion;
    private final String uuid;
    private final VendorListCore vendorList;

    public HelloReplyCore() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ HelloReplyCore copy$default(HelloReplyCore helloReplyCore, ErrorResponseCore errorResponseCore, String str, ConfigurationCore configurationCore, ConsentCore consentCore, VendorListCore vendorListCore, Integer num, String str2, String str3, Integer num2, FloatingConsentCore floatingConsentCore, CountryCore countryCore, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            errorResponseCore = helloReplyCore.error;
        }
        if ((i10 & 2) != 0) {
            str = helloReplyCore.uuid;
        }
        if ((i10 & 4) != 0) {
            configurationCore = helloReplyCore.configuration;
        }
        if ((i10 & 8) != 0) {
            consentCore = helloReplyCore.consent;
        }
        if ((i10 & 16) != 0) {
            vendorListCore = helloReplyCore.vendorList;
        }
        if ((i10 & 32) != 0) {
            num = helloReplyCore.cmpHashVersion;
        }
        if ((i10 & 64) != 0) {
            str2 = helloReplyCore.cmpHash;
        }
        if ((i10 & 128) != 0) {
            str3 = helloReplyCore.floatingExtraId;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num2 = helloReplyCore.floatingExtraVersion;
        }
        if ((i10 & 512) != 0) {
            floatingConsentCore = helloReplyCore.floatingConsent;
        }
        if ((i10 & 1024) != 0) {
            countryCore = helloReplyCore.country;
        }
        FloatingConsentCore floatingConsentCore2 = floatingConsentCore;
        CountryCore countryCore2 = countryCore;
        String str4 = str3;
        Integer num3 = num2;
        Integer num4 = num;
        String str5 = str2;
        VendorListCore vendorListCore2 = vendorListCore;
        ConfigurationCore configurationCore2 = configurationCore;
        return helloReplyCore.copy(errorResponseCore, str, configurationCore2, consentCore, vendorListCore2, num4, str5, str4, num3, floatingConsentCore2, countryCore2);
    }

    public final ErrorResponseCore component1() {
        return this.error;
    }

    public final FloatingConsentCore component10() {
        return this.floatingConsent;
    }

    public final CountryCore component11() {
        return this.country;
    }

    public final String component2() {
        return this.uuid;
    }

    public final ConfigurationCore component3() {
        return this.configuration;
    }

    public final ConsentCore component4() {
        return this.consent;
    }

    public final VendorListCore component5() {
        return this.vendorList;
    }

    public final Integer component6() {
        return this.cmpHashVersion;
    }

    public final String component7() {
        return this.cmpHash;
    }

    public final String component8() {
        return this.floatingExtraId;
    }

    public final Integer component9() {
        return this.floatingExtraVersion;
    }

    public final HelloReplyCore copy(ErrorResponseCore errorResponseCore, String uuid, ConfigurationCore configurationCore, ConsentCore consentCore, VendorListCore vendorListCore, Integer num, String str, String str2, Integer num2, FloatingConsentCore floatingConsentCore, CountryCore countryCore) {
        e0.checkNotNullParameter(uuid, "uuid");
        return new HelloReplyCore(errorResponseCore, uuid, configurationCore, consentCore, vendorListCore, num, str, str2, num2, floatingConsentCore, countryCore);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelloReplyCore)) {
            return false;
        }
        HelloReplyCore helloReplyCore = (HelloReplyCore) obj;
        return e0.areEqual(this.error, helloReplyCore.error) && e0.areEqual(this.uuid, helloReplyCore.uuid) && e0.areEqual(this.configuration, helloReplyCore.configuration) && e0.areEqual(this.consent, helloReplyCore.consent) && e0.areEqual(this.vendorList, helloReplyCore.vendorList) && e0.areEqual(this.cmpHashVersion, helloReplyCore.cmpHashVersion) && e0.areEqual(this.cmpHash, helloReplyCore.cmpHash) && e0.areEqual(this.floatingExtraId, helloReplyCore.floatingExtraId) && e0.areEqual(this.floatingExtraVersion, helloReplyCore.floatingExtraVersion) && e0.areEqual(this.floatingConsent, helloReplyCore.floatingConsent) && e0.areEqual(this.country, helloReplyCore.country);
    }

    public final String getCmpHash() {
        return this.cmpHash;
    }

    public final Integer getCmpHashVersion() {
        return this.cmpHashVersion;
    }

    public final ConfigurationCore getConfiguration() {
        return this.configuration;
    }

    public final ConsentCore getConsent() {
        return this.consent;
    }

    public final CountryCore getCountry() {
        return this.country;
    }

    public final ErrorResponseCore getError() {
        return this.error;
    }

    public final FloatingConsentCore getFloatingConsent() {
        return this.floatingConsent;
    }

    public final String getFloatingExtraId() {
        return this.floatingExtraId;
    }

    public final Integer getFloatingExtraVersion() {
        return this.floatingExtraVersion;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final VendorListCore getVendorList() {
        return this.vendorList;
    }

    public int hashCode() {
        ErrorResponseCore errorResponseCore = this.error;
        int iE = o2.e((errorResponseCore == null ? 0 : errorResponseCore.hashCode()) * 31, 31, this.uuid);
        ConfigurationCore configurationCore = this.configuration;
        int iHashCode = (iE + (configurationCore == null ? 0 : configurationCore.hashCode())) * 31;
        ConsentCore consentCore = this.consent;
        int iHashCode2 = (iHashCode + (consentCore == null ? 0 : consentCore.hashCode())) * 31;
        VendorListCore vendorListCore = this.vendorList;
        int iHashCode3 = (iHashCode2 + (vendorListCore == null ? 0 : vendorListCore.hashCode())) * 31;
        Integer num = this.cmpHashVersion;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.cmpHash;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.floatingExtraId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.floatingExtraVersion;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        FloatingConsentCore floatingConsentCore = this.floatingConsent;
        int iHashCode8 = (iHashCode7 + (floatingConsentCore == null ? 0 : floatingConsentCore.hashCode())) * 31;
        CountryCore countryCore = this.country;
        return iHashCode8 + (countryCore != null ? countryCore.hashCode() : 0);
    }

    public String toString() {
        return "HelloReplyCore(error=" + this.error + ", uuid=" + this.uuid + ", configuration=" + this.configuration + ", consent=" + this.consent + ", vendorList=" + this.vendorList + ", cmpHashVersion=" + this.cmpHashVersion + ", cmpHash=" + this.cmpHash + ", floatingExtraId=" + this.floatingExtraId + ", floatingExtraVersion=" + this.floatingExtraVersion + ", floatingConsent=" + this.floatingConsent + ", country=" + this.country + ')';
    }

    public HelloReplyCore(ErrorResponseCore errorResponseCore, String uuid, ConfigurationCore configurationCore, ConsentCore consentCore, VendorListCore vendorListCore, Integer num, String str, String str2, Integer num2, FloatingConsentCore floatingConsentCore, CountryCore countryCore) {
        e0.checkNotNullParameter(uuid, "uuid");
        this.error = errorResponseCore;
        this.uuid = uuid;
        this.configuration = configurationCore;
        this.consent = consentCore;
        this.vendorList = vendorListCore;
        this.cmpHashVersion = num;
        this.cmpHash = str;
        this.floatingExtraId = str2;
        this.floatingExtraVersion = num2;
        this.floatingConsent = floatingConsentCore;
        this.country = countryCore;
    }

    public /* synthetic */ HelloReplyCore(ErrorResponseCore errorResponseCore, String str, ConfigurationCore configurationCore, ConsentCore consentCore, VendorListCore vendorListCore, Integer num, String str2, String str3, Integer num2, FloatingConsentCore floatingConsentCore, CountryCore countryCore, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : errorResponseCore, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : configurationCore, (i10 & 8) != 0 ? null : consentCore, (i10 & 16) != 0 ? null : vendorListCore, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? null : str2, (i10 & 128) != 0 ? null : str3, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num2, (i10 & 512) != 0 ? null : floatingConsentCore, (i10 & 1024) != 0 ? null : countryCore);
    }
}
