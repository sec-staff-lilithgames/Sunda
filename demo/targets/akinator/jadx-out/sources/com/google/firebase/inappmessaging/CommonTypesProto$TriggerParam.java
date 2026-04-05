package com.google.firebase.inappmessaging;

import bj.a0;
import bj.h;
import bj.z;
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
/* loaded from: classes7.dex */
public final class CommonTypesProto$TriggerParam extends GeneratedMessageLite<CommonTypesProto$TriggerParam, z> implements a0 {
    private static final CommonTypesProto$TriggerParam DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
    public static final int INT_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<CommonTypesProto$TriggerParam> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 2;
    private double doubleValue_;
    private float floatValue_;
    private long intValue_;
    private String name_ = "";
    private String stringValue_ = "";

    static {
        CommonTypesProto$TriggerParam commonTypesProto$TriggerParam = new CommonTypesProto$TriggerParam();
        DEFAULT_INSTANCE = commonTypesProto$TriggerParam;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$TriggerParam.class, commonTypesProto$TriggerParam);
    }

    private CommonTypesProto$TriggerParam() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        this.doubleValue_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFloatValue() {
        this.floatValue_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntValue() {
        this.intValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        this.stringValue_ = getDefaultInstance().getStringValue();
    }

    public static CommonTypesProto$TriggerParam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static z newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$TriggerParam parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$TriggerParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CommonTypesProto$TriggerParam> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d10) {
        this.doubleValue_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloatValue(float f10) {
        this.floatValue_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntValue(long j10) {
        this.intValue_ = j10;
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
    public void setStringValue(String str) {
        str.getClass();
        this.stringValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.stringValue_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (h.f9639a[methodToInvoke.ordinal()]) {
            case 1:
                return new CommonTypesProto$TriggerParam();
            case 2:
                return new z(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0001\u0005\u0000", new Object[]{"name_", "stringValue_", "intValue_", "floatValue_", "doubleValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CommonTypesProto$TriggerParam> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CommonTypesProto$TriggerParam.class) {
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

    @Override // bj.a0
    public double getDoubleValue() {
        return this.doubleValue_;
    }

    @Override // bj.a0
    public float getFloatValue() {
        return this.floatValue_;
    }

    @Override // bj.a0
    public long getIntValue() {
        return this.intValue_;
    }

    @Override // bj.a0
    public String getName() {
        return this.name_;
    }

    @Override // bj.a0
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // bj.a0
    public String getStringValue() {
        return this.stringValue_;
    }

    @Override // bj.a0
    public ByteString getStringValueBytes() {
        return ByteString.copyFromUtf8(this.stringValue_);
    }

    public static z newBuilder(CommonTypesProto$TriggerParam commonTypesProto$TriggerParam) {
        return DEFAULT_INSTANCE.createBuilder(commonTypesProto$TriggerParam);
    }

    public static CommonTypesProto$TriggerParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$TriggerParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CommonTypesProto$TriggerParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CommonTypesProto$TriggerParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CommonTypesProto$TriggerParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$TriggerParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CommonTypesProto$TriggerParam parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$TriggerParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$TriggerParam parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$TriggerParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
