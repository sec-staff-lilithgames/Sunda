package com.google.firebase.inappmessaging;

import bj.a;
import bj.b;
import bj.c;
import bj.d;
import bj.f;
import bj.g0;
import bj.j0;
import bj.u0;
import bj.z1;
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
public final class CampaignAnalytics extends GeneratedMessageLite<CampaignAnalytics, b> implements d {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static final CampaignAnalytics DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile Parser<CampaignAnalytics> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private ClientAppInfo clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private Object event_;
    private int eventCase_ = 0;
    private String projectNumber_ = "";
    private String campaignId_ = "";
    private String fiamSdkVersion_ = "";

    static {
        CampaignAnalytics campaignAnalytics = new CampaignAnalytics();
        DEFAULT_INSTANCE = campaignAnalytics;
        GeneratedMessageLite.registerDefaultInstance(CampaignAnalytics.class, campaignAnalytics);
    }

    private CampaignAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignId() {
        this.bitField0_ &= -3;
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientApp() {
        this.clientApp_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimestampMillis() {
        this.bitField0_ &= -9;
        this.clientTimestampMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDismissType() {
        if (this.eventCase_ == 6) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEngagementMetricsDeliveryRetryCount() {
        this.bitField0_ &= -33;
        this.engagementMetricsDeliveryRetryCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.eventCase_ = 0;
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventType() {
        if (this.eventCase_ == 5) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFetchErrorReason() {
        if (this.eventCase_ == 8) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFiamSdkVersion() {
        this.bitField0_ &= -17;
        this.fiamSdkVersion_ = getDefaultInstance().getFiamSdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProjectNumber() {
        this.bitField0_ &= -2;
        this.projectNumber_ = getDefaultInstance().getProjectNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenderErrorReason() {
        if (this.eventCase_ == 7) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    public static CampaignAnalytics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientApp(ClientAppInfo clientAppInfo) {
        clientAppInfo.getClass();
        ClientAppInfo clientAppInfo2 = this.clientApp_;
        if (clientAppInfo2 == null || clientAppInfo2 == ClientAppInfo.getDefaultInstance()) {
            this.clientApp_ = clientAppInfo;
        } else {
            this.clientApp_ = (ClientAppInfo) ((f) ClientAppInfo.newBuilder(this.clientApp_).mergeFrom((f) clientAppInfo)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignAnalytics parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignAnalytics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CampaignAnalytics> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignIdBytes(ByteString byteString) {
        this.campaignId_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientApp(ClientAppInfo clientAppInfo) {
        clientAppInfo.getClass();
        this.clientApp_ = clientAppInfo;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTimestampMillis(long j10) {
        this.bitField0_ |= 8;
        this.clientTimestampMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDismissType(g0 g0Var) {
        this.event_ = Integer.valueOf(g0Var.getNumber());
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEngagementMetricsDeliveryRetryCount(int i10) {
        this.bitField0_ |= 32;
        this.engagementMetricsDeliveryRetryCount_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventType(j0 j0Var) {
        this.event_ = Integer.valueOf(j0Var.getNumber());
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFetchErrorReason(u0 u0Var) {
        this.event_ = Integer.valueOf(u0Var.getNumber());
        this.eventCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFiamSdkVersion(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.fiamSdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFiamSdkVersionBytes(ByteString byteString) {
        this.fiamSdkVersion_ = byteString.toStringUtf8();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectNumber(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.projectNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectNumberBytes(ByteString byteString) {
        this.projectNumber_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderErrorReason(z1 z1Var) {
        this.event_ = Integer.valueOf(z1Var.getNumber());
        this.eventCase_ = 7;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (a.f9604a[methodToInvoke.ordinal()]) {
            case 1:
                return new CampaignAnalytics();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005\u083f\u0000\u0006\u083f\u0000\u0007\u083f\u0000\b\u083f\u0000\tဈ\u0004\nင\u0005", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", j0.internalGetVerifier(), g0.internalGetVerifier(), z1.internalGetVerifier(), u0.internalGetVerifier(), "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CampaignAnalytics> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CampaignAnalytics.class) {
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

    @Override // bj.d
    public String getCampaignId() {
        return this.campaignId_;
    }

    @Override // bj.d
    public ByteString getCampaignIdBytes() {
        return ByteString.copyFromUtf8(this.campaignId_);
    }

    @Override // bj.d
    public ClientAppInfo getClientApp() {
        ClientAppInfo clientAppInfo = this.clientApp_;
        return clientAppInfo == null ? ClientAppInfo.getDefaultInstance() : clientAppInfo;
    }

    @Override // bj.d
    public long getClientTimestampMillis() {
        return this.clientTimestampMillis_;
    }

    @Override // bj.d
    public g0 getDismissType() {
        g0 g0VarForNumber;
        int i10 = this.eventCase_;
        g0 g0Var = g0.UNKNOWN_DISMISS_TYPE;
        return (i10 != 6 || (g0VarForNumber = g0.forNumber(((Integer) this.event_).intValue())) == null) ? g0Var : g0VarForNumber;
    }

    @Override // bj.d
    public int getEngagementMetricsDeliveryRetryCount() {
        return this.engagementMetricsDeliveryRetryCount_;
    }

    @Override // bj.d
    public c getEventCase() {
        return c.forNumber(this.eventCase_);
    }

    @Override // bj.d
    public j0 getEventType() {
        j0 j0VarForNumber;
        int i10 = this.eventCase_;
        j0 j0Var = j0.UNKNOWN_EVENT_TYPE;
        return (i10 != 5 || (j0VarForNumber = j0.forNumber(((Integer) this.event_).intValue())) == null) ? j0Var : j0VarForNumber;
    }

    @Override // bj.d
    public u0 getFetchErrorReason() {
        u0 u0VarForNumber;
        int i10 = this.eventCase_;
        u0 u0Var = u0.UNSPECIFIED_FETCH_ERROR;
        return (i10 != 8 || (u0VarForNumber = u0.forNumber(((Integer) this.event_).intValue())) == null) ? u0Var : u0VarForNumber;
    }

    @Override // bj.d
    public String getFiamSdkVersion() {
        return this.fiamSdkVersion_;
    }

    @Override // bj.d
    public ByteString getFiamSdkVersionBytes() {
        return ByteString.copyFromUtf8(this.fiamSdkVersion_);
    }

    @Override // bj.d
    public String getProjectNumber() {
        return this.projectNumber_;
    }

    @Override // bj.d
    public ByteString getProjectNumberBytes() {
        return ByteString.copyFromUtf8(this.projectNumber_);
    }

    @Override // bj.d
    public z1 getRenderErrorReason() {
        z1 z1VarForNumber;
        int i10 = this.eventCase_;
        z1 z1Var = z1.UNSPECIFIED_RENDER_ERROR;
        return (i10 != 7 || (z1VarForNumber = z1.forNumber(((Integer) this.event_).intValue())) == null) ? z1Var : z1VarForNumber;
    }

    @Override // bj.d
    public boolean hasCampaignId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // bj.d
    public boolean hasClientApp() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // bj.d
    public boolean hasClientTimestampMillis() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // bj.d
    public boolean hasDismissType() {
        return this.eventCase_ == 6;
    }

    @Override // bj.d
    public boolean hasEngagementMetricsDeliveryRetryCount() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // bj.d
    public boolean hasEventType() {
        return this.eventCase_ == 5;
    }

    @Override // bj.d
    public boolean hasFetchErrorReason() {
        return this.eventCase_ == 8;
    }

    @Override // bj.d
    public boolean hasFiamSdkVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // bj.d
    public boolean hasProjectNumber() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // bj.d
    public boolean hasRenderErrorReason() {
        return this.eventCase_ == 7;
    }

    public static b newBuilder(CampaignAnalytics campaignAnalytics) {
        return DEFAULT_INSTANCE.createBuilder(campaignAnalytics);
    }

    public static CampaignAnalytics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignAnalytics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CampaignAnalytics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CampaignAnalytics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CampaignAnalytics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignAnalytics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CampaignAnalytics parseFrom(InputStream inputStream) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignAnalytics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignAnalytics parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignAnalytics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
