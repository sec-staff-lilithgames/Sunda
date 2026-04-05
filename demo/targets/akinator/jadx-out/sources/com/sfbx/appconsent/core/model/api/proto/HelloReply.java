package com.sfbx.appconsent.core.model.api.proto;

import androidx.core.app.NotificationCompat;
import com.sfbx.appconsent.core.model.FloatingConsent;
import com.sfbx.appconsent.core.model.FloatingConsent$$serializer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class HelloReply {
    public static final Companion Companion = new Companion(null);
    private final String cmpHash;
    private final Integer cmpHashVersion;
    private final Configuration configuration;
    private final Consent consent;
    private final CountryProto country;
    private final ErrorResponse error;
    private final FloatingConsent floatingConsent;
    private final String floatingExtraId;
    private final Integer floatingExtraVersion;
    private final String uuid;
    private final VendorList vendorList;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<HelloReply> serializer() {
            return HelloReply$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HelloReply() {
        this((ErrorResponse) null, (String) null, (Configuration) null, (Consent) null, (VendorList) null, (Integer) null, (String) null, (String) null, (Integer) null, (FloatingConsent) null, (CountryProto) null, 2047, (u) null);
    }

    public static /* synthetic */ HelloReply copy$default(HelloReply helloReply, ErrorResponse errorResponse, String str, Configuration configuration, Consent consent, VendorList vendorList, Integer num, String str2, String str3, Integer num2, FloatingConsent floatingConsent, CountryProto countryProto, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            errorResponse = helloReply.error;
        }
        if ((i10 & 2) != 0) {
            str = helloReply.uuid;
        }
        if ((i10 & 4) != 0) {
            configuration = helloReply.configuration;
        }
        if ((i10 & 8) != 0) {
            consent = helloReply.consent;
        }
        if ((i10 & 16) != 0) {
            vendorList = helloReply.vendorList;
        }
        if ((i10 & 32) != 0) {
            num = helloReply.cmpHashVersion;
        }
        if ((i10 & 64) != 0) {
            str2 = helloReply.cmpHash;
        }
        if ((i10 & 128) != 0) {
            str3 = helloReply.floatingExtraId;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num2 = helloReply.floatingExtraVersion;
        }
        if ((i10 & 512) != 0) {
            floatingConsent = helloReply.floatingConsent;
        }
        if ((i10 & 1024) != 0) {
            countryProto = helloReply.country;
        }
        FloatingConsent floatingConsent2 = floatingConsent;
        CountryProto countryProto2 = countryProto;
        String str4 = str3;
        Integer num3 = num2;
        Integer num4 = num;
        String str5 = str2;
        VendorList vendorList2 = vendorList;
        Configuration configuration2 = configuration;
        return helloReply.copy(errorResponse, str, configuration2, consent, vendorList2, num4, str5, str4, num3, floatingConsent2, countryProto2);
    }

    public static final void write$Self(HelloReply self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.error != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, ErrorResponse$$serializer.INSTANCE, self.error);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !e0.areEqual(self.uuid, "")) {
            output.encodeStringElement(serialDesc, 1, self.uuid);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.configuration != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, Configuration$$serializer.INSTANCE, self.configuration);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.consent != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, Consent$$serializer.INSTANCE, self.consent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.vendorList != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, VendorList$$serializer.INSTANCE, self.vendorList);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.cmpHashVersion != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.cmpHashVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.cmpHash != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.cmpHash);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.floatingExtraId != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.floatingExtraId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.floatingExtraVersion != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.floatingExtraVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.floatingConsent != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, FloatingConsent$$serializer.INSTANCE, self.floatingConsent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.country == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, CountryProto$$serializer.INSTANCE, self.country);
    }

    public final ErrorResponse component1() {
        return this.error;
    }

    public final FloatingConsent component10() {
        return this.floatingConsent;
    }

    public final CountryProto component11() {
        return this.country;
    }

    public final String component2() {
        return this.uuid;
    }

    public final Configuration component3() {
        return this.configuration;
    }

    public final Consent component4() {
        return this.consent;
    }

    public final VendorList component5() {
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

    public final HelloReply copy(ErrorResponse errorResponse, String uuid, Configuration configuration, Consent consent, VendorList vendorList, Integer num, String str, String str2, Integer num2, FloatingConsent floatingConsent, CountryProto countryProto) {
        e0.checkNotNullParameter(uuid, "uuid");
        return new HelloReply(errorResponse, uuid, configuration, consent, vendorList, num, str, str2, num2, floatingConsent, countryProto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelloReply)) {
            return false;
        }
        HelloReply helloReply = (HelloReply) obj;
        return e0.areEqual(this.error, helloReply.error) && e0.areEqual(this.uuid, helloReply.uuid) && e0.areEqual(this.configuration, helloReply.configuration) && e0.areEqual(this.consent, helloReply.consent) && e0.areEqual(this.vendorList, helloReply.vendorList) && e0.areEqual(this.cmpHashVersion, helloReply.cmpHashVersion) && e0.areEqual(this.cmpHash, helloReply.cmpHash) && e0.areEqual(this.floatingExtraId, helloReply.floatingExtraId) && e0.areEqual(this.floatingExtraVersion, helloReply.floatingExtraVersion) && e0.areEqual(this.floatingConsent, helloReply.floatingConsent) && e0.areEqual(this.country, helloReply.country);
    }

    public final String getCmpHash() {
        return this.cmpHash;
    }

    public final Integer getCmpHashVersion() {
        return this.cmpHashVersion;
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final Consent getConsent() {
        return this.consent;
    }

    public final CountryProto getCountry() {
        return this.country;
    }

    public final ErrorResponse getError() {
        return this.error;
    }

    public final FloatingConsent getFloatingConsent() {
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

    public final VendorList getVendorList() {
        return this.vendorList;
    }

    public int hashCode() {
        ErrorResponse errorResponse = this.error;
        int iE = o2.e((errorResponse == null ? 0 : errorResponse.hashCode()) * 31, 31, this.uuid);
        Configuration configuration = this.configuration;
        int iHashCode = (iE + (configuration == null ? 0 : configuration.hashCode())) * 31;
        Consent consent = this.consent;
        int iHashCode2 = (iHashCode + (consent == null ? 0 : consent.hashCode())) * 31;
        VendorList vendorList = this.vendorList;
        int iHashCode3 = (iHashCode2 + (vendorList == null ? 0 : vendorList.hashCode())) * 31;
        Integer num = this.cmpHashVersion;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.cmpHash;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.floatingExtraId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.floatingExtraVersion;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        FloatingConsent floatingConsent = this.floatingConsent;
        int iHashCode8 = (iHashCode7 + (floatingConsent == null ? 0 : floatingConsent.hashCode())) * 31;
        CountryProto countryProto = this.country;
        return iHashCode8 + (countryProto != null ? countryProto.hashCode() : 0);
    }

    public String toString() {
        return "HelloReply(error=" + this.error + ", uuid=" + this.uuid + ", configuration=" + this.configuration + ", consent=" + this.consent + ", vendorList=" + this.vendorList + ", cmpHashVersion=" + this.cmpHashVersion + ", cmpHash=" + this.cmpHash + ", floatingExtraId=" + this.floatingExtraId + ", floatingExtraVersion=" + this.floatingExtraVersion + ", floatingConsent=" + this.floatingConsent + ", country=" + this.country + ')';
    }

    @f
    public /* synthetic */ HelloReply(int i10, ErrorResponse errorResponse, String str, Configuration configuration, Consent consent, @SerialName("vendorlist") VendorList vendorList, @SerialName("cmp_hash_version") Integer num, @SerialName("cmp_hash") String str2, @SerialName("floating_extra_id") String str3, @SerialName("floating_version") Integer num2, FloatingConsent floatingConsent, @SerialName("country") CountryProto countryProto, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.error = null;
        } else {
            this.error = errorResponse;
        }
        if ((i10 & 2) == 0) {
            this.uuid = "";
        } else {
            this.uuid = str;
        }
        if ((i10 & 4) == 0) {
            this.configuration = null;
        } else {
            this.configuration = configuration;
        }
        if ((i10 & 8) == 0) {
            this.consent = null;
        } else {
            this.consent = consent;
        }
        if ((i10 & 16) == 0) {
            this.vendorList = null;
        } else {
            this.vendorList = vendorList;
        }
        if ((i10 & 32) == 0) {
            this.cmpHashVersion = null;
        } else {
            this.cmpHashVersion = num;
        }
        if ((i10 & 64) == 0) {
            this.cmpHash = null;
        } else {
            this.cmpHash = str2;
        }
        if ((i10 & 128) == 0) {
            this.floatingExtraId = null;
        } else {
            this.floatingExtraId = str3;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.floatingExtraVersion = null;
        } else {
            this.floatingExtraVersion = num2;
        }
        if ((i10 & 512) == 0) {
            this.floatingConsent = null;
        } else {
            this.floatingConsent = floatingConsent;
        }
        if ((i10 & 1024) == 0) {
            this.country = null;
        } else {
            this.country = countryProto;
        }
    }

    public HelloReply(ErrorResponse errorResponse, String uuid, Configuration configuration, Consent consent, VendorList vendorList, Integer num, String str, String str2, Integer num2, FloatingConsent floatingConsent, CountryProto countryProto) {
        e0.checkNotNullParameter(uuid, "uuid");
        this.error = errorResponse;
        this.uuid = uuid;
        this.configuration = configuration;
        this.consent = consent;
        this.vendorList = vendorList;
        this.cmpHashVersion = num;
        this.cmpHash = str;
        this.floatingExtraId = str2;
        this.floatingExtraVersion = num2;
        this.floatingConsent = floatingConsent;
        this.country = countryProto;
    }

    public /* synthetic */ HelloReply(ErrorResponse errorResponse, String str, Configuration configuration, Consent consent, VendorList vendorList, Integer num, String str2, String str3, Integer num2, FloatingConsent floatingConsent, CountryProto countryProto, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : errorResponse, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : configuration, (i10 & 8) != 0 ? null : consent, (i10 & 16) != 0 ? null : vendorList, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? null : str2, (i10 & 128) != 0 ? null : str3, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num2, (i10 & 512) != 0 ? null : floatingConsent, (i10 & 1024) != 0 ? null : countryProto);
    }

    @SerialName("cmp_hash")
    public static /* synthetic */ void getCmpHash$annotations() {
    }

    @SerialName("cmp_hash_version")
    public static /* synthetic */ void getCmpHashVersion$annotations() {
    }

    @SerialName("country")
    public static /* synthetic */ void getCountry$annotations() {
    }

    @SerialName("floating_extra_id")
    public static /* synthetic */ void getFloatingExtraId$annotations() {
    }

    @SerialName("floating_version")
    public static /* synthetic */ void getFloatingExtraVersion$annotations() {
    }

    @SerialName("vendorlist")
    public static /* synthetic */ void getVendorList$annotations() {
    }
}
