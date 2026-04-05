package com.google.firebase.inappmessaging;

import bj.k0;
import bj.m0;
import bj.n0;
import bj.q0;
import bj.r0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ExperimentPayloadProto$ExperimentPayload extends GeneratedMessageLite<ExperimentPayloadProto$ExperimentPayload, n0> implements r0 {
    public static final int ACTIVATE_EVENT_TO_LOG_FIELD_NUMBER = 8;
    public static final int CLEAR_EVENT_TO_LOG_FIELD_NUMBER = 9;
    private static final ExperimentPayloadProto$ExperimentPayload DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    public static final int EXPERIMENT_START_TIME_MILLIS_FIELD_NUMBER = 3;
    public static final int ONGOING_EXPERIMENTS_FIELD_NUMBER = 13;
    public static final int OVERFLOW_POLICY_FIELD_NUMBER = 12;
    private static volatile Parser<ExperimentPayloadProto$ExperimentPayload> PARSER = null;
    public static final int SET_EVENT_TO_LOG_FIELD_NUMBER = 7;
    public static final int TIMEOUT_EVENT_TO_LOG_FIELD_NUMBER = 10;
    public static final int TIME_TO_LIVE_MILLIS_FIELD_NUMBER = 6;
    public static final int TRIGGER_EVENT_FIELD_NUMBER = 4;
    public static final int TRIGGER_TIMEOUT_MILLIS_FIELD_NUMBER = 5;
    public static final int TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER = 11;
    public static final int VARIANT_ID_FIELD_NUMBER = 2;
    private long experimentStartTimeMillis_;
    private int overflowPolicy_;
    private long timeToLiveMillis_;
    private long triggerTimeoutMillis_;
    private String experimentId_ = "";
    private String variantId_ = "";
    private String triggerEvent_ = "";
    private String setEventToLog_ = "";
    private String activateEventToLog_ = "";
    private String clearEventToLog_ = "";
    private String timeoutEventToLog_ = "";
    private String ttlExpiryEventToLog_ = "";
    private Internal.ProtobufList<ExperimentPayloadProto$ExperimentLite> ongoingExperiments_ = GeneratedMessageLite.emptyProtobufList();

    static {
        ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload = new ExperimentPayloadProto$ExperimentPayload();
        DEFAULT_INSTANCE = experimentPayloadProto$ExperimentPayload;
        GeneratedMessageLite.registerDefaultInstance(ExperimentPayloadProto$ExperimentPayload.class, experimentPayloadProto$ExperimentPayload);
    }

    private ExperimentPayloadProto$ExperimentPayload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOngoingExperiments(Iterable<? extends ExperimentPayloadProto$ExperimentLite> iterable) {
        ensureOngoingExperimentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.ongoingExperiments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOngoingExperiments(ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite) {
        experimentPayloadProto$ExperimentLite.getClass();
        ensureOngoingExperimentsIsMutable();
        this.ongoingExperiments_.add(experimentPayloadProto$ExperimentLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivateEventToLog() {
        this.activateEventToLog_ = getDefaultInstance().getActivateEventToLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClearEventToLog() {
        this.clearEventToLog_ = getDefaultInstance().getClearEventToLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentId() {
        this.experimentId_ = getDefaultInstance().getExperimentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentStartTimeMillis() {
        this.experimentStartTimeMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOngoingExperiments() {
        this.ongoingExperiments_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverflowPolicy() {
        this.overflowPolicy_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetEventToLog() {
        this.setEventToLog_ = getDefaultInstance().getSetEventToLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToLiveMillis() {
        this.timeToLiveMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeoutEventToLog() {
        this.timeoutEventToLog_ = getDefaultInstance().getTimeoutEventToLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerEvent() {
        this.triggerEvent_ = getDefaultInstance().getTriggerEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerTimeoutMillis() {
        this.triggerTimeoutMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtlExpiryEventToLog() {
        this.ttlExpiryEventToLog_ = getDefaultInstance().getTtlExpiryEventToLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVariantId() {
        this.variantId_ = getDefaultInstance().getVariantId();
    }

    private void ensureOngoingExperimentsIsMutable() {
        Internal.ProtobufList<ExperimentPayloadProto$ExperimentLite> protobufList = this.ongoingExperiments_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.ongoingExperiments_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ExperimentPayloadProto$ExperimentPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExperimentPayloadProto$ExperimentPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExperimentPayloadProto$ExperimentPayload> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOngoingExperiments(int i10) {
        ensureOngoingExperimentsIsMutable();
        this.ongoingExperiments_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivateEventToLog(String str) {
        str.getClass();
        this.activateEventToLog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivateEventToLogBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.activateEventToLog_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClearEventToLog(String str) {
        str.getClass();
        this.clearEventToLog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClearEventToLogBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clearEventToLog_ = byteString.toStringUtf8();
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
    public void setExperimentStartTimeMillis(long j10) {
        this.experimentStartTimeMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOngoingExperiments(int i10, ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite) {
        experimentPayloadProto$ExperimentLite.getClass();
        ensureOngoingExperimentsIsMutable();
        this.ongoingExperiments_.set(i10, experimentPayloadProto$ExperimentLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverflowPolicy(q0 q0Var) {
        this.overflowPolicy_ = q0Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverflowPolicyValue(int i10) {
        this.overflowPolicy_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetEventToLog(String str) {
        str.getClass();
        this.setEventToLog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetEventToLogBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.setEventToLog_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToLiveMillis(long j10) {
        this.timeToLiveMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutEventToLog(String str) {
        str.getClass();
        this.timeoutEventToLog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutEventToLogBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.timeoutEventToLog_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerEvent(String str) {
        str.getClass();
        this.triggerEvent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerEventBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.triggerEvent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerTimeoutMillis(long j10) {
        this.triggerTimeoutMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtlExpiryEventToLog(String str) {
        str.getClass();
        this.ttlExpiryEventToLog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtlExpiryEventToLogBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ttlExpiryEventToLog_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVariantId(String str) {
        str.getClass();
        this.variantId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVariantIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.variantId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (k0.f9647a[methodToInvoke.ordinal()]) {
            case 1:
                return new ExperimentPayloadProto$ExperimentPayload();
            case 2:
                return new n0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"experimentId_", "variantId_", "experimentStartTimeMillis_", "triggerEvent_", "triggerTimeoutMillis_", "timeToLiveMillis_", "setEventToLog_", "activateEventToLog_", "clearEventToLog_", "timeoutEventToLog_", "ttlExpiryEventToLog_", "overflowPolicy_", "ongoingExperiments_", ExperimentPayloadProto$ExperimentLite.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExperimentPayloadProto$ExperimentPayload> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ExperimentPayloadProto$ExperimentPayload.class) {
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

    @Override // bj.r0
    public String getActivateEventToLog() {
        return this.activateEventToLog_;
    }

    @Override // bj.r0
    public ByteString getActivateEventToLogBytes() {
        return ByteString.copyFromUtf8(this.activateEventToLog_);
    }

    @Override // bj.r0
    public String getClearEventToLog() {
        return this.clearEventToLog_;
    }

    @Override // bj.r0
    public ByteString getClearEventToLogBytes() {
        return ByteString.copyFromUtf8(this.clearEventToLog_);
    }

    @Override // bj.r0
    public String getExperimentId() {
        return this.experimentId_;
    }

    @Override // bj.r0
    public ByteString getExperimentIdBytes() {
        return ByteString.copyFromUtf8(this.experimentId_);
    }

    @Override // bj.r0
    public long getExperimentStartTimeMillis() {
        return this.experimentStartTimeMillis_;
    }

    @Override // bj.r0
    public ExperimentPayloadProto$ExperimentLite getOngoingExperiments(int i10) {
        return this.ongoingExperiments_.get(i10);
    }

    @Override // bj.r0
    public int getOngoingExperimentsCount() {
        return this.ongoingExperiments_.size();
    }

    @Override // bj.r0
    public List<ExperimentPayloadProto$ExperimentLite> getOngoingExperimentsList() {
        return this.ongoingExperiments_;
    }

    public m0 getOngoingExperimentsOrBuilder(int i10) {
        return this.ongoingExperiments_.get(i10);
    }

    public List<? extends m0> getOngoingExperimentsOrBuilderList() {
        return this.ongoingExperiments_;
    }

    @Override // bj.r0
    public q0 getOverflowPolicy() {
        q0 q0VarForNumber = q0.forNumber(this.overflowPolicy_);
        return q0VarForNumber == null ? q0.UNRECOGNIZED : q0VarForNumber;
    }

    @Override // bj.r0
    public int getOverflowPolicyValue() {
        return this.overflowPolicy_;
    }

    @Override // bj.r0
    public String getSetEventToLog() {
        return this.setEventToLog_;
    }

    @Override // bj.r0
    public ByteString getSetEventToLogBytes() {
        return ByteString.copyFromUtf8(this.setEventToLog_);
    }

    @Override // bj.r0
    public long getTimeToLiveMillis() {
        return this.timeToLiveMillis_;
    }

    @Override // bj.r0
    public String getTimeoutEventToLog() {
        return this.timeoutEventToLog_;
    }

    @Override // bj.r0
    public ByteString getTimeoutEventToLogBytes() {
        return ByteString.copyFromUtf8(this.timeoutEventToLog_);
    }

    @Override // bj.r0
    public String getTriggerEvent() {
        return this.triggerEvent_;
    }

    @Override // bj.r0
    public ByteString getTriggerEventBytes() {
        return ByteString.copyFromUtf8(this.triggerEvent_);
    }

    @Override // bj.r0
    public long getTriggerTimeoutMillis() {
        return this.triggerTimeoutMillis_;
    }

    @Override // bj.r0
    public String getTtlExpiryEventToLog() {
        return this.ttlExpiryEventToLog_;
    }

    @Override // bj.r0
    public ByteString getTtlExpiryEventToLogBytes() {
        return ByteString.copyFromUtf8(this.ttlExpiryEventToLog_);
    }

    @Override // bj.r0
    public String getVariantId() {
        return this.variantId_;
    }

    @Override // bj.r0
    public ByteString getVariantIdBytes() {
        return ByteString.copyFromUtf8(this.variantId_);
    }

    public static n0 newBuilder(ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload) {
        return DEFAULT_INSTANCE.createBuilder(experimentPayloadProto$ExperimentPayload);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOngoingExperiments(int i10, ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite) {
        experimentPayloadProto$ExperimentLite.getClass();
        ensureOngoingExperimentsIsMutable();
        this.ongoingExperiments_.add(i10, experimentPayloadProto$ExperimentLite);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(InputStream inputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
