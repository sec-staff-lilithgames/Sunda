package xchange;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import ix.v;
import ix.x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Xchange$RefreshDomainResponse extends GeneratedMessageLite<Xchange$RefreshDomainResponse, x> implements MessageLiteOrBuilder {
    private static final Xchange$RefreshDomainResponse DEFAULT_INSTANCE;
    private static volatile Parser<Xchange$RefreshDomainResponse> PARSER;

    static {
        Xchange$RefreshDomainResponse xchange$RefreshDomainResponse = new Xchange$RefreshDomainResponse();
        DEFAULT_INSTANCE = xchange$RefreshDomainResponse;
        GeneratedMessageLite.registerDefaultInstance(Xchange$RefreshDomainResponse.class, xchange$RefreshDomainResponse);
    }

    private Xchange$RefreshDomainResponse() {
    }

    public static Xchange$RefreshDomainResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static x newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Xchange$RefreshDomainResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$RefreshDomainResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Xchange$RefreshDomainResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (v.f68440a[methodToInvoke.ordinal()]) {
            case 1:
                return new Xchange$RefreshDomainResponse();
            case 2:
                return new x(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Xchange$RefreshDomainResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Xchange$RefreshDomainResponse.class) {
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

    public static x newBuilder(Xchange$RefreshDomainResponse xchange$RefreshDomainResponse) {
        return DEFAULT_INSTANCE.createBuilder(xchange$RefreshDomainResponse);
    }

    public static Xchange$RefreshDomainResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$RefreshDomainResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Xchange$RefreshDomainResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Xchange$RefreshDomainResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Xchange$RefreshDomainResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Xchange$RefreshDomainResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Xchange$RefreshDomainResponse parseFrom(InputStream inputStream) throws IOException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$RefreshDomainResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$RefreshDomainResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Xchange$RefreshDomainResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$RefreshDomainResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
