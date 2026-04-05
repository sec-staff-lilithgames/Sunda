package com.google.internal.firebase.inappmessaging.v1;

import bj.i;
import bj.s;
import com.google.firebase.inappmessaging.CommonTypesProto$CampaignTime;
import com.google.firebase.inappmessaging.CommonTypesProto$Priority;
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
import qk.d;
import qk.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CampaignProto$ExperimentalCampaignRollout extends GeneratedMessageLite<CampaignProto$ExperimentalCampaignRollout, d> implements e {
    private static final CampaignProto$ExperimentalCampaignRollout DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 5;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    private static volatile Parser<CampaignProto$ExperimentalCampaignRollout> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 3;
    public static final int SELECTED_VARIANT_INDEX_FIELD_NUMBER = 2;
    public static final int START_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private CommonTypesProto$CampaignTime endTime_;
    private String experimentId_ = "";
    private CommonTypesProto$Priority priority_;
    private int selectedVariantIndex_;
    private CommonTypesProto$CampaignTime startTime_;

    static {
        CampaignProto$ExperimentalCampaignRollout campaignProto$ExperimentalCampaignRollout = new CampaignProto$ExperimentalCampaignRollout();
        DEFAULT_INSTANCE = campaignProto$ExperimentalCampaignRollout;
        GeneratedMessageLite.registerDefaultInstance(CampaignProto$ExperimentalCampaignRollout.class, campaignProto$ExperimentalCampaignRollout);
    }

    private CampaignProto$ExperimentalCampaignRollout() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentId() {
        this.experimentId_ = getDefaultInstance().getExperimentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedVariantIndex() {
        this.selectedVariantIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = null;
        this.bitField0_ &= -3;
    }

    public static CampaignProto$ExperimentalCampaignRollout getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        commonTypesProto$CampaignTime.getClass();
        CommonTypesProto$CampaignTime commonTypesProto$CampaignTime2 = this.endTime_;
        if (commonTypesProto$CampaignTime2 == null || commonTypesProto$CampaignTime2 == CommonTypesProto$CampaignTime.getDefaultInstance()) {
            this.endTime_ = commonTypesProto$CampaignTime;
        } else {
            this.endTime_ = (CommonTypesProto$CampaignTime) ((i) CommonTypesProto$CampaignTime.newBuilder(this.endTime_).mergeFrom((i) commonTypesProto$CampaignTime)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePriority(CommonTypesProto$Priority commonTypesProto$Priority) {
        commonTypesProto$Priority.getClass();
        CommonTypesProto$Priority commonTypesProto$Priority2 = this.priority_;
        if (commonTypesProto$Priority2 == null || commonTypesProto$Priority2 == CommonTypesProto$Priority.getDefaultInstance()) {
            this.priority_ = commonTypesProto$Priority;
        } else {
            this.priority_ = (CommonTypesProto$Priority) ((s) CommonTypesProto$Priority.newBuilder(this.priority_).mergeFrom((s) commonTypesProto$Priority)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        commonTypesProto$CampaignTime.getClass();
        CommonTypesProto$CampaignTime commonTypesProto$CampaignTime2 = this.startTime_;
        if (commonTypesProto$CampaignTime2 == null || commonTypesProto$CampaignTime2 == CommonTypesProto$CampaignTime.getDefaultInstance()) {
            this.startTime_ = commonTypesProto$CampaignTime;
        } else {
            this.startTime_ = (CommonTypesProto$CampaignTime) ((i) CommonTypesProto$CampaignTime.newBuilder(this.startTime_).mergeFrom((i) commonTypesProto$CampaignTime)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static d newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignProto$ExperimentalCampaignRollout parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CampaignProto$ExperimentalCampaignRollout> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        commonTypesProto$CampaignTime.getClass();
        this.endTime_ = commonTypesProto$CampaignTime;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentId(String str) {
        str.getClass();
        this.experimentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.experimentId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(CommonTypesProto$Priority commonTypesProto$Priority) {
        commonTypesProto$Priority.getClass();
        this.priority_ = commonTypesProto$Priority;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedVariantIndex(int i10) {
        this.selectedVariantIndex_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        commonTypesProto$CampaignTime.getClass();
        this.startTime_ = commonTypesProto$CampaignTime;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f83271a[methodToInvoke.ordinal()]) {
            case 1:
                return new CampaignProto$ExperimentalCampaignRollout();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "experimentId_", "selectedVariantIndex_", "priority_", "startTime_", "endTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CampaignProto$ExperimentalCampaignRollout> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CampaignProto$ExperimentalCampaignRollout.class) {
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

    @Override // qk.e
    public CommonTypesProto$CampaignTime getEndTime() {
        CommonTypesProto$CampaignTime commonTypesProto$CampaignTime = this.endTime_;
        return commonTypesProto$CampaignTime == null ? CommonTypesProto$CampaignTime.getDefaultInstance() : commonTypesProto$CampaignTime;
    }

    @Override // qk.e
    public String getExperimentId() {
        return this.experimentId_;
    }

    @Override // qk.e
    public ByteString getExperimentIdBytes() {
        return ByteString.copyFromUtf8(this.experimentId_);
    }

    @Override // qk.e
    public CommonTypesProto$Priority getPriority() {
        CommonTypesProto$Priority commonTypesProto$Priority = this.priority_;
        return commonTypesProto$Priority == null ? CommonTypesProto$Priority.getDefaultInstance() : commonTypesProto$Priority;
    }

    @Override // qk.e
    public int getSelectedVariantIndex() {
        return this.selectedVariantIndex_;
    }

    @Override // qk.e
    public CommonTypesProto$CampaignTime getStartTime() {
        CommonTypesProto$CampaignTime commonTypesProto$CampaignTime = this.startTime_;
        return commonTypesProto$CampaignTime == null ? CommonTypesProto$CampaignTime.getDefaultInstance() : commonTypesProto$CampaignTime;
    }

    @Override // qk.e
    public boolean hasEndTime() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // qk.e
    public boolean hasPriority() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // qk.e
    public boolean hasStartTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public static d newBuilder(CampaignProto$ExperimentalCampaignRollout campaignProto$ExperimentalCampaignRollout) {
        return DEFAULT_INSTANCE.createBuilder(campaignProto$ExperimentalCampaignRollout);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
