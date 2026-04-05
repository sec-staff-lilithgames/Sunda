package com.google.firebase.inappmessaging;

import bj.f1;
import bj.g1;
import bj.k1;
import bj.t1;
import bj.u1;
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
public final class MessagesProto$ModalMessage extends GeneratedMessageLite<MessagesProto$ModalMessage, t1> implements u1 {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final MessagesProto$ModalMessage DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile Parser<MessagesProto$ModalMessage> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private MessagesProto$Button actionButton_;
    private MessagesProto$Action action_;
    private int bitField0_;
    private MessagesProto$Text body_;
    private MessagesProto$Text title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        MessagesProto$ModalMessage messagesProto$ModalMessage = new MessagesProto$ModalMessage();
        DEFAULT_INSTANCE = messagesProto$ModalMessage;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$ModalMessage.class, messagesProto$ModalMessage);
    }

    private MessagesProto$ModalMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionButton() {
        this.actionButton_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundHexColor() {
        this.backgroundHexColor_ = getDefaultInstance().getBackgroundHexColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    public static MessagesProto$ModalMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        MessagesProto$Action messagesProto$Action2 = this.action_;
        if (messagesProto$Action2 == null || messagesProto$Action2 == MessagesProto$Action.getDefaultInstance()) {
            this.action_ = messagesProto$Action;
        } else {
            this.action_ = (MessagesProto$Action) ((g1) MessagesProto$Action.newBuilder(this.action_).mergeFrom((g1) messagesProto$Action)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        MessagesProto$Button messagesProto$Button2 = this.actionButton_;
        if (messagesProto$Button2 == null || messagesProto$Button2 == MessagesProto$Button.getDefaultInstance()) {
            this.actionButton_ = messagesProto$Button;
        } else {
            this.actionButton_ = (MessagesProto$Button) ((k1) MessagesProto$Button.newBuilder(this.actionButton_).mergeFrom((k1) messagesProto$Button)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBody(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        MessagesProto$Text messagesProto$Text2 = this.body_;
        if (messagesProto$Text2 == null || messagesProto$Text2 == MessagesProto$Text.getDefaultInstance()) {
            this.body_ = messagesProto$Text;
        } else {
            this.body_ = (MessagesProto$Text) ((v1) MessagesProto$Text.newBuilder(this.body_).mergeFrom((v1) messagesProto$Text)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTitle(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        MessagesProto$Text messagesProto$Text2 = this.title_;
        if (messagesProto$Text2 == null || messagesProto$Text2 == MessagesProto$Text.getDefaultInstance()) {
            this.title_ = messagesProto$Text;
        } else {
            this.title_ = (MessagesProto$Text) ((v1) MessagesProto$Text.newBuilder(this.title_).mergeFrom((v1) messagesProto$Text)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static t1 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$ModalMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$ModalMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MessagesProto$ModalMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        this.action_ = messagesProto$Action;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        this.actionButton_ = messagesProto$Button;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundHexColor(String str) {
        str.getClass();
        this.backgroundHexColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundHexColorBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.backgroundHexColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        this.body_ = messagesProto$Text;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        str.getClass();
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        this.title_ = messagesProto$Text;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (f1.f9631a[methodToInvoke.ordinal()]) {
            case 1:
                return new MessagesProto$ModalMessage();
            case 2:
                return new t1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MessagesProto$ModalMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MessagesProto$ModalMessage.class) {
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

    @Override // bj.u1
    public MessagesProto$Action getAction() {
        MessagesProto$Action messagesProto$Action = this.action_;
        return messagesProto$Action == null ? MessagesProto$Action.getDefaultInstance() : messagesProto$Action;
    }

    @Override // bj.u1
    public MessagesProto$Button getActionButton() {
        MessagesProto$Button messagesProto$Button = this.actionButton_;
        return messagesProto$Button == null ? MessagesProto$Button.getDefaultInstance() : messagesProto$Button;
    }

    @Override // bj.u1
    public String getBackgroundHexColor() {
        return this.backgroundHexColor_;
    }

    @Override // bj.u1
    public ByteString getBackgroundHexColorBytes() {
        return ByteString.copyFromUtf8(this.backgroundHexColor_);
    }

    @Override // bj.u1
    public MessagesProto$Text getBody() {
        MessagesProto$Text messagesProto$Text = this.body_;
        return messagesProto$Text == null ? MessagesProto$Text.getDefaultInstance() : messagesProto$Text;
    }

    @Override // bj.u1
    public String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // bj.u1
    public ByteString getImageUrlBytes() {
        return ByteString.copyFromUtf8(this.imageUrl_);
    }

    @Override // bj.u1
    public MessagesProto$Text getTitle() {
        MessagesProto$Text messagesProto$Text = this.title_;
        return messagesProto$Text == null ? MessagesProto$Text.getDefaultInstance() : messagesProto$Text;
    }

    @Override // bj.u1
    public boolean hasAction() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // bj.u1
    public boolean hasActionButton() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // bj.u1
    public boolean hasBody() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // bj.u1
    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public static t1 newBuilder(MessagesProto$ModalMessage messagesProto$ModalMessage) {
        return DEFAULT_INSTANCE.createBuilder(messagesProto$ModalMessage);
    }

    public static MessagesProto$ModalMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$ModalMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MessagesProto$ModalMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MessagesProto$ModalMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MessagesProto$ModalMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$ModalMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MessagesProto$ModalMessage parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$ModalMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$ModalMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$ModalMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
