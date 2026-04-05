package xchange;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import ix.p;
import ix.s;
import ix.t;
import ix.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Error$ErrorResponse extends GeneratedMessageLite<Error$ErrorResponse, t> implements u {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Error$ErrorResponse DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser<Error$ErrorResponse> PARSER;
    private int code_;
    private String description_ = "";

    static {
        Error$ErrorResponse error$ErrorResponse = new Error$ErrorResponse();
        DEFAULT_INSTANCE = error$ErrorResponse;
        GeneratedMessageLite.registerDefaultInstance(Error$ErrorResponse.class, error$ErrorResponse);
    }

    private Error$ErrorResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    public static Error$ErrorResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static t newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Error$ErrorResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Error$ErrorResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Error$ErrorResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(s sVar) {
        this.code_ = sVar.getNumber();
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
        switch (p.f68433a[methodToInvoke.ordinal()]) {
            case 1:
                return new Error$ErrorResponse();
            case 2:
                return new t(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"code_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Error$ErrorResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Error$ErrorResponse.class) {
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

    @Override // ix.u
    public s getCode() {
        s sVarForNumber = s.forNumber(this.code_);
        return sVarForNumber == null ? s.UNRECOGNIZED : sVarForNumber;
    }

    @Override // ix.u
    public int getCodeValue() {
        return this.code_;
    }

    @Override // ix.u
    public String getDescription() {
        return this.description_;
    }

    @Override // ix.u
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public static t newBuilder(Error$ErrorResponse error$ErrorResponse) {
        return DEFAULT_INSTANCE.createBuilder(error$ErrorResponse);
    }

    public static Error$ErrorResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Error$ErrorResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Error$ErrorResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Error$ErrorResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Error$ErrorResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Error$ErrorResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Error$ErrorResponse parseFrom(InputStream inputStream) throws IOException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Error$ErrorResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Error$ErrorResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Error$ErrorResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Error$ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
