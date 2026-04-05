package xchange;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import ix.v;
import ix.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Xchange$RefreshDomainRequest extends GeneratedMessageLite<Xchange$RefreshDomainRequest, w> implements MessageLiteOrBuilder {
    private static final Xchange$RefreshDomainRequest DEFAULT_INSTANCE;
    private static volatile Parser<Xchange$RefreshDomainRequest> PARSER;

    static {
        Xchange$RefreshDomainRequest xchange$RefreshDomainRequest = new Xchange$RefreshDomainRequest();
        DEFAULT_INSTANCE = xchange$RefreshDomainRequest;
        GeneratedMessageLite.registerDefaultInstance(Xchange$RefreshDomainRequest.class, xchange$RefreshDomainRequest);
    }

    private Xchange$RefreshDomainRequest() {
    }

    public static Xchange$RefreshDomainRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static w newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Xchange$RefreshDomainRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$RefreshDomainRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Xchange$RefreshDomainRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (v.f68440a[methodToInvoke.ordinal()]) {
            case 1:
                return new Xchange$RefreshDomainRequest();
            case 2:
                return new w(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Xchange$RefreshDomainRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Xchange$RefreshDomainRequest.class) {
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

    public static w newBuilder(Xchange$RefreshDomainRequest xchange$RefreshDomainRequest) {
        return DEFAULT_INSTANCE.createBuilder(xchange$RefreshDomainRequest);
    }

    public static Xchange$RefreshDomainRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$RefreshDomainRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Xchange$RefreshDomainRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Xchange$RefreshDomainRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Xchange$RefreshDomainRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Xchange$RefreshDomainRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Xchange$RefreshDomainRequest parseFrom(InputStream inputStream) throws IOException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$RefreshDomainRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$RefreshDomainRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Xchange$RefreshDomainRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$RefreshDomainRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
