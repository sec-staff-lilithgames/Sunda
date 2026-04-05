package com.google.firebase.inappmessaging;

import bj.f1;
import bj.g1;
import bj.k1;
import bj.m1;
import bj.n1;
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
public final class MessagesProto$CardMessage extends GeneratedMessageLite<MessagesProto$CardMessage, m1> implements n1 {
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final MessagesProto$CardMessage DEFAULT_INSTANCE;
    public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile Parser<MessagesProto$CardMessage> PARSER = null;
    public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
    public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private MessagesProto$Text body_;
    private MessagesProto$Button primaryActionButton_;
    private MessagesProto$Action primaryAction_;
    private MessagesProto$Button secondaryActionButton_;
    private MessagesProto$Action secondaryAction_;
    private MessagesProto$Text title_;
    private String portraitImageUrl_ = "";
    private String landscapeImageUrl_ = "";
    private String backgroundHexColor_ = "";

    static {
        MessagesProto$CardMessage messagesProto$CardMessage = new MessagesProto$CardMessage();
        DEFAULT_INSTANCE = messagesProto$CardMessage;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$CardMessage.class, messagesProto$CardMessage);
    }

    private MessagesProto$CardMessage() {
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
    public void clearLandscapeImageUrl() {
        this.landscapeImageUrl_ = getDefaultInstance().getLandscapeImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortraitImageUrl() {
        this.portraitImageUrl_ = getDefaultInstance().getPortraitImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryAction() {
        this.primaryAction_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryActionButton() {
        this.primaryActionButton_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryAction() {
        this.secondaryAction_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryActionButton() {
        this.secondaryActionButton_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    public static MessagesProto$CardMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
    public void mergePrimaryAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        MessagesProto$Action messagesProto$Action2 = this.primaryAction_;
        if (messagesProto$Action2 == null || messagesProto$Action2 == MessagesProto$Action.getDefaultInstance()) {
            this.primaryAction_ = messagesProto$Action;
        } else {
            this.primaryAction_ = (MessagesProto$Action) ((g1) MessagesProto$Action.newBuilder(this.primaryAction_).mergeFrom((g1) messagesProto$Action)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrimaryActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        MessagesProto$Button messagesProto$Button2 = this.primaryActionButton_;
        if (messagesProto$Button2 == null || messagesProto$Button2 == MessagesProto$Button.getDefaultInstance()) {
            this.primaryActionButton_ = messagesProto$Button;
        } else {
            this.primaryActionButton_ = (MessagesProto$Button) ((k1) MessagesProto$Button.newBuilder(this.primaryActionButton_).mergeFrom((k1) messagesProto$Button)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSecondaryAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        MessagesProto$Action messagesProto$Action2 = this.secondaryAction_;
        if (messagesProto$Action2 == null || messagesProto$Action2 == MessagesProto$Action.getDefaultInstance()) {
            this.secondaryAction_ = messagesProto$Action;
        } else {
            this.secondaryAction_ = (MessagesProto$Action) ((g1) MessagesProto$Action.newBuilder(this.secondaryAction_).mergeFrom((g1) messagesProto$Action)).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSecondaryActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        MessagesProto$Button messagesProto$Button2 = this.secondaryActionButton_;
        if (messagesProto$Button2 == null || messagesProto$Button2 == MessagesProto$Button.getDefaultInstance()) {
            this.secondaryActionButton_ = messagesProto$Button;
        } else {
            this.secondaryActionButton_ = (MessagesProto$Button) ((k1) MessagesProto$Button.newBuilder(this.secondaryActionButton_).mergeFrom((k1) messagesProto$Button)).buildPartial();
        }
        this.bitField0_ |= 16;
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

    public static m1 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$CardMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$CardMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MessagesProto$CardMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setLandscapeImageUrl(String str) {
        str.getClass();
        this.landscapeImageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLandscapeImageUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.landscapeImageUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortraitImageUrl(String str) {
        str.getClass();
        this.portraitImageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortraitImageUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.portraitImageUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        this.primaryAction_ = messagesProto$Action;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        this.primaryActionButton_ = messagesProto$Button;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        this.secondaryAction_ = messagesProto$Action;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        this.secondaryActionButton_ = messagesProto$Button;
        this.bitField0_ |= 16;
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
                return new MessagesProto$CardMessage();
            case 2:
                return new m1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005", new Object[]{"bitField0_", "title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MessagesProto$CardMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MessagesProto$CardMessage.class) {
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

    @Override // bj.n1
    public String getBackgroundHexColor() {
        return this.backgroundHexColor_;
    }

    @Override // bj.n1
    public ByteString getBackgroundHexColorBytes() {
        return ByteString.copyFromUtf8(this.backgroundHexColor_);
    }

    @Override // bj.n1
    public MessagesProto$Text getBody() {
        MessagesProto$Text messagesProto$Text = this.body_;
        return messagesProto$Text == null ? MessagesProto$Text.getDefaultInstance() : messagesProto$Text;
    }

    @Override // bj.n1
    public String getLandscapeImageUrl() {
        return this.landscapeImageUrl_;
    }

    @Override // bj.n1
    public ByteString getLandscapeImageUrlBytes() {
        return ByteString.copyFromUtf8(this.landscapeImageUrl_);
    }

    @Override // bj.n1
    public String getPortraitImageUrl() {
        return this.portraitImageUrl_;
    }

    @Override // bj.n1
    public ByteString getPortraitImageUrlBytes() {
        return ByteString.copyFromUtf8(this.portraitImageUrl_);
    }

    @Override // bj.n1
    public MessagesProto$Action getPrimaryAction() {
        MessagesProto$Action messagesProto$Action = this.primaryAction_;
        return messagesProto$Action == null ? MessagesProto$Action.getDefaultInstance() : messagesProto$Action;
    }

    @Override // bj.n1
    public MessagesProto$Button getPrimaryActionButton() {
        MessagesProto$Button messagesProto$Button = this.primaryActionButton_;
        return messagesProto$Button == null ? MessagesProto$Button.getDefaultInstance() : messagesProto$Button;
    }

    @Override // bj.n1
    public MessagesProto$Action getSecondaryAction() {
        MessagesProto$Action messagesProto$Action = this.secondaryAction_;
        return messagesProto$Action == null ? MessagesProto$Action.getDefaultInstance() : messagesProto$Action;
    }

    @Override // bj.n1
    public MessagesProto$Button getSecondaryActionButton() {
        MessagesProto$Button messagesProto$Button = this.secondaryActionButton_;
        return messagesProto$Button == null ? MessagesProto$Button.getDefaultInstance() : messagesProto$Button;
    }

    @Override // bj.n1
    public MessagesProto$Text getTitle() {
        MessagesProto$Text messagesProto$Text = this.title_;
        return messagesProto$Text == null ? MessagesProto$Text.getDefaultInstance() : messagesProto$Text;
    }

    @Override // bj.n1
    public boolean hasBody() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // bj.n1
    public boolean hasPrimaryAction() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // bj.n1
    public boolean hasPrimaryActionButton() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // bj.n1
    public boolean hasSecondaryAction() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // bj.n1
    public boolean hasSecondaryActionButton() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // bj.n1
    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public static m1 newBuilder(MessagesProto$CardMessage messagesProto$CardMessage) {
        return DEFAULT_INSTANCE.createBuilder(messagesProto$CardMessage);
    }

    public static MessagesProto$CardMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$CardMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MessagesProto$CardMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MessagesProto$CardMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MessagesProto$CardMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$CardMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MessagesProto$CardMessage parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$CardMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$CardMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$CardMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
