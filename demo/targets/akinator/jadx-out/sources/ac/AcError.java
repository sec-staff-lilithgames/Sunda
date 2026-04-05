package ac;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class AcError {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ac.AcError$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum ErrorCode implements Internal.EnumLite {
        UNKNOWN(0),
        UNRECOGNIZED(-1);

        public static final int UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<ErrorCode> internalValueMap = new Internal.EnumLiteMap<ErrorCode>() { // from class: ac.AcError.ErrorCode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ErrorCode findValueByNumber(int i10) {
                return ErrorCode.forNumber(i10);
            }
        };
        private final int value;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ErrorCodeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ErrorCodeVerifier();

            private ErrorCodeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i10) {
                return ErrorCode.forNumber(i10) != null;
            }
        }

        ErrorCode(int i10) {
            this.value = i10;
        }

        public static ErrorCode forNumber(int i10) {
            if (i10 != 0) {
                return null;
            }
            return UNKNOWN;
        }

        public static Internal.EnumLiteMap<ErrorCode> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ErrorCodeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ErrorCode valueOf(int i10) {
            return forNumber(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ErrorResponse extends GeneratedMessageLite<ErrorResponse, Builder> implements ErrorResponseOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final ErrorResponse DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static volatile Parser<ErrorResponse> PARSER;
        private int code_;
        private String description_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ErrorResponse, Builder> implements ErrorResponseOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCode() {
                copyOnWrite();
                ((ErrorResponse) this.instance).clearCode();
                return this;
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((ErrorResponse) this.instance).clearDescription();
                return this;
            }

            @Override // ac.AcError.ErrorResponseOrBuilder
            public ErrorCode getCode() {
                return ((ErrorResponse) this.instance).getCode();
            }

            @Override // ac.AcError.ErrorResponseOrBuilder
            public int getCodeValue() {
                return ((ErrorResponse) this.instance).getCodeValue();
            }

            @Override // ac.AcError.ErrorResponseOrBuilder
            public String getDescription() {
                return ((ErrorResponse) this.instance).getDescription();
            }

            @Override // ac.AcError.ErrorResponseOrBuilder
            public ByteString getDescriptionBytes() {
                return ((ErrorResponse) this.instance).getDescriptionBytes();
            }

            public Builder setCode(ErrorCode errorCode) {
                copyOnWrite();
                ((ErrorResponse) this.instance).setCode(errorCode);
                return this;
            }

            public Builder setCodeValue(int i10) {
                copyOnWrite();
                ((ErrorResponse) this.instance).setCodeValue(i10);
                return this;
            }

            public Builder setDescription(String str) {
                copyOnWrite();
                ((ErrorResponse) this.instance).setDescription(str);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ErrorResponse) this.instance).setDescriptionBytes(byteString);
                return this;
            }

            private Builder() {
                super(ErrorResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            ErrorResponse errorResponse = new ErrorResponse();
            DEFAULT_INSTANCE = errorResponse;
            GeneratedMessageLite.registerDefaultInstance(ErrorResponse.class, errorResponse);
        }

        private ErrorResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        public static ErrorResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ErrorResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ErrorResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ErrorResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ErrorResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(ErrorCode errorCode) {
            this.code_ = errorCode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeValue(int i10) {
            this.code_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.description_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ErrorResponse();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"code_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ErrorResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ErrorResponse.class) {
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

        @Override // ac.AcError.ErrorResponseOrBuilder
        public ErrorCode getCode() {
            ErrorCode errorCodeForNumber = ErrorCode.forNumber(this.code_);
            return errorCodeForNumber == null ? ErrorCode.UNRECOGNIZED : errorCodeForNumber;
        }

        @Override // ac.AcError.ErrorResponseOrBuilder
        public int getCodeValue() {
            return this.code_;
        }

        @Override // ac.AcError.ErrorResponseOrBuilder
        public String getDescription() {
            return this.description_;
        }

        @Override // ac.AcError.ErrorResponseOrBuilder
        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.description_);
        }

        public static Builder newBuilder(ErrorResponse errorResponse) {
            return DEFAULT_INSTANCE.createBuilder(errorResponse);
        }

        public static ErrorResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ErrorResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ErrorResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ErrorResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(InputStream inputStream) throws IOException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ErrorResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ErrorResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ErrorResponseOrBuilder extends MessageLiteOrBuilder {
        ErrorCode getCode();

        int getCodeValue();

        String getDescription();

        ByteString getDescriptionBytes();
    }

    private AcError() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
