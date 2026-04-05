package com.google.firebase.inappmessaging;

import bj.f1;
import bj.g1;
import bj.r1;
import bj.s1;
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
public final class MessagesProto$ImageOnlyMessage extends GeneratedMessageLite<MessagesProto$ImageOnlyMessage, r1> implements s1 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final MessagesProto$ImageOnlyMessage DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile Parser<MessagesProto$ImageOnlyMessage> PARSER;
    private MessagesProto$Action action_;
    private int bitField0_;
    private String imageUrl_ = "";

    static {
        MessagesProto$ImageOnlyMessage messagesProto$ImageOnlyMessage = new MessagesProto$ImageOnlyMessage();
        DEFAULT_INSTANCE = messagesProto$ImageOnlyMessage;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$ImageOnlyMessage.class, messagesProto$ImageOnlyMessage);
    }

    private MessagesProto$ImageOnlyMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    public static MessagesProto$ImageOnlyMessage getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    public static r1 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$ImageOnlyMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$ImageOnlyMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MessagesProto$ImageOnlyMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        this.action_ = messagesProto$Action;
        this.bitField0_ |= 1;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (f1.f9631a[methodToInvoke.ordinal()]) {
            case 1:
                return new MessagesProto$ImageOnlyMessage();
            case 2:
                return new r1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "imageUrl_", "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MessagesProto$ImageOnlyMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MessagesProto$ImageOnlyMessage.class) {
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

    @Override // bj.s1
    public MessagesProto$Action getAction() {
        MessagesProto$Action messagesProto$Action = this.action_;
        return messagesProto$Action == null ? MessagesProto$Action.getDefaultInstance() : messagesProto$Action;
    }

    @Override // bj.s1
    public String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // bj.s1
    public ByteString getImageUrlBytes() {
        return ByteString.copyFromUtf8(this.imageUrl_);
    }

    @Override // bj.s1
    public boolean hasAction() {
        return (this.bitField0_ & 1) != 0;
    }

    public static r1 newBuilder(MessagesProto$ImageOnlyMessage messagesProto$ImageOnlyMessage) {
        return DEFAULT_INSTANCE.createBuilder(messagesProto$ImageOnlyMessage);
    }

    public static MessagesProto$ImageOnlyMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$ImageOnlyMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MessagesProto$ImageOnlyMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MessagesProto$ImageOnlyMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MessagesProto$ImageOnlyMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$ImageOnlyMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MessagesProto$ImageOnlyMessage parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$ImageOnlyMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$ImageOnlyMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$ImageOnlyMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$ImageOnlyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
