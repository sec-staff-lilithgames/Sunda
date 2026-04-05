package com.google.firebase.inappmessaging;

import bj.h;
import bj.m;
import bj.n;
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
public final class CommonTypesProto$DailyConversionSummary extends GeneratedMessageLite<CommonTypesProto$DailyConversionSummary, m> implements n {
    public static final int CONVERSIONS_FIELD_NUMBER = 2;
    private static final CommonTypesProto$DailyConversionSummary DEFAULT_INSTANCE;
    private static volatile Parser<CommonTypesProto$DailyConversionSummary> PARSER = null;
    public static final int START_OF_DAY_MILLIS_FIELD_NUMBER = 1;
    private int conversions_;
    private long startOfDayMillis_;

    static {
        CommonTypesProto$DailyConversionSummary commonTypesProto$DailyConversionSummary = new CommonTypesProto$DailyConversionSummary();
        DEFAULT_INSTANCE = commonTypesProto$DailyConversionSummary;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$DailyConversionSummary.class, commonTypesProto$DailyConversionSummary);
    }

    private CommonTypesProto$DailyConversionSummary() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversions() {
        this.conversions_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartOfDayMillis() {
        this.startOfDayMillis_ = 0L;
    }

    public static CommonTypesProto$DailyConversionSummary getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static m newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$DailyConversionSummary parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CommonTypesProto$DailyConversionSummary> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversions(int i10) {
        this.conversions_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartOfDayMillis(long j10) {
        this.startOfDayMillis_ = j10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (h.f9639a[methodToInvoke.ordinal()]) {
            case 1:
                return new CommonTypesProto$DailyConversionSummary();
            case 2:
                return new m(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"startOfDayMillis_", "conversions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CommonTypesProto$DailyConversionSummary> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CommonTypesProto$DailyConversionSummary.class) {
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

    @Override // bj.n
    public int getConversions() {
        return this.conversions_;
    }

    @Override // bj.n
    public long getStartOfDayMillis() {
        return this.startOfDayMillis_;
    }

    public static m newBuilder(CommonTypesProto$DailyConversionSummary commonTypesProto$DailyConversionSummary) {
        return DEFAULT_INSTANCE.createBuilder(commonTypesProto$DailyConversionSummary);
    }

    public static CommonTypesProto$DailyConversionSummary parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
