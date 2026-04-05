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
public final class IlrdRequest$MaxImpression extends GeneratedMessageLite<IlrdRequest$MaxImpression, z7> implements a8 {
    public static final int AD_FORMAT_FIELD_NUMBER = 1;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
    private static final IlrdRequest$MaxImpression DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int MAX_AD_UNIT_ID_FIELD_NUMBER = 4;
    public static final int NETWORK_NAME_FIELD_NUMBER = 5;
    private static volatile Parser<IlrdRequest$MaxImpression> PARSER = null;
    public static final int REVENUE_FIELD_NUMBER = 6;
    public static final int THIRD_PARTY_AD_PLACEMENT_ID_FIELD_NUMBER = 7;
    public static final int USER_SEGMENT_FIELD_NUMBER = 8;
    private double revenue_;
    private String adFormat_ = "";
    private String countryCode_ = "";
    private String id_ = "";
    private String maxAdUnitId_ = "";
    private String networkName_ = "";
    private String thirdPartyAdPlacementId_ = "";
    private String userSegment_ = "";

    static {
        IlrdRequest$MaxImpression ilrdRequest$MaxImpression = new IlrdRequest$MaxImpression();
        DEFAULT_INSTANCE = ilrdRequest$MaxImpression;
        GeneratedMessageLite.registerDefaultInstance(IlrdRequest$MaxImpression.class, ilrdRequest$MaxImpression);
    }

    private IlrdRequest$MaxImpression() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdFormat() {
        this.adFormat_ = getDefaultInstance().getAdFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxAdUnitId() {
        this.maxAdUnitId_ = getDefaultInstance().getMaxAdUnitId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkName() {
        this.networkName_ = getDefaultInstance().getNetworkName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevenue() {
        this.revenue_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThirdPartyAdPlacementId() {
        this.thirdPartyAdPlacementId_ = getDefaultInstance().getThirdPartyAdPlacementId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserSegment() {
        this.userSegment_ = getDefaultInstance().getUserSegment();
    }

    public static IlrdRequest$MaxImpression getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static z7 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IlrdRequest$MaxImpression parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$MaxImpression parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IlrdRequest$MaxImpression> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxAdUnitId(String str) {
        str.getClass();
        this.maxAdUnitId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxAdUnitIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.maxAdUnitId_ = byteString.toStringUtf8();
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
    public void setRevenue(double d10) {
        this.revenue_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThirdPartyAdPlacementId(String str) {
        str.getClass();
        this.thirdPartyAdPlacementId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThirdPartyAdPlacementIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.thirdPartyAdPlacementId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSegment(String str) {
        str.getClass();
        this.userSegment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserSegmentBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userSegment_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (r7.f47418a[methodToInvoke.ordinal()]) {
            case 1:
                return new IlrdRequest$MaxImpression();
            case 2:
                return new z7(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0000\u0007Ȉ\bȈ", new Object[]{"adFormat_", "countryCode_", "id_", "maxAdUnitId_", "networkName_", "revenue_", "thirdPartyAdPlacementId_", "userSegment_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IlrdRequest$MaxImpression> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (IlrdRequest$MaxImpression.class) {
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

    @Override // com.moloco.sdk.a8
    public String getAdFormat() {
        return this.adFormat_;
    }

    @Override // com.moloco.sdk.a8
    public ByteString getAdFormatBytes() {
        return ByteString.copyFromUtf8(this.adFormat_);
    }

    @Override // com.moloco.sdk.a8
    public String getCountryCode() {
        return this.countryCode_;
    }

    @Override // com.moloco.sdk.a8
    public ByteString getCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.countryCode_);
    }

    @Override // com.moloco.sdk.a8
    public String getId() {
        return this.id_;
    }

    @Override // com.moloco.sdk.a8
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.moloco.sdk.a8
    public String getMaxAdUnitId() {
        return this.maxAdUnitId_;
    }

    @Override // com.moloco.sdk.a8
    public ByteString getMaxAdUnitIdBytes() {
        return ByteString.copyFromUtf8(this.maxAdUnitId_);
    }

    @Override // com.moloco.sdk.a8
    public String getNetworkName() {
        return this.networkName_;
    }

    @Override // com.moloco.sdk.a8
    public ByteString getNetworkNameBytes() {
        return ByteString.copyFromUtf8(this.networkName_);
    }

    @Override // com.moloco.sdk.a8
    public double getRevenue() {
        return this.revenue_;
    }

    @Override // com.moloco.sdk.a8
    public String getThirdPartyAdPlacementId() {
        return this.thirdPartyAdPlacementId_;
    }

    @Override // com.moloco.sdk.a8
    public ByteString getThirdPartyAdPlacementIdBytes() {
        return ByteString.copyFromUtf8(this.thirdPartyAdPlacementId_);
    }

    @Override // com.moloco.sdk.a8
    public String getUserSegment() {
        return this.userSegment_;
    }

    @Override // com.moloco.sdk.a8
    public ByteString getUserSegmentBytes() {
        return ByteString.copyFromUtf8(this.userSegment_);
    }

    public static z7 newBuilder(IlrdRequest$MaxImpression ilrdRequest$MaxImpression) {
        return DEFAULT_INSTANCE.createBuilder(ilrdRequest$MaxImpression);
    }

    public static IlrdRequest$MaxImpression parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$MaxImpression parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IlrdRequest$MaxImpression parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IlrdRequest$MaxImpression parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IlrdRequest$MaxImpression parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IlrdRequest$MaxImpression parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IlrdRequest$MaxImpression parseFrom(InputStream inputStream) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IlrdRequest$MaxImpression parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IlrdRequest$MaxImpression parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IlrdRequest$MaxImpression parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IlrdRequest$MaxImpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
