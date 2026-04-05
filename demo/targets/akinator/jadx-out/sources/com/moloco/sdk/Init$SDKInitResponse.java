package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import cv.BLca.YsiBvdpw;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Init$SDKInitResponse extends GeneratedMessageLite<Init$SDKInitResponse, o8> implements i9 {
    public static final int AD_SERVER_URL_FIELD_NUMBER = 6;
    public static final int AD_UNITS_FIELD_NUMBER = 4;
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BID_TOKEN_CONFIG_FIELD_NUMBER = 12;
    public static final int CONFIGS_FIELD_NUMBER = 16;
    public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 7;
    public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 3;
    public static final int CRASH_REPORTING_CONFIG_FIELD_NUMBER = 15;
    private static final Init$SDKInitResponse DEFAULT_INSTANCE;
    public static final int EVENT_COLLECTION_CONFIG_FIELD_NUMBER = 11;
    public static final int EXPERIMENTAL_FEATURE_FLAGS_FIELD_NUMBER = 13;
    public static final int GEO_FIELD_NUMBER = 10;
    public static final int ILRD_CONFIG_FIELD_NUMBER = 17;
    public static final int OPERATIONAL_METRICS_CONFIG_FIELD_NUMBER = 14;
    private static volatile Parser<Init$SDKInitResponse> PARSER = null;
    public static final int PLATFORM_ID_FIELD_NUMBER = 8;
    public static final int PUBLISHER_ID_FIELD_NUMBER = 2;
    public static final int RESOLVED_REGION_FIELD_NUMBER = 5;
    public static final int VERIFY_BANNER_VISIBLE_FIELD_NUMBER = 9;
    private BidTokenConfig bidTokenConfig_;
    private ConfigsOuterClass$Configs configs_;
    private CrashReportingConfig crashReportingConfig_;
    private EventCollectionConfig eventCollectionConfig_;
    private Geo geo_;
    private ILRDConfig ilrdConfig_;
    private OperationalMetricsConfig operationalMetricsConfig_;
    private int resolvedRegion_;
    private boolean verifyBannerVisible_;
    private String appId_ = "";
    private String publisherId_ = "";
    private String countryIso3Code_ = "";
    private Internal.ProtobufList<AdUnit> adUnits_ = GeneratedMessageLite.emptyProtobufList();
    private String adServerUrl_ = "";
    private String countryIso2Code_ = "";
    private String platformId_ = "";
    private Internal.ProtobufList<ExperimentalFeatureFlag> experimentalFeatureFlags_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdUnit extends GeneratedMessageLite<AdUnit, c8> implements l8 {
        public static final int AD_FREQUENCY_FIELD_NUMBER = 3;
        public static final int BID_FLOOR_FIELD_NUMBER = 4;
        private static final AdUnit DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 5;
        public static final int NATIVE_FIELD_NUMBER = 6;
        private static volatile Parser<AdUnit> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int adFrequency_;
        private float bidFloor_;
        private String id_ = "";
        private String name_ = "";
        private Native native_;
        private int type_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Native extends GeneratedMessageLite<Native, g8> implements k8 {
            private static final Native DEFAULT_INSTANCE;
            private static volatile Parser<Native> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            private int type_;

            static {
                Native r02 = new Native();
                DEFAULT_INSTANCE = r02;
                GeneratedMessageLite.registerDefaultInstance(Native.class, r02);
            }

            private Native() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearType() {
                this.type_ = 0;
            }

            public static Native getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static g8 newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Native parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Native) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Native parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Native> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setType(j8 j8Var) {
                this.type_ = j8Var.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTypeValue(int i10) {
                this.type_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (b8.f45668a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Native();
                    case 2:
                        return new g8(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"type_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Native> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Native.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.moloco.sdk.k8
            public j8 getType() {
                j8 j8VarForNumber = j8.forNumber(this.type_);
                return j8VarForNumber == null ? j8.UNRECOGNIZED : j8VarForNumber;
            }

            @Override // com.moloco.sdk.k8
            public int getTypeValue() {
                return this.type_;
            }

            public static g8 newBuilder(Native r12) {
                return DEFAULT_INSTANCE.createBuilder(r12);
            }

            public static Native parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Native parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Native parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Native parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Native parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Native parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Native parseFrom(InputStream inputStream) throws IOException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Native parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Native parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Native parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        static {
            AdUnit adUnit = new AdUnit();
            DEFAULT_INSTANCE = adUnit;
            GeneratedMessageLite.registerDefaultInstance(AdUnit.class, adUnit);
        }

        private AdUnit() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFrequency() {
            this.adFrequency_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBidFloor() {
            this.bidFloor_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNative() {
            this.native_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static AdUnit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNative(Native r32) {
            r32.getClass();
            Native r02 = this.native_;
            if (r02 == null || r02 == Native.getDefaultInstance()) {
                this.native_ = r32;
            } else {
                this.native_ = (Native) ((g8) Native.newBuilder(this.native_).mergeFrom((g8) r32)).buildPartial();
            }
        }

        public static c8 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdUnit> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFrequency(int i10) {
            this.adFrequency_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidFloor(float f10) {
            this.bidFloor_ = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNative(Native r12) {
            r12.getClass();
            this.native_ = r12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(f8 f8Var) {
            this.type_ = f8Var.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.type_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (b8.f45668a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdUnit();
                case 2:
                    return new c8(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004\u0004\u0001\u0005Ȉ\u0006\t", new Object[]{"id_", "type_", "adFrequency_", "bidFloor_", "name_", "native_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdUnit> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AdUnit.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.l8
        public int getAdFrequency() {
            return this.adFrequency_;
        }

        @Override // com.moloco.sdk.l8
        public float getBidFloor() {
            return this.bidFloor_;
        }

        @Override // com.moloco.sdk.l8
        public String getId() {
            return this.id_;
        }

        @Override // com.moloco.sdk.l8
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.moloco.sdk.l8
        public String getName() {
            return this.name_;
        }

        @Override // com.moloco.sdk.l8
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.moloco.sdk.l8
        public Native getNative() {
            Native r02 = this.native_;
            return r02 == null ? Native.getDefaultInstance() : r02;
        }

        @Override // com.moloco.sdk.l8
        public f8 getType() {
            f8 f8VarForNumber = f8.forNumber(this.type_);
            return f8VarForNumber == null ? f8.UNRECOGNIZED : f8VarForNumber;
        }

        @Override // com.moloco.sdk.l8
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.moloco.sdk.l8
        public boolean hasNative() {
            return this.native_ != null;
        }

        public static c8 newBuilder(AdUnit adUnit) {
            return DEFAULT_INSTANCE.createBuilder(adUnit);
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdUnit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdUnit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdUnit parseFrom(InputStream inputStream) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdUnit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdUnit parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdUnit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BidTokenConfig extends GeneratedMessageLite<BidTokenConfig, m8> implements n8 {
        public static final int BID_TOKEN_URL_FIELD_NUMBER = 2;
        private static final BidTokenConfig DEFAULT_INSTANCE;
        private static volatile Parser<BidTokenConfig> PARSER;
        private String bidTokenUrl_ = "";

        static {
            BidTokenConfig bidTokenConfig = new BidTokenConfig();
            DEFAULT_INSTANCE = bidTokenConfig;
            GeneratedMessageLite.registerDefaultInstance(BidTokenConfig.class, bidTokenConfig);
        }

        private BidTokenConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBidTokenUrl() {
            this.bidTokenUrl_ = getDefaultInstance().getBidTokenUrl();
        }

        public static BidTokenConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static m8 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BidTokenConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BidTokenConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BidTokenConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidTokenUrl(String str) {
            str.getClass();
            this.bidTokenUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidTokenUrlBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.bidTokenUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (b8.f45668a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BidTokenConfig();
                case 2:
                    return new m8(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"bidTokenUrl_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BidTokenConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BidTokenConfig.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.n8
        public String getBidTokenUrl() {
            return this.bidTokenUrl_;
        }

        @Override // com.moloco.sdk.n8
        public ByteString getBidTokenUrlBytes() {
            return ByteString.copyFromUtf8(this.bidTokenUrl_);
        }

        public static m8 newBuilder(BidTokenConfig bidTokenConfig) {
            return DEFAULT_INSTANCE.createBuilder(bidTokenConfig);
        }

        public static BidTokenConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BidTokenConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BidTokenConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BidTokenConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BidTokenConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BidTokenConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BidTokenConfig parseFrom(InputStream inputStream) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BidTokenConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BidTokenConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BidTokenConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CrashReportingConfig extends GeneratedMessageLite<CrashReportingConfig, p8> implements q8 {
        private static final CrashReportingConfig DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        private static volatile Parser<CrashReportingConfig> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private boolean enabled_;
        private String url_ = "";

        static {
            CrashReportingConfig crashReportingConfig = new CrashReportingConfig();
            DEFAULT_INSTANCE = crashReportingConfig;
            GeneratedMessageLite.registerDefaultInstance(CrashReportingConfig.class, crashReportingConfig);
        }

        private CrashReportingConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.enabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static CrashReportingConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static p8 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CrashReportingConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CrashReportingConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CrashReportingConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z10) {
            this.enabled_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (b8.f45668a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CrashReportingConfig();
                case 2:
                    return new p8(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"enabled_", "url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CrashReportingConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CrashReportingConfig.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.q8
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // com.moloco.sdk.q8
        public String getUrl() {
            return this.url_;
        }

        @Override // com.moloco.sdk.q8
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public static p8 newBuilder(CrashReportingConfig crashReportingConfig) {
            return DEFAULT_INSTANCE.createBuilder(crashReportingConfig);
        }

        public static CrashReportingConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CrashReportingConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CrashReportingConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CrashReportingConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CrashReportingConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CrashReportingConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CrashReportingConfig parseFrom(InputStream inputStream) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CrashReportingConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CrashReportingConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CrashReportingConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CrashReportingConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EventCollectionConfig extends GeneratedMessageLite<EventCollectionConfig, r8> implements s8 {
        public static final int APP_BACKGROUND_TRACKING_URL_FIELD_NUMBER = 3;
        public static final int APP_FOREGROUND_TRACKING_URL_FIELD_NUMBER = 4;
        private static final EventCollectionConfig DEFAULT_INSTANCE;
        public static final int EVENT_COLLECTION_ENABLED_FIELD_NUMBER = 1;
        public static final int MREF_COLLECTION_ENABLED_FIELD_NUMBER = 2;
        private static volatile Parser<EventCollectionConfig> PARSER;
        private String appBackgroundTrackingUrl_ = "";
        private String appForegroundTrackingUrl_ = "";
        private boolean eventCollectionEnabled_;
        private boolean mrefCollectionEnabled_;

        static {
            EventCollectionConfig eventCollectionConfig = new EventCollectionConfig();
            DEFAULT_INSTANCE = eventCollectionConfig;
            GeneratedMessageLite.registerDefaultInstance(EventCollectionConfig.class, eventCollectionConfig);
        }

        private EventCollectionConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppBackgroundTrackingUrl() {
            this.appBackgroundTrackingUrl_ = getDefaultInstance().getAppBackgroundTrackingUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppForegroundTrackingUrl() {
            this.appForegroundTrackingUrl_ = getDefaultInstance().getAppForegroundTrackingUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventCollectionEnabled() {
            this.eventCollectionEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMrefCollectionEnabled() {
            this.mrefCollectionEnabled_ = false;
        }

        public static EventCollectionConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static r8 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EventCollectionConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EventCollectionConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EventCollectionConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppBackgroundTrackingUrl(String str) {
            str.getClass();
            this.appBackgroundTrackingUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppBackgroundTrackingUrlBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appBackgroundTrackingUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppForegroundTrackingUrl(String str) {
            str.getClass();
            this.appForegroundTrackingUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppForegroundTrackingUrlBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appForegroundTrackingUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventCollectionEnabled(boolean z10) {
            this.eventCollectionEnabled_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMrefCollectionEnabled(boolean z10) {
            this.mrefCollectionEnabled_ = z10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (b8.f45668a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EventCollectionConfig();
                case 2:
                    return new r8(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004Ȉ", new Object[]{"eventCollectionEnabled_", "mrefCollectionEnabled_", "appBackgroundTrackingUrl_", "appForegroundTrackingUrl_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EventCollectionConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EventCollectionConfig.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.s8
        public String getAppBackgroundTrackingUrl() {
            return this.appBackgroundTrackingUrl_;
        }

        @Override // com.moloco.sdk.s8
        public ByteString getAppBackgroundTrackingUrlBytes() {
            return ByteString.copyFromUtf8(this.appBackgroundTrackingUrl_);
        }

        @Override // com.moloco.sdk.s8
        public String getAppForegroundTrackingUrl() {
            return this.appForegroundTrackingUrl_;
        }

        @Override // com.moloco.sdk.s8
        public ByteString getAppForegroundTrackingUrlBytes() {
            return ByteString.copyFromUtf8(this.appForegroundTrackingUrl_);
        }

        @Override // com.moloco.sdk.s8
        public boolean getEventCollectionEnabled() {
            return this.eventCollectionEnabled_;
        }

        @Override // com.moloco.sdk.s8
        public boolean getMrefCollectionEnabled() {
            return this.mrefCollectionEnabled_;
        }

        public static r8 newBuilder(EventCollectionConfig eventCollectionConfig) {
            return DEFAULT_INSTANCE.createBuilder(eventCollectionConfig);
        }

        public static EventCollectionConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EventCollectionConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EventCollectionConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EventCollectionConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EventCollectionConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EventCollectionConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EventCollectionConfig parseFrom(InputStream inputStream) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EventCollectionConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EventCollectionConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EventCollectionConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventCollectionConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ExperimentalFeatureFlag extends GeneratedMessageLite<ExperimentalFeatureFlag, t8> implements u8 {
        private static final ExperimentalFeatureFlag DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<ExperimentalFeatureFlag> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String name_ = "";
        private String value_ = "";

        static {
            ExperimentalFeatureFlag experimentalFeatureFlag = new ExperimentalFeatureFlag();
            DEFAULT_INSTANCE = experimentalFeatureFlag;
            GeneratedMessageLite.registerDefaultInstance(ExperimentalFeatureFlag.class, experimentalFeatureFlag);
        }

        private ExperimentalFeatureFlag() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static ExperimentalFeatureFlag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static t8 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ExperimentalFeatureFlag parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentalFeatureFlag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ExperimentalFeatureFlag> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (b8.f45668a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExperimentalFeatureFlag();
                case 2:
                    return new t8(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExperimentalFeatureFlag> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ExperimentalFeatureFlag.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.u8
        public String getName() {
            return this.name_;
        }

        @Override // com.moloco.sdk.u8
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.moloco.sdk.u8
        public String getValue() {
            return this.value_;
        }

        @Override // com.moloco.sdk.u8
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        public static t8 newBuilder(ExperimentalFeatureFlag experimentalFeatureFlag) {
            return DEFAULT_INSTANCE.createBuilder(experimentalFeatureFlag);
        }

        public static ExperimentalFeatureFlag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExperimentalFeatureFlag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ExperimentalFeatureFlag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ExperimentalFeatureFlag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ExperimentalFeatureFlag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExperimentalFeatureFlag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ExperimentalFeatureFlag parseFrom(InputStream inputStream) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExperimentalFeatureFlag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExperimentalFeatureFlag parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ExperimentalFeatureFlag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ExperimentalFeatureFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Geo extends GeneratedMessageLite<Geo, v8> implements w8 {
        public static final int CITY_FIELD_NUMBER = 6;
        public static final int COUNTRY_ISO2_CODE_FIELD_NUMBER = 2;
        public static final int COUNTRY_ISO3_CODE_FIELD_NUMBER = 1;
        private static final Geo DEFAULT_INSTANCE;
        public static final int LATITUDE_FIELD_NUMBER = 3;
        public static final int LONGITUDE_FIELD_NUMBER = 4;
        private static volatile Parser<Geo> PARSER = null;
        public static final int REGION_FIELD_NUMBER = 7;
        public static final int ZIP_CODE_FIELD_NUMBER = 5;
        private float latitude_;
        private float longitude_;
        private String countryIso3Code_ = "";
        private String countryIso2Code_ = "";
        private String zipCode_ = "";
        private String city_ = "";
        private String region_ = "";

        static {
            Geo geo = new Geo();
            DEFAULT_INSTANCE = geo;
            GeneratedMessageLite.registerDefaultInstance(Geo.class, geo);
        }

        private Geo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCity() {
            this.city_ = getDefaultInstance().getCity();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountryIso2Code() {
            this.countryIso2Code_ = getDefaultInstance().getCountryIso2Code();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountryIso3Code() {
            this.countryIso3Code_ = getDefaultInstance().getCountryIso3Code();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLatitude() {
            this.latitude_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongitude() {
            this.longitude_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegion() {
            this.region_ = getDefaultInstance().getRegion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearZipCode() {
            this.zipCode_ = getDefaultInstance().getZipCode();
        }

        public static Geo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static v8 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Geo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Geo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Geo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCity(String str) {
            str.getClass();
            this.city_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCityBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.city_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryIso2Code(String str) {
            str.getClass();
            this.countryIso2Code_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryIso2CodeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.countryIso2Code_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryIso3Code(String str) {
            str.getClass();
            this.countryIso3Code_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountryIso3CodeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.countryIso3Code_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLatitude(float f10) {
            this.latitude_ = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongitude(float f10) {
            this.longitude_ = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegion(String str) {
            str.getClass();
            this.region_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegionBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.region_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZipCode(String str) {
            str.getClass();
            this.zipCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setZipCodeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.zipCode_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (b8.f45668a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Geo();
                case 2:
                    return new v8(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0001\u0004\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"countryIso3Code_", "countryIso2Code_", "latitude_", "longitude_", "zipCode_", "city_", "region_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Geo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Geo.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.w8
        public String getCity() {
            return this.city_;
        }

        @Override // com.moloco.sdk.w8
        public ByteString getCityBytes() {
            return ByteString.copyFromUtf8(this.city_);
        }

        @Override // com.moloco.sdk.w8
        public String getCountryIso2Code() {
            return this.countryIso2Code_;
        }

        @Override // com.moloco.sdk.w8
        public ByteString getCountryIso2CodeBytes() {
            return ByteString.copyFromUtf8(this.countryIso2Code_);
        }

        @Override // com.moloco.sdk.w8
        public String getCountryIso3Code() {
            return this.countryIso3Code_;
        }

        @Override // com.moloco.sdk.w8
        public ByteString getCountryIso3CodeBytes() {
            return ByteString.copyFromUtf8(this.countryIso3Code_);
        }

        @Override // com.moloco.sdk.w8
        public float getLatitude() {
            return this.latitude_;
        }

        @Override // com.moloco.sdk.w8
        public float getLongitude() {
            return this.longitude_;
        }

        @Override // com.moloco.sdk.w8
        public String getRegion() {
            return this.region_;
        }

        @Override // com.moloco.sdk.w8
        public ByteString getRegionBytes() {
            return ByteString.copyFromUtf8(this.region_);
        }

        @Override // com.moloco.sdk.w8
        public String getZipCode() {
            return this.zipCode_;
        }

        @Override // com.moloco.sdk.w8
        public ByteString getZipCodeBytes() {
            return ByteString.copyFromUtf8(this.zipCode_);
        }

        public static v8 newBuilder(Geo geo) {
            return DEFAULT_INSTANCE.createBuilder(geo);
        }

        public static Geo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Geo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Geo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Geo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Geo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Geo parseFrom(InputStream inputStream) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Geo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Geo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Geo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ILRDConfig extends GeneratedMessageLite<ILRDConfig, y8> implements z8 {
        private static final ILRDConfig DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 5;
        public static final int MAX_SESSION_LEN_FIELD_NUMBER = 6;
        private static volatile Parser<ILRDConfig> PARSER = null;
        public static final int RAW_IMP_URL_FIELD_NUMBER = 2;
        public static final int RETRY_COUNT_FIELD_NUMBER = 4;
        public static final int SESSION_EXP_FIELD_NUMBER = 3;
        public static final int SUPPORTED_NETWORKS_FIELD_NUMBER = 8;
        public static final int UPLOAD_INTERVAL_FIELD_NUMBER = 7;
        private static final Internal.ListAdapter.Converter<Integer, h9> supportedNetworks_converter_ = new x8();
        private boolean enabled_;
        private int maxBatchSize_;
        private int maxSessionLen_;
        private int retryCount_;
        private int sessionExp_;
        private int supportedNetworksMemoizedSerializedSize;
        private int uploadInterval_;
        private String rawImpUrl_ = "";
        private Internal.IntList supportedNetworks_ = GeneratedMessageLite.emptyIntList();

        static {
            ILRDConfig iLRDConfig = new ILRDConfig();
            DEFAULT_INSTANCE = iLRDConfig;
            GeneratedMessageLite.registerDefaultInstance(ILRDConfig.class, iLRDConfig);
        }

        private ILRDConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSupportedNetworks(Iterable<? extends h9> iterable) {
            ensureSupportedNetworksIsMutable();
            Iterator<? extends h9> it = iterable.iterator();
            while (it.hasNext()) {
                this.supportedNetworks_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSupportedNetworksValue(Iterable<Integer> iterable) {
            ensureSupportedNetworksIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.supportedNetworks_.addInt(it.next().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedNetworks(h9 h9Var) {
            h9Var.getClass();
            ensureSupportedNetworksIsMutable();
            this.supportedNetworks_.addInt(h9Var.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSupportedNetworksValue(int i10) {
            ensureSupportedNetworksIsMutable();
            this.supportedNetworks_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.enabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxBatchSize() {
            this.maxBatchSize_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxSessionLen() {
            this.maxSessionLen_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRawImpUrl() {
            this.rawImpUrl_ = getDefaultInstance().getRawImpUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryCount() {
            this.retryCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionExp() {
            this.sessionExp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSupportedNetworks() {
            this.supportedNetworks_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUploadInterval() {
            this.uploadInterval_ = 0;
        }

        private void ensureSupportedNetworksIsMutable() {
            Internal.IntList intList = this.supportedNetworks_;
            if (intList.isModifiable()) {
                return;
            }
            this.supportedNetworks_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static ILRDConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static y8 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ILRDConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ILRDConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ILRDConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z10) {
            this.enabled_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxBatchSize(int i10) {
            this.maxBatchSize_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxSessionLen(int i10) {
            this.maxSessionLen_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRawImpUrl(String str) {
            str.getClass();
            this.rawImpUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRawImpUrlBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.rawImpUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryCount(int i10) {
            this.retryCount_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionExp(int i10) {
            this.sessionExp_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportedNetworks(int i10, h9 h9Var) {
            h9Var.getClass();
            ensureSupportedNetworksIsMutable();
            this.supportedNetworks_.setInt(i10, h9Var.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSupportedNetworksValue(int i10, int i11) {
            ensureSupportedNetworksIsMutable();
            this.supportedNetworks_.setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUploadInterval(int i10) {
            this.uploadInterval_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (b8.f45668a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ILRDConfig();
                case 2:
                    return new y8(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\u0007\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b,", new Object[]{"enabled_", "rawImpUrl_", "sessionExp_", "retryCount_", "maxBatchSize_", "maxSessionLen_", "uploadInterval_", "supportedNetworks_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ILRDConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ILRDConfig.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.z8
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // com.moloco.sdk.z8
        public int getMaxBatchSize() {
            return this.maxBatchSize_;
        }

        @Override // com.moloco.sdk.z8
        public int getMaxSessionLen() {
            return this.maxSessionLen_;
        }

        @Override // com.moloco.sdk.z8
        public String getRawImpUrl() {
            return this.rawImpUrl_;
        }

        @Override // com.moloco.sdk.z8
        public ByteString getRawImpUrlBytes() {
            return ByteString.copyFromUtf8(this.rawImpUrl_);
        }

        @Override // com.moloco.sdk.z8
        public int getRetryCount() {
            return this.retryCount_;
        }

        @Override // com.moloco.sdk.z8
        public int getSessionExp() {
            return this.sessionExp_;
        }

        @Override // com.moloco.sdk.z8
        public h9 getSupportedNetworks(int i10) {
            h9 h9VarForNumber = h9.forNumber(this.supportedNetworks_.getInt(i10));
            return h9VarForNumber == null ? h9.UNRECOGNIZED : h9VarForNumber;
        }

        @Override // com.moloco.sdk.z8
        public int getSupportedNetworksCount() {
            return this.supportedNetworks_.size();
        }

        @Override // com.moloco.sdk.z8
        public List<h9> getSupportedNetworksList() {
            return new Internal.ListAdapter(this.supportedNetworks_, supportedNetworks_converter_);
        }

        @Override // com.moloco.sdk.z8
        public int getSupportedNetworksValue(int i10) {
            return this.supportedNetworks_.getInt(i10);
        }

        @Override // com.moloco.sdk.z8
        public List<Integer> getSupportedNetworksValueList() {
            return this.supportedNetworks_;
        }

        @Override // com.moloco.sdk.z8
        public int getUploadInterval() {
            return this.uploadInterval_;
        }

        public static y8 newBuilder(ILRDConfig iLRDConfig) {
            return DEFAULT_INSTANCE.createBuilder(iLRDConfig);
        }

        public static ILRDConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ILRDConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ILRDConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ILRDConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ILRDConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ILRDConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ILRDConfig parseFrom(InputStream inputStream) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ILRDConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ILRDConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ILRDConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ILRDConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class OperationalMetricsConfig extends GeneratedMessageLite<OperationalMetricsConfig, a9> implements b9 {
        private static final OperationalMetricsConfig DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        private static volatile Parser<OperationalMetricsConfig> PARSER = null;
        public static final int POLLING_INTERVAL_SECONDS_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 2;
        private boolean enabled_;
        private int pollingIntervalSeconds_;
        private String url_ = "";

        static {
            OperationalMetricsConfig operationalMetricsConfig = new OperationalMetricsConfig();
            DEFAULT_INSTANCE = operationalMetricsConfig;
            GeneratedMessageLite.registerDefaultInstance(OperationalMetricsConfig.class, operationalMetricsConfig);
        }

        private OperationalMetricsConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.enabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPollingIntervalSeconds() {
            this.pollingIntervalSeconds_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static OperationalMetricsConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a9 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OperationalMetricsConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationalMetricsConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OperationalMetricsConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z10) {
            this.enabled_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPollingIntervalSeconds(int i10) {
            this.pollingIntervalSeconds_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (b8.f45668a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperationalMetricsConfig();
                case 2:
                    return new a9(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003\u0004", new Object[]{"enabled_", "url_", "pollingIntervalSeconds_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OperationalMetricsConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OperationalMetricsConfig.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.b9
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // com.moloco.sdk.b9
        public int getPollingIntervalSeconds() {
            return this.pollingIntervalSeconds_;
        }

        @Override // com.moloco.sdk.b9
        public String getUrl() {
            return this.url_;
        }

        @Override // com.moloco.sdk.b9
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public static a9 newBuilder(OperationalMetricsConfig operationalMetricsConfig) {
            return DEFAULT_INSTANCE.createBuilder(operationalMetricsConfig);
        }

        public static OperationalMetricsConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperationalMetricsConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OperationalMetricsConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperationalMetricsConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OperationalMetricsConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperationalMetricsConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OperationalMetricsConfig parseFrom(InputStream inputStream) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperationalMetricsConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperationalMetricsConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OperationalMetricsConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperationalMetricsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        Init$SDKInitResponse init$SDKInitResponse = new Init$SDKInitResponse();
        DEFAULT_INSTANCE = init$SDKInitResponse;
        GeneratedMessageLite.registerDefaultInstance(Init$SDKInitResponse.class, init$SDKInitResponse);
    }

    private Init$SDKInitResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdUnits(AdUnit adUnit) {
        adUnit.getClass();
        ensureAdUnitsIsMutable();
        this.adUnits_.add(adUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdUnits(Iterable<? extends AdUnit> iterable) {
        ensureAdUnitsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.adUnits_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExperimentalFeatureFlags(Iterable<? extends ExperimentalFeatureFlag> iterable) {
        ensureExperimentalFeatureFlagsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.experimentalFeatureFlags_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExperimentalFeatureFlags(ExperimentalFeatureFlag experimentalFeatureFlag) {
        experimentalFeatureFlag.getClass();
        ensureExperimentalFeatureFlagsIsMutable();
        this.experimentalFeatureFlags_.add(experimentalFeatureFlag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdServerUrl() {
        this.adServerUrl_ = getDefaultInstance().getAdServerUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdUnits() {
        this.adUnits_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppId() {
        this.appId_ = getDefaultInstance().getAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBidTokenConfig() {
        this.bidTokenConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigs() {
        this.configs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryIso2Code() {
        this.countryIso2Code_ = getDefaultInstance().getCountryIso2Code();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryIso3Code() {
        this.countryIso3Code_ = getDefaultInstance().getCountryIso3Code();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrashReportingConfig() {
        this.crashReportingConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventCollectionConfig() {
        this.eventCollectionConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentalFeatureFlags() {
        this.experimentalFeatureFlags_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeo() {
        this.geo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIlrdConfig() {
        this.ilrdConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperationalMetricsConfig() {
        this.operationalMetricsConfig_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatformId() {
        this.platformId_ = getDefaultInstance().getPlatformId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisherId() {
        this.publisherId_ = getDefaultInstance().getPublisherId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResolvedRegion() {
        this.resolvedRegion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerifyBannerVisible() {
        this.verifyBannerVisible_ = false;
    }

    private void ensureAdUnitsIsMutable() {
        Internal.ProtobufList<AdUnit> protobufList = this.adUnits_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.adUnits_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureExperimentalFeatureFlagsIsMutable() {
        Internal.ProtobufList<ExperimentalFeatureFlag> protobufList = this.experimentalFeatureFlags_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.experimentalFeatureFlags_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Init$SDKInitResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBidTokenConfig(BidTokenConfig bidTokenConfig) {
        bidTokenConfig.getClass();
        BidTokenConfig bidTokenConfig2 = this.bidTokenConfig_;
        if (bidTokenConfig2 == null || bidTokenConfig2 == BidTokenConfig.getDefaultInstance()) {
            this.bidTokenConfig_ = bidTokenConfig;
        } else {
            this.bidTokenConfig_ = (BidTokenConfig) ((m8) BidTokenConfig.newBuilder(this.bidTokenConfig_).mergeFrom((m8) bidTokenConfig)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfigs(ConfigsOuterClass$Configs configsOuterClass$Configs) {
        configsOuterClass$Configs.getClass();
        ConfigsOuterClass$Configs configsOuterClass$Configs2 = this.configs_;
        if (configsOuterClass$Configs2 == null || configsOuterClass$Configs2 == ConfigsOuterClass$Configs.getDefaultInstance()) {
            this.configs_ = configsOuterClass$Configs;
        } else {
            this.configs_ = (ConfigsOuterClass$Configs) ((j7) ConfigsOuterClass$Configs.newBuilder(this.configs_).mergeFrom((j7) configsOuterClass$Configs)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrashReportingConfig(CrashReportingConfig crashReportingConfig) {
        crashReportingConfig.getClass();
        CrashReportingConfig crashReportingConfig2 = this.crashReportingConfig_;
        if (crashReportingConfig2 == null || crashReportingConfig2 == CrashReportingConfig.getDefaultInstance()) {
            this.crashReportingConfig_ = crashReportingConfig;
        } else {
            this.crashReportingConfig_ = (CrashReportingConfig) ((p8) CrashReportingConfig.newBuilder(this.crashReportingConfig_).mergeFrom((p8) crashReportingConfig)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventCollectionConfig(EventCollectionConfig eventCollectionConfig) {
        eventCollectionConfig.getClass();
        EventCollectionConfig eventCollectionConfig2 = this.eventCollectionConfig_;
        if (eventCollectionConfig2 == null || eventCollectionConfig2 == EventCollectionConfig.getDefaultInstance()) {
            this.eventCollectionConfig_ = eventCollectionConfig;
        } else {
            this.eventCollectionConfig_ = (EventCollectionConfig) ((r8) EventCollectionConfig.newBuilder(this.eventCollectionConfig_).mergeFrom((r8) eventCollectionConfig)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeo(Geo geo) {
        geo.getClass();
        Geo geo2 = this.geo_;
        if (geo2 == null || geo2 == Geo.getDefaultInstance()) {
            this.geo_ = geo;
        } else {
            this.geo_ = (Geo) ((v8) Geo.newBuilder(this.geo_).mergeFrom((v8) geo)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIlrdConfig(ILRDConfig iLRDConfig) {
        iLRDConfig.getClass();
        ILRDConfig iLRDConfig2 = this.ilrdConfig_;
        if (iLRDConfig2 == null || iLRDConfig2 == ILRDConfig.getDefaultInstance()) {
            this.ilrdConfig_ = iLRDConfig;
        } else {
            this.ilrdConfig_ = (ILRDConfig) ((y8) ILRDConfig.newBuilder(this.ilrdConfig_).mergeFrom((y8) iLRDConfig)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOperationalMetricsConfig(OperationalMetricsConfig operationalMetricsConfig) {
        operationalMetricsConfig.getClass();
        OperationalMetricsConfig operationalMetricsConfig2 = this.operationalMetricsConfig_;
        if (operationalMetricsConfig2 == null || operationalMetricsConfig2 == OperationalMetricsConfig.getDefaultInstance()) {
            this.operationalMetricsConfig_ = operationalMetricsConfig;
        } else {
            this.operationalMetricsConfig_ = (OperationalMetricsConfig) ((a9) OperationalMetricsConfig.newBuilder(this.operationalMetricsConfig_).mergeFrom((a9) operationalMetricsConfig)).buildPartial();
        }
    }

    public static o8 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Init$SDKInitResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Init$SDKInitResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Init$SDKInitResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAdUnits(int i10) {
        ensureAdUnitsIsMutable();
        this.adUnits_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExperimentalFeatureFlags(int i10) {
        ensureExperimentalFeatureFlagsIsMutable();
        this.experimentalFeatureFlags_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdServerUrl(String str) {
        str.getClass();
        this.adServerUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdServerUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adServerUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdUnits(int i10, AdUnit adUnit) {
        adUnit.getClass();
        ensureAdUnitsIsMutable();
        this.adUnits_.set(i10, adUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppId(String str) {
        str.getClass();
        this.appId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBidTokenConfig(BidTokenConfig bidTokenConfig) {
        bidTokenConfig.getClass();
        this.bidTokenConfig_ = bidTokenConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigs(ConfigsOuterClass$Configs configsOuterClass$Configs) {
        configsOuterClass$Configs.getClass();
        this.configs_ = configsOuterClass$Configs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryIso2Code(String str) {
        str.getClass();
        this.countryIso2Code_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryIso2CodeBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.countryIso2Code_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryIso3Code(String str) {
        str.getClass();
        this.countryIso3Code_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryIso3CodeBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.countryIso3Code_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrashReportingConfig(CrashReportingConfig crashReportingConfig) {
        crashReportingConfig.getClass();
        this.crashReportingConfig_ = crashReportingConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventCollectionConfig(EventCollectionConfig eventCollectionConfig) {
        eventCollectionConfig.getClass();
        this.eventCollectionConfig_ = eventCollectionConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalFeatureFlags(int i10, ExperimentalFeatureFlag experimentalFeatureFlag) {
        experimentalFeatureFlag.getClass();
        ensureExperimentalFeatureFlagsIsMutable();
        this.experimentalFeatureFlags_.set(i10, experimentalFeatureFlag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeo(Geo geo) {
        geo.getClass();
        this.geo_ = geo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIlrdConfig(ILRDConfig iLRDConfig) {
        iLRDConfig.getClass();
        this.ilrdConfig_ = iLRDConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperationalMetricsConfig(OperationalMetricsConfig operationalMetricsConfig) {
        operationalMetricsConfig.getClass();
        this.operationalMetricsConfig_ = operationalMetricsConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformId(String str) {
        str.getClass();
        this.platformId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.platformId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherId(String str) {
        str.getClass();
        this.publisherId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.publisherId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolvedRegion(e9 e9Var) {
        this.resolvedRegion_ = e9Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResolvedRegionValue(int i10) {
        this.resolvedRegion_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerifyBannerVisible(boolean z10) {
        this.verifyBannerVisible_ = z10;
    }

    @Override // com.moloco.sdk.i9
    public String getAdServerUrl() {
        return this.adServerUrl_;
    }

    @Override // com.moloco.sdk.i9
    public ByteString getAdServerUrlBytes() {
        return ByteString.copyFromUtf8(this.adServerUrl_);
    }

    @Override // com.moloco.sdk.i9
    public AdUnit getAdUnits(int i10) {
        return this.adUnits_.get(i10);
    }

    @Override // com.moloco.sdk.i9
    public int getAdUnitsCount() {
        return this.adUnits_.size();
    }

    @Override // com.moloco.sdk.i9
    public List<AdUnit> getAdUnitsList() {
        return this.adUnits_;
    }

    public l8 getAdUnitsOrBuilder(int i10) {
        return this.adUnits_.get(i10);
    }

    public List<? extends l8> getAdUnitsOrBuilderList() {
        return this.adUnits_;
    }

    @Override // com.moloco.sdk.i9
    public String getAppId() {
        return this.appId_;
    }

    @Override // com.moloco.sdk.i9
    public ByteString getAppIdBytes() {
        return ByteString.copyFromUtf8(this.appId_);
    }

    @Override // com.moloco.sdk.i9
    public BidTokenConfig getBidTokenConfig() {
        BidTokenConfig bidTokenConfig = this.bidTokenConfig_;
        return bidTokenConfig == null ? BidTokenConfig.getDefaultInstance() : bidTokenConfig;
    }

    @Override // com.moloco.sdk.i9
    public ConfigsOuterClass$Configs getConfigs() {
        ConfigsOuterClass$Configs configsOuterClass$Configs = this.configs_;
        return configsOuterClass$Configs == null ? ConfigsOuterClass$Configs.getDefaultInstance() : configsOuterClass$Configs;
    }

    @Override // com.moloco.sdk.i9
    public String getCountryIso2Code() {
        return this.countryIso2Code_;
    }

    @Override // com.moloco.sdk.i9
    public ByteString getCountryIso2CodeBytes() {
        return ByteString.copyFromUtf8(this.countryIso2Code_);
    }

    @Override // com.moloco.sdk.i9
    public String getCountryIso3Code() {
        return this.countryIso3Code_;
    }

    @Override // com.moloco.sdk.i9
    public ByteString getCountryIso3CodeBytes() {
        return ByteString.copyFromUtf8(this.countryIso3Code_);
    }

    @Override // com.moloco.sdk.i9
    public CrashReportingConfig getCrashReportingConfig() {
        CrashReportingConfig crashReportingConfig = this.crashReportingConfig_;
        return crashReportingConfig == null ? CrashReportingConfig.getDefaultInstance() : crashReportingConfig;
    }

    @Override // com.moloco.sdk.i9
    public EventCollectionConfig getEventCollectionConfig() {
        EventCollectionConfig eventCollectionConfig = this.eventCollectionConfig_;
        return eventCollectionConfig == null ? EventCollectionConfig.getDefaultInstance() : eventCollectionConfig;
    }

    @Override // com.moloco.sdk.i9
    public ExperimentalFeatureFlag getExperimentalFeatureFlags(int i10) {
        return this.experimentalFeatureFlags_.get(i10);
    }

    @Override // com.moloco.sdk.i9
    public int getExperimentalFeatureFlagsCount() {
        return this.experimentalFeatureFlags_.size();
    }

    @Override // com.moloco.sdk.i9
    public List<ExperimentalFeatureFlag> getExperimentalFeatureFlagsList() {
        return this.experimentalFeatureFlags_;
    }

    public u8 getExperimentalFeatureFlagsOrBuilder(int i10) {
        return this.experimentalFeatureFlags_.get(i10);
    }

    public List<? extends u8> getExperimentalFeatureFlagsOrBuilderList() {
        return this.experimentalFeatureFlags_;
    }

    @Override // com.moloco.sdk.i9
    public Geo getGeo() {
        Geo geo = this.geo_;
        return geo == null ? Geo.getDefaultInstance() : geo;
    }

    @Override // com.moloco.sdk.i9
    public ILRDConfig getIlrdConfig() {
        ILRDConfig iLRDConfig = this.ilrdConfig_;
        return iLRDConfig == null ? ILRDConfig.getDefaultInstance() : iLRDConfig;
    }

    @Override // com.moloco.sdk.i9
    public OperationalMetricsConfig getOperationalMetricsConfig() {
        OperationalMetricsConfig operationalMetricsConfig = this.operationalMetricsConfig_;
        return operationalMetricsConfig == null ? OperationalMetricsConfig.getDefaultInstance() : operationalMetricsConfig;
    }

    @Override // com.moloco.sdk.i9
    public String getPlatformId() {
        return this.platformId_;
    }

    @Override // com.moloco.sdk.i9
    public ByteString getPlatformIdBytes() {
        return ByteString.copyFromUtf8(this.platformId_);
    }

    @Override // com.moloco.sdk.i9
    public String getPublisherId() {
        return this.publisherId_;
    }

    @Override // com.moloco.sdk.i9
    public ByteString getPublisherIdBytes() {
        return ByteString.copyFromUtf8(this.publisherId_);
    }

    @Override // com.moloco.sdk.i9
    public e9 getResolvedRegion() {
        e9 e9VarForNumber = e9.forNumber(this.resolvedRegion_);
        return e9VarForNumber == null ? e9.UNRECOGNIZED : e9VarForNumber;
    }

    @Override // com.moloco.sdk.i9
    public int getResolvedRegionValue() {
        return this.resolvedRegion_;
    }

    @Override // com.moloco.sdk.i9
    public boolean getVerifyBannerVisible() {
        return this.verifyBannerVisible_;
    }

    @Override // com.moloco.sdk.i9
    public boolean hasBidTokenConfig() {
        return this.bidTokenConfig_ != null;
    }

    @Override // com.moloco.sdk.i9
    public boolean hasConfigs() {
        return this.configs_ != null;
    }

    @Override // com.moloco.sdk.i9
    public boolean hasCrashReportingConfig() {
        return this.crashReportingConfig_ != null;
    }

    @Override // com.moloco.sdk.i9
    public boolean hasEventCollectionConfig() {
        return this.eventCollectionConfig_ != null;
    }

    @Override // com.moloco.sdk.i9
    public boolean hasGeo() {
        return this.geo_ != null;
    }

    @Override // com.moloco.sdk.i9
    public boolean hasIlrdConfig() {
        return this.ilrdConfig_ != null;
    }

    @Override // com.moloco.sdk.i9
    public boolean hasOperationalMetricsConfig() {
        return this.operationalMetricsConfig_ != null;
    }

    public static o8 newBuilder(Init$SDKInitResponse init$SDKInitResponse) {
        return DEFAULT_INSTANCE.createBuilder(init$SDKInitResponse);
    }

    public static Init$SDKInitResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Init$SDKInitResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (b8.f45668a[methodToInvoke.ordinal()]) {
            case 1:
                return new Init$SDKInitResponse();
            case 2:
                return new o8(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005\f\u0006Ȉ\u0007Ȉ\bȈ\t\u0007\n\t\u000b\t\f\t\r\u001b\u000e\t\u000f\t\u0010\t\u0011\t", new Object[]{"appId_", "publisherId_", "countryIso3Code_", "adUnits_", AdUnit.class, "resolvedRegion_", "adServerUrl_", "countryIso2Code_", "platformId_", "verifyBannerVisible_", "geo_", "eventCollectionConfig_", "bidTokenConfig_", "experimentalFeatureFlags_", ExperimentalFeatureFlag.class, "operationalMetricsConfig_", "crashReportingConfig_", YsiBvdpw.QkHHPDIeF, "ilrdConfig_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Init$SDKInitResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Init$SDKInitResponse.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static Init$SDKInitResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdUnits(int i10, AdUnit adUnit) {
        adUnit.getClass();
        ensureAdUnitsIsMutable();
        this.adUnits_.add(i10, adUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExperimentalFeatureFlags(int i10, ExperimentalFeatureFlag experimentalFeatureFlag) {
        experimentalFeatureFlag.getClass();
        ensureExperimentalFeatureFlagsIsMutable();
        this.experimentalFeatureFlags_.add(i10, experimentalFeatureFlag);
    }

    public static Init$SDKInitResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Init$SDKInitResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Init$SDKInitResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Init$SDKInitResponse parseFrom(InputStream inputStream) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Init$SDKInitResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Init$SDKInitResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Init$SDKInitResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Init$SDKInitResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
