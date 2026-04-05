package xchange;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import ix.a;
import ix.b;
import ix.c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Cargo$CargoFieldCounter extends GeneratedMessageLite<Cargo$CargoFieldCounter, b> implements c {
    public static final int CARDINALITY_FIELD_NUMBER = 5;
    private static final Cargo$CargoFieldCounter DEFAULT_INSTANCE;
    public static final int EMPTY_FIELD_NUMBER = 3;
    public static final int FILLED_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Cargo$CargoFieldCounter> PARSER = null;
    public static final int TOTAL_FIELD_NUMBER = 2;
    private long cardinality_;
    private long empty_;
    private long filled_;
    private String name_ = "";
    private long total_;

    static {
        Cargo$CargoFieldCounter cargo$CargoFieldCounter = new Cargo$CargoFieldCounter();
        DEFAULT_INSTANCE = cargo$CargoFieldCounter;
        GeneratedMessageLite.registerDefaultInstance(Cargo$CargoFieldCounter.class, cargo$CargoFieldCounter);
    }

    private Cargo$CargoFieldCounter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardinality() {
        this.cardinality_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmpty() {
        this.empty_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilled() {
        this.filled_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotal() {
        this.total_ = 0L;
    }

    public static Cargo$CargoFieldCounter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Cargo$CargoFieldCounter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cargo$CargoFieldCounter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Cargo$CargoFieldCounter> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinality(long j10) {
        this.cardinality_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmpty(long j10) {
        this.empty_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilled(long j10) {
        this.filled_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotal(long j10) {
        this.total_ = j10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f68431a[methodToInvoke.ordinal()]) {
            case 1:
                return new Cargo$CargoFieldCounter();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003\u0003\u0004\u0003\u0005\u0003", new Object[]{"name_", "total_", "empty_", "filled_", "cardinality_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Cargo$CargoFieldCounter> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Cargo$CargoFieldCounter.class) {
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

    @Override // ix.c
    public long getCardinality() {
        return this.cardinality_;
    }

    @Override // ix.c
    public long getEmpty() {
        return this.empty_;
    }

    @Override // ix.c
    public long getFilled() {
        return this.filled_;
    }

    @Override // ix.c
    public String getName() {
        return this.name_;
    }

    @Override // ix.c
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // ix.c
    public long getTotal() {
        return this.total_;
    }

    public static b newBuilder(Cargo$CargoFieldCounter cargo$CargoFieldCounter) {
        return DEFAULT_INSTANCE.createBuilder(cargo$CargoFieldCounter);
    }

    public static Cargo$CargoFieldCounter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cargo$CargoFieldCounter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Cargo$CargoFieldCounter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Cargo$CargoFieldCounter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Cargo$CargoFieldCounter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cargo$CargoFieldCounter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Cargo$CargoFieldCounter parseFrom(InputStream inputStream) throws IOException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cargo$CargoFieldCounter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Cargo$CargoFieldCounter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Cargo$CargoFieldCounter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cargo$CargoFieldCounter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
