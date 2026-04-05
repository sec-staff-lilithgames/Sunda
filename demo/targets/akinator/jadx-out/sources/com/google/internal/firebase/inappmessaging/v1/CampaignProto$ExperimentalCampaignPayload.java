package com.google.internal.firebase.inappmessaging.v1;

import bj.n0;
import com.google.firebase.inappmessaging.ExperimentPayloadProto$ExperimentPayload;
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
import qk.b;
import qk.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CampaignProto$ExperimentalCampaignPayload extends GeneratedMessageLite<CampaignProto$ExperimentalCampaignPayload, b> implements c {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final CampaignProto$ExperimentalCampaignPayload DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PAYLOAD_FIELD_NUMBER = 2;
    private static volatile Parser<CampaignProto$ExperimentalCampaignPayload> PARSER;
    private int bitField0_;
    private long campaignEndTimeMillis_;
    private String campaignId_ = "";
    private String campaignName_ = "";
    private long campaignStartTimeMillis_;
    private ExperimentPayloadProto$ExperimentPayload experimentPayload_;

    static {
        CampaignProto$ExperimentalCampaignPayload campaignProto$ExperimentalCampaignPayload = new CampaignProto$ExperimentalCampaignPayload();
        DEFAULT_INSTANCE = campaignProto$ExperimentalCampaignPayload;
        GeneratedMessageLite.registerDefaultInstance(CampaignProto$ExperimentalCampaignPayload.class, campaignProto$ExperimentalCampaignPayload);
    }

    private CampaignProto$ExperimentalCampaignPayload() {
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
    public void clearExperimentPayload() {
        this.experimentPayload_ = null;
        this.bitField0_ &= -2;
    }

    public static CampaignProto$ExperimentalCampaignPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExperimentPayload(ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload) {
        experimentPayloadProto$ExperimentPayload.getClass();
        ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload2 = this.experimentPayload_;
        if (experimentPayloadProto$ExperimentPayload2 == null || experimentPayloadProto$ExperimentPayload2 == ExperimentPayloadProto$ExperimentPayload.getDefaultInstance()) {
            this.experimentPayload_ = experimentPayloadProto$ExperimentPayload;
        } else {
            this.experimentPayload_ = (ExperimentPayloadProto$ExperimentPayload) ((n0) ExperimentPayloadProto$ExperimentPayload.newBuilder(this.experimentPayload_).mergeFrom((n0) experimentPayloadProto$ExperimentPayload)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignProto$ExperimentalCampaignPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CampaignProto$ExperimentalCampaignPayload> parser() {
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
    public void setExperimentPayload(ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload) {
        experimentPayloadProto$ExperimentPayload.getClass();
        this.experimentPayload_ = experimentPayloadProto$ExperimentPayload;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f83271a[methodToInvoke.ordinal()]) {
            case 1:
                return new CampaignProto$ExperimentalCampaignPayload();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"bitField0_", "campaignId_", "experimentPayload_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CampaignProto$ExperimentalCampaignPayload> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CampaignProto$ExperimentalCampaignPayload.class) {
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

    @Override // qk.c
    public long getCampaignEndTimeMillis() {
        return this.campaignEndTimeMillis_;
    }

    @Override // qk.c
    public String getCampaignId() {
        return this.campaignId_;
    }

    @Override // qk.c
    public ByteString getCampaignIdBytes() {
        return ByteString.copyFromUtf8(this.campaignId_);
    }

    @Override // qk.c
    public String getCampaignName() {
        return this.campaignName_;
    }

    @Override // qk.c
    public ByteString getCampaignNameBytes() {
        return ByteString.copyFromUtf8(this.campaignName_);
    }

    @Override // qk.c
    public long getCampaignStartTimeMillis() {
        return this.campaignStartTimeMillis_;
    }

    @Override // qk.c
    public ExperimentPayloadProto$ExperimentPayload getExperimentPayload() {
        ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload = this.experimentPayload_;
        return experimentPayloadProto$ExperimentPayload == null ? ExperimentPayloadProto$ExperimentPayload.getDefaultInstance() : experimentPayloadProto$ExperimentPayload;
    }

    @Override // qk.c
    public boolean hasExperimentPayload() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(CampaignProto$ExperimentalCampaignPayload campaignProto$ExperimentalCampaignPayload) {
        return DEFAULT_INSTANCE.createBuilder(campaignProto$ExperimentalCampaignPayload);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
