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
public final class PrivacyUpdateRequestOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PrivacyUpdateRequest extends GeneratedMessageLite<PrivacyUpdateRequest, Builder> implements PrivacyUpdateRequestOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final PrivacyUpdateRequest DEFAULT_INSTANCE;
        private static volatile Parser<PrivacyUpdateRequest> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private ByteString content_ = ByteString.EMPTY;
        private int version_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<PrivacyUpdateRequest, Builder> implements PrivacyUpdateRequestOrBuilder {
            public /* synthetic */ Builder(wl.c0 c0Var) {
                this();
            }

            public Builder clearContent() {
                copyOnWrite();
                ((PrivacyUpdateRequest) this.instance).clearContent();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((PrivacyUpdateRequest) this.instance).clearVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
            public ByteString getContent() {
                return ((PrivacyUpdateRequest) this.instance).getContent();
            }

            @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
            public int getVersion() {
                return ((PrivacyUpdateRequest) this.instance).getVersion();
            }

            public Builder setContent(ByteString byteString) {
                copyOnWrite();
                ((PrivacyUpdateRequest) this.instance).setContent(byteString);
                return this;
            }

            public Builder setVersion(int i10) {
                copyOnWrite();
                ((PrivacyUpdateRequest) this.instance).setVersion(i10);
                return this;
            }

            private Builder() {
                super(PrivacyUpdateRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            PrivacyUpdateRequest privacyUpdateRequest = new PrivacyUpdateRequest();
            DEFAULT_INSTANCE = privacyUpdateRequest;
            GeneratedMessageLite.registerDefaultInstance(PrivacyUpdateRequest.class, privacyUpdateRequest);
        }

        private PrivacyUpdateRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static PrivacyUpdateRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PrivacyUpdateRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrivacyUpdateRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PrivacyUpdateRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(ByteString byteString) {
            byteString.getClass();
            this.content_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i10) {
            this.version_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.c0 c0Var = null;
            switch (wl.c0.f90701a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PrivacyUpdateRequest();
                case 2:
                    return new Builder(c0Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"version_", "content_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PrivacyUpdateRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PrivacyUpdateRequest.class) {
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

        @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
        public ByteString getContent() {
            return this.content_;
        }

        @Override // gatewayprotocol.v1.PrivacyUpdateRequestOuterClass.PrivacyUpdateRequestOrBuilder
        public int getVersion() {
            return this.version_;
        }

        public static Builder newBuilder(PrivacyUpdateRequest privacyUpdateRequest) {
            return DEFAULT_INSTANCE.createBuilder(privacyUpdateRequest);
        }

        public static PrivacyUpdateRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PrivacyUpdateRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PrivacyUpdateRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PrivacyUpdateRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PrivacyUpdateRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PrivacyUpdateRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PrivacyUpdateRequest parseFrom(InputStream inputStream) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrivacyUpdateRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PrivacyUpdateRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PrivacyUpdateRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface PrivacyUpdateRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getContent();

        int getVersion();
    }

    private PrivacyUpdateRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
