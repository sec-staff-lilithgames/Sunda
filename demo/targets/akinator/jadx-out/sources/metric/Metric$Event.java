package metric;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import wv.a;
import wv.b;
import wv.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Metric$Event extends GeneratedMessageLite<Metric$Event, b> implements c {
    private static final Metric$Event DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Metric$Event> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private String name_ = "";
    private Timestamp timestamp_;

    static {
        Metric$Event metric$Event = new Metric$Event();
        DEFAULT_INSTANCE = metric$Event;
        GeneratedMessageLite.registerDefaultInstance(Metric$Event.class, metric$Event);
    }

    private Metric$Event() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = null;
    }

    public static Metric$Event getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.timestamp_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.timestamp_ = timestamp;
        } else {
            this.timestamp_ = Timestamp.newBuilder(this.timestamp_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
        }
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Metric$Event parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Metric$Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric$Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Metric$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Metric$Event> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.timestamp_ = timestamp;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f91298a[methodToInvoke.ordinal()]) {
            case 1:
                return new Metric$Event();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "timestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Metric$Event> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Metric$Event.class) {
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

    @Override // wv.c
    public String getName() {
        return this.name_;
    }

    @Override // wv.c
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // wv.c
    public Timestamp getTimestamp() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // wv.c
    public boolean hasTimestamp() {
        return this.timestamp_ != null;
    }

    public static b newBuilder(Metric$Event metric$Event) {
        return DEFAULT_INSTANCE.createBuilder(metric$Event);
    }

    public static Metric$Event parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric$Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metric$Event parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Metric$Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Metric$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Metric$Event parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Metric$Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Metric$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Metric$Event parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Metric$Event parseFrom(InputStream inputStream) throws IOException {
        return (Metric$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric$Event parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metric$Event parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Metric$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Metric$Event parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
