package com.sfbx.appconsent.core.model.api;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class XChangeData {
    public static final Companion Companion = new Companion(null);
    private final Integer age;
    private final String appNameBundle;
    private final String consentString;
    private final String country;
    private final String csp;
    private final String dateOfBirth;
    private final String deviceCarrier;
    private final String deviceCarrierCode;
    private final String deviceCountryCode;
    private final String deviceManufacturer;
    private final String deviceModel;
    private final String deviceOS;
    private final String deviceOSVersion;
    private final String deviceSimCode;
    private final String emailMD5;
    private final String emailSHA1;
    private final String emailSHA256;
    private final String externalId;
    private final String firstName;
    private final String floor;
    private final String gender;
    private final String household;
    private final String ipv4Address;
    private final String ipv6Address;
    private final String lastName;
    private final String macAddress;
    private final String maid;
    private final String maidType;
    private final String networkType;
    private final String phoneMD5;
    private final String phoneSHA1;
    private final String phoneSHA256;
    private final String postCode;
    private final String region;
    private final String revenues;
    private final Integer signalStrength;
    private final String streetName;
    private final String streetNo;
    private final String streetType;
    private final Long timestampCollect;
    private final String town;
    private final String unstructuredData;
    private final String wifiSSID;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private Integer age;
        private String appNameBundle;
        private String consentString;
        private String csp;
        private String dateOfBirth;
        private String deviceCarrier;
        private String deviceCarrierCode;
        private String deviceCountryCode;
        private String deviceManufacturer;
        private String deviceModel;
        private String deviceOS;
        private String deviceOSVersion;
        private String deviceSimCode;
        private String emailMD5;
        private String emailSHA1;
        private String emailSHA256;
        private String externalId;
        private String firstName;
        private String gender;
        private String household;
        private String ipv4Address;
        private String ipv6Address;
        private String lastName;
        private String macAddress;
        private String maid;
        private String maidType;
        private String networkType;
        private String phoneMD5;
        private String phoneSHA1;
        private String phoneSHA256;
        private String revenues;
        private Integer signalStrength;
        private Long timestampCollect;
        private String unstructuredData;
        private String wifiSSID;
        private XChangeDataAddress xChangeDataAddress;

        public Builder() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null);
        }

        public final Builder appNameBundle(String appNameBundle) {
            e0.checkNotNullParameter(appNameBundle, "appNameBundle");
            this.appNameBundle = appNameBundle;
            return this;
        }

        public final XChangeData build() {
            Integer num = this.age;
            String str = this.appNameBundle;
            String str2 = this.deviceManufacturer;
            String str3 = this.consentString;
            String str4 = this.deviceCountryCode;
            String str5 = this.csp;
            String str6 = this.dateOfBirth;
            String str7 = this.deviceOS;
            String str8 = this.deviceOSVersion;
            String str9 = this.deviceSimCode;
            String str10 = this.deviceCarrierCode;
            String str11 = this.emailSHA1;
            String str12 = this.emailSHA256;
            String str13 = this.emailMD5;
            String str14 = this.externalId;
            String str15 = this.firstName;
            String str16 = this.gender;
            String str17 = this.household;
            String str18 = this.ipv4Address;
            String str19 = this.ipv6Address;
            String str20 = this.lastName;
            String str21 = this.macAddress;
            String str22 = this.maid;
            String str23 = this.maidType;
            String str24 = this.deviceModel;
            String str25 = this.deviceCarrier;
            String str26 = this.phoneMD5;
            String str27 = this.phoneSHA1;
            String str28 = this.phoneSHA256;
            String str29 = this.networkType;
            String str30 = this.revenues;
            String str31 = this.wifiSSID;
            Integer num2 = this.signalStrength;
            Long l9 = this.timestampCollect;
            String str32 = this.unstructuredData;
            XChangeDataAddress xChangeDataAddress = this.xChangeDataAddress;
            String country = xChangeDataAddress != null ? xChangeDataAddress.getCountry() : null;
            XChangeDataAddress xChangeDataAddress2 = this.xChangeDataAddress;
            String floor = xChangeDataAddress2 != null ? xChangeDataAddress2.getFloor() : null;
            XChangeDataAddress xChangeDataAddress3 = this.xChangeDataAddress;
            String postCode = xChangeDataAddress3 != null ? xChangeDataAddress3.getPostCode() : null;
            XChangeDataAddress xChangeDataAddress4 = this.xChangeDataAddress;
            String region = xChangeDataAddress4 != null ? xChangeDataAddress4.getRegion() : null;
            XChangeDataAddress xChangeDataAddress5 = this.xChangeDataAddress;
            String streetName = xChangeDataAddress5 != null ? xChangeDataAddress5.getStreetName() : null;
            XChangeDataAddress xChangeDataAddress6 = this.xChangeDataAddress;
            String streetNo = xChangeDataAddress6 != null ? xChangeDataAddress6.getStreetNo() : null;
            XChangeDataAddress xChangeDataAddress7 = this.xChangeDataAddress;
            String streetType = xChangeDataAddress7 != null ? xChangeDataAddress7.getStreetType() : null;
            XChangeDataAddress xChangeDataAddress8 = this.xChangeDataAddress;
            return new XChangeData(num, str, str3, str5, str6, str4, str2, str7, country, floor, postCode, str25, str9, str10, str24, str8, str13, str11, str12, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str29, str26, str27, str28, region, str30, num2, streetName, streetNo, streetType, l9, xChangeDataAddress8 != null ? xChangeDataAddress8.getTown() : null, str32, str31, null);
        }

        public final Builder consentString(String consentString) {
            e0.checkNotNullParameter(consentString, "consentString");
            this.consentString = consentString;
            return this;
        }

        public final Builder deviceCarrier(String deviceCarrier) {
            e0.checkNotNullParameter(deviceCarrier, "deviceCarrier");
            this.deviceCarrier = deviceCarrier;
            return this;
        }

        public final Builder deviceCarrierCode(String deviceCarrierCode) {
            e0.checkNotNullParameter(deviceCarrierCode, "deviceCarrierCode");
            this.deviceCarrierCode = deviceCarrierCode;
            return this;
        }

        public final Builder deviceCountryCode(String deviceCountryCode) {
            e0.checkNotNullParameter(deviceCountryCode, "deviceCountryCode");
            this.deviceCountryCode = deviceCountryCode;
            return this;
        }

        public final Builder deviceManufacturer(String deviceManufacturer) {
            e0.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
            this.deviceManufacturer = deviceManufacturer;
            return this;
        }

        public final Builder deviceModel(String deviceModel) {
            e0.checkNotNullParameter(deviceModel, "deviceModel");
            this.deviceModel = deviceModel;
            return this;
        }

        public final Builder deviceOS(String deviceOS) {
            e0.checkNotNullParameter(deviceOS, "deviceOS");
            this.deviceOS = deviceOS;
            return this;
        }

        public final Builder deviceOSVersion(String deviceOSVersion) {
            e0.checkNotNullParameter(deviceOSVersion, "deviceOSVersion");
            this.deviceOSVersion = deviceOSVersion;
            return this;
        }

        public final Builder deviceSimCode(String deviceSimCode) {
            e0.checkNotNullParameter(deviceSimCode, "deviceSimCode");
            this.deviceSimCode = deviceSimCode;
            return this;
        }

        public final Builder ipv4Address(String ipv4Address) {
            e0.checkNotNullParameter(ipv4Address, "ipv4Address");
            this.ipv4Address = ipv4Address;
            return this;
        }

        public final Builder ipv6Address(String ipv6Address) {
            e0.checkNotNullParameter(ipv6Address, "ipv6Address");
            this.ipv6Address = ipv6Address;
            return this;
        }

        public final Builder macAddress(String macAddress) {
            e0.checkNotNullParameter(macAddress, "macAddress");
            this.macAddress = macAddress;
            return this;
        }

        public final Builder maid(String maid) {
            e0.checkNotNullParameter(maid, "maid");
            this.maid = maid;
            return this;
        }

        public final Builder maidType(String maidType) {
            e0.checkNotNullParameter(maidType, "maidType");
            this.maidType = maidType;
            return this;
        }

        public final Builder merge(XChangeUserData xChangeUserData) {
            this.emailSHA256 = xChangeUserData != null ? xChangeUserData.getEmailSHA256() : null;
            this.externalId = xChangeUserData != null ? xChangeUserData.getExternalId() : null;
            this.phoneSHA256 = xChangeUserData != null ? xChangeUserData.getPhoneSHA256() : null;
            this.timestampCollect = xChangeUserData != null ? xChangeUserData.getTimestampCollect() : null;
            this.unstructuredData = xChangeUserData != null ? xChangeUserData.getUnstructuredData() : null;
            this.xChangeDataAddress = xChangeUserData != null ? xChangeUserData.getXChangeDataAddress() : null;
            return this;
        }

        public final Builder networkType(String networkType) {
            e0.checkNotNullParameter(networkType, "networkType");
            this.networkType = networkType;
            return this;
        }

        public final Builder signalStrength(int i10) {
            this.signalStrength = Integer.valueOf(i10);
            return this;
        }

        public final Builder timestampCollect(long j10) {
            this.timestampCollect = Long.valueOf(j10);
            return this;
        }

        public final Builder unstructuredData(String unstructuredData) {
            e0.checkNotNullParameter(unstructuredData, "unstructuredData");
            this.unstructuredData = unstructuredData;
            return this;
        }

        public final Builder wifiSSID(String str) {
            this.wifiSSID = str;
            return this;
        }

        public Builder(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Integer num2, Long l9, String str31, String str32, XChangeDataAddress xChangeDataAddress) {
            this.age = num;
            this.appNameBundle = str;
            this.deviceManufacturer = str2;
            this.consentString = str3;
            this.deviceCountryCode = str4;
            this.deviceSimCode = str5;
            this.deviceCarrierCode = str6;
            this.csp = str7;
            this.dateOfBirth = str8;
            this.deviceOS = str9;
            this.deviceOSVersion = str10;
            this.emailSHA1 = str11;
            this.emailSHA256 = str12;
            this.emailMD5 = str13;
            this.externalId = str14;
            this.firstName = str15;
            this.gender = str16;
            this.household = str17;
            this.ipv4Address = str18;
            this.ipv6Address = str19;
            this.lastName = str20;
            this.macAddress = str21;
            this.maid = str22;
            this.maidType = str23;
            this.deviceModel = str24;
            this.deviceCarrier = str25;
            this.phoneMD5 = str26;
            this.phoneSHA1 = str27;
            this.phoneSHA256 = str28;
            this.networkType = str29;
            this.revenues = str30;
            this.signalStrength = num2;
            this.timestampCollect = l9;
            this.unstructuredData = str31;
            this.wifiSSID = str32;
            this.xChangeDataAddress = xChangeDataAddress;
        }

        public /* synthetic */ Builder(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, Integer num2, Long l9, String str31, String str32, XChangeDataAddress xChangeDataAddress, int i10, int i11, u uVar) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str8, (i10 & 512) != 0 ? null : str9, (i10 & 1024) != 0 ? null : str10, (i10 & 2048) != 0 ? null : str11, (i10 & 4096) != 0 ? null : str12, (i10 & Segment.SIZE) != 0 ? null : str13, (i10 & 16384) != 0 ? null : str14, (i10 & 32768) != 0 ? null : str15, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str16, (i10 & 131072) != 0 ? null : str17, (i10 & 262144) != 0 ? null : str18, (i10 & 524288) != 0 ? null : str19, (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str20, (i10 & 2097152) != 0 ? null : str21, (i10 & 4194304) != 0 ? null : str22, (i10 & 8388608) != 0 ? null : str23, (i10 & 16777216) != 0 ? null : str24, (i10 & 33554432) != 0 ? null : str25, (i10 & 67108864) != 0 ? null : str26, (i10 & 134217728) != 0 ? null : str27, (i10 & 268435456) != 0 ? null : str28, (i10 & 536870912) != 0 ? null : str29, (i10 & 1073741824) != 0 ? null : str30, (i10 & Integer.MIN_VALUE) != 0 ? null : num2, (i11 & 1) != 0 ? null : l9, (i11 & 2) != 0 ? null : str31, (i11 & 4) != 0 ? null : str32, (i11 & 8) != 0 ? null : xChangeDataAddress);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<XChangeData> serializer() {
            return XChangeData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ XChangeData(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, Integer num2, String str35, String str36, String str37, Long l9, String str38, String str39, String str40, u uVar) {
        this(num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, num2, str35, str36, str37, l9, str38, str39, str40);
    }

    public static final void write$Self(XChangeData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, intSerializer, self.age);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.appNameBundle);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.consentString);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.csp);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.dateOfBirth);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.deviceCountryCode);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.deviceManufacturer);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.deviceOS);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.country);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.floor);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.postCode);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.deviceCarrier);
        output.encodeNullableSerializableElement(serialDesc, 12, stringSerializer, self.deviceSimCode);
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.deviceCarrierCode);
        output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.deviceModel);
        output.encodeNullableSerializableElement(serialDesc, 15, stringSerializer, self.deviceOSVersion);
        output.encodeNullableSerializableElement(serialDesc, 16, stringSerializer, self.emailMD5);
        output.encodeNullableSerializableElement(serialDesc, 17, stringSerializer, self.emailSHA1);
        output.encodeNullableSerializableElement(serialDesc, 18, stringSerializer, self.emailSHA256);
        output.encodeNullableSerializableElement(serialDesc, 19, stringSerializer, self.externalId);
        output.encodeNullableSerializableElement(serialDesc, 20, stringSerializer, self.firstName);
        output.encodeNullableSerializableElement(serialDesc, 21, stringSerializer, self.gender);
        output.encodeNullableSerializableElement(serialDesc, 22, stringSerializer, self.household);
        output.encodeNullableSerializableElement(serialDesc, 23, stringSerializer, self.ipv4Address);
        output.encodeNullableSerializableElement(serialDesc, 24, stringSerializer, self.ipv6Address);
        output.encodeNullableSerializableElement(serialDesc, 25, stringSerializer, self.lastName);
        output.encodeNullableSerializableElement(serialDesc, 26, stringSerializer, self.macAddress);
        output.encodeNullableSerializableElement(serialDesc, 27, stringSerializer, self.maid);
        output.encodeNullableSerializableElement(serialDesc, 28, stringSerializer, self.maidType);
        output.encodeNullableSerializableElement(serialDesc, 29, stringSerializer, self.networkType);
        output.encodeNullableSerializableElement(serialDesc, 30, stringSerializer, self.phoneMD5);
        output.encodeNullableSerializableElement(serialDesc, 31, stringSerializer, self.phoneSHA1);
        output.encodeNullableSerializableElement(serialDesc, 32, stringSerializer, self.phoneSHA256);
        output.encodeNullableSerializableElement(serialDesc, 33, stringSerializer, self.region);
        output.encodeNullableSerializableElement(serialDesc, 34, stringSerializer, self.revenues);
        output.encodeNullableSerializableElement(serialDesc, 35, intSerializer, self.signalStrength);
        output.encodeNullableSerializableElement(serialDesc, 36, stringSerializer, self.streetName);
        output.encodeNullableSerializableElement(serialDesc, 37, stringSerializer, self.streetNo);
        output.encodeNullableSerializableElement(serialDesc, 38, stringSerializer, self.streetType);
        output.encodeNullableSerializableElement(serialDesc, 39, LongSerializer.INSTANCE, self.timestampCollect);
        output.encodeNullableSerializableElement(serialDesc, 40, stringSerializer, self.town);
        output.encodeNullableSerializableElement(serialDesc, 41, stringSerializer, self.unstructuredData);
        output.encodeNullableSerializableElement(serialDesc, 42, stringSerializer, self.wifiSSID);
    }

    public final Integer getAge() {
        return this.age;
    }

    public final String getAppNameBundle() {
        return this.appNameBundle;
    }

    public final String getConsentString() {
        return this.consentString;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCsp() {
        return this.csp;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getDeviceCarrier() {
        return this.deviceCarrier;
    }

    public final String getDeviceCarrierCode() {
        return this.deviceCarrierCode;
    }

    public final String getDeviceCountryCode() {
        return this.deviceCountryCode;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOS() {
        return this.deviceOS;
    }

    public final String getDeviceOSVersion() {
        return this.deviceOSVersion;
    }

    public final String getDeviceSimCode() {
        return this.deviceSimCode;
    }

    public final String getEmailMD5() {
        return this.emailMD5;
    }

    public final String getEmailSHA1() {
        return this.emailSHA1;
    }

    public final String getEmailSHA256() {
        return this.emailSHA256;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFloor() {
        return this.floor;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getHousehold() {
        return this.household;
    }

    public final String getIpv4Address() {
        return this.ipv4Address;
    }

    public final String getIpv6Address() {
        return this.ipv6Address;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final String getMaid() {
        return this.maid;
    }

    public final String getMaidType() {
        return this.maidType;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final String getPhoneMD5() {
        return this.phoneMD5;
    }

    public final String getPhoneSHA1() {
        return this.phoneSHA1;
    }

    public final String getPhoneSHA256() {
        return this.phoneSHA256;
    }

    public final String getPostCode() {
        return this.postCode;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getRevenues() {
        return this.revenues;
    }

    public final Integer getSignalStrength() {
        return this.signalStrength;
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

    public final Long getTimestampCollect() {
        return this.timestampCollect;
    }

    public final String getTown() {
        return this.town;
    }

    public final String getUnstructuredData() {
        return this.unstructuredData;
    }

    public final String getWifiSSID() {
        return this.wifiSSID;
    }

    @f
    public /* synthetic */ XChangeData(int i10, int i11, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, Integer num2, String str35, String str36, String str37, Long l9, String str38, String str39, String str40, SerializationConstructorMarker serializationConstructorMarker) {
        if ((2047 != (i11 & 2047)) | (-1 != i10)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i10, i11}, new int[]{-1, 2047}, XChangeData$$serializer.INSTANCE.getDescriptor());
        }
        this.age = num;
        this.appNameBundle = str;
        this.consentString = str2;
        this.csp = str3;
        this.dateOfBirth = str4;
        this.deviceCountryCode = str5;
        this.deviceManufacturer = str6;
        this.deviceOS = str7;
        this.country = str8;
        this.floor = str9;
        this.postCode = str10;
        this.deviceCarrier = str11;
        this.deviceSimCode = str12;
        this.deviceCarrierCode = str13;
        this.deviceModel = str14;
        this.deviceOSVersion = str15;
        this.emailMD5 = str16;
        this.emailSHA1 = str17;
        this.emailSHA256 = str18;
        this.externalId = str19;
        this.firstName = str20;
        this.gender = str21;
        this.household = str22;
        this.ipv4Address = str23;
        this.ipv6Address = str24;
        this.lastName = str25;
        this.macAddress = str26;
        this.maid = str27;
        this.maidType = str28;
        this.networkType = str29;
        this.phoneMD5 = str30;
        this.phoneSHA1 = str31;
        this.phoneSHA256 = str32;
        this.region = str33;
        this.revenues = str34;
        this.signalStrength = num2;
        this.streetName = str35;
        this.streetNo = str36;
        this.streetType = str37;
        this.timestampCollect = l9;
        this.town = str38;
        this.unstructuredData = str39;
        this.wifiSSID = str40;
    }

    private XChangeData(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, Integer num2, String str35, String str36, String str37, Long l9, String str38, String str39, String str40) {
        this.age = num;
        this.appNameBundle = str;
        this.consentString = str2;
        this.csp = str3;
        this.dateOfBirth = str4;
        this.deviceCountryCode = str5;
        this.deviceManufacturer = str6;
        this.deviceOS = str7;
        this.country = str8;
        this.floor = str9;
        this.postCode = str10;
        this.deviceCarrier = str11;
        this.deviceSimCode = str12;
        this.deviceCarrierCode = str13;
        this.deviceModel = str14;
        this.deviceOSVersion = str15;
        this.emailMD5 = str16;
        this.emailSHA1 = str17;
        this.emailSHA256 = str18;
        this.externalId = str19;
        this.firstName = str20;
        this.gender = str21;
        this.household = str22;
        this.ipv4Address = str23;
        this.ipv6Address = str24;
        this.lastName = str25;
        this.macAddress = str26;
        this.maid = str27;
        this.maidType = str28;
        this.networkType = str29;
        this.phoneMD5 = str30;
        this.phoneSHA1 = str31;
        this.phoneSHA256 = str32;
        this.region = str33;
        this.revenues = str34;
        this.signalStrength = num2;
        this.streetName = str35;
        this.streetNo = str36;
        this.streetType = str37;
        this.timestampCollect = l9;
        this.town = str38;
        this.unstructuredData = str39;
        this.wifiSSID = str40;
    }
}
