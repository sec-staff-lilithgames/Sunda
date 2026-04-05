package com.google.internal.firebase.inappmessaging.v1.sdkserving;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
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
import qk.i;
import rk.m;
import rk.n;
import rk.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FetchEligibleCampaignsResponse extends GeneratedMessageLite<FetchEligibleCampaignsResponse, n> implements o {
    private static final FetchEligibleCampaignsResponse DEFAULT_INSTANCE;
    public static final int EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile Parser<FetchEligibleCampaignsResponse> PARSER;
    private long expirationEpochTimestampMillis_;
    private Internal.ProtobufList<CampaignProto$ThickContent> messages_ = GeneratedMessageLite.emptyProtobufList();

    static {
        FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse = new FetchEligibleCampaignsResponse();
        DEFAULT_INSTANCE = fetchEligibleCampaignsResponse;
        GeneratedMessageLite.registerDefaultInstance(FetchEligibleCampaignsResponse.class, fetchEligibleCampaignsResponse);
    }

    private FetchEligibleCampaignsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMessages(Iterable<? extends CampaignProto$ThickContent> iterable) {
        ensureMessagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.messages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(CampaignProto$ThickContent campaignProto$ThickContent) {
        campaignProto$ThickContent.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(campaignProto$ThickContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpirationEpochTimestampMillis() {
        this.expirationEpochTimestampMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessages() {
        this.messages_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureMessagesIsMutable() {
        Internal.ProtobufList<CampaignProto$ThickContent> protobufList = this.messages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.messages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FetchEligibleCampaignsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FetchEligibleCampaignsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FetchEligibleCampaignsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FetchEligibleCampaignsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMessages(int i10) {
        ensureMessagesIsMutable();
        this.messages_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpirationEpochTimestampMillis(long j10) {
        this.expirationEpochTimestampMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessages(int i10, CampaignProto$ThickContent campaignProto$ThickContent) {
        campaignProto$ThickContent.getClass();
        ensureMessagesIsMutable();
        this.messages_.set(i10, campaignProto$ThickContent);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (m.f84511a[methodToInvoke.ordinal()]) {
            case 1:
                return new FetchEligibleCampaignsResponse();
            case 2:
                return new n(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"messages_", CampaignProto$ThickContent.class, "expirationEpochTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FetchEligibleCampaignsResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (FetchEligibleCampaignsResponse.class) {
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

    @Override // rk.o
    public long getExpirationEpochTimestampMillis() {
        return this.expirationEpochTimestampMillis_;
    }

    @Override // rk.o
    public CampaignProto$ThickContent getMessages(int i10) {
        return this.messages_.get(i10);
    }

    @Override // rk.o
    public int getMessagesCount() {
        return this.messages_.size();
    }

    @Override // rk.o
    public List<CampaignProto$ThickContent> getMessagesList() {
        return this.messages_;
    }

    public i getMessagesOrBuilder(int i10) {
        return this.messages_.get(i10);
    }

    public List<? extends i> getMessagesOrBuilderList() {
        return this.messages_;
    }

    public static n newBuilder(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        return DEFAULT_INSTANCE.createBuilder(fetchEligibleCampaignsResponse);
    }

    public static FetchEligibleCampaignsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FetchEligibleCampaignsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FetchEligibleCampaignsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(int i10, CampaignProto$ThickContent campaignProto$ThickContent) {
        campaignProto$ThickContent.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(i10, campaignProto$ThickContent);
    }

    public static FetchEligibleCampaignsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FetchEligibleCampaignsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FetchEligibleCampaignsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FetchEligibleCampaignsResponse parseFrom(InputStream inputStream) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FetchEligibleCampaignsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FetchEligibleCampaignsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FetchEligibleCampaignsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
