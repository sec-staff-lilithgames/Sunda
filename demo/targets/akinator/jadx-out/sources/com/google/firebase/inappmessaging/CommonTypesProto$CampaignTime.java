package com.google.firebase.inappmessaging;

import bj.h;
import bj.i;
import bj.j;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.type.Date;
import com.google.type.TimeOfDay;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import wk.d0;
import wk.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CommonTypesProto$CampaignTime extends GeneratedMessageLite<CommonTypesProto$CampaignTime, i> implements j {
    public static final int DATE_FIELD_NUMBER = 1;
    private static final CommonTypesProto$CampaignTime DEFAULT_INSTANCE;
    private static volatile Parser<CommonTypesProto$CampaignTime> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 3;
    private int bitField0_;
    private Date date_;
    private String timeZone_ = "";
    private TimeOfDay time_;

    static {
        CommonTypesProto$CampaignTime commonTypesProto$CampaignTime = new CommonTypesProto$CampaignTime();
        DEFAULT_INSTANCE = commonTypesProto$CampaignTime;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$CampaignTime.class, commonTypesProto$CampaignTime);
    }

    private CommonTypesProto$CampaignTime() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDate() {
        this.date_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeZone() {
        this.timeZone_ = getDefaultInstance().getTimeZone();
    }

    public static CommonTypesProto$CampaignTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDate(Date date) {
        date.getClass();
        Date date2 = this.date_;
        if (date2 == null || date2 == Date.getDefaultInstance()) {
            this.date_ = date;
        } else {
            this.date_ = (Date) ((e) Date.newBuilder(this.date_).mergeFrom((e) date)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTime(TimeOfDay timeOfDay) {
        timeOfDay.getClass();
        TimeOfDay timeOfDay2 = this.time_;
        if (timeOfDay2 == null || timeOfDay2 == TimeOfDay.getDefaultInstance()) {
            this.time_ = timeOfDay;
        } else {
            this.time_ = (TimeOfDay) ((d0) TimeOfDay.newBuilder(this.time_).mergeFrom((d0) timeOfDay)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static i newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$CampaignTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$CampaignTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CommonTypesProto$CampaignTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(Date date) {
        date.getClass();
        this.date_ = date;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(TimeOfDay timeOfDay) {
        timeOfDay.getClass();
        this.time_ = timeOfDay;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZone(String str) {
        str.getClass();
        this.timeZone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZoneBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.timeZone_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (h.f9639a[methodToInvoke.ordinal()]) {
            case 1:
                return new CommonTypesProto$CampaignTime();
            case 2:
                return new i(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ", new Object[]{"bitField0_", "date_", "time_", "timeZone_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CommonTypesProto$CampaignTime> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CommonTypesProto$CampaignTime.class) {
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

    @Override // bj.j
    public Date getDate() {
        Date date = this.date_;
        return date == null ? Date.getDefaultInstance() : date;
    }

    @Override // bj.j
    public TimeOfDay getTime() {
        TimeOfDay timeOfDay = this.time_;
        return timeOfDay == null ? TimeOfDay.getDefaultInstance() : timeOfDay;
    }

    @Override // bj.j
    public String getTimeZone() {
        return this.timeZone_;
    }

    @Override // bj.j
    public ByteString getTimeZoneBytes() {
        return ByteString.copyFromUtf8(this.timeZone_);
    }

    @Override // bj.j
    public boolean hasDate() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // bj.j
    public boolean hasTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public static i newBuilder(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        return DEFAULT_INSTANCE.createBuilder(commonTypesProto$CampaignTime);
    }

    public static CommonTypesProto$CampaignTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$CampaignTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CommonTypesProto$CampaignTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CommonTypesProto$CampaignTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CommonTypesProto$CampaignTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$CampaignTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CommonTypesProto$CampaignTime parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$CampaignTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommonTypesProto$CampaignTime parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$CampaignTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
