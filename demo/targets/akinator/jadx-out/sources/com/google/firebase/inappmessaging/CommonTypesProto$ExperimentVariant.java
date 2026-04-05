package com.google.firebase.inappmessaging;

import bj.h;
import bj.o1;
import bj.q;
import bj.r;
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
public final class CommonTypesProto$ExperimentVariant extends GeneratedMessageLite<CommonTypesProto$ExperimentVariant, q> implements r {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final CommonTypesProto$ExperimentVariant DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile Parser<CommonTypesProto$ExperimentVariant> PARSER;
    private int bitField0_;
    private MessagesProto$Content content_;
    private int index_;

    static {
        CommonTypesProto$ExperimentVariant commonTypesProto$ExperimentVariant = new CommonTypesProto$ExperimentVariant();
        DEFAULT_INSTANCE = commonTypesProto$ExperimentVariant;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$ExperimentVariant.class, commonTypesProto$ExperimentVariant);
    }

    private CommonTypesProto$ExperimentVariant() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    public static CommonTypesProto$ExperimentVariant getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContent(MessagesProto$Content messagesProto$Content) {
        messagesProto$Content.getClass();
        MessagesProto$Content messagesProto$Content2 = this.content_;
        if (messagesProto$Content2 == null || messagesProto$Content2 == MessagesProto$Content.getDefaultInstance()) {
            this.content_ = messagesProto$Content;
        } else {
            this.content_ = (MessagesProto$Content) ((o1) MessagesProto$Content.newBuilder(this.content_).mergeFrom((o1) messagesProto$Content)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static q newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$ExperimentVariant parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CommonTypesProto$ExperimentVariant> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(MessagesProto$Content messagesProto$Content) {
        messagesProto$Content.getClass();
        this.content_ = messagesProto$Content;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i10) {
        this.index_ = i10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (h.f9639a[methodToInvoke.ordinal()]) {
            case 1:
                return new CommonTypesProto$ExperimentVariant();
            case 2:
                return new q(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000", new Object[]{"bitField0_", "index_", "content_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CommonTypesProto$ExperimentVariant> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CommonTypesProto$ExperimentVariant.class) {
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

    @Override // bj.r
    public MessagesProto$Content getContent() {
        MessagesProto$Content messagesProto$Content = this.content_;
        return messagesProto$Content == null ? MessagesProto$Content.getDefaultInstance() : messagesProto$Content;
    }

    @Override // bj.r
    public int getIndex() {
        return this.index_;
    }

    @Override // bj.r
    public boolean hasContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public static q newBuilder(CommonTypesProto$ExperimentVariant commonTypesProto$ExperimentVariant) {
        return DEFAULT_INSTANCE.createBuilder(commonTypesProto$ExperimentVariant);
    }

    public static CommonTypesProto$ExperimentVariant parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
