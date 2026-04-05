package com.google.internal.firebase.inappmessaging.v1;

import bj.d0;
import bj.o1;
import bj.s;
import com.google.firebase.inappmessaging.CommonTypesProto$Priority;
import com.google.firebase.inappmessaging.CommonTypesProto$TriggeringCondition;
import com.google.firebase.inappmessaging.MessagesProto$Content;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import qk.a;
import qk.b;
import qk.f;
import qk.g;
import qk.h;
import qk.i;
import qk.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CampaignProto$ThickContent extends GeneratedMessageLite<CampaignProto$ThickContent, f> implements i {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    private static final CampaignProto$ThickContent DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile Parser<CampaignProto$ThickContent> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private int bitField0_;
    private MessagesProto$Content content_;
    private boolean isTestCampaign_;
    private Object payload_;
    private CommonTypesProto$Priority priority_;
    private int payloadCase_ = 0;
    private MapFieldLite<String, String> dataBundle_ = MapFieldLite.emptyMapField();
    private Internal.ProtobufList<CommonTypesProto$TriggeringCondition> triggeringConditions_ = GeneratedMessageLite.emptyProtobufList();

    static {
        CampaignProto$ThickContent campaignProto$ThickContent = new CampaignProto$ThickContent();
        DEFAULT_INSTANCE = campaignProto$ThickContent;
        GeneratedMessageLite.registerDefaultInstance(CampaignProto$ThickContent.class, campaignProto$ThickContent);
    }

    private CampaignProto$ThickContent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTriggeringConditions(Iterable<? extends CommonTypesProto$TriggeringCondition> iterable) {
        ensureTriggeringConditionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.triggeringConditions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriggeringConditions(CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        commonTypesProto$TriggeringCondition.getClass();
        ensureTriggeringConditionsIsMutable();
        this.triggeringConditions_.add(commonTypesProto$TriggeringCondition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentalPayload() {
        if (this.payloadCase_ == 2) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTestCampaign() {
        this.isTestCampaign_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payloadCase_ = 0;
        this.payload_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringConditions() {
        this.triggeringConditions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVanillaPayload() {
        if (this.payloadCase_ == 1) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void ensureTriggeringConditionsIsMutable() {
        Internal.ProtobufList<CommonTypesProto$TriggeringCondition> protobufList = this.triggeringConditions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.triggeringConditions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CampaignProto$ThickContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableDataBundleMap() {
        return internalGetMutableDataBundle();
    }

    private MapFieldLite<String, String> internalGetDataBundle() {
        return this.dataBundle_;
    }

    private MapFieldLite<String, String> internalGetMutableDataBundle() {
        if (!this.dataBundle_.isMutable()) {
            this.dataBundle_ = this.dataBundle_.mutableCopy();
        }
        return this.dataBundle_;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExperimentalPayload(CampaignProto$ExperimentalCampaignPayload campaignProto$ExperimentalCampaignPayload) {
        campaignProto$ExperimentalCampaignPayload.getClass();
        if (this.payloadCase_ != 2 || this.payload_ == CampaignProto$ExperimentalCampaignPayload.getDefaultInstance()) {
            this.payload_ = campaignProto$ExperimentalCampaignPayload;
        } else {
            this.payload_ = ((b) CampaignProto$ExperimentalCampaignPayload.newBuilder((CampaignProto$ExperimentalCampaignPayload) this.payload_).mergeFrom((b) campaignProto$ExperimentalCampaignPayload)).buildPartial();
        }
        this.payloadCase_ = 2;
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
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVanillaPayload(CampaignProto$VanillaCampaignPayload campaignProto$VanillaCampaignPayload) {
        campaignProto$VanillaCampaignPayload.getClass();
        if (this.payloadCase_ != 1 || this.payload_ == CampaignProto$VanillaCampaignPayload.getDefaultInstance()) {
            this.payload_ = campaignProto$VanillaCampaignPayload;
        } else {
            this.payload_ = ((j) CampaignProto$VanillaCampaignPayload.newBuilder((CampaignProto$VanillaCampaignPayload) this.payload_).mergeFrom((j) campaignProto$VanillaCampaignPayload)).buildPartial();
        }
        this.payloadCase_ = 1;
    }

    public static f newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignProto$ThickContent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ThickContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CampaignProto$ThickContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTriggeringConditions(int i10) {
        ensureTriggeringConditionsIsMutable();
        this.triggeringConditions_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(MessagesProto$Content messagesProto$Content) {
        messagesProto$Content.getClass();
        this.content_ = messagesProto$Content;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalPayload(CampaignProto$ExperimentalCampaignPayload campaignProto$ExperimentalCampaignPayload) {
        campaignProto$ExperimentalCampaignPayload.getClass();
        this.payload_ = campaignProto$ExperimentalCampaignPayload;
        this.payloadCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTestCampaign(boolean z10) {
        this.isTestCampaign_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(CommonTypesProto$Priority commonTypesProto$Priority) {
        commonTypesProto$Priority.getClass();
        this.priority_ = commonTypesProto$Priority;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringConditions(int i10, CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        commonTypesProto$TriggeringCondition.getClass();
        ensureTriggeringConditionsIsMutable();
        this.triggeringConditions_.set(i10, commonTypesProto$TriggeringCondition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVanillaPayload(CampaignProto$VanillaCampaignPayload campaignProto$VanillaCampaignPayload) {
        campaignProto$VanillaCampaignPayload.getClass();
        this.payload_ = campaignProto$VanillaCampaignPayload;
        this.payloadCase_ = 1;
    }

    @Override // qk.i
    public boolean containsDataBundle(String str) {
        str.getClass();
        return internalGetDataBundle().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f83271a[methodToInvoke.ordinal()]) {
            case 1:
                return new CampaignProto$ThickContent();
            case 2:
                return new f(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", "bitField0_", CampaignProto$VanillaCampaignPayload.class, CampaignProto$ExperimentalCampaignPayload.class, "content_", "priority_", "triggeringConditions_", CommonTypesProto$TriggeringCondition.class, "isTestCampaign_", "dataBundle_", g.f83272a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CampaignProto$ThickContent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CampaignProto$ThickContent.class) {
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

    @Override // qk.i
    public MessagesProto$Content getContent() {
        MessagesProto$Content messagesProto$Content = this.content_;
        return messagesProto$Content == null ? MessagesProto$Content.getDefaultInstance() : messagesProto$Content;
    }

    @Override // qk.i
    @Deprecated
    public Map<String, String> getDataBundle() {
        return getDataBundleMap();
    }

    @Override // qk.i
    public int getDataBundleCount() {
        return internalGetDataBundle().size();
    }

    @Override // qk.i
    public Map<String, String> getDataBundleMap() {
        return Collections.unmodifiableMap(internalGetDataBundle());
    }

    @Override // qk.i
    public String getDataBundleOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetDataBundle = internalGetDataBundle();
        return mapFieldLiteInternalGetDataBundle.containsKey(str) ? mapFieldLiteInternalGetDataBundle.get(str) : str2;
    }

    @Override // qk.i
    public String getDataBundleOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetDataBundle = internalGetDataBundle();
        if (mapFieldLiteInternalGetDataBundle.containsKey(str)) {
            return mapFieldLiteInternalGetDataBundle.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // qk.i
    public CampaignProto$ExperimentalCampaignPayload getExperimentalPayload() {
        return this.payloadCase_ == 2 ? (CampaignProto$ExperimentalCampaignPayload) this.payload_ : CampaignProto$ExperimentalCampaignPayload.getDefaultInstance();
    }

    @Override // qk.i
    public boolean getIsTestCampaign() {
        return this.isTestCampaign_;
    }

    @Override // qk.i
    public h getPayloadCase() {
        return h.forNumber(this.payloadCase_);
    }

    @Override // qk.i
    public CommonTypesProto$Priority getPriority() {
        CommonTypesProto$Priority commonTypesProto$Priority = this.priority_;
        return commonTypesProto$Priority == null ? CommonTypesProto$Priority.getDefaultInstance() : commonTypesProto$Priority;
    }

    @Override // qk.i
    public CommonTypesProto$TriggeringCondition getTriggeringConditions(int i10) {
        return this.triggeringConditions_.get(i10);
    }

    @Override // qk.i
    public int getTriggeringConditionsCount() {
        return this.triggeringConditions_.size();
    }

    @Override // qk.i
    public List<CommonTypesProto$TriggeringCondition> getTriggeringConditionsList() {
        return this.triggeringConditions_;
    }

    public d0 getTriggeringConditionsOrBuilder(int i10) {
        return this.triggeringConditions_.get(i10);
    }

    public List<? extends d0> getTriggeringConditionsOrBuilderList() {
        return this.triggeringConditions_;
    }

    @Override // qk.i
    public CampaignProto$VanillaCampaignPayload getVanillaPayload() {
        return this.payloadCase_ == 1 ? (CampaignProto$VanillaCampaignPayload) this.payload_ : CampaignProto$VanillaCampaignPayload.getDefaultInstance();
    }

    @Override // qk.i
    public boolean hasContent() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // qk.i
    public boolean hasExperimentalPayload() {
        return this.payloadCase_ == 2;
    }

    @Override // qk.i
    public boolean hasPriority() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // qk.i
    public boolean hasVanillaPayload() {
        return this.payloadCase_ == 1;
    }

    public static f newBuilder(CampaignProto$ThickContent campaignProto$ThickContent) {
        return DEFAULT_INSTANCE.createBuilder(campaignProto$ThickContent);
    }

    public static CampaignProto$ThickContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignProto$ThickContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CampaignProto$ThickContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriggeringConditions(int i10, CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        commonTypesProto$TriggeringCondition.getClass();
        ensureTriggeringConditionsIsMutable();
        this.triggeringConditions_.add(i10, commonTypesProto$TriggeringCondition);
    }

    public static CampaignProto$ThickContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CampaignProto$ThickContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignProto$ThickContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CampaignProto$ThickContent parseFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ThickContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignProto$ThickContent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignProto$ThickContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
