package com.google.firebase.inappmessaging.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import nj.v0;
import nj.w0;
import nj.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RateLimitProto$Counter extends GeneratedMessageLite<RateLimitProto$Counter, w0> implements x0 {
    private static final RateLimitProto$Counter DEFAULT_INSTANCE;
    private static volatile Parser<RateLimitProto$Counter> PARSER = null;
    public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long startTimeEpoch_;
    private long value_;

    static {
        RateLimitProto$Counter rateLimitProto$Counter = new RateLimitProto$Counter();
        DEFAULT_INSTANCE = rateLimitProto$Counter;
        GeneratedMessageLite.registerDefaultInstance(RateLimitProto$Counter.class, rateLimitProto$Counter);
    }

    private RateLimitProto$Counter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimeEpoch() {
        this.startTimeEpoch_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static RateLimitProto$Counter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static w0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RateLimitProto$Counter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RateLimitProto$Counter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RateLimitProto$Counter> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeEpoch(long j10) {
        this.startTimeEpoch_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j10) {
        this.value_ = j10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (v0.f77019a[methodToInvoke.ordinal()]) {
            case 1:
                return new RateLimitProto$Counter();
            case 2:
                return new w0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RateLimitProto$Counter> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RateLimitProto$Counter.class) {
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

    @Override // nj.x0
    public long getStartTimeEpoch() {
        return this.startTimeEpoch_;
    }

    @Override // nj.x0
    public long getValue() {
        return this.value_;
    }

    public static w0 newBuilder(RateLimitProto$Counter rateLimitProto$Counter) {
        return DEFAULT_INSTANCE.createBuilder(rateLimitProto$Counter);
    }

    public static RateLimitProto$Counter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RateLimitProto$Counter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RateLimitProto$Counter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RateLimitProto$Counter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RateLimitProto$Counter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RateLimitProto$Counter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RateLimitProto$Counter parseFrom(InputStream inputStream) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RateLimitProto$Counter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RateLimitProto$Counter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RateLimitProto$Counter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
