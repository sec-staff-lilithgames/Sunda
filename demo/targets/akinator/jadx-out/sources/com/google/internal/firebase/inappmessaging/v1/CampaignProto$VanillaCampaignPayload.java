package com.google.internal.firebase.inappmessaging.v1;

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
import qk.a;
import qk.j;
import qk.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CampaignProto$VanillaCampaignPayload extends GeneratedMessageLite<CampaignProto$VanillaCampaignPayload, j> implements k {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final CampaignProto$VanillaCampaignPayload DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_CAMPAIGN_ID_FIELD_NUMBER = 2;
    private static volatile Parser<CampaignProto$VanillaCampaignPayload> PARSER;
    private long campaignEndTimeMillis_;
    private long campaignStartTimeMillis_;
    private String campaignId_ = "";
    private String experimentalCampaignId_ = "";
    private String campaignName_ = "";

    static {
        CampaignProto$VanillaCampaignPayload campaignProto$VanillaCampaignPayload = new CampaignProto$VanillaCampaignPayload();
        DEFAULT_INSTANCE = campaignProto$VanillaCampaignPayload;
        GeneratedMessageLite.registerDefaultInstance(CampaignProto$VanillaCampaignPayload.class, campaignProto$VanillaCampaignPayload);
    }

    private CampaignProto$VanillaCampaignPayload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignEndTimeMillis() {
        this.campaignEndTimeMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignId() {
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignName() {
        this.campaignName_ = getDefaultInstance().getCampaignName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignStartTimeMillis() {
        this.campaignStartTimeMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentalCampaignId() {
        this.experimentalCampaignId_ = getDefaultInstance().getExperimentalCampaignId();
    }

    public static CampaignProto$VanillaCampaignPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static j newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignProto$VanillaCampaignPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CampaignProto$VanillaCampaignPayload> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignEndTimeMillis(long j10) {
        this.campaignEndTimeMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(String str) {
        str.getClass();
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.campaignId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignName(String str) {
        str.getClass();
        this.campaignName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.campaignName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignStartTimeMillis(long j10) {
        this.campaignStartTimeMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalCampaignId(String str) {
        str.getClass();
        this.experimentalCampaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalCampaignIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.experimentalCampaignId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f83271a[methodToInvoke.ordinal()]) {
            case 1:
                return new CampaignProto$VanillaCampaignPayload();
            case 2:
                return new j(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentalCampaignId_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CampaignProto$VanillaCampaignPayload> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CampaignProto$VanillaCampaignPayload.class) {
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

    @Override // qk.k
    public long getCampaignEndTimeMillis() {
        return this.campaignEndTimeMillis_;
    }

    @Override // qk.k
    public String getCampaignId() {
        return this.campaignId_;
    }

    @Override // qk.k
    public ByteString getCampaignIdBytes() {
        return ByteString.copyFromUtf8(this.campaignId_);
    }

    @Override // qk.k
    public String getCampaignName() {
        return this.campaignName_;
    }

    @Override // qk.k
    public ByteString getCampaignNameBytes() {
        return ByteString.copyFromUtf8(this.campaignName_);
    }

    @Override // qk.k
    public long getCampaignStartTimeMillis() {
        return this.campaignStartTimeMillis_;
    }

    @Override // qk.k
    public String getExperimentalCampaignId() {
        return this.experimentalCampaignId_;
    }

    @Override // qk.k
    public ByteString getExperimentalCampaignIdBytes() {
        return ByteString.copyFromUtf8(this.experimentalCampaignId_);
    }

    public static j newBuilder(CampaignProto$VanillaCampaignPayload campaignProto$VanillaCampaignPayload) {
        return DEFAULT_INSTANCE.createBuilder(campaignProto$VanillaCampaignPayload);
    }

    public static CampaignProto$VanillaCampaignPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
