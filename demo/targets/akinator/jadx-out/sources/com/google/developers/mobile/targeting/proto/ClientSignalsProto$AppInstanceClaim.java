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
import uh.b;
import uh.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class ClientSignalsProto$AppInstanceClaim extends GeneratedMessageLite<ClientSignalsProto$AppInstanceClaim, b> implements c {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 1;
    public static final int APP_INSTANCE_TOKEN_FIELD_NUMBER = 2;
    private static final ClientSignalsProto$AppInstanceClaim DEFAULT_INSTANCE;
    public static final int GMP_APP_ID_FIELD_NUMBER = 3;
    private static volatile Parser<ClientSignalsProto$AppInstanceClaim> PARSER;
    private String appInstanceId_ = "";
    private String appInstanceToken_ = "";
    private String gmpAppId_ = "";

    static {
        ClientSignalsProto$AppInstanceClaim clientSignalsProto$AppInstanceClaim = new ClientSignalsProto$AppInstanceClaim();
        DEFAULT_INSTANCE = clientSignalsProto$AppInstanceClaim;
        GeneratedMessageLite.registerDefaultInstance(ClientSignalsProto$AppInstanceClaim.class, clientSignalsProto$AppInstanceClaim);
    }

    private ClientSignalsProto$AppInstanceClaim() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInstanceId() {
        this.appInstanceId_ = getDefaultInstance().getAppInstanceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInstanceToken() {
        this.appInstanceToken_ = getDefaultInstance().getAppInstanceToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGmpAppId() {
        this.gmpAppId_ = getDefaultInstance().getGmpAppId();
    }

    public static ClientSignalsProto$AppInstanceClaim getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientSignalsProto$AppInstanceClaim parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ClientSignalsProto$AppInstanceClaim> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceId(String str) {
        str.getClass();
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appInstanceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceToken(String str) {
        str.getClass();
        this.appInstanceToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceTokenBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appInstanceToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGmpAppId(String str) {
        str.getClass();
        this.gmpAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGmpAppIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.gmpAppId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f88505a[methodToInvoke.ordinal()]) {
            case 1:
                return new ClientSignalsProto$AppInstanceClaim();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"appInstanceId_", "appInstanceToken_", "gmpAppId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClientSignalsProto$AppInstanceClaim> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ClientSignalsProto$AppInstanceClaim.class) {
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

    @Override // uh.c
    public String getAppInstanceId() {
        return this.appInstanceId_;
    }

    @Override // uh.c
    public ByteString getAppInstanceIdBytes() {
        return ByteString.copyFromUtf8(this.appInstanceId_);
    }

    @Override // uh.c
    public String getAppInstanceToken() {
        return this.appInstanceToken_;
    }

    @Override // uh.c
    public ByteString getAppInstanceTokenBytes() {
        return ByteString.copyFromUtf8(this.appInstanceToken_);
    }

    @Override // uh.c
    public String getGmpAppId() {
        return this.gmpAppId_;
    }

    @Override // uh.c
    public ByteString getGmpAppIdBytes() {
        return ByteString.copyFromUtf8(this.gmpAppId_);
    }

    public static b newBuilder(ClientSignalsProto$AppInstanceClaim clientSignalsProto$AppInstanceClaim) {
        return DEFAULT_INSTANCE.createBuilder(clientSignalsProto$AppInstanceClaim);
    }

    public static ClientSignalsProto$AppInstanceClaim parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(InputStream inputStream) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
