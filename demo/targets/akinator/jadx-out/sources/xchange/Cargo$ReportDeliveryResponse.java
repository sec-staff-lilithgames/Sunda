package xchange;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import ix.a;
import ix.h;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Cargo$ReportDeliveryResponse extends GeneratedMessageLite<Cargo$ReportDeliveryResponse, h> implements MessageLiteOrBuilder {
    private static final Cargo$ReportDeliveryResponse DEFAULT_INSTANCE;
    private static volatile Parser<Cargo$ReportDeliveryResponse> PARSER;

    static {
        Cargo$ReportDeliveryResponse cargo$ReportDeliveryResponse = new Cargo$ReportDeliveryResponse();
        DEFAULT_INSTANCE = cargo$ReportDeliveryResponse;
        GeneratedMessageLite.registerDefaultInstance(Cargo$ReportDeliveryResponse.class, cargo$ReportDeliveryResponse);
    }

    private Cargo$ReportDeliveryResponse() {
    }

    public static Cargo$ReportDeliveryResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Cargo$ReportDeliveryResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cargo$ReportDeliveryResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Cargo$ReportDeliveryResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f68431a[methodToInvoke.ordinal()]) {
            case 1:
                return new Cargo$ReportDeliveryResponse();
            case 2:
                return new h(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Cargo$ReportDeliveryResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Cargo$ReportDeliveryResponse.class) {
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

    public static h newBuilder(Cargo$ReportDeliveryResponse cargo$ReportDeliveryResponse) {
        return DEFAULT_INSTANCE.createBuilder(cargo$ReportDeliveryResponse);
    }

    public static Cargo$ReportDeliveryResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cargo$ReportDeliveryResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Cargo$ReportDeliveryResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Cargo$ReportDeliveryResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Cargo$ReportDeliveryResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cargo$ReportDeliveryResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Cargo$ReportDeliveryResponse parseFrom(InputStream inputStream) throws IOException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cargo$ReportDeliveryResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cargo$ReportDeliveryResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Cargo$ReportDeliveryResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$ReportDeliveryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
