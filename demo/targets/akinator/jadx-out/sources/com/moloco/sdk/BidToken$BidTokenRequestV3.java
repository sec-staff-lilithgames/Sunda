package com.moloco.sdk;

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
/* loaded from: classes8.dex */
public final class BidToken$BidTokenRequestV3 extends GeneratedMessageLite<BidToken$BidTokenRequestV3, k5> implements MessageLiteOrBuilder {
    private static final BidToken$BidTokenRequestV3 DEFAULT_INSTANCE;
    private static volatile Parser<BidToken$BidTokenRequestV3> PARSER;

    static {
        BidToken$BidTokenRequestV3 bidToken$BidTokenRequestV3 = new BidToken$BidTokenRequestV3();
        DEFAULT_INSTANCE = bidToken$BidTokenRequestV3;
        GeneratedMessageLite.registerDefaultInstance(BidToken$BidTokenRequestV3.class, bidToken$BidTokenRequestV3);
    }

    private BidToken$BidTokenRequestV3() {
    }

    public static BidToken$BidTokenRequestV3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k5 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BidToken$BidTokenRequestV3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$BidTokenRequestV3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BidToken$BidTokenRequestV3> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (d5.f45721a[methodToInvoke.ordinal()]) {
            case 1:
                return new BidToken$BidTokenRequestV3();
            case 2:
                return new k5(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BidToken$BidTokenRequestV3> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BidToken$BidTokenRequestV3.class) {
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

    public static k5 newBuilder(BidToken$BidTokenRequestV3 bidToken$BidTokenRequestV3) {
        return DEFAULT_INSTANCE.createBuilder(bidToken$BidTokenRequestV3);
    }

    public static BidToken$BidTokenRequestV3 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV3 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV3 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BidToken$BidTokenRequestV3 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BidToken$BidTokenRequestV3 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV3 parseFrom(InputStream inputStream) throws IOException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$BidTokenRequestV3 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$BidTokenRequestV3 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BidToken$BidTokenRequestV3 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenRequestV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
