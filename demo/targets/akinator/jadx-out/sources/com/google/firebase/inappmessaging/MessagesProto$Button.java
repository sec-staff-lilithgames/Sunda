package com.google.firebase.inappmessaging;

import bj.f1;
import bj.k1;
import bj.l1;
import bj.v1;
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
public final class MessagesProto$Button extends GeneratedMessageLite<MessagesProto$Button, k1> implements l1 {
    public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
    private static final MessagesProto$Button DEFAULT_INSTANCE;
    private static volatile Parser<MessagesProto$Button> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String buttonHexColor_ = "";
    private MessagesProto$Text text_;

    static {
        MessagesProto$Button messagesProto$Button = new MessagesProto$Button();
        DEFAULT_INSTANCE = messagesProto$Button;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$Button.class, messagesProto$Button);
    }

    private MessagesProto$Button() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonHexColor() {
        this.buttonHexColor_ = getDefaultInstance().getButtonHexColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = null;
        this.bitField0_ &= -2;
    }

    public static MessagesProto$Button getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeText(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        MessagesProto$Text messagesProto$Text2 = this.text_;
        if (messagesProto$Text2 == null || messagesProto$Text2 == MessagesProto$Text.getDefaultInstance()) {
            this.text_ = messagesProto$Text;
        } else {
            this.text_ = (MessagesProto$Text) ((v1) MessagesProto$Text.newBuilder(this.text_).mergeFrom((v1) messagesProto$Text)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static k1 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$Button parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Button parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MessagesProto$Button> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonHexColor(String str) {
        str.getClass();
        this.buttonHexColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonHexColorBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buttonHexColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        this.text_ = messagesProto$Text;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (f1.f9631a[methodToInvoke.ordinal()]) {
            case 1:
                return new MessagesProto$Button();
            case 2:
                return new k1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "text_", "buttonHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MessagesProto$Button> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MessagesProto$Button.class) {
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

    @Override // bj.l1
    public String getButtonHexColor() {
        return this.buttonHexColor_;
    }

    @Override // bj.l1
    public ByteString getButtonHexColorBytes() {
        return ByteString.copyFromUtf8(this.buttonHexColor_);
    }

    @Override // bj.l1
    public MessagesProto$Text getText() {
        MessagesProto$Text messagesProto$Text = this.text_;
        return messagesProto$Text == null ? MessagesProto$Text.getDefaultInstance() : messagesProto$Text;
    }

    @Override // bj.l1
    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public static k1 newBuilder(MessagesProto$Button messagesProto$Button) {
        return DEFAULT_INSTANCE.createBuilder(messagesProto$Button);
    }

    public static MessagesProto$Button parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$Button parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MessagesProto$Button parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MessagesProto$Button parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MessagesProto$Button parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$Button parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MessagesProto$Button parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Button parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$Button parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$Button parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
