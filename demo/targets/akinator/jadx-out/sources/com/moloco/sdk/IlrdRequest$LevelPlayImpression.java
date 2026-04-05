package com.moloco.sdk;

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
/* loaded from: classes8.dex */
public final class IlrdRequest$LevelPlayImpression extends GeneratedMessageLite<IlrdRequest$LevelPlayImpression, x7> implements y7 {
    public static final int AB_FIELD_NUMBER = 10;
    public static final int AD_FORMAT_FIELD_NUMBER = 2;
    public static final int AUCTION_ID_FIELD_NUMBER = 1;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 6;
    public static final int CREATIVE_ID_FIELD_NUMBER = 14;
    private static final IlrdRequest$LevelPlayImpression DEFAULT_INSTANCE;
    public static final int ENCRYPTED_CPM_FIELD_NUMBER = 13;
    public static final int INSTANCE_ID_FIELD_NUMBER = 5;
    public static final int INSTANCE_NAME_FIELD_NUMBER = 4;
    public static final int LIFETIME_REVENUE_FIELD_NUMBER = 12;
    public static final int NETWORK_NAME_FIELD_NUMBER = 3;
    private static volatile Parser<IlrdRequest$LevelPlayImpression> PARSER = null;
    public static final int PLACEMENT_FIELD_NUMBER = 7;
    public static final int PRECISION_FIELD_NUMBER = 9;
    public static final int REVENUE_FIELD_NUMBER = 8;
    public static final int SEGMENT_NAME_FIELD_NUMBER = 11;
    private double lifetimeRevenue_;
    private double revenue_;
    private String auctionId_ = "";
    private String adFormat_ = "";
    private String networkName_ = "";
    private String instanceName_ = "";
    private String instanceId_ = "";
    private String countryCode_ = "";
    private String placement_ = "";
    private String precision_ = "";
    private String ab_ = "";
    private String segmentName_ = "";
    private String encryptedCpm_ = "";
    private String creativeId_ = "";

    static {
        IlrdRequest$LevelPlayImpression ilrdRequest$LevelPlayImpression = new IlrdRequest$LevelPlayImpression();
        DEFAULT_INSTANCE = ilrdRequest$LevelPlayImpression;
        GeneratedMessageLite.registerDefaultInstance(IlrdRequest$LevelPlayImpression.class, ilrdRequest$LevelPlayImpression);
    }

