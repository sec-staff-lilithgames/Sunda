package pubsubBOCollector;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import ex.a;
import ex.h;
import ex.i;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MessageOuterClass$UpdateAppKeyList extends GeneratedMessageLite<MessageOuterClass$UpdateAppKeyList, h> implements i {
    public static final int APP_KEYS_FIELD_NUMBER = 1;
    private static final MessageOuterClass$UpdateAppKeyList DEFAULT_INSTANCE;
    private static volatile Parser<MessageOuterClass$UpdateAppKeyList> PARSER;
    private Internal.ProtobufList<String> appKeys_ = GeneratedMessageLite.emptyProtobufList();

    static {
        MessageOuterClass$UpdateAppKeyList messageOuterClass$UpdateAppKeyList = new MessageOuterClass$UpdateAppKeyList();
        DEFAULT_INSTANCE = messageOuterClass$UpdateAppKeyList;
        GeneratedMessageLite.registerDefaultInstance(MessageOuterClass$UpdateAppKeyList.class, messageOuterClass$UpdateAppKeyList);
    }

    private MessageOuterClass$UpdateAppKeyList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAppKeys(Iterable<String> iterable) {
        ensureAppKeysIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.appKeys_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAppKeys(String str) {
        str.getClass();
        ensureAppKeysIsMutable();
        this.appKeys_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAppKeysBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureAppKeysIsMutable();
        this.appKeys_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppKeys() {
        this.appKeys_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAppKeysIsMutable() {
        Internal.ProtobufList<String> protobufList = this.appKeys_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.appKeys_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MessageOuterClass$UpdateAppKeyList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MessageOuterClass$UpdateAppKeyList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessageOuterClass$UpdateAppKeyList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MessageOuterClass$UpdateAppKeyList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppKeys(int i10, String str) {
        str.getClass();
        ensureAppKeysIsMutable();
        this.appKeys_.set(i10, str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f55180a[methodToInvoke.ordinal()]) {
            case 1:
                return new MessageOuterClass$UpdateAppKeyList();
            case 2:
                return new h(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"appKeys_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MessageOuterClass$UpdateAppKeyList> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MessageOuterClass$UpdateAppKeyList.class) {
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

    @Override // ex.i
    public String getAppKeys(int i10) {
        return this.appKeys_.get(i10);
    }

    @Override // ex.i
    public ByteString getAppKeysBytes(int i10) {
        return ByteString.copyFromUtf8(this.appKeys_.get(i10));
    }

    @Override // ex.i
    public int getAppKeysCount() {
        return this.appKeys_.size();
    }

    @Override // ex.i
    public List<String> getAppKeysList() {
        return this.appKeys_;
    }

    public static h newBuilder(MessageOuterClass$UpdateAppKeyList messageOuterClass$UpdateAppKeyList) {
        return DEFAULT_INSTANCE.createBuilder(messageOuterClass$UpdateAppKeyList);
    }

    public static MessageOuterClass$UpdateAppKeyList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessageOuterClass$UpdateAppKeyList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MessageOuterClass$UpdateAppKeyList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MessageOuterClass$UpdateAppKeyList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MessageOuterClass$UpdateAppKeyList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessageOuterClass$UpdateAppKeyList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MessageOuterClass$UpdateAppKeyList parseFrom(InputStream inputStream) throws IOException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessageOuterClass$UpdateAppKeyList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessageOuterClass$UpdateAppKeyList parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessageOuterClass$UpdateAppKeyList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessageOuterClass$UpdateAppKeyList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
