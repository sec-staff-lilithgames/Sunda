package com.moloco.sdk;

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
/* loaded from: classes8.dex */
public final class IlrdRequest$ImpressionRevenueRequest extends GeneratedMessageLite<IlrdRequest$ImpressionRevenueRequest, v7> implements w7 {
    private static final IlrdRequest$ImpressionRevenueRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int EVENTS_FIELD_NUMBER = 6;
    public static final int IDFV_FIELD_NUMBER = 2;
    public static final int OS_FIELD_NUMBER = 3;
    private static volatile Parser<IlrdRequest$ImpressionRevenueRequest> PARSER = null;
    public static final int PUBLISHER_APP_ID_FIELD_NUMBER = 5;
    public static final int PUBLISHER_ID_FIELD_NUMBER = 4;
    private String deviceId_ = "";
    private String idfv_ = "";
    private String os_ = "";
    private String publisherId_ = "";
    private String publisherAppId_ = "";
    private Internal.ProtobufList<IlrdRequest$ImpressionLevelRevenue> events_ = GeneratedMessageLite.emptyProtobufList();

    static {
        IlrdRequest$ImpressionRevenueRequest ilrdRequest$ImpressionRevenueRequest = new IlrdRequest$ImpressionRevenueRequest();
        DEFAULT_INSTANCE = ilrdRequest$ImpressionRevenueRequest;
        GeneratedMessageLite.registerDefaultInstance(IlrdRequest$ImpressionRevenueRequest.class, ilrdRequest$ImpressionRevenueRequest);
    }

    private IlrdRequest$ImpressionRevenueRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends IlrdRequest$ImpressionLevelRevenue> iterable) {
        ensureEventsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(IlrdRequest$ImpressionLevelRevenue ilrdRequest$ImpressionLevelRevenue) {
        ilrdRequest$ImpressionLevelRevenue.getClass();
        ensureEventsIsMutable();
        this.events_.add(ilrdRequest$ImpressionLevelRevenue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.deviceId_ = getDefaultInstance().getDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvents() {
        this.events_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdfv() {
        this.idfv_ = getDefaultInstance().getIdfv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisherAppId() {
        this.publisherAppId_ = getDefaultInstance().getPublisherAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisherId() {
        this.publisherId_ = getDefaultInstance().getPublisherId();
    }

    private void ensureEventsIsMutable() {
        Internal.ProtobufList<IlrdRequest$ImpressionLevelRevenue> protobufList = this.events_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.events_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static IlrdRequest$ImpressionRevenueRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static v7 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IlrdRequest$ImpressionRevenueRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$ImpressionRevenueRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IlrdRequest$ImpressionRevenueRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvents(int i10) {
        ensureEventsIsMutable();
        this.events_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        str.getClass();
        this.deviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(int i10, IlrdRequest$ImpressionLevelRevenue ilrdRequest$ImpressionLevelRevenue) {
        ilrdRequest$ImpressionLevelRevenue.getClass();
        ensureEventsIsMutable();
        this.events_.set(i10, ilrdRequest$ImpressionLevelRevenue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfv(String str) {
        str.getClass();
        this.idfv_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdfvBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idfv_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.os_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherAppId(String str) {
        str.getClass();
        this.publisherAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherAppIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.publisherAppId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherId(String str) {
        str.getClass();
        this.publisherId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.publisherId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (r7.f47418a[methodToInvoke.ordinal()]) {
            case 1:
                return new IlrdRequest$ImpressionRevenueRequest();
            case 2:
                return new v7(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"deviceId_", "idfv_", "os_", "publisherId_", "publisherAppId_", "events_", IlrdRequest$ImpressionLevelRevenue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IlrdRequest$ImpressionRevenueRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (IlrdRequest$ImpressionRevenueRequest.class) {
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

    @Override // com.moloco.sdk.w7
    public String getDeviceId() {
        return this.deviceId_;
    }

    @Override // com.moloco.sdk.w7
    public ByteString getDeviceIdBytes() {
        return ByteString.copyFromUtf8(this.deviceId_);
    }

    @Override // com.moloco.sdk.w7
    public IlrdRequest$ImpressionLevelRevenue getEvents(int i10) {
        return this.events_.get(i10);
    }

    @Override // com.moloco.sdk.w7
    public int getEventsCount() {
        return this.events_.size();
    }

    @Override // com.moloco.sdk.w7
    public List<IlrdRequest$ImpressionLevelRevenue> getEventsList() {
        return this.events_;
    }

    public u7 getEventsOrBuilder(int i10) {
        return this.events_.get(i10);
    }

    public List<? extends u7> getEventsOrBuilderList() {
        return this.events_;
    }

    @Override // com.moloco.sdk.w7
    public String getIdfv() {
        return this.idfv_;
    }

    @Override // com.moloco.sdk.w7
    public ByteString getIdfvBytes() {
        return ByteString.copyFromUtf8(this.idfv_);
    }

    @Override // com.moloco.sdk.w7
    public String getOs() {
        return this.os_;
    }

    @Override // com.moloco.sdk.w7
    public ByteString getOsBytes() {
        return ByteString.copyFromUtf8(this.os_);
    }

    @Override // com.moloco.sdk.w7
    public String getPublisherAppId() {
        return this.publisherAppId_;
    }

    @Override // com.moloco.sdk.w7
    public ByteString getPublisherAppIdBytes() {
        return ByteString.copyFromUtf8(this.publisherAppId_);
    }

    @Override // com.moloco.sdk.w7
    public String getPublisherId() {
        return this.publisherId_;
    }

    @Override // com.moloco.sdk.w7
    public ByteString getPublisherIdBytes() {
        return ByteString.copyFromUtf8(this.publisherId_);
    }

    public static v7 newBuilder(IlrdRequest$ImpressionRevenueRequest ilrdRequest$ImpressionRevenueRequest) {
        return DEFAULT_INSTANCE.createBuilder(ilrdRequest$ImpressionRevenueRequest);
    }

    public static IlrdRequest$ImpressionRevenueRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionRevenueRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionRevenueRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(int i10, IlrdRequest$ImpressionLevelRevenue ilrdRequest$ImpressionLevelRevenue) {
        ilrdRequest$ImpressionLevelRevenue.getClass();
        ensureEventsIsMutable();
        this.events_.add(i10, ilrdRequest$ImpressionLevelRevenue);
    }

    public static IlrdRequest$ImpressionRevenueRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionRevenueRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IlrdRequest$ImpressionRevenueRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionRevenueRequest parseFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$ImpressionRevenueRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$ImpressionRevenueRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IlrdRequest$ImpressionRevenueRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$ImpressionRevenueRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
