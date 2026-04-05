package com.fyber.inneractive.sdk.bidder;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.fyber.inneractive.sdk.protobuf.a1;
import com.fyber.inneractive.sdk.protobuf.e2;
import com.fyber.inneractive.sdk.protobuf.g1;
import com.fyber.inneractive.sdk.protobuf.h1;
import com.fyber.inneractive.sdk.protobuf.i1;
import com.fyber.inneractive.sdk.protobuf.k1;
import com.fyber.inneractive.sdk.protobuf.m2;
import com.fyber.inneractive.sdk.protobuf.n1;
import com.fyber.inneractive.sdk.protobuf.t0;
import com.fyber.inneractive.sdk.protobuf.u0;
import com.fyber.inneractive.sdk.protobuf.y0;
import com.fyber.inneractive.sdk.protobuf.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class TokenParametersOuterClass$TokenParameters extends z0 implements e2 {
    public static final int AAID_FIELD_NUMBER = 54;
    public static final int ABEXPERIMENTS_FIELD_NUMBER = 63;
    public static final int ADSERVICESVERSION_FIELD_NUMBER = 76;
    public static final int AIRPLANEMODE_FIELD_NUMBER = 50;
    public static final int AMAZONID_FIELD_NUMBER = 53;
    public static final int APPBUILDVERSION_FIELD_NUMBER = 55;
    public static final int APPSETID_FIELD_NUMBER = 73;
    public static final int APPVERSION_FIELD_NUMBER = 6;
    public static final int BATTERYCHARGING_FIELD_NUMBER = 43;
    public static final int BATTERYLEVEL_FIELD_NUMBER = 44;
    public static final int BLUETOOTHPLUGGED_FIELD_NUMBER = 46;
    public static final int BUNDLEID_FIELD_NUMBER = 4;
    public static final int CARRIERNAME_FIELD_NUMBER = 18;
    public static final int CCPASTRING_FIELD_NUMBER = 27;
    public static final int CHILDMODE_FIELD_NUMBER = 69;
    public static final int COPPAAPPLIES_FIELD_NUMBER = 70;
    public static final int COUNTRYCODE_FIELD_NUMBER = 17;
    public static final int DARKMODE_FIELD_NUMBER = 49;
    private static final TokenParametersOuterClass$TokenParameters DEFAULT_INSTANCE;
    public static final int DEVICEAPI_FIELD_NUMBER = 8;
    public static final int DEVICEHEIGHT_FIELD_NUMBER = 13;
    public static final int DEVICELANGUAGE_FIELD_NUMBER = 10;
    public static final int DEVICEMODEL_FIELD_NUMBER = 5;
    public static final int DEVICEOS_FIELD_NUMBER = 7;
    public static final int DEVICEWIDTH_FIELD_NUMBER = 12;
    public static final int DNDMODE_FIELD_NUMBER = 51;
    public static final int DNT_FIELD_NUMBER = 24;
    public static final int ENCRYPTEDTOPICS_FIELD_NUMBER = 74;
    public static final int FRAMEWORKNAME_FIELD_NUMBER = 15;
    public static final int FREESPACE_FIELD_NUMBER = 47;
    public static final int GDPRCONSENT_FIELD_NUMBER = 25;
    public static final int GDPRSTRING_FIELD_NUMBER = 26;
    public static final int HEADSETPLUGGED_FIELD_NUMBER = 45;
    public static final int HORACCURACY_FIELD_NUMBER = 39;
    public static final int IDFA_FIELD_NUMBER = 22;
    public static final int IDFV_FIELD_NUMBER = 23;
    public static final int IGNITEPACKAGENAME_FIELD_NUMBER = 68;
    public static final int IGNITEVERSION_FIELD_NUMBER = 67;
    public static final int INPUTLANGUAGES_FIELD_NUMBER = 21;
    public static final int ISRINGMUTED_FIELD_NUMBER = 52;
    public static final int KEYWORDS_FIELD_NUMBER = 36;
    public static final int LASTADOMAINS_FIELD_NUMBER = 57;
    public static final int LASTADVERTISEDBUNDLES_FIELD_NUMBER = 58;
    public static final int LATITUDE_FIELD_NUMBER = 37;
    public static final int LGPDCONSENT_FIELD_NUMBER = 66;
    public static final int LONGITUDE_FIELD_NUMBER = 38;
    public static final int LOWPOWERMODE_FIELD_NUMBER = 48;
    public static final int MEDIAMUTED_FIELD_NUMBER = 72;
    public static final int MEDIATIONTYPE_FIELD_NUMBER = 14;
    public static final int MOBILECOUNTRYCODE_FIELD_NUMBER = 19;
    public static final int MOBILENETWORKCODE_FIELD_NUMBER = 20;
    public static final int MOCKRESPONSEID_FIELD_NUMBER = 65;
    public static final int MUTEAUDIO_FIELD_NUMBER = 32;
    public static final int NETWORK_FIELD_NUMBER = 31;
    public static final int ODT_FIELD_NUMBER = 71;
    public static final int OFFSETFROMGMT_FIELD_NUMBER = 28;
    public static final int OSVERSION_FIELD_NUMBER = 9;
    private static volatile m2 PARSER = null;
    public static final int PORTAL_FIELD_NUMBER = 64;
    public static final int PRIORCLICKS_FIELD_NUMBER = 59;
    public static final int PRIORCLICKTYPES_FIELD_NUMBER = 61;
    public static final int PRIORSKIP_FIELD_NUMBER = 60;
    public static final int PXRATIO_FIELD_NUMBER = 11;
    public static final int SDKVERSION_FIELD_NUMBER = 3;
    public static final int SECURECONTENT_FIELD_NUMBER = 42;
    public static final int SESSIONDURATION_FIELD_NUMBER = 56;
    public static final int TIMEACCURACY_FIELD_NUMBER = 41;
    public static final int TOPICS_FIELD_NUMBER = 75;
    public static final int TOTALSPACE_FIELD_NUMBER = 16;
    public static final int TRACKINGSTATUS_FIELD_NUMBER = 29;
    public static final int USERAGENT_FIELD_NUMBER = 2;
    public static final int USERAGE_FIELD_NUMBER = 33;
    public static final int USERGENDER_FIELD_NUMBER = 34;
    public static final int USERID_FIELD_NUMBER = 30;
    public static final int USERSESSIONS_FIELD_NUMBER = 62;
    public static final int VERACCURACY_FIELD_NUMBER = 40;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int ZIPCODE_FIELD_NUMBER = 35;
    private static final h1 priorClicks_converter_ = new j();
    private NullableString aaid_;
    private NullableUInt32 adServicesVersion_;
    private NullableBool airplaneMode_;
    private NullableString amazonId_;
    private NullableString appBuildVersion_;
    private NullableString appSetId_;
    private NullableString appVersion_;
    private NullableBool batteryCharging_;
    private NullableUInt32 batteryLevel_;
    private int bitField0_;
    private NullableBool bluetoothPlugged_;
    private NullableString bundleID_;
    private NullableString carrierName_;
    private NullableString ccpaString_;
    private NullableBool childMode_;
    private NullableBool coppaApplies_;
    private NullableString countryCode_;
    private boolean darkMode_;
    private NullableUInt32 deviceApi_;
    private NullableUInt32 deviceHeight_;
    private NullableString deviceLanguage_;
    private NullableString deviceModel_;
    private NullableString deviceOS_;
    private NullableUInt32 deviceWidth_;
    private NullableBool dndMode_;
    private boolean dnt_;
    private int frameworkName_;
    private NullableUInt32 freeSpace_;
    private NullableBool gdprConsent_;
    private NullableString gdprString_;
    private NullableBool headsetPlugged_;
    private NullableFloat horAccuracy_;
    private NullableString idfa_;
    private NullableString idfv_;
    private NullableString ignitePackageName_;
    private NullableString igniteVersion_;
    private NullableString inputLanguages_;
    private NullableBool isRingMuted_;
    private NullableString keywords_;
    private NullableFloat latitude_;
    private NullableBool lgpdConsent_;
    private NullableFloat longitude_;
    private NullableBool lowPowerMode_;
    private NullableBool mediaMuted_;
    private NullableString mediationType_;
    private NullableString mobileCountryCode_;
    private NullableString mobileNetworkCode_;
    private NullableString mockResponseId_;
    private boolean muteAudio_;
    private NullableString network_;
    private NullableString odt_;
    private NullableSInt32 offsetFromGMT_;
    private NullableString osVersion_;
    private NullableUInt32 portal_;
    private int priorClicksMemoizedSerializedSize;
    private NullableBool priorSkip_;
    private NullableFloat pxRatio_;
    private NullableString sdkVersion_;
    private int secureContent_;
    private NullableUInt32 sessionDuration_;
    private NullableFloat timeAccuracy_;
    private NullableUInt32 totalSpace_;
    private NullableUInt32 trackingStatus_;
    private NullableUInt32 userAge_;
    private NullableString userAgent_;
    private int userGender_;
    private NullableString userID_;
    private NullableFloat verAccuracy_;
    private NullableString version_;
    private NullableString zipCode_;
    private k1 lastAdomains_ = z0.emptyProtobufList();
    private k1 lastAdvertisedBundles_ = z0.emptyProtobufList();
    private g1 priorClicks_ = z0.emptyIntList();
    private k1 priorClickTypes_ = z0.emptyProtobufList();
    private k1 userSessions_ = z0.emptyProtobufList();
    private k1 abExperiments_ = z0.emptyProtobufList();
    private k1 encryptedTopics_ = z0.emptyProtobufList();
    private k1 topics_ = z0.emptyProtobufList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EncryptedTopic extends z0 implements m {
        private static final EncryptedTopic DEFAULT_INSTANCE;
        public static final int ENCAPSULATEDKEY_FIELD_NUMBER = 3;
        public static final int ENCRYPTEDTOPIC_FIELD_NUMBER = 1;
        public static final int KEYIDENTIFIER_FIELD_NUMBER = 2;
        private static volatile m2 PARSER;
        private int bitField0_;
        private com.fyber.inneractive.sdk.protobuf.s encapsulatedKey_;
        private com.fyber.inneractive.sdk.protobuf.s encryptedTopic_;
        private String keyIdentifier_;

        static {
            EncryptedTopic encryptedTopic = new EncryptedTopic();
            DEFAULT_INSTANCE = encryptedTopic;
            z0.registerDefaultInstance(EncryptedTopic.class, encryptedTopic);
        }

        private EncryptedTopic() {
            com.fyber.inneractive.sdk.protobuf.q qVar = com.fyber.inneractive.sdk.protobuf.s.f26471b;
            this.encryptedTopic_ = qVar;
            this.keyIdentifier_ = "";
            this.encapsulatedKey_ = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncapsulatedKey() {
            this.bitField0_ &= -5;
            this.encapsulatedKey_ = getDefaultInstance().getEncapsulatedKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEncryptedTopic() {
            this.bitField0_ &= -2;
            this.encryptedTopic_ = getDefaultInstance().getEncryptedTopic();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyIdentifier() {
            this.bitField0_ &= -3;
            this.keyIdentifier_ = getDefaultInstance().getKeyIdentifier();
        }

        public static EncryptedTopic getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static l newBuilder() {
            return (l) DEFAULT_INSTANCE.createBuilder();
        }

        public static EncryptedTopic parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EncryptedTopic) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EncryptedTopic parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (EncryptedTopic) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncapsulatedKey(com.fyber.inneractive.sdk.protobuf.s sVar) {
            sVar.getClass();
            this.bitField0_ |= 4;
            this.encapsulatedKey_ = sVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEncryptedTopic(com.fyber.inneractive.sdk.protobuf.s sVar) {
            sVar.getClass();
            this.bitField0_ |= 1;
            this.encryptedTopic_ = sVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyIdentifier(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.keyIdentifier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyIdentifierBytes(com.fyber.inneractive.sdk.protobuf.s sVar) throws IllegalArgumentException {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.keyIdentifier_ = sVar.f();
            this.bitField0_ |= 2;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new EncryptedTopic();
                case 2:
                    return new l();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ለ\u0001\u0003ည\u0002", new Object[]{"bitField0_", "encryptedTopic_", "keyIdentifier_", "encapsulatedKey_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (EncryptedTopic.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public com.fyber.inneractive.sdk.protobuf.s getEncapsulatedKey() {
            return this.encapsulatedKey_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getEncryptedTopic() {
            return this.encryptedTopic_;
        }

        public String getKeyIdentifier() {
            return this.keyIdentifier_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getKeyIdentifierBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.keyIdentifier_);
        }

        public boolean hasEncapsulatedKey() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasEncryptedTopic() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasKeyIdentifier() {
            return (this.bitField0_ & 2) != 0;
        }

        public static l newBuilder(EncryptedTopic encryptedTopic) {
            return (l) DEFAULT_INSTANCE.createBuilder(encryptedTopic);
        }

        public static EncryptedTopic parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (EncryptedTopic) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static EncryptedTopic parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (EncryptedTopic) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static EncryptedTopic parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (EncryptedTopic) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static EncryptedTopic parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (EncryptedTopic) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static EncryptedTopic parseFrom(byte[] bArr) throws n1 {
            return (EncryptedTopic) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EncryptedTopic parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (EncryptedTopic) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static EncryptedTopic parseFrom(InputStream inputStream) throws IOException {
            return (EncryptedTopic) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EncryptedTopic parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (EncryptedTopic) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static EncryptedTopic parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (EncryptedTopic) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static EncryptedTopic parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (EncryptedTopic) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Experiment extends z0 implements o {
        private static final Experiment DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 1;
        private static volatile m2 PARSER = null;
        public static final int VARIANT_FIELD_NUMBER = 2;
        private int bitField0_;
        private String identifier_ = "";
        private String variant_ = "";

        static {
            Experiment experiment = new Experiment();
            DEFAULT_INSTANCE = experiment;
            z0.registerDefaultInstance(Experiment.class, experiment);
        }

        private Experiment() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifier() {
            this.bitField0_ &= -2;
            this.identifier_ = getDefaultInstance().getIdentifier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVariant() {
            this.bitField0_ &= -3;
            this.variant_ = getDefaultInstance().getVariant();
        }

        public static Experiment getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static n newBuilder() {
            return (n) DEFAULT_INSTANCE.createBuilder();
        }

        public static Experiment parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Experiment) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Experiment parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (Experiment) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifier(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.identifier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierBytes(com.fyber.inneractive.sdk.protobuf.s sVar) throws IllegalArgumentException {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.identifier_ = sVar.f();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVariant(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.variant_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVariantBytes(com.fyber.inneractive.sdk.protobuf.s sVar) throws IllegalArgumentException {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.variant_ = sVar.f();
            this.bitField0_ |= 2;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new Experiment();
                case 2:
                    return new n();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "identifier_", "variant_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (Experiment.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getIdentifier() {
            return this.identifier_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getIdentifierBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.identifier_);
        }

        public String getVariant() {
            return this.variant_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getVariantBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.variant_);
        }

        public boolean hasIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVariant() {
            return (this.bitField0_ & 2) != 0;
        }

        public static n newBuilder(Experiment experiment) {
            return (n) DEFAULT_INSTANCE.createBuilder(experiment);
        }

        public static Experiment parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (Experiment) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static Experiment parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (Experiment) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (Experiment) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (Experiment) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static Experiment parseFrom(byte[] bArr) throws n1 {
            return (Experiment) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Experiment parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (Experiment) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static Experiment parseFrom(InputStream inputStream) throws IOException {
            return (Experiment) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Experiment parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (Experiment) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (Experiment) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static Experiment parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (Experiment) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class LastAdomain extends z0 implements s {
        public static final int ADOMAIN_FIELD_NUMBER = 2;
        private static final LastAdomain DEFAULT_INSTANCE;
        private static volatile m2 PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String adomain_ = "";
        private int bitField0_;
        private int type_;

        static {
            LastAdomain lastAdomain = new LastAdomain();
            DEFAULT_INSTANCE = lastAdomain;
            z0.registerDefaultInstance(LastAdomain.class, lastAdomain);
        }

        private LastAdomain() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdomain() {
            this.bitField0_ &= -3;
            this.adomain_ = getDefaultInstance().getAdomain();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static LastAdomain getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static r newBuilder() {
            return (r) DEFAULT_INSTANCE.createBuilder();
        }

        public static LastAdomain parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LastAdomain) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdomain parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (LastAdomain) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdomain(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.adomain_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdomainBytes(com.fyber.inneractive.sdk.protobuf.s sVar) throws IllegalArgumentException {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.adomain_ = sVar.f();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(l0 l0Var) {
            this.type_ = l0Var.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.bitField0_ |= 1;
            this.type_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new LastAdomain();
                case 2:
                    return new r();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "type_", "adomain_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (LastAdomain.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getAdomain() {
            return this.adomain_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getAdomainBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.adomain_);
        }

        public l0 getType() {
            l0 l0VarA = l0.a(this.type_);
            return l0VarA == null ? l0.UNRECOGNIZED : l0VarA;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasAdomain() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static r newBuilder(LastAdomain lastAdomain) {
            return (r) DEFAULT_INSTANCE.createBuilder(lastAdomain);
        }

        public static LastAdomain parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (LastAdomain) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static LastAdomain parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (LastAdomain) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (LastAdomain) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (LastAdomain) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static LastAdomain parseFrom(byte[] bArr) throws n1 {
            return (LastAdomain) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LastAdomain parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (LastAdomain) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static LastAdomain parseFrom(InputStream inputStream) throws IOException {
            return (LastAdomain) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdomain parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (LastAdomain) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (LastAdomain) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static LastAdomain parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (LastAdomain) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class LastAdvertisedBundle extends z0 implements u {
        private static final LastAdvertisedBundle DEFAULT_INSTANCE;
        public static final int LASTBUNDLE_FIELD_NUMBER = 2;
        private static volatile m2 PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String lastBundle_ = "";
        private int type_;

        static {
            LastAdvertisedBundle lastAdvertisedBundle = new LastAdvertisedBundle();
            DEFAULT_INSTANCE = lastAdvertisedBundle;
            z0.registerDefaultInstance(LastAdvertisedBundle.class, lastAdvertisedBundle);
        }

        private LastAdvertisedBundle() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastBundle() {
            this.bitField0_ &= -3;
            this.lastBundle_ = getDefaultInstance().getLastBundle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static LastAdvertisedBundle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static t newBuilder() {
            return (t) DEFAULT_INSTANCE.createBuilder();
        }

        public static LastAdvertisedBundle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LastAdvertisedBundle) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdvertisedBundle parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (LastAdvertisedBundle) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastBundle(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.lastBundle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastBundleBytes(com.fyber.inneractive.sdk.protobuf.s sVar) throws IllegalArgumentException {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.lastBundle_ = sVar.f();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(l0 l0Var) {
            this.type_ = l0Var.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.bitField0_ |= 1;
            this.type_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new LastAdvertisedBundle();
                case 2:
                    return new t();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "type_", "lastBundle_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (LastAdvertisedBundle.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getLastBundle() {
            return this.lastBundle_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getLastBundleBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.lastBundle_);
        }

        public l0 getType() {
            l0 l0VarA = l0.a(this.type_);
            return l0VarA == null ? l0.UNRECOGNIZED : l0VarA;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasLastBundle() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static t newBuilder(LastAdvertisedBundle lastAdvertisedBundle) {
            return (t) DEFAULT_INSTANCE.createBuilder(lastAdvertisedBundle);
        }

        public static LastAdvertisedBundle parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (LastAdvertisedBundle) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static LastAdvertisedBundle parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (LastAdvertisedBundle) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (LastAdvertisedBundle) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (LastAdvertisedBundle) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static LastAdvertisedBundle parseFrom(byte[] bArr) throws n1 {
            return (LastAdvertisedBundle) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LastAdvertisedBundle parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (LastAdvertisedBundle) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static LastAdvertisedBundle parseFrom(InputStream inputStream) throws IOException {
            return (LastAdvertisedBundle) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastAdvertisedBundle parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (LastAdvertisedBundle) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (LastAdvertisedBundle) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static LastAdvertisedBundle parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (LastAdvertisedBundle) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NullableBool extends z0 implements e2 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableBool DEFAULT_INSTANCE;
        private static volatile m2 PARSER;
        private int bitField0_;
        private boolean data_;

        static {
            NullableBool nullableBool = new NullableBool();
            DEFAULT_INSTANCE = nullableBool;
            z0.registerDefaultInstance(NullableBool.class, nullableBool);
        }

        private NullableBool() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = false;
        }

        public static NullableBool getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static v newBuilder() {
            return (v) DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableBool parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableBool) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableBool parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (NullableBool) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(boolean z10) {
            this.bitField0_ |= 1;
            this.data_ = z10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new NullableBool();
                case 2:
                    return new v();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (NullableBool.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static v newBuilder(NullableBool nullableBool) {
            return (v) DEFAULT_INSTANCE.createBuilder(nullableBool);
        }

        public static NullableBool parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableBool) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static NullableBool parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableBool) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (NullableBool) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableBool) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static NullableBool parseFrom(byte[] bArr) throws n1 {
            return (NullableBool) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableBool parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableBool) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static NullableBool parseFrom(InputStream inputStream) throws IOException {
            return (NullableBool) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableBool parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableBool) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (NullableBool) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static NullableBool parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableBool) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NullableFloat extends z0 implements e2 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableFloat DEFAULT_INSTANCE;
        private static volatile m2 PARSER;
        private int bitField0_;
        private float data_;

        static {
            NullableFloat nullableFloat = new NullableFloat();
            DEFAULT_INSTANCE = nullableFloat;
            z0.registerDefaultInstance(NullableFloat.class, nullableFloat);
        }

        private NullableFloat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0.0f;
        }

        public static NullableFloat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static w newBuilder() {
            return (w) DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableFloat parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableFloat) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableFloat parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (NullableFloat) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(float f10) {
            this.bitField0_ |= 1;
            this.data_ = f10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new NullableFloat();
                case 2:
                    return new w();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (NullableFloat.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public float getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static w newBuilder(NullableFloat nullableFloat) {
            return (w) DEFAULT_INSTANCE.createBuilder(nullableFloat);
        }

        public static NullableFloat parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableFloat) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static NullableFloat parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableFloat) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (NullableFloat) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableFloat) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static NullableFloat parseFrom(byte[] bArr) throws n1 {
            return (NullableFloat) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableFloat parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableFloat) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static NullableFloat parseFrom(InputStream inputStream) throws IOException {
            return (NullableFloat) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableFloat parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableFloat) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (NullableFloat) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static NullableFloat parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableFloat) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NullableSInt32 extends z0 implements e2 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableSInt32 DEFAULT_INSTANCE;
        private static volatile m2 PARSER;
        private int bitField0_;
        private int data_;

        static {
            NullableSInt32 nullableSInt32 = new NullableSInt32();
            DEFAULT_INSTANCE = nullableSInt32;
            z0.registerDefaultInstance(NullableSInt32.class, nullableSInt32);
        }

        private NullableSInt32() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0;
        }

        public static NullableSInt32 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static x newBuilder() {
            return (x) DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableSInt32 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableSInt32) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableSInt32 parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (NullableSInt32) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(int i10) {
            this.bitField0_ |= 1;
            this.data_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new NullableSInt32();
                case 2:
                    return new x();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဏ\u0000", new Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (NullableSInt32.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static x newBuilder(NullableSInt32 nullableSInt32) {
            return (x) DEFAULT_INSTANCE.createBuilder(nullableSInt32);
        }

        public static NullableSInt32 parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableSInt32) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static NullableSInt32 parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableSInt32) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (NullableSInt32) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableSInt32) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static NullableSInt32 parseFrom(byte[] bArr) throws n1 {
            return (NullableSInt32) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableSInt32 parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableSInt32) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static NullableSInt32 parseFrom(InputStream inputStream) throws IOException {
            return (NullableSInt32) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableSInt32 parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableSInt32) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (NullableSInt32) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static NullableSInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableSInt32) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NullableString extends z0 implements e2 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableString DEFAULT_INSTANCE;
        private static volatile m2 PARSER;
        private int bitField0_;
        private String data_ = "";

        static {
            NullableString nullableString = new NullableString();
            DEFAULT_INSTANCE = nullableString;
            z0.registerDefaultInstance(NullableString.class, nullableString);
        }

        private NullableString() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = getDefaultInstance().getData();
        }

        public static NullableString getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static y newBuilder() {
            return (y) DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableString parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableString) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableString parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (NullableString) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.data_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataBytes(com.fyber.inneractive.sdk.protobuf.s sVar) throws IllegalArgumentException {
            com.fyber.inneractive.sdk.protobuf.b.checkByteStringIsUtf8(sVar);
            this.data_ = sVar.f();
            this.bitField0_ |= 1;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new NullableString();
                case 2:
                    return new y();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (NullableString.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getData() {
            return this.data_;
        }

        public com.fyber.inneractive.sdk.protobuf.s getDataBytes() {
            return com.fyber.inneractive.sdk.protobuf.s.a(this.data_);
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static y newBuilder(NullableString nullableString) {
            return (y) DEFAULT_INSTANCE.createBuilder(nullableString);
        }

        public static NullableString parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableString) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static NullableString parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableString) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (NullableString) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableString) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static NullableString parseFrom(byte[] bArr) throws n1 {
            return (NullableString) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableString parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableString) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static NullableString parseFrom(InputStream inputStream) throws IOException {
            return (NullableString) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableString parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableString) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (NullableString) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static NullableString parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableString) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class NullableUInt32 extends z0 implements e2 {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final NullableUInt32 DEFAULT_INSTANCE;
        private static volatile m2 PARSER;
        private int bitField0_;
        private int data_;

        static {
            NullableUInt32 nullableUInt32 = new NullableUInt32();
            DEFAULT_INSTANCE = nullableUInt32;
            z0.registerDefaultInstance(NullableUInt32.class, nullableUInt32);
        }

        private NullableUInt32() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = 0;
        }

        public static NullableUInt32 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static z newBuilder() {
            return (z) DEFAULT_INSTANCE.createBuilder();
        }

        public static NullableUInt32 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NullableUInt32) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableUInt32 parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (NullableUInt32) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(int i10) {
            this.bitField0_ |= 1;
            this.data_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new NullableUInt32();
                case 2:
                    return new z();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (NullableUInt32.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getData() {
            return this.data_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static z newBuilder(NullableUInt32 nullableUInt32) {
            return (z) DEFAULT_INSTANCE.createBuilder(nullableUInt32);
        }

        public static NullableUInt32 parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableUInt32) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static NullableUInt32 parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableUInt32) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (NullableUInt32) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableUInt32) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static NullableUInt32 parseFrom(byte[] bArr) throws n1 {
            return (NullableUInt32) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NullableUInt32 parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (NullableUInt32) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static NullableUInt32 parseFrom(InputStream inputStream) throws IOException {
            return (NullableUInt32) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NullableUInt32 parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableUInt32) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (NullableUInt32) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static NullableUInt32 parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (NullableUInt32) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PriorVideoClickType extends z0 implements b0 {
        public static final int CLICKTYPE_FIELD_NUMBER = 2;
        private static final PriorVideoClickType DEFAULT_INSTANCE;
        private static volatile m2 PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int clickType_;
        private int type_;

        static {
            PriorVideoClickType priorVideoClickType = new PriorVideoClickType();
            DEFAULT_INSTANCE = priorVideoClickType;
            z0.registerDefaultInstance(PriorVideoClickType.class, priorVideoClickType);
        }

        private PriorVideoClickType() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClickType() {
            this.bitField0_ &= -3;
            this.clickType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static PriorVideoClickType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a0 newBuilder() {
            return (a0) DEFAULT_INSTANCE.createBuilder();
        }

        public static PriorVideoClickType parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PriorVideoClickType) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriorVideoClickType parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (PriorVideoClickType) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickType(r0 r0Var) {
            this.clickType_ = r0Var.a();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickTypeValue(int i10) {
            this.bitField0_ |= 2;
            this.clickType_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(l0 l0Var) {
            this.type_ = l0Var.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.bitField0_ |= 1;
            this.type_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new PriorVideoClickType();
                case 2:
                    return new a0();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "type_", "clickType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (PriorVideoClickType.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public r0 getClickType() {
            int i10 = this.clickType_;
            r0 r0Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? null : r0.STOREPROMO : r0.APPINFO : r0.VIDEOVIEW : r0.COMPANION : r0.CTABUTTON : r0.NOCLICK;
            return r0Var == null ? r0.UNRECOGNIZED : r0Var;
        }

        public int getClickTypeValue() {
            return this.clickType_;
        }

        public l0 getType() {
            l0 l0VarA = l0.a(this.type_);
            return l0VarA == null ? l0.UNRECOGNIZED : l0VarA;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasClickType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a0 newBuilder(PriorVideoClickType priorVideoClickType) {
            return (a0) DEFAULT_INSTANCE.createBuilder(priorVideoClickType);
        }

        public static PriorVideoClickType parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (PriorVideoClickType) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static PriorVideoClickType parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (PriorVideoClickType) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (PriorVideoClickType) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (PriorVideoClickType) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static PriorVideoClickType parseFrom(byte[] bArr) throws n1 {
            return (PriorVideoClickType) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PriorVideoClickType parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (PriorVideoClickType) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static PriorVideoClickType parseFrom(InputStream inputStream) throws IOException {
            return (PriorVideoClickType) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PriorVideoClickType parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (PriorVideoClickType) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (PriorVideoClickType) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static PriorVideoClickType parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (PriorVideoClickType) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SessionData extends z0 implements f0 {
        public static final int CLICKS_FIELD_NUMBER = 2;
        public static final int COMPLETIONS_FIELD_NUMBER = 3;
        private static final SessionData DEFAULT_INSTANCE;
        public static final int IMPRESSIONS_FIELD_NUMBER = 1;
        private static volatile m2 PARSER;
        private int bitField0_;
        private int clicks_;
        private int completions_;
        private int impressions_;

        static {
            SessionData sessionData = new SessionData();
            DEFAULT_INSTANCE = sessionData;
            z0.registerDefaultInstance(SessionData.class, sessionData);
        }

        private SessionData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClicks() {
            this.bitField0_ &= -3;
            this.clicks_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompletions() {
            this.bitField0_ &= -5;
            this.completions_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressions() {
            this.bitField0_ &= -2;
            this.impressions_ = 0;
        }

        public static SessionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static e0 newBuilder() {
            return (e0) DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionData) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (SessionData) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClicks(int i10) {
            this.bitField0_ |= 2;
            this.clicks_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompletions(int i10) {
            this.bitField0_ |= 4;
            this.completions_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressions(int i10) {
            this.bitField0_ |= 1;
            this.impressions_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new SessionData();
                case 2:
                    return new e0();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "impressions_", "clicks_", "completions_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (SessionData.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getClicks() {
            return this.clicks_;
        }

        public int getCompletions() {
            return this.completions_;
        }

        public int getImpressions() {
            return this.impressions_;
        }

        public boolean hasClicks() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasCompletions() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasImpressions() {
            return (this.bitField0_ & 1) != 0;
        }

        public static e0 newBuilder(SessionData sessionData) {
            return (e0) DEFAULT_INSTANCE.createBuilder(sessionData);
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (SessionData) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (SessionData) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (SessionData) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (SessionData) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static SessionData parseFrom(byte[] bArr) throws n1 {
            return (SessionData) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionData parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (SessionData) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static SessionData parseFrom(InputStream inputStream) throws IOException {
            return (SessionData) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionData parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (SessionData) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (SessionData) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static SessionData parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (SessionData) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Topic extends z0 implements h0 {
        private static final Topic DEFAULT_INSTANCE;
        public static final int MODELVERSION_FIELD_NUMBER = 3;
        private static volatile m2 PARSER = null;
        public static final int TAXONOMYVERSION_FIELD_NUMBER = 2;
        public static final int TOPICID_FIELD_NUMBER = 1;
        private int bitField0_;
        private long modelVersion_;
        private long taxonomyVersion_;
        private int topicId_;

        static {
            Topic topic = new Topic();
            DEFAULT_INSTANCE = topic;
            z0.registerDefaultInstance(Topic.class, topic);
        }

        private Topic() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModelVersion() {
            this.bitField0_ &= -5;
            this.modelVersion_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTaxonomyVersion() {
            this.bitField0_ &= -3;
            this.taxonomyVersion_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopicId() {
            this.bitField0_ &= -2;
            this.topicId_ = 0;
        }

        public static Topic getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static g0 newBuilder() {
            return (g0) DEFAULT_INSTANCE.createBuilder();
        }

        public static Topic parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Topic) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Topic parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (Topic) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelVersion(long j10) {
            this.bitField0_ |= 4;
            this.modelVersion_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTaxonomyVersion(long j10) {
            this.bitField0_ |= 2;
            this.taxonomyVersion_ = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopicId(int i10) {
            this.bitField0_ |= 1;
            this.topicId_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new Topic();
                case 2:
                    return new g0();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"bitField0_", "topicId_", "taxonomyVersion_", "modelVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (Topic.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public long getModelVersion() {
            return this.modelVersion_;
        }

        public long getTaxonomyVersion() {
            return this.taxonomyVersion_;
        }

        public int getTopicId() {
            return this.topicId_;
        }

        public boolean hasModelVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTaxonomyVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasTopicId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static g0 newBuilder(Topic topic) {
            return (g0) DEFAULT_INSTANCE.createBuilder(topic);
        }

        public static Topic parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (Topic) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static Topic parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (Topic) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static Topic parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (Topic) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        public static Topic parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (Topic) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static Topic parseFrom(byte[] bArr) throws n1 {
            return (Topic) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Topic parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (Topic) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static Topic parseFrom(InputStream inputStream) throws IOException {
            return (Topic) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Topic parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (Topic) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static Topic parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (Topic) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static Topic parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (Topic) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UserSession extends z0 implements p0 {
        private static final UserSession DEFAULT_INSTANCE;
        private static volatile m2 PARSER = null;
        public static final int SESSIONDATAITEMS_FIELD_NUMBER = 3;
        public static final int SUBTYPE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private k1 sessionDataItems_ = z0.emptyProtobufList();
        private int subType_;
        private int type_;

        static {
            UserSession userSession = new UserSession();
            DEFAULT_INSTANCE = userSession;
            z0.registerDefaultInstance(UserSession.class, userSession);
        }

        private UserSession() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSessionDataItems(Iterable<? extends SessionData> iterable) {
            ensureSessionDataItemsIsMutable();
            com.fyber.inneractive.sdk.protobuf.b.addAll((Iterable) iterable, (List) this.sessionDataItems_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSessionDataItems(SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.add(sessionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionDataItems() {
            this.sessionDataItems_ = z0.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubType() {
            this.bitField0_ &= -3;
            this.subType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        private void ensureSessionDataItemsIsMutable() {
            k1 k1Var = this.sessionDataItems_;
            if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f26354a) {
                return;
            }
            this.sessionDataItems_ = z0.mutableCopy(k1Var);
        }

        public static UserSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static o0 newBuilder() {
            return (o0) DEFAULT_INSTANCE.createBuilder();
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserSession) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer) throws n1 {
            return (UserSession) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSessionDataItems(int i10) {
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionDataItems(int i10, SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.set(i10, sessionData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubType(j0 j0Var) {
            this.subType_ = j0Var.a();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubTypeValue(int i10) {
            this.bitField0_ |= 2;
            this.subType_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(l0 l0Var) {
            this.type_ = l0Var.a();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.bitField0_ |= 1;
            this.type_ = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.z0
        public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
            m2 u0Var;
            switch (i.f23120a[y0Var.ordinal()]) {
                case 1:
                    return new UserSession();
                case 2:
                    return new o0();
                case 3:
                    return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"bitField0_", "type_", "subType_", "sessionDataItems_", SessionData.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (UserSession.class) {
                        try {
                            u0Var = PARSER;
                            if (u0Var == null) {
                                u0Var = new u0();
                                PARSER = u0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return u0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public SessionData getSessionDataItems(int i10) {
            return (SessionData) this.sessionDataItems_.get(i10);
        }

        public int getSessionDataItemsCount() {
            return this.sessionDataItems_.size();
        }

        public List<SessionData> getSessionDataItemsList() {
            return this.sessionDataItems_;
        }

        public f0 getSessionDataItemsOrBuilder(int i10) {
            return (f0) this.sessionDataItems_.get(i10);
        }

        public List<? extends f0> getSessionDataItemsOrBuilderList() {
            return this.sessionDataItems_;
        }

        public j0 getSubType() {
            int i10 = this.subType_;
            j0 j0Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? null : j0.VIDEO : j0.DISPLAY : j0.UNITCONTENTTYPEUNKNOWN;
            return j0Var == null ? j0.UNRECOGNIZED : j0Var;
        }

        public int getSubTypeValue() {
            return this.subType_;
        }

        public l0 getType() {
            l0 l0VarA = l0.a(this.type_);
            return l0VarA == null ? l0.UNRECOGNIZED : l0VarA;
        }

        public int getTypeValue() {
            return this.type_;
        }

        public boolean hasSubType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static o0 newBuilder(UserSession userSession) {
            return (o0) DEFAULT_INSTANCE.createBuilder(userSession);
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (UserSession) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (UserSession) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
            return (UserSession) z0.parseFrom(DEFAULT_INSTANCE, sVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSessionDataItems(int i10, SessionData sessionData) {
            sessionData.getClass();
            ensureSessionDataItemsIsMutable();
            this.sessionDataItems_.add(i10, sessionData);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (UserSession) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
        }

        public static UserSession parseFrom(byte[] bArr) throws n1 {
            return (UserSession) z0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserSession parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
            return (UserSession) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
        }

        public static UserSession parseFrom(InputStream inputStream) throws IOException {
            return (UserSession) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserSession parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (UserSession) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
            return (UserSession) z0.parseFrom(DEFAULT_INSTANCE, wVar);
        }

        public static UserSession parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
            return (UserSession) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
        }
    }

    static {
        TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters = new TokenParametersOuterClass$TokenParameters();
        DEFAULT_INSTANCE = tokenParametersOuterClass$TokenParameters;
        z0.registerDefaultInstance(TokenParametersOuterClass$TokenParameters.class, tokenParametersOuterClass$TokenParameters);
    }

    private TokenParametersOuterClass$TokenParameters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAbExperiments(Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAbExperiments(Iterable<? extends Experiment> iterable) {
        ensureAbExperimentsIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((Iterable) iterable, (List) this.abExperiments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEncryptedTopics(Iterable<? extends EncryptedTopic> iterable) {
        ensureEncryptedTopicsIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((Iterable) iterable, (List) this.encryptedTopics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLastAdomains(Iterable<? extends LastAdomain> iterable) {
        ensureLastAdomainsIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((Iterable) iterable, (List) this.lastAdomains_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLastAdvertisedBundles(Iterable<? extends LastAdvertisedBundle> iterable) {
        ensureLastAdvertisedBundlesIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((Iterable) iterable, (List) this.lastAdvertisedBundles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPriorClickTypes(Iterable<? extends PriorVideoClickType> iterable) {
        ensurePriorClickTypesIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((Iterable) iterable, (List) this.priorClickTypes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPriorClicks(Iterable<? extends l0> iterable) {
        ensurePriorClicksIsMutable();
        for (l0 l0Var : iterable) {
            ((a1) this.priorClicks_).c(l0Var.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPriorClicksValue(Iterable<Integer> iterable) {
        ensurePriorClicksIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            ((a1) this.priorClicks_).c(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTopics(Iterable<? extends Topic> iterable) {
        ensureTopicsIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((Iterable) iterable, (List) this.topics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUserSessions(Iterable<? extends UserSession> iterable) {
        ensureUserSessionsIsMutable();
        com.fyber.inneractive.sdk.protobuf.b.addAll((Iterable) iterable, (List) this.userSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEncryptedTopics(EncryptedTopic encryptedTopic) {
        encryptedTopic.getClass();
        ensureEncryptedTopicsIsMutable();
        this.encryptedTopics_.add(encryptedTopic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdomains(LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.add(lastAdomain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdvertisedBundles(LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.add(lastAdvertisedBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClickTypes(PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.add(priorVideoClickType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClicks(l0 l0Var) {
        l0Var.getClass();
        ensurePriorClicksIsMutable();
        ((a1) this.priorClicks_).c(l0Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClicksValue(int i10) {
        ensurePriorClicksIsMutable();
        ((a1) this.priorClicks_).c(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopics(Topic topic) {
        topic.getClass();
        ensureTopicsIsMutable();
        this.topics_.add(topic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUserSessions(UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.add(userSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAaid() {
        this.aaid_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbExperiments() {
        this.abExperiments_ = z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdServicesVersion() {
        this.adServicesVersion_ = null;
        this.bitField0_ &= -16777217;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAirplaneMode() {
        this.airplaneMode_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAmazonId() {
        this.amazonId_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppBuildVersion() {
        this.appBuildVersion_ = null;
        this.bitField0_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppSetId() {
        this.appSetId_ = null;
        this.bitField0_ &= -8388609;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersion() {
        this.appVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryCharging() {
        this.batteryCharging_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryLevel() {
        this.batteryLevel_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBluetoothPlugged() {
        this.bluetoothPlugged_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBundleID() {
        this.bundleID_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarrierName() {
        this.carrierName_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcpaString() {
        this.ccpaString_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildMode() {
        this.childMode_ = null;
        this.bitField0_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoppaApplies() {
        this.coppaApplies_ = null;
        this.bitField0_ &= -1048577;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.countryCode_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDarkMode() {
        this.darkMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceApi() {
        this.deviceApi_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceHeight() {
        this.deviceHeight_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceLanguage() {
        this.deviceLanguage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.deviceModel_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceOS() {
        this.deviceOS_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceWidth() {
        this.deviceWidth_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDndMode() {
        this.dndMode_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDnt() {
        this.bitField0_ &= -17;
        this.dnt_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptedTopics() {
        this.encryptedTopics_ = z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrameworkName() {
        this.frameworkName_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeSpace() {
        this.freeSpace_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGdprConsent() {
        this.gdprConsent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGdprString() {
        this.gdprString_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeadsetPlugged() {
        this.headsetPlugged_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHorAccuracy() {
        this.horAccuracy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdfa() {
        this.idfa_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdfv() {
        this.idfv_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgnitePackageName() {
        this.ignitePackageName_ = null;
        this.bitField0_ &= -262145;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgniteVersion() {
        this.igniteVersion_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInputLanguages() {
        this.inputLanguages_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsRingMuted() {
        this.isRingMuted_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeywords() {
        this.keywords_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAdomains() {
        this.lastAdomains_ = z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAdvertisedBundles() {
        this.lastAdvertisedBundles_ = z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLgpdConsent() {
        this.lgpdConsent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLowPowerMode() {
        this.lowPowerMode_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaMuted() {
        this.mediaMuted_ = null;
        this.bitField0_ &= -4194305;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediationType() {
        this.mediationType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileCountryCode() {
        this.mobileCountryCode_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileNetworkCode() {
        this.mobileNetworkCode_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMockResponseId() {
        this.mockResponseId_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMuteAudio() {
        this.muteAudio_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetwork() {
        this.network_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOdt() {
        this.odt_ = null;
        this.bitField0_ &= -2097153;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffsetFromGMT() {
        this.offsetFromGMT_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortal() {
        this.portal_ = null;
        this.bitField0_ &= -32769;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriorClickTypes() {
        this.priorClickTypes_ = z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriorClicks() {
        this.priorClicks_ = z0.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriorSkip() {
        this.priorSkip_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPxRatio() {
        this.pxRatio_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.sdkVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecureContent() {
        this.secureContent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionDuration() {
        this.sessionDuration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeAccuracy() {
        this.timeAccuracy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopics() {
        this.topics_ = z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalSpace() {
        this.totalSpace_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackingStatus() {
        this.trackingStatus_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAge() {
        this.userAge_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.userAgent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserGender() {
        this.userGender_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserID() {
        this.userID_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserSessions() {
        this.userSessions_ = z0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerAccuracy() {
        this.verAccuracy_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZipCode() {
        this.zipCode_ = null;
    }

    private void ensureAbExperimentsIsMutable() {
        k1 k1Var = this.abExperiments_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f26354a) {
            return;
        }
        this.abExperiments_ = z0.mutableCopy(k1Var);
    }

    private void ensureEncryptedTopicsIsMutable() {
        k1 k1Var = this.encryptedTopics_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f26354a) {
            return;
        }
        this.encryptedTopics_ = z0.mutableCopy(k1Var);
    }

    private void ensureLastAdomainsIsMutable() {
        k1 k1Var = this.lastAdomains_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f26354a) {
            return;
        }
        this.lastAdomains_ = z0.mutableCopy(k1Var);
    }

    private void ensureLastAdvertisedBundlesIsMutable() {
        k1 k1Var = this.lastAdvertisedBundles_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f26354a) {
            return;
        }
        this.lastAdvertisedBundles_ = z0.mutableCopy(k1Var);
    }

    private void ensurePriorClickTypesIsMutable() {
        k1 k1Var = this.priorClickTypes_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f26354a) {
            return;
        }
        this.priorClickTypes_ = z0.mutableCopy(k1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensurePriorClicksIsMutable() {
        g1 g1Var = this.priorClicks_;
        if (((com.fyber.inneractive.sdk.protobuf.c) g1Var).f26354a) {
            return;
        }
        this.priorClicks_ = z0.mutableCopy(g1Var);
    }

    private void ensureTopicsIsMutable() {
        k1 k1Var = this.topics_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f26354a) {
            return;
        }
        this.topics_ = z0.mutableCopy(k1Var);
    }

    private void ensureUserSessionsIsMutable() {
        k1 k1Var = this.userSessions_;
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f26354a) {
            return;
        }
        this.userSessions_ = z0.mutableCopy(k1Var);
    }

    public static TokenParametersOuterClass$TokenParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAaid(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.aaid_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.aaid_ = nullableString;
        } else {
            y yVarNewBuilder = NullableString.newBuilder(this.aaid_);
            yVarNewBuilder.c();
            t0.a(yVarNewBuilder.f26483b, nullableString);
            this.aaid_ = (NullableString) yVarNewBuilder.b();
        }
        this.bitField0_ |= Segment.SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdServicesVersion(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.adServicesVersion_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.adServicesVersion_ = nullableUInt32;
        } else {
            z zVarNewBuilder = NullableUInt32.newBuilder(this.adServicesVersion_);
            zVarNewBuilder.c();
            t0.a(zVarNewBuilder.f26483b, nullableUInt32);
            this.adServicesVersion_ = (NullableUInt32) zVarNewBuilder.b();
        }
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAirplaneMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.airplaneMode_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.airplaneMode_ = nullableBool;
        } else {
            v vVarNewBuilder = NullableBool.newBuilder(this.airplaneMode_);
            vVarNewBuilder.c();
            t0.a(vVarNewBuilder.f26483b, nullableBool);
            this.airplaneMode_ = (NullableBool) vVarNewBuilder.b();
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAmazonId(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.amazonId_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.amazonId_ = nullableString;
        } else {
            y yVarNewBuilder = NullableString.newBuilder(this.amazonId_);
            yVarNewBuilder.c();
            t0.a(yVarNewBuilder.f26483b, nullableString);
            this.amazonId_ = (NullableString) yVarNewBuilder.b();
        }
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppBuildVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.appBuildVersion_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.appBuildVersion_ = nullableString;
        } else {
            y yVarNewBuilder = NullableString.newBuilder(this.appBuildVersion_);
            yVarNewBuilder.c();
            t0.a(yVarNewBuilder.f26483b, nullableString);
            this.appBuildVersion_ = (NullableString) yVarNewBuilder.b();
        }
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppSetId(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.appSetId_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.appSetId_ = nullableString;
        } else {
            y yVarNewBuilder = NullableString.newBuilder(this.appSetId_);
            yVarNewBuilder.c();
            t0.a(yVarNewBuilder.f26483b, nullableString);
            this.appSetId_ = (NullableString) yVarNewBuilder.b();
        }
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.appVersion_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.appVersion_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.appVersion_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.appVersion_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBatteryCharging(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.batteryCharging_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.batteryCharging_ = nullableBool;
            return;
        }
        v vVarNewBuilder = NullableBool.newBuilder(this.batteryCharging_);
        vVarNewBuilder.c();
        t0.a(vVarNewBuilder.f26483b, nullableBool);
        this.batteryCharging_ = (NullableBool) vVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBatteryLevel(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.batteryLevel_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.batteryLevel_ = nullableUInt32;
            return;
        }
        z zVarNewBuilder = NullableUInt32.newBuilder(this.batteryLevel_);
        zVarNewBuilder.c();
        t0.a(zVarNewBuilder.f26483b, nullableUInt32);
        this.batteryLevel_ = (NullableUInt32) zVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBluetoothPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.bluetoothPlugged_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.bluetoothPlugged_ = nullableBool;
        } else {
            v vVarNewBuilder = NullableBool.newBuilder(this.bluetoothPlugged_);
            vVarNewBuilder.c();
            t0.a(vVarNewBuilder.f26483b, nullableBool);
            this.bluetoothPlugged_ = (NullableBool) vVarNewBuilder.b();
        }
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBundleID(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.bundleID_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.bundleID_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.bundleID_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.bundleID_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarrierName(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.carrierName_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.carrierName_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.carrierName_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.carrierName_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCcpaString(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.ccpaString_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.ccpaString_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.ccpaString_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.ccpaString_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChildMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.childMode_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.childMode_ = nullableBool;
        } else {
            v vVarNewBuilder = NullableBool.newBuilder(this.childMode_);
            vVarNewBuilder.c();
            t0.a(vVarNewBuilder.f26483b, nullableBool);
            this.childMode_ = (NullableBool) vVarNewBuilder.b();
        }
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoppaApplies(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.coppaApplies_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.coppaApplies_ = nullableBool;
        } else {
            v vVarNewBuilder = NullableBool.newBuilder(this.coppaApplies_);
            vVarNewBuilder.c();
            t0.a(vVarNewBuilder.f26483b, nullableBool);
            this.coppaApplies_ = (NullableBool) vVarNewBuilder.b();
        }
        this.bitField0_ |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCountryCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.countryCode_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.countryCode_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.countryCode_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.countryCode_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceApi(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceApi_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.deviceApi_ = nullableUInt32;
        } else {
            z zVarNewBuilder = NullableUInt32.newBuilder(this.deviceApi_);
            zVarNewBuilder.c();
            t0.a(zVarNewBuilder.f26483b, nullableUInt32);
            this.deviceApi_ = (NullableUInt32) zVarNewBuilder.b();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceHeight(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceHeight_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.deviceHeight_ = nullableUInt32;
            return;
        }
        z zVarNewBuilder = NullableUInt32.newBuilder(this.deviceHeight_);
        zVarNewBuilder.c();
        t0.a(zVarNewBuilder.f26483b, nullableUInt32);
        this.deviceHeight_ = (NullableUInt32) zVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceLanguage(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceLanguage_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.deviceLanguage_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.deviceLanguage_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.deviceLanguage_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceModel(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceModel_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.deviceModel_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.deviceModel_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.deviceModel_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceOS(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.deviceOS_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.deviceOS_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.deviceOS_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.deviceOS_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceWidth(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.deviceWidth_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.deviceWidth_ = nullableUInt32;
            return;
        }
        z zVarNewBuilder = NullableUInt32.newBuilder(this.deviceWidth_);
        zVarNewBuilder.c();
        t0.a(zVarNewBuilder.f26483b, nullableUInt32);
        this.deviceWidth_ = (NullableUInt32) zVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDndMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.dndMode_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.dndMode_ = nullableBool;
        } else {
            v vVarNewBuilder = NullableBool.newBuilder(this.dndMode_);
            vVarNewBuilder.c();
            t0.a(vVarNewBuilder.f26483b, nullableBool);
            this.dndMode_ = (NullableBool) vVarNewBuilder.b();
        }
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFreeSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.freeSpace_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.freeSpace_ = nullableUInt32;
            return;
        }
        z zVarNewBuilder = NullableUInt32.newBuilder(this.freeSpace_);
        zVarNewBuilder.c();
        t0.a(zVarNewBuilder.f26483b, nullableUInt32);
        this.freeSpace_ = (NullableUInt32) zVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGdprConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.gdprConsent_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.gdprConsent_ = nullableBool;
            return;
        }
        v vVarNewBuilder = NullableBool.newBuilder(this.gdprConsent_);
        vVarNewBuilder.c();
        t0.a(vVarNewBuilder.f26483b, nullableBool);
        this.gdprConsent_ = (NullableBool) vVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGdprString(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.gdprString_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.gdprString_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.gdprString_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.gdprString_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeadsetPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.headsetPlugged_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.headsetPlugged_ = nullableBool;
        } else {
            v vVarNewBuilder = NullableBool.newBuilder(this.headsetPlugged_);
            vVarNewBuilder.c();
            t0.a(vVarNewBuilder.f26483b, nullableBool);
            this.headsetPlugged_ = (NullableBool) vVarNewBuilder.b();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHorAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.horAccuracy_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.horAccuracy_ = nullableFloat;
            return;
        }
        w wVarNewBuilder = NullableFloat.newBuilder(this.horAccuracy_);
        wVarNewBuilder.c();
        t0.a(wVarNewBuilder.f26483b, nullableFloat);
        this.horAccuracy_ = (NullableFloat) wVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIdfa(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.idfa_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.idfa_ = nullableString;
        } else {
            y yVarNewBuilder = NullableString.newBuilder(this.idfa_);
            yVarNewBuilder.c();
            t0.a(yVarNewBuilder.f26483b, nullableString);
            this.idfa_ = (NullableString) yVarNewBuilder.b();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIdfv(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.idfv_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.idfv_ = nullableString;
        } else {
            y yVarNewBuilder = NullableString.newBuilder(this.idfv_);
            yVarNewBuilder.c();
            t0.a(yVarNewBuilder.f26483b, nullableString);
            this.idfv_ = (NullableString) yVarNewBuilder.b();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIgnitePackageName(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.ignitePackageName_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.ignitePackageName_ = nullableString;
        } else {
            y yVarNewBuilder = NullableString.newBuilder(this.ignitePackageName_);
            yVarNewBuilder.c();
            t0.a(yVarNewBuilder.f26483b, nullableString);
            this.ignitePackageName_ = (NullableString) yVarNewBuilder.b();
        }
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIgniteVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.igniteVersion_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.igniteVersion_ = nullableString;
        } else {
            y yVarNewBuilder = NullableString.newBuilder(this.igniteVersion_);
            yVarNewBuilder.c();
            t0.a(yVarNewBuilder.f26483b, nullableString);
            this.igniteVersion_ = (NullableString) yVarNewBuilder.b();
        }
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInputLanguages(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.inputLanguages_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.inputLanguages_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.inputLanguages_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.inputLanguages_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIsRingMuted(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.isRingMuted_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.isRingMuted_ = nullableBool;
        } else {
            v vVarNewBuilder = NullableBool.newBuilder(this.isRingMuted_);
            vVarNewBuilder.c();
            t0.a(vVarNewBuilder.f26483b, nullableBool);
            this.isRingMuted_ = (NullableBool) vVarNewBuilder.b();
        }
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeywords(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.keywords_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.keywords_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.keywords_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.keywords_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLatitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.latitude_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.latitude_ = nullableFloat;
            return;
        }
        w wVarNewBuilder = NullableFloat.newBuilder(this.latitude_);
        wVarNewBuilder.c();
        t0.a(wVarNewBuilder.f26483b, nullableFloat);
        this.latitude_ = (NullableFloat) wVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLgpdConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.lgpdConsent_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.lgpdConsent_ = nullableBool;
            return;
        }
        v vVarNewBuilder = NullableBool.newBuilder(this.lgpdConsent_);
        vVarNewBuilder.c();
        t0.a(vVarNewBuilder.f26483b, nullableBool);
        this.lgpdConsent_ = (NullableBool) vVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLongitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.longitude_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.longitude_ = nullableFloat;
            return;
        }
        w wVarNewBuilder = NullableFloat.newBuilder(this.longitude_);
        wVarNewBuilder.c();
        t0.a(wVarNewBuilder.f26483b, nullableFloat);
        this.longitude_ = (NullableFloat) wVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLowPowerMode(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.lowPowerMode_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.lowPowerMode_ = nullableBool;
        } else {
            v vVarNewBuilder = NullableBool.newBuilder(this.lowPowerMode_);
            vVarNewBuilder.c();
            t0.a(vVarNewBuilder.f26483b, nullableBool);
            this.lowPowerMode_ = (NullableBool) vVarNewBuilder.b();
        }
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMediaMuted(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.mediaMuted_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.mediaMuted_ = nullableBool;
        } else {
            v vVarNewBuilder = NullableBool.newBuilder(this.mediaMuted_);
            vVarNewBuilder.c();
            t0.a(vVarNewBuilder.f26483b, nullableBool);
            this.mediaMuted_ = (NullableBool) vVarNewBuilder.b();
        }
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMediationType(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mediationType_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.mediationType_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.mediationType_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.mediationType_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMobileCountryCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mobileCountryCode_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.mobileCountryCode_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.mobileCountryCode_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.mobileCountryCode_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMobileNetworkCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mobileNetworkCode_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.mobileNetworkCode_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.mobileNetworkCode_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.mobileNetworkCode_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMockResponseId(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.mockResponseId_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.mockResponseId_ = nullableString;
        } else {
            y yVarNewBuilder = NullableString.newBuilder(this.mockResponseId_);
            yVarNewBuilder.c();
            t0.a(yVarNewBuilder.f26483b, nullableString);
            this.mockResponseId_ = (NullableString) yVarNewBuilder.b();
        }
        this.bitField0_ |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetwork(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.network_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.network_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.network_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.network_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOdt(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.odt_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.odt_ = nullableString;
        } else {
            y yVarNewBuilder = NullableString.newBuilder(this.odt_);
            yVarNewBuilder.c();
            t0.a(yVarNewBuilder.f26483b, nullableString);
            this.odt_ = (NullableString) yVarNewBuilder.b();
        }
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOffsetFromGMT(NullableSInt32 nullableSInt32) {
        nullableSInt32.getClass();
        NullableSInt32 nullableSInt322 = this.offsetFromGMT_;
        if (nullableSInt322 == null || nullableSInt322 == NullableSInt32.getDefaultInstance()) {
            this.offsetFromGMT_ = nullableSInt32;
            return;
        }
        x xVarNewBuilder = NullableSInt32.newBuilder(this.offsetFromGMT_);
        xVarNewBuilder.c();
        t0.a(xVarNewBuilder.f26483b, nullableSInt32);
        this.offsetFromGMT_ = (NullableSInt32) xVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOsVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.osVersion_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.osVersion_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.osVersion_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.osVersion_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePortal(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.portal_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.portal_ = nullableUInt32;
        } else {
            z zVarNewBuilder = NullableUInt32.newBuilder(this.portal_);
            zVarNewBuilder.c();
            t0.a(zVarNewBuilder.f26483b, nullableUInt32);
            this.portal_ = (NullableUInt32) zVarNewBuilder.b();
        }
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePriorSkip(NullableBool nullableBool) {
        nullableBool.getClass();
        NullableBool nullableBool2 = this.priorSkip_;
        if (nullableBool2 == null || nullableBool2 == NullableBool.getDefaultInstance()) {
            this.priorSkip_ = nullableBool;
            return;
        }
        v vVarNewBuilder = NullableBool.newBuilder(this.priorSkip_);
        vVarNewBuilder.c();
        t0.a(vVarNewBuilder.f26483b, nullableBool);
        this.priorSkip_ = (NullableBool) vVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePxRatio(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.pxRatio_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.pxRatio_ = nullableFloat;
        } else {
            w wVarNewBuilder = NullableFloat.newBuilder(this.pxRatio_);
            wVarNewBuilder.c();
            t0.a(wVarNewBuilder.f26483b, nullableFloat);
            this.pxRatio_ = (NullableFloat) wVarNewBuilder.b();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSdkVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.sdkVersion_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.sdkVersion_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.sdkVersion_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.sdkVersion_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSessionDuration(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.sessionDuration_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.sessionDuration_ = nullableUInt32;
            return;
        }
        z zVarNewBuilder = NullableUInt32.newBuilder(this.sessionDuration_);
        zVarNewBuilder.c();
        t0.a(zVarNewBuilder.f26483b, nullableUInt32);
        this.sessionDuration_ = (NullableUInt32) zVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.timeAccuracy_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.timeAccuracy_ = nullableFloat;
            return;
        }
        w wVarNewBuilder = NullableFloat.newBuilder(this.timeAccuracy_);
        wVarNewBuilder.c();
        t0.a(wVarNewBuilder.f26483b, nullableFloat);
        this.timeAccuracy_ = (NullableFloat) wVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTotalSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.totalSpace_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.totalSpace_ = nullableUInt32;
            return;
        }
        z zVarNewBuilder = NullableUInt32.newBuilder(this.totalSpace_);
        zVarNewBuilder.c();
        t0.a(zVarNewBuilder.f26483b, nullableUInt32);
        this.totalSpace_ = (NullableUInt32) zVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackingStatus(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.trackingStatus_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.trackingStatus_ = nullableUInt32;
        } else {
            z zVarNewBuilder = NullableUInt32.newBuilder(this.trackingStatus_);
            zVarNewBuilder.c();
            t0.a(zVarNewBuilder.f26483b, nullableUInt32);
            this.trackingStatus_ = (NullableUInt32) zVarNewBuilder.b();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAge(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        NullableUInt32 nullableUInt322 = this.userAge_;
        if (nullableUInt322 == null || nullableUInt322 == NullableUInt32.getDefaultInstance()) {
            this.userAge_ = nullableUInt32;
            return;
        }
        z zVarNewBuilder = NullableUInt32.newBuilder(this.userAge_);
        zVarNewBuilder.c();
        t0.a(zVarNewBuilder.f26483b, nullableUInt32);
        this.userAge_ = (NullableUInt32) zVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgent(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.userAgent_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.userAgent_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.userAgent_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.userAgent_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserID(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.userID_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.userID_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.userID_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.userID_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVerAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        NullableFloat nullableFloat2 = this.verAccuracy_;
        if (nullableFloat2 == null || nullableFloat2 == NullableFloat.getDefaultInstance()) {
            this.verAccuracy_ = nullableFloat;
            return;
        }
        w wVarNewBuilder = NullableFloat.newBuilder(this.verAccuracy_);
        wVarNewBuilder.c();
        t0.a(wVarNewBuilder.f26483b, nullableFloat);
        this.verAccuracy_ = (NullableFloat) wVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVersion(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.version_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.version_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.version_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.version_ = (NullableString) yVarNewBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZipCode(NullableString nullableString) {
        nullableString.getClass();
        NullableString nullableString2 = this.zipCode_;
        if (nullableString2 == null || nullableString2 == NullableString.getDefaultInstance()) {
            this.zipCode_ = nullableString;
            return;
        }
        y yVarNewBuilder = NullableString.newBuilder(this.zipCode_);
        yVarNewBuilder.c();
        t0.a(yVarNewBuilder.f26483b, nullableString);
        this.zipCode_ = (NullableString) yVarNewBuilder.b();
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static TokenParametersOuterClass$TokenParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(ByteBuffer byteBuffer) throws n1 {
        return (TokenParametersOuterClass$TokenParameters) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAbExperiments(int i10) {
        ensureAbExperimentsIsMutable();
        this.abExperiments_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEncryptedTopics(int i10) {
        ensureEncryptedTopicsIsMutable();
        this.encryptedTopics_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLastAdomains(int i10) {
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLastAdvertisedBundles(int i10) {
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePriorClickTypes(int i10) {
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTopics(int i10) {
        ensureTopicsIsMutable();
        this.topics_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUserSessions(int i10) {
        ensureUserSessionsIsMutable();
        this.userSessions_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAaid(NullableString nullableString) {
        nullableString.getClass();
        this.aaid_ = nullableString;
        this.bitField0_ |= Segment.SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbExperiments(int i10, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.set(i10, experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdServicesVersion(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.adServicesVersion_ = nullableUInt32;
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAirplaneMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.airplaneMode_ = nullableBool;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmazonId(NullableString nullableString) {
        nullableString.getClass();
        this.amazonId_ = nullableString;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppBuildVersion(NullableString nullableString) {
        nullableString.getClass();
        this.appBuildVersion_ = nullableString;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppSetId(NullableString nullableString) {
        nullableString.getClass();
        this.appSetId_ = nullableString;
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(NullableString nullableString) {
        nullableString.getClass();
        this.appVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryCharging(NullableBool nullableBool) {
        nullableBool.getClass();
        this.batteryCharging_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryLevel(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.batteryLevel_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        this.bluetoothPlugged_ = nullableBool;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundleID(NullableString nullableString) {
        nullableString.getClass();
        this.bundleID_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarrierName(NullableString nullableString) {
        nullableString.getClass();
        this.carrierName_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcpaString(NullableString nullableString) {
        nullableString.getClass();
        this.ccpaString_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.childMode_ = nullableBool;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoppaApplies(NullableBool nullableBool) {
        nullableBool.getClass();
        this.coppaApplies_ = nullableBool;
        this.bitField0_ |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(NullableString nullableString) {
        nullableString.getClass();
        this.countryCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDarkMode(boolean z10) {
        this.darkMode_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceApi(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceApi_ = nullableUInt32;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceHeight(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceHeight_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceLanguage(NullableString nullableString) {
        nullableString.getClass();
        this.deviceLanguage_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModel(NullableString nullableString) {
        nullableString.getClass();
        this.deviceModel_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceOS(NullableString nullableString) {
        nullableString.getClass();
        this.deviceOS_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceWidth(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.deviceWidth_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDndMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.dndMode_ = nullableBool;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDnt(boolean z10) {
        this.bitField0_ |= 16;
        this.dnt_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptedTopics(int i10, EncryptedTopic encryptedTopic) {
        encryptedTopic.getClass();
        ensureEncryptedTopicsIsMutable();
        this.encryptedTopics_.set(i10, encryptedTopic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameworkName(q qVar) {
        this.frameworkName_ = qVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameworkNameValue(int i10) {
        this.frameworkName_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.freeSpace_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGdprConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        this.gdprConsent_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGdprString(NullableString nullableString) {
        nullableString.getClass();
        this.gdprString_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadsetPlugged(NullableBool nullableBool) {
        nullableBool.getClass();
        this.headsetPlugged_ = nullableBool;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.horAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfa(NullableString nullableString) {
        nullableString.getClass();
        this.idfa_ = nullableString;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfv(NullableString nullableString) {
        nullableString.getClass();
        this.idfv_ = nullableString;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnitePackageName(NullableString nullableString) {
        nullableString.getClass();
        this.ignitePackageName_ = nullableString;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgniteVersion(NullableString nullableString) {
        nullableString.getClass();
        this.igniteVersion_ = nullableString;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInputLanguages(NullableString nullableString) {
        nullableString.getClass();
        this.inputLanguages_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRingMuted(NullableBool nullableBool) {
        nullableBool.getClass();
        this.isRingMuted_ = nullableBool;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeywords(NullableString nullableString) {
        nullableString.getClass();
        this.keywords_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAdomains(int i10, LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.set(i10, lastAdomain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAdvertisedBundles(int i10, LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.set(i10, lastAdvertisedBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.latitude_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLgpdConsent(NullableBool nullableBool) {
        nullableBool.getClass();
        this.lgpdConsent_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.longitude_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowPowerMode(NullableBool nullableBool) {
        nullableBool.getClass();
        this.lowPowerMode_ = nullableBool;
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaMuted(NullableBool nullableBool) {
        nullableBool.getClass();
        this.mediaMuted_ = nullableBool;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationType(NullableString nullableString) {
        nullableString.getClass();
        this.mediationType_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileCountryCode(NullableString nullableString) {
        nullableString.getClass();
        this.mobileCountryCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileNetworkCode(NullableString nullableString) {
        nullableString.getClass();
        this.mobileNetworkCode_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMockResponseId(NullableString nullableString) {
        nullableString.getClass();
        this.mockResponseId_ = nullableString;
        this.bitField0_ |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMuteAudio(boolean z10) {
        this.muteAudio_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetwork(NullableString nullableString) {
        nullableString.getClass();
        this.network_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOdt(NullableString nullableString) {
        nullableString.getClass();
        this.odt_ = nullableString;
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffsetFromGMT(NullableSInt32 nullableSInt32) {
        nullableSInt32.getClass();
        this.offsetFromGMT_ = nullableSInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(NullableString nullableString) {
        nullableString.getClass();
        this.osVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortal(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.portal_ = nullableUInt32;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorClickTypes(int i10, PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.set(i10, priorVideoClickType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorClicks(int i10, l0 l0Var) {
        l0Var.getClass();
        ensurePriorClicksIsMutable();
        g1 g1Var = this.priorClicks_;
        int iA = l0Var.a();
        a1 a1Var = (a1) g1Var;
        a1Var.c();
        a1Var.d(i10);
        int[] iArr = a1Var.f26342b;
        int i11 = iArr[i10];
        iArr[i10] = iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorClicksValue(int i10, int i11) {
        ensurePriorClicksIsMutable();
        a1 a1Var = (a1) this.priorClicks_;
        a1Var.c();
        a1Var.d(i10);
        int[] iArr = a1Var.f26342b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriorSkip(NullableBool nullableBool) {
        nullableBool.getClass();
        this.priorSkip_ = nullableBool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPxRatio(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.pxRatio_ = nullableFloat;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(NullableString nullableString) {
        nullableString.getClass();
        this.sdkVersion_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecureContent(d0 d0Var) {
        this.secureContent_ = d0Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecureContentValue(int i10) {
        this.secureContent_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionDuration(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.sessionDuration_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.timeAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopics(int i10, Topic topic) {
        topic.getClass();
        ensureTopicsIsMutable();
        this.topics_.set(i10, topic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalSpace(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.totalSpace_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackingStatus(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.trackingStatus_ = nullableUInt32;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAge(NullableUInt32 nullableUInt32) {
        nullableUInt32.getClass();
        this.userAge_ = nullableUInt32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(NullableString nullableString) {
        nullableString.getClass();
        this.userAgent_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserGender(n0 n0Var) {
        this.userGender_ = n0Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserGenderValue(int i10) {
        this.userGender_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserID(NullableString nullableString) {
        nullableString.getClass();
        this.userID_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSessions(int i10, UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.set(i10, userSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerAccuracy(NullableFloat nullableFloat) {
        nullableFloat.getClass();
        this.verAccuracy_ = nullableFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(NullableString nullableString) {
        nullableString.getClass();
        this.version_ = nullableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZipCode(NullableString nullableString) {
        nullableString.getClass();
        this.zipCode_ = nullableString;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z0
    public final Object dynamicMethod(y0 y0Var, Object obj, Object obj2) {
        m2 u0Var;
        switch (i.f23120a[y0Var.ordinal()]) {
            case 1:
                return new TokenParametersOuterClass$TokenParameters();
            case 2:
                return new k();
            case 3:
                return z0.newMessageInfo(DEFAULT_INSTANCE, "\u0000L\u0000\u0001\u0001LL\u0000\b\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\bဉ\u0000\t\t\n\t\u000bဉ\u0001\f\t\r\t\u000e\t\u000f\f\u0010\t\u0011\t\u0012\t\u0013\t\u0014\t\u0015\t\u0016ဉ\u0002\u0017ဉ\u0003\u0018ဇ\u0004\u0019\t\u001a\t\u001b\t\u001c\t\u001dဉ\u0005\u001e\t\u001f\t \u0007!\t\"\f#\t$\t%\t&\t'\t(\t)\t*\f+\t,\t-ဉ\u0006.ဉ\u0007/\t0ဉ\b1\u00072ဉ\t3ဉ\n4ဉ\u000b5ဉ\f6ဉ\r7ဉ\u000e8\t9\u001b:\u001b;,<\t=\u001b>\u001b?\u001b@ဉ\u000fAဉ\u0010B\tCဉ\u0011Dဉ\u0012Eဉ\u0013Fဉ\u0014Gဉ\u0015Hဉ\u0016Iဉ\u0017J\u001bK\u001bLဉ\u0018", new Object[]{"bitField0_", "version_", "userAgent_", "sdkVersion_", "bundleID_", "deviceModel_", "appVersion_", "deviceOS_", "deviceApi_", "osVersion_", "deviceLanguage_", "pxRatio_", "deviceWidth_", "deviceHeight_", "mediationType_", "frameworkName_", "totalSpace_", "countryCode_", "carrierName_", "mobileCountryCode_", "mobileNetworkCode_", "inputLanguages_", "idfa_", "idfv_", "dnt_", "gdprConsent_", "gdprString_", "ccpaString_", "offsetFromGMT_", "trackingStatus_", "userID_", "network_", "muteAudio_", "userAge_", "userGender_", "zipCode_", "keywords_", "latitude_", "longitude_", "horAccuracy_", "verAccuracy_", "timeAccuracy_", "secureContent_", "batteryCharging_", "batteryLevel_", "headsetPlugged_", "bluetoothPlugged_", "freeSpace_", "lowPowerMode_", "darkMode_", "airplaneMode_", "dndMode_", "isRingMuted_", "amazonId_", "aaid_", "appBuildVersion_", "sessionDuration_", "lastAdomains_", LastAdomain.class, "lastAdvertisedBundles_", LastAdvertisedBundle.class, "priorClicks_", "priorSkip_", "priorClickTypes_", PriorVideoClickType.class, "userSessions_", UserSession.class, "abExperiments_", Experiment.class, "portal_", "mockResponseId_", "lgpdConsent_", "igniteVersion_", "ignitePackageName_", "childMode_", "coppaApplies_", "odt_", "mediaMuted_", "appSetId_", "encryptedTopics_", EncryptedTopic.class, "topics_", Topic.class, "adServicesVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (TokenParametersOuterClass$TokenParameters.class) {
                    try {
                        u0Var = PARSER;
                        if (u0Var == null) {
                            u0Var = new u0();
                            PARSER = u0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return u0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public NullableString getAaid() {
        NullableString nullableString = this.aaid_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public Experiment getAbExperiments(int i10) {
        return (Experiment) this.abExperiments_.get(i10);
    }

    public int getAbExperimentsCount() {
        return this.abExperiments_.size();
    }

    public List<Experiment> getAbExperimentsList() {
        return this.abExperiments_;
    }

    public o getAbExperimentsOrBuilder(int i10) {
        return (o) this.abExperiments_.get(i10);
    }

    public List<? extends o> getAbExperimentsOrBuilderList() {
        return this.abExperiments_;
    }

    public NullableUInt32 getAdServicesVersion() {
        NullableUInt32 nullableUInt32 = this.adServicesVersion_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getAirplaneMode() {
        NullableBool nullableBool = this.airplaneMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getAmazonId() {
        NullableString nullableString = this.amazonId_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getAppBuildVersion() {
        NullableString nullableString = this.appBuildVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getAppSetId() {
        NullableString nullableString = this.appSetId_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getAppVersion() {
        NullableString nullableString = this.appVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getBatteryCharging() {
        NullableBool nullableBool = this.batteryCharging_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableUInt32 getBatteryLevel() {
        NullableUInt32 nullableUInt32 = this.batteryLevel_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getBluetoothPlugged() {
        NullableBool nullableBool = this.bluetoothPlugged_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getBundleID() {
        NullableString nullableString = this.bundleID_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getCarrierName() {
        NullableString nullableString = this.carrierName_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getCcpaString() {
        NullableString nullableString = this.ccpaString_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getChildMode() {
        NullableBool nullableBool = this.childMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableBool getCoppaApplies() {
        NullableBool nullableBool = this.coppaApplies_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getCountryCode() {
        NullableString nullableString = this.countryCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean getDarkMode() {
        return this.darkMode_;
    }

    public NullableUInt32 getDeviceApi() {
        NullableUInt32 nullableUInt32 = this.deviceApi_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getDeviceHeight() {
        NullableUInt32 nullableUInt32 = this.deviceHeight_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableString getDeviceLanguage() {
        NullableString nullableString = this.deviceLanguage_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getDeviceModel() {
        NullableString nullableString = this.deviceModel_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getDeviceOS() {
        NullableString nullableString = this.deviceOS_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableUInt32 getDeviceWidth() {
        NullableUInt32 nullableUInt32 = this.deviceWidth_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getDndMode() {
        NullableBool nullableBool = this.dndMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public boolean getDnt() {
        return this.dnt_;
    }

    public EncryptedTopic getEncryptedTopics(int i10) {
        return (EncryptedTopic) this.encryptedTopics_.get(i10);
    }

    public int getEncryptedTopicsCount() {
        return this.encryptedTopics_.size();
    }

    public List<EncryptedTopic> getEncryptedTopicsList() {
        return this.encryptedTopics_;
    }

    public m getEncryptedTopicsOrBuilder(int i10) {
        return (m) this.encryptedTopics_.get(i10);
    }

    public List<? extends m> getEncryptedTopicsOrBuilderList() {
        return this.encryptedTopics_;
    }

    public q getFrameworkName() {
        int i10 = this.frameworkName_;
        q qVar = i10 != 0 ? i10 != 1 ? null : q.UNITY3D : q.NATIVE;
        return qVar == null ? q.UNRECOGNIZED : qVar;
    }

    public int getFrameworkNameValue() {
        return this.frameworkName_;
    }

    public NullableUInt32 getFreeSpace() {
        NullableUInt32 nullableUInt32 = this.freeSpace_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableBool getGdprConsent() {
        NullableBool nullableBool = this.gdprConsent_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getGdprString() {
        NullableString nullableString = this.gdprString_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getHeadsetPlugged() {
        NullableBool nullableBool = this.headsetPlugged_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getHorAccuracy() {
        NullableFloat nullableFloat = this.horAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getIdfa() {
        NullableString nullableString = this.idfa_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getIdfv() {
        NullableString nullableString = this.idfv_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getIgnitePackageName() {
        NullableString nullableString = this.ignitePackageName_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getIgniteVersion() {
        NullableString nullableString = this.igniteVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getInputLanguages() {
        NullableString nullableString = this.inputLanguages_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableBool getIsRingMuted() {
        NullableBool nullableBool = this.isRingMuted_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getKeywords() {
        NullableString nullableString = this.keywords_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public LastAdomain getLastAdomains(int i10) {
        return (LastAdomain) this.lastAdomains_.get(i10);
    }

    public int getLastAdomainsCount() {
        return this.lastAdomains_.size();
    }

    public List<LastAdomain> getLastAdomainsList() {
        return this.lastAdomains_;
    }

    public s getLastAdomainsOrBuilder(int i10) {
        return (s) this.lastAdomains_.get(i10);
    }

    public List<? extends s> getLastAdomainsOrBuilderList() {
        return this.lastAdomains_;
    }

    public LastAdvertisedBundle getLastAdvertisedBundles(int i10) {
        return (LastAdvertisedBundle) this.lastAdvertisedBundles_.get(i10);
    }

    public int getLastAdvertisedBundlesCount() {
        return this.lastAdvertisedBundles_.size();
    }

    public List<LastAdvertisedBundle> getLastAdvertisedBundlesList() {
        return this.lastAdvertisedBundles_;
    }

    public u getLastAdvertisedBundlesOrBuilder(int i10) {
        return (u) this.lastAdvertisedBundles_.get(i10);
    }

    public List<? extends u> getLastAdvertisedBundlesOrBuilderList() {
        return this.lastAdvertisedBundles_;
    }

    public NullableFloat getLatitude() {
        NullableFloat nullableFloat = this.latitude_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableBool getLgpdConsent() {
        NullableBool nullableBool = this.lgpdConsent_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getLongitude() {
        NullableFloat nullableFloat = this.longitude_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableBool getLowPowerMode() {
        NullableBool nullableBool = this.lowPowerMode_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableBool getMediaMuted() {
        NullableBool nullableBool = this.mediaMuted_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableString getMediationType() {
        NullableString nullableString = this.mediationType_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMobileCountryCode() {
        NullableString nullableString = this.mobileCountryCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMobileNetworkCode() {
        NullableString nullableString = this.mobileNetworkCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getMockResponseId() {
        NullableString nullableString = this.mockResponseId_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean getMuteAudio() {
        return this.muteAudio_;
    }

    public NullableString getNetwork() {
        NullableString nullableString = this.network_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getOdt() {
        NullableString nullableString = this.odt_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableSInt32 getOffsetFromGMT() {
        NullableSInt32 nullableSInt32 = this.offsetFromGMT_;
        return nullableSInt32 == null ? NullableSInt32.getDefaultInstance() : nullableSInt32;
    }

    public NullableString getOsVersion() {
        NullableString nullableString = this.osVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableUInt32 getPortal() {
        NullableUInt32 nullableUInt32 = this.portal_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public PriorVideoClickType getPriorClickTypes(int i10) {
        return (PriorVideoClickType) this.priorClickTypes_.get(i10);
    }

    public int getPriorClickTypesCount() {
        return this.priorClickTypes_.size();
    }

    public List<PriorVideoClickType> getPriorClickTypesList() {
        return this.priorClickTypes_;
    }

    public b0 getPriorClickTypesOrBuilder(int i10) {
        return (b0) this.priorClickTypes_.get(i10);
    }

    public List<? extends b0> getPriorClickTypesOrBuilderList() {
        return this.priorClickTypes_;
    }

    public l0 getPriorClicks(int i10) {
        h1 h1Var = priorClicks_converter_;
        a1 a1Var = (a1) this.priorClicks_;
        a1Var.d(i10);
        int i11 = a1Var.f26342b[i10];
        ((j) h1Var).getClass();
        l0 l0VarA = l0.a(i11);
        return l0VarA == null ? l0.UNRECOGNIZED : l0VarA;
    }

    public int getPriorClicksCount() {
        return ((a1) this.priorClicks_).size();
    }

    public List<l0> getPriorClicksList() {
        return new i1(this.priorClicks_, priorClicks_converter_);
    }

    public int getPriorClicksValue(int i10) {
        a1 a1Var = (a1) this.priorClicks_;
        a1Var.d(i10);
        return a1Var.f26342b[i10];
    }

    public List<Integer> getPriorClicksValueList() {
        return this.priorClicks_;
    }

    public NullableBool getPriorSkip() {
        NullableBool nullableBool = this.priorSkip_;
        return nullableBool == null ? NullableBool.getDefaultInstance() : nullableBool;
    }

    public NullableFloat getPxRatio() {
        NullableFloat nullableFloat = this.pxRatio_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getSdkVersion() {
        NullableString nullableString = this.sdkVersion_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public d0 getSecureContent() {
        int i10 = this.secureContent_;
        d0 d0Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? null : d0.PARTIALLYSECURE : d0.SECURE : d0.UNSECURE;
        return d0Var == null ? d0.UNRECOGNIZED : d0Var;
    }

    public int getSecureContentValue() {
        return this.secureContent_;
    }

    public NullableUInt32 getSessionDuration() {
        NullableUInt32 nullableUInt32 = this.sessionDuration_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableFloat getTimeAccuracy() {
        NullableFloat nullableFloat = this.timeAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public Topic getTopics(int i10) {
        return (Topic) this.topics_.get(i10);
    }

    public int getTopicsCount() {
        return this.topics_.size();
    }

    public List<Topic> getTopicsList() {
        return this.topics_;
    }

    public h0 getTopicsOrBuilder(int i10) {
        return (h0) this.topics_.get(i10);
    }

    public List<? extends h0> getTopicsOrBuilderList() {
        return this.topics_;
    }

    public NullableUInt32 getTotalSpace() {
        NullableUInt32 nullableUInt32 = this.totalSpace_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getTrackingStatus() {
        NullableUInt32 nullableUInt32 = this.trackingStatus_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableUInt32 getUserAge() {
        NullableUInt32 nullableUInt32 = this.userAge_;
        return nullableUInt32 == null ? NullableUInt32.getDefaultInstance() : nullableUInt32;
    }

    public NullableString getUserAgent() {
        NullableString nullableString = this.userAgent_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public n0 getUserGender() {
        int i10 = this.userGender_;
        n0 n0Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? null : n0.OTHER : n0.FEMALE : n0.MALE : n0.UNKNOWN;
        return n0Var == null ? n0.UNRECOGNIZED : n0Var;
    }

    public int getUserGenderValue() {
        return this.userGender_;
    }

    public NullableString getUserID() {
        NullableString nullableString = this.userID_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public UserSession getUserSessions(int i10) {
        return (UserSession) this.userSessions_.get(i10);
    }

    public int getUserSessionsCount() {
        return this.userSessions_.size();
    }

    public List<UserSession> getUserSessionsList() {
        return this.userSessions_;
    }

    public p0 getUserSessionsOrBuilder(int i10) {
        return (p0) this.userSessions_.get(i10);
    }

    public List<? extends p0> getUserSessionsOrBuilderList() {
        return this.userSessions_;
    }

    public NullableFloat getVerAccuracy() {
        NullableFloat nullableFloat = this.verAccuracy_;
        return nullableFloat == null ? NullableFloat.getDefaultInstance() : nullableFloat;
    }

    public NullableString getVersion() {
        NullableString nullableString = this.version_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public NullableString getZipCode() {
        NullableString nullableString = this.zipCode_;
        return nullableString == null ? NullableString.getDefaultInstance() : nullableString;
    }

    public boolean hasAaid() {
        return (this.bitField0_ & Segment.SIZE) != 0;
    }

    public boolean hasAdServicesVersion() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasAirplaneMode() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasAmazonId() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasAppBuildVersion() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasAppSetId() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasAppVersion() {
        return this.appVersion_ != null;
    }

    public boolean hasBatteryCharging() {
        return this.batteryCharging_ != null;
    }

    public boolean hasBatteryLevel() {
        return this.batteryLevel_ != null;
    }

    public boolean hasBluetoothPlugged() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasBundleID() {
        return this.bundleID_ != null;
    }

    public boolean hasCarrierName() {
        return this.carrierName_ != null;
    }

    public boolean hasCcpaString() {
        return this.ccpaString_ != null;
    }

    public boolean hasChildMode() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasCoppaApplies() {
        return (this.bitField0_ & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
    }

    public boolean hasCountryCode() {
        return this.countryCode_ != null;
    }

    public boolean hasDeviceApi() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDeviceHeight() {
        return this.deviceHeight_ != null;
    }

    public boolean hasDeviceLanguage() {
        return this.deviceLanguage_ != null;
    }

    public boolean hasDeviceModel() {
        return this.deviceModel_ != null;
    }

    public boolean hasDeviceOS() {
        return this.deviceOS_ != null;
    }

    public boolean hasDeviceWidth() {
        return this.deviceWidth_ != null;
    }

    public boolean hasDndMode() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDnt() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFreeSpace() {
        return this.freeSpace_ != null;
    }

    public boolean hasGdprConsent() {
        return this.gdprConsent_ != null;
    }

    public boolean hasGdprString() {
        return this.gdprString_ != null;
    }

    public boolean hasHeadsetPlugged() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasHorAccuracy() {
        return this.horAccuracy_ != null;
    }

    public boolean hasIdfa() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIdfv() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIgnitePackageName() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasIgniteVersion() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasInputLanguages() {
        return this.inputLanguages_ != null;
    }

    public boolean hasIsRingMuted() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasKeywords() {
        return this.keywords_ != null;
    }

    public boolean hasLatitude() {
        return this.latitude_ != null;
    }

    public boolean hasLgpdConsent() {
        return this.lgpdConsent_ != null;
    }

    public boolean hasLongitude() {
        return this.longitude_ != null;
    }

    public boolean hasLowPowerMode() {
        return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    public boolean hasMediaMuted() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasMediationType() {
        return this.mediationType_ != null;
    }

    public boolean hasMobileCountryCode() {
        return this.mobileCountryCode_ != null;
    }

    public boolean hasMobileNetworkCode() {
        return this.mobileNetworkCode_ != null;
    }

    public boolean hasMockResponseId() {
        return (this.bitField0_ & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0;
    }

    public boolean hasNetwork() {
        return this.network_ != null;
    }

    public boolean hasOdt() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasOffsetFromGMT() {
        return this.offsetFromGMT_ != null;
    }

    public boolean hasOsVersion() {
        return this.osVersion_ != null;
    }

    public boolean hasPortal() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasPriorSkip() {
        return this.priorSkip_ != null;
    }

    public boolean hasPxRatio() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSdkVersion() {
        return this.sdkVersion_ != null;
    }

    public boolean hasSessionDuration() {
        return this.sessionDuration_ != null;
    }

    public boolean hasTimeAccuracy() {
        return this.timeAccuracy_ != null;
    }

    public boolean hasTotalSpace() {
        return this.totalSpace_ != null;
    }

    public boolean hasTrackingStatus() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUserAge() {
        return this.userAge_ != null;
    }

    public boolean hasUserAgent() {
        return this.userAgent_ != null;
    }

    public boolean hasUserID() {
        return this.userID_ != null;
    }

    public boolean hasVerAccuracy() {
        return this.verAccuracy_ != null;
    }

    public boolean hasVersion() {
        return this.version_ != null;
    }

    public boolean hasZipCode() {
        return this.zipCode_ != null;
    }

    public static k newBuilder(TokenParametersOuterClass$TokenParameters tokenParametersOuterClass$TokenParameters) {
        return (k) DEFAULT_INSTANCE.createBuilder(tokenParametersOuterClass$TokenParameters);
    }

    public static TokenParametersOuterClass$TokenParameters parseDelimitedFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) z0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(ByteBuffer byteBuffer, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
        return (TokenParametersOuterClass$TokenParameters) z0.parseFrom(DEFAULT_INSTANCE, byteBuffer, h0Var);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar) throws n1 {
        return (TokenParametersOuterClass$TokenParameters) z0.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAbExperiments(int i10, Experiment experiment) {
        experiment.getClass();
        ensureAbExperimentsIsMutable();
        this.abExperiments_.add(i10, experiment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEncryptedTopics(int i10, EncryptedTopic encryptedTopic) {
        encryptedTopic.getClass();
        ensureEncryptedTopicsIsMutable();
        this.encryptedTopics_.add(i10, encryptedTopic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdomains(int i10, LastAdomain lastAdomain) {
        lastAdomain.getClass();
        ensureLastAdomainsIsMutable();
        this.lastAdomains_.add(i10, lastAdomain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastAdvertisedBundles(int i10, LastAdvertisedBundle lastAdvertisedBundle) {
        lastAdvertisedBundle.getClass();
        ensureLastAdvertisedBundlesIsMutable();
        this.lastAdvertisedBundles_.add(i10, lastAdvertisedBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPriorClickTypes(int i10, PriorVideoClickType priorVideoClickType) {
        priorVideoClickType.getClass();
        ensurePriorClickTypesIsMutable();
        this.priorClickTypes_.add(i10, priorVideoClickType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopics(int i10, Topic topic) {
        topic.getClass();
        ensureTopicsIsMutable();
        this.topics_.add(i10, topic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUserSessions(int i10, UserSession userSession) {
        userSession.getClass();
        ensureUserSessionsIsMutable();
        this.userSessions_.add(i10, userSession);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.s sVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
        return (TokenParametersOuterClass$TokenParameters) z0.parseFrom(DEFAULT_INSTANCE, sVar, h0Var);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(byte[] bArr) throws n1 {
        return (TokenParametersOuterClass$TokenParameters) z0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(byte[] bArr, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws n1 {
        return (TokenParametersOuterClass$TokenParameters) z0.parseFrom(DEFAULT_INSTANCE, bArr, h0Var);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(InputStream inputStream) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) z0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(InputStream inputStream, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) z0.parseFrom(DEFAULT_INSTANCE, inputStream, h0Var);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) z0.parseFrom(DEFAULT_INSTANCE, wVar);
    }

    public static TokenParametersOuterClass$TokenParameters parseFrom(com.fyber.inneractive.sdk.protobuf.w wVar, com.fyber.inneractive.sdk.protobuf.h0 h0Var) throws IOException {
        return (TokenParametersOuterClass$TokenParameters) z0.parseFrom(DEFAULT_INSTANCE, wVar, h0Var);
    }
}
