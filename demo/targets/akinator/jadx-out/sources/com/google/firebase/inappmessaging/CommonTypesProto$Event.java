package com.google.firebase.inappmessaging;

import bj.a0;
import bj.h;
import bj.o;
import bj.p;
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
public final class CommonTypesProto$Event extends GeneratedMessageLite<CommonTypesProto$Event, o> implements p {
    public static final int COUNT_FIELD_NUMBER = 5;
    private static final CommonTypesProto$Event DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<CommonTypesProto$Event> PARSER = null;
    public static final int PREVIOUS_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 3;
    public static final int TRIGGER_PARAMS_FIELD_NUMBER = 1;
    private int count_;
    private long previousTimestampMillis_;
    private long timestampMillis_;
    private Internal.ProtobufList<CommonTypesProto$TriggerParam> triggerParams_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";

    static {
        CommonTypesProto$Event commonTypesProto$Event = new CommonTypesProto$Event();
        DEFAULT_INSTANCE = commonTypesProto$Event;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$Event.class, commonTypesProto$Event);
    }

    private CommonTypesProto$Event() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTriggerParams(Iterable<? extends CommonTypesProto$TriggerParam> iterable) {
        ensureTriggerParamsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.triggerParams_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriggerParams(CommonTypesProto$TriggerParam commonTypesProto$TriggerParam) {
        commonTypesProto$TriggerParam.getClass();
        ensureTriggerParamsIsMutable();
        this.triggerParams_.add(commonTypesProto$TriggerParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviousTimestampMillis() {
        this.previousTimestampMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampMillis() {
        this.timestampMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerParams() {
        this.triggerParams_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureTriggerParamsIsMutable() {
        Internal.ProtobufList<CommonTypesProto$TriggerParam> protobufList = this.triggerParams_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.triggerParams_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CommonTypesProto$Event getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static o newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$Event parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CommonTypesProto$Event> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTriggerParams(int i10) {
        ensureTriggerParamsIsMutable();
        this.triggerParams_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i10) {
        this.count_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviousTimestampMillis(long j10) {
        this.previousTimestampMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampMillis(long j10) {
        this.timestampMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerParams(int i10, CommonTypesProto$TriggerParam commonTypesProto$TriggerParam) {
        commonTypesProto$TriggerParam.getClass();
        ensureTriggerParamsIsMutable();
        this.triggerParams_.set(i10, commonTypesProto$TriggerParam);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (h.f9639a[methodToInvoke.ordinal()]) {
            case 1:
                return new CommonTypesProto$Event();
            case 2:
                return new o(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0004", new Object[]{"triggerParams_", CommonTypesProto$TriggerParam.class, "name_", "timestampMillis_", "previousTimestampMillis_", "count_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CommonTypesProto$Event> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CommonTypesProto$Event.class) {
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

    @Override // bj.p
    public int getCount() {
        return this.count_;
    }

    @Override // bj.p
    public String getName() {
        return this.name_;
    }

    @Override // bj.p
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // bj.p
    public long getPreviousTimestampMillis() {
        return this.previousTimestampMillis_;
    }

    @Override // bj.p
    public long getTimestampMillis() {
        return this.timestampMillis_;
    }

    @Override // bj.p
    public CommonTypesProto$TriggerParam getTriggerParams(int i10) {
        return this.triggerParams_.get(i10);
    }

    @Override // bj.p
    public int getTriggerParamsCount() {
        return this.triggerParams_.size();
    }

    @Override // bj.p
    public List<CommonTypesProto$TriggerParam> getTriggerParamsList() {
        return this.triggerParams_;
    }

    public a0 getTriggerParamsOrBuilder(int i10) {
        return this.triggerParams_.get(i10);
    }

    public List<? extends a0> getTriggerParamsOrBuilderList() {
        return this.triggerParams_;
    }

    public static o newBuilder(CommonTypesProto$Event commonTypesProto$Event) {
        return DEFAULT_INSTANCE.createBuilder(commonTypesProto$Event);
    }

    public static CommonTypesProto$Event parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$Event parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CommonTypesProto$Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriggerParams(int i10, CommonTypesProto$TriggerParam commonTypesProto$TriggerParam) {
        commonTypesProto$TriggerParam.getClass();
        ensureTriggerParamsIsMutable();
        this.triggerParams_.add(i10, commonTypesProto$TriggerParam);
    }

    public static CommonTypesProto$Event parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CommonTypesProto$Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$Event parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CommonTypesProto$Event parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$Event parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$Event parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$Event parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
