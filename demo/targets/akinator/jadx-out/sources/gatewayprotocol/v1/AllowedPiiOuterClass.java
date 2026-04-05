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
public final class AllowedPiiOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AllowedPii extends GeneratedMessageLite<AllowedPii, Builder> implements AllowedPiiOrBuilder {
        public static final int APPSET_ID_FIELD_NUMBER = 4;
        private static final AllowedPii DEFAULT_INSTANCE;
        public static final int FID_FIELD_NUMBER = 3;
        public static final int IDFA_FIELD_NUMBER = 1;
        public static final int IDFV_FIELD_NUMBER = 2;
        private static volatile Parser<AllowedPii> PARSER;
        private boolean appsetId_;
        private boolean fid_;
        private boolean idfa_;
        private boolean idfv_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<AllowedPii, Builder> implements AllowedPiiOrBuilder {
            public /* synthetic */ Builder(wl.g gVar) {
                this();
            }

            public Builder clearAppsetId() {
                copyOnWrite();
                ((AllowedPii) this.instance).clearAppsetId();
                return this;
            }

            public Builder clearFid() {
                copyOnWrite();
                ((AllowedPii) this.instance).clearFid();
                return this;
            }

            public Builder clearIdfa() {
                copyOnWrite();
                ((AllowedPii) this.instance).clearIdfa();
                return this;
            }

            public Builder clearIdfv() {
                copyOnWrite();
                ((AllowedPii) this.instance).clearIdfv();
                return this;
            }

            @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
            public boolean getAppsetId() {
                return ((AllowedPii) this.instance).getAppsetId();
            }

            @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
            public boolean getFid() {
                return ((AllowedPii) this.instance).getFid();
            }

            @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
            public boolean getIdfa() {
                return ((AllowedPii) this.instance).getIdfa();
            }

            @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
            public boolean getIdfv() {
                return ((AllowedPii) this.instance).getIdfv();
            }

            public Builder setAppsetId(boolean z10) {
                copyOnWrite();
                ((AllowedPii) this.instance).setAppsetId(z10);
                return this;
            }

            public Builder setFid(boolean z10) {
                copyOnWrite();
                ((AllowedPii) this.instance).setFid(z10);
                return this;
            }

            public Builder setIdfa(boolean z10) {
                copyOnWrite();
                ((AllowedPii) this.instance).setIdfa(z10);
                return this;
            }

            public Builder setIdfv(boolean z10) {
                copyOnWrite();
                ((AllowedPii) this.instance).setIdfv(z10);
                return this;
            }

            private Builder() {
                super(AllowedPii.DEFAULT_INSTANCE);
            }
        }

        static {
            AllowedPii allowedPii = new AllowedPii();
            DEFAULT_INSTANCE = allowedPii;
            GeneratedMessageLite.registerDefaultInstance(AllowedPii.class, allowedPii);
        }

        private AllowedPii() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppsetId() {
            this.appsetId_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFid() {
            this.fid_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfa() {
            this.idfa_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfv() {
            this.idfv_ = false;
        }

        public static AllowedPii getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AllowedPii parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AllowedPii parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AllowedPii> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppsetId(boolean z10) {
            this.appsetId_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFid(boolean z10) {
            this.fid_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfa(boolean z10) {
            this.idfa_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfv(boolean z10) {
            this.idfv_ = z10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.g gVar = null;
            switch (wl.g.f90708a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AllowedPii();
                case 2:
                    return new Builder(gVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"idfa_", "idfv_", "fid_", "appsetId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AllowedPii> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AllowedPii.class) {
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

        @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
        public boolean getAppsetId() {
            return this.appsetId_;
        }

        @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
        public boolean getFid() {
            return this.fid_;
        }

        @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
        public boolean getIdfa() {
            return this.idfa_;
        }

        @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
        public boolean getIdfv() {
            return this.idfv_;
        }

        public static Builder newBuilder(AllowedPii allowedPii) {
            return DEFAULT_INSTANCE.createBuilder(allowedPii);
        }

        public static AllowedPii parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AllowedPii parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AllowedPii parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(InputStream inputStream) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AllowedPii parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AllowedPii parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AllowedPiiOrBuilder extends MessageLiteOrBuilder {
        boolean getAppsetId();

        boolean getFid();

        boolean getIdfa();

        boolean getIdfv();
    }

    private AllowedPiiOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
