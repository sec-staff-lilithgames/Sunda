package io.bidmachine.protobuf;

import a.b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.b9;
import com.explorestack.protobuf.bd;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.pa;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.protobuf.Extras;
import io.bidmachine.protobuf.SdkAnalyticConfig;
import io.bidmachine.protobuf.TokenConfiguration;
import io.bidmachine.protobuf.sdk.Configuration;
import io.bidmachine.protobuf.sdk.ConfigurationOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class InitResponse extends k7 implements InitResponseOrBuilder {
    public static final int AD_CACHE_CONTROL_FIELD_NUMBER = 5;
    public static final int AD_CACHE_MAX_AGE_FIELD_NUMBER = 6;
    public static final int AD_CACHE_PLACEMENT_CONTROL_FIELD_NUMBER = 8;
    public static final int AD_NETWORKS_FIELD_NUMBER = 4;
    public static final int AD_NETWORKS_LOADING_TIMEOUT_FIELD_NUMBER = 9;
    public static final int AD_REQUEST_TMAX_FIELD_NUMBER = 7;
    public static final int ENDPOINT_FIELD_NUMBER = 1;
    public static final int EVENT_CONFIGURATION_FIELD_NUMBER = 11;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int EXTRAS_FIELD_NUMBER = 14;
    public static final int SDK_ANALYTIC_CONFIG_FIELD_NUMBER = 10;
    public static final int SDK_ANALYTIC_CONFIG_V2_FIELD_NUMBER = 15;
    public static final int SESSION_RESET_AFTER_FIELD_NUMBER = 3;
    public static final int SHOW_WITHOUT_INTERNET_FIELD_NUMBER = 13;
    public static final int TOKEN_CONFIGURATIONS_FIELD_NUMBER = 12;
    private static final long serialVersionUID = 0;
    private int adCacheControl_;
    private int adCacheMaxAge_;
    private b9 adCachePlacementControl_;
    private int adNetworksLoadingTimeout_;
    private List<AdNetwork> adNetworks_;
    private int adRequestTmax_;
    private volatile Object endpoint_;
    private AdExtension.EventConfiguration eventConfiguration_;
    private List<Ad.Event> event_;
    private Extras extras_;
    private byte memoizedIsInitialized;
    private Configuration sdkAnalyticConfigV2_;
    private SdkAnalyticConfig sdkAnalyticConfig_;
    private int sessionResetAfter_;
    private boolean showWithoutInternet_;
    private List<TokenConfiguration> tokenConfigurations_;
    private static final InitResponse DEFAULT_INSTANCE = new InitResponse();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.InitResponse.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public InitResponse parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new InitResponse(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdCachePlacementControlDefaultEntryHolder {
        static final s8 defaultEntry = s8.newDefaultInstance(InitProto.internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_descriptor, bd.f21956f, "", bd.f21958h, AdCachePlacementControl.getDefaultInstance());

        private AdCachePlacementControlDefaultEntryHolder() {
        }
    }

    public static InitResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b9 internalGetAdCachePlacementControl() {
        b9 b9Var = this.adCachePlacementControl_;
        return b9Var == null ? b9.emptyMapField(AdCachePlacementControlDefaultEntryHolder.defaultEntry) : b9Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static InitResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InitResponse) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InitResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean containsAdCachePlacementControl(String str) {
        str.getClass();
        return internalGetAdCachePlacementControl().getMap().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitResponse)) {
            return super.equals(obj);
        }
        InitResponse initResponse = (InitResponse) obj;
        if (!getEndpoint().equals(initResponse.getEndpoint()) || !getEventList().equals(initResponse.getEventList()) || getSessionResetAfter() != initResponse.getSessionResetAfter() || !getAdNetworksList().equals(initResponse.getAdNetworksList()) || this.adCacheControl_ != initResponse.adCacheControl_ || getAdCacheMaxAge() != initResponse.getAdCacheMaxAge() || getAdRequestTmax() != initResponse.getAdRequestTmax() || !internalGetAdCachePlacementControl().equals(initResponse.internalGetAdCachePlacementControl()) || getAdNetworksLoadingTimeout() != initResponse.getAdNetworksLoadingTimeout() || hasSdkAnalyticConfig() != initResponse.hasSdkAnalyticConfig()) {
            return false;
        }
        if ((hasSdkAnalyticConfig() && !getSdkAnalyticConfig().equals(initResponse.getSdkAnalyticConfig())) || hasEventConfiguration() != initResponse.hasEventConfiguration()) {
            return false;
        }
        if ((hasEventConfiguration() && !getEventConfiguration().equals(initResponse.getEventConfiguration())) || !getTokenConfigurationsList().equals(initResponse.getTokenConfigurationsList()) || getShowWithoutInternet() != initResponse.getShowWithoutInternet() || hasExtras() != initResponse.hasExtras()) {
            return false;
        }
        if ((!hasExtras() || getExtras().equals(initResponse.getExtras())) && hasSdkAnalyticConfigV2() == initResponse.hasSdkAnalyticConfigV2()) {
            return (!hasSdkAnalyticConfigV2() || getSdkAnalyticConfigV2().equals(initResponse.getSdkAnalyticConfigV2())) && this.unknownFields.equals(initResponse.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdCacheControl getAdCacheControl() {
        AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
        return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCacheControlValue() {
        return this.adCacheControl_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCacheMaxAge() {
        return this.adCacheMaxAge_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    @Deprecated
    public Map<String, AdCachePlacementControl> getAdCachePlacementControl() {
        return getAdCachePlacementControlMap();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdCachePlacementControlCount() {
        return internalGetAdCachePlacementControl().getMap().size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Map<String, AdCachePlacementControl> getAdCachePlacementControlMap() {
        return internalGetAdCachePlacementControl().getMap();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl) {
        str.getClass();
        Map<Object, Object> map = internalGetAdCachePlacementControl().getMap();
        return map.containsKey(str) ? (AdCachePlacementControl) map.get(str) : adCachePlacementControl;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdCachePlacementControl getAdCachePlacementControlOrThrow(String str) {
        str.getClass();
        Map<Object, Object> map = internalGetAdCachePlacementControl().getMap();
        if (map.containsKey(str)) {
            return (AdCachePlacementControl) map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdNetwork getAdNetworks(int i10) {
        return this.adNetworks_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdNetworksCount() {
        return this.adNetworks_.size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<AdNetwork> getAdNetworksList() {
        return this.adNetworks_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdNetworksLoadingTimeout() {
        return this.adNetworksLoadingTimeout_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdNetworkOrBuilder getAdNetworksOrBuilder(int i10) {
        return this.adNetworks_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList() {
        return this.adNetworks_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getAdRequestTmax() {
        return this.adRequestTmax_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public String getEndpoint() {
        Object obj = this.endpoint_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.endpoint_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public ByteString getEndpointBytes() {
        Object obj = this.endpoint_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.endpoint_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Ad.Event getEvent(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdExtension.EventConfiguration getEventConfiguration() {
        AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
        return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public AdExtension.EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
        return getEventConfiguration();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getEventCount() {
        return this.event_.size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<Ad.Event> getEventList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Ad.EventOrBuilder getEventOrBuilder(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Extras getExtras() {
        Extras extras = this.extras_;
        return extras == null ? Extras.getDefaultInstance() : extras;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public ExtrasOrBuilder getExtrasOrBuilder() {
        return getExtras();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public SdkAnalyticConfig getSdkAnalyticConfig() {
        SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
        return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder() {
        return getSdkAnalyticConfig();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public Configuration getSdkAnalyticConfigV2() {
        Configuration configuration = this.sdkAnalyticConfigV2_;
        return configuration == null ? Configuration.getDefaultInstance() : configuration;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public ConfigurationOrBuilder getSdkAnalyticConfigV2OrBuilder() {
        return getSdkAnalyticConfigV2();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getEndpointBytes().isEmpty() ? k7.computeStringSize(1, this.endpoint_) : 0;
        for (int i11 = 0; i11 < this.event_.size(); i11++) {
            iComputeStringSize += h0.computeMessageSize(2, this.event_.get(i11));
        }
        int i12 = this.sessionResetAfter_;
        if (i12 != 0) {
            iComputeStringSize += h0.computeUInt32Size(3, i12);
        }
        for (int i13 = 0; i13 < this.adNetworks_.size(); i13++) {
            iComputeStringSize += h0.computeMessageSize(4, this.adNetworks_.get(i13));
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            iComputeStringSize += h0.computeEnumSize(5, this.adCacheControl_);
        }
        int i14 = this.adCacheMaxAge_;
        if (i14 != 0) {
            iComputeStringSize += h0.computeUInt32Size(6, i14);
        }
        int i15 = this.adRequestTmax_;
        if (i15 != 0) {
            iComputeStringSize += h0.computeUInt32Size(7, i15);
        }
        Iterator itN = a.n(internalGetAdCachePlacementControl());
        while (itN.hasNext()) {
            Map.Entry entry = (Map.Entry) itN.next();
            iComputeStringSize = a.g(entry, AdCachePlacementControlDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 8, iComputeStringSize);
        }
        int i16 = this.adNetworksLoadingTimeout_;
        if (i16 != 0) {
            iComputeStringSize += h0.computeUInt32Size(9, i16);
        }
        if (this.sdkAnalyticConfig_ != null) {
            iComputeStringSize += h0.computeMessageSize(10, getSdkAnalyticConfig());
        }
        if (this.eventConfiguration_ != null) {
            iComputeStringSize += h0.computeMessageSize(11, getEventConfiguration());
        }
        for (int i17 = 0; i17 < this.tokenConfigurations_.size(); i17++) {
            iComputeStringSize += h0.computeMessageSize(12, this.tokenConfigurations_.get(i17));
        }
        boolean z10 = this.showWithoutInternet_;
        if (z10) {
            iComputeStringSize += h0.computeBoolSize(13, z10);
        }
        if (this.extras_ != null) {
            iComputeStringSize += h0.computeMessageSize(14, getExtras());
        }
        if (this.sdkAnalyticConfigV2_ != null) {
            iComputeStringSize += h0.computeMessageSize(15, getSdkAnalyticConfigV2());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getSessionResetAfter() {
        return this.sessionResetAfter_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean getShowWithoutInternet() {
        return this.showWithoutInternet_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public TokenConfiguration getTokenConfigurations(int i10) {
        return this.tokenConfigurations_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public int getTokenConfigurationsCount() {
        return this.tokenConfigurations_.size();
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<TokenConfiguration> getTokenConfigurationsList() {
        return this.tokenConfigurations_;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public TokenConfigurationOrBuilder getTokenConfigurationsOrBuilder(int i10) {
        return this.tokenConfigurations_.get(i10);
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public List<? extends TokenConfigurationOrBuilder> getTokenConfigurationsOrBuilderList() {
        return this.tokenConfigurations_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasEventConfiguration() {
        return this.eventConfiguration_ != null;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasExtras() {
        return this.extras_ != null;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasSdkAnalyticConfig() {
        return this.sdkAnalyticConfig_ != null;
    }

    @Override // io.bidmachine.protobuf.InitResponseOrBuilder
    public boolean hasSdkAnalyticConfigV2() {
        return this.sdkAnalyticConfigV2_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getEndpoint().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (getEventCount() > 0) {
            iHashCode = getEventList().hashCode() + o2.B(iHashCode, 37, 2, 53);
        }
        int sessionResetAfter = getSessionResetAfter() + o2.B(iHashCode, 37, 3, 53);
        if (getAdNetworksCount() > 0) {
            sessionResetAfter = getAdNetworksList().hashCode() + o2.B(sessionResetAfter, 37, 4, 53);
        }
        int adRequestTmax = getAdRequestTmax() + ((((getAdCacheMaxAge() + a.d(o2.B(sessionResetAfter, 37, 5, 53), this.adCacheControl_, 37, 6, 53)) * 37) + 7) * 53);
        if (!internalGetAdCachePlacementControl().getMap().isEmpty()) {
            adRequestTmax = o2.B(adRequestTmax, 37, 8, 53) + internalGetAdCachePlacementControl().hashCode();
        }
        int adNetworksLoadingTimeout = getAdNetworksLoadingTimeout() + o2.B(adRequestTmax, 37, 9, 53);
        if (hasSdkAnalyticConfig()) {
            adNetworksLoadingTimeout = getSdkAnalyticConfig().hashCode() + o2.B(adNetworksLoadingTimeout, 37, 10, 53);
        }
        if (hasEventConfiguration()) {
            adNetworksLoadingTimeout = getEventConfiguration().hashCode() + o2.B(adNetworksLoadingTimeout, 37, 11, 53);
        }
        if (getTokenConfigurationsCount() > 0) {
            adNetworksLoadingTimeout = getTokenConfigurationsList().hashCode() + o2.B(adNetworksLoadingTimeout, 37, 12, 53);
        }
        int iHashBoolean = x7.hashBoolean(getShowWithoutInternet()) + o2.B(adNetworksLoadingTimeout, 37, 13, 53);
        if (hasExtras()) {
            iHashBoolean = getExtras().hashCode() + o2.B(iHashBoolean, 37, 14, 53);
        }
        if (hasSdkAnalyticConfigV2()) {
            iHashBoolean = getSdkAnalyticConfigV2().hashCode() + o2.B(iHashBoolean, 37, 15, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashBoolean * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InitResponse.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.k7
    public b9 internalGetMapField(int i10) {
        if (i10 == 8) {
            return internalGetAdCachePlacementControl();
        }
        throw new RuntimeException(b.e(i10, "Invalid map field number: "));
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public Object newInstance(j7 j7Var) {
        return new InitResponse();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getEndpointBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.endpoint_);
        }
        for (int i10 = 0; i10 < this.event_.size(); i10++) {
            h0Var.writeMessage(2, this.event_.get(i10));
        }
        int i11 = this.sessionResetAfter_;
        if (i11 != 0) {
            h0Var.writeUInt32(3, i11);
        }
        for (int i12 = 0; i12 < this.adNetworks_.size(); i12++) {
            h0Var.writeMessage(4, this.adNetworks_.get(i12));
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            h0Var.writeEnum(5, this.adCacheControl_);
        }
        int i13 = this.adCacheMaxAge_;
        if (i13 != 0) {
            h0Var.writeUInt32(6, i13);
        }
        int i14 = this.adRequestTmax_;
        if (i14 != 0) {
            h0Var.writeUInt32(7, i14);
        }
        k7.serializeStringMapTo(h0Var, internalGetAdCachePlacementControl(), AdCachePlacementControlDefaultEntryHolder.defaultEntry, 8);
        int i15 = this.adNetworksLoadingTimeout_;
        if (i15 != 0) {
            h0Var.writeUInt32(9, i15);
        }
        if (this.sdkAnalyticConfig_ != null) {
            h0Var.writeMessage(10, getSdkAnalyticConfig());
        }
        if (this.eventConfiguration_ != null) {
            h0Var.writeMessage(11, getEventConfiguration());
        }
        for (int i16 = 0; i16 < this.tokenConfigurations_.size(); i16++) {
            h0Var.writeMessage(12, this.tokenConfigurations_.get(i16));
        }
        boolean z10 = this.showWithoutInternet_;
        if (z10) {
            h0Var.writeBool(13, z10);
        }
        if (this.extras_ != null) {
            h0Var.writeMessage(14, getExtras());
        }
        if (this.sdkAnalyticConfigV2_ != null) {
            h0Var.writeMessage(15, getSdkAnalyticConfigV2());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements InitResponseOrBuilder {
        private int adCacheControl_;
        private int adCacheMaxAge_;
        private b9 adCachePlacementControl_;
        private pa adNetworksBuilder_;
        private int adNetworksLoadingTimeout_;
        private List<AdNetwork> adNetworks_;
        private int adRequestTmax_;
        private int bitField0_;
        private Object endpoint_;
        private pa eventBuilder_;
        private xa eventConfigurationBuilder_;
        private AdExtension.EventConfiguration eventConfiguration_;
        private List<Ad.Event> event_;
        private xa extrasBuilder_;
        private Extras extras_;
        private xa sdkAnalyticConfigBuilder_;
        private xa sdkAnalyticConfigV2Builder_;
        private Configuration sdkAnalyticConfigV2_;
        private SdkAnalyticConfig sdkAnalyticConfig_;
        private int sessionResetAfter_;
        private boolean showWithoutInternet_;
        private pa tokenConfigurationsBuilder_;
        private List<TokenConfiguration> tokenConfigurations_;

        private Builder() {
            super(null);
            this.endpoint_ = "";
            List list = Collections.EMPTY_LIST;
            this.event_ = list;
            this.adNetworks_ = list;
            this.adCacheControl_ = 0;
            this.tokenConfigurations_ = list;
            maybeForceBuilderInitialization();
        }

        private void ensureAdNetworksIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.adNetworks_ = new ArrayList(this.adNetworks_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureEventIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.event_ = new ArrayList(this.event_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureTokenConfigurationsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.tokenConfigurations_ = new ArrayList(this.tokenConfigurations_);
                this.bitField0_ |= 8;
            }
        }

        private pa getAdNetworksFieldBuilder() {
            if (this.adNetworksBuilder_ == null) {
                this.adNetworksBuilder_ = new pa(this.adNetworks_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.adNetworks_ = null;
            }
            return this.adNetworksBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
        }

        private xa getEventConfigurationFieldBuilder() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfigurationBuilder_ = new xa(getEventConfiguration(), getParentForChildren(), isClean());
                this.eventConfiguration_ = null;
            }
            return this.eventConfigurationBuilder_;
        }

        private pa getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
                this.eventBuilder_ = new pa(this.event_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.event_ = null;
            }
            return this.eventBuilder_;
        }

        private xa getExtrasFieldBuilder() {
            if (this.extrasBuilder_ == null) {
                this.extrasBuilder_ = new xa(getExtras(), getParentForChildren(), isClean());
                this.extras_ = null;
            }
            return this.extrasBuilder_;
        }

        private xa getSdkAnalyticConfigFieldBuilder() {
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfigBuilder_ = new xa(getSdkAnalyticConfig(), getParentForChildren(), isClean());
                this.sdkAnalyticConfig_ = null;
            }
            return this.sdkAnalyticConfigBuilder_;
        }

        private xa getSdkAnalyticConfigV2FieldBuilder() {
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2Builder_ = new xa(getSdkAnalyticConfigV2(), getParentForChildren(), isClean());
                this.sdkAnalyticConfigV2_ = null;
            }
            return this.sdkAnalyticConfigV2Builder_;
        }

        private pa getTokenConfigurationsFieldBuilder() {
            if (this.tokenConfigurationsBuilder_ == null) {
                this.tokenConfigurationsBuilder_ = new pa(this.tokenConfigurations_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                this.tokenConfigurations_ = null;
            }
            return this.tokenConfigurationsBuilder_;
        }

        private b9 internalGetAdCachePlacementControl() {
            b9 b9Var = this.adCachePlacementControl_;
            return b9Var == null ? b9.emptyMapField(AdCachePlacementControlDefaultEntryHolder.defaultEntry) : b9Var;
        }

        private b9 internalGetMutableAdCachePlacementControl() {
            onChanged();
            if (this.adCachePlacementControl_ == null) {
                this.adCachePlacementControl_ = b9.newMapField(AdCachePlacementControlDefaultEntryHolder.defaultEntry);
            }
            if (!this.adCachePlacementControl_.isMutable()) {
                this.adCachePlacementControl_ = this.adCachePlacementControl_.copy();
            }
            return this.adCachePlacementControl_;
        }

        private void maybeForceBuilderInitialization() {
            if (k7.alwaysUseFieldBuilders) {
                getEventFieldBuilder();
                getAdNetworksFieldBuilder();
                getTokenConfigurationsFieldBuilder();
            }
        }

        public Builder addAdNetworks(AdNetwork adNetwork) {
            pa paVar = this.adNetworksBuilder_;
            if (paVar != null) {
                paVar.addMessage(adNetwork);
                return this;
            }
            adNetwork.getClass();
            ensureAdNetworksIsMutable();
            this.adNetworks_.add(adNetwork);
            onChanged();
            return this;
        }

        public AdNetwork.Builder addAdNetworksBuilder() {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().addBuilder(AdNetwork.getDefaultInstance());
        }

        public Builder addAllAdNetworks(Iterable<? extends AdNetwork> iterable) {
            pa paVar = this.adNetworksBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureAdNetworksIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.adNetworks_);
            onChanged();
            return this;
        }

        public Builder addAllEvent(Iterable<? extends Ad.Event> iterable) {
            pa paVar = this.eventBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureEventIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.event_);
            onChanged();
            return this;
        }

        public Builder addAllTokenConfigurations(Iterable<? extends TokenConfiguration> iterable) {
            pa paVar = this.tokenConfigurationsBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureTokenConfigurationsIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.tokenConfigurations_);
            onChanged();
            return this;
        }

        public Builder addEvent(Ad.Event event) {
            pa paVar = this.eventBuilder_;
            if (paVar != null) {
                paVar.addMessage(event);
                return this;
            }
            event.getClass();
            ensureEventIsMutable();
            this.event_.add(event);
            onChanged();
            return this;
        }

        public Ad.Event.Builder addEventBuilder() {
            return (Ad.Event.Builder) getEventFieldBuilder().addBuilder(Ad.Event.getDefaultInstance());
        }

        public Builder addTokenConfigurations(TokenConfiguration tokenConfiguration) {
            pa paVar = this.tokenConfigurationsBuilder_;
            if (paVar != null) {
                paVar.addMessage(tokenConfiguration);
                return this;
            }
            tokenConfiguration.getClass();
            ensureTokenConfigurationsIsMutable();
            this.tokenConfigurations_.add(tokenConfiguration);
            onChanged();
            return this;
        }

        public TokenConfiguration.Builder addTokenConfigurationsBuilder() {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().addBuilder(TokenConfiguration.getDefaultInstance());
        }

        public Builder clearAdCacheControl() {
            this.adCacheControl_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdCacheMaxAge() {
            this.adCacheMaxAge_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdCachePlacementControl() {
            internalGetMutableAdCachePlacementControl().getMutableMap().clear();
            return this;
        }

        public Builder clearAdNetworks() {
            pa paVar = this.adNetworksBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.adNetworks_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearAdNetworksLoadingTimeout() {
            this.adNetworksLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdRequestTmax() {
            this.adRequestTmax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearEndpoint() {
            this.endpoint_ = InitResponse.getDefaultInstance().getEndpoint();
            onChanged();
            return this;
        }

        public Builder clearEvent() {
            pa paVar = this.eventBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.event_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearEventConfiguration() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
                onChanged();
                return this;
            }
            this.eventConfiguration_ = null;
            this.eventConfigurationBuilder_ = null;
            return this;
        }

        public Builder clearExtras() {
            if (this.extrasBuilder_ == null) {
                this.extras_ = null;
                onChanged();
                return this;
            }
            this.extras_ = null;
            this.extrasBuilder_ = null;
            return this;
        }

        public Builder clearSdkAnalyticConfig() {
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfig_ = null;
                onChanged();
                return this;
            }
            this.sdkAnalyticConfig_ = null;
            this.sdkAnalyticConfigBuilder_ = null;
            return this;
        }

        public Builder clearSdkAnalyticConfigV2() {
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2_ = null;
                onChanged();
                return this;
            }
            this.sdkAnalyticConfigV2_ = null;
            this.sdkAnalyticConfigV2Builder_ = null;
            return this;
        }

        public Builder clearSessionResetAfter() {
            this.sessionResetAfter_ = 0;
            onChanged();
            return this;
        }

        public Builder clearShowWithoutInternet() {
            this.showWithoutInternet_ = false;
            onChanged();
            return this;
        }

        public Builder clearTokenConfigurations() {
            pa paVar = this.tokenConfigurationsBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.tokenConfigurations_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean containsAdCachePlacementControl(String str) {
            str.getClass();
            return internalGetAdCachePlacementControl().getMap().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdCacheControl getAdCacheControl() {
            AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
            return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCacheControlValue() {
            return this.adCacheControl_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCacheMaxAge() {
            return this.adCacheMaxAge_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        @Deprecated
        public Map<String, AdCachePlacementControl> getAdCachePlacementControl() {
            return getAdCachePlacementControlMap();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdCachePlacementControlCount() {
            return internalGetAdCachePlacementControl().getMap().size();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Map<String, AdCachePlacementControl> getAdCachePlacementControlMap() {
            return internalGetAdCachePlacementControl().getMap();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl) {
            str.getClass();
            Map<Object, Object> map = internalGetAdCachePlacementControl().getMap();
            return map.containsKey(str) ? (AdCachePlacementControl) map.get(str) : adCachePlacementControl;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdCachePlacementControl getAdCachePlacementControlOrThrow(String str) {
            str.getClass();
            Map<Object, Object> map = internalGetAdCachePlacementControl().getMap();
            if (map.containsKey(str)) {
                return (AdCachePlacementControl) map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdNetwork getAdNetworks(int i10) {
            pa paVar = this.adNetworksBuilder_;
            return paVar == null ? this.adNetworks_.get(i10) : (AdNetwork) paVar.getMessage(i10);
        }

        public AdNetwork.Builder getAdNetworksBuilder(int i10) {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().getBuilder(i10);
        }

        public List<AdNetwork.Builder> getAdNetworksBuilderList() {
            return getAdNetworksFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdNetworksCount() {
            pa paVar = this.adNetworksBuilder_;
            return paVar == null ? this.adNetworks_.size() : paVar.getCount();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<AdNetwork> getAdNetworksList() {
            pa paVar = this.adNetworksBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.adNetworks_) : paVar.getMessageList();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdNetworksLoadingTimeout() {
            return this.adNetworksLoadingTimeout_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdNetworkOrBuilder getAdNetworksOrBuilder(int i10) {
            pa paVar = this.adNetworksBuilder_;
            return paVar == null ? this.adNetworks_.get(i10) : (AdNetworkOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList() {
            pa paVar = this.adNetworksBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.adNetworks_);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getAdRequestTmax() {
            return this.adRequestTmax_;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_descriptor;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public String getEndpoint() {
            Object obj = this.endpoint_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.endpoint_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public ByteString getEndpointBytes() {
            Object obj = this.endpoint_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.endpoint_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Ad.Event getEvent(int i10) {
            pa paVar = this.eventBuilder_;
            return paVar == null ? this.event_.get(i10) : (Ad.Event) paVar.getMessage(i10);
        }

        public Ad.Event.Builder getEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().getBuilder(i10);
        }

        public List<Ad.Event.Builder> getEventBuilderList() {
            return getEventFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdExtension.EventConfiguration getEventConfiguration() {
            xa xaVar = this.eventConfigurationBuilder_;
            if (xaVar != null) {
                return (AdExtension.EventConfiguration) xaVar.getMessage();
            }
            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        public AdExtension.EventConfiguration.Builder getEventConfigurationBuilder() {
            onChanged();
            return (AdExtension.EventConfiguration.Builder) getEventConfigurationFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public AdExtension.EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
            xa xaVar = this.eventConfigurationBuilder_;
            if (xaVar != null) {
                return (AdExtension.EventConfigurationOrBuilder) xaVar.getMessageOrBuilder();
            }
            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? AdExtension.EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getEventCount() {
            pa paVar = this.eventBuilder_;
            return paVar == null ? this.event_.size() : paVar.getCount();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<Ad.Event> getEventList() {
            pa paVar = this.eventBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.event_) : paVar.getMessageList();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Ad.EventOrBuilder getEventOrBuilder(int i10) {
            pa paVar = this.eventBuilder_;
            return paVar == null ? this.event_.get(i10) : (Ad.EventOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
            pa paVar = this.eventBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.event_);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Extras getExtras() {
            xa xaVar = this.extrasBuilder_;
            if (xaVar != null) {
                return (Extras) xaVar.getMessage();
            }
            Extras extras = this.extras_;
            return extras == null ? Extras.getDefaultInstance() : extras;
        }

        public Extras.Builder getExtrasBuilder() {
            onChanged();
            return (Extras.Builder) getExtrasFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public ExtrasOrBuilder getExtrasOrBuilder() {
            xa xaVar = this.extrasBuilder_;
            if (xaVar != null) {
                return (ExtrasOrBuilder) xaVar.getMessageOrBuilder();
            }
            Extras extras = this.extras_;
            return extras == null ? Extras.getDefaultInstance() : extras;
        }

        @Deprecated
        public Map<String, AdCachePlacementControl> getMutableAdCachePlacementControl() {
            return internalGetMutableAdCachePlacementControl().getMutableMap();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public SdkAnalyticConfig getSdkAnalyticConfig() {
            xa xaVar = this.sdkAnalyticConfigBuilder_;
            if (xaVar != null) {
                return (SdkAnalyticConfig) xaVar.getMessage();
            }
            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
            return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
        }

        public SdkAnalyticConfig.Builder getSdkAnalyticConfigBuilder() {
            onChanged();
            return (SdkAnalyticConfig.Builder) getSdkAnalyticConfigFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder() {
            xa xaVar = this.sdkAnalyticConfigBuilder_;
            if (xaVar != null) {
                return (SdkAnalyticConfigOrBuilder) xaVar.getMessageOrBuilder();
            }
            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
            return sdkAnalyticConfig == null ? SdkAnalyticConfig.getDefaultInstance() : sdkAnalyticConfig;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public Configuration getSdkAnalyticConfigV2() {
            xa xaVar = this.sdkAnalyticConfigV2Builder_;
            if (xaVar != null) {
                return (Configuration) xaVar.getMessage();
            }
            Configuration configuration = this.sdkAnalyticConfigV2_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        public Configuration.Builder getSdkAnalyticConfigV2Builder() {
            onChanged();
            return (Configuration.Builder) getSdkAnalyticConfigV2FieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public ConfigurationOrBuilder getSdkAnalyticConfigV2OrBuilder() {
            xa xaVar = this.sdkAnalyticConfigV2Builder_;
            if (xaVar != null) {
                return (ConfigurationOrBuilder) xaVar.getMessageOrBuilder();
            }
            Configuration configuration = this.sdkAnalyticConfigV2_;
            return configuration == null ? Configuration.getDefaultInstance() : configuration;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getSessionResetAfter() {
            return this.sessionResetAfter_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean getShowWithoutInternet() {
            return this.showWithoutInternet_;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public TokenConfiguration getTokenConfigurations(int i10) {
            pa paVar = this.tokenConfigurationsBuilder_;
            return paVar == null ? this.tokenConfigurations_.get(i10) : (TokenConfiguration) paVar.getMessage(i10);
        }

        public TokenConfiguration.Builder getTokenConfigurationsBuilder(int i10) {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().getBuilder(i10);
        }

        public List<TokenConfiguration.Builder> getTokenConfigurationsBuilderList() {
            return getTokenConfigurationsFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public int getTokenConfigurationsCount() {
            pa paVar = this.tokenConfigurationsBuilder_;
            return paVar == null ? this.tokenConfigurations_.size() : paVar.getCount();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<TokenConfiguration> getTokenConfigurationsList() {
            pa paVar = this.tokenConfigurationsBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.tokenConfigurations_) : paVar.getMessageList();
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public TokenConfigurationOrBuilder getTokenConfigurationsOrBuilder(int i10) {
            pa paVar = this.tokenConfigurationsBuilder_;
            return paVar == null ? this.tokenConfigurations_.get(i10) : (TokenConfigurationOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public List<? extends TokenConfigurationOrBuilder> getTokenConfigurationsOrBuilderList() {
            pa paVar = this.tokenConfigurationsBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.tokenConfigurations_);
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasEventConfiguration() {
            return (this.eventConfigurationBuilder_ == null && this.eventConfiguration_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasExtras() {
            return (this.extrasBuilder_ == null && this.extras_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasSdkAnalyticConfig() {
            return (this.sdkAnalyticConfigBuilder_ == null && this.sdkAnalyticConfig_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.InitResponseOrBuilder
        public boolean hasSdkAnalyticConfigV2() {
            return (this.sdkAnalyticConfigV2Builder_ == null && this.sdkAnalyticConfigV2_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InitResponse.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMapField(int i10) {
            if (i10 == 8) {
                return internalGetAdCachePlacementControl();
            }
            throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMutableMapField(int i10) {
            if (i10 == 8) {
                return internalGetMutableAdCachePlacementControl();
            }
            throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeEventConfiguration(AdExtension.EventConfiguration eventConfiguration) {
            xa xaVar = this.eventConfigurationBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(eventConfiguration);
                return this;
            }
            AdExtension.EventConfiguration eventConfiguration2 = this.eventConfiguration_;
            if (eventConfiguration2 != null) {
                this.eventConfiguration_ = AdExtension.EventConfiguration.newBuilder(eventConfiguration2).mergeFrom(eventConfiguration).buildPartial();
            } else {
                this.eventConfiguration_ = eventConfiguration;
            }
            onChanged();
            return this;
        }

        public Builder mergeExtras(Extras extras) {
            xa xaVar = this.extrasBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(extras);
                return this;
            }
            Extras extras2 = this.extras_;
            if (extras2 != null) {
                this.extras_ = Extras.newBuilder(extras2).mergeFrom(extras).buildPartial();
            } else {
                this.extras_ = extras;
            }
            onChanged();
            return this;
        }

        public Builder mergeSdkAnalyticConfig(SdkAnalyticConfig sdkAnalyticConfig) {
            xa xaVar = this.sdkAnalyticConfigBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(sdkAnalyticConfig);
                return this;
            }
            SdkAnalyticConfig sdkAnalyticConfig2 = this.sdkAnalyticConfig_;
            if (sdkAnalyticConfig2 != null) {
                this.sdkAnalyticConfig_ = SdkAnalyticConfig.newBuilder(sdkAnalyticConfig2).mergeFrom(sdkAnalyticConfig).buildPartial();
            } else {
                this.sdkAnalyticConfig_ = sdkAnalyticConfig;
            }
            onChanged();
            return this;
        }

        public Builder mergeSdkAnalyticConfigV2(Configuration configuration) {
            xa xaVar = this.sdkAnalyticConfigV2Builder_;
            if (xaVar != null) {
                xaVar.mergeFrom(configuration);
                return this;
            }
            Configuration configuration2 = this.sdkAnalyticConfigV2_;
            if (configuration2 != null) {
                this.sdkAnalyticConfigV2_ = Configuration.newBuilder(configuration2).mergeFrom(configuration).buildPartial();
            } else {
                this.sdkAnalyticConfigV2_ = configuration;
            }
            onChanged();
            return this;
        }

        public Builder putAdCachePlacementControl(String str, AdCachePlacementControl adCachePlacementControl) {
            str.getClass();
            adCachePlacementControl.getClass();
            internalGetMutableAdCachePlacementControl().getMutableMap().put(str, adCachePlacementControl);
            return this;
        }

        public Builder putAllAdCachePlacementControl(Map<String, AdCachePlacementControl> map) {
            internalGetMutableAdCachePlacementControl().getMutableMap().putAll(map);
            return this;
        }

        public Builder removeAdCachePlacementControl(String str) {
            str.getClass();
            internalGetMutableAdCachePlacementControl().getMutableMap().remove(str);
            return this;
        }

        public Builder removeAdNetworks(int i10) {
            pa paVar = this.adNetworksBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureAdNetworksIsMutable();
            this.adNetworks_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeEvent(int i10) {
            pa paVar = this.eventBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureEventIsMutable();
            this.event_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeTokenConfigurations(int i10) {
            pa paVar = this.tokenConfigurationsBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureTokenConfigurationsIsMutable();
            this.tokenConfigurations_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setAdCacheControl(AdCacheControl adCacheControl) {
            adCacheControl.getClass();
            this.adCacheControl_ = adCacheControl.getNumber();
            onChanged();
            return this;
        }

        public Builder setAdCacheControlValue(int i10) {
            this.adCacheControl_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdCacheMaxAge(int i10) {
            this.adCacheMaxAge_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdNetworks(int i10, AdNetwork adNetwork) {
            pa paVar = this.adNetworksBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, adNetwork);
                return this;
            }
            adNetwork.getClass();
            ensureAdNetworksIsMutable();
            this.adNetworks_.set(i10, adNetwork);
            onChanged();
            return this;
        }

        public Builder setAdNetworksLoadingTimeout(int i10) {
            this.adNetworksLoadingTimeout_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdRequestTmax(int i10) {
            this.adRequestTmax_ = i10;
            onChanged();
            return this;
        }

        public Builder setEndpoint(String str) {
            str.getClass();
            this.endpoint_ = str;
            onChanged();
            return this;
        }

        public Builder setEndpointBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.endpoint_ = byteString;
            onChanged();
            return this;
        }

        public Builder setEvent(int i10, Ad.Event event) {
            pa paVar = this.eventBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, event);
                return this;
            }
            event.getClass();
            ensureEventIsMutable();
            this.event_.set(i10, event);
            onChanged();
            return this;
        }

        public Builder setEventConfiguration(AdExtension.EventConfiguration eventConfiguration) {
            xa xaVar = this.eventConfigurationBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(eventConfiguration);
                return this;
            }
            eventConfiguration.getClass();
            this.eventConfiguration_ = eventConfiguration;
            onChanged();
            return this;
        }

        public Builder setExtras(Extras extras) {
            xa xaVar = this.extrasBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(extras);
                return this;
            }
            extras.getClass();
            this.extras_ = extras;
            onChanged();
            return this;
        }

        public Builder setSdkAnalyticConfig(SdkAnalyticConfig sdkAnalyticConfig) {
            xa xaVar = this.sdkAnalyticConfigBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(sdkAnalyticConfig);
                return this;
            }
            sdkAnalyticConfig.getClass();
            this.sdkAnalyticConfig_ = sdkAnalyticConfig;
            onChanged();
            return this;
        }

        public Builder setSdkAnalyticConfigV2(Configuration configuration) {
            xa xaVar = this.sdkAnalyticConfigV2Builder_;
            if (xaVar != null) {
                xaVar.setMessage(configuration);
                return this;
            }
            configuration.getClass();
            this.sdkAnalyticConfigV2_ = configuration;
            onChanged();
            return this;
        }

        public Builder setSessionResetAfter(int i10) {
            this.sessionResetAfter_ = i10;
            onChanged();
            return this;
        }

        public Builder setShowWithoutInternet(boolean z10) {
            this.showWithoutInternet_ = z10;
            onChanged();
            return this;
        }

        public Builder setTokenConfigurations(int i10, TokenConfiguration tokenConfiguration) {
            pa paVar = this.tokenConfigurationsBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, tokenConfiguration);
                return this;
            }
            tokenConfiguration.getClass();
            ensureTokenConfigurationsIsMutable();
            this.tokenConfigurations_.set(i10, tokenConfiguration);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitResponse build() {
            InitResponse initResponseBuildPartial = buildPartial();
            if (initResponseBuildPartial.isInitialized()) {
                return initResponseBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) initResponseBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public InitResponse buildPartial() {
            InitResponse initResponse = new InitResponse(this);
            initResponse.endpoint_ = this.endpoint_;
            pa paVar = this.eventBuilder_;
            if (paVar != null) {
                initResponse.event_ = paVar.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                    this.bitField0_ &= -2;
                }
                initResponse.event_ = this.event_;
            }
            initResponse.sessionResetAfter_ = this.sessionResetAfter_;
            pa paVar2 = this.adNetworksBuilder_;
            if (paVar2 != null) {
                initResponse.adNetworks_ = paVar2.build();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
                    this.bitField0_ &= -3;
                }
                initResponse.adNetworks_ = this.adNetworks_;
            }
            initResponse.adCacheControl_ = this.adCacheControl_;
            initResponse.adCacheMaxAge_ = this.adCacheMaxAge_;
            initResponse.adRequestTmax_ = this.adRequestTmax_;
            initResponse.adCachePlacementControl_ = internalGetAdCachePlacementControl();
            initResponse.adCachePlacementControl_.makeImmutable();
            initResponse.adNetworksLoadingTimeout_ = this.adNetworksLoadingTimeout_;
            xa xaVar = this.sdkAnalyticConfigBuilder_;
            if (xaVar == null) {
                initResponse.sdkAnalyticConfig_ = this.sdkAnalyticConfig_;
            } else {
                initResponse.sdkAnalyticConfig_ = (SdkAnalyticConfig) xaVar.build();
            }
            xa xaVar2 = this.eventConfigurationBuilder_;
            if (xaVar2 == null) {
                initResponse.eventConfiguration_ = this.eventConfiguration_;
            } else {
                initResponse.eventConfiguration_ = (AdExtension.EventConfiguration) xaVar2.build();
            }
            pa paVar3 = this.tokenConfigurationsBuilder_;
            if (paVar3 != null) {
                initResponse.tokenConfigurations_ = paVar3.build();
            } else {
                if ((this.bitField0_ & 8) != 0) {
                    this.tokenConfigurations_ = Collections.unmodifiableList(this.tokenConfigurations_);
                    this.bitField0_ &= -9;
                }
                initResponse.tokenConfigurations_ = this.tokenConfigurations_;
            }
            initResponse.showWithoutInternet_ = this.showWithoutInternet_;
            xa xaVar3 = this.extrasBuilder_;
            if (xaVar3 == null) {
                initResponse.extras_ = this.extras_;
            } else {
                initResponse.extras_ = (Extras) xaVar3.build();
            }
            xa xaVar4 = this.sdkAnalyticConfigV2Builder_;
            if (xaVar4 == null) {
                initResponse.sdkAnalyticConfigV2_ = this.sdkAnalyticConfigV2_;
            } else {
                initResponse.sdkAnalyticConfigV2_ = (Configuration) xaVar4.build();
            }
            onBuilt();
            return initResponse;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public InitResponse getDefaultInstanceForType() {
            return InitResponse.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(gc gcVar) {
            return (Builder) super.setUnknownFields(gcVar);
        }

        public AdNetwork.Builder addAdNetworksBuilder(int i10) {
            return (AdNetwork.Builder) getAdNetworksFieldBuilder().addBuilder(i10, AdNetwork.getDefaultInstance());
        }

        public Ad.Event.Builder addEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().addBuilder(i10, Ad.Event.getDefaultInstance());
        }

        public TokenConfiguration.Builder addTokenConfigurationsBuilder(int i10) {
            return (TokenConfiguration.Builder) getTokenConfigurationsFieldBuilder().addBuilder(i10, TokenConfiguration.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(gc gcVar) {
            return (Builder) super.mergeUnknownFields(gcVar);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.endpoint_ = "";
            pa paVar = this.eventBuilder_;
            if (paVar == null) {
                this.event_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
            } else {
                paVar.clear();
            }
            this.sessionResetAfter_ = 0;
            pa paVar2 = this.adNetworksBuilder_;
            if (paVar2 == null) {
                this.adNetworks_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
            } else {
                paVar2.clear();
            }
            this.adCacheControl_ = 0;
            this.adCacheMaxAge_ = 0;
            this.adRequestTmax_ = 0;
            internalGetMutableAdCachePlacementControl().clear();
            this.adNetworksLoadingTimeout_ = 0;
            if (this.sdkAnalyticConfigBuilder_ == null) {
                this.sdkAnalyticConfig_ = null;
            } else {
                this.sdkAnalyticConfig_ = null;
                this.sdkAnalyticConfigBuilder_ = null;
            }
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
            } else {
                this.eventConfiguration_ = null;
                this.eventConfigurationBuilder_ = null;
            }
            pa paVar3 = this.tokenConfigurationsBuilder_;
            if (paVar3 == null) {
                this.tokenConfigurations_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
            } else {
                paVar3.clear();
            }
            this.showWithoutInternet_ = false;
            if (this.extrasBuilder_ == null) {
                this.extras_ = null;
            } else {
                this.extras_ = null;
                this.extrasBuilder_ = null;
            }
            if (this.sdkAnalyticConfigV2Builder_ == null) {
                this.sdkAnalyticConfigV2_ = null;
                return this;
            }
            this.sdkAnalyticConfigV2_ = null;
            this.sdkAnalyticConfigV2Builder_ = null;
            return this;
        }

        public Builder setEventConfiguration(AdExtension.EventConfiguration.Builder builder) {
            xa xaVar = this.eventConfigurationBuilder_;
            if (xaVar == null) {
                this.eventConfiguration_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setExtras(Extras.Builder builder) {
            xa xaVar = this.extrasBuilder_;
            if (xaVar == null) {
                this.extras_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setSdkAnalyticConfig(SdkAnalyticConfig.Builder builder) {
            xa xaVar = this.sdkAnalyticConfigBuilder_;
            if (xaVar == null) {
                this.sdkAnalyticConfig_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setSdkAnalyticConfigV2(Configuration.Builder builder) {
            xa xaVar = this.sdkAnalyticConfigV2Builder_;
            if (xaVar == null) {
                this.sdkAnalyticConfigV2_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder addAdNetworks(int i10, AdNetwork adNetwork) {
            pa paVar = this.adNetworksBuilder_;
            if (paVar == null) {
                adNetwork.getClass();
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(i10, adNetwork);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, adNetwork);
            return this;
        }

        public Builder addEvent(int i10, Ad.Event event) {
            pa paVar = this.eventBuilder_;
            if (paVar == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(i10, event);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, event);
            return this;
        }

        public Builder addTokenConfigurations(int i10, TokenConfiguration tokenConfiguration) {
            pa paVar = this.tokenConfigurationsBuilder_;
            if (paVar == null) {
                tokenConfiguration.getClass();
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(i10, tokenConfiguration);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, tokenConfiguration);
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof InitResponse) {
                return mergeFrom((InitResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setAdNetworks(int i10, AdNetwork.Builder builder) {
            pa paVar = this.adNetworksBuilder_;
            if (paVar == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        public Builder setEvent(int i10, Ad.Event.Builder builder) {
            pa paVar = this.eventBuilder_;
            if (paVar == null) {
                ensureEventIsMutable();
                this.event_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        public Builder setTokenConfigurations(int i10, TokenConfiguration.Builder builder) {
            pa paVar = this.tokenConfigurationsBuilder_;
            if (paVar == null) {
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.endpoint_ = "";
            List list = Collections.EMPTY_LIST;
            this.event_ = list;
            this.adNetworks_ = list;
            this.adCacheControl_ = 0;
            this.tokenConfigurations_ = list;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(InitResponse initResponse) {
            if (initResponse == InitResponse.getDefaultInstance()) {
                return this;
            }
            if (!initResponse.getEndpoint().isEmpty()) {
                this.endpoint_ = initResponse.endpoint_;
                onChanged();
            }
            if (this.eventBuilder_ == null) {
                if (!initResponse.event_.isEmpty()) {
                    if (this.event_.isEmpty()) {
                        this.event_ = initResponse.event_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEventIsMutable();
                        this.event_.addAll(initResponse.event_);
                    }
                    onChanged();
                }
            } else if (!initResponse.event_.isEmpty()) {
                if (!this.eventBuilder_.isEmpty()) {
                    this.eventBuilder_.addAllMessages(initResponse.event_);
                } else {
                    this.eventBuilder_.dispose();
                    this.eventBuilder_ = null;
                    this.event_ = initResponse.event_;
                    this.bitField0_ &= -2;
                    this.eventBuilder_ = k7.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                }
            }
            if (initResponse.getSessionResetAfter() != 0) {
                setSessionResetAfter(initResponse.getSessionResetAfter());
            }
            if (this.adNetworksBuilder_ == null) {
                if (!initResponse.adNetworks_.isEmpty()) {
                    if (this.adNetworks_.isEmpty()) {
                        this.adNetworks_ = initResponse.adNetworks_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAdNetworksIsMutable();
                        this.adNetworks_.addAll(initResponse.adNetworks_);
                    }
                    onChanged();
                }
            } else if (!initResponse.adNetworks_.isEmpty()) {
                if (!this.adNetworksBuilder_.isEmpty()) {
                    this.adNetworksBuilder_.addAllMessages(initResponse.adNetworks_);
                } else {
                    this.adNetworksBuilder_.dispose();
                    this.adNetworksBuilder_ = null;
                    this.adNetworks_ = initResponse.adNetworks_;
                    this.bitField0_ &= -3;
                    this.adNetworksBuilder_ = k7.alwaysUseFieldBuilders ? getAdNetworksFieldBuilder() : null;
                }
            }
            if (initResponse.adCacheControl_ != 0) {
                setAdCacheControlValue(initResponse.getAdCacheControlValue());
            }
            if (initResponse.getAdCacheMaxAge() != 0) {
                setAdCacheMaxAge(initResponse.getAdCacheMaxAge());
            }
            if (initResponse.getAdRequestTmax() != 0) {
                setAdRequestTmax(initResponse.getAdRequestTmax());
            }
            internalGetMutableAdCachePlacementControl().mergeFrom(initResponse.internalGetAdCachePlacementControl());
            if (initResponse.getAdNetworksLoadingTimeout() != 0) {
                setAdNetworksLoadingTimeout(initResponse.getAdNetworksLoadingTimeout());
            }
            if (initResponse.hasSdkAnalyticConfig()) {
                mergeSdkAnalyticConfig(initResponse.getSdkAnalyticConfig());
            }
            if (initResponse.hasEventConfiguration()) {
                mergeEventConfiguration(initResponse.getEventConfiguration());
            }
            if (this.tokenConfigurationsBuilder_ == null) {
                if (!initResponse.tokenConfigurations_.isEmpty()) {
                    if (this.tokenConfigurations_.isEmpty()) {
                        this.tokenConfigurations_ = initResponse.tokenConfigurations_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureTokenConfigurationsIsMutable();
                        this.tokenConfigurations_.addAll(initResponse.tokenConfigurations_);
                    }
                    onChanged();
                }
            } else if (!initResponse.tokenConfigurations_.isEmpty()) {
                if (!this.tokenConfigurationsBuilder_.isEmpty()) {
                    this.tokenConfigurationsBuilder_.addAllMessages(initResponse.tokenConfigurations_);
                } else {
                    this.tokenConfigurationsBuilder_.dispose();
                    this.tokenConfigurationsBuilder_ = null;
                    this.tokenConfigurations_ = initResponse.tokenConfigurations_;
                    this.bitField0_ &= -9;
                    this.tokenConfigurationsBuilder_ = k7.alwaysUseFieldBuilders ? getTokenConfigurationsFieldBuilder() : null;
                }
            }
            if (initResponse.getShowWithoutInternet()) {
                setShowWithoutInternet(initResponse.getShowWithoutInternet());
            }
            if (initResponse.hasExtras()) {
                mergeExtras(initResponse.getExtras());
            }
            if (initResponse.hasSdkAnalyticConfigV2()) {
                mergeSdkAnalyticConfigV2(initResponse.getSdkAnalyticConfigV2());
            }
            mergeUnknownFields(((k7) initResponse).unknownFields);
            onChanged();
            return this;
        }

        public Builder addAdNetworks(AdNetwork.Builder builder) {
            pa paVar = this.adNetworksBuilder_;
            if (paVar == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addEvent(Ad.Event.Builder builder) {
            pa paVar = this.eventBuilder_;
            if (paVar == null) {
                ensureEventIsMutable();
                this.event_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addTokenConfigurations(TokenConfiguration.Builder builder) {
            pa paVar = this.tokenConfigurationsBuilder_;
            if (paVar == null) {
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addAdNetworks(int i10, AdNetwork.Builder builder) {
            pa paVar = this.adNetworksBuilder_;
            if (paVar == null) {
                ensureAdNetworksIsMutable();
                this.adNetworks_.add(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(i10, builder.build());
            return this;
        }

        public Builder addEvent(int i10, Ad.Event.Builder builder) {
            pa paVar = this.eventBuilder_;
            if (paVar == null) {
                ensureEventIsMutable();
                this.event_.add(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(i10, builder.build());
            return this;
        }

        public Builder addTokenConfigurations(int i10, TokenConfiguration.Builder builder) {
            pa paVar = this.tokenConfigurationsBuilder_;
            if (paVar == null) {
                ensureTokenConfigurationsIsMutable();
                this.tokenConfigurations_.add(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(i10, builder.build());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.InitResponse.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.InitResponse.access$2400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.InitResponse r3 = (io.bidmachine.protobuf.InitResponse) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                io.bidmachine.protobuf.InitResponse r4 = (io.bidmachine.protobuf.InitResponse) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.InitResponse.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.InitResponse$Builder");
        }
    }

    public static Builder newBuilder(InitResponse initResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(initResponse);
    }

    public static InitResponse parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private InitResponse(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static InitResponse parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (InitResponse) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static InitResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public InitResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static InitResponse parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private InitResponse() {
        this.memoizedIsInitialized = (byte) -1;
        this.endpoint_ = "";
        List list = Collections.EMPTY_LIST;
        this.event_ = list;
        this.adNetworks_ = list;
        this.adCacheControl_ = 0;
        this.tokenConfigurations_ = list;
    }

    public static InitResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static InitResponse parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (InitResponse) PARSER.parseFrom(bArr, m5Var);
    }

    public static InitResponse parseFrom(InputStream inputStream) throws IOException {
        return (InitResponse) k7.parseWithIOException(PARSER, inputStream);
    }

    public static InitResponse parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (InitResponse) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static InitResponse parseFrom(y yVar) throws IOException {
        return (InitResponse) k7.parseWithIOException(PARSER, yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    private InitResponse(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    switch (tag) {
                        case 0:
                            z10 = true;
                        case 10:
                            this.endpoint_ = yVar.readStringRequireUtf8();
                        case 18:
                            int i10 = (c10 == true ? 1 : 0) & 1;
                            c10 = c10;
                            if (i10 == 0) {
                                this.event_ = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 1;
                            }
                            this.event_.add(yVar.readMessage(Ad.Event.parser(), m5Var));
                        case 24:
                            this.sessionResetAfter_ = yVar.readUInt32();
                        case 34:
                            int i11 = (c10 == true ? 1 : 0) & 2;
                            c10 = c10;
                            if (i11 == 0) {
                                this.adNetworks_ = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 2;
                            }
                            this.adNetworks_.add(yVar.readMessage(AdNetwork.parser(), m5Var));
                        case 40:
                            this.adCacheControl_ = yVar.readEnum();
                        case 48:
                            this.adCacheMaxAge_ = yVar.readUInt32();
                        case 56:
                            this.adRequestTmax_ = yVar.readUInt32();
                        case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                            int i12 = (c10 == true ? 1 : 0) & 4;
                            c10 = c10;
                            if (i12 == 0) {
                                this.adCachePlacementControl_ = b9.newMapField(AdCachePlacementControlDefaultEntryHolder.defaultEntry);
                                c10 = (c10 == true ? 1 : 0) | 4;
                            }
                            s8 s8Var = (s8) yVar.readMessage(AdCachePlacementControlDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                            this.adCachePlacementControl_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
                        case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                            this.adNetworksLoadingTimeout_ = yVar.readUInt32();
                        case 82:
                            SdkAnalyticConfig sdkAnalyticConfig = this.sdkAnalyticConfig_;
                            SdkAnalyticConfig.Builder builder = sdkAnalyticConfig != null ? sdkAnalyticConfig.toBuilder() : null;
                            SdkAnalyticConfig sdkAnalyticConfig2 = (SdkAnalyticConfig) yVar.readMessage(SdkAnalyticConfig.parser(), m5Var);
                            this.sdkAnalyticConfig_ = sdkAnalyticConfig2;
                            if (builder != null) {
                                builder.mergeFrom(sdkAnalyticConfig2);
                                this.sdkAnalyticConfig_ = builder.buildPartial();
                            }
                        case 90:
                            AdExtension.EventConfiguration eventConfiguration = this.eventConfiguration_;
                            AdExtension.EventConfiguration.Builder builder2 = eventConfiguration != null ? eventConfiguration.toBuilder() : null;
                            AdExtension.EventConfiguration eventConfiguration2 = (AdExtension.EventConfiguration) yVar.readMessage(AdExtension.EventConfiguration.parser(), m5Var);
                            this.eventConfiguration_ = eventConfiguration2;
                            if (builder2 != null) {
                                builder2.mergeFrom(eventConfiguration2);
                                this.eventConfiguration_ = builder2.buildPartial();
                            }
                        case 98:
                            int i13 = (c10 == true ? 1 : 0) & 8;
                            c10 = c10;
                            if (i13 == 0) {
                                this.tokenConfigurations_ = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | '\b';
                            }
                            this.tokenConfigurations_.add(yVar.readMessage(TokenConfiguration.parser(), m5Var));
                        case 104:
                            this.showWithoutInternet_ = yVar.readBool();
                        case 114:
                            Extras extras = this.extras_;
                            Extras.Builder builder3 = extras != null ? extras.toBuilder() : null;
                            Extras extras2 = (Extras) yVar.readMessage(Extras.parser(), m5Var);
                            this.extras_ = extras2;
                            if (builder3 != null) {
                                builder3.mergeFrom(extras2);
                                this.extras_ = builder3.buildPartial();
                            }
                        case INVALID_ADS_ENDPOINT_VALUE:
                            Configuration configuration = this.sdkAnalyticConfigV2_;
                            Configuration.Builder builder4 = configuration != null ? configuration.toBuilder() : null;
                            Configuration configuration2 = (Configuration) yVar.readMessage(Configuration.parser(), m5Var);
                            this.sdkAnalyticConfigV2_ = configuration2;
                            if (builder4 != null) {
                                builder4.mergeFrom(configuration2);
                                this.sdkAnalyticConfigV2_ = builder4.buildPartial();
                            }
                        default:
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                z10 = true;
                            }
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if (((c10 == true ? 1 : 0) & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                }
                if (((c10 == true ? 1 : 0) & 2) != 0) {
                    this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
                }
                if (((c10 == true ? 1 : 0) & 8) != 0) {
                    this.tokenConfigurations_ = Collections.unmodifiableList(this.tokenConfigurations_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (((c10 == true ? 1 : 0) & 1) != 0) {
            this.event_ = Collections.unmodifiableList(this.event_);
        }
        if (((c10 == true ? 1 : 0) & 2) != 0) {
            this.adNetworks_ = Collections.unmodifiableList(this.adNetworks_);
        }
        if (((c10 == true ? 1 : 0) & 8) != 0) {
            this.tokenConfigurations_ = Collections.unmodifiableList(this.tokenConfigurations_);
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static InitResponse parseFrom(y yVar, m5 m5Var) throws IOException {
        return (InitResponse) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
