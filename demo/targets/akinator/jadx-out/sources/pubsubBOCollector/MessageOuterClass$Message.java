package pubsubBOCollector;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import ex.a;
import ex.b;
import ex.e;
import ex.f;
import ex.g;
import ex.h;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MessageOuterClass$Message extends GeneratedMessageLite<MessageOuterClass$Message, b> implements g {
    private static final MessageOuterClass$Message DEFAULT_INSTANCE;
    private static volatile Parser<MessageOuterClass$Message> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int UPDATEAPPKEYLIST_FIELD_NUMBER = 2;
    private int payloadCase_ = 0;
    private Object payload_;
    private int type_;

    static {
        MessageOuterClass$Message messageOuterClass$Message = new MessageOuterClass$Message();
        DEFAULT_INSTANCE = messageOuterClass$Message;
        GeneratedMessageLite.registerDefaultInstance(MessageOuterClass$Message.class, messageOuterClass$Message);
    }

    private MessageOuterClass$Message() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payloadCase_ = 0;
        this.payload_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateAppKeyList() {
        if (this.payloadCase_ == 2) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    public static MessageOuterClass$Message getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateAppKeyList(MessageOuterClass$UpdateAppKeyList messageOuterClass$UpdateAppKeyList) {
        messageOuterClass$UpdateAppKeyList.getClass();
        if (this.payloadCase_ != 2 || this.payload_ == MessageOuterClass$UpdateAppKeyList.getDefaultInstance()) {
            this.payload_ = messageOuterClass$UpdateAppKeyList;
        } else {
            this.payload_ = ((h) MessageOuterClass$UpdateAppKeyList.newBuilder((MessageOuterClass$UpdateAppKeyList) this.payload_).mergeFrom((h) messageOuterClass$UpdateAppKeyList)).buildPartial();
        }
        this.payloadCase_ = 2;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MessageOuterClass$Message parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessageOuterClass$Message parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MessageOuterClass$Message> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(e eVar) {
        this.type_ = eVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateAppKeyList(MessageOuterClass$UpdateAppKeyList messageOuterClass$UpdateAppKeyList) {
        messageOuterClass$UpdateAppKeyList.getClass();
        this.payload_ = messageOuterClass$UpdateAppKeyList;
        this.payloadCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f55180a[methodToInvoke.ordinal()]) {
            case 1:
                return new MessageOuterClass$Message();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"payload_", "payloadCase_", "type_", MessageOuterClass$UpdateAppKeyList.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MessageOuterClass$Message> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MessageOuterClass$Message.class) {
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

    @Override // ex.g
    public f getPayloadCase() {
        return f.forNumber(this.payloadCase_);
    }

    @Override // ex.g
    public e getType() {
        e eVarForNumber = e.forNumber(this.type_);
        return eVarForNumber == null ? e.UNRECOGNIZED : eVarForNumber;
    }

    @Override // ex.g
    public int getTypeValue() {
        return this.type_;
    }

    @Override // ex.g
    public MessageOuterClass$UpdateAppKeyList getUpdateAppKeyList() {
        return this.payloadCase_ == 2 ? (MessageOuterClass$UpdateAppKeyList) this.payload_ : MessageOuterClass$UpdateAppKeyList.getDefaultInstance();
    }

    @Override // ex.g
    public boolean hasUpdateAppKeyList() {
        return this.payloadCase_ == 2;
    }

    public static b newBuilder(MessageOuterClass$Message messageOuterClass$Message) {
        return DEFAULT_INSTANCE.createBuilder(messageOuterClass$Message);
    }

    public static MessageOuterClass$Message parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessageOuterClass$Message parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MessageOuterClass$Message parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MessageOuterClass$Message parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MessageOuterClass$Message parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessageOuterClass$Message parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MessageOuterClass$Message parseFrom(InputStream inputStream) throws IOException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessageOuterClass$Message parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessageOuterClass$Message parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessageOuterClass$Message parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessageOuterClass$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
