package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BidToken$BidTokenRequestV2 extends GeneratedMessageLite<BidToken$BidTokenRequestV2, i5> implements j5 {
    public static final int BID_TOKEN_COMPONENTS_FIELD_NUMBER = 2;
    private static final BidToken$BidTokenRequestV2 DEFAULT_INSTANCE;
    private static volatile Parser<BidToken$BidTokenRequestV2> PARSER;
    private BidTokenComponents bidTokenComponents_;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class BidTokenComponents extends GeneratedMessageLite<BidTokenComponents, e5> implements h5 {
        private static final BidTokenComponents DEFAULT_INSTANCE;
        public static final int IDFV_FIELD_NUMBER = 1;
        private static volatile Parser<BidTokenComponents> PARSER = null;
        public static final int PRIVACY_FIELD_NUMBER = 2;
        private int bitField0_;
        private String idfv_ = "";
        private Privacy privacy_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Privacy extends GeneratedMessageLite<Privacy, f5> implements g5 {
            public static final int CCPA_FIELD_NUMBER = 1;
            public static final int COPPA_FIELD_NUMBER = 3;
            private static final Privacy DEFAULT_INSTANCE;
            public static final int GDPR_FIELD_NUMBER = 2;
            private static volatile Parser<Privacy> PARSER = null;
            public static final int TCF_CONSENT_STRING_FIELD_NUMBER = 5;
            public static final int US_PRIVACY_FIELD_NUMBER = 4;
            private int bitField0_;
            private boolean ccpa_;
            private boolean coppa_;
            private boolean gdpr_;
            private String usPrivacy_ = "";
            private String tcfConsentString_ = "";

            static {
                Privacy privacy = new Privacy();
                DEFAULT_INSTANCE = privacy;
                GeneratedMessageLite.registerDefaultInstance(Privacy.class, privacy);
            }

            private Privacy() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCcpa() {
                this.bitField0_ &= -2;
                this.ccpa_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCoppa() {
                this.bitField0_ &= -5;
                this.coppa_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGdpr() {
                this.bitField0_ &= -3;
                this.gdpr_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTcfConsentString() {
                this.bitField0_ &= -17;
                this.tcfConsentString_ = getDefaultInstance().getTcfConsentString();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUsPrivacy() {
                this.bitField0_ &= -9;
                this.usPrivacy_ = getDefaultInstance().getUsPrivacy();
            }

            public static Privacy getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static f5 newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Privacy parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Privacy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Privacy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Privacy> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCcpa(boolean z10) {
                this.bitField0_ |= 1;
                this.ccpa_ = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCoppa(boolean z10) {
                this.bitField0_ |= 4;
                this.coppa_ = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGdpr(boolean z10) {
                this.bitField0_ |= 2;
                this.gdpr_ = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTcfConsentString(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.tcfConsentString_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTcfConsentStringBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.tcfConsentString_ = byteString.toStringUtf8();
                this.bitField0_ |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUsPrivacy(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.usPrivacy_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUsPrivacyBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.usPrivacy_ = byteString.toStringUtf8();
                this.bitField0_ |= 8;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (d5.f45721a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Privacy();
                    case 2:
                        return new f5(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "ccpa_", "gdpr_", "coppa_", "usPrivacy_", "tcfConsentString_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Privacy> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Privacy.class) {
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

            @Override // com.moloco.sdk.g5
            public boolean getCcpa() {
                return this.ccpa_;
            }

            @Override // com.moloco.sdk.g5
            public boolean getCoppa() {
                return this.coppa_;
            }

            @Override // com.moloco.sdk.g5
            public boolean getGdpr() {
                return this.gdpr_;
            }

            @Override // com.moloco.sdk.g5
            public String getTcfConsentString() {
                return this.tcfConsentString_;
            }

            @Override // com.moloco.sdk.g5
            public ByteString getTcfConsentStringBytes() {
                return ByteString.copyFromUtf8(this.tcfConsentString_);
            }

            @Override // com.moloco.sdk.g5
            public String getUsPrivacy() {
                return this.usPrivacy_;
            }

            @Override // com.moloco.sdk.g5
            public ByteString getUsPrivacyBytes() {
                return ByteString.copyFromUtf8(this.usPrivacy_);
            }

            @Override // com.moloco.sdk.g5
            public boolean hasCcpa() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.moloco.sdk.g5
            public boolean hasCoppa() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.moloco.sdk.g5
            public boolean hasGdpr() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.g5
            public boolean hasTcfConsentString() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.moloco.sdk.g5
            public boolean hasUsPrivacy() {
                return (this.bitField0_ & 8) != 0;
            }

            public static f5 newBuilder(Privacy privacy) {
                return DEFAULT_INSTANCE.createBuilder(privacy);
            }

            public static Privacy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Privacy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Privacy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Privacy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Privacy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Privacy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Privacy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Privacy parseFrom(InputStream inputStream) throws IOException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Privacy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Privacy parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Privacy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Privacy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        static {
            BidTokenComponents bidTokenComponents = new BidTokenComponents();
            DEFAULT_INSTANCE = bidTokenComponents;
            GeneratedMessageLite.registerDefaultInstance(BidTokenComponents.class, bidTokenComponents);
        }

        private BidTokenComponents() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfv() {
            this.bitField0_ &= -2;
            this.idfv_ = getDefaultInstance().getIdfv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrivacy() {
            this.privacy_ = null;
        }

        public static BidTokenComponents getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePrivacy(Privacy privacy) {
            privacy.getClass();
            Privacy privacy2 = this.privacy_;
            if (privacy2 == null || privacy2 == Privacy.getDefaultInstance()) {
                this.privacy_ = privacy;
            } else {
                this.privacy_ = (Privacy) ((f5) Privacy.newBuilder(this.privacy_).mergeFrom((f5) privacy)).buildPartial();
            }
        }

        public static e5 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BidTokenComponents parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BidTokenComponents parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BidTokenComponents> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfv(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.idfv_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfvBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.idfv_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrivacy(Privacy privacy) {
            privacy.getClass();
            this.privacy_ = privacy;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BidTokenComponents();
                case 2:
                    return new e5(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002\t", new Object[]{"bitField0_", "idfv_", "privacy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BidTokenComponents> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BidTokenComponents.class) {
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

        @Override // com.moloco.sdk.h5
        public String getIdfv() {
            return this.idfv_;
        }

        @Override // com.moloco.sdk.h5
        public ByteString getIdfvBytes() {
            return ByteString.copyFromUtf8(this.idfv_);
        }

        @Override // com.moloco.sdk.h5
        public Privacy getPrivacy() {
            Privacy privacy = this.privacy_;
            return privacy == null ? Privacy.getDefaultInstance() : privacy;
        }

        @Override // com.moloco.sdk.h5
        public boolean hasIdfv() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.moloco.sdk.h5
        public boolean hasPrivacy() {
            return this.privacy_ != null;
        }

        public static e5 newBuilder(BidTokenComponents bidTokenComponents) {
            return DEFAULT_INSTANCE.createBuilder(bidTokenComponents);
        }

        public static BidTokenComponents parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BidTokenComponents parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BidTokenComponents parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BidTokenComponents parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BidTokenComponents parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BidTokenComponents parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BidTokenComponents parseFrom(InputStream inputStream) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BidTokenComponents parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BidTokenComponents parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BidTokenComponents parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BidTokenComponents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        BidToken$BidTokenRequestV2 bidToken$BidTokenRequestV2 = new BidToken$BidTokenRequestV2();
        DEFAULT_INSTANCE = bidToken$BidTokenRequestV2;
        GeneratedMessageLite.registerDefaultInstance(BidToken$BidTokenRequestV2.class, bidToken$BidTokenRequestV2);
    }

    private BidToken$BidTokenRequestV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBidTokenComponents() {
        this.bidTokenComponents_ = null;
    }

    public static BidToken$BidTokenRequestV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBidTokenComponents(BidTokenComponents bidTokenComponents) {
        bidTokenComponents.getClass();
        BidTokenComponents bidTokenComponents2 = this.bidTokenComponents_;
        if (bidTokenComponents2 == null || bidTokenComponents2 == BidTokenComponents.getDefaultInstance()) {
            this.bidTokenComponents_ = bidTokenComponents;
        } else {
            this.bidTokenComponents_ = (BidTokenComponents) ((e5) BidTokenComponents.newBuilder(this.bidTokenComponents_).mergeFrom((e5) bidTokenComponents)).buildPartial();
        }
    }

    public static i5 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BidToken$BidTokenRequestV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BidToken$BidTokenRequestV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBidTokenComponents(BidTokenComponents bidTokenComponents) {
        bidTokenComponents.getClass();
        this.bidTokenComponents_ = bidTokenComponents;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (d5.f45721a[methodToInvoke.ordinal()]) {
            case 1:
                return new BidToken$BidTokenRequestV2();
            case 2:
                return new i5(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"bidTokenComponents_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BidToken$BidTokenRequestV2> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BidToken$BidTokenRequestV2.class) {
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

    @Override // com.moloco.sdk.j5
    public BidTokenComponents getBidTokenComponents() {
        BidTokenComponents bidTokenComponents = this.bidTokenComponents_;
        return bidTokenComponents == null ? BidTokenComponents.getDefaultInstance() : bidTokenComponents;
    }

    @Override // com.moloco.sdk.j5
    public boolean hasBidTokenComponents() {
        return this.bidTokenComponents_ != null;
    }

    public static i5 newBuilder(BidToken$BidTokenRequestV2 bidToken$BidTokenRequestV2) {
        return DEFAULT_INSTANCE.createBuilder(bidToken$BidTokenRequestV2);
    }

    public static BidToken$BidTokenRequestV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(InputStream inputStream) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BidToken$BidTokenRequestV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenRequestV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
