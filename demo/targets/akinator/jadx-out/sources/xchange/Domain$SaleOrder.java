package xchange;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import ix.i;
import ix.n;
import ix.o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Domain$SaleOrder extends GeneratedMessageLite<Domain$SaleOrder, n> implements o {
    private static final Domain$SaleOrder DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Domain$SaleOrder> PARSER;
    private String id_ = "";

    static {
        Domain$SaleOrder domain$SaleOrder = new Domain$SaleOrder();
        DEFAULT_INSTANCE = domain$SaleOrder;
        GeneratedMessageLite.registerDefaultInstance(Domain$SaleOrder.class, domain$SaleOrder);
    }

    private Domain$SaleOrder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    public static Domain$SaleOrder getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Domain$SaleOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Domain$SaleOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Domain$SaleOrder> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (i.f68432a[methodToInvoke.ordinal()]) {
            case 1:
                return new Domain$SaleOrder();
            case 2:
                return new n(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Domain$SaleOrder> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Domain$SaleOrder.class) {
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

    @Override // ix.o
    public String getId() {
        return this.id_;
    }

    @Override // ix.o
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public static n newBuilder(Domain$SaleOrder domain$SaleOrder) {
        return DEFAULT_INSTANCE.createBuilder(domain$SaleOrder);
    }

    public static Domain$SaleOrder parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Domain$SaleOrder parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Domain$SaleOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Domain$SaleOrder parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Domain$SaleOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Domain$SaleOrder parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Domain$SaleOrder parseFrom(InputStream inputStream) throws IOException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Domain$SaleOrder parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Domain$SaleOrder parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Domain$SaleOrder parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Domain$SaleOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
