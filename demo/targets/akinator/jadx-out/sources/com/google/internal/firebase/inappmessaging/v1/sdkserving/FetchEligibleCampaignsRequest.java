package com.google.internal.firebase.inappmessaging.v1.sdkserving;

import com.google.developers.mobile.targeting.proto.ClientSignalsProto$ClientSignals;
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
import rk.f;
import rk.h;
import rk.j;
import rk.k;
import rk.l;
import uh.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FetchEligibleCampaignsRequest extends GeneratedMessageLite<FetchEligibleCampaignsRequest, k> implements l {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    private static final FetchEligibleCampaignsRequest DEFAULT_INSTANCE;
    private static volatile Parser<FetchEligibleCampaignsRequest> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private int bitField0_;
    private ClientSignalsProto$ClientSignals clientSignals_;
    private ClientAppInfo requestingClientApp_;
    private String projectNumber_ = "";
    private Internal.ProtobufList<CampaignImpression> alreadySeenCampaigns_ = GeneratedMessageLite.emptyProtobufList();

    static {
        FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest = new FetchEligibleCampaignsRequest();
        DEFAULT_INSTANCE = fetchEligibleCampaignsRequest;
        GeneratedMessageLite.registerDefaultInstance(FetchEligibleCampaignsRequest.class, fetchEligibleCampaignsRequest);
    }

    private FetchEligibleCampaignsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAlreadySeenCampaigns(Iterable<? extends CampaignImpression> iterable) {
        ensureAlreadySeenCampaignsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.alreadySeenCampaigns_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlreadySeenCampaigns(CampaignImpression campaignImpression) {
        campaignImpression.getClass();
        ensureAlreadySeenCampaignsIsMutable();
        this.alreadySeenCampaigns_.add(campaignImpression);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlreadySeenCampaigns() {
        this.alreadySeenCampaigns_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientSignals() {
        this.clientSignals_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProjectNumber() {
        this.projectNumber_ = getDefaultInstance().getProjectNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestingClientApp() {
        this.requestingClientApp_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureAlreadySeenCampaignsIsMutable() {
        Internal.ProtobufList<CampaignImpression> protobufList = this.alreadySeenCampaigns_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.alreadySeenCampaigns_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FetchEligibleCampaignsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientSignals(ClientSignalsProto$ClientSignals clientSignalsProto$ClientSignals) {
        clientSignalsProto$ClientSignals.getClass();
        ClientSignalsProto$ClientSignals clientSignalsProto$ClientSignals2 = this.clientSignals_;
        if (clientSignalsProto$ClientSignals2 == null || clientSignalsProto$ClientSignals2 == ClientSignalsProto$ClientSignals.getDefaultInstance()) {
            this.clientSignals_ = clientSignalsProto$ClientSignals;
        } else {
            this.clientSignals_ = (ClientSignalsProto$ClientSignals) ((d) ClientSignalsProto$ClientSignals.newBuilder(this.clientSignals_).mergeFrom((d) clientSignalsProto$ClientSignals)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequestingClientApp(ClientAppInfo clientAppInfo) {
        clientAppInfo.getClass();
        ClientAppInfo clientAppInfo2 = this.requestingClientApp_;
        if (clientAppInfo2 == null || clientAppInfo2 == ClientAppInfo.getDefaultInstance()) {
            this.requestingClientApp_ = clientAppInfo;
        } else {
            this.requestingClientApp_ = (ClientAppInfo) ((h) ClientAppInfo.newBuilder(this.requestingClientApp_).mergeFrom((h) clientAppInfo)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static k newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FetchEligibleCampaignsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FetchEligibleCampaignsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FetchEligibleCampaignsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAlreadySeenCampaigns(int i10) {
        ensureAlreadySeenCampaignsIsMutable();
        this.alreadySeenCampaigns_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlreadySeenCampaigns(int i10, CampaignImpression campaignImpression) {
        campaignImpression.getClass();
        ensureAlreadySeenCampaignsIsMutable();
        this.alreadySeenCampaigns_.set(i10, campaignImpression);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientSignals(ClientSignalsProto$ClientSignals clientSignalsProto$ClientSignals) {
        clientSignalsProto$ClientSignals.getClass();
        this.clientSignals_ = clientSignalsProto$ClientSignals;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectNumber(String str) {
        str.getClass();
        this.projectNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectNumberBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.projectNumber_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestingClientApp(ClientAppInfo clientAppInfo) {
        clientAppInfo.getClass();
        this.requestingClientApp_ = clientAppInfo;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (j.f84510a[methodToInvoke.ordinal()]) {
            case 1:
                return new FetchEligibleCampaignsRequest();
            case 2:
                return new k(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", CampaignImpression.class, "clientSignals_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FetchEligibleCampaignsRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (FetchEligibleCampaignsRequest.class) {
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

    @Override // rk.l
    public CampaignImpression getAlreadySeenCampaigns(int i10) {
        return this.alreadySeenCampaigns_.get(i10);
    }

    @Override // rk.l
    public int getAlreadySeenCampaignsCount() {
        return this.alreadySeenCampaigns_.size();
    }

    @Override // rk.l
    public List<CampaignImpression> getAlreadySeenCampaignsList() {
        return this.alreadySeenCampaigns_;
    }

    public f getAlreadySeenCampaignsOrBuilder(int i10) {
        return this.alreadySeenCampaigns_.get(i10);
    }

    public List<? extends f> getAlreadySeenCampaignsOrBuilderList() {
        return this.alreadySeenCampaigns_;
    }

    @Override // rk.l
    public ClientSignalsProto$ClientSignals getClientSignals() {
        ClientSignalsProto$ClientSignals clientSignalsProto$ClientSignals = this.clientSignals_;
        return clientSignalsProto$ClientSignals == null ? ClientSignalsProto$ClientSignals.getDefaultInstance() : clientSignalsProto$ClientSignals;
    }

    @Override // rk.l
    public String getProjectNumber() {
        return this.projectNumber_;
    }

    @Override // rk.l
    public ByteString getProjectNumberBytes() {
        return ByteString.copyFromUtf8(this.projectNumber_);
    }

    @Override // rk.l
    public ClientAppInfo getRequestingClientApp() {
        ClientAppInfo clientAppInfo = this.requestingClientApp_;
        return clientAppInfo == null ? ClientAppInfo.getDefaultInstance() : clientAppInfo;
    }

    @Override // rk.l
    public boolean hasClientSignals() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // rk.l
    public boolean hasRequestingClientApp() {
        return (this.bitField0_ & 1) != 0;
    }

    public static k newBuilder(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        return DEFAULT_INSTANCE.createBuilder(fetchEligibleCampaignsRequest);
    }

    public static FetchEligibleCampaignsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FetchEligibleCampaignsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FetchEligibleCampaignsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlreadySeenCampaigns(int i10, CampaignImpression campaignImpression) {
        campaignImpression.getClass();
        ensureAlreadySeenCampaignsIsMutable();
        this.alreadySeenCampaigns_.add(i10, campaignImpression);
    }

    public static FetchEligibleCampaignsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FetchEligibleCampaignsRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FetchEligibleCampaignsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FetchEligibleCampaignsRequest parseFrom(InputStream inputStream) throws IOException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FetchEligibleCampaignsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FetchEligibleCampaignsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FetchEligibleCampaignsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FetchEligibleCampaignsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
