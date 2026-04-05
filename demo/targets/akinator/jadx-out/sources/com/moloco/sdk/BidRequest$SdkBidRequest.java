package com.moloco.sdk;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.ironsource.U5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BidRequest$SdkBidRequest extends GeneratedMessageLite<BidRequest$SdkBidRequest, d> implements c5 {
    public static final int APP_FIELD_NUMBER = 1;
    private static final BidRequest$SdkBidRequest DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int IMP_FIELD_NUMBER = 3;
    private static volatile Parser<BidRequest$SdkBidRequest> PARSER = null;
    public static final int REGS_FIELD_NUMBER = 4;
    public static final int TMAX_FIELD_NUMBER = 5;
    public static final int USER_FIELD_NUMBER = 6;
    private App app_;
    private int bitField0_;
    private Device device_;
    private Imp imp_;
    private byte memoizedIsInitialized = 2;
    private Regs regs_;
    private int tmax_;
    private User user_;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class App extends GeneratedMessageLite<App, b> implements c {
        public static final int BUNDLE_FIELD_NUMBER = 1;
        private static final App DEFAULT_INSTANCE;
        private static volatile Parser<App> PARSER = null;
        public static final int VER_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String bundle_ = "";
        private String ver_ = "";

        static {
            App app = new App();
            DEFAULT_INSTANCE = app;
            GeneratedMessageLite.registerDefaultInstance(App.class, app);
        }

        private App() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBundle() {
            this.bitField0_ &= -2;
            this.bundle_ = getDefaultInstance().getBundle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVer() {
            this.bitField0_ &= -3;
            this.ver_ = getDefaultInstance().getVer();
        }

        public static App getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (App) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<App> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundle(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.bundle_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBundleBytes(ByteString byteString) {
            this.bundle_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVer(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.ver_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerBytes(ByteString byteString) {
            this.ver_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (a.f45443a[methodToInvoke.ordinal()]) {
                case 1:
                    return new App();
                case 2:
                    return new b(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"bitField0_", "bundle_", "ver_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<App> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (App.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.c
        public String getBundle() {
            return this.bundle_;
        }

        @Override // com.moloco.sdk.c
        public ByteString getBundleBytes() {
            return ByteString.copyFromUtf8(this.bundle_);
        }

        @Override // com.moloco.sdk.c
        public String getVer() {
            return this.ver_;
        }

        @Override // com.moloco.sdk.c
        public ByteString getVerBytes() {
            return ByteString.copyFromUtf8(this.ver_);
        }

        @Override // com.moloco.sdk.c
        public boolean hasBundle() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.c
        public boolean hasVer() {
            return (this.bitField0_ & 2) != 0;
        }

        public static b newBuilder(App app) {
            return DEFAULT_INSTANCE.createBuilder(app);
        }

        public static App parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static App parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static App parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static App parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static App parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static App parseFrom(InputStream inputStream) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static App parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static App parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static App parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Device extends GeneratedMessageLite.ExtendableMessage<Device, e> implements a0 {
        public static final int CARRIER_FIELD_NUMBER = 10;
        public static final int CONNECTIONTYPE_FIELD_NUMBER = 17;
        private static final Device DEFAULT_INSTANCE;
        public static final int DEVICETYPE_FIELD_NUMBER = 18;
        public static final int DIDMD5_FIELD_NUMBER = 6;
        public static final int DIDSHA1_FIELD_NUMBER = 5;
        public static final int DNT_FIELD_NUMBER = 1;
        public static final int DPIDMD5_FIELD_NUMBER = 8;
        public static final int DPIDSHA1_FIELD_NUMBER = 7;
        public static final int FLASHVER_FIELD_NUMBER = 19;
        public static final int GEOFETCH_FIELD_NUMBER = 29;
        public static final int GEO_FIELD_NUMBER = 4;
        public static final int HWV_FIELD_NUMBER = 24;
        public static final int H_FIELD_NUMBER = 26;
        public static final int IFA_FIELD_NUMBER = 20;
        public static final int IPV6_FIELD_NUMBER = 9;
        public static final int IP_FIELD_NUMBER = 3;
        public static final int JS_FIELD_NUMBER = 16;
        public static final int LANGB_FIELD_NUMBER = 32;
        public static final int LANGUAGE_FIELD_NUMBER = 11;
        public static final int LMT_FIELD_NUMBER = 23;
        public static final int MACMD5_FIELD_NUMBER = 22;
        public static final int MACSHA1_FIELD_NUMBER = 21;
        public static final int MAKE_FIELD_NUMBER = 12;
        public static final int MCCMNC_FIELD_NUMBER = 30;
        public static final int MODEL_FIELD_NUMBER = 13;
        public static final int OSV_FIELD_NUMBER = 15;
        public static final int OS_FIELD_NUMBER = 14;
        private static volatile Parser<Device> PARSER = null;
        public static final int PPI_FIELD_NUMBER = 27;
        public static final int PXRATIO_FIELD_NUMBER = 28;
        public static final int SUA_FIELD_NUMBER = 31;
        public static final int UA_FIELD_NUMBER = 2;
        public static final int W_FIELD_NUMBER = 25;
        private int bitField0_;
        private int connectiontype_;
        private boolean dnt_;
        private Geo geo_;
        private boolean geofetch_;
        private int h_;
        private boolean js_;
        private boolean lmt_;
        private int ppi_;
        private double pxratio_;
        private UserAgent sua_;
        private int w_;
        private byte memoizedIsInitialized = 2;
        private String ua_ = "";
        private String ip_ = "";
        private String ipv6_ = "";
        private int devicetype_ = 1;
        private String make_ = "";
        private String model_ = "";
        private String os_ = "";
        private String osv_ = "";
        private String hwv_ = "";
        private String flashver_ = "";
        private String language_ = "";
        private String langb_ = "";
        private String carrier_ = "";
        private String mccmnc_ = "";
        private String ifa_ = "";
        private String didsha1_ = "";
        private String didmd5_ = "";
        private String dpidsha1_ = "";
        private String dpidmd5_ = "";
        private String macsha1_ = "";
        private String macmd5_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Geo extends GeneratedMessageLite.ExtendableMessage<Geo, l> implements s {
            public static final int ACCURACY_FIELD_NUMBER = 11;
            public static final int CITY_FIELD_NUMBER = 7;
            public static final int COUNTRY_FIELD_NUMBER = 3;
            private static final Geo DEFAULT_INSTANCE;
            public static final int IPSERVICE_FIELD_NUMBER = 13;
            public static final int LASTFIX_FIELD_NUMBER = 12;
            public static final int LAT_FIELD_NUMBER = 1;
            public static final int LON_FIELD_NUMBER = 2;
            public static final int METRO_FIELD_NUMBER = 6;
            private static volatile Parser<Geo> PARSER = null;
            public static final int REGIONFIPS104_FIELD_NUMBER = 5;
            public static final int REGION_FIELD_NUMBER = 4;
            public static final int TYPE_FIELD_NUMBER = 9;
            public static final int UTCOFFSET_FIELD_NUMBER = 10;
            public static final int ZIP_FIELD_NUMBER = 8;
            private int accuracy_;
            private int bitField0_;
            private int lastfix_;
            private double lat_;
            private double lon_;
            private int utcoffset_;
            private byte memoizedIsInitialized = 2;
            private String country_ = "";
            private String region_ = "";
            private String regionfips104_ = "";
            private String metro_ = "";
            private String city_ = "";
            private String zip_ = "";
            private int type_ = 1;
            private int ipservice_ = 1;

            static {
                Geo geo = new Geo();
                DEFAULT_INSTANCE = geo;
                GeneratedMessageLite.registerDefaultInstance(Geo.class, geo);
            }

            private Geo() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAccuracy() {
                this.bitField0_ &= -513;
                this.accuracy_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCity() {
                this.bitField0_ &= -65;
                this.city_ = getDefaultInstance().getCity();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCountry() {
                this.bitField0_ &= -5;
                this.country_ = getDefaultInstance().getCountry();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIpservice() {
                this.bitField0_ &= -2049;
                this.ipservice_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLastfix() {
                this.bitField0_ &= -1025;
                this.lastfix_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLat() {
                this.bitField0_ &= -2;
                this.lat_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLon() {
                this.bitField0_ &= -3;
                this.lon_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMetro() {
                this.bitField0_ &= -33;
                this.metro_ = getDefaultInstance().getMetro();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRegion() {
                this.bitField0_ &= -9;
                this.region_ = getDefaultInstance().getRegion();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRegionfips104() {
                this.bitField0_ &= -17;
                this.regionfips104_ = getDefaultInstance().getRegionfips104();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearType() {
                this.bitField0_ &= -257;
                this.type_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUtcoffset() {
                this.bitField0_ &= -4097;
                this.utcoffset_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearZip() {
                this.bitField0_ &= -129;
                this.zip_ = getDefaultInstance().getZip();
            }

            public static Geo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static l newBuilder() {
                return (l) DEFAULT_INSTANCE.createBuilder();
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
            public void setAccuracy(int i10) {
                this.bitField0_ |= 512;
                this.accuracy_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCity(String str) {
                str.getClass();
                this.bitField0_ |= 64;
                this.city_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCityBytes(ByteString byteString) {
                this.city_ = byteString.toStringUtf8();
                this.bitField0_ |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCountry(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.country_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCountryBytes(ByteString byteString) {
                this.country_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIpservice(o oVar) {
                this.ipservice_ = oVar.getNumber();
                this.bitField0_ |= 2048;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLastfix(int i10) {
                this.bitField0_ |= 1024;
                this.lastfix_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLat(double d10) {
                this.bitField0_ |= 1;
                this.lat_ = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLon(double d10) {
                this.bitField0_ |= 2;
                this.lon_ = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMetro(String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.metro_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMetroBytes(ByteString byteString) {
                this.metro_ = byteString.toStringUtf8();
                this.bitField0_ |= 32;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRegion(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.region_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRegionBytes(ByteString byteString) {
                this.region_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRegionfips104(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.regionfips104_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRegionfips104Bytes(ByteString byteString) {
                this.regionfips104_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setType(r rVar) {
                this.type_ = rVar.getNumber();
                this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUtcoffset(int i10) {
                this.bitField0_ |= 4096;
                this.utcoffset_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setZip(String str) {
                str.getClass();
                this.bitField0_ |= 128;
                this.zip_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setZipBytes(ByteString byteString) {
                this.zip_ = byteString.toStringUtf8();
                this.bitField0_ |= 128;
            }

            @Override // com.moloco.sdk.s
            public int getAccuracy() {
                return this.accuracy_;
            }

            @Override // com.moloco.sdk.s
            public String getCity() {
                return this.city_;
            }

            @Override // com.moloco.sdk.s
            public ByteString getCityBytes() {
                return ByteString.copyFromUtf8(this.city_);
            }

            @Override // com.moloco.sdk.s
            public String getCountry() {
                return this.country_;
            }

            @Override // com.moloco.sdk.s
            public ByteString getCountryBytes() {
                return ByteString.copyFromUtf8(this.country_);
            }

            @Override // com.moloco.sdk.s
            public o getIpservice() {
                o oVarForNumber = o.forNumber(this.ipservice_);
                return oVarForNumber == null ? o.IP2LOCATION : oVarForNumber;
            }

            @Override // com.moloco.sdk.s
            public int getLastfix() {
                return this.lastfix_;
            }

            @Override // com.moloco.sdk.s
            public double getLat() {
                return this.lat_;
            }

            @Override // com.moloco.sdk.s
            public double getLon() {
                return this.lon_;
            }

            @Override // com.moloco.sdk.s
            public String getMetro() {
                return this.metro_;
            }

            @Override // com.moloco.sdk.s
            public ByteString getMetroBytes() {
                return ByteString.copyFromUtf8(this.metro_);
            }

            @Override // com.moloco.sdk.s
            public String getRegion() {
                return this.region_;
            }

            @Override // com.moloco.sdk.s
            public ByteString getRegionBytes() {
                return ByteString.copyFromUtf8(this.region_);
            }

            @Override // com.moloco.sdk.s
            public String getRegionfips104() {
                return this.regionfips104_;
            }

            @Override // com.moloco.sdk.s
            public ByteString getRegionfips104Bytes() {
                return ByteString.copyFromUtf8(this.regionfips104_);
            }

            @Override // com.moloco.sdk.s
            public r getType() {
                r rVarForNumber = r.forNumber(this.type_);
                return rVarForNumber == null ? r.GPS_LOCATION : rVarForNumber;
            }

            @Override // com.moloco.sdk.s
            public int getUtcoffset() {
                return this.utcoffset_;
            }

            @Override // com.moloco.sdk.s
            public String getZip() {
                return this.zip_;
            }

            @Override // com.moloco.sdk.s
            public ByteString getZipBytes() {
                return ByteString.copyFromUtf8(this.zip_);
            }

            @Override // com.moloco.sdk.s
            public boolean hasAccuracy() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasCity() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasCountry() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasIpservice() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasLastfix() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasLat() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasLon() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasMetro() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasRegion() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasRegionfips104() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasType() {
                return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasUtcoffset() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.moloco.sdk.s
            public boolean hasZip() {
                return (this.bitField0_ & 128) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static l newBuilder(Geo geo) {
                return (l) DEFAULT_INSTANCE.createBuilder(geo);
            }

            public static Geo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Geo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Geo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Geo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (a.f45443a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Geo();
                    case 2:
                        return new l(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဌ\b\nင\f\u000bင\t\fင\n\rဌ\u000b", new Object[]{"bitField0_", "lat_", "lon_", "country_", "region_", "regionfips104_", "metro_", PtLatqAYjEFT.QrgDTXKlUuuBG, "zip_", "type_", r.internalGetVerifier(), "utcoffset_", "accuracy_", "lastfix_", "ipservice_", o.internalGetVerifier()});
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
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
        public static final class UserAgent extends GeneratedMessageLite<UserAgent, v> implements z {
            public static final int ARCHITECTURE_FIELD_NUMBER = 4;
            public static final int BITNESS_FIELD_NUMBER = 5;
            public static final int BROWSERS_FIELD_NUMBER = 1;
            private static final UserAgent DEFAULT_INSTANCE;
            public static final int MOBILE_FIELD_NUMBER = 3;
            public static final int MODEL_FIELD_NUMBER = 6;
            private static volatile Parser<UserAgent> PARSER = null;
            public static final int PLATFORM_FIELD_NUMBER = 2;
            public static final int SOURCE_FIELD_NUMBER = 7;
            private int bitField0_;
            private boolean mobile_;
            private BrandVersion platform_;
            private int source_;
            private Internal.ProtobufList<BrandVersion> browsers_ = GeneratedMessageLite.emptyProtobufList();
            private String architecture_ = "";
            private String bitness_ = "";
            private String model_ = "";

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class BrandVersion extends GeneratedMessageLite<BrandVersion, t> implements u {
                public static final int BRAND_FIELD_NUMBER = 1;
                private static final BrandVersion DEFAULT_INSTANCE;
                private static volatile Parser<BrandVersion> PARSER = null;
                public static final int VERSION_FIELD_NUMBER = 2;
                private int bitField0_;
                private String brand_ = "";
                private Internal.ProtobufList<String> version_ = GeneratedMessageLite.emptyProtobufList();

                static {
                    BrandVersion brandVersion = new BrandVersion();
                    DEFAULT_INSTANCE = brandVersion;
                    GeneratedMessageLite.registerDefaultInstance(BrandVersion.class, brandVersion);
                }

                private BrandVersion() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addAllVersion(Iterable<String> iterable) {
                    ensureVersionIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.version_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addVersion(String str) {
                    str.getClass();
                    ensureVersionIsMutable();
                    this.version_.add(str);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addVersionBytes(ByteString byteString) {
                    ensureVersionIsMutable();
                    this.version_.add(byteString.toStringUtf8());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearBrand() {
                    this.bitField0_ &= -2;
                    this.brand_ = getDefaultInstance().getBrand();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearVersion() {
                    this.version_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void ensureVersionIsMutable() {
                    Internal.ProtobufList<String> protobufList = this.version_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.version_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static BrandVersion getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static t newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static BrandVersion parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static BrandVersion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<BrandVersion> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setBrand(String str) {
                    str.getClass();
                    this.bitField0_ |= 1;
                    this.brand_ = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setBrandBytes(ByteString byteString) {
                    this.brand_ = byteString.toStringUtf8();
                    this.bitField0_ |= 1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setVersion(int i10, String str) {
                    str.getClass();
                    ensureVersionIsMutable();
                    this.version_.set(i10, str);
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (a.f45443a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new BrandVersion();
                        case 2:
                            return new t(DEFAULT_INSTANCE);
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"bitField0_", "brand_", "version_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<BrandVersion> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (BrandVersion.class) {
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

                @Override // com.moloco.sdk.u
                public String getBrand() {
                    return this.brand_;
                }

                @Override // com.moloco.sdk.u
                public ByteString getBrandBytes() {
                    return ByteString.copyFromUtf8(this.brand_);
                }

                @Override // com.moloco.sdk.u
                public String getVersion(int i10) {
                    return this.version_.get(i10);
                }

                @Override // com.moloco.sdk.u
                public ByteString getVersionBytes(int i10) {
                    return ByteString.copyFromUtf8(this.version_.get(i10));
                }

                @Override // com.moloco.sdk.u
                public int getVersionCount() {
                    return this.version_.size();
                }

                @Override // com.moloco.sdk.u
                public List<String> getVersionList() {
                    return this.version_;
                }

                @Override // com.moloco.sdk.u
                public boolean hasBrand() {
                    return (this.bitField0_ & 1) != 0;
                }

                public static t newBuilder(BrandVersion brandVersion) {
                    return DEFAULT_INSTANCE.createBuilder(brandVersion);
                }

                public static BrandVersion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static BrandVersion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static BrandVersion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static BrandVersion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static BrandVersion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static BrandVersion parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static BrandVersion parseFrom(InputStream inputStream) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static BrandVersion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static BrandVersion parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static BrandVersion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (BrandVersion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            static {
                UserAgent userAgent = new UserAgent();
                DEFAULT_INSTANCE = userAgent;
                GeneratedMessageLite.registerDefaultInstance(UserAgent.class, userAgent);
            }

            private UserAgent() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllBrowsers(Iterable<? extends BrandVersion> iterable) {
                ensureBrowsersIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.browsers_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addBrowsers(BrandVersion brandVersion) {
                brandVersion.getClass();
                ensureBrowsersIsMutable();
                this.browsers_.add(brandVersion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearArchitecture() {
                this.bitField0_ &= -5;
                this.architecture_ = getDefaultInstance().getArchitecture();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBitness() {
                this.bitField0_ &= -9;
                this.bitness_ = getDefaultInstance().getBitness();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBrowsers() {
                this.browsers_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMobile() {
                this.bitField0_ &= -3;
                this.mobile_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearModel() {
                this.bitField0_ &= -17;
                this.model_ = getDefaultInstance().getModel();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPlatform() {
                this.platform_ = null;
                this.bitField0_ &= -2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSource() {
                this.bitField0_ &= -33;
                this.source_ = 0;
            }

            private void ensureBrowsersIsMutable() {
                Internal.ProtobufList<BrandVersion> protobufList = this.browsers_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.browsers_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static UserAgent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergePlatform(BrandVersion brandVersion) {
                brandVersion.getClass();
                BrandVersion brandVersion2 = this.platform_;
                if (brandVersion2 == null || brandVersion2 == BrandVersion.getDefaultInstance()) {
                    this.platform_ = brandVersion;
                } else {
                    this.platform_ = (BrandVersion) ((t) BrandVersion.newBuilder(this.platform_).mergeFrom((t) brandVersion)).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static v newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static UserAgent parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static UserAgent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<UserAgent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeBrowsers(int i10) {
                ensureBrowsersIsMutable();
                this.browsers_.remove(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setArchitecture(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.architecture_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setArchitectureBytes(ByteString byteString) {
                this.architecture_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBitness(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.bitness_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBitnessBytes(ByteString byteString) {
                this.bitness_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBrowsers(int i10, BrandVersion brandVersion) {
                brandVersion.getClass();
                ensureBrowsersIsMutable();
                this.browsers_.set(i10, brandVersion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMobile(boolean z10) {
                this.bitField0_ |= 2;
                this.mobile_ = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setModel(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.model_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setModelBytes(ByteString byteString) {
                this.model_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPlatform(BrandVersion brandVersion) {
                brandVersion.getClass();
                this.platform_ = brandVersion;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSource(y yVar) {
                this.source_ = yVar.getNumber();
                this.bitField0_ |= 32;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (a.f45443a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new UserAgent();
                    case 2:
                        return new v(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဌ\u0005", new Object[]{"bitField0_", "browsers_", BrandVersion.class, "platform_", "mobile_", "architecture_", "bitness_", "model_", "source_", y.internalGetVerifier()});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<UserAgent> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (UserAgent.class) {
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

            @Override // com.moloco.sdk.z
            public String getArchitecture() {
                return this.architecture_;
            }

            @Override // com.moloco.sdk.z
            public ByteString getArchitectureBytes() {
                return ByteString.copyFromUtf8(this.architecture_);
            }

            @Override // com.moloco.sdk.z
            public String getBitness() {
                return this.bitness_;
            }

            @Override // com.moloco.sdk.z
            public ByteString getBitnessBytes() {
                return ByteString.copyFromUtf8(this.bitness_);
            }

            @Override // com.moloco.sdk.z
            public BrandVersion getBrowsers(int i10) {
                return this.browsers_.get(i10);
            }

            @Override // com.moloco.sdk.z
            public int getBrowsersCount() {
                return this.browsers_.size();
            }

            @Override // com.moloco.sdk.z
            public List<BrandVersion> getBrowsersList() {
                return this.browsers_;
            }

            public u getBrowsersOrBuilder(int i10) {
                return this.browsers_.get(i10);
            }

            public List<? extends u> getBrowsersOrBuilderList() {
                return this.browsers_;
            }

            @Override // com.moloco.sdk.z
            public boolean getMobile() {
                return this.mobile_;
            }

            @Override // com.moloco.sdk.z
            public String getModel() {
                return this.model_;
            }

            @Override // com.moloco.sdk.z
            public ByteString getModelBytes() {
                return ByteString.copyFromUtf8(this.model_);
            }

            @Override // com.moloco.sdk.z
            public BrandVersion getPlatform() {
                BrandVersion brandVersion = this.platform_;
                return brandVersion == null ? BrandVersion.getDefaultInstance() : brandVersion;
            }

            @Override // com.moloco.sdk.z
            public y getSource() {
                y yVarForNumber = y.forNumber(this.source_);
                return yVarForNumber == null ? y.UNKNOWN_SOURCE : yVarForNumber;
            }

            @Override // com.moloco.sdk.z
            public boolean hasArchitecture() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.z
            public boolean hasBitness() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.moloco.sdk.z
            public boolean hasMobile() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.z
            public boolean hasModel() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.moloco.sdk.z
            public boolean hasPlatform() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.z
            public boolean hasSource() {
                return (this.bitField0_ & 32) != 0;
            }

            public static v newBuilder(UserAgent userAgent) {
                return DEFAULT_INSTANCE.createBuilder(userAgent);
            }

            public static UserAgent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static UserAgent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static UserAgent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addBrowsers(int i10, BrandVersion brandVersion) {
                brandVersion.getClass();
                ensureBrowsersIsMutable();
                this.browsers_.add(i10, brandVersion);
            }

            public static UserAgent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static UserAgent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static UserAgent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static UserAgent parseFrom(InputStream inputStream) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static UserAgent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static UserAgent parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static UserAgent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (UserAgent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Device device = new Device();
            DEFAULT_INSTANCE = device;
            GeneratedMessageLite.registerDefaultInstance(Device.class, device);
        }

        private Device() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCarrier() {
            this.bitField0_ &= -4194305;
            this.carrier_ = getDefaultInstance().getCarrier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectiontype() {
            this.bitField0_ &= -16777217;
            this.connectiontype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDevicetype() {
            this.bitField0_ &= -129;
            this.devicetype_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDidmd5() {
            this.bitField0_ &= -134217729;
            this.didmd5_ = getDefaultInstance().getDidmd5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDidsha1() {
            this.bitField0_ &= -67108865;
            this.didsha1_ = getDefaultInstance().getDidsha1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDnt() {
            this.bitField0_ &= -3;
            this.dnt_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDpidmd5() {
            this.bitField0_ &= -536870913;
            this.dpidmd5_ = getDefaultInstance().getDpidmd5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDpidsha1() {
            this.bitField0_ &= -268435457;
            this.dpidsha1_ = getDefaultInstance().getDpidsha1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlashver() {
            this.bitField0_ &= -524289;
            this.flashver_ = getDefaultInstance().getFlashver();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeo() {
            this.geo_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeofetch() {
            this.bitField0_ &= -262145;
            this.geofetch_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearH() {
            this.bitField0_ &= -16385;
            this.h_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHwv() {
            this.bitField0_ &= -4097;
            this.hwv_ = getDefaultInstance().getHwv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIfa() {
            this.bitField0_ &= -33554433;
            this.ifa_ = getDefaultInstance().getIfa();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIp() {
            this.bitField0_ &= -33;
            this.ip_ = getDefaultInstance().getIp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIpv6() {
            this.bitField0_ &= -65;
            this.ipv6_ = getDefaultInstance().getIpv6();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJs() {
            this.bitField0_ &= -131073;
            this.js_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLangb() {
            this.bitField0_ &= -2097153;
            this.langb_ = getDefaultInstance().getLangb();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguage() {
            this.bitField0_ &= -1048577;
            this.language_ = getDefaultInstance().getLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLmt() {
            this.bitField0_ &= -5;
            this.lmt_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMacmd5() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.macmd5_ = getDefaultInstance().getMacmd5();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMacsha1() {
            this.bitField0_ &= -1073741825;
            this.macsha1_ = getDefaultInstance().getMacsha1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMake() {
            this.bitField0_ &= -257;
            this.make_ = getDefaultInstance().getMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMccmnc() {
            this.bitField0_ &= -8388609;
            this.mccmnc_ = getDefaultInstance().getMccmnc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.bitField0_ &= -513;
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOs() {
            this.bitField0_ &= -1025;
            this.os_ = getDefaultInstance().getOs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsv() {
            this.bitField0_ &= -2049;
            this.osv_ = getDefaultInstance().getOsv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPpi() {
            this.bitField0_ &= -32769;
            this.ppi_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPxratio() {
            this.bitField0_ &= -65537;
            this.pxratio_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSua() {
            this.sua_ = null;
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUa() {
            this.bitField0_ &= -9;
            this.ua_ = getDefaultInstance().getUa();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearW() {
            this.bitField0_ &= -8193;
            this.w_ = 0;
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeGeo(Geo geo) {
            geo.getClass();
            Geo geo2 = this.geo_;
            if (geo2 == null || geo2 == Geo.getDefaultInstance()) {
                this.geo_ = geo;
            } else {
                this.geo_ = (Geo) ((l) Geo.newBuilder(this.geo_).mergeFrom((l) geo)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSua(UserAgent userAgent) {
            userAgent.getClass();
            UserAgent userAgent2 = this.sua_;
            if (userAgent2 == null || userAgent2 == UserAgent.getDefaultInstance()) {
                this.sua_ = userAgent;
            } else {
                this.sua_ = (UserAgent) ((v) UserAgent.newBuilder(this.sua_).mergeFrom((v) userAgent)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static e newBuilder() {
            return (e) DEFAULT_INSTANCE.createBuilder();
        }

        public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Device> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarrier(String str) {
            str.getClass();
            this.bitField0_ |= 4194304;
            this.carrier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCarrierBytes(ByteString byteString) {
            this.carrier_ = byteString.toStringUtf8();
            this.bitField0_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectiontype(h hVar) {
            this.connectiontype_ = hVar.getNumber();
            this.bitField0_ |= 16777216;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDevicetype(k kVar) {
            this.devicetype_ = kVar.getNumber();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDidmd5(String str) {
            str.getClass();
            this.bitField0_ |= 134217728;
            this.didmd5_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDidmd5Bytes(ByteString byteString) {
            this.didmd5_ = byteString.toStringUtf8();
            this.bitField0_ |= 134217728;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDidsha1(String str) {
            str.getClass();
            this.bitField0_ |= 67108864;
            this.didsha1_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDidsha1Bytes(ByteString byteString) {
            this.didsha1_ = byteString.toStringUtf8();
            this.bitField0_ |= 67108864;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDnt(boolean z10) {
            this.bitField0_ |= 2;
            this.dnt_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDpidmd5(String str) {
            str.getClass();
            this.bitField0_ |= 536870912;
            this.dpidmd5_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDpidmd5Bytes(ByteString byteString) {
            this.dpidmd5_ = byteString.toStringUtf8();
            this.bitField0_ |= 536870912;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDpidsha1(String str) {
            str.getClass();
            this.bitField0_ |= 268435456;
            this.dpidsha1_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDpidsha1Bytes(ByteString byteString) {
            this.dpidsha1_ = byteString.toStringUtf8();
            this.bitField0_ |= 268435456;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlashver(String str) {
            str.getClass();
            this.bitField0_ |= 524288;
            this.flashver_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlashverBytes(ByteString byteString) {
            this.flashver_ = byteString.toStringUtf8();
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeo(Geo geo) {
            geo.getClass();
            this.geo_ = geo;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeofetch(boolean z10) {
            this.bitField0_ |= 262144;
            this.geofetch_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setH(int i10) {
            this.bitField0_ |= 16384;
            this.h_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHwv(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.hwv_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHwvBytes(ByteString byteString) {
            this.hwv_ = byteString.toStringUtf8();
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIfa(String str) {
            str.getClass();
            this.bitField0_ |= 33554432;
            this.ifa_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIfaBytes(ByteString byteString) {
            this.ifa_ = byteString.toStringUtf8();
            this.bitField0_ |= 33554432;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIp(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.ip_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpBytes(ByteString byteString) {
            this.ip_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv6(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.ipv6_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpv6Bytes(ByteString byteString) {
            this.ipv6_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJs(boolean z10) {
            this.bitField0_ |= 131072;
            this.js_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLangb(String str) {
            str.getClass();
            this.bitField0_ |= 2097152;
            this.langb_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLangbBytes(ByteString byteString) {
            this.langb_ = byteString.toStringUtf8();
            this.bitField0_ |= 2097152;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguage(String str) {
            str.getClass();
            this.bitField0_ |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            this.language_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageBytes(ByteString byteString) {
            this.language_ = byteString.toStringUtf8();
            this.bitField0_ |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLmt(boolean z10) {
            this.bitField0_ |= 4;
            this.lmt_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMacmd5(String str) {
            str.getClass();
            this.bitField0_ |= Integer.MIN_VALUE;
            this.macmd5_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMacmd5Bytes(ByteString byteString) {
            this.macmd5_ = byteString.toStringUtf8();
            this.bitField0_ |= Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMacsha1(String str) {
            str.getClass();
            this.bitField0_ |= 1073741824;
            this.macsha1_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMacsha1Bytes(ByteString byteString) {
            this.macsha1_ = byteString.toStringUtf8();
            this.bitField0_ |= 1073741824;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMake(String str) {
            str.getClass();
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.make_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMakeBytes(ByteString byteString) {
            this.make_ = byteString.toStringUtf8();
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMccmnc(String str) {
            str.getClass();
            this.bitField0_ |= 8388608;
            this.mccmnc_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMccmncBytes(ByteString byteString) {
            this.mccmnc_ = byteString.toStringUtf8();
            this.bitField0_ |= 8388608;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(ByteString byteString) {
            this.model_ = byteString.toStringUtf8();
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOs(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.os_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsBytes(ByteString byteString) {
            this.os_ = byteString.toStringUtf8();
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsv(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.osv_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsvBytes(ByteString byteString) {
            this.osv_ = byteString.toStringUtf8();
            this.bitField0_ |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPpi(int i10) {
            this.bitField0_ |= 32768;
            this.ppi_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPxratio(double d10) {
            this.bitField0_ |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
            this.pxratio_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSua(UserAgent userAgent) {
            userAgent.getClass();
            this.sua_ = userAgent;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUa(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.ua_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUaBytes(ByteString byteString) {
            this.ua_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setW(int i10) {
            this.bitField0_ |= Segment.SIZE;
            this.w_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (a.f45443a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Device();
                case 2:
                    return new e(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001 \u0000\u0001\u0001  \u0000\u0000\u0001\u0001ဇ\u0001\u0002ဈ\u0003\u0003ဈ\u0005\u0004ᐉ\u0000\u0005ဈ\u001a\u0006ဈ\u001b\u0007ဈ\u001c\bဈ\u001d\tဈ\u0006\nဈ\u0016\u000bဈ\u0014\fဈ\b\rဈ\t\u000eဈ\n\u000fဈ\u000b\u0010ဇ\u0011\u0011ဌ\u0018\u0012ဌ\u0007\u0013ဈ\u0013\u0014ဈ\u0019\u0015ဈ\u001e\u0016ဈ\u001f\u0017ဇ\u0002\u0018ဈ\f\u0019င\r\u001aင\u000e\u001bင\u000f\u001cက\u0010\u001dဇ\u0012\u001eဈ\u0017\u001fဉ\u0004 ဈ\u0015", new Object[]{"bitField0_", "dnt_", "ua_", "ip_", "geo_", "didsha1_", "didmd5_", "dpidsha1_", "dpidmd5_", "ipv6_", "carrier_", "language_", "make_", "model_", "os_", "osv_", "js_", "connectiontype_", h.internalGetVerifier(), "devicetype_", k.internalGetVerifier(), "flashver_", "ifa_", "macsha1_", "macmd5_", "lmt_", "hwv_", "w_", "h_", "ppi_", "pxratio_", "geofetch_", "mccmnc_", "sua_", "langb_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Device> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Device.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.a0
        public String getCarrier() {
            return this.carrier_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getCarrierBytes() {
            return ByteString.copyFromUtf8(this.carrier_);
        }

        @Override // com.moloco.sdk.a0
        public h getConnectiontype() {
            h hVarForNumber = h.forNumber(this.connectiontype_);
            return hVarForNumber == null ? h.CONNECTION_UNKNOWN : hVarForNumber;
        }

        @Override // com.moloco.sdk.a0
        public k getDevicetype() {
            k kVarForNumber = k.forNumber(this.devicetype_);
            return kVarForNumber == null ? k.MOBILE : kVarForNumber;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public String getDidmd5() {
            return this.didmd5_;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public ByteString getDidmd5Bytes() {
            return ByteString.copyFromUtf8(this.didmd5_);
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public String getDidsha1() {
            return this.didsha1_;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public ByteString getDidsha1Bytes() {
            return ByteString.copyFromUtf8(this.didsha1_);
        }

        @Override // com.moloco.sdk.a0
        public boolean getDnt() {
            return this.dnt_;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public String getDpidmd5() {
            return this.dpidmd5_;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public ByteString getDpidmd5Bytes() {
            return ByteString.copyFromUtf8(this.dpidmd5_);
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public String getDpidsha1() {
            return this.dpidsha1_;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public ByteString getDpidsha1Bytes() {
            return ByteString.copyFromUtf8(this.dpidsha1_);
        }

        @Override // com.moloco.sdk.a0
        public String getFlashver() {
            return this.flashver_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getFlashverBytes() {
            return ByteString.copyFromUtf8(this.flashver_);
        }

        @Override // com.moloco.sdk.a0
        public Geo getGeo() {
            Geo geo = this.geo_;
            return geo == null ? Geo.getDefaultInstance() : geo;
        }

        @Override // com.moloco.sdk.a0
        public boolean getGeofetch() {
            return this.geofetch_;
        }

        @Override // com.moloco.sdk.a0
        public int getH() {
            return this.h_;
        }

        @Override // com.moloco.sdk.a0
        public String getHwv() {
            return this.hwv_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getHwvBytes() {
            return ByteString.copyFromUtf8(this.hwv_);
        }

        @Override // com.moloco.sdk.a0
        public String getIfa() {
            return this.ifa_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getIfaBytes() {
            return ByteString.copyFromUtf8(this.ifa_);
        }

        @Override // com.moloco.sdk.a0
        public String getIp() {
            return this.ip_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getIpBytes() {
            return ByteString.copyFromUtf8(this.ip_);
        }

        @Override // com.moloco.sdk.a0
        public String getIpv6() {
            return this.ipv6_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getIpv6Bytes() {
            return ByteString.copyFromUtf8(this.ipv6_);
        }

        @Override // com.moloco.sdk.a0
        public boolean getJs() {
            return this.js_;
        }

        @Override // com.moloco.sdk.a0
        public String getLangb() {
            return this.langb_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getLangbBytes() {
            return ByteString.copyFromUtf8(this.langb_);
        }

        @Override // com.moloco.sdk.a0
        public String getLanguage() {
            return this.language_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getLanguageBytes() {
            return ByteString.copyFromUtf8(this.language_);
        }

        @Override // com.moloco.sdk.a0
        public boolean getLmt() {
            return this.lmt_;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public String getMacmd5() {
            return this.macmd5_;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public ByteString getMacmd5Bytes() {
            return ByteString.copyFromUtf8(this.macmd5_);
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public String getMacsha1() {
            return this.macsha1_;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public ByteString getMacsha1Bytes() {
            return ByteString.copyFromUtf8(this.macsha1_);
        }

        @Override // com.moloco.sdk.a0
        public String getMake() {
            return this.make_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getMakeBytes() {
            return ByteString.copyFromUtf8(this.make_);
        }

        @Override // com.moloco.sdk.a0
        public String getMccmnc() {
            return this.mccmnc_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getMccmncBytes() {
            return ByteString.copyFromUtf8(this.mccmnc_);
        }

        @Override // com.moloco.sdk.a0
        public String getModel() {
            return this.model_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getModelBytes() {
            return ByteString.copyFromUtf8(this.model_);
        }

        @Override // com.moloco.sdk.a0
        public String getOs() {
            return this.os_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getOsBytes() {
            return ByteString.copyFromUtf8(this.os_);
        }

        @Override // com.moloco.sdk.a0
        public String getOsv() {
            return this.osv_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getOsvBytes() {
            return ByteString.copyFromUtf8(this.osv_);
        }

        @Override // com.moloco.sdk.a0
        public int getPpi() {
            return this.ppi_;
        }

        @Override // com.moloco.sdk.a0
        public double getPxratio() {
            return this.pxratio_;
        }

        @Override // com.moloco.sdk.a0
        public UserAgent getSua() {
            UserAgent userAgent = this.sua_;
            return userAgent == null ? UserAgent.getDefaultInstance() : userAgent;
        }

        @Override // com.moloco.sdk.a0
        public String getUa() {
            return this.ua_;
        }

        @Override // com.moloco.sdk.a0
        public ByteString getUaBytes() {
            return ByteString.copyFromUtf8(this.ua_);
        }

        @Override // com.moloco.sdk.a0
        public int getW() {
            return this.w_;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasCarrier() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasConnectiontype() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasDevicetype() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public boolean hasDidmd5() {
            return (this.bitField0_ & 134217728) != 0;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public boolean hasDidsha1() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasDnt() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public boolean hasDpidmd5() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public boolean hasDpidsha1() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasFlashver() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasGeo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasGeofetch() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasH() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasHwv() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasIfa() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasIp() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasIpv6() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasJs() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasLangb() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasLanguage() {
            return (this.bitField0_ & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasLmt() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public boolean hasMacmd5() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.moloco.sdk.a0
        @Deprecated
        public boolean hasMacsha1() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasMake() {
            return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasMccmnc() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasModel() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasOs() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasOsv() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasPpi() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasPxratio() {
            return (this.bitField0_ & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasSua() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasUa() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.moloco.sdk.a0
        public boolean hasW() {
            return (this.bitField0_ & Segment.SIZE) != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static e newBuilder(Device device) {
            return (e) DEFAULT_INSTANCE.createBuilder(device);
        }

        public static Device parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Device parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Device parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Device parseFrom(InputStream inputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Device parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Device) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Imp extends GeneratedMessageLite.ExtendableMessage<Imp, i1> implements v4 {
        public static final int AUDIO_FIELD_NUMBER = 15;
        public static final int BANNER_FIELD_NUMBER = 2;
        public static final int BIDFLOORCUR_FIELD_NUMBER = 9;
        public static final int BIDFLOOR_FIELD_NUMBER = 8;
        public static final int CLICKBROWSER_FIELD_NUMBER = 16;
        private static final Imp DEFAULT_INSTANCE;
        public static final int DISPLAYMANAGERVER_FIELD_NUMBER = 5;
        public static final int DISPLAYMANAGER_FIELD_NUMBER = 4;
        public static final int EXP_FIELD_NUMBER = 14;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IFRAMEBUSTER_FIELD_NUMBER = 10;
        public static final int INSTL_FIELD_NUMBER = 6;
        public static final int METRIC_FIELD_NUMBER = 17;
        public static final int NATIVE_FIELD_NUMBER = 13;
        private static volatile Parser<Imp> PARSER = null;
        public static final int PMP_FIELD_NUMBER = 11;
        public static final int RWDD_FIELD_NUMBER = 18;
        public static final int SECURE_FIELD_NUMBER = 12;
        public static final int SSAI_FIELD_NUMBER = 19;
        public static final int TAGID_FIELD_NUMBER = 7;
        public static final int VIDEO_FIELD_NUMBER = 3;
        private Audio audio_;
        private Banner banner_;
        private double bidfloor_;
        private int bitField0_;
        private boolean clickbrowser_;
        private int exp_;
        private boolean instl_;
        private Native native_;
        private Pmp pmp_;
        private boolean rwdd_;
        private boolean secure_;
        private int ssai_;
        private Video video_;
        private byte memoizedIsInitialized = 2;
        private String id_ = "";
        private String displaymanager_ = "";
        private String displaymanagerver_ = "";
        private String tagid_ = "";
        private String bidfloorcur_ = "USD";
        private Internal.ProtobufList<String> iframebuster_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Metric> metric_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Audio extends GeneratedMessageLite.ExtendableMessage<Audio, m0> implements t0 {
            public static final int API_FIELD_NUMBER = 13;
            public static final int BATTR_FIELD_NUMBER = 7;
            public static final int COMPANIONAD_FIELD_NUMBER = 12;
            public static final int COMPANIONTYPE_FIELD_NUMBER = 20;
            private static final Audio DEFAULT_INSTANCE;
            public static final int DELIVERY_FIELD_NUMBER = 11;
            public static final int FEED_FIELD_NUMBER = 22;
            public static final int MAXBITRATE_FIELD_NUMBER = 10;
            public static final int MAXDURATION_FIELD_NUMBER = 3;
            public static final int MAXEXTENDED_FIELD_NUMBER = 8;
            public static final int MAXSEQ_FIELD_NUMBER = 21;
            public static final int MIMES_FIELD_NUMBER = 1;
            public static final int MINBITRATE_FIELD_NUMBER = 9;
            public static final int MINCPMPERSEC_FIELD_NUMBER = 30;
            public static final int MINDURATION_FIELD_NUMBER = 2;
            public static final int NVOL_FIELD_NUMBER = 24;
            private static volatile Parser<Audio> PARSER = null;
            public static final int PODDUR_FIELD_NUMBER = 25;
            public static final int PODID_FIELD_NUMBER = 27;
            public static final int PODSEQ_FIELD_NUMBER = 28;
            public static final int PROTOCOLS_FIELD_NUMBER = 4;
            public static final int RQDDURS_FIELD_NUMBER = 26;
            public static final int SEQUENCE_FIELD_NUMBER = 6;
            public static final int SLOTINPOD_FIELD_NUMBER = 29;
            public static final int STARTDELAY_FIELD_NUMBER = 5;
            public static final int STITCHED_FIELD_NUMBER = 23;
            private int apiMemoizedSerializedSize;
            private int battrMemoizedSerializedSize;
            private int bitField0_;
            private int companiontypeMemoizedSerializedSize;
            private int deliveryMemoizedSerializedSize;
            private int maxbitrate_;
            private int maxduration_;
            private int maxextended_;
            private int maxseq_;
            private int minbitrate_;
            private double mincpmpersec_;
            private int minduration_;
            private int nvol_;
            private int poddur_;
            private int podseq_;
            private int protocolsMemoizedSerializedSize;
            private int slotinpod_;
            private int startdelay_;
            private boolean stitched_;
            private static final Internal.ListAdapter.Converter<Integer, u3> protocols_converter_ = new h0();
            private static final Internal.ListAdapter.Converter<Integer, r1> battr_converter_ = new i0();
            private static final Internal.ListAdapter.Converter<Integer, o1> delivery_converter_ = new j0();
            private static final Internal.ListAdapter.Converter<Integer, d0> api_converter_ = new k0();
            private static final Internal.ListAdapter.Converter<Integer, l1> companiontype_converter_ = new l0();
            private int rqddursMemoizedSerializedSize = -1;
            private byte memoizedIsInitialized = 2;
            private Internal.ProtobufList<String> mimes_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.IntList protocols_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList rqddurs_ = GeneratedMessageLite.emptyIntList();
            private String podid_ = "";
            private int sequence_ = 1;
            private Internal.IntList battr_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList delivery_ = GeneratedMessageLite.emptyIntList();
            private Internal.ProtobufList<Banner> companionad_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.IntList api_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList companiontype_ = GeneratedMessageLite.emptyIntList();
            private int feed_ = 1;

            static {
                Audio audio = new Audio();
                DEFAULT_INSTANCE = audio;
                GeneratedMessageLite.registerDefaultInstance(Audio.class, audio);
            }

            private Audio() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllApi(Iterable<? extends d0> iterable) {
                ensureApiIsMutable();
                Iterator<? extends d0> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllBattr(Iterable<? extends r1> iterable) {
                ensureBattrIsMutable();
                Iterator<? extends r1> it = iterable.iterator();
                while (it.hasNext()) {
                    this.battr_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllCompanionad(Iterable<? extends Banner> iterable) {
                ensureCompanionadIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.companionad_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllCompaniontype(Iterable<? extends l1> iterable) {
                ensureCompaniontypeIsMutable();
                Iterator<? extends l1> it = iterable.iterator();
                while (it.hasNext()) {
                    this.companiontype_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllDelivery(Iterable<? extends o1> iterable) {
                ensureDeliveryIsMutable();
                Iterator<? extends o1> it = iterable.iterator();
                while (it.hasNext()) {
                    this.delivery_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllMimes(Iterable<String> iterable) {
                ensureMimesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.mimes_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllProtocols(Iterable<? extends u3> iterable) {
                ensureProtocolsIsMutable();
                Iterator<? extends u3> it = iterable.iterator();
                while (it.hasNext()) {
                    this.protocols_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllRqddurs(Iterable<? extends Integer> iterable) {
                ensureRqddursIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.rqddurs_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addApi(d0 d0Var) {
                d0Var.getClass();
                ensureApiIsMutable();
                this.api_.addInt(d0Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addBattr(r1 r1Var) {
                r1Var.getClass();
                ensureBattrIsMutable();
                this.battr_.addInt(r1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addCompanionad(Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.add(banner);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addCompaniontype(l1 l1Var) {
                l1Var.getClass();
                ensureCompaniontypeIsMutable();
                this.companiontype_.addInt(l1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addDelivery(o1 o1Var) {
                o1Var.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.addInt(o1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addMimes(String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addMimesBytes(ByteString byteString) {
                ensureMimesIsMutable();
                this.mimes_.add(byteString.toStringUtf8());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addProtocols(u3 u3Var) {
                u3Var.getClass();
                ensureProtocolsIsMutable();
                this.protocols_.addInt(u3Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addRqddurs(int i10) {
                ensureRqddursIsMutable();
                this.rqddurs_.addInt(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearApi() {
                this.api_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBattr() {
                this.battr_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCompanionad() {
                this.companionad_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCompaniontype() {
                this.companiontype_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDelivery() {
                this.delivery_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearFeed() {
                this.bitField0_ &= -8193;
                this.feed_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxbitrate() {
                this.bitField0_ &= -2049;
                this.maxbitrate_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxduration() {
                this.bitField0_ &= -3;
                this.maxduration_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxextended() {
                this.bitField0_ &= -513;
                this.maxextended_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxseq() {
                this.bitField0_ &= -4097;
                this.maxseq_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMimes() {
                this.mimes_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMinbitrate() {
                this.bitField0_ &= -1025;
                this.minbitrate_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMincpmpersec() {
                this.bitField0_ &= -257;
                this.mincpmpersec_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMinduration() {
                this.bitField0_ &= -2;
                this.minduration_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNvol() {
                this.bitField0_ &= -32769;
                this.nvol_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPoddur() {
                this.bitField0_ &= -5;
                this.poddur_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPodid() {
                this.bitField0_ &= -17;
                this.podid_ = getDefaultInstance().getPodid();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPodseq() {
                this.bitField0_ &= -33;
                this.podseq_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearProtocols() {
                this.protocols_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRqddurs() {
                this.rqddurs_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSequence() {
                this.bitField0_ &= -65;
                this.sequence_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSlotinpod() {
                this.bitField0_ &= -129;
                this.slotinpod_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStartdelay() {
                this.bitField0_ &= -9;
                this.startdelay_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStitched() {
                this.bitField0_ &= -16385;
                this.stitched_ = false;
            }

            private void ensureApiIsMutable() {
                Internal.IntList intList = this.api_;
                if (intList.isModifiable()) {
                    return;
                }
                this.api_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureBattrIsMutable() {
                Internal.IntList intList = this.battr_;
                if (intList.isModifiable()) {
                    return;
                }
                this.battr_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureCompanionadIsMutable() {
                Internal.ProtobufList<Banner> protobufList = this.companionad_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.companionad_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureCompaniontypeIsMutable() {
                Internal.IntList intList = this.companiontype_;
                if (intList.isModifiable()) {
                    return;
                }
                this.companiontype_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureDeliveryIsMutable() {
                Internal.IntList intList = this.delivery_;
                if (intList.isModifiable()) {
                    return;
                }
                this.delivery_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureMimesIsMutable() {
                Internal.ProtobufList<String> protobufList = this.mimes_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.mimes_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureProtocolsIsMutable() {
                Internal.IntList intList = this.protocols_;
                if (intList.isModifiable()) {
                    return;
                }
                this.protocols_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureRqddursIsMutable() {
                Internal.IntList intList = this.rqddurs_;
                if (intList.isModifiable()) {
                    return;
                }
                this.rqddurs_ = GeneratedMessageLite.mutableCopy(intList);
            }

            public static Audio getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static m0 newBuilder() {
                return (m0) DEFAULT_INSTANCE.createBuilder();
            }

            public static Audio parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Audio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Audio parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Audio> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeCompanionad(int i10) {
                ensureCompanionadIsMutable();
                this.companionad_.remove(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setApi(int i10, d0 d0Var) {
                d0Var.getClass();
                ensureApiIsMutable();
                this.api_.setInt(i10, d0Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBattr(int i10, r1 r1Var) {
                r1Var.getClass();
                ensureBattrIsMutable();
                this.battr_.setInt(i10, r1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCompanionad(int i10, Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.set(i10, banner);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCompaniontype(int i10, l1 l1Var) {
                l1Var.getClass();
                ensureCompaniontypeIsMutable();
                this.companiontype_.setInt(i10, l1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDelivery(int i10, o1 o1Var) {
                o1Var.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.setInt(i10, o1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFeed(p0 p0Var) {
                this.feed_ = p0Var.getNumber();
                this.bitField0_ |= Segment.SIZE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxbitrate(int i10) {
                this.bitField0_ |= 2048;
                this.maxbitrate_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxduration(int i10) {
                this.bitField0_ |= 2;
                this.maxduration_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxextended(int i10) {
                this.bitField0_ |= 512;
                this.maxextended_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxseq(int i10) {
                this.bitField0_ |= 4096;
                this.maxseq_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMimes(int i10, String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.set(i10, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMinbitrate(int i10) {
                this.bitField0_ |= 1024;
                this.minbitrate_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMincpmpersec(double d10) {
                this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
                this.mincpmpersec_ = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMinduration(int i10) {
                this.bitField0_ |= 1;
                this.minduration_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNvol(s0 s0Var) {
                this.nvol_ = s0Var.getNumber();
                this.bitField0_ |= 32768;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPoddur(int i10) {
                this.bitField0_ |= 4;
                this.poddur_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPodid(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.podid_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPodidBytes(ByteString byteString) {
                this.podid_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPodseq(r3 r3Var) {
                this.podseq_ = r3Var.getNumber();
                this.bitField0_ |= 32;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setProtocols(int i10, u3 u3Var) {
                u3Var.getClass();
                ensureProtocolsIsMutable();
                this.protocols_.setInt(i10, u3Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRqddurs(int i10, int i11) {
                ensureRqddursIsMutable();
                this.rqddurs_.setInt(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSequence(int i10) {
                this.bitField0_ |= 64;
                this.sequence_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSlotinpod(a4 a4Var) {
                this.slotinpod_ = a4Var.getNumber();
                this.bitField0_ |= 128;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStartdelay(int i10) {
                this.bitField0_ |= 8;
                this.startdelay_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStitched(boolean z10) {
                this.bitField0_ |= 16384;
                this.stitched_ = z10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (a.f45443a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Audio();
                    case 2:
                        return new m0(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u001e\u0018\u0000\b\u0001\u0001\u001a\u0002င\u0000\u0003င\u0001\u0004,\u0005င\u0003\u0006င\u0006\u0007,\bင\t\tင\n\nင\u000b\u000b,\fЛ\r,\u0014,\u0015င\f\u0016ဌ\r\u0017ဇ\u000e\u0018ဌ\u000f\u0019င\u0002\u001a'\u001bဈ\u0004\u001cဌ\u0005\u001dဌ\u0007\u001eက\b", new Object[]{"bitField0_", "mimes_", "minduration_", "maxduration_", "protocols_", u3.internalGetVerifier(), "startdelay_", "sequence_", "battr_", r1.internalGetVerifier(), "maxextended_", "minbitrate_", "maxbitrate_", "delivery_", o1.internalGetVerifier(), "companionad_", Banner.class, "api_", d0.internalGetVerifier(), "companiontype_", l1.internalGetVerifier(), "maxseq_", "feed_", p0.internalGetVerifier(), "stitched_", "nvol_", s0.internalGetVerifier(), "poddur_", "rqddurs_", "podid_", "podseq_", r3.internalGetVerifier(), "slotinpod_", a4.internalGetVerifier(), "mincpmpersec_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Audio> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Audio.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.moloco.sdk.t0
            public d0 getApi(int i10) {
                d0 d0VarForNumber = d0.forNumber(this.api_.getInt(i10));
                return d0VarForNumber == null ? d0.VPAID_1 : d0VarForNumber;
            }

            @Override // com.moloco.sdk.t0
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.moloco.sdk.t0
            public List<d0> getApiList() {
                return new Internal.ListAdapter(this.api_, api_converter_);
            }

            @Override // com.moloco.sdk.t0
            public r1 getBattr(int i10) {
                r1 r1VarForNumber = r1.forNumber(this.battr_.getInt(i10));
                return r1VarForNumber == null ? r1.AUDIO_AUTO_PLAY : r1VarForNumber;
            }

            @Override // com.moloco.sdk.t0
            public int getBattrCount() {
                return this.battr_.size();
            }

            @Override // com.moloco.sdk.t0
            public List<r1> getBattrList() {
                return new Internal.ListAdapter(this.battr_, battr_converter_);
            }

            @Override // com.moloco.sdk.t0
            public Banner getCompanionad(int i10) {
                return this.companionad_.get(i10);
            }

            @Override // com.moloco.sdk.t0
            public int getCompanionadCount() {
                return this.companionad_.size();
            }

            @Override // com.moloco.sdk.t0
            public List<Banner> getCompanionadList() {
                return this.companionad_;
            }

            public h1 getCompanionadOrBuilder(int i10) {
                return this.companionad_.get(i10);
            }

            public List<? extends h1> getCompanionadOrBuilderList() {
                return this.companionad_;
            }

            @Override // com.moloco.sdk.t0
            public l1 getCompaniontype(int i10) {
                l1 l1VarForNumber = l1.forNumber(this.companiontype_.getInt(i10));
                return l1VarForNumber == null ? l1.STATIC : l1VarForNumber;
            }

            @Override // com.moloco.sdk.t0
            public int getCompaniontypeCount() {
                return this.companiontype_.size();
            }

            @Override // com.moloco.sdk.t0
            public List<l1> getCompaniontypeList() {
                return new Internal.ListAdapter(this.companiontype_, companiontype_converter_);
            }

            @Override // com.moloco.sdk.t0
            public o1 getDelivery(int i10) {
                o1 o1VarForNumber = o1.forNumber(this.delivery_.getInt(i10));
                return o1VarForNumber == null ? o1.STREAMING : o1VarForNumber;
            }

            @Override // com.moloco.sdk.t0
            public int getDeliveryCount() {
                return this.delivery_.size();
            }

            @Override // com.moloco.sdk.t0
            public List<o1> getDeliveryList() {
                return new Internal.ListAdapter(this.delivery_, delivery_converter_);
            }

            @Override // com.moloco.sdk.t0
            public p0 getFeed() {
                p0 p0VarForNumber = p0.forNumber(this.feed_);
                return p0VarForNumber == null ? p0.MUSIC_SERVICE : p0VarForNumber;
            }

            @Override // com.moloco.sdk.t0
            public int getMaxbitrate() {
                return this.maxbitrate_;
            }

            @Override // com.moloco.sdk.t0
            public int getMaxduration() {
                return this.maxduration_;
            }

            @Override // com.moloco.sdk.t0
            public int getMaxextended() {
                return this.maxextended_;
            }

            @Override // com.moloco.sdk.t0
            public int getMaxseq() {
                return this.maxseq_;
            }

            @Override // com.moloco.sdk.t0
            public String getMimes(int i10) {
                return this.mimes_.get(i10);
            }

            @Override // com.moloco.sdk.t0
            public ByteString getMimesBytes(int i10) {
                return ByteString.copyFromUtf8(this.mimes_.get(i10));
            }

            @Override // com.moloco.sdk.t0
            public int getMimesCount() {
                return this.mimes_.size();
            }

            @Override // com.moloco.sdk.t0
            public List<String> getMimesList() {
                return this.mimes_;
            }

            @Override // com.moloco.sdk.t0
            public int getMinbitrate() {
                return this.minbitrate_;
            }

            @Override // com.moloco.sdk.t0
            public double getMincpmpersec() {
                return this.mincpmpersec_;
            }

            @Override // com.moloco.sdk.t0
            public int getMinduration() {
                return this.minduration_;
            }

            @Override // com.moloco.sdk.t0
            public s0 getNvol() {
                s0 s0VarForNumber = s0.forNumber(this.nvol_);
                return s0VarForNumber == null ? s0.NONE : s0VarForNumber;
            }

            @Override // com.moloco.sdk.t0
            public int getPoddur() {
                return this.poddur_;
            }

            @Override // com.moloco.sdk.t0
            public String getPodid() {
                return this.podid_;
            }

            @Override // com.moloco.sdk.t0
            public ByteString getPodidBytes() {
                return ByteString.copyFromUtf8(this.podid_);
            }

            @Override // com.moloco.sdk.t0
            public r3 getPodseq() {
                r3 r3VarForNumber = r3.forNumber(this.podseq_);
                return r3VarForNumber == null ? r3.POD_SEQUENCE_ANY : r3VarForNumber;
            }

            @Override // com.moloco.sdk.t0
            public u3 getProtocols(int i10) {
                u3 u3VarForNumber = u3.forNumber(this.protocols_.getInt(i10));
                return u3VarForNumber == null ? u3.VAST_1_0 : u3VarForNumber;
            }

            @Override // com.moloco.sdk.t0
            public int getProtocolsCount() {
                return this.protocols_.size();
            }

            @Override // com.moloco.sdk.t0
            public List<u3> getProtocolsList() {
                return new Internal.ListAdapter(this.protocols_, protocols_converter_);
            }

            @Override // com.moloco.sdk.t0
            public int getRqddurs(int i10) {
                return this.rqddurs_.getInt(i10);
            }

            @Override // com.moloco.sdk.t0
            public int getRqddursCount() {
                return this.rqddurs_.size();
            }

            @Override // com.moloco.sdk.t0
            public List<Integer> getRqddursList() {
                return this.rqddurs_;
            }

            @Override // com.moloco.sdk.t0
            @Deprecated
            public int getSequence() {
                return this.sequence_;
            }

            @Override // com.moloco.sdk.t0
            public a4 getSlotinpod() {
                a4 a4VarForNumber = a4.forNumber(this.slotinpod_);
                return a4VarForNumber == null ? a4.SLOT_POSITION_POD_ANY : a4VarForNumber;
            }

            @Override // com.moloco.sdk.t0
            public int getStartdelay() {
                return this.startdelay_;
            }

            @Override // com.moloco.sdk.t0
            public boolean getStitched() {
                return this.stitched_;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasFeed() {
                return (this.bitField0_ & Segment.SIZE) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasMaxbitrate() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasMaxduration() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasMaxextended() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasMaxseq() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasMinbitrate() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasMincpmpersec() {
                return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasMinduration() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasNvol() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasPoddur() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasPodid() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasPodseq() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.moloco.sdk.t0
            @Deprecated
            public boolean hasSequence() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasSlotinpod() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasStartdelay() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.moloco.sdk.t0
            public boolean hasStitched() {
                return (this.bitField0_ & 16384) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static m0 newBuilder(Audio audio) {
                return (m0) DEFAULT_INSTANCE.createBuilder(audio);
            }

            public static Audio parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Audio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Audio parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Audio parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addCompanionad(int i10, Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.add(i10, banner);
            }

            public static Audio parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Audio parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Audio parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Audio parseFrom(InputStream inputStream) throws IOException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Audio parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Audio parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Audio parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Banner extends GeneratedMessageLite.ExtendableMessage<Banner, b1> implements h1 {
            public static final int API_FIELD_NUMBER = 10;
            public static final int BATTR_FIELD_NUMBER = 6;
            public static final int BTYPE_FIELD_NUMBER = 5;
            private static final Banner DEFAULT_INSTANCE;
            public static final int EXPDIR_FIELD_NUMBER = 9;
            public static final int FORMAT_FIELD_NUMBER = 15;
            public static final int HMAX_FIELD_NUMBER = 12;
            public static final int HMIN_FIELD_NUMBER = 14;
            public static final int H_FIELD_NUMBER = 2;
            public static final int ID_FIELD_NUMBER = 3;
            public static final int MIMES_FIELD_NUMBER = 7;
            private static volatile Parser<Banner> PARSER = null;
            public static final int POS_FIELD_NUMBER = 4;
            public static final int TOPFRAME_FIELD_NUMBER = 8;
            public static final int VCM_FIELD_NUMBER = 16;
            public static final int WMAX_FIELD_NUMBER = 11;
            public static final int WMIN_FIELD_NUMBER = 13;
            public static final int W_FIELD_NUMBER = 1;
            private int apiMemoizedSerializedSize;
            private int battrMemoizedSerializedSize;
            private int bitField0_;
            private int btypeMemoizedSerializedSize;
            private int expdirMemoizedSerializedSize;
            private int h_;
            private int hmax_;
            private int hmin_;
            private int pos_;
            private boolean topframe_;
            private boolean vcm_;
            private int w_;
            private int wmax_;
            private int wmin_;
            private static final Internal.ListAdapter.Converter<Integer, a1> btype_converter_ = new u0();
            private static final Internal.ListAdapter.Converter<Integer, r1> battr_converter_ = new v0();
            private static final Internal.ListAdapter.Converter<Integer, e1> expdir_converter_ = new w0();
            private static final Internal.ListAdapter.Converter<Integer, d0> api_converter_ = new x0();
            private byte memoizedIsInitialized = 2;
            private Internal.ProtobufList<Format> format_ = GeneratedMessageLite.emptyProtobufList();
            private String id_ = "";
            private Internal.IntList btype_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList battr_ = GeneratedMessageLite.emptyIntList();
            private Internal.ProtobufList<String> mimes_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.IntList expdir_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList api_ = GeneratedMessageLite.emptyIntList();

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Format extends GeneratedMessageLite.ExtendableMessage<Format, f1> implements g1 {
                private static final Format DEFAULT_INSTANCE;
                public static final int HRATIO_FIELD_NUMBER = 4;
                public static final int H_FIELD_NUMBER = 2;
                private static volatile Parser<Format> PARSER = null;
                public static final int WMIN_FIELD_NUMBER = 5;
                public static final int WRATIO_FIELD_NUMBER = 3;
                public static final int W_FIELD_NUMBER = 1;
                private int bitField0_;
                private int h_;
                private int hratio_;
                private byte memoizedIsInitialized = 2;
                private int w_;
                private int wmin_;
                private int wratio_;

                static {
                    Format format = new Format();
                    DEFAULT_INSTANCE = format;
                    GeneratedMessageLite.registerDefaultInstance(Format.class, format);
                }

                private Format() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearH() {
                    this.bitField0_ &= -3;
                    this.h_ = 0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearHratio() {
                    this.bitField0_ &= -9;
                    this.hratio_ = 0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearW() {
                    this.bitField0_ &= -2;
                    this.w_ = 0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearWmin() {
                    this.bitField0_ &= -17;
                    this.wmin_ = 0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearWratio() {
                    this.bitField0_ &= -5;
                    this.wratio_ = 0;
                }

                public static Format getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static f1 newBuilder() {
                    return (f1) DEFAULT_INSTANCE.createBuilder();
                }

                public static Format parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Format) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Format parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<Format> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setH(int i10) {
                    this.bitField0_ |= 2;
                    this.h_ = i10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setHratio(int i10) {
                    this.bitField0_ |= 8;
                    this.hratio_ = i10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setW(int i10) {
                    this.bitField0_ |= 1;
                    this.w_ = i10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setWmin(int i10) {
                    this.bitField0_ |= 16;
                    this.wmin_ = i10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setWratio(int i10) {
                    this.bitField0_ |= 4;
                    this.wratio_ = i10;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (a.f45443a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Format();
                        case 2:
                            return new f1(DEFAULT_INSTANCE);
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"bitField0_", "w_", "h_", "wratio_", "hratio_", "wmin_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<Format> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (Format.class) {
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
                            return Byte.valueOf(this.memoizedIsInitialized);
                        case 7:
                            this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                            return null;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }

                @Override // com.moloco.sdk.g1
                public int getH() {
                    return this.h_;
                }

                @Override // com.moloco.sdk.g1
                public int getHratio() {
                    return this.hratio_;
                }

                @Override // com.moloco.sdk.g1
                public int getW() {
                    return this.w_;
                }

                @Override // com.moloco.sdk.g1
                public int getWmin() {
                    return this.wmin_;
                }

                @Override // com.moloco.sdk.g1
                public int getWratio() {
                    return this.wratio_;
                }

                @Override // com.moloco.sdk.g1
                public boolean hasH() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.moloco.sdk.g1
                public boolean hasHratio() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.moloco.sdk.g1
                public boolean hasW() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.moloco.sdk.g1
                public boolean hasWmin() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.moloco.sdk.g1
                public boolean hasWratio() {
                    return (this.bitField0_ & 4) != 0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static f1 newBuilder(Format format) {
                    return (f1) DEFAULT_INSTANCE.createBuilder(format);
                }

                public static Format parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Format) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Format parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static Format parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static Format parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static Format parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static Format parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static Format parseFrom(InputStream inputStream) throws IOException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Format parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Format parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static Format parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Format) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Banner banner = new Banner();
                DEFAULT_INSTANCE = banner;
                GeneratedMessageLite.registerDefaultInstance(Banner.class, banner);
            }

            private Banner() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllApi(Iterable<? extends d0> iterable) {
                ensureApiIsMutable();
                Iterator<? extends d0> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllBattr(Iterable<? extends r1> iterable) {
                ensureBattrIsMutable();
                Iterator<? extends r1> it = iterable.iterator();
                while (it.hasNext()) {
                    this.battr_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllBtype(Iterable<? extends a1> iterable) {
                ensureBtypeIsMutable();
                Iterator<? extends a1> it = iterable.iterator();
                while (it.hasNext()) {
                    this.btype_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllExpdir(Iterable<? extends e1> iterable) {
                ensureExpdirIsMutable();
                Iterator<? extends e1> it = iterable.iterator();
                while (it.hasNext()) {
                    this.expdir_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllFormat(Iterable<? extends Format> iterable) {
                ensureFormatIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.format_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllMimes(Iterable<String> iterable) {
                ensureMimesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.mimes_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addApi(d0 d0Var) {
                d0Var.getClass();
                ensureApiIsMutable();
                this.api_.addInt(d0Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addBattr(r1 r1Var) {
                r1Var.getClass();
                ensureBattrIsMutable();
                this.battr_.addInt(r1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addBtype(a1 a1Var) {
                a1Var.getClass();
                ensureBtypeIsMutable();
                this.btype_.addInt(a1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addExpdir(e1 e1Var) {
                e1Var.getClass();
                ensureExpdirIsMutable();
                this.expdir_.addInt(e1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addFormat(Format format) {
                format.getClass();
                ensureFormatIsMutable();
                this.format_.add(format);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addMimes(String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addMimesBytes(ByteString byteString) {
                ensureMimesIsMutable();
                this.mimes_.add(byteString.toStringUtf8());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearApi() {
                this.api_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBattr() {
                this.battr_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBtype() {
                this.btype_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearExpdir() {
                this.expdir_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearFormat() {
                this.format_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearH() {
                this.bitField0_ &= -3;
                this.h_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHmax() {
                this.bitField0_ &= -129;
                this.hmax_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearHmin() {
                this.bitField0_ &= -513;
                this.hmin_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.bitField0_ &= -5;
                this.id_ = getDefaultInstance().getId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMimes() {
                this.mimes_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPos() {
                this.bitField0_ &= -9;
                this.pos_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTopframe() {
                this.bitField0_ &= -17;
                this.topframe_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVcm() {
                this.bitField0_ &= -33;
                this.vcm_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearW() {
                this.bitField0_ &= -2;
                this.w_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearWmax() {
                this.bitField0_ &= -65;
                this.wmax_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearWmin() {
                this.bitField0_ &= -257;
                this.wmin_ = 0;
            }

            private void ensureApiIsMutable() {
                Internal.IntList intList = this.api_;
                if (intList.isModifiable()) {
                    return;
                }
                this.api_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureBattrIsMutable() {
                Internal.IntList intList = this.battr_;
                if (intList.isModifiable()) {
                    return;
                }
                this.battr_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureBtypeIsMutable() {
                Internal.IntList intList = this.btype_;
                if (intList.isModifiable()) {
                    return;
                }
                this.btype_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureExpdirIsMutable() {
                Internal.IntList intList = this.expdir_;
                if (intList.isModifiable()) {
                    return;
                }
                this.expdir_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureFormatIsMutable() {
                Internal.ProtobufList<Format> protobufList = this.format_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.format_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureMimesIsMutable() {
                Internal.ProtobufList<String> protobufList = this.mimes_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.mimes_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Banner getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static b1 newBuilder() {
                return (b1) DEFAULT_INSTANCE.createBuilder();
            }

            public static Banner parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Banner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Banner> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeFormat(int i10) {
                ensureFormatIsMutable();
                this.format_.remove(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setApi(int i10, d0 d0Var) {
                d0Var.getClass();
                ensureApiIsMutable();
                this.api_.setInt(i10, d0Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBattr(int i10, r1 r1Var) {
                r1Var.getClass();
                ensureBattrIsMutable();
                this.battr_.setInt(i10, r1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBtype(int i10, a1 a1Var) {
                a1Var.getClass();
                ensureBtypeIsMutable();
                this.btype_.setInt(i10, a1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setExpdir(int i10, e1 e1Var) {
                e1Var.getClass();
                ensureExpdirIsMutable();
                this.expdir_.setInt(i10, e1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFormat(int i10, Format format) {
                format.getClass();
                ensureFormatIsMutable();
                this.format_.set(i10, format);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setH(int i10) {
                this.bitField0_ |= 2;
                this.h_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHmax(int i10) {
                this.bitField0_ |= 128;
                this.hmax_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setHmin(int i10) {
                this.bitField0_ |= 512;
                this.hmin_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setId(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.id_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIdBytes(ByteString byteString) {
                this.id_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMimes(int i10, String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.set(i10, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPos(g0 g0Var) {
                this.pos_ = g0Var.getNumber();
                this.bitField0_ |= 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTopframe(boolean z10) {
                this.bitField0_ |= 16;
                this.topframe_ = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVcm(boolean z10) {
                this.bitField0_ |= 32;
                this.vcm_ = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setW(int i10) {
                this.bitField0_ |= 1;
                this.w_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setWmax(int i10) {
                this.bitField0_ |= 64;
                this.wmax_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setWmin(int i10) {
                this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
                this.wmin_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (a.f45443a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Banner();
                    case 2:
                        return new b1(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0006\u0001\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005,\u0006,\u0007\u001a\bဇ\u0004\t,\n,\u000bင\u0006\fင\u0007\rင\b\u000eင\t\u000fЛ\u0010ဇ\u0005", new Object[]{"bitField0_", "w_", "h_", "id_", "pos_", g0.internalGetVerifier(), "btype_", a1.internalGetVerifier(), "battr_", r1.internalGetVerifier(), "mimes_", "topframe_", "expdir_", e1.internalGetVerifier(), "api_", d0.internalGetVerifier(), "wmax_", "hmax_", "wmin_", "hmin_", "format_", Format.class, "vcm_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Banner> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Banner.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.moloco.sdk.h1
            public d0 getApi(int i10) {
                d0 d0VarForNumber = d0.forNumber(this.api_.getInt(i10));
                return d0VarForNumber == null ? d0.VPAID_1 : d0VarForNumber;
            }

            @Override // com.moloco.sdk.h1
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.moloco.sdk.h1
            public List<d0> getApiList() {
                return new Internal.ListAdapter(this.api_, api_converter_);
            }

            @Override // com.moloco.sdk.h1
            public r1 getBattr(int i10) {
                r1 r1VarForNumber = r1.forNumber(this.battr_.getInt(i10));
                return r1VarForNumber == null ? r1.AUDIO_AUTO_PLAY : r1VarForNumber;
            }

            @Override // com.moloco.sdk.h1
            public int getBattrCount() {
                return this.battr_.size();
            }

            @Override // com.moloco.sdk.h1
            public List<r1> getBattrList() {
                return new Internal.ListAdapter(this.battr_, battr_converter_);
            }

            @Override // com.moloco.sdk.h1
            public a1 getBtype(int i10) {
                a1 a1VarForNumber = a1.forNumber(this.btype_.getInt(i10));
                return a1VarForNumber == null ? a1.XHTML_TEXT_AD : a1VarForNumber;
            }

            @Override // com.moloco.sdk.h1
            public int getBtypeCount() {
                return this.btype_.size();
            }

            @Override // com.moloco.sdk.h1
            public List<a1> getBtypeList() {
                return new Internal.ListAdapter(this.btype_, btype_converter_);
            }

            @Override // com.moloco.sdk.h1
            public e1 getExpdir(int i10) {
                e1 e1VarForNumber = e1.forNumber(this.expdir_.getInt(i10));
                return e1VarForNumber == null ? e1.LEFT : e1VarForNumber;
            }

            @Override // com.moloco.sdk.h1
            public int getExpdirCount() {
                return this.expdir_.size();
            }

            @Override // com.moloco.sdk.h1
            public List<e1> getExpdirList() {
                return new Internal.ListAdapter(this.expdir_, expdir_converter_);
            }

            @Override // com.moloco.sdk.h1
            public Format getFormat(int i10) {
                return this.format_.get(i10);
            }

            @Override // com.moloco.sdk.h1
            public int getFormatCount() {
                return this.format_.size();
            }

            @Override // com.moloco.sdk.h1
            public List<Format> getFormatList() {
                return this.format_;
            }

            public g1 getFormatOrBuilder(int i10) {
                return this.format_.get(i10);
            }

            public List<? extends g1> getFormatOrBuilderList() {
                return this.format_;
            }

            @Override // com.moloco.sdk.h1
            public int getH() {
                return this.h_;
            }

            @Override // com.moloco.sdk.h1
            @Deprecated
            public int getHmax() {
                return this.hmax_;
            }

            @Override // com.moloco.sdk.h1
            @Deprecated
            public int getHmin() {
                return this.hmin_;
            }

            @Override // com.moloco.sdk.h1
            public String getId() {
                return this.id_;
            }

            @Override // com.moloco.sdk.h1
            public ByteString getIdBytes() {
                return ByteString.copyFromUtf8(this.id_);
            }

            @Override // com.moloco.sdk.h1
            public String getMimes(int i10) {
                return this.mimes_.get(i10);
            }

            @Override // com.moloco.sdk.h1
            public ByteString getMimesBytes(int i10) {
                return ByteString.copyFromUtf8(this.mimes_.get(i10));
            }

            @Override // com.moloco.sdk.h1
            public int getMimesCount() {
                return this.mimes_.size();
            }

            @Override // com.moloco.sdk.h1
            public List<String> getMimesList() {
                return this.mimes_;
            }

            @Override // com.moloco.sdk.h1
            public g0 getPos() {
                g0 g0VarForNumber = g0.forNumber(this.pos_);
                return g0VarForNumber == null ? g0.UNKNOWN : g0VarForNumber;
            }

            @Override // com.moloco.sdk.h1
            public boolean getTopframe() {
                return this.topframe_;
            }

            @Override // com.moloco.sdk.h1
            public boolean getVcm() {
                return this.vcm_;
            }

            @Override // com.moloco.sdk.h1
            public int getW() {
                return this.w_;
            }

            @Override // com.moloco.sdk.h1
            @Deprecated
            public int getWmax() {
                return this.wmax_;
            }

            @Override // com.moloco.sdk.h1
            @Deprecated
            public int getWmin() {
                return this.wmin_;
            }

            @Override // com.moloco.sdk.h1
            public boolean hasH() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.h1
            @Deprecated
            public boolean hasHmax() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.moloco.sdk.h1
            @Deprecated
            public boolean hasHmin() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.moloco.sdk.h1
            public boolean hasId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.h1
            public boolean hasPos() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.moloco.sdk.h1
            public boolean hasTopframe() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.moloco.sdk.h1
            public boolean hasVcm() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.moloco.sdk.h1
            public boolean hasW() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.h1
            @Deprecated
            public boolean hasWmax() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.moloco.sdk.h1
            @Deprecated
            public boolean hasWmin() {
                return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static b1 newBuilder(Banner banner) {
                return (b1) DEFAULT_INSTANCE.createBuilder(banner);
            }

            public static Banner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Banner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addFormat(int i10, Format format) {
                format.getClass();
                ensureFormatIsMutable();
                this.format_.add(i10, format);
            }

            public static Banner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Banner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Banner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Banner parseFrom(InputStream inputStream) throws IOException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Banner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Banner parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Banner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Metric extends GeneratedMessageLite.ExtendableMessage<Metric, s1> implements t1 {
            private static final Metric DEFAULT_INSTANCE;
            private static volatile Parser<Metric> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int VALUE_FIELD_NUMBER = 2;
            public static final int VENDOR_FIELD_NUMBER = 3;
            private int bitField0_;
            private double value_;
            private byte memoizedIsInitialized = 2;
            private String type_ = "";
            private String vendor_ = "";

            static {
                Metric metric2 = new Metric();
                DEFAULT_INSTANCE = metric2;
                GeneratedMessageLite.registerDefaultInstance(Metric.class, metric2);
            }

            private Metric() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearType() {
                this.bitField0_ &= -2;
                this.type_ = getDefaultInstance().getType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.bitField0_ &= -3;
                this.value_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVendor() {
                this.bitField0_ &= -5;
                this.vendor_ = getDefaultInstance().getVendor();
            }

            public static Metric getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static s1 newBuilder() {
                return (s1) DEFAULT_INSTANCE.createBuilder();
            }

            public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Metric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Metric> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setType(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.type_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTypeBytes(ByteString byteString) {
                this.type_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValue(double d10) {
                this.bitField0_ |= 2;
                this.value_ = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVendor(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.vendor_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVendorBytes(ByteString byteString) {
                this.vendor_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (a.f45443a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Metric();
                    case 2:
                        return new s1(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "type_", "value_", "vendor_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Metric> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Metric.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.moloco.sdk.t1
            public String getType() {
                return this.type_;
            }

            @Override // com.moloco.sdk.t1
            public ByteString getTypeBytes() {
                return ByteString.copyFromUtf8(this.type_);
            }

            @Override // com.moloco.sdk.t1
            public double getValue() {
                return this.value_;
            }

            @Override // com.moloco.sdk.t1
            public String getVendor() {
                return this.vendor_;
            }

            @Override // com.moloco.sdk.t1
            public ByteString getVendorBytes() {
                return ByteString.copyFromUtf8(this.vendor_);
            }

            @Override // com.moloco.sdk.t1
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.t1
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.t1
            public boolean hasVendor() {
                return (this.bitField0_ & 4) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static s1 newBuilder(Metric metric2) {
                return (s1) DEFAULT_INSTANCE.createBuilder(metric2);
            }

            public static Metric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Metric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Metric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Metric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Metric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Metric parseFrom(InputStream inputStream) throws IOException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Metric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Metric parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Metric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Metric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Native extends GeneratedMessageLite.ExtendableMessage<Native, w1> implements h3 {
            public static final int API_FIELD_NUMBER = 3;
            public static final int BATTR_FIELD_NUMBER = 4;
            private static final Native DEFAULT_INSTANCE;
            private static volatile Parser<Native> PARSER = null;
            public static final int REQUEST_FIELD_NUMBER = 1;
            public static final int REQUEST_NATIVE_FIELD_NUMBER = 50;
            public static final int VER_FIELD_NUMBER = 2;
            private static final Internal.ListAdapter.Converter<Integer, d0> api_converter_ = new u1();
            private static final Internal.ListAdapter.Converter<Integer, r1> battr_converter_ = new v1();
            private int apiMemoizedSerializedSize;
            private int battrMemoizedSerializedSize;
            private int bitField0_;
            private Object requestOneof_;
            private int requestOneofCase_ = 0;
            private byte memoizedIsInitialized = 2;
            private String ver_ = "";
            private Internal.IntList api_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList battr_ = GeneratedMessageLite.emptyIntList();

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class NativeRequest extends GeneratedMessageLite.ExtendableMessage<NativeRequest, m2> implements f3 {
                public static final int ASSETS_FIELD_NUMBER = 6;
                public static final int AURLSUPPORT_FIELD_NUMBER = 11;
                public static final int CONTEXTSUBTYPE_FIELD_NUMBER = 8;
                public static final int CONTEXT_FIELD_NUMBER = 7;
                private static final NativeRequest DEFAULT_INSTANCE;
                public static final int DURLSUPPORT_FIELD_NUMBER = 12;
                public static final int EVENTTRACKERS_FIELD_NUMBER = 13;
                private static volatile Parser<NativeRequest> PARSER = null;
                public static final int PLCMTCNT_FIELD_NUMBER = 4;
                public static final int PLCMTTYPE_FIELD_NUMBER = 9;
                public static final int PRIVACY_FIELD_NUMBER = 14;
                public static final int SEQ_FIELD_NUMBER = 5;
                public static final int VER_FIELD_NUMBER = 1;
                private boolean aurlsupport_;
                private int bitField0_;
                private boolean durlsupport_;
                private boolean privacy_;
                private int seq_;
                private byte memoizedIsInitialized = 2;
                private String ver_ = "";
                private int context_ = 1;
                private int contextsubtype_ = 10;
                private int plcmttype_ = 1;
                private int plcmtcnt_ = 1;
                private Internal.ProtobufList<Asset> assets_ = GeneratedMessageLite.emptyProtobufList();
                private Internal.ProtobufList<EventTrackers> eventtrackers_ = GeneratedMessageLite.emptyProtobufList();

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class Asset extends GeneratedMessageLite.ExtendableMessage<Asset, y1> implements l2 {
                    public static final int DATA_FIELD_NUMBER = 6;
                    private static final Asset DEFAULT_INSTANCE;
                    public static final int ID_FIELD_NUMBER = 1;
                    public static final int IMG_FIELD_NUMBER = 4;
                    private static volatile Parser<Asset> PARSER = null;
                    public static final int REQUIRED_FIELD_NUMBER = 2;
                    public static final int TITLE_FIELD_NUMBER = 3;
                    public static final int VIDEO_FIELD_NUMBER = 5;
                    private Object assetOneof_;
                    private int bitField0_;
                    private int id_;
                    private boolean required_;
                    private int assetOneofCase_ = 0;
                    private byte memoizedIsInitialized = 2;

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    public static final class Data extends GeneratedMessageLite.ExtendableMessage<Data, z1> implements d2 {
                        private static final Data DEFAULT_INSTANCE;
                        public static final int LEN_FIELD_NUMBER = 2;
                        private static volatile Parser<Data> PARSER = null;
                        public static final int TYPE_FIELD_NUMBER = 1;
                        private int bitField0_;
                        private int len_;
                        private byte memoizedIsInitialized = 2;
                        private int type_ = 1;

                        static {
                            Data data = new Data();
                            DEFAULT_INSTANCE = data;
                            GeneratedMessageLite.registerDefaultInstance(Data.class, data);
                        }

                        private Data() {
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void clearLen() {
                            this.bitField0_ &= -3;
                            this.len_ = 0;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void clearType() {
                            this.bitField0_ &= -2;
                            this.type_ = 1;
                        }

                        public static Data getDefaultInstance() {
                            return DEFAULT_INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static z1 newBuilder() {
                            return (z1) DEFAULT_INSTANCE.createBuilder();
                        }

                        public static Data parseDelimitedFrom(InputStream inputStream) throws IOException {
                            return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                        }

                        public static Parser<Data> parser() {
                            return DEFAULT_INSTANCE.getParserForType();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void setLen(int i10) {
                            this.bitField0_ |= 2;
                            this.len_ = i10;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void setType(c2 c2Var) {
                            this.type_ = c2Var.getNumber();
                            this.bitField0_ |= 1;
                        }

                        @Override // com.google.protobuf.GeneratedMessageLite
                        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                            Parser defaultInstanceBasedParser;
                            switch (a.f45443a[methodToInvoke.ordinal()]) {
                                case 1:
                                    return new Data();
                                case 2:
                                    return new z1(DEFAULT_INSTANCE);
                                case 3:
                                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001", new Object[]{"bitField0_", "type_", c2.internalGetVerifier(), "len_"});
                                case 4:
                                    return DEFAULT_INSTANCE;
                                case 5:
                                    Parser<Data> parser = PARSER;
                                    if (parser != null) {
                                        return parser;
                                    }
                                    synchronized (Data.class) {
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
                                    return Byte.valueOf(this.memoizedIsInitialized);
                                case 7:
                                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                                    return null;
                                default:
                                    throw new UnsupportedOperationException();
                            }
                        }

                        @Override // com.moloco.sdk.d2
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.moloco.sdk.d2
                        public c2 getType() {
                            c2 c2VarForNumber = c2.forNumber(this.type_);
                            return c2VarForNumber == null ? c2.SPONSORED : c2VarForNumber;
                        }

                        @Override // com.moloco.sdk.d2
                        public boolean hasLen() {
                            return (this.bitField0_ & 2) != 0;
                        }

                        @Override // com.moloco.sdk.d2
                        public boolean hasType() {
                            return (this.bitField0_ & 1) != 0;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static z1 newBuilder(Data data) {
                            return (z1) DEFAULT_INSTANCE.createBuilder(data);
                        }

                        public static Data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                        }

                        public static Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                        }

                        public static Data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                        }

                        public static Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                        }

                        public static Data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                        }

                        public static Data parseFrom(InputStream inputStream) throws IOException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Data parseFrom(CodedInputStream codedInputStream) throws IOException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                        }

                        public static Data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                        }
                    }

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    public static final class Image extends GeneratedMessageLite.ExtendableMessage<Image, e2> implements i2 {
                        private static final Image DEFAULT_INSTANCE;
                        public static final int HMIN_FIELD_NUMBER = 5;
                        public static final int H_FIELD_NUMBER = 3;
                        public static final int MIMES_FIELD_NUMBER = 6;
                        private static volatile Parser<Image> PARSER = null;
                        public static final int TYPE_FIELD_NUMBER = 1;
                        public static final int WMIN_FIELD_NUMBER = 4;
                        public static final int W_FIELD_NUMBER = 2;
                        private int bitField0_;
                        private int h_;
                        private int hmin_;
                        private int w_;
                        private int wmin_;
                        private byte memoizedIsInitialized = 2;
                        private int type_ = 1;
                        private Internal.ProtobufList<String> mimes_ = GeneratedMessageLite.emptyProtobufList();

                        static {
                            Image image = new Image();
                            DEFAULT_INSTANCE = image;
                            GeneratedMessageLite.registerDefaultInstance(Image.class, image);
                        }

                        private Image() {
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void addAllMimes(Iterable<String> iterable) {
                            ensureMimesIsMutable();
                            AbstractMessageLite.addAll((Iterable) iterable, (List) this.mimes_);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void addMimes(String str) {
                            str.getClass();
                            ensureMimesIsMutable();
                            this.mimes_.add(str);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void addMimesBytes(ByteString byteString) {
                            ensureMimesIsMutable();
                            this.mimes_.add(byteString.toStringUtf8());
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void clearH() {
                            this.bitField0_ &= -5;
                            this.h_ = 0;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void clearHmin() {
                            this.bitField0_ &= -17;
                            this.hmin_ = 0;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void clearMimes() {
                            this.mimes_ = GeneratedMessageLite.emptyProtobufList();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void clearType() {
                            this.bitField0_ &= -2;
                            this.type_ = 1;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void clearW() {
                            this.bitField0_ &= -3;
                            this.w_ = 0;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void clearWmin() {
                            this.bitField0_ &= -9;
                            this.wmin_ = 0;
                        }

                        private void ensureMimesIsMutable() {
                            Internal.ProtobufList<String> protobufList = this.mimes_;
                            if (protobufList.isModifiable()) {
                                return;
                            }
                            this.mimes_ = GeneratedMessageLite.mutableCopy(protobufList);
                        }

                        public static Image getDefaultInstance() {
                            return DEFAULT_INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static e2 newBuilder() {
                            return (e2) DEFAULT_INSTANCE.createBuilder();
                        }

                        public static Image parseDelimitedFrom(InputStream inputStream) throws IOException {
                            return (Image) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Image parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                        }

                        public static Parser<Image> parser() {
                            return DEFAULT_INSTANCE.getParserForType();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void setH(int i10) {
                            this.bitField0_ |= 4;
                            this.h_ = i10;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void setHmin(int i10) {
                            this.bitField0_ |= 16;
                            this.hmin_ = i10;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void setMimes(int i10, String str) {
                            str.getClass();
                            ensureMimesIsMutable();
                            this.mimes_.set(i10, str);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void setType(h2 h2Var) {
                            this.type_ = h2Var.getNumber();
                            this.bitField0_ |= 1;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void setW(int i10) {
                            this.bitField0_ |= 2;
                            this.w_ = i10;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void setWmin(int i10) {
                            this.bitField0_ |= 8;
                            this.wmin_ = i10;
                        }

                        @Override // com.google.protobuf.GeneratedMessageLite
                        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                            Parser defaultInstanceBasedParser;
                            switch (a.f45443a[methodToInvoke.ordinal()]) {
                                case 1:
                                    return new Image();
                                case 2:
                                    return new e2(DEFAULT_INSTANCE);
                                case 3:
                                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001a", new Object[]{"bitField0_", "type_", h2.internalGetVerifier(), "w_", "h_", "wmin_", "hmin_", "mimes_"});
                                case 4:
                                    return DEFAULT_INSTANCE;
                                case 5:
                                    Parser<Image> parser = PARSER;
                                    if (parser != null) {
                                        return parser;
                                    }
                                    synchronized (Image.class) {
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
                                    return Byte.valueOf(this.memoizedIsInitialized);
                                case 7:
                                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                                    return null;
                                default:
                                    throw new UnsupportedOperationException();
                            }
                        }

                        @Override // com.moloco.sdk.i2
                        public int getH() {
                            return this.h_;
                        }

                        @Override // com.moloco.sdk.i2
                        public int getHmin() {
                            return this.hmin_;
                        }

                        @Override // com.moloco.sdk.i2
                        public String getMimes(int i10) {
                            return this.mimes_.get(i10);
                        }

                        @Override // com.moloco.sdk.i2
                        public ByteString getMimesBytes(int i10) {
                            return ByteString.copyFromUtf8(this.mimes_.get(i10));
                        }

                        @Override // com.moloco.sdk.i2
                        public int getMimesCount() {
                            return this.mimes_.size();
                        }

                        @Override // com.moloco.sdk.i2
                        public List<String> getMimesList() {
                            return this.mimes_;
                        }

                        @Override // com.moloco.sdk.i2
                        public h2 getType() {
                            h2 h2VarForNumber = h2.forNumber(this.type_);
                            return h2VarForNumber == null ? h2.ICON : h2VarForNumber;
                        }

                        @Override // com.moloco.sdk.i2
                        public int getW() {
                            return this.w_;
                        }

                        @Override // com.moloco.sdk.i2
                        public int getWmin() {
                            return this.wmin_;
                        }

                        @Override // com.moloco.sdk.i2
                        public boolean hasH() {
                            return (this.bitField0_ & 4) != 0;
                        }

                        @Override // com.moloco.sdk.i2
                        public boolean hasHmin() {
                            return (this.bitField0_ & 16) != 0;
                        }

                        @Override // com.moloco.sdk.i2
                        public boolean hasType() {
                            return (this.bitField0_ & 1) != 0;
                        }

                        @Override // com.moloco.sdk.i2
                        public boolean hasW() {
                            return (this.bitField0_ & 2) != 0;
                        }

                        @Override // com.moloco.sdk.i2
                        public boolean hasWmin() {
                            return (this.bitField0_ & 8) != 0;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static e2 newBuilder(Image image) {
                            return (e2) DEFAULT_INSTANCE.createBuilder(image);
                        }

                        public static Image parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Image) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Image parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                        }

                        public static Image parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                        }

                        public static Image parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                        }

                        public static Image parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                        }

                        public static Image parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                        }

                        public static Image parseFrom(InputStream inputStream) throws IOException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Image parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Image parseFrom(CodedInputStream codedInputStream) throws IOException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                        }

                        public static Image parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Image) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                        }
                    }

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    public static final class Title extends GeneratedMessageLite.ExtendableMessage<Title, j2> implements k2 {
                        private static final Title DEFAULT_INSTANCE;
                        public static final int LEN_FIELD_NUMBER = 1;
                        private static volatile Parser<Title> PARSER;
                        private int bitField0_;
                        private int len_;
                        private byte memoizedIsInitialized = 2;

                        static {
                            Title title = new Title();
                            DEFAULT_INSTANCE = title;
                            GeneratedMessageLite.registerDefaultInstance(Title.class, title);
                        }

                        private Title() {
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void clearLen() {
                            this.bitField0_ &= -2;
                            this.len_ = 0;
                        }

                        public static Title getDefaultInstance() {
                            return DEFAULT_INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static j2 newBuilder() {
                            return (j2) DEFAULT_INSTANCE.createBuilder();
                        }

                        public static Title parseDelimitedFrom(InputStream inputStream) throws IOException {
                            return (Title) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Title parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                        }

                        public static Parser<Title> parser() {
                            return DEFAULT_INSTANCE.getParserForType();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public void setLen(int i10) {
                            this.bitField0_ |= 1;
                            this.len_ = i10;
                        }

                        @Override // com.google.protobuf.GeneratedMessageLite
                        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                            Parser defaultInstanceBasedParser;
                            switch (a.f45443a[methodToInvoke.ordinal()]) {
                                case 1:
                                    return new Title();
                                case 2:
                                    return new j2(DEFAULT_INSTANCE);
                                case 3:
                                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"bitField0_", "len_"});
                                case 4:
                                    return DEFAULT_INSTANCE;
                                case 5:
                                    Parser<Title> parser = PARSER;
                                    if (parser != null) {
                                        return parser;
                                    }
                                    synchronized (Title.class) {
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
                                    return Byte.valueOf(this.memoizedIsInitialized);
                                case 7:
                                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                                    return null;
                                default:
                                    throw new UnsupportedOperationException();
                            }
                        }

                        @Override // com.moloco.sdk.k2
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.moloco.sdk.k2
                        public boolean hasLen() {
                            return (this.bitField0_ & 1) != 0;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public static j2 newBuilder(Title title) {
                            return (j2) DEFAULT_INSTANCE.createBuilder(title);
                        }

                        public static Title parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Title) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Title parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                        }

                        public static Title parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                        }

                        public static Title parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                        }

                        public static Title parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                        }

                        public static Title parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                        }

                        public static Title parseFrom(InputStream inputStream) throws IOException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static Title parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                        }

                        public static Title parseFrom(CodedInputStream codedInputStream) throws IOException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                        }

                        public static Title parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                            return (Title) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                        }
                    }

                    static {
                        Asset asset = new Asset();
                        DEFAULT_INSTANCE = asset;
                        GeneratedMessageLite.registerDefaultInstance(Asset.class, asset);
                    }

                    private Asset() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void clearAssetOneof() {
                        this.assetOneofCase_ = 0;
                        this.assetOneof_ = null;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void clearData() {
                        if (this.assetOneofCase_ == 6) {
                            this.assetOneofCase_ = 0;
                            this.assetOneof_ = null;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void clearId() {
                        this.bitField0_ &= -2;
                        this.id_ = 0;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void clearImg() {
                        if (this.assetOneofCase_ == 4) {
                            this.assetOneofCase_ = 0;
                            this.assetOneof_ = null;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void clearRequired() {
                        this.bitField0_ &= -3;
                        this.required_ = false;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void clearTitle() {
                        if (this.assetOneofCase_ == 3) {
                            this.assetOneofCase_ = 0;
                            this.assetOneof_ = null;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void clearVideo() {
                        if (this.assetOneofCase_ == 5) {
                            this.assetOneofCase_ = 0;
                            this.assetOneof_ = null;
                        }
                    }

                    public static Asset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX WARN: Multi-variable type inference failed */
                    public void mergeData(Data data) {
                        data.getClass();
                        if (this.assetOneofCase_ != 6 || this.assetOneof_ == Data.getDefaultInstance()) {
                            this.assetOneof_ = data;
                        } else {
                            this.assetOneof_ = ((z1) Data.newBuilder((Data) this.assetOneof_).mergeFrom((z1) data)).buildPartial();
                        }
                        this.assetOneofCase_ = 6;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX WARN: Multi-variable type inference failed */
                    public void mergeImg(Image image) {
                        image.getClass();
                        if (this.assetOneofCase_ != 4 || this.assetOneof_ == Image.getDefaultInstance()) {
                            this.assetOneof_ = image;
                        } else {
                            this.assetOneof_ = ((e2) Image.newBuilder((Image) this.assetOneof_).mergeFrom((e2) image)).buildPartial();
                        }
                        this.assetOneofCase_ = 4;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX WARN: Multi-variable type inference failed */
                    public void mergeTitle(Title title) {
                        title.getClass();
                        if (this.assetOneofCase_ != 3 || this.assetOneof_ == Title.getDefaultInstance()) {
                            this.assetOneof_ = title;
                        } else {
                            this.assetOneof_ = ((j2) Title.newBuilder((Title) this.assetOneof_).mergeFrom((j2) title)).buildPartial();
                        }
                        this.assetOneofCase_ = 3;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    /* JADX WARN: Multi-variable type inference failed */
                    public void mergeVideo(Video video) {
                        video.getClass();
                        if (this.assetOneofCase_ != 5 || this.assetOneof_ == Video.getDefaultInstance()) {
                            this.assetOneof_ = video;
                        } else {
                            this.assetOneof_ = ((h4) Video.newBuilder((Video) this.assetOneof_).mergeFrom((h4) video)).buildPartial();
                        }
                        this.assetOneofCase_ = 5;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static y1 newBuilder() {
                        return (y1) DEFAULT_INSTANCE.createBuilder();
                    }

                    public static Asset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static Asset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                    }

                    public static Parser<Asset> parser() {
                        return DEFAULT_INSTANCE.getParserForType();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void setData(Data data) {
                        data.getClass();
                        this.assetOneof_ = data;
                        this.assetOneofCase_ = 6;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void setId(int i10) {
                        this.bitField0_ |= 1;
                        this.id_ = i10;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void setImg(Image image) {
                        image.getClass();
                        this.assetOneof_ = image;
                        this.assetOneofCase_ = 4;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void setRequired(boolean z10) {
                        this.bitField0_ |= 2;
                        this.required_ = z10;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void setTitle(Title title) {
                        title.getClass();
                        this.assetOneof_ = title;
                        this.assetOneofCase_ = 3;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void setVideo(Video video) {
                        video.getClass();
                        this.assetOneof_ = video;
                        this.assetOneofCase_ = 5;
                    }

                    @Override // com.google.protobuf.GeneratedMessageLite
                    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                        Parser defaultInstanceBasedParser;
                        switch (a.f45443a[methodToInvoke.ordinal()]) {
                            case 1:
                                return new Asset();
                            case 2:
                                return new y1(DEFAULT_INSTANCE);
                            case 3:
                                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᔄ\u0000\u0002ဇ\u0001\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ᐼ\u0000", new Object[]{"assetOneof_", "assetOneofCase_", "bitField0_", "id_", "required_", Title.class, Image.class, Video.class, Data.class});
                            case 4:
                                return DEFAULT_INSTANCE;
                            case 5:
                                Parser<Asset> parser = PARSER;
                                if (parser != null) {
                                    return parser;
                                }
                                synchronized (Asset.class) {
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
                                return Byte.valueOf(this.memoizedIsInitialized);
                            case 7:
                                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                                return null;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }

                    @Override // com.moloco.sdk.l2
                    public x1 getAssetOneofCase() {
                        return x1.forNumber(this.assetOneofCase_);
                    }

                    @Override // com.moloco.sdk.l2
                    public Data getData() {
                        return this.assetOneofCase_ == 6 ? (Data) this.assetOneof_ : Data.getDefaultInstance();
                    }

                    @Override // com.moloco.sdk.l2
                    public int getId() {
                        return this.id_;
                    }

                    @Override // com.moloco.sdk.l2
                    public Image getImg() {
                        return this.assetOneofCase_ == 4 ? (Image) this.assetOneof_ : Image.getDefaultInstance();
                    }

                    @Override // com.moloco.sdk.l2
                    public boolean getRequired() {
                        return this.required_;
                    }

                    @Override // com.moloco.sdk.l2
                    public Title getTitle() {
                        return this.assetOneofCase_ == 3 ? (Title) this.assetOneof_ : Title.getDefaultInstance();
                    }

                    @Override // com.moloco.sdk.l2
                    public Video getVideo() {
                        return this.assetOneofCase_ == 5 ? (Video) this.assetOneof_ : Video.getDefaultInstance();
                    }

                    @Override // com.moloco.sdk.l2
                    public boolean hasData() {
                        return this.assetOneofCase_ == 6;
                    }

                    @Override // com.moloco.sdk.l2
                    public boolean hasId() {
                        return (this.bitField0_ & 1) != 0;
                    }

                    @Override // com.moloco.sdk.l2
                    public boolean hasImg() {
                        return this.assetOneofCase_ == 4;
                    }

                    @Override // com.moloco.sdk.l2
                    public boolean hasRequired() {
                        return (this.bitField0_ & 2) != 0;
                    }

                    @Override // com.moloco.sdk.l2
                    public boolean hasTitle() {
                        return this.assetOneofCase_ == 3;
                    }

                    @Override // com.moloco.sdk.l2
                    public boolean hasVideo() {
                        return this.assetOneofCase_ == 5;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static y1 newBuilder(Asset asset) {
                        return (y1) DEFAULT_INSTANCE.createBuilder(asset);
                    }

                    public static Asset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (Asset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static Asset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                    }

                    public static Asset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                    }

                    public static Asset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                    }

                    public static Asset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                    }

                    public static Asset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                    }

                    public static Asset parseFrom(InputStream inputStream) throws IOException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static Asset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static Asset parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                    }

                    public static Asset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (Asset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                    }
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class EventTrackers extends GeneratedMessageLite.ExtendableMessage<EventTrackers, u2> implements b3 {
                    private static final EventTrackers DEFAULT_INSTANCE;
                    public static final int EVENT_FIELD_NUMBER = 1;
                    public static final int METHODS_FIELD_NUMBER = 2;
                    private static volatile Parser<EventTrackers> PARSER;
                    private static final Internal.ListAdapter.Converter<Integer, x2> methods_converter_ = new t2();
                    private int bitField0_;
                    private int event_;
                    private byte memoizedIsInitialized = 2;
                    private Internal.IntList methods_ = GeneratedMessageLite.emptyIntList();

                    static {
                        EventTrackers eventTrackers = new EventTrackers();
                        DEFAULT_INSTANCE = eventTrackers;
                        GeneratedMessageLite.registerDefaultInstance(EventTrackers.class, eventTrackers);
                    }

                    private EventTrackers() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void addAllMethods(Iterable<? extends x2> iterable) {
                        ensureMethodsIsMutable();
                        Iterator<? extends x2> it = iterable.iterator();
                        while (it.hasNext()) {
                            this.methods_.addInt(it.next().getNumber());
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void addMethods(x2 x2Var) {
                        x2Var.getClass();
                        ensureMethodsIsMutable();
                        this.methods_.addInt(x2Var.getNumber());
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void clearEvent() {
                        this.bitField0_ &= -2;
                        this.event_ = 0;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void clearMethods() {
                        this.methods_ = GeneratedMessageLite.emptyIntList();
                    }

                    private void ensureMethodsIsMutable() {
                        Internal.IntList intList = this.methods_;
                        if (intList.isModifiable()) {
                            return;
                        }
                        this.methods_ = GeneratedMessageLite.mutableCopy(intList);
                    }

                    public static EventTrackers getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static u2 newBuilder() {
                        return (u2) DEFAULT_INSTANCE.createBuilder();
                    }

                    public static EventTrackers parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static EventTrackers parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                    }

                    public static Parser<EventTrackers> parser() {
                        return DEFAULT_INSTANCE.getParserForType();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void setEvent(a3 a3Var) {
                        this.event_ = a3Var.getNumber();
                        this.bitField0_ |= 1;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public void setMethods(int i10, x2 x2Var) {
                        x2Var.getClass();
                        ensureMethodsIsMutable();
                        this.methods_.setInt(i10, x2Var.getNumber());
                    }

                    @Override // com.google.protobuf.GeneratedMessageLite
                    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                        Parser defaultInstanceBasedParser;
                        switch (a.f45443a[methodToInvoke.ordinal()]) {
                            case 1:
                                return new EventTrackers();
                            case 2:
                                return new u2(DEFAULT_INSTANCE);
                            case 3:
                                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔌ\u0000\u0002\u001e", new Object[]{"bitField0_", "event_", a3.internalGetVerifier(), "methods_", x2.internalGetVerifier()});
                            case 4:
                                return DEFAULT_INSTANCE;
                            case 5:
                                Parser<EventTrackers> parser = PARSER;
                                if (parser != null) {
                                    return parser;
                                }
                                synchronized (EventTrackers.class) {
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
                                return Byte.valueOf(this.memoizedIsInitialized);
                            case 7:
                                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                                return null;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }

                    @Override // com.moloco.sdk.b3
                    public a3 getEvent() {
                        a3 a3VarForNumber = a3.forNumber(this.event_);
                        return a3VarForNumber == null ? a3.UNKNOWN_EVENT : a3VarForNumber;
                    }

                    @Override // com.moloco.sdk.b3
                    public x2 getMethods(int i10) {
                        x2 x2VarForNumber = x2.forNumber(this.methods_.getInt(i10));
                        return x2VarForNumber == null ? x2.IMG : x2VarForNumber;
                    }

                    @Override // com.moloco.sdk.b3
                    public int getMethodsCount() {
                        return this.methods_.size();
                    }

                    @Override // com.moloco.sdk.b3
                    public List<x2> getMethodsList() {
                        return new Internal.ListAdapter(this.methods_, methods_converter_);
                    }

                    @Override // com.moloco.sdk.b3
                    public boolean hasEvent() {
                        return (this.bitField0_ & 1) != 0;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static u2 newBuilder(EventTrackers eventTrackers) {
                        return (u2) DEFAULT_INSTANCE.createBuilder(eventTrackers);
                    }

                    public static EventTrackers parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static EventTrackers parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                    }

                    public static EventTrackers parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                    }

                    public static EventTrackers parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                    }

                    public static EventTrackers parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                    }

                    public static EventTrackers parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                    }

                    public static EventTrackers parseFrom(InputStream inputStream) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static EventTrackers parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                    }

                    public static EventTrackers parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                    }

                    public static EventTrackers parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (EventTrackers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                    }
                }

                static {
                    NativeRequest nativeRequest = new NativeRequest();
                    DEFAULT_INSTANCE = nativeRequest;
                    GeneratedMessageLite.registerDefaultInstance(NativeRequest.class, nativeRequest);
                }

                private NativeRequest() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addAllAssets(Iterable<? extends Asset> iterable) {
                    ensureAssetsIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.assets_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addAllEventtrackers(Iterable<? extends EventTrackers> iterable) {
                    ensureEventtrackersIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.eventtrackers_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addAssets(Asset asset) {
                    asset.getClass();
                    ensureAssetsIsMutable();
                    this.assets_.add(asset);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addEventtrackers(EventTrackers eventTrackers) {
                    eventTrackers.getClass();
                    ensureEventtrackersIsMutable();
                    this.eventtrackers_.add(eventTrackers);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearAssets() {
                    this.assets_ = GeneratedMessageLite.emptyProtobufList();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearAurlsupport() {
                    this.bitField0_ &= -65;
                    this.aurlsupport_ = false;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearContext() {
                    this.bitField0_ &= -3;
                    this.context_ = 1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearContextsubtype() {
                    this.bitField0_ &= -5;
                    this.contextsubtype_ = 10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearDurlsupport() {
                    this.bitField0_ &= -129;
                    this.durlsupport_ = false;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearEventtrackers() {
                    this.eventtrackers_ = GeneratedMessageLite.emptyProtobufList();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearPlcmtcnt() {
                    this.bitField0_ &= -17;
                    this.plcmtcnt_ = 1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearPlcmttype() {
                    this.bitField0_ &= -9;
                    this.plcmttype_ = 1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearPrivacy() {
                    this.bitField0_ &= -257;
                    this.privacy_ = false;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearSeq() {
                    this.bitField0_ &= -33;
                    this.seq_ = 0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearVer() {
                    this.bitField0_ &= -2;
                    this.ver_ = getDefaultInstance().getVer();
                }

                private void ensureAssetsIsMutable() {
                    Internal.ProtobufList<Asset> protobufList = this.assets_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.assets_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                private void ensureEventtrackersIsMutable() {
                    Internal.ProtobufList<EventTrackers> protobufList = this.eventtrackers_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.eventtrackers_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static NativeRequest getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static m2 newBuilder() {
                    return (m2) DEFAULT_INSTANCE.createBuilder();
                }

                public static NativeRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static NativeRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<NativeRequest> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void removeAssets(int i10) {
                    ensureAssetsIsMutable();
                    this.assets_.remove(i10);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void removeEventtrackers(int i10) {
                    ensureEventtrackersIsMutable();
                    this.eventtrackers_.remove(i10);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setAssets(int i10, Asset asset) {
                    asset.getClass();
                    ensureAssetsIsMutable();
                    this.assets_.set(i10, asset);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setAurlsupport(boolean z10) {
                    this.bitField0_ |= 64;
                    this.aurlsupport_ = z10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setContext(s2 s2Var) {
                    this.context_ = s2Var.getNumber();
                    this.bitField0_ |= 2;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setContextsubtype(p2 p2Var) {
                    this.contextsubtype_ = p2Var.getNumber();
                    this.bitField0_ |= 4;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setDurlsupport(boolean z10) {
                    this.bitField0_ |= 128;
                    this.durlsupport_ = z10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setEventtrackers(int i10, EventTrackers eventTrackers) {
                    eventTrackers.getClass();
                    ensureEventtrackersIsMutable();
                    this.eventtrackers_.set(i10, eventTrackers);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setPlcmtcnt(int i10) {
                    this.bitField0_ |= 16;
                    this.plcmtcnt_ = i10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setPlcmttype(e3 e3Var) {
                    this.plcmttype_ = e3Var.getNumber();
                    this.bitField0_ |= 8;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setPrivacy(boolean z10) {
                    this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
                    this.privacy_ = z10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setSeq(int i10) {
                    this.bitField0_ |= 32;
                    this.seq_ = i10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setVer(String str) {
                    str.getClass();
                    this.bitField0_ |= 1;
                    this.ver_ = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setVerBytes(ByteString byteString) {
                    this.ver_ = byteString.toStringUtf8();
                    this.bitField0_ |= 1;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (a.f45443a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new NativeRequest();
                        case 2:
                            return new m2(DEFAULT_INSTANCE);
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0002\u0002\u0001ဈ\u0000\u0004င\u0004\u0005င\u0005\u0006Л\u0007ဌ\u0001\bဌ\u0002\tဌ\u0003\u000bဇ\u0006\fဇ\u0007\rЛ\u000eဇ\b", new Object[]{"bitField0_", "ver_", "plcmtcnt_", "seq_", "assets_", Asset.class, "context_", s2.internalGetVerifier(), "contextsubtype_", p2.internalGetVerifier(), "plcmttype_", e3.internalGetVerifier(), "aurlsupport_", "durlsupport_", "eventtrackers_", EventTrackers.class, "privacy_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<NativeRequest> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (NativeRequest.class) {
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
                            return Byte.valueOf(this.memoizedIsInitialized);
                        case 7:
                            this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                            return null;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }

                @Override // com.moloco.sdk.f3
                public Asset getAssets(int i10) {
                    return this.assets_.get(i10);
                }

                @Override // com.moloco.sdk.f3
                public int getAssetsCount() {
                    return this.assets_.size();
                }

                @Override // com.moloco.sdk.f3
                public List<Asset> getAssetsList() {
                    return this.assets_;
                }

                public l2 getAssetsOrBuilder(int i10) {
                    return this.assets_.get(i10);
                }

                public List<? extends l2> getAssetsOrBuilderList() {
                    return this.assets_;
                }

                @Override // com.moloco.sdk.f3
                public boolean getAurlsupport() {
                    return this.aurlsupport_;
                }

                @Override // com.moloco.sdk.f3
                public s2 getContext() {
                    s2 s2VarForNumber = s2.forNumber(this.context_);
                    return s2VarForNumber == null ? s2.CONTENT : s2VarForNumber;
                }

                @Override // com.moloco.sdk.f3
                public p2 getContextsubtype() {
                    p2 p2VarForNumber = p2.forNumber(this.contextsubtype_);
                    return p2VarForNumber == null ? p2.CONTENT_GENERAL_OR_MIXED : p2VarForNumber;
                }

                @Override // com.moloco.sdk.f3
                public boolean getDurlsupport() {
                    return this.durlsupport_;
                }

                @Override // com.moloco.sdk.f3
                public EventTrackers getEventtrackers(int i10) {
                    return this.eventtrackers_.get(i10);
                }

                @Override // com.moloco.sdk.f3
                public int getEventtrackersCount() {
                    return this.eventtrackers_.size();
                }

                @Override // com.moloco.sdk.f3
                public List<EventTrackers> getEventtrackersList() {
                    return this.eventtrackers_;
                }

                public b3 getEventtrackersOrBuilder(int i10) {
                    return this.eventtrackers_.get(i10);
                }

                public List<? extends b3> getEventtrackersOrBuilderList() {
                    return this.eventtrackers_;
                }

                @Override // com.moloco.sdk.f3
                public int getPlcmtcnt() {
                    return this.plcmtcnt_;
                }

                @Override // com.moloco.sdk.f3
                public e3 getPlcmttype() {
                    e3 e3VarForNumber = e3.forNumber(this.plcmttype_);
                    return e3VarForNumber == null ? e3.IN_FEED : e3VarForNumber;
                }

                @Override // com.moloco.sdk.f3
                public boolean getPrivacy() {
                    return this.privacy_;
                }

                @Override // com.moloco.sdk.f3
                public int getSeq() {
                    return this.seq_;
                }

                @Override // com.moloco.sdk.f3
                public String getVer() {
                    return this.ver_;
                }

                @Override // com.moloco.sdk.f3
                public ByteString getVerBytes() {
                    return ByteString.copyFromUtf8(this.ver_);
                }

                @Override // com.moloco.sdk.f3
                public boolean hasAurlsupport() {
                    return (this.bitField0_ & 64) != 0;
                }

                @Override // com.moloco.sdk.f3
                public boolean hasContext() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.moloco.sdk.f3
                public boolean hasContextsubtype() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.moloco.sdk.f3
                public boolean hasDurlsupport() {
                    return (this.bitField0_ & 128) != 0;
                }

                @Override // com.moloco.sdk.f3
                public boolean hasPlcmtcnt() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.moloco.sdk.f3
                public boolean hasPlcmttype() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.moloco.sdk.f3
                public boolean hasPrivacy() {
                    return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
                }

                @Override // com.moloco.sdk.f3
                public boolean hasSeq() {
                    return (this.bitField0_ & 32) != 0;
                }

                @Override // com.moloco.sdk.f3
                public boolean hasVer() {
                    return (this.bitField0_ & 1) != 0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static m2 newBuilder(NativeRequest nativeRequest) {
                    return (m2) DEFAULT_INSTANCE.createBuilder(nativeRequest);
                }

                public static NativeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static NativeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static NativeRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addAssets(int i10, Asset asset) {
                    asset.getClass();
                    ensureAssetsIsMutable();
                    this.assets_.add(i10, asset);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addEventtrackers(int i10, EventTrackers eventTrackers) {
                    eventTrackers.getClass();
                    ensureEventtrackersIsMutable();
                    this.eventtrackers_.add(i10, eventTrackers);
                }

                public static NativeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static NativeRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static NativeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static NativeRequest parseFrom(InputStream inputStream) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static NativeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static NativeRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static NativeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (NativeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Native r02 = new Native();
                DEFAULT_INSTANCE = r02;
                GeneratedMessageLite.registerDefaultInstance(Native.class, r02);
            }

            private Native() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllApi(Iterable<? extends d0> iterable) {
                ensureApiIsMutable();
                Iterator<? extends d0> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllBattr(Iterable<? extends r1> iterable) {
                ensureBattrIsMutable();
                Iterator<? extends r1> it = iterable.iterator();
                while (it.hasNext()) {
                    this.battr_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addApi(d0 d0Var) {
                d0Var.getClass();
                ensureApiIsMutable();
                this.api_.addInt(d0Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addBattr(r1 r1Var) {
                r1Var.getClass();
                ensureBattrIsMutable();
                this.battr_.addInt(r1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearApi() {
                this.api_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBattr() {
                this.battr_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequest() {
                if (this.requestOneofCase_ == 1) {
                    this.requestOneofCase_ = 0;
                    this.requestOneof_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequestNative() {
                if (this.requestOneofCase_ == 50) {
                    this.requestOneofCase_ = 0;
                    this.requestOneof_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequestOneof() {
                this.requestOneofCase_ = 0;
                this.requestOneof_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVer() {
                this.bitField0_ &= -5;
                this.ver_ = getDefaultInstance().getVer();
            }

            private void ensureApiIsMutable() {
                Internal.IntList intList = this.api_;
                if (intList.isModifiable()) {
                    return;
                }
                this.api_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureBattrIsMutable() {
                Internal.IntList intList = this.battr_;
                if (intList.isModifiable()) {
                    return;
                }
                this.battr_ = GeneratedMessageLite.mutableCopy(intList);
            }

            public static Native getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void mergeRequestNative(NativeRequest nativeRequest) {
                nativeRequest.getClass();
                if (this.requestOneofCase_ != 50 || this.requestOneof_ == NativeRequest.getDefaultInstance()) {
                    this.requestOneof_ = nativeRequest;
                } else {
                    this.requestOneof_ = ((m2) NativeRequest.newBuilder((NativeRequest) this.requestOneof_).mergeFrom((m2) nativeRequest)).buildPartial();
                }
                this.requestOneofCase_ = 50;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static w1 newBuilder() {
                return (w1) DEFAULT_INSTANCE.createBuilder();
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
            public void setApi(int i10, d0 d0Var) {
                d0Var.getClass();
                ensureApiIsMutable();
                this.api_.setInt(i10, d0Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBattr(int i10, r1 r1Var) {
                r1Var.getClass();
                ensureBattrIsMutable();
                this.battr_.setInt(i10, r1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequest(String str) {
                str.getClass();
                this.requestOneofCase_ = 1;
                this.requestOneof_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequestBytes(ByteString byteString) {
                this.requestOneof_ = byteString.toStringUtf8();
                this.requestOneofCase_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequestNative(NativeRequest nativeRequest) {
                nativeRequest.getClass();
                this.requestOneof_ = nativeRequest;
                this.requestOneofCase_ = 50;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVer(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.ver_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVerBytes(ByteString byteString) {
                this.ver_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (a.f45443a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Native();
                    case 2:
                        return new w1(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u00012\u0005\u0000\u0002\u0001\u0001ျ\u0000\u0002ဈ\u0002\u0003,\u0004,2ᐼ\u0000", new Object[]{"requestOneof_", "requestOneofCase_", "bitField0_", "ver_", "api_", d0.internalGetVerifier(), "battr_", r1.internalGetVerifier(), NativeRequest.class});
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.moloco.sdk.h3
            public d0 getApi(int i10) {
                d0 d0VarForNumber = d0.forNumber(this.api_.getInt(i10));
                return d0VarForNumber == null ? d0.VPAID_1 : d0VarForNumber;
            }

            @Override // com.moloco.sdk.h3
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.moloco.sdk.h3
            public List<d0> getApiList() {
                return new Internal.ListAdapter(this.api_, api_converter_);
            }

            @Override // com.moloco.sdk.h3
            public r1 getBattr(int i10) {
                r1 r1VarForNumber = r1.forNumber(this.battr_.getInt(i10));
                return r1VarForNumber == null ? r1.AUDIO_AUTO_PLAY : r1VarForNumber;
            }

            @Override // com.moloco.sdk.h3
            public int getBattrCount() {
                return this.battr_.size();
            }

            @Override // com.moloco.sdk.h3
            public List<r1> getBattrList() {
                return new Internal.ListAdapter(this.battr_, battr_converter_);
            }

            @Override // com.moloco.sdk.h3
            public String getRequest() {
                return this.requestOneofCase_ == 1 ? (String) this.requestOneof_ : "";
            }

            @Override // com.moloco.sdk.h3
            public ByteString getRequestBytes() {
                return ByteString.copyFromUtf8(this.requestOneofCase_ == 1 ? (String) this.requestOneof_ : "");
            }

            @Override // com.moloco.sdk.h3
            public NativeRequest getRequestNative() {
                return this.requestOneofCase_ == 50 ? (NativeRequest) this.requestOneof_ : NativeRequest.getDefaultInstance();
            }

            @Override // com.moloco.sdk.h3
            public g3 getRequestOneofCase() {
                return g3.forNumber(this.requestOneofCase_);
            }

            @Override // com.moloco.sdk.h3
            public String getVer() {
                return this.ver_;
            }

            @Override // com.moloco.sdk.h3
            public ByteString getVerBytes() {
                return ByteString.copyFromUtf8(this.ver_);
            }

            @Override // com.moloco.sdk.h3
            public boolean hasRequest() {
                return this.requestOneofCase_ == 1;
            }

            @Override // com.moloco.sdk.h3
            public boolean hasRequestNative() {
                return this.requestOneofCase_ == 50;
            }

            @Override // com.moloco.sdk.h3
            public boolean hasVer() {
                return (this.bitField0_ & 4) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static w1 newBuilder(Native r12) {
                return (w1) DEFAULT_INSTANCE.createBuilder(r12);
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

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Pmp extends GeneratedMessageLite.ExtendableMessage<Pmp, i3> implements o3 {
            public static final int DEALS_FIELD_NUMBER = 2;
            private static final Pmp DEFAULT_INSTANCE;
            private static volatile Parser<Pmp> PARSER = null;
            public static final int PRIVATE_AUCTION_FIELD_NUMBER = 1;
            private int bitField0_;
            private boolean privateAuction_;
            private byte memoizedIsInitialized = 2;
            private Internal.ProtobufList<Deal> deals_ = GeneratedMessageLite.emptyProtobufList();

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Deal extends GeneratedMessageLite.ExtendableMessage<Deal, m3> implements n3 {
                public static final int AT_FIELD_NUMBER = 6;
                public static final int BIDFLOORCUR_FIELD_NUMBER = 3;
                public static final int BIDFLOOR_FIELD_NUMBER = 2;
                private static final Deal DEFAULT_INSTANCE;
                public static final int ID_FIELD_NUMBER = 1;
                private static volatile Parser<Deal> PARSER = null;
                public static final int WADOMAIN_FIELD_NUMBER = 5;
                public static final int WSEAT_FIELD_NUMBER = 4;
                private double bidfloor_;
                private int bitField0_;
                private byte memoizedIsInitialized = 2;
                private String id_ = "";
                private String bidfloorcur_ = "USD";
                private Internal.ProtobufList<String> wseat_ = GeneratedMessageLite.emptyProtobufList();
                private Internal.ProtobufList<String> wadomain_ = GeneratedMessageLite.emptyProtobufList();
                private int at_ = 1;

                static {
                    Deal deal = new Deal();
                    DEFAULT_INSTANCE = deal;
                    GeneratedMessageLite.registerDefaultInstance(Deal.class, deal);
                }

                private Deal() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addAllWadomain(Iterable<String> iterable) {
                    ensureWadomainIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.wadomain_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addAllWseat(Iterable<String> iterable) {
                    ensureWseatIsMutable();
                    AbstractMessageLite.addAll((Iterable) iterable, (List) this.wseat_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addWadomain(String str) {
                    str.getClass();
                    ensureWadomainIsMutable();
                    this.wadomain_.add(str);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addWadomainBytes(ByteString byteString) {
                    ensureWadomainIsMutable();
                    this.wadomain_.add(byteString.toStringUtf8());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addWseat(String str) {
                    str.getClass();
                    ensureWseatIsMutable();
                    this.wseat_.add(str);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void addWseatBytes(ByteString byteString) {
                    ensureWseatIsMutable();
                    this.wseat_.add(byteString.toStringUtf8());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearAt() {
                    this.bitField0_ &= -9;
                    this.at_ = 1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearBidfloor() {
                    this.bitField0_ &= -3;
                    this.bidfloor_ = 0.0d;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearBidfloorcur() {
                    this.bitField0_ &= -5;
                    this.bidfloorcur_ = getDefaultInstance().getBidfloorcur();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearId() {
                    this.bitField0_ &= -2;
                    this.id_ = getDefaultInstance().getId();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearWadomain() {
                    this.wadomain_ = GeneratedMessageLite.emptyProtobufList();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearWseat() {
                    this.wseat_ = GeneratedMessageLite.emptyProtobufList();
                }

                private void ensureWadomainIsMutable() {
                    Internal.ProtobufList<String> protobufList = this.wadomain_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.wadomain_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                private void ensureWseatIsMutable() {
                    Internal.ProtobufList<String> protobufList = this.wseat_;
                    if (protobufList.isModifiable()) {
                        return;
                    }
                    this.wseat_ = GeneratedMessageLite.mutableCopy(protobufList);
                }

                public static Deal getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static m3 newBuilder() {
                    return (m3) DEFAULT_INSTANCE.createBuilder();
                }

                public static Deal parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Deal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Deal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<Deal> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setAt(l3 l3Var) {
                    this.at_ = l3Var.getNumber();
                    this.bitField0_ |= 8;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setBidfloor(double d10) {
                    this.bitField0_ |= 2;
                    this.bidfloor_ = d10;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setBidfloorcur(String str) {
                    str.getClass();
                    this.bitField0_ |= 4;
                    this.bidfloorcur_ = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setBidfloorcurBytes(ByteString byteString) {
                    this.bidfloorcur_ = byteString.toStringUtf8();
                    this.bitField0_ |= 4;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setId(String str) {
                    str.getClass();
                    this.bitField0_ |= 1;
                    this.id_ = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setIdBytes(ByteString byteString) {
                    this.id_ = byteString.toStringUtf8();
                    this.bitField0_ |= 1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setWadomain(int i10, String str) {
                    str.getClass();
                    ensureWadomainIsMutable();
                    this.wadomain_.set(i10, str);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setWseat(int i10, String str) {
                    str.getClass();
                    ensureWseatIsMutable();
                    this.wseat_.set(i10, str);
                }

                @Override // com.moloco.sdk.n3
                public l3 getAt() {
                    l3 l3VarForNumber = l3.forNumber(this.at_);
                    return l3VarForNumber == null ? l3.FIRST_PRICE : l3VarForNumber;
                }

                @Override // com.moloco.sdk.n3
                public double getBidfloor() {
                    return this.bidfloor_;
                }

                @Override // com.moloco.sdk.n3
                public String getBidfloorcur() {
                    return this.bidfloorcur_;
                }

                @Override // com.moloco.sdk.n3
                public ByteString getBidfloorcurBytes() {
                    return ByteString.copyFromUtf8(this.bidfloorcur_);
                }

                @Override // com.moloco.sdk.n3
                public String getId() {
                    return this.id_;
                }

                @Override // com.moloco.sdk.n3
                public ByteString getIdBytes() {
                    return ByteString.copyFromUtf8(this.id_);
                }

                @Override // com.moloco.sdk.n3
                public String getWadomain(int i10) {
                    return this.wadomain_.get(i10);
                }

                @Override // com.moloco.sdk.n3
                public ByteString getWadomainBytes(int i10) {
                    return ByteString.copyFromUtf8(this.wadomain_.get(i10));
                }

                @Override // com.moloco.sdk.n3
                public int getWadomainCount() {
                    return this.wadomain_.size();
                }

                @Override // com.moloco.sdk.n3
                public List<String> getWadomainList() {
                    return this.wadomain_;
                }

                @Override // com.moloco.sdk.n3
                public String getWseat(int i10) {
                    return this.wseat_.get(i10);
                }

                @Override // com.moloco.sdk.n3
                public ByteString getWseatBytes(int i10) {
                    return ByteString.copyFromUtf8(this.wseat_.get(i10));
                }

                @Override // com.moloco.sdk.n3
                public int getWseatCount() {
                    return this.wseat_.size();
                }

                @Override // com.moloco.sdk.n3
                public List<String> getWseatList() {
                    return this.wseat_;
                }

                @Override // com.moloco.sdk.n3
                public boolean hasAt() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.moloco.sdk.n3
                public boolean hasBidfloor() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.moloco.sdk.n3
                public boolean hasBidfloorcur() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.moloco.sdk.n3
                public boolean hasId() {
                    return (this.bitField0_ & 1) != 0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static m3 newBuilder(Deal deal) {
                    return (m3) DEFAULT_INSTANCE.createBuilder(deal);
                }

                public static Deal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Deal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Deal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (a.f45443a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Deal();
                        case 2:
                            return new m3(DEFAULT_INSTANCE);
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0001\u0001ᔈ\u0000\u0002က\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0006ဌ\u0003", new Object[]{"bitField0_", PtLatqAYjEFT.RvoQ, "bidfloor_", "bidfloorcur_", "wseat_", "wadomain_", "at_", l3.internalGetVerifier()});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<Deal> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (Deal.class) {
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
                            return Byte.valueOf(this.memoizedIsInitialized);
                        case 7:
                            this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                            return null;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }

                public static Deal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static Deal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static Deal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static Deal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static Deal parseFrom(InputStream inputStream) throws IOException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Deal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Deal parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static Deal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Deal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Pmp pmp = new Pmp();
                DEFAULT_INSTANCE = pmp;
                GeneratedMessageLite.registerDefaultInstance(Pmp.class, pmp);
            }

            private Pmp() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllDeals(Iterable<? extends Deal> iterable) {
                ensureDealsIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.deals_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addDeals(Deal deal) {
                deal.getClass();
                ensureDealsIsMutable();
                this.deals_.add(deal);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeals() {
                this.deals_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPrivateAuction() {
                this.bitField0_ &= -2;
                this.privateAuction_ = false;
            }

            private void ensureDealsIsMutable() {
                Internal.ProtobufList<Deal> protobufList = this.deals_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.deals_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Pmp getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static i3 newBuilder() {
                return (i3) DEFAULT_INSTANCE.createBuilder();
            }

            public static Pmp parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Pmp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Pmp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Pmp> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeDeals(int i10) {
                ensureDealsIsMutable();
                this.deals_.remove(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeals(int i10, Deal deal) {
                deal.getClass();
                ensureDealsIsMutable();
                this.deals_.set(i10, deal);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPrivateAuction(boolean z10) {
                this.bitField0_ |= 1;
                this.privateAuction_ = z10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (a.f45443a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Pmp();
                    case 2:
                        return new i3(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဇ\u0000\u0002Л", new Object[]{"bitField0_", "privateAuction_", "deals_", Deal.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Pmp> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Pmp.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.moloco.sdk.o3
            public Deal getDeals(int i10) {
                return this.deals_.get(i10);
            }

            @Override // com.moloco.sdk.o3
            public int getDealsCount() {
                return this.deals_.size();
            }

            @Override // com.moloco.sdk.o3
            public List<Deal> getDealsList() {
                return this.deals_;
            }

            public n3 getDealsOrBuilder(int i10) {
                return this.deals_.get(i10);
            }

            public List<? extends n3> getDealsOrBuilderList() {
                return this.deals_;
            }

            @Override // com.moloco.sdk.o3
            public boolean getPrivateAuction() {
                return this.privateAuction_;
            }

            @Override // com.moloco.sdk.o3
            public boolean hasPrivateAuction() {
                return (this.bitField0_ & 1) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static i3 newBuilder(Pmp pmp) {
                return (i3) DEFAULT_INSTANCE.createBuilder(pmp);
            }

            public static Pmp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Pmp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Pmp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Pmp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addDeals(int i10, Deal deal) {
                deal.getClass();
                ensureDealsIsMutable();
                this.deals_.add(i10, deal);
            }

            public static Pmp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Pmp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Pmp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Pmp parseFrom(InputStream inputStream) throws IOException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Pmp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Pmp parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Pmp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Pmp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Video extends GeneratedMessageLite.ExtendableMessage<Video, h4> implements u4 {
            public static final int API_FIELD_NUMBER = 19;
            public static final int BATTR_FIELD_NUMBER = 10;
            public static final int BOXINGALLOWED_FIELD_NUMBER = 14;
            public static final int COMPANIONAD_FIELD_NUMBER = 18;
            public static final int COMPANIONTYPE_FIELD_NUMBER = 20;
            private static final Video DEFAULT_INSTANCE;
            public static final int DELIVERY_FIELD_NUMBER = 16;
            public static final int H_FIELD_NUMBER = 7;
            public static final int LINEARITY_FIELD_NUMBER = 2;
            public static final int MAXBITRATE_FIELD_NUMBER = 13;
            public static final int MAXDURATION_FIELD_NUMBER = 4;
            public static final int MAXEXTENDED_FIELD_NUMBER = 11;
            public static final int MAXSEQ_FIELD_NUMBER = 28;
            public static final int MIMES_FIELD_NUMBER = 1;
            public static final int MINBITRATE_FIELD_NUMBER = 12;
            public static final int MINCPMPERSEC_FIELD_NUMBER = 34;
            public static final int MINDURATION_FIELD_NUMBER = 3;
            private static volatile Parser<Video> PARSER = null;
            public static final int PLACEMENT_FIELD_NUMBER = 26;
            public static final int PLAYBACKEND_FIELD_NUMBER = 27;
            public static final int PLAYBACKMETHOD_FIELD_NUMBER = 15;
            public static final int PODDUR_FIELD_NUMBER = 29;
            public static final int PODID_FIELD_NUMBER = 30;
            public static final int PODSEQ_FIELD_NUMBER = 31;
            public static final int POS_FIELD_NUMBER = 17;
            public static final int PROTOCOLS_FIELD_NUMBER = 21;
            public static final int PROTOCOL_FIELD_NUMBER = 5;
            public static final int RQDDURS_FIELD_NUMBER = 32;
            public static final int SEQUENCE_FIELD_NUMBER = 9;
            public static final int SKIPAFTER_FIELD_NUMBER = 25;
            public static final int SKIPMIN_FIELD_NUMBER = 24;
            public static final int SKIP_FIELD_NUMBER = 23;
            public static final int SLOTINPOD_FIELD_NUMBER = 33;
            public static final int STARTDELAY_FIELD_NUMBER = 8;
            public static final int W_FIELD_NUMBER = 6;
            private int apiMemoizedSerializedSize;
            private int battrMemoizedSerializedSize;
            private int bitField0_;
            private int companiontypeMemoizedSerializedSize;
            private int deliveryMemoizedSerializedSize;
            private int h_;
            private int maxbitrate_;
            private int maxduration_;
            private int maxextended_;
            private int maxseq_;
            private int minbitrate_;
            private double mincpmpersec_;
            private int minduration_;
            private int placement_;
            private int playbackmethodMemoizedSerializedSize;
            private int poddur_;
            private int podseq_;
            private int pos_;
            private int protocolsMemoizedSerializedSize;
            private boolean skip_;
            private int skipafter_;
            private int skipmin_;
            private int slotinpod_;
            private int startdelay_;
            private int w_;
            private static final Internal.ListAdapter.Converter<Integer, u3> protocols_converter_ = new b4();
            private static final Internal.ListAdapter.Converter<Integer, r1> battr_converter_ = new c4();
            private static final Internal.ListAdapter.Converter<Integer, n4> playbackmethod_converter_ = new d4();
            private static final Internal.ListAdapter.Converter<Integer, o1> delivery_converter_ = new e4();
            private static final Internal.ListAdapter.Converter<Integer, d0> api_converter_ = new f4();
            private static final Internal.ListAdapter.Converter<Integer, l1> companiontype_converter_ = new g4();
            private int rqddursMemoizedSerializedSize = -1;
            private byte memoizedIsInitialized = 2;
            private Internal.ProtobufList<String> mimes_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.IntList protocols_ = GeneratedMessageLite.emptyIntList();
            private String podid_ = "";
            private Internal.IntList rqddurs_ = GeneratedMessageLite.emptyIntList();
            private int linearity_ = 1;
            private int sequence_ = 1;
            private Internal.IntList battr_ = GeneratedMessageLite.emptyIntList();
            private boolean boxingallowed_ = true;
            private Internal.IntList playbackmethod_ = GeneratedMessageLite.emptyIntList();
            private int playbackend_ = 1;
            private Internal.IntList delivery_ = GeneratedMessageLite.emptyIntList();
            private Internal.ProtobufList<Banner> companionad_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.IntList api_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList companiontype_ = GeneratedMessageLite.emptyIntList();
            private int protocol_ = 1;

            static {
                Video video = new Video();
                DEFAULT_INSTANCE = video;
                GeneratedMessageLite.registerDefaultInstance(Video.class, video);
            }

            private Video() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllApi(Iterable<? extends d0> iterable) {
                ensureApiIsMutable();
                Iterator<? extends d0> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllBattr(Iterable<? extends r1> iterable) {
                ensureBattrIsMutable();
                Iterator<? extends r1> it = iterable.iterator();
                while (it.hasNext()) {
                    this.battr_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllCompanionad(Iterable<? extends Banner> iterable) {
                ensureCompanionadIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.companionad_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllCompaniontype(Iterable<? extends l1> iterable) {
                ensureCompaniontypeIsMutable();
                Iterator<? extends l1> it = iterable.iterator();
                while (it.hasNext()) {
                    this.companiontype_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllDelivery(Iterable<? extends o1> iterable) {
                ensureDeliveryIsMutable();
                Iterator<? extends o1> it = iterable.iterator();
                while (it.hasNext()) {
                    this.delivery_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllMimes(Iterable<String> iterable) {
                ensureMimesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.mimes_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllPlaybackmethod(Iterable<? extends n4> iterable) {
                ensurePlaybackmethodIsMutable();
                Iterator<? extends n4> it = iterable.iterator();
                while (it.hasNext()) {
                    this.playbackmethod_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllProtocols(Iterable<? extends u3> iterable) {
                ensureProtocolsIsMutable();
                Iterator<? extends u3> it = iterable.iterator();
                while (it.hasNext()) {
                    this.protocols_.addInt(it.next().getNumber());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllRqddurs(Iterable<? extends Integer> iterable) {
                ensureRqddursIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.rqddurs_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addApi(d0 d0Var) {
                d0Var.getClass();
                ensureApiIsMutable();
                this.api_.addInt(d0Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addBattr(r1 r1Var) {
                r1Var.getClass();
                ensureBattrIsMutable();
                this.battr_.addInt(r1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addCompanionad(Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.add(banner);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addCompaniontype(l1 l1Var) {
                l1Var.getClass();
                ensureCompaniontypeIsMutable();
                this.companiontype_.addInt(l1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addDelivery(o1 o1Var) {
                o1Var.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.addInt(o1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addMimes(String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addMimesBytes(ByteString byteString) {
                ensureMimesIsMutable();
                this.mimes_.add(byteString.toStringUtf8());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addPlaybackmethod(n4 n4Var) {
                n4Var.getClass();
                ensurePlaybackmethodIsMutable();
                this.playbackmethod_.addInt(n4Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addProtocols(u3 u3Var) {
                u3Var.getClass();
                ensureProtocolsIsMutable();
                this.protocols_.addInt(u3Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addRqddurs(int i10) {
                ensureRqddursIsMutable();
                this.rqddurs_.addInt(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearApi() {
                this.api_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBattr() {
                this.battr_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBoxingallowed() {
                this.bitField0_ &= -1048577;
                this.boxingallowed_ = true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCompanionad() {
                this.companionad_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCompaniontype() {
                this.companiontype_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDelivery() {
                this.delivery_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearH() {
                this.bitField0_ &= -65;
                this.h_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLinearity() {
                this.bitField0_ &= -1025;
                this.linearity_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxbitrate() {
                this.bitField0_ &= -524289;
                this.maxbitrate_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxduration() {
                this.bitField0_ &= -3;
                this.maxduration_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxextended() {
                this.bitField0_ &= -131073;
                this.maxextended_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMaxseq() {
                this.bitField0_ &= -9;
                this.maxseq_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMimes() {
                this.mimes_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMinbitrate() {
                this.bitField0_ &= -262145;
                this.minbitrate_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMincpmpersec() {
                this.bitField0_ &= -65537;
                this.mincpmpersec_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMinduration() {
                this.bitField0_ &= -2;
                this.minduration_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPlacement() {
                this.bitField0_ &= -513;
                this.placement_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPlaybackend() {
                this.bitField0_ &= -2097153;
                this.playbackend_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPlaybackmethod() {
                this.playbackmethod_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPoddur() {
                this.bitField0_ &= -17;
                this.poddur_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPodid() {
                this.bitField0_ &= -129;
                this.podid_ = getDefaultInstance().getPodid();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPodseq() {
                this.bitField0_ &= -257;
                this.podseq_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPos() {
                this.bitField0_ &= -4194305;
                this.pos_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearProtocol() {
                this.bitField0_ &= -8388609;
                this.protocol_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearProtocols() {
                this.protocols_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRqddurs() {
                this.rqddurs_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSequence() {
                this.bitField0_ &= -16385;
                this.sequence_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSkip() {
                this.bitField0_ &= -2049;
                this.skip_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSkipafter() {
                this.bitField0_ &= -8193;
                this.skipafter_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSkipmin() {
                this.bitField0_ &= -4097;
                this.skipmin_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSlotinpod() {
                this.bitField0_ &= -32769;
                this.slotinpod_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStartdelay() {
                this.bitField0_ &= -5;
                this.startdelay_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearW() {
                this.bitField0_ &= -33;
                this.w_ = 0;
            }

            private void ensureApiIsMutable() {
                Internal.IntList intList = this.api_;
                if (intList.isModifiable()) {
                    return;
                }
                this.api_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureBattrIsMutable() {
                Internal.IntList intList = this.battr_;
                if (intList.isModifiable()) {
                    return;
                }
                this.battr_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureCompanionadIsMutable() {
                Internal.ProtobufList<Banner> protobufList = this.companionad_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.companionad_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureCompaniontypeIsMutable() {
                Internal.IntList intList = this.companiontype_;
                if (intList.isModifiable()) {
                    return;
                }
                this.companiontype_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureDeliveryIsMutable() {
                Internal.IntList intList = this.delivery_;
                if (intList.isModifiable()) {
                    return;
                }
                this.delivery_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureMimesIsMutable() {
                Internal.ProtobufList<String> protobufList = this.mimes_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.mimes_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensurePlaybackmethodIsMutable() {
                Internal.IntList intList = this.playbackmethod_;
                if (intList.isModifiable()) {
                    return;
                }
                this.playbackmethod_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureProtocolsIsMutable() {
                Internal.IntList intList = this.protocols_;
                if (intList.isModifiable()) {
                    return;
                }
                this.protocols_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureRqddursIsMutable() {
                Internal.IntList intList = this.rqddurs_;
                if (intList.isModifiable()) {
                    return;
                }
                this.rqddurs_ = GeneratedMessageLite.mutableCopy(intList);
            }

            public static Video getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static h4 newBuilder() {
                return (h4) DEFAULT_INSTANCE.createBuilder();
            }

            public static Video parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Video) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Video parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Video> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeCompanionad(int i10) {
                ensureCompanionadIsMutable();
                this.companionad_.remove(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setApi(int i10, d0 d0Var) {
                d0Var.getClass();
                ensureApiIsMutable();
                this.api_.setInt(i10, d0Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBattr(int i10, r1 r1Var) {
                r1Var.getClass();
                ensureBattrIsMutable();
                this.battr_.setInt(i10, r1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBoxingallowed(boolean z10) {
                this.bitField0_ |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                this.boxingallowed_ = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCompanionad(int i10, Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.set(i10, banner);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCompaniontype(int i10, l1 l1Var) {
                l1Var.getClass();
                ensureCompaniontypeIsMutable();
                this.companiontype_.setInt(i10, l1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDelivery(int i10, o1 o1Var) {
                o1Var.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.setInt(i10, o1Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setH(int i10) {
                this.bitField0_ |= 64;
                this.h_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLinearity(q4 q4Var) {
                this.linearity_ = q4Var.getNumber();
                this.bitField0_ |= 1024;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxbitrate(int i10) {
                this.bitField0_ |= 524288;
                this.maxbitrate_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxduration(int i10) {
                this.bitField0_ |= 2;
                this.maxduration_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxextended(int i10) {
                this.bitField0_ |= 131072;
                this.maxextended_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMaxseq(int i10) {
                this.bitField0_ |= 8;
                this.maxseq_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMimes(int i10, String str) {
                str.getClass();
                ensureMimesIsMutable();
                this.mimes_.set(i10, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMinbitrate(int i10) {
                this.bitField0_ |= 262144;
                this.minbitrate_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMincpmpersec(double d10) {
                this.bitField0_ |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                this.mincpmpersec_ = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMinduration(int i10) {
                this.bitField0_ |= 1;
                this.minduration_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPlacement(t4 t4Var) {
                this.placement_ = t4Var.getNumber();
                this.bitField0_ |= 512;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPlaybackend(k4 k4Var) {
                this.playbackend_ = k4Var.getNumber();
                this.bitField0_ |= 2097152;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPlaybackmethod(int i10, n4 n4Var) {
                n4Var.getClass();
                ensurePlaybackmethodIsMutable();
                this.playbackmethod_.setInt(i10, n4Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPoddur(int i10) {
                this.bitField0_ |= 16;
                this.poddur_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPodid(String str) {
                str.getClass();
                this.bitField0_ |= 128;
                this.podid_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPodidBytes(ByteString byteString) {
                this.podid_ = byteString.toStringUtf8();
                this.bitField0_ |= 128;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPodseq(r3 r3Var) {
                this.podseq_ = r3Var.getNumber();
                this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPos(g0 g0Var) {
                this.pos_ = g0Var.getNumber();
                this.bitField0_ |= 4194304;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setProtocol(u3 u3Var) {
                this.protocol_ = u3Var.getNumber();
                this.bitField0_ |= 8388608;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setProtocols(int i10, u3 u3Var) {
                u3Var.getClass();
                ensureProtocolsIsMutable();
                this.protocols_.setInt(i10, u3Var.getNumber());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRqddurs(int i10, int i11) {
                ensureRqddursIsMutable();
                this.rqddurs_.setInt(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSequence(int i10) {
                this.bitField0_ |= 16384;
                this.sequence_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSkip(boolean z10) {
                this.bitField0_ |= 2048;
                this.skip_ = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSkipafter(int i10) {
                this.bitField0_ |= Segment.SIZE;
                this.skipafter_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSkipmin(int i10) {
                this.bitField0_ |= 4096;
                this.skipmin_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSlotinpod(a4 a4Var) {
                this.slotinpod_ = a4Var.getNumber();
                this.bitField0_ |= 32768;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStartdelay(int i10) {
                this.bitField0_ |= 4;
                this.startdelay_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setW(int i10) {
                this.bitField0_ |= 32;
                this.w_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (a.f45443a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Video();
                    case 2:
                        return new h4(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001!\u0000\u0001\u0001\"!\u0000\t\u0001\u0001\u001a\u0002ဌ\n\u0003င\u0000\u0004င\u0001\u0005ဌ\u0017\u0006င\u0005\u0007င\u0006\bင\u0002\tင\u000e\n,\u000bင\u0011\fင\u0012\rင\u0013\u000eဇ\u0014\u000f,\u0010,\u0011ဌ\u0016\u0012Л\u0013,\u0014,\u0015,\u0017ဇ\u000b\u0018င\f\u0019င\r\u001aဌ\t\u001bဌ\u0015\u001cင\u0003\u001dင\u0004\u001eဈ\u0007\u001fဌ\b '!ဌ\u000f\"က\u0010", new Object[]{"bitField0_", "mimes_", "linearity_", q4.internalGetVerifier(), "minduration_", "maxduration_", "protocol_", u3.internalGetVerifier(), "w_", "h_", "startdelay_", "sequence_", "battr_", r1.internalGetVerifier(), "maxextended_", "minbitrate_", "maxbitrate_", "boxingallowed_", "playbackmethod_", n4.internalGetVerifier(), "delivery_", o1.internalGetVerifier(), "pos_", g0.internalGetVerifier(), "companionad_", Banner.class, "api_", d0.internalGetVerifier(), "companiontype_", l1.internalGetVerifier(), "protocols_", u3.internalGetVerifier(), "skip_", "skipmin_", "skipafter_", "placement_", t4.internalGetVerifier(), "playbackend_", k4.internalGetVerifier(), "maxseq_", "poddur_", "podid_", "podseq_", r3.internalGetVerifier(), "rqddurs_", "slotinpod_", a4.internalGetVerifier(), "mincpmpersec_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Video> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Video.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.moloco.sdk.u4
            public d0 getApi(int i10) {
                d0 d0VarForNumber = d0.forNumber(this.api_.getInt(i10));
                return d0VarForNumber == null ? d0.VPAID_1 : d0VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.moloco.sdk.u4
            public List<d0> getApiList() {
                return new Internal.ListAdapter(this.api_, api_converter_);
            }

            @Override // com.moloco.sdk.u4
            public r1 getBattr(int i10) {
                r1 r1VarForNumber = r1.forNumber(this.battr_.getInt(i10));
                return r1VarForNumber == null ? r1.AUDIO_AUTO_PLAY : r1VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public int getBattrCount() {
                return this.battr_.size();
            }

            @Override // com.moloco.sdk.u4
            public List<r1> getBattrList() {
                return new Internal.ListAdapter(this.battr_, battr_converter_);
            }

            @Override // com.moloco.sdk.u4
            public boolean getBoxingallowed() {
                return this.boxingallowed_;
            }

            @Override // com.moloco.sdk.u4
            public Banner getCompanionad(int i10) {
                return this.companionad_.get(i10);
            }

            @Override // com.moloco.sdk.u4
            public int getCompanionadCount() {
                return this.companionad_.size();
            }

            @Override // com.moloco.sdk.u4
            public List<Banner> getCompanionadList() {
                return this.companionad_;
            }

            public h1 getCompanionadOrBuilder(int i10) {
                return this.companionad_.get(i10);
            }

            public List<? extends h1> getCompanionadOrBuilderList() {
                return this.companionad_;
            }

            @Override // com.moloco.sdk.u4
            public l1 getCompaniontype(int i10) {
                l1 l1VarForNumber = l1.forNumber(this.companiontype_.getInt(i10));
                return l1VarForNumber == null ? l1.STATIC : l1VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public int getCompaniontypeCount() {
                return this.companiontype_.size();
            }

            @Override // com.moloco.sdk.u4
            public List<l1> getCompaniontypeList() {
                return new Internal.ListAdapter(this.companiontype_, companiontype_converter_);
            }

            @Override // com.moloco.sdk.u4
            public o1 getDelivery(int i10) {
                o1 o1VarForNumber = o1.forNumber(this.delivery_.getInt(i10));
                return o1VarForNumber == null ? o1.STREAMING : o1VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public int getDeliveryCount() {
                return this.delivery_.size();
            }

            @Override // com.moloco.sdk.u4
            public List<o1> getDeliveryList() {
                return new Internal.ListAdapter(this.delivery_, delivery_converter_);
            }

            @Override // com.moloco.sdk.u4
            public int getH() {
                return this.h_;
            }

            @Override // com.moloco.sdk.u4
            public q4 getLinearity() {
                q4 q4VarForNumber = q4.forNumber(this.linearity_);
                return q4VarForNumber == null ? q4.LINEAR : q4VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public int getMaxbitrate() {
                return this.maxbitrate_;
            }

            @Override // com.moloco.sdk.u4
            public int getMaxduration() {
                return this.maxduration_;
            }

            @Override // com.moloco.sdk.u4
            public int getMaxextended() {
                return this.maxextended_;
            }

            @Override // com.moloco.sdk.u4
            public int getMaxseq() {
                return this.maxseq_;
            }

            @Override // com.moloco.sdk.u4
            public String getMimes(int i10) {
                return this.mimes_.get(i10);
            }

            @Override // com.moloco.sdk.u4
            public ByteString getMimesBytes(int i10) {
                return ByteString.copyFromUtf8(this.mimes_.get(i10));
            }

            @Override // com.moloco.sdk.u4
            public int getMimesCount() {
                return this.mimes_.size();
            }

            @Override // com.moloco.sdk.u4
            public List<String> getMimesList() {
                return this.mimes_;
            }

            @Override // com.moloco.sdk.u4
            public int getMinbitrate() {
                return this.minbitrate_;
            }

            @Override // com.moloco.sdk.u4
            public double getMincpmpersec() {
                return this.mincpmpersec_;
            }

            @Override // com.moloco.sdk.u4
            public int getMinduration() {
                return this.minduration_;
            }

            @Override // com.moloco.sdk.u4
            public t4 getPlacement() {
                t4 t4VarForNumber = t4.forNumber(this.placement_);
                return t4VarForNumber == null ? t4.UNDEFINED_VIDEO_PLACEMENT : t4VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public k4 getPlaybackend() {
                k4 k4VarForNumber = k4.forNumber(this.playbackend_);
                return k4VarForNumber == null ? k4.COMPLETION_OR_USER : k4VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public n4 getPlaybackmethod(int i10) {
                n4 n4VarForNumber = n4.forNumber(this.playbackmethod_.getInt(i10));
                return n4VarForNumber == null ? n4.f47308c : n4VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public int getPlaybackmethodCount() {
                return this.playbackmethod_.size();
            }

            @Override // com.moloco.sdk.u4
            public List<n4> getPlaybackmethodList() {
                return new Internal.ListAdapter(this.playbackmethod_, playbackmethod_converter_);
            }

            @Override // com.moloco.sdk.u4
            public int getPoddur() {
                return this.poddur_;
            }

            @Override // com.moloco.sdk.u4
            public String getPodid() {
                return this.podid_;
            }

            @Override // com.moloco.sdk.u4
            public ByteString getPodidBytes() {
                return ByteString.copyFromUtf8(this.podid_);
            }

            @Override // com.moloco.sdk.u4
            public r3 getPodseq() {
                r3 r3VarForNumber = r3.forNumber(this.podseq_);
                return r3VarForNumber == null ? r3.POD_SEQUENCE_ANY : r3VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public g0 getPos() {
                g0 g0VarForNumber = g0.forNumber(this.pos_);
                return g0VarForNumber == null ? g0.UNKNOWN : g0VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            @Deprecated
            public u3 getProtocol() {
                u3 u3VarForNumber = u3.forNumber(this.protocol_);
                return u3VarForNumber == null ? u3.VAST_1_0 : u3VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public u3 getProtocols(int i10) {
                u3 u3VarForNumber = u3.forNumber(this.protocols_.getInt(i10));
                return u3VarForNumber == null ? u3.VAST_1_0 : u3VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public int getProtocolsCount() {
                return this.protocols_.size();
            }

            @Override // com.moloco.sdk.u4
            public List<u3> getProtocolsList() {
                return new Internal.ListAdapter(this.protocols_, protocols_converter_);
            }

            @Override // com.moloco.sdk.u4
            public int getRqddurs(int i10) {
                return this.rqddurs_.getInt(i10);
            }

            @Override // com.moloco.sdk.u4
            public int getRqddursCount() {
                return this.rqddurs_.size();
            }

            @Override // com.moloco.sdk.u4
            public List<Integer> getRqddursList() {
                return this.rqddurs_;
            }

            @Override // com.moloco.sdk.u4
            @Deprecated
            public int getSequence() {
                return this.sequence_;
            }

            @Override // com.moloco.sdk.u4
            public boolean getSkip() {
                return this.skip_;
            }

            @Override // com.moloco.sdk.u4
            public int getSkipafter() {
                return this.skipafter_;
            }

            @Override // com.moloco.sdk.u4
            public int getSkipmin() {
                return this.skipmin_;
            }

            @Override // com.moloco.sdk.u4
            public a4 getSlotinpod() {
                a4 a4VarForNumber = a4.forNumber(this.slotinpod_);
                return a4VarForNumber == null ? a4.SLOT_POSITION_POD_ANY : a4VarForNumber;
            }

            @Override // com.moloco.sdk.u4
            public int getStartdelay() {
                return this.startdelay_;
            }

            @Override // com.moloco.sdk.u4
            public int getW() {
                return this.w_;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasBoxingallowed() {
                return (this.bitField0_ & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasH() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasLinearity() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasMaxbitrate() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasMaxduration() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasMaxextended() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasMaxseq() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasMinbitrate() {
                return (this.bitField0_ & 262144) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasMincpmpersec() {
                return (this.bitField0_ & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasMinduration() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasPlacement() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasPlaybackend() {
                return (this.bitField0_ & 2097152) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasPoddur() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasPodid() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasPodseq() {
                return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasPos() {
                return (this.bitField0_ & 4194304) != 0;
            }

            @Override // com.moloco.sdk.u4
            @Deprecated
            public boolean hasProtocol() {
                return (this.bitField0_ & 8388608) != 0;
            }

            @Override // com.moloco.sdk.u4
            @Deprecated
            public boolean hasSequence() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasSkip() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasSkipafter() {
                return (this.bitField0_ & Segment.SIZE) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasSkipmin() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasSlotinpod() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasStartdelay() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.u4
            public boolean hasW() {
                return (this.bitField0_ & 32) != 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static h4 newBuilder(Video video) {
                return (h4) DEFAULT_INSTANCE.createBuilder(video);
            }

            public static Video parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Video) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Video parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Video parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addCompanionad(int i10, Banner banner) {
                banner.getClass();
                ensureCompanionadIsMutable();
                this.companionad_.add(i10, banner);
            }

            public static Video parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Video parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Video parseFrom(InputStream inputStream) throws IOException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Video parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Video parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Video parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Video) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Imp imp = new Imp();
            DEFAULT_INSTANCE = imp;
            GeneratedMessageLite.registerDefaultInstance(Imp.class, imp);
        }

        private Imp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllIframebuster(Iterable<String> iterable) {
            ensureIframebusterIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.iframebuster_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMetric(Iterable<? extends Metric> iterable) {
            ensureMetricIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.metric_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIframebuster(String str) {
            str.getClass();
            ensureIframebusterIsMutable();
            this.iframebuster_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addIframebusterBytes(ByteString byteString) {
            ensureIframebusterIsMutable();
            this.iframebuster_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetric(Metric metric2) {
            metric2.getClass();
            ensureMetricIsMutable();
            this.metric_.add(metric2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudio() {
            this.audio_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBanner() {
            this.banner_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBidfloor() {
            this.bitField0_ &= -257;
            this.bidfloor_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBidfloorcur() {
            this.bitField0_ &= -513;
            this.bidfloorcur_ = getDefaultInstance().getBidfloorcur();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClickbrowser() {
            this.bitField0_ &= -1025;
            this.clickbrowser_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisplaymanager() {
            this.bitField0_ &= -17;
            this.displaymanager_ = getDefaultInstance().getDisplaymanager();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisplaymanagerver() {
            this.bitField0_ &= -33;
            this.displaymanagerver_ = getDefaultInstance().getDisplaymanagerver();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExp() {
            this.bitField0_ &= -65537;
            this.exp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.bitField0_ &= -2;
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIframebuster() {
            this.iframebuster_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInstl() {
            this.bitField0_ &= -65;
            this.instl_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetric() {
            this.metric_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNative() {
            this.native_ = null;
            this.bitField0_ &= -32769;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPmp() {
            this.pmp_ = null;
            this.bitField0_ &= -16385;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRwdd() {
            this.bitField0_ &= -4097;
            this.rwdd_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecure() {
            this.bitField0_ &= -2049;
            this.secure_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSsai() {
            this.bitField0_ &= -8193;
            this.ssai_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTagid() {
            this.bitField0_ &= -129;
            this.tagid_ = getDefaultInstance().getTagid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideo() {
            this.video_ = null;
            this.bitField0_ &= -5;
        }

        private void ensureIframebusterIsMutable() {
            Internal.ProtobufList<String> protobufList = this.iframebuster_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.iframebuster_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureMetricIsMutable() {
            Internal.ProtobufList<Metric> protobufList = this.metric_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.metric_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Imp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeAudio(Audio audio) {
            audio.getClass();
            Audio audio2 = this.audio_;
            if (audio2 == null || audio2 == Audio.getDefaultInstance()) {
                this.audio_ = audio;
            } else {
                this.audio_ = (Audio) ((m0) Audio.newBuilder(this.audio_).mergeFrom((m0) audio)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeBanner(Banner banner) {
            banner.getClass();
            Banner banner2 = this.banner_;
            if (banner2 == null || banner2 == Banner.getDefaultInstance()) {
                this.banner_ = banner;
            } else {
                this.banner_ = (Banner) ((b1) Banner.newBuilder(this.banner_).mergeFrom((b1) banner)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeNative(Native r32) {
            r32.getClass();
            Native r02 = this.native_;
            if (r02 == null || r02 == Native.getDefaultInstance()) {
                this.native_ = r32;
            } else {
                this.native_ = (Native) ((w1) Native.newBuilder(this.native_).mergeFrom((w1) r32)).buildPartial();
            }
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergePmp(Pmp pmp) {
            pmp.getClass();
            Pmp pmp2 = this.pmp_;
            if (pmp2 == null || pmp2 == Pmp.getDefaultInstance()) {
                this.pmp_ = pmp;
            } else {
                this.pmp_ = (Pmp) ((i3) Pmp.newBuilder(this.pmp_).mergeFrom((i3) pmp)).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeVideo(Video video) {
            video.getClass();
            Video video2 = this.video_;
            if (video2 == null || video2 == Video.getDefaultInstance()) {
                this.video_ = video;
            } else {
                this.video_ = (Video) ((h4) Video.newBuilder(this.video_).mergeFrom((h4) video)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static i1 newBuilder() {
            return (i1) DEFAULT_INSTANCE.createBuilder();
        }

        public static Imp parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Imp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Imp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Imp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMetric(int i10) {
            ensureMetricIsMutable();
            this.metric_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudio(Audio audio) {
            audio.getClass();
            this.audio_ = audio;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBanner(Banner banner) {
            banner.getClass();
            this.banner_ = banner;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidfloor(double d10) {
            this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.bidfloor_ = d10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidfloorcur(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.bidfloorcur_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBidfloorcurBytes(ByteString byteString) {
            this.bidfloorcur_ = byteString.toStringUtf8();
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickbrowser(boolean z10) {
            this.bitField0_ |= 1024;
            this.clickbrowser_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplaymanager(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.displaymanager_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplaymanagerBytes(ByteString byteString) {
            this.displaymanager_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplaymanagerver(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.displaymanagerver_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisplaymanagerverBytes(ByteString byteString) {
            this.displaymanagerver_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExp(int i10) {
            this.bitField0_ |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
            this.exp_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            this.id_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIframebuster(int i10, String str) {
            str.getClass();
            ensureIframebusterIsMutable();
            this.iframebuster_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstl(boolean z10) {
            this.bitField0_ |= 64;
            this.instl_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetric(int i10, Metric metric2) {
            metric2.getClass();
            ensureMetricIsMutable();
            this.metric_.set(i10, metric2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNative(Native r22) {
            r22.getClass();
            this.native_ = r22;
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPmp(Pmp pmp) {
            pmp.getClass();
            this.pmp_ = pmp;
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRwdd(boolean z10) {
            this.bitField0_ |= 4096;
            this.rwdd_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecure(boolean z10) {
            this.bitField0_ |= 2048;
            this.secure_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSsai(x3 x3Var) {
            this.ssai_ = x3Var.getNumber();
            this.bitField0_ |= Segment.SIZE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagid(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.tagid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagidBytes(ByteString byteString) {
            this.tagid_ = byteString.toStringUtf8();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideo(Video video) {
            video.getClass();
            this.video_ = video;
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (a.f45443a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Imp();
                case 2:
                    return new i1(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0002\u0007\u0001ᔈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဇ\u0006\u0007ဈ\u0007\bက\b\tဈ\t\n\u001a\u000bᐉ\u000e\fဇ\u000b\rᐉ\u000f\u000eင\u0010\u000fᐉ\u0003\u0010ဇ\n\u0011Л\u0012ဇ\f\u0013ဌ\r", new Object[]{"bitField0_", "id_", "banner_", "video_", "displaymanager_", "displaymanagerver_", "instl_", "tagid_", "bidfloor_", "bidfloorcur_", "iframebuster_", "pmp_", "secure_", "native_", "exp_", "audio_", "clickbrowser_", "metric_", Metric.class, "rwdd_", "ssai_", x3.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Imp> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Imp.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.v4
        public Audio getAudio() {
            Audio audio = this.audio_;
            return audio == null ? Audio.getDefaultInstance() : audio;
        }

        @Override // com.moloco.sdk.v4
        public Banner getBanner() {
            Banner banner = this.banner_;
            return banner == null ? Banner.getDefaultInstance() : banner;
        }

        @Override // com.moloco.sdk.v4
        public double getBidfloor() {
            return this.bidfloor_;
        }

        @Override // com.moloco.sdk.v4
        public String getBidfloorcur() {
            return this.bidfloorcur_;
        }

        @Override // com.moloco.sdk.v4
        public ByteString getBidfloorcurBytes() {
            return ByteString.copyFromUtf8(this.bidfloorcur_);
        }

        @Override // com.moloco.sdk.v4
        public boolean getClickbrowser() {
            return this.clickbrowser_;
        }

        @Override // com.moloco.sdk.v4
        public String getDisplaymanager() {
            return this.displaymanager_;
        }

        @Override // com.moloco.sdk.v4
        public ByteString getDisplaymanagerBytes() {
            return ByteString.copyFromUtf8(this.displaymanager_);
        }

        @Override // com.moloco.sdk.v4
        public String getDisplaymanagerver() {
            return this.displaymanagerver_;
        }

        @Override // com.moloco.sdk.v4
        public ByteString getDisplaymanagerverBytes() {
            return ByteString.copyFromUtf8(this.displaymanagerver_);
        }

        @Override // com.moloco.sdk.v4
        public int getExp() {
            return this.exp_;
        }

        @Override // com.moloco.sdk.v4
        public String getId() {
            return this.id_;
        }

        @Override // com.moloco.sdk.v4
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.moloco.sdk.v4
        public String getIframebuster(int i10) {
            return this.iframebuster_.get(i10);
        }

        @Override // com.moloco.sdk.v4
        public ByteString getIframebusterBytes(int i10) {
            return ByteString.copyFromUtf8(this.iframebuster_.get(i10));
        }

        @Override // com.moloco.sdk.v4
        public int getIframebusterCount() {
            return this.iframebuster_.size();
        }

        @Override // com.moloco.sdk.v4
        public List<String> getIframebusterList() {
            return this.iframebuster_;
        }

        @Override // com.moloco.sdk.v4
        public boolean getInstl() {
            return this.instl_;
        }

        @Override // com.moloco.sdk.v4
        public Metric getMetric(int i10) {
            return this.metric_.get(i10);
        }

        @Override // com.moloco.sdk.v4
        public int getMetricCount() {
            return this.metric_.size();
        }

        @Override // com.moloco.sdk.v4
        public List<Metric> getMetricList() {
            return this.metric_;
        }

        public t1 getMetricOrBuilder(int i10) {
            return this.metric_.get(i10);
        }

        public List<? extends t1> getMetricOrBuilderList() {
            return this.metric_;
        }

        @Override // com.moloco.sdk.v4
        public Native getNative() {
            Native r02 = this.native_;
            return r02 == null ? Native.getDefaultInstance() : r02;
        }

        @Override // com.moloco.sdk.v4
        public Pmp getPmp() {
            Pmp pmp = this.pmp_;
            return pmp == null ? Pmp.getDefaultInstance() : pmp;
        }

        @Override // com.moloco.sdk.v4
        public boolean getRwdd() {
            return this.rwdd_;
        }

        @Override // com.moloco.sdk.v4
        public boolean getSecure() {
            return this.secure_;
        }

        @Override // com.moloco.sdk.v4
        public x3 getSsai() {
            x3 x3VarForNumber = x3.forNumber(this.ssai_);
            return x3VarForNumber == null ? x3.SERVER_SIDE_AD_INSERTION_TYPE_UNKNOWN : x3VarForNumber;
        }

        @Override // com.moloco.sdk.v4
        public String getTagid() {
            return this.tagid_;
        }

        @Override // com.moloco.sdk.v4
        public ByteString getTagidBytes() {
            return ByteString.copyFromUtf8(this.tagid_);
        }

        @Override // com.moloco.sdk.v4
        public Video getVideo() {
            Video video = this.video_;
            return video == null ? Video.getDefaultInstance() : video;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasAudio() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasBanner() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasBidfloor() {
            return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasBidfloorcur() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasClickbrowser() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasDisplaymanager() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasDisplaymanagerver() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasExp() {
            return (this.bitField0_ & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasInstl() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasNative() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasPmp() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasRwdd() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasSecure() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasSsai() {
            return (this.bitField0_ & Segment.SIZE) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasTagid() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.moloco.sdk.v4
        public boolean hasVideo() {
            return (this.bitField0_ & 4) != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static i1 newBuilder(Imp imp) {
            return (i1) DEFAULT_INSTANCE.createBuilder(imp);
        }

        public static Imp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Imp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Imp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Imp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetric(int i10, Metric metric2) {
            metric2.getClass();
            ensureMetricIsMutable();
            this.metric_.add(i10, metric2);
        }

        public static Imp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Imp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Imp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Imp parseFrom(InputStream inputStream) throws IOException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Imp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Imp parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Imp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Imp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Regs extends GeneratedMessageLite<Regs, w4> implements z4 {
        public static final int COPPA_FIELD_NUMBER = 1;
        private static final Regs DEFAULT_INSTANCE;
        public static final int EXT_FIELD_NUMBER = 2;
        private static volatile Parser<Regs> PARSER;
        private int bitField0_;
        private boolean coppa_;
        private Ext ext_;
        private byte memoizedIsInitialized = 2;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Ext extends GeneratedMessageLite<Ext, x4> implements y4 {
            public static final int CCPA_FIELD_NUMBER = 1;
            private static final Ext DEFAULT_INSTANCE;
            public static final int GDPR_FIELD_NUMBER = 2;
            private static volatile Parser<Ext> PARSER = null;
            public static final int US_PRIVACY_FIELD_NUMBER = 3;
            private int bitField0_;
            private int ccpa_;
            private int gdpr_;
            private byte memoizedIsInitialized = 2;
            private String usPrivacy_ = "";

            static {
                Ext ext = new Ext();
                DEFAULT_INSTANCE = ext;
                GeneratedMessageLite.registerDefaultInstance(Ext.class, ext);
            }

            private Ext() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCcpa() {
                this.bitField0_ &= -2;
                this.ccpa_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGdpr() {
                this.bitField0_ &= -3;
                this.gdpr_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUsPrivacy() {
                this.bitField0_ &= -5;
                this.usPrivacy_ = getDefaultInstance().getUsPrivacy();
            }

            public static Ext getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static x4 newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Ext parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Ext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Ext> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCcpa(int i10) {
                this.bitField0_ |= 1;
                this.ccpa_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGdpr(int i10) {
                this.bitField0_ |= 2;
                this.gdpr_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUsPrivacy(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.usPrivacy_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUsPrivacyBytes(ByteString byteString) {
                this.usPrivacy_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (a.f45443a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Ext();
                    case 2:
                        return new x4(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔈ\u0002", new Object[]{"bitField0_", "ccpa_", "gdpr_", "usPrivacy_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Ext> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Ext.class) {
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
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // com.moloco.sdk.y4
            public int getCcpa() {
                return this.ccpa_;
            }

            @Override // com.moloco.sdk.y4
            public int getGdpr() {
                return this.gdpr_;
            }

            @Override // com.moloco.sdk.y4
            public String getUsPrivacy() {
                return this.usPrivacy_;
            }

            @Override // com.moloco.sdk.y4
            public ByteString getUsPrivacyBytes() {
                return ByteString.copyFromUtf8(this.usPrivacy_);
            }

            @Override // com.moloco.sdk.y4
            public boolean hasCcpa() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.y4
            public boolean hasGdpr() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.y4
            public boolean hasUsPrivacy() {
                return (this.bitField0_ & 4) != 0;
            }

            public static x4 newBuilder(Ext ext) {
                return DEFAULT_INSTANCE.createBuilder(ext);
            }

            public static Ext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ext) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Ext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Ext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Ext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Ext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Ext parseFrom(InputStream inputStream) throws IOException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Ext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Ext parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Ext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ext) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Regs regs = new Regs();
            DEFAULT_INSTANCE = regs;
            GeneratedMessageLite.registerDefaultInstance(Regs.class, regs);
        }

        private Regs() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoppa() {
            this.bitField0_ &= -2;
            this.coppa_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExt() {
            this.ext_ = null;
            this.bitField0_ &= -3;
        }

        public static Regs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExt(Ext ext) {
            ext.getClass();
            Ext ext2 = this.ext_;
            if (ext2 == null || ext2 == Ext.getDefaultInstance()) {
                this.ext_ = ext;
            } else {
                this.ext_ = (Ext) ((x4) Ext.newBuilder(this.ext_).mergeFrom((x4) ext)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static w4 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Regs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Regs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Regs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Regs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoppa(boolean z10) {
            this.bitField0_ |= 1;
            this.coppa_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExt(Ext ext) {
            ext.getClass();
            this.ext_ = ext;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (a.f45443a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Regs();
                case 2:
                    return new w4(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဇ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "coppa_", U5.f35547b});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Regs> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Regs.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.z4
        public boolean getCoppa() {
            return this.coppa_;
        }

        @Override // com.moloco.sdk.z4
        public Ext getExt() {
            Ext ext = this.ext_;
            return ext == null ? Ext.getDefaultInstance() : ext;
        }

        @Override // com.moloco.sdk.z4
        public boolean hasCoppa() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.z4
        public boolean hasExt() {
            return (this.bitField0_ & 2) != 0;
        }

        public static w4 newBuilder(Regs regs) {
            return DEFAULT_INSTANCE.createBuilder(regs);
        }

        public static Regs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Regs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Regs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Regs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Regs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Regs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Regs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Regs parseFrom(InputStream inputStream) throws IOException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Regs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Regs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Regs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Regs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class User extends GeneratedMessageLite<User, a5> implements b5 {
        private static final User DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<User> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String id_ = "";

        static {
            User user = new User();
            DEFAULT_INSTANCE = user;
            GeneratedMessageLite.registerDefaultInstance(User.class, user);
        }

        private User() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.bitField0_ &= -2;
            this.id_ = getDefaultInstance().getId();
        }

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a5 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static User parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<User> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            this.id_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (a.f45443a[methodToInvoke.ordinal()]) {
                case 1:
                    return new User();
                case 2:
                    return new a5(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"bitField0_", "id_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<User> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (User.class) {
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
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.b5
        public String getId() {
            return this.id_;
        }

        @Override // com.moloco.sdk.b5
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.moloco.sdk.b5
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a5 newBuilder(User user) {
            return DEFAULT_INSTANCE.createBuilder(user);
        }

        public static User parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static User parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static User parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static User parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static User parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static User parseFrom(InputStream inputStream) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static User parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static User parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        BidRequest$SdkBidRequest bidRequest$SdkBidRequest = new BidRequest$SdkBidRequest();
        DEFAULT_INSTANCE = bidRequest$SdkBidRequest;
        GeneratedMessageLite.registerDefaultInstance(BidRequest$SdkBidRequest.class, bidRequest$SdkBidRequest);
    }

    private BidRequest$SdkBidRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApp() {
        this.app_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevice() {
        this.device_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImp() {
        this.imp_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegs() {
        this.regs_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTmax() {
        this.bitField0_ &= -17;
        this.tmax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUser() {
        this.user_ = null;
        this.bitField0_ &= -33;
    }

    public static BidRequest$SdkBidRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApp(App app) {
        app.getClass();
        App app2 = this.app_;
        if (app2 == null || app2 == App.getDefaultInstance()) {
            this.app_ = app;
        } else {
            this.app_ = (App) ((b) App.newBuilder(this.app_).mergeFrom((b) app)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeDevice(Device device) {
        device.getClass();
        Device device2 = this.device_;
        if (device2 == null || device2 == Device.getDefaultInstance()) {
            this.device_ = device;
        } else {
            this.device_ = (Device) ((e) Device.newBuilder(this.device_).mergeFrom((e) device)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeImp(Imp imp) {
        imp.getClass();
        Imp imp2 = this.imp_;
        if (imp2 == null || imp2 == Imp.getDefaultInstance()) {
            this.imp_ = imp;
        } else {
            this.imp_ = (Imp) ((i1) Imp.newBuilder(this.imp_).mergeFrom((i1) imp)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegs(Regs regs) {
        regs.getClass();
        Regs regs2 = this.regs_;
        if (regs2 == null || regs2 == Regs.getDefaultInstance()) {
            this.regs_ = regs;
        } else {
            this.regs_ = (Regs) ((w4) Regs.newBuilder(this.regs_).mergeFrom((w4) regs)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUser(User user) {
        user.getClass();
        User user2 = this.user_;
        if (user2 == null || user2 == User.getDefaultInstance()) {
            this.user_ = user;
        } else {
            this.user_ = (User) ((a5) User.newBuilder(this.user_).mergeFrom((a5) user)).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    public static d newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BidRequest$SdkBidRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidRequest$SdkBidRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BidRequest$SdkBidRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApp(App app) {
        app.getClass();
        this.app_ = app;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(Device device) {
        device.getClass();
        this.device_ = device;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImp(Imp imp) {
        imp.getClass();
        this.imp_ = imp;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegs(Regs regs) {
        regs.getClass();
        this.regs_ = regs;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTmax(int i10) {
        this.bitField0_ |= 16;
        this.tmax_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUser(User user) {
        user.getClass();
        this.user_ = user;
        this.bitField0_ |= 32;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f45443a[methodToInvoke.ordinal()]) {
            case 1:
                return new BidRequest$SdkBidRequest();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔉ\u0001\u0003ᔉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006ᐉ\u0005", new Object[]{"bitField0_", "app_", "device_", "imp_", "regs_", "tmax_", "user_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BidRequest$SdkBidRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BidRequest$SdkBidRequest.class) {
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
                return Byte.valueOf(this.memoizedIsInitialized);
            case 7:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.moloco.sdk.c5
    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    @Override // com.moloco.sdk.c5
    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    @Override // com.moloco.sdk.c5
    public Imp getImp() {
        Imp imp = this.imp_;
        return imp == null ? Imp.getDefaultInstance() : imp;
    }

    @Override // com.moloco.sdk.c5
    public Regs getRegs() {
        Regs regs = this.regs_;
        return regs == null ? Regs.getDefaultInstance() : regs;
    }

    @Override // com.moloco.sdk.c5
    public int getTmax() {
        return this.tmax_;
    }

    @Override // com.moloco.sdk.c5
    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    @Override // com.moloco.sdk.c5
    public boolean hasApp() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.moloco.sdk.c5
    public boolean hasDevice() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.moloco.sdk.c5
    public boolean hasImp() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.moloco.sdk.c5
    public boolean hasRegs() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.moloco.sdk.c5
    public boolean hasTmax() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.moloco.sdk.c5
    public boolean hasUser() {
        return (this.bitField0_ & 32) != 0;
    }

    public static d newBuilder(BidRequest$SdkBidRequest bidRequest$SdkBidRequest) {
        return DEFAULT_INSTANCE.createBuilder(bidRequest$SdkBidRequest);
    }

    public static BidRequest$SdkBidRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidRequest$SdkBidRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BidRequest$SdkBidRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BidRequest$SdkBidRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BidRequest$SdkBidRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BidRequest$SdkBidRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BidRequest$SdkBidRequest parseFrom(InputStream inputStream) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidRequest$SdkBidRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidRequest$SdkBidRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BidRequest$SdkBidRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidRequest$SdkBidRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
