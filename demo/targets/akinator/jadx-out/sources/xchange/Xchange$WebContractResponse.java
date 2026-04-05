package xchange;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import ix.d0;
import ix.e0;
import ix.t;
import ix.v;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Xchange$WebContractResponse extends GeneratedMessageLite<Xchange$WebContractResponse, d0> implements e0 {
    private static final Xchange$WebContractResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 1;
    private static volatile Parser<Xchange$WebContractResponse> PARSER;
    private Error$ErrorResponse error_;

    static {
        Xchange$WebContractResponse xchange$WebContractResponse = new Xchange$WebContractResponse();
        DEFAULT_INSTANCE = xchange$WebContractResponse;
        GeneratedMessageLite.registerDefaultInstance(Xchange$WebContractResponse.class, xchange$WebContractResponse);
    }

    private Xchange$WebContractResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = null;
    }

    public static Xchange$WebContractResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeError(Error$ErrorResponse error$ErrorResponse) {
        error$ErrorResponse.getClass();
        Error$ErrorResponse error$ErrorResponse2 = this.error_;
        if (error$ErrorResponse2 == null || error$ErrorResponse2 == Error$ErrorResponse.getDefaultInstance()) {
            this.error_ = error$ErrorResponse;
        } else {
            this.error_ = (Error$ErrorResponse) ((t) Error$ErrorResponse.newBuilder(this.error_).mergeFrom((t) error$ErrorResponse)).buildPartial();
        }
    }

    public static d0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Xchange$WebContractResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$WebContractResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Xchange$WebContractResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(Error$ErrorResponse error$ErrorResponse) {
        error$ErrorResponse.getClass();
        this.error_ = error$ErrorResponse;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (v.f68440a[methodToInvoke.ordinal()]) {
            case 1:
                return new Xchange$WebContractResponse();
            case 2:
                return new d0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"error_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Xchange$WebContractResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Xchange$WebContractResponse.class) {
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

    @Override // ix.e0
    public Error$ErrorResponse getError() {
        Error$ErrorResponse error$ErrorResponse = this.error_;
        return error$ErrorResponse == null ? Error$ErrorResponse.getDefaultInstance() : error$ErrorResponse;
    }

    @Override // ix.e0
    public boolean hasError() {
        return this.error_ != null;
    }

    public static d0 newBuilder(Xchange$WebContractResponse xchange$WebContractResponse) {
        return DEFAULT_INSTANCE.createBuilder(xchange$WebContractResponse);
    }

    public static Xchange$WebContractResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$WebContractResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Xchange$WebContractResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Xchange$WebContractResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Xchange$WebContractResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Xchange$WebContractResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Xchange$WebContractResponse parseFrom(InputStream inputStream) throws IOException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$WebContractResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$WebContractResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Xchange$WebContractResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$WebContractResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
