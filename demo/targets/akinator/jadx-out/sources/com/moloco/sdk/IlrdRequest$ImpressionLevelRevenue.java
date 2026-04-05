package com.moloco.sdk;

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
/* loaded from: classes8.dex */
public final class IlrdRequest$ImpressionLevelRevenue extends GeneratedMessageLite<IlrdRequest$ImpressionLevelRevenue, s7> implements u7 {
    private static final IlrdRequest$ImpressionLevelRevenue DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 2;
    public static final int LEVELPLAY_FIELD_NUMBER = 4;
    public static final int MAX_FIELD_NUMBER = 3;
    private static volatile Parser<IlrdRequest$ImpressionLevelRevenue> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private Object platform_;
    private int platformCase_ = 0;
    private String sessionId_ = "";
    private String eventId_ = "";

    static {
        IlrdRequest$ImpressionLevelRevenue ilrdRequest$ImpressionLevelRevenue = new IlrdRequest$ImpressionLevelRevenue();
        DEFAULT_INSTANCE = ilrdRequest$ImpressionLevelRevenue;
        GeneratedMessageLite.registerDefaultInstance(IlrdRequest$ImpressionLevelRevenue.class, ilrdRequest$ImpressionLevelRevenue);
    }

    private IlrdRequest$ImpressionLevelRevenue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevelplay() {
        if (this.platformCase_ == 4) {
            this.platformCase_ = 0;
            this.platform_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMax() {
        if (this.platformCase_ == 3) {
            this.platformCase_ = 0;
            this.platform_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatform() {
        this.platformCase_ = 0;
        this.platform_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    public static IlrdRequest$ImpressionLevelRevenue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLevelplay(IlrdRequest$LevelPlayImpression ilrdRequest$LevelPlayImpression) {
        ilrdRequest$LevelPlayImpression.getClass();
        if (this.platformCase_ != 4 || this.platform_ == IlrdRequest$LevelPlayImpression.getDefaultInstance()) {
            this.platform_ = ilrdRequest$LevelPlayImpression;
        } else {
            this.platform_ = ((x7) IlrdRequest$LevelPlayImpression.newBuilder((IlrdRequest$LevelPlayImpression) this.platform_).mergeFrom((x7) ilrdRequest$LevelPlayImpression)).buildPartial();
        }
        this.platformCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMax(IlrdRequest$MaxImpression ilrdRequest$MaxImpression) {
        ilrdRequest$MaxImpression.getClass();
        if (this.platformCase_ != 3 || this.platform_ == IlrdRequest$MaxImpression.getDefaultInstance()) {
            this.platform_ = ilrdRequest$MaxImpression;
        } else {
            this.platform_ = ((z7) IlrdRequest$MaxImpression.newBuilder((IlrdRequest$MaxImpression) this.platform_).mergeFrom((z7) ilrdRequest$MaxImpression)).buildPartial();
        }
        this.platformCase_ = 3;
    }

    public static s7 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IlrdRequest$ImpressionLevelRevenue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IlrdRequest$ImpressionLevelRevenue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelplay(IlrdRequest$LevelPlayImpression ilrdRequest$LevelPlayImpression) {
        ilrdRequest$LevelPlayImpression.getClass();
        this.platform_ = ilrdRequest$LevelPlayImpression;
        this.platformCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMax(IlrdRequest$MaxImpression ilrdRequest$MaxImpression) {
        ilrdRequest$MaxImpression.getClass();
        this.platform_ = ilrdRequest$MaxImpression;
        this.platformCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (r7.f47418a[methodToInvoke.ordinal()]) {
            case 1:
                return new IlrdRequest$ImpressionLevelRevenue();
            case 2:
                return new s7(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000", new Object[]{"platform_", "platformCase_", "sessionId_", "eventId_", IlrdRequest$MaxImpression.class, IlrdRequest$LevelPlayImpression.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IlrdRequest$ImpressionLevelRevenue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (IlrdRequest$ImpressionLevelRevenue.class) {
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

    @Override // com.moloco.sdk.u7
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.moloco.sdk.u7
    public ByteString getEventIdBytes() {
        return ByteString.copyFromUtf8(this.eventId_);
    }

    @Override // com.moloco.sdk.u7
    public IlrdRequest$LevelPlayImpression getLevelplay() {
        return this.platformCase_ == 4 ? (IlrdRequest$LevelPlayImpression) this.platform_ : IlrdRequest$LevelPlayImpression.getDefaultInstance();
    }

    @Override // com.moloco.sdk.u7
    public IlrdRequest$MaxImpression getMax() {
        return this.platformCase_ == 3 ? (IlrdRequest$MaxImpression) this.platform_ : IlrdRequest$MaxImpression.getDefaultInstance();
    }

    @Override // com.moloco.sdk.u7
    public t7 getPlatformCase() {
        return t7.forNumber(this.platformCase_);
    }

    @Override // com.moloco.sdk.u7
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.moloco.sdk.u7
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    @Override // com.moloco.sdk.u7
    public boolean hasLevelplay() {
        return this.platformCase_ == 4;
    }

    @Override // com.moloco.sdk.u7
    public boolean hasMax() {
        return this.platformCase_ == 3;
    }

    public static s7 newBuilder(IlrdRequest$ImpressionLevelRevenue ilrdRequest$ImpressionLevelRevenue) {
        return DEFAULT_INSTANCE.createBuilder(ilrdRequest$ImpressionLevelRevenue);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IlrdRequest$ImpressionLevelRevenue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$ImpressionLevelRevenue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
