package com.google.firebase.inappmessaging;

import bj.b0;
import bj.c0;
import bj.d0;
import bj.h;
import bj.o;
import bj.y;
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
/* loaded from: classes7.dex */
public final class CommonTypesProto$TriggeringCondition extends GeneratedMessageLite<CommonTypesProto$TriggeringCondition, b0> implements d0 {
    private static final CommonTypesProto$TriggeringCondition DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
    private static volatile Parser<CommonTypesProto$TriggeringCondition> PARSER;
    private int conditionCase_ = 0;
    private Object condition_;

    static {
        CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition = new CommonTypesProto$TriggeringCondition();
        DEFAULT_INSTANCE = commonTypesProto$TriggeringCondition;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$TriggeringCondition.class, commonTypesProto$TriggeringCondition);
    }

    private CommonTypesProto$TriggeringCondition() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCondition() {
        this.conditionCase_ = 0;
        this.condition_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        if (this.conditionCase_ == 2) {
            this.conditionCase_ = 0;
            this.condition_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFiamTrigger() {
        if (this.conditionCase_ == 1) {
            this.conditionCase_ = 0;
            this.condition_ = null;
        }
    }

    public static CommonTypesProto$TriggeringCondition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvent(CommonTypesProto$Event commonTypesProto$Event) {
        commonTypesProto$Event.getClass();
        if (this.conditionCase_ != 2 || this.condition_ == CommonTypesProto$Event.getDefaultInstance()) {
            this.condition_ = commonTypesProto$Event;
        } else {
            this.condition_ = ((o) CommonTypesProto$Event.newBuilder((CommonTypesProto$Event) this.condition_).mergeFrom((o) commonTypesProto$Event)).buildPartial();
        }
        this.conditionCase_ = 2;
    }

    public static b0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$TriggeringCondition parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CommonTypesProto$TriggeringCondition> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(CommonTypesProto$Event commonTypesProto$Event) {
        commonTypesProto$Event.getClass();
        this.condition_ = commonTypesProto$Event;
        this.conditionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFiamTrigger(y yVar) {
        this.condition_ = Integer.valueOf(yVar.getNumber());
        this.conditionCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFiamTriggerValue(int i10) {
        this.conditionCase_ = 1;
        this.condition_ = Integer.valueOf(i10);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (h.f9639a[methodToInvoke.ordinal()]) {
            case 1:
                return new CommonTypesProto$TriggeringCondition();
            case 2:
                return new b0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", CommonTypesProto$Event.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CommonTypesProto$TriggeringCondition> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CommonTypesProto$TriggeringCondition.class) {
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

    @Override // bj.d0
    public c0 getConditionCase() {
        return c0.forNumber(this.conditionCase_);
    }

    @Override // bj.d0
    public CommonTypesProto$Event getEvent() {
        return this.conditionCase_ == 2 ? (CommonTypesProto$Event) this.condition_ : CommonTypesProto$Event.getDefaultInstance();
    }

    @Override // bj.d0
    public y getFiamTrigger() {
        if (this.conditionCase_ != 1) {
            return y.UNKNOWN_TRIGGER;
        }
        y yVarForNumber = y.forNumber(((Integer) this.condition_).intValue());
        return yVarForNumber == null ? y.UNRECOGNIZED : yVarForNumber;
    }

    @Override // bj.d0
    public int getFiamTriggerValue() {
        if (this.conditionCase_ == 1) {
            return ((Integer) this.condition_).intValue();
        }
        return 0;
    }

    @Override // bj.d0
    public boolean hasEvent() {
        return this.conditionCase_ == 2;
    }

    @Override // bj.d0
    public boolean hasFiamTrigger() {
        return this.conditionCase_ == 1;
    }

    public static b0 newBuilder(CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        return DEFAULT_INSTANCE.createBuilder(commonTypesProto$TriggeringCondition);
    }

    public static CommonTypesProto$TriggeringCondition parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