    private IlrdRequest$LevelPlayImpression() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAb() {
        this.ab_ = getDefaultInstance().getAb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdFormat() {
        this.adFormat_ = getDefaultInstance().getAdFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuctionId() {
        this.auctionId_ = getDefaultInstance().getAuctionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeId() {
        this.creativeId_ = getDefaultInstance().getCreativeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptedCpm() {
        this.encryptedCpm_ = getDefaultInstance().getEncryptedCpm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstanceId() {
        this.instanceId_ = getDefaultInstance().getInstanceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstanceName() {
        this.instanceName_ = getDefaultInstance().getInstanceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLifetimeRevenue() {
        this.lifetimeRevenue_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkName() {
        this.networkName_ = getDefaultInstance().getNetworkName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlacement() {
        this.placement_ = getDefaultInstance().getPlacement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrecision() {
        this.precision_ = getDefaultInstance().getPrecision();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevenue() {
        this.revenue_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentName() {
        this.segmentName_ = getDefaultInstance().getSegmentName();
    }

    public static IlrdRequest$LevelPlayImpression getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static x7 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IlrdRequest$LevelPlayImpression parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IlrdRequest$LevelPlayImpression> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAb(String str) {
        str.getClass();
        this.ab_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ab_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdFormat(String str) {
        str.getClass();
        this.adFormat_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdFormatBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adFormat_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuctionId(String str) {
        str.getClass();
        this.auctionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuctionIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.auctionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(String str) {
        str.getClass();
        this.countryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCodeBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.countryCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeId(String str) {
        str.getClass();
        this.creativeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.creativeId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptedCpm(String str) {
        str.getClass();
        this.encryptedCpm_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptedCpmBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.encryptedCpm_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstanceId(String str) {
        str.getClass();
        this.instanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstanceIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.instanceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstanceName(String str) {
        str.getClass();
        this.instanceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstanceNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.instanceName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLifetimeRevenue(double d10) {
        this.lifetimeRevenue_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkName(String str) {
        str.getClass();
        this.networkName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.networkName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacement(String str) {
        str.getClass();
        this.placement_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.placement_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrecision(String str) {
        str.getClass();
        this.precision_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrecisionBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.precision_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevenue(double d10) {
        this.revenue_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentName(String str) {
        str.getClass();
        this.segmentName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.segmentName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (r7.f47418a[methodToInvoke.ordinal()]) {
            case 1:
                return new IlrdRequest$LevelPlayImpression();
            case 2:
                return new x7(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0000\tȈ\nȈ\u000bȈ\f\u0000\rȈ\u000eȈ", new Object[]{"auctionId_", "adFormat_", "networkName_", "instanceName_", "instanceId_", "countryCode_", "placement_", "revenue_", "precision_", "ab_", "segmentName_", "lifetimeRevenue_", "encryptedCpm_", "creativeId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IlrdRequest$LevelPlayImpression> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (IlrdRequest$LevelPlayImpression.class) {
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

    @Override // com.moloco.sdk.y7
    public String getAb() {
        return this.ab_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getAbBytes() {
        return ByteString.copyFromUtf8(this.ab_);
    }

    @Override // com.moloco.sdk.y7
    public String getAdFormat() {
        return this.adFormat_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getAdFormatBytes() {
        return ByteString.copyFromUtf8(this.adFormat_);
    }

    @Override // com.moloco.sdk.y7
    public String getAuctionId() {
        return this.auctionId_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getAuctionIdBytes() {
        return ByteString.copyFromUtf8(this.auctionId_);
    }

    @Override // com.moloco.sdk.y7
    public String getCountryCode() {
        return this.countryCode_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.countryCode_);
    }

    @Override // com.moloco.sdk.y7
    public String getCreativeId() {
        return this.creativeId_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getCreativeIdBytes() {
        return ByteString.copyFromUtf8(this.creativeId_);
    }

    @Override // com.moloco.sdk.y7
    public String getEncryptedCpm() {
        return this.encryptedCpm_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getEncryptedCpmBytes() {
        return ByteString.copyFromUtf8(this.encryptedCpm_);
    }

    @Override // com.moloco.sdk.y7
    public String getInstanceId() {
        return this.instanceId_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getInstanceIdBytes() {
        return ByteString.copyFromUtf8(this.instanceId_);
    }

    @Override // com.moloco.sdk.y7
    public String getInstanceName() {
        return this.instanceName_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getInstanceNameBytes() {
        return ByteString.copyFromUtf8(this.instanceName_);
    }

    @Override // com.moloco.sdk.y7
    public double getLifetimeRevenue() {
        return this.lifetimeRevenue_;
    }

    @Override // com.moloco.sdk.y7
    public String getNetworkName() {
        return this.networkName_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getNetworkNameBytes() {
        return ByteString.copyFromUtf8(this.networkName_);
    }

    @Override // com.moloco.sdk.y7
    public String getPlacement() {
        return this.placement_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getPlacementBytes() {
        return ByteString.copyFromUtf8(this.placement_);
    }

    @Override // com.moloco.sdk.y7
    public String getPrecision() {
        return this.precision_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getPrecisionBytes() {
        return ByteString.copyFromUtf8(this.precision_);
    }

    @Override // com.moloco.sdk.y7
    public double getRevenue() {
        return this.revenue_;
    }

    @Override // com.moloco.sdk.y7
    public String getSegmentName() {
        return this.segmentName_;
    }

    @Override // com.moloco.sdk.y7
    public ByteString getSegmentNameBytes() {
        return ByteString.copyFromUtf8(this.segmentName_);
    }

    public static x7 newBuilder(IlrdRequest$LevelPlayImpression ilrdRequest$LevelPlayImpression) {
        return DEFAULT_INSTANCE.createBuilder(ilrdRequest$LevelPlayImpression);
    }

    public static IlrdRequest$LevelPlayImpression parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IlrdRequest$LevelPlayImpression parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$LevelPlayImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
