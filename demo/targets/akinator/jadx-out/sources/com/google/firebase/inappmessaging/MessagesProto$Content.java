package com.google.firebase.inappmessaging;

import bj.f1;
import bj.i1;
import bj.m1;
import bj.o1;
import bj.p1;
import bj.q1;
import bj.r1;
import bj.t1;
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
public final class MessagesProto$Content extends GeneratedMessageLite<MessagesProto$Content, o1> implements q1 {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    private static final MessagesProto$Content DEFAULT_INSTANCE;
    public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
    public static final int MODAL_FIELD_NUMBER = 2;
    private static volatile Parser<MessagesProto$Content> PARSER;
    private int messageDetailsCase_ = 0;
    private Object messageDetails_;

    static {
        MessagesProto$Content messagesProto$Content = new MessagesProto$Content();
        DEFAULT_INSTANCE = messagesProto$Content;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$Content.class, messagesProto$Content);
    }

    private MessagesProto$Content() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBanner() {
        if (this.messageDetailsCase_ == 1) {
            this.messageDetailsCase_ = 0;
            this.messageDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCard() {
        if (this.messageDetailsCase_ == 4) {
            this.messageDetailsCase_ = 0;
            this.messageDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageOnly() {
        if (this.messageDetailsCase_ == 3) {
            this.messageDetailsCase_ = 0;
            this.messageDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageDetails() {
        this.messageDetailsCase_ = 0;
        this.messageDetails_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModal() {
        if (this.messageDetailsCase_ == 2) {
            this.messageDetailsCase_ = 0;
            this.messageDetails_ = null;
        }
    }

    public static MessagesProto$Content getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBanner(MessagesProto$BannerMessage messagesProto$BannerMessage) {
        messagesProto$BannerMessage.getClass();
        if (this.messageDetailsCase_ != 1 || this.messageDetails_ == MessagesProto$BannerMessage.getDefaultInstance()) {
            this.messageDetails_ = messagesProto$BannerMessage;
        } else {
            this.messageDetails_ = ((i1) MessagesProto$BannerMessage.newBuilder((MessagesProto$BannerMessage) this.messageDetails_).mergeFrom((i1) messagesProto$BannerMessage)).buildPartial();
        }
        this.messageDetailsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCard(MessagesProto$CardMessage messagesProto$CardMessage) {
        messagesProto$CardMessage.getClass();
        if (this.messageDetailsCase_ != 4 || this.messageDetails_ == MessagesProto$CardMessage.getDefaultInstance()) {
            this.messageDetails_ = messagesProto$CardMessage;
        } else {
            this.messageDetails_ = ((m1) MessagesProto$CardMessage.newBuilder((MessagesProto$CardMessage) this.messageDetails_).mergeFrom((m1) messagesProto$CardMessage)).buildPartial();
        }
        this.messageDetailsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImageOnly(MessagesProto$ImageOnlyMessage messagesProto$ImageOnlyMessage) {
        messagesProto$ImageOnlyMessage.getClass();
        if (this.messageDetailsCase_ != 3 || this.messageDetails_ == MessagesProto$ImageOnlyMessage.getDefaultInstance()) {
            this.messageDetails_ = messagesProto$ImageOnlyMessage;
        } else {
            this.messageDetails_ = ((r1) MessagesProto$ImageOnlyMessage.newBuilder((MessagesProto$ImageOnlyMessage) this.messageDetails_).mergeFrom((r1) messagesProto$ImageOnlyMessage)).buildPartial();
        }
        this.messageDetailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeModal(MessagesProto$ModalMessage messagesProto$ModalMessage) {
        messagesProto$ModalMessage.getClass();
        if (this.messageDetailsCase_ != 2 || this.messageDetails_ == MessagesProto$ModalMessage.getDefaultInstance()) {
            this.messageDetails_ = messagesProto$ModalMessage;
        } else {
            this.messageDetails_ = ((t1) MessagesProto$ModalMessage.newBuilder((MessagesProto$ModalMessage) this.messageDetails_).mergeFrom((t1) messagesProto$ModalMessage)).buildPartial();
        }
        this.messageDetailsCase_ = 2;
    }

    public static o1 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$Content parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Content parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MessagesProto$Content> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBanner(MessagesProto$BannerMessage messagesProto$BannerMessage) {
        messagesProto$BannerMessage.getClass();
        this.messageDetails_ = messagesProto$BannerMessage;
        this.messageDetailsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCard(MessagesProto$CardMessage messagesProto$CardMessage) {
        messagesProto$CardMessage.getClass();
        this.messageDetails_ = messagesProto$CardMessage;
        this.messageDetailsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageOnly(MessagesProto$ImageOnlyMessage messagesProto$ImageOnlyMessage) {
        messagesProto$ImageOnlyMessage.getClass();
        this.messageDetails_ = messagesProto$ImageOnlyMessage;
        this.messageDetailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModal(MessagesProto$ModalMessage messagesProto$ModalMessage) {
        messagesProto$ModalMessage.getClass();
        this.messageDetails_ = messagesProto$ModalMessage;
        this.messageDetailsCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (f1.f9631a[methodToInvoke.ordinal()]) {
            case 1:
                return new MessagesProto$Content();
            case 2:
                return new o1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", MessagesProto$BannerMessage.class, MessagesProto$ModalMessage.class, MessagesProto$ImageOnlyMessage.class, MessagesProto$CardMessage.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MessagesProto$Content> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MessagesProto$Content.class) {
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

    @Override // bj.q1
    public MessagesProto$BannerMessage getBanner() {
        return this.messageDetailsCase_ == 1 ? (MessagesProto$BannerMessage) this.messageDetails_ : MessagesProto$BannerMessage.getDefaultInstance();
    }

    @Override // bj.q1
    public MessagesProto$CardMessage getCard() {
        return this.messageDetailsCase_ == 4 ? (MessagesProto$CardMessage) this.messageDetails_ : MessagesProto$CardMessage.getDefaultInstance();
    }

    @Override // bj.q1
    public MessagesProto$ImageOnlyMessage getImageOnly() {
        return this.messageDetailsCase_ == 3 ? (MessagesProto$ImageOnlyMessage) this.messageDetails_ : MessagesProto$ImageOnlyMessage.getDefaultInstance();
    }

    @Override // bj.q1
    public p1 getMessageDetailsCase() {
        return p1.forNumber(this.messageDetailsCase_);
    }

    @Override // bj.q1
    public MessagesProto$ModalMessage getModal() {
        return this.messageDetailsCase_ == 2 ? (MessagesProto$ModalMessage) this.messageDetails_ : MessagesProto$ModalMessage.getDefaultInstance();
    }

    @Override // bj.q1
    public boolean hasBanner() {
        return this.messageDetailsCase_ == 1;
    }

    @Override // bj.q1
    public boolean hasCard() {
        return this.messageDetailsCase_ == 4;
    }

    @Override // bj.q1
    public boolean hasImageOnly() {
        return this.messageDetailsCase_ == 3;
    }

    @Override // bj.q1
    public boolean hasModal() {
        return this.messageDetailsCase_ == 2;
    }

    public static o1 newBuilder(MessagesProto$Content messagesProto$Content) {
        return DEFAULT_INSTANCE.createBuilder(messagesProto$Content);
    }

    public static MessagesProto$Content parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$Content parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MessagesProto$Content parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MessagesProto$Content parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MessagesProto$Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$Content parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MessagesProto$Content parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Content parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$Content parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$Content parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
