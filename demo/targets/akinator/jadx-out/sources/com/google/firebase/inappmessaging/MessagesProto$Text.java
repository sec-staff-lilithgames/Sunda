package com.google.firebase.inappmessaging;

import bj.f1;
import bj.v1;
import bj.w1;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MessagesProto$Text extends GeneratedMessageLite<MessagesProto$Text, v1> implements w1 {
    private static final MessagesProto$Text DEFAULT_INSTANCE;
    public static final int HEX_COLOR_FIELD_NUMBER = 2;
    private static volatile Parser<MessagesProto$Text> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";
    private String hexColor_ = "";

    static {
        MessagesProto$Text messagesProto$Text = new MessagesProto$Text();
        DEFAULT_INSTANCE = messagesProto$Text;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$Text.class, messagesProto$Text);
    }

    private MessagesProto$Text() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHexColor() {
        this.hexColor_ = getDefaultInstance().getHexColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static MessagesProto$Text getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static v1 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$Text parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Text) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Text parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MessagesProto$Text> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHexColor(String str) {
        str.getClass();
        this.hexColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHexColorBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.hexColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (f1.f9631a[methodToInvoke.ordinal()]) {
            case 1:
                return new MessagesProto$Text();
            case 2:
                return new v1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "hexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MessagesProto$Text> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MessagesProto$Text.class) {
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

    @Override // bj.w1
    public String getHexColor() {
        return this.hexColor_;
    }

    @Override // bj.w1
    public ByteString getHexColorBytes() {
        return ByteString.copyFromUtf8(this.hexColor_);
    }

    @Override // bj.w1
    public String getText() {
        return this.text_;
    }

    @Override // bj.w1
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static v1 newBuilder(MessagesProto$Text messagesProto$Text) {
        return DEFAULT_INSTANCE.createBuilder(messagesProto$Text);
    }

    public static MessagesProto$Text parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Text) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$Text parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MessagesProto$Text parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessagesProto$Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MessagesProto$Text parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MessagesProto$Text parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$Text parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MessagesProto$Text parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Text parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$Text parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$Text parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
