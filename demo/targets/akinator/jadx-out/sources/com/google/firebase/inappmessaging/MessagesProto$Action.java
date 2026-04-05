package com.google.firebase.inappmessaging;

import bj.f1;
import bj.g1;
import bj.h1;
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
public final class MessagesProto$Action extends GeneratedMessageLite<MessagesProto$Action, g1> implements h1 {
    public static final int ACTION_URL_FIELD_NUMBER = 1;
    private static final MessagesProto$Action DEFAULT_INSTANCE;
    private static volatile Parser<MessagesProto$Action> PARSER;
    private String actionUrl_ = "";

    static {
        MessagesProto$Action messagesProto$Action = new MessagesProto$Action();
        DEFAULT_INSTANCE = messagesProto$Action;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$Action.class, messagesProto$Action);
    }

    private MessagesProto$Action() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionUrl() {
        this.actionUrl_ = getDefaultInstance().getActionUrl();
    }

    public static MessagesProto$Action getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g1 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$Action parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Action parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MessagesProto$Action> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionUrl(String str) {
        str.getClass();
        this.actionUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.actionUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (f1.f9631a[methodToInvoke.ordinal()]) {
            case 1:
                return new MessagesProto$Action();
            case 2:
                return new g1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"actionUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MessagesProto$Action> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MessagesProto$Action.class) {
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

    @Override // bj.h1
    public String getActionUrl() {
        return this.actionUrl_;
    }

    @Override // bj.h1
    public ByteString getActionUrlBytes() {
        return ByteString.copyFromUtf8(this.actionUrl_);
    }

    public static g1 newBuilder(MessagesProto$Action messagesProto$Action) {
        return DEFAULT_INSTANCE.createBuilder(messagesProto$Action);
    }

    public static MessagesProto$Action parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$Action parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MessagesProto$Action parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MessagesProto$Action parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MessagesProto$Action parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$Action parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MessagesProto$Action parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Action parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MessagesProto$Action parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$Action parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
