package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
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
public final class ErrorOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Error extends GeneratedMessageLite<Error, Builder> implements ErrorOrBuilder {
        private static final Error DEFAULT_INSTANCE;
        public static final int ERROR_TEXT_FIELD_NUMBER = 2;
        private static volatile Parser<Error> PARSER;
        private String errorText_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<Error, Builder> implements ErrorOrBuilder {
            public /* synthetic */ Builder(wl.o oVar) {
                this();
            }

            public Builder clearErrorText() {
                copyOnWrite();
                ((Error) this.instance).clearErrorText();
                return this;
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public String getErrorText() {
                return ((Error) this.instance).getErrorText();
            }

            @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
            public ByteString getErrorTextBytes() {
                return ((Error) this.instance).getErrorTextBytes();
            }

            public Builder setErrorText(String str) {
                copyOnWrite();
                ((Error) this.instance).setErrorText(str);
                return this;
            }

            public Builder setErrorTextBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Error) this.instance).setErrorTextBytes(byteString);
                return this;
            }

            private Builder() {
                super(Error.DEFAULT_INSTANCE);
            }
        }

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            GeneratedMessageLite.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrorText() {
            this.errorText_ = getDefaultInstance().getErrorText();
        }

        public static Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Error> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorText(String str) {
            str.getClass();
            this.errorText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorTextBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorText_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.o oVar = null;
            switch (wl.o.f90722a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Error();
                case 2:
                    return new Builder(oVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"errorText_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Error> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Error.class) {
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

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public String getErrorText() {
            return this.errorText_;
        }

        @Override // gatewayprotocol.v1.ErrorOuterClass.ErrorOrBuilder
        public ByteString getErrorTextBytes() {
            return ByteString.copyFromUtf8(this.errorText_);
        }

        public static Builder newBuilder(Error error) {
            return DEFAULT_INSTANCE.createBuilder(error);
        }

        public static Error parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Error parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Error parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Error parseFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Error parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ErrorOrBuilder extends MessageLiteOrBuilder {
        String getErrorText();

        ByteString getErrorTextBytes();
    }

    private ErrorOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
