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
import wv.d;
import wv.e;
import wv.f;
import wv.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Metric$MetricMessage extends GeneratedMessageLite<Metric$MetricMessage, d> implements f {
    public static final int CREATED_AT_FIELD_NUMBER = 2;
    private static final Metric$MetricMessage DEFAULT_INSTANCE;
    public static final int EMITTER_FIELD_NUMBER = 1;
    private static volatile Parser<Metric$MetricMessage> PARSER = null;
    public static final int USER_METRIC_FIELD_NUMBER = 3;
    private Object content_;
    private Timestamp createdAt_;
    private int contentCase_ = 0;
    private String emitter_ = "";

    static {
        Metric$MetricMessage metric$MetricMessage = new Metric$MetricMessage();
        DEFAULT_INSTANCE = metric$MetricMessage;
        GeneratedMessageLite.registerDefaultInstance(Metric$MetricMessage.class, metric$MetricMessage);
    }

    private Metric$MetricMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.contentCase_ = 0;
        this.content_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedAt() {
        this.createdAt_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmitter() {
        this.emitter_ = getDefaultInstance().getEmitter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserMetric() {
        if (this.contentCase_ == 3) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    public static Metric$MetricMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.createdAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.createdAt_ = timestamp;
        } else {
            this.createdAt_ = Timestamp.newBuilder(this.createdAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserMetric(Metric$UserMetric metric$UserMetric) {
        metric$UserMetric.getClass();
        if (this.contentCase_ != 3 || this.content_ == Metric$UserMetric.getDefaultInstance()) {
            this.content_ = metric$UserMetric;
        } else {
            this.content_ = ((g) Metric$UserMetric.newBuilder((Metric$UserMetric) this.content_).mergeFrom((g) metric$UserMetric)).buildPartial();
        }
        this.contentCase_ = 3;
    }

    public static d newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Metric$MetricMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric$MetricMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Metric$MetricMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.createdAt_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmitter(String str) {
        str.getClass();
        this.emitter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmitterBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.emitter_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserMetric(Metric$UserMetric metric$UserMetric) {
        metric$UserMetric.getClass();
        this.content_ = metric$UserMetric;
        this.contentCase_ = 3;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f91298a[methodToInvoke.ordinal()]) {
            case 1:
                return new Metric$MetricMessage();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003<\u0000", new Object[]{"content_", "contentCase_", "emitter_", "createdAt_", Metric$UserMetric.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Metric$MetricMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Metric$MetricMessage.class) {
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

    @Override // wv.f
    public e getContentCase() {
        return e.forNumber(this.contentCase_);
    }

    @Override // wv.f
    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // wv.f
    public String getEmitter() {
        return this.emitter_;
    }

    @Override // wv.f
    public ByteString getEmitterBytes() {
        return ByteString.copyFromUtf8(this.emitter_);
    }

    @Override // wv.f
    public Metric$UserMetric getUserMetric() {
        return this.contentCase_ == 3 ? (Metric$UserMetric) this.content_ : Metric$UserMetric.getDefaultInstance();
    }

    @Override // wv.f
    public boolean hasCreatedAt() {
        return this.createdAt_ != null;
    }

    @Override // wv.f
    public boolean hasUserMetric() {
        return this.contentCase_ == 3;
    }

    public static d newBuilder(Metric$MetricMessage metric$MetricMessage) {
        return DEFAULT_INSTANCE.createBuilder(metric$MetricMessage);
    }

    public static Metric$MetricMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metric$MetricMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Metric$MetricMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Metric$MetricMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Metric$MetricMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Metric$MetricMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Metric$MetricMessage parseFrom(InputStream inputStream) throws IOException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric$MetricMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metric$MetricMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Metric$MetricMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric$MetricMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
