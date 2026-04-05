package com.google.developers.mobile.targeting.proto;

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
import uh.a;
import uh.d;
import uh.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class ClientSignalsProto$ClientSignals extends GeneratedMessageLite<ClientSignalsProto$ClientSignals, d> implements e {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    private static final ClientSignalsProto$ClientSignals DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile Parser<ClientSignalsProto$ClientSignals> PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String platformVersion_ = "";
    private String languageCode_ = "";
    private String timeZone_ = "";

    static {
        ClientSignalsProto$ClientSignals clientSignalsProto$ClientSignals = new ClientSignalsProto$ClientSignals();
        DEFAULT_INSTANCE = clientSignalsProto$ClientSignals;
        GeneratedMessageLite.registerDefaultInstance(ClientSignalsProto$ClientSignals.class, clientSignalsProto$ClientSignals);
    }

    private ClientSignalsProto$ClientSignals() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersion() {
        this.appVersion_ = getDefaultInstance().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageCode() {
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatformVersion() {
        this.platformVersion_ = getDefaultInstance().getPlatformVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeZone() {
        this.timeZone_ = getDefaultInstance().getTimeZone();
    }

    public static ClientSignalsProto$ClientSignals getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientSignalsProto$ClientSignals parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ClientSignalsProto$ClientSignals> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(String str) {
        str.getClass();
        this.appVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCode(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCodeBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.languageCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformVersion(String str) {
        str.getClass();
        this.platformVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformVersionBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.platformVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZone(String str) {
        str.getClass();
        this.timeZone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZoneBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.timeZone_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f88505a[methodToInvoke.ordinal()]) {
            case 1:
                return new ClientSignalsProto$ClientSignals();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClientSignalsProto$ClientSignals> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ClientSignalsProto$ClientSignals.class) {
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

    @Override // uh.e
    public String getAppVersion() {
        return this.appVersion_;
    }

    @Override // uh.e
    public ByteString getAppVersionBytes() {
        return ByteString.copyFromUtf8(this.appVersion_);
    }

    @Override // uh.e
    public String getLanguageCode() {
        return this.languageCode_;
    }

    @Override // uh.e
    public ByteString getLanguageCodeBytes() {
        return ByteString.copyFromUtf8(this.languageCode_);
    }

    @Override // uh.e
    public String getPlatformVersion() {
        return this.platformVersion_;
    }

    @Override // uh.e
    public ByteString getPlatformVersionBytes() {
        return ByteString.copyFromUtf8(this.platformVersion_);
    }

    @Override // uh.e
    public String getTimeZone() {
        return this.timeZone_;
    }

    @Override // uh.e
    public ByteString getTimeZoneBytes() {
        return ByteString.copyFromUtf8(this.timeZone_);
    }

    public static d newBuilder(ClientSignalsProto$ClientSignals clientSignalsProto$ClientSignals) {
        return DEFAULT_INSTANCE.createBuilder(clientSignalsProto$ClientSignals);
    }

    public static ClientSignalsProto$ClientSignals parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(InputStream inputStream) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
