package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class GetTokenEventRequestOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class GetTokenEventRequest extends GeneratedMessageLite<GetTokenEventRequest, Builder> implements GetTokenEventRequestOrBuilder {
        public static final int BANNER_FIELD_NUMBER = 3;
        private static final GetTokenEventRequest DEFAULT_INSTANCE;
        public static final int INTERSTITIAL_FIELD_NUMBER = 2;
        private static volatile Parser<GetTokenEventRequest> PARSER = null;
        public static final int REWARDED_FIELD_NUMBER = 1;
        public static final int TOKEN_ID_FIELD_NUMBER = 4;
        private ByteString banner_;
        private int bitField0_;
        private ByteString interstitial_;
        private ByteString rewarded_;
        private ByteString tokenId_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<GetTokenEventRequest, Builder> implements GetTokenEventRequestOrBuilder {
            public /* synthetic */ Builder(wl.p pVar) {
                this();
            }

            public Builder clearBanner() {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).clearBanner();
                return this;
            }

            public Builder clearInterstitial() {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).clearInterstitial();
                return this;
            }

            public Builder clearRewarded() {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).clearRewarded();
                return this;
            }

            public Builder clearTokenId() {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).clearTokenId();
                return this;
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public ByteString getBanner() {
                return ((GetTokenEventRequest) this.instance).getBanner();
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public ByteString getInterstitial() {
                return ((GetTokenEventRequest) this.instance).getInterstitial();
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public ByteString getRewarded() {
                return ((GetTokenEventRequest) this.instance).getRewarded();
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public ByteString getTokenId() {
                return ((GetTokenEventRequest) this.instance).getTokenId();
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public boolean hasBanner() {
                return ((GetTokenEventRequest) this.instance).hasBanner();
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public boolean hasInterstitial() {
                return ((GetTokenEventRequest) this.instance).hasInterstitial();
            }

            @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
            public boolean hasRewarded() {
                return ((GetTokenEventRequest) this.instance).hasRewarded();
            }

            public Builder setBanner(ByteString byteString) {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).setBanner(byteString);
                return this;
            }

            public Builder setInterstitial(ByteString byteString) {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).setInterstitial(byteString);
                return this;
            }

            public Builder setRewarded(ByteString byteString) {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).setRewarded(byteString);
                return this;
            }

            public Builder setTokenId(ByteString byteString) {
                copyOnWrite();
                ((GetTokenEventRequest) this.instance).setTokenId(byteString);
                return this;
            }

            private Builder() {
                super(GetTokenEventRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            GetTokenEventRequest getTokenEventRequest = new GetTokenEventRequest();
            DEFAULT_INSTANCE = getTokenEventRequest;
            GeneratedMessageLite.registerDefaultInstance(GetTokenEventRequest.class, getTokenEventRequest);
        }

        private GetTokenEventRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.rewarded_ = byteString;
            this.interstitial_ = byteString;
            this.banner_ = byteString;
            this.tokenId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBanner() {
            this.bitField0_ &= -5;
            this.banner_ = getDefaultInstance().getBanner();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInterstitial() {
            this.bitField0_ &= -3;
            this.interstitial_ = getDefaultInstance().getInterstitial();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRewarded() {
            this.bitField0_ &= -2;
            this.rewarded_ = getDefaultInstance().getRewarded();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTokenId() {
            this.tokenId_ = getDefaultInstance().getTokenId();
        }

        public static GetTokenEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetTokenEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTokenEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetTokenEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBanner(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.banner_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInterstitial(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.interstitial_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewarded(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1;
            this.rewarded_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTokenId(ByteString byteString) {
            byteString.getClass();
            this.tokenId_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.p pVar = null;
            switch (wl.p.f90723a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetTokenEventRequest();
                case 2:
                    return new Builder(pVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004\n", new Object[]{"bitField0_", "rewarded_", "interstitial_", "banner_", "tokenId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GetTokenEventRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (GetTokenEventRequest.class) {
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

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public ByteString getBanner() {
            return this.banner_;
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public ByteString getInterstitial() {
            return this.interstitial_;
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public ByteString getRewarded() {
            return this.rewarded_;
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public ByteString getTokenId() {
            return this.tokenId_;
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public boolean hasBanner() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public boolean hasInterstitial() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.GetTokenEventRequestOuterClass.GetTokenEventRequestOrBuilder
        public boolean hasRewarded() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(GetTokenEventRequest getTokenEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(getTokenEventRequest);
        }

        public static GetTokenEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetTokenEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetTokenEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTokenEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetTokenEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface GetTokenEventRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getBanner();

        ByteString getInterstitial();

        ByteString getRewarded();

        ByteString getTokenId();

        boolean hasBanner();

        boolean hasInterstitial();

        boolean hasRewarded();
    }

    private GetTokenEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
