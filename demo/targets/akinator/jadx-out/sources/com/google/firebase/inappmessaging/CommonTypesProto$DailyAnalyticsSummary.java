package com.google.firebase.inappmessaging;

import bj.h;
import bj.k;
import bj.l;
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
public final class CommonTypesProto$DailyAnalyticsSummary extends GeneratedMessageLite<CommonTypesProto$DailyAnalyticsSummary, k> implements l {
    public static final int CLICKS_FIELD_NUMBER = 3;
    private static final CommonTypesProto$DailyAnalyticsSummary DEFAULT_INSTANCE;
    public static final int ERRORS_FIELD_NUMBER = 4;
    public static final int IMPRESSIONS_FIELD_NUMBER = 2;
    private static volatile Parser<CommonTypesProto$DailyAnalyticsSummary> PARSER = null;
    public static final int START_OF_DAY_MILLIS_FIELD_NUMBER = 1;
    private int clicks_;
    private int errors_;
    private int impressions_;
    private long startOfDayMillis_;

    static {
        CommonTypesProto$DailyAnalyticsSummary commonTypesProto$DailyAnalyticsSummary = new CommonTypesProto$DailyAnalyticsSummary();
        DEFAULT_INSTANCE = commonTypesProto$DailyAnalyticsSummary;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$DailyAnalyticsSummary.class, commonTypesProto$DailyAnalyticsSummary);
    }

    private CommonTypesProto$DailyAnalyticsSummary() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClicks() {
        this.clicks_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrors() {
        this.errors_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpressions() {
        this.impressions_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartOfDayMillis() {
        this.startOfDayMillis_ = 0L;
    }

    public static CommonTypesProto$DailyAnalyticsSummary getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CommonTypesProto$DailyAnalyticsSummary> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClicks(int i10) {
        this.clicks_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrors(int i10) {
        this.errors_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressions(int i10) {
        this.impressions_ = i10;
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
                return new CommonTypesProto$DailyAnalyticsSummary();
            case 2:
                return new k(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"startOfDayMillis_", "impressions_", "clicks_", "errors_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CommonTypesProto$DailyAnalyticsSummary> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CommonTypesProto$DailyAnalyticsSummary.class) {
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

    @Override // bj.l
    public int getClicks() {
        return this.clicks_;
    }

    @Override // bj.l
    public int getErrors() {
        return this.errors_;
    }

    @Override // bj.l
    public int getImpressions() {
        return this.impressions_;
    }

    @Override // bj.l
    public long getStartOfDayMillis() {
        return this.startOfDayMillis_;
    }

    public static k newBuilder(CommonTypesProto$DailyAnalyticsSummary commonTypesProto$DailyAnalyticsSummary) {
        return DEFAULT_INSTANCE.createBuilder(commonTypesProto$DailyAnalyticsSummary);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
