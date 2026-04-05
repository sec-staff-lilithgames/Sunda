package metric;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import wv.a;
import wv.c;
import wv.g;
import wv.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Metric$UserMetric extends GeneratedMessageLite<Metric$UserMetric, g> implements h {
    public static final int APP_KEY_FIELD_NUMBER = 6;
    public static final int CMP_HASH_FIELD_NUMBER = 7;
    private static final Metric$UserMetric DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 4;
    public static final int IP_FIELD_NUMBER = 9;
    public static final int ORIGIN_FIELD_NUMBER = 10;
    private static volatile Parser<Metric$UserMetric> PARSER = null;
    public static final int SAVED_AT_FIELD_NUMBER = 3;
    public static final int TRUNCATED_IP_FIELD_NUMBER = 1;
    public static final int USER_AGENT_FIELD_NUMBER = 2;
    public static final int UUID_FIELD_NUMBER = 8;
    public static final int UUID_HASH_FIELD_NUMBER = 5;
    private Timestamp savedAt_;
    private String truncatedIp_ = "";
    private String userAgent_ = "";
    private Internal.ProtobufList<Metric$Event> events_ = GeneratedMessageLite.emptyProtobufList();
    private String uuidHash_ = "";
    private String appKey_ = "";
    private String cmpHash_ = "";
    private String uuid_ = "";
    private String ip_ = "";
    private String origin_ = "";

    static {
        Metric$UserMetric metric$UserMetric = new Metric$UserMetric();
        DEFAULT_INSTANCE = metric$UserMetric;
        GeneratedMessageLite.registerDefaultInstance(Metric$UserMetric.class, metric$UserMetric);
    }

    private Metric$UserMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends Metric$Event> iterable) {
        ensureEventsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(Metric$Event metric$Event) {
        metric$Event.getClass();
        ensureEventsIsMutable();
        this.events_.add(metric$Event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppKey() {
        this.appKey_ = getDefaultInstance().getAppKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmpHash() {
        this.cmpHash_ = getDefaultInstance().getCmpHash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvents() {
        this.events_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIp() {
        this.ip_ = getDefaultInstance().getIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigin() {
        this.origin_ = getDefaultInstance().getOrigin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSavedAt() {
        this.savedAt_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTruncatedIp() {
        this.truncatedIp_ = getDefaultInstance().getTruncatedIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUuid() {
        this.uuid_ = getDefaultInstance().getUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUuidHash() {
        this.uuidHash_ = getDefaultInstance().getUuidHash();
    }

    private void ensureEventsIsMutable() {
        Internal.ProtobufList<Metric$Event> protobufList = this.events_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.events_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Metric$UserMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSavedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.savedAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.savedAt_ = timestamp;
        } else {
            this.savedAt_ = Timestamp.newBuilder(this.savedAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
        }
    }

    public static g newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Metric$UserMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Metric$UserMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric$UserMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Metric$UserMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Metric$UserMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvents(int i10) {
        ensureEventsIsMutable();
        this.events_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppKey(String str) {
        str.getClass();
        this.appKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppKeyBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmpHash(String str) {
        str.getClass();
        this.cmpHash_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmpHashBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cmpHash_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(int i10, Metric$Event metric$Event) {
        metric$Event.getClass();
        ensureEventsIsMutable();
        this.events_.set(i10, metric$Event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIp(String str) {
        str.getClass();
        this.ip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ip_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigin(String str) {
        str.getClass();
        this.origin_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.origin_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSavedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.savedAt_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTruncatedIp(String str) {
        str.getClass();
        this.truncatedIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTruncatedIpBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.truncatedIp_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(String str) {
        str.getClass();
        this.userAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgentBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userAgent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuid(String str) {
        str.getClass();
        this.uuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uuid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuidHash(String str) {
        str.getClass();
        this.uuidHash_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuidHashBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uuidHash_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f91298a[methodToInvoke.ordinal()]) {
            case 1:
                return new Metric$UserMetric();
            case 2:
                return new g(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\t\u0004\u001b\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ", new Object[]{"truncatedIp_", "userAgent_", "savedAt_", "events_", Metric$Event.class, "uuidHash_", "appKey_", "cmpHash_", "uuid_", "ip_", "origin_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Metric$UserMetric> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Metric$UserMetric.class) {
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

    @Override // wv.h
    public String getAppKey() {
        return this.appKey_;
    }

    @Override // wv.h
    public ByteString getAppKeyBytes() {
        return ByteString.copyFromUtf8(this.appKey_);
    }

    @Override // wv.h
    public String getCmpHash() {
        return this.cmpHash_;
    }

    @Override // wv.h
    public ByteString getCmpHashBytes() {
        return ByteString.copyFromUtf8(this.cmpHash_);
    }

    @Override // wv.h
    public Metric$Event getEvents(int i10) {
        return this.events_.get(i10);
    }

    @Override // wv.h
    public int getEventsCount() {
        return this.events_.size();
    }

    @Override // wv.h
    public List<Metric$Event> getEventsList() {
        return this.events_;
    }

    public c getEventsOrBuilder(int i10) {
        return this.events_.get(i10);
    }

    public List<? extends c> getEventsOrBuilderList() {
        return this.events_;
    }

    @Override // wv.h
    public String getIp() {
        return this.ip_;
    }

    @Override // wv.h
    public ByteString getIpBytes() {
        return ByteString.copyFromUtf8(this.ip_);
    }

    @Override // wv.h
    public String getOrigin() {
        return this.origin_;
    }

    @Override // wv.h
    public ByteString getOriginBytes() {
        return ByteString.copyFromUtf8(this.origin_);
    }

    @Override // wv.h
    public Timestamp getSavedAt() {
        Timestamp timestamp = this.savedAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // wv.h
    public String getTruncatedIp() {
        return this.truncatedIp_;
    }

    @Override // wv.h
    public ByteString getTruncatedIpBytes() {
        return ByteString.copyFromUtf8(this.truncatedIp_);
    }

    @Override // wv.h
    public String getUserAgent() {
        return this.userAgent_;
    }

    @Override // wv.h
    public ByteString getUserAgentBytes() {
        return ByteString.copyFromUtf8(this.userAgent_);
    }

    @Override // wv.h
    public String getUuid() {
        return this.uuid_;
    }

    @Override // wv.h
    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.uuid_);
    }

    @Override // wv.h
    public String getUuidHash() {
        return this.uuidHash_;
    }

    @Override // wv.h
    public ByteString getUuidHashBytes() {
        return ByteString.copyFromUtf8(this.uuidHash_);
    }

    @Override // wv.h
    public boolean hasSavedAt() {
        return this.savedAt_ != null;
    }

    public static g newBuilder(Metric$UserMetric metric$UserMetric) {
        return DEFAULT_INSTANCE.createBuilder(metric$UserMetric);
    }

    public static Metric$UserMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric$UserMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metric$UserMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric$UserMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Metric$UserMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Metric$UserMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(int i10, Metric$Event metric$Event) {
        metric$Event.getClass();
        ensureEventsIsMutable();
        this.events_.add(i10, metric$Event);
    }

    public static Metric$UserMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric$UserMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Metric$UserMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Metric$UserMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Metric$UserMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric$UserMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Metric$UserMetric parseFrom(InputStream inputStream) throws IOException {
        return (Metric$UserMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Metric$UserMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric$UserMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Metric$UserMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Metric$UserMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Metric$UserMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric$UserMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
