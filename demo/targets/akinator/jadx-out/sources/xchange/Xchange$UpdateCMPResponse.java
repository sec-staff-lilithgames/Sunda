package xchange;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import ix.a0;
import ix.v;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Xchange$UpdateCMPResponse extends GeneratedMessageLite<Xchange$UpdateCMPResponse, a0> implements MessageLiteOrBuilder {
    private static final Xchange$UpdateCMPResponse DEFAULT_INSTANCE;
    private static volatile Parser<Xchange$UpdateCMPResponse> PARSER;

    static {
        Xchange$UpdateCMPResponse xchange$UpdateCMPResponse = new Xchange$UpdateCMPResponse();
        DEFAULT_INSTANCE = xchange$UpdateCMPResponse;
        GeneratedMessageLite.registerDefaultInstance(Xchange$UpdateCMPResponse.class, xchange$UpdateCMPResponse);
    }

    private Xchange$UpdateCMPResponse() {
    }

    public static Xchange$UpdateCMPResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Xchange$UpdateCMPResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$UpdateCMPResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Xchange$UpdateCMPResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (v.f68440a[methodToInvoke.ordinal()]) {
            case 1:
                return new Xchange$UpdateCMPResponse();
            case 2:
                return new a0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Xchange$UpdateCMPResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Xchange$UpdateCMPResponse.class) {
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

    public static a0 newBuilder(Xchange$UpdateCMPResponse xchange$UpdateCMPResponse) {
        return DEFAULT_INSTANCE.createBuilder(xchange$UpdateCMPResponse);
    }

    public static Xchange$UpdateCMPResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$UpdateCMPResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Xchange$UpdateCMPResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Xchange$UpdateCMPResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Xchange$UpdateCMPResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Xchange$UpdateCMPResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Xchange$UpdateCMPResponse parseFrom(InputStream inputStream) throws IOException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Xchange$UpdateCMPResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Xchange$UpdateCMPResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Xchange$UpdateCMPResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Xchange$UpdateCMPResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
