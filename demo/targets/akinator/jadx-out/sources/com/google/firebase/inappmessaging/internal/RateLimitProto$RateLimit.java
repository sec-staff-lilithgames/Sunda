package com.google.firebase.inappmessaging.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import nj.a1;
import nj.v0;
import nj.y0;
import nj.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RateLimitProto$RateLimit extends GeneratedMessageLite<RateLimitProto$RateLimit, y0> implements a1 {
    private static final RateLimitProto$RateLimit DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 1;
    private static volatile Parser<RateLimitProto$RateLimit> PARSER;
    private MapFieldLite<String, RateLimitProto$Counter> limits_ = MapFieldLite.emptyMapField();

    static {
        RateLimitProto$RateLimit rateLimitProto$RateLimit = new RateLimitProto$RateLimit();
        DEFAULT_INSTANCE = rateLimitProto$RateLimit;
        GeneratedMessageLite.registerDefaultInstance(RateLimitProto$RateLimit.class, rateLimitProto$RateLimit);
    }

    private RateLimitProto$RateLimit() {
    }

    public static RateLimitProto$RateLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, RateLimitProto$Counter> getMutableLimitsMap() {
        return internalGetMutableLimits();
    }

    private MapFieldLite<String, RateLimitProto$Counter> internalGetLimits() {
        return this.limits_;
    }

    private MapFieldLite<String, RateLimitProto$Counter> internalGetMutableLimits() {
        if (!this.limits_.isMutable()) {
            this.limits_ = this.limits_.mutableCopy();
        }
        return this.limits_;
    }

    public static y0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RateLimitProto$RateLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RateLimitProto$RateLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RateLimitProto$RateLimit> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // nj.a1
    public boolean containsLimits(String str) {
        str.getClass();
        return internalGetLimits().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (v0.f77019a[methodToInvoke.ordinal()]) {
            case 1:
                return new RateLimitProto$RateLimit();
            case 2:
                return new y0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", z0.f77029a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RateLimitProto$RateLimit> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (RateLimitProto$RateLimit.class) {
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

    @Override // nj.a1
    @Deprecated
    public Map<String, RateLimitProto$Counter> getLimits() {
        return getLimitsMap();
    }

    @Override // nj.a1
    public int getLimitsCount() {
        return internalGetLimits().size();
    }

    @Override // nj.a1
    public Map<String, RateLimitProto$Counter> getLimitsMap() {
        return Collections.unmodifiableMap(internalGetLimits());
    }

    @Override // nj.a1
    public RateLimitProto$Counter getLimitsOrDefault(String str, RateLimitProto$Counter rateLimitProto$Counter) {
        str.getClass();
        MapFieldLite<String, RateLimitProto$Counter> mapFieldLiteInternalGetLimits = internalGetLimits();
        return mapFieldLiteInternalGetLimits.containsKey(str) ? mapFieldLiteInternalGetLimits.get(str) : rateLimitProto$Counter;
    }

    @Override // nj.a1
    public RateLimitProto$Counter getLimitsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, RateLimitProto$Counter> mapFieldLiteInternalGetLimits = internalGetLimits();
        if (mapFieldLiteInternalGetLimits.containsKey(str)) {
            return mapFieldLiteInternalGetLimits.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static y0 newBuilder(RateLimitProto$RateLimit rateLimitProto$RateLimit) {
        return DEFAULT_INSTANCE.createBuilder(rateLimitProto$RateLimit);
    }

    public static RateLimitProto$RateLimit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RateLimitProto$RateLimit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RateLimitProto$RateLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RateLimitProto$RateLimit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RateLimitProto$RateLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RateLimitProto$RateLimit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RateLimitProto$RateLimit parseFrom(InputStream inputStream) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RateLimitProto$RateLimit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RateLimitProto$RateLimit parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RateLimitProto$RateLimit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
