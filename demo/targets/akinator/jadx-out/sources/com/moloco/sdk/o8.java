package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.Init$SDKInitResponse;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o8 extends GeneratedMessageLite.Builder implements i9 {
    public o8 addAdUnits(Init$SDKInitResponse.AdUnit adUnit) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).addAdUnits(adUnit);
        return this;
    }

    public o8 addAllAdUnits(Iterable<? extends Init$SDKInitResponse.AdUnit> iterable) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).addAllAdUnits(iterable);
        return this;
    }

    public o8 addAllExperimentalFeatureFlags(Iterable<? extends Init$SDKInitResponse.ExperimentalFeatureFlag> iterable) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).addAllExperimentalFeatureFlags(iterable);
        return this;
    }

    public o8 addExperimentalFeatureFlags(Init$SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).addExperimentalFeatureFlags(experimentalFeatureFlag);
        return this;
    }

    public o8 clearAdServerUrl() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearAdServerUrl();
        return this;
    }

    public o8 clearAdUnits() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearAdUnits();
        return this;
    }

    public o8 clearAppId() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearAppId();
        return this;
    }

    public o8 clearBidTokenConfig() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearBidTokenConfig();
        return this;
    }

    public o8 clearConfigs() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearConfigs();
        return this;
    }

    public o8 clearCountryIso2Code() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearCountryIso2Code();
        return this;
    }

    public o8 clearCountryIso3Code() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearCountryIso3Code();
        return this;
    }

    public o8 clearCrashReportingConfig() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearCrashReportingConfig();
        return this;
    }

    public o8 clearEventCollectionConfig() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearEventCollectionConfig();
        return this;
    }

    public o8 clearExperimentalFeatureFlags() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearExperimentalFeatureFlags();
        return this;
    }

    public o8 clearGeo() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearGeo();
        return this;
    }

    public o8 clearIlrdConfig() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearIlrdConfig();
        return this;
    }

    public o8 clearOperationalMetricsConfig() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearOperationalMetricsConfig();
        return this;
    }

    public o8 clearPlatformId() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearPlatformId();
        return this;
    }

    public o8 clearPublisherId() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearPublisherId();
        return this;
    }

    public o8 clearResolvedRegion() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearResolvedRegion();
        return this;
    }

    public o8 clearVerifyBannerVisible() {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).clearVerifyBannerVisible();
        return this;
    }

    @Override // com.moloco.sdk.i9
    public String getAdServerUrl() {
        return ((Init$SDKInitResponse) this.instance).getAdServerUrl();
    }

    @Override // com.moloco.sdk.i9
    public ByteString getAdServerUrlBytes() {
        return ((Init$SDKInitResponse) this.instance).getAdServerUrlBytes();
    }

    @Override // com.moloco.sdk.i9
    public Init$SDKInitResponse.AdUnit getAdUnits(int i10) {
        return ((Init$SDKInitResponse) this.instance).getAdUnits(i10);
    }

    @Override // com.moloco.sdk.i9
    public int getAdUnitsCount() {
        return ((Init$SDKInitResponse) this.instance).getAdUnitsCount();
    }

    @Override // com.moloco.sdk.i9
    public List<Init$SDKInitResponse.AdUnit> getAdUnitsList() {
        return Collections.unmodifiableList(((Init$SDKInitResponse) this.instance).getAdUnitsList());
    }

    @Override // com.moloco.sdk.i9
    public String getAppId() {
        return ((Init$SDKInitResponse) this.instance).getAppId();
    }

    @Override // com.moloco.sdk.i9
    public ByteString getAppIdBytes() {
        return ((Init$SDKInitResponse) this.instance).getAppIdBytes();
    }

    @Override // com.moloco.sdk.i9
    public Init$SDKInitResponse.BidTokenConfig getBidTokenConfig() {
        return ((Init$SDKInitResponse) this.instance).getBidTokenConfig();
    }

    @Override // com.moloco.sdk.i9
    public ConfigsOuterClass$Configs getConfigs() {
        return ((Init$SDKInitResponse) this.instance).getConfigs();
    }

    @Override // com.moloco.sdk.i9
    public String getCountryIso2Code() {
        return ((Init$SDKInitResponse) this.instance).getCountryIso2Code();
    }

    @Override // com.moloco.sdk.i9
    public ByteString getCountryIso2CodeBytes() {
        return ((Init$SDKInitResponse) this.instance).getCountryIso2CodeBytes();
    }

    @Override // com.moloco.sdk.i9
    public String getCountryIso3Code() {
        return ((Init$SDKInitResponse) this.instance).getCountryIso3Code();
    }

    @Override // com.moloco.sdk.i9
    public ByteString getCountryIso3CodeBytes() {
        return ((Init$SDKInitResponse) this.instance).getCountryIso3CodeBytes();
    }

    @Override // com.moloco.sdk.i9
    public Init$SDKInitResponse.CrashReportingConfig getCrashReportingConfig() {
        return ((Init$SDKInitResponse) this.instance).getCrashReportingConfig();
    }

    @Override // com.moloco.sdk.i9
    public Init$SDKInitResponse.EventCollectionConfig getEventCollectionConfig() {
        return ((Init$SDKInitResponse) this.instance).getEventCollectionConfig();
    }

    @Override // com.moloco.sdk.i9
    public Init$SDKInitResponse.ExperimentalFeatureFlag getExperimentalFeatureFlags(int i10) {
        return ((Init$SDKInitResponse) this.instance).getExperimentalFeatureFlags(i10);
    }

    @Override // com.moloco.sdk.i9
    public int getExperimentalFeatureFlagsCount() {
        return ((Init$SDKInitResponse) this.instance).getExperimentalFeatureFlagsCount();
    }

    @Override // com.moloco.sdk.i9
    public List<Init$SDKInitResponse.ExperimentalFeatureFlag> getExperimentalFeatureFlagsList() {
        return Collections.unmodifiableList(((Init$SDKInitResponse) this.instance).getExperimentalFeatureFlagsList());
    }

    @Override // com.moloco.sdk.i9
    public Init$SDKInitResponse.Geo getGeo() {
        return ((Init$SDKInitResponse) this.instance).getGeo();
    }

    @Override // com.moloco.sdk.i9
    public Init$SDKInitResponse.ILRDConfig getIlrdConfig() {
        return ((Init$SDKInitResponse) this.instance).getIlrdConfig();
    }

    @Override // com.moloco.sdk.i9
    public Init$SDKInitResponse.OperationalMetricsConfig getOperationalMetricsConfig() {
        return ((Init$SDKInitResponse) this.instance).getOperationalMetricsConfig();
    }

    @Override // com.moloco.sdk.i9
    public String getPlatformId() {
        return ((Init$SDKInitResponse) this.instance).getPlatformId();
    }

    @Override // com.moloco.sdk.i9
    public ByteString getPlatformIdBytes() {
        return ((Init$SDKInitResponse) this.instance).getPlatformIdBytes();
    }

    @Override // com.moloco.sdk.i9
    public String getPublisherId() {
        return ((Init$SDKInitResponse) this.instance).getPublisherId();
    }

    @Override // com.moloco.sdk.i9
    public ByteString getPublisherIdBytes() {
        return ((Init$SDKInitResponse) this.instance).getPublisherIdBytes();
    }

    @Override // com.moloco.sdk.i9
    public e9 getResolvedRegion() {
        return ((Init$SDKInitResponse) this.instance).getResolvedRegion();
    }

    @Override // com.moloco.sdk.i9
    public int getResolvedRegionValue() {
        return ((Init$SDKInitResponse) this.instance).getResolvedRegionValue();
    }

    @Override // com.moloco.sdk.i9
    public boolean getVerifyBannerVisible() {
        return ((Init$SDKInitResponse) this.instance).getVerifyBannerVisible();
    }

    @Override // com.moloco.sdk.i9
    public boolean hasBidTokenConfig() {
        return ((Init$SDKInitResponse) this.instance).hasBidTokenConfig();
    }

    @Override // com.moloco.sdk.i9
    public boolean hasConfigs() {
        return ((Init$SDKInitResponse) this.instance).hasConfigs();
    }

    @Override // com.moloco.sdk.i9
    public boolean hasCrashReportingConfig() {
        return ((Init$SDKInitResponse) this.instance).hasCrashReportingConfig();
    }

    @Override // com.moloco.sdk.i9
    public boolean hasEventCollectionConfig() {
        return ((Init$SDKInitResponse) this.instance).hasEventCollectionConfig();
    }

    @Override // com.moloco.sdk.i9
    public boolean hasGeo() {
        return ((Init$SDKInitResponse) this.instance).hasGeo();
    }

    @Override // com.moloco.sdk.i9
    public boolean hasIlrdConfig() {
        return ((Init$SDKInitResponse) this.instance).hasIlrdConfig();
    }

    @Override // com.moloco.sdk.i9
    public boolean hasOperationalMetricsConfig() {
        return ((Init$SDKInitResponse) this.instance).hasOperationalMetricsConfig();
    }

    public o8 mergeBidTokenConfig(Init$SDKInitResponse.BidTokenConfig bidTokenConfig) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).mergeBidTokenConfig(bidTokenConfig);
        return this;
    }

    public o8 mergeConfigs(ConfigsOuterClass$Configs configsOuterClass$Configs) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).mergeConfigs(configsOuterClass$Configs);
        return this;
    }

    public o8 mergeCrashReportingConfig(Init$SDKInitResponse.CrashReportingConfig crashReportingConfig) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).mergeCrashReportingConfig(crashReportingConfig);
        return this;
    }

    public o8 mergeEventCollectionConfig(Init$SDKInitResponse.EventCollectionConfig eventCollectionConfig) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).mergeEventCollectionConfig(eventCollectionConfig);
        return this;
    }

    public o8 mergeGeo(Init$SDKInitResponse.Geo geo) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).mergeGeo(geo);
        return this;
    }

    public o8 mergeIlrdConfig(Init$SDKInitResponse.ILRDConfig iLRDConfig) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).mergeIlrdConfig(iLRDConfig);
        return this;
    }

    public o8 mergeOperationalMetricsConfig(Init$SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).mergeOperationalMetricsConfig(operationalMetricsConfig);
        return this;
    }

    public o8 removeAdUnits(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).removeAdUnits(i10);
        return this;
    }

    public o8 removeExperimentalFeatureFlags(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).removeExperimentalFeatureFlags(i10);
        return this;
    }

    public o8 setAdServerUrl(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setAdServerUrl(str);
        return this;
    }

    public o8 setAdServerUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setAdServerUrlBytes(byteString);
        return this;
    }

    public o8 setAdUnits(int i10, Init$SDKInitResponse.AdUnit adUnit) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setAdUnits(i10, adUnit);
        return this;
    }

    public o8 setAppId(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setAppId(str);
        return this;
    }

    public o8 setAppIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setAppIdBytes(byteString);
        return this;
    }

    public o8 setBidTokenConfig(Init$SDKInitResponse.BidTokenConfig bidTokenConfig) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setBidTokenConfig(bidTokenConfig);
        return this;
    }

    public o8 setConfigs(ConfigsOuterClass$Configs configsOuterClass$Configs) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setConfigs(configsOuterClass$Configs);
        return this;
    }

    public o8 setCountryIso2Code(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setCountryIso2Code(str);
        return this;
    }

    public o8 setCountryIso2CodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setCountryIso2CodeBytes(byteString);
        return this;
    }

    public o8 setCountryIso3Code(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setCountryIso3Code(str);
        return this;
    }

    public o8 setCountryIso3CodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setCountryIso3CodeBytes(byteString);
        return this;
    }

    public o8 setCrashReportingConfig(Init$SDKInitResponse.CrashReportingConfig crashReportingConfig) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setCrashReportingConfig(crashReportingConfig);
        return this;
    }

    public o8 setEventCollectionConfig(Init$SDKInitResponse.EventCollectionConfig eventCollectionConfig) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setEventCollectionConfig(eventCollectionConfig);
        return this;
    }

    public o8 setExperimentalFeatureFlags(int i10, Init$SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setExperimentalFeatureFlags(i10, experimentalFeatureFlag);
        return this;
    }

    public o8 setGeo(Init$SDKInitResponse.Geo geo) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setGeo(geo);
        return this;
    }

    public o8 setIlrdConfig(Init$SDKInitResponse.ILRDConfig iLRDConfig) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setIlrdConfig(iLRDConfig);
        return this;
    }

    public o8 setOperationalMetricsConfig(Init$SDKInitResponse.OperationalMetricsConfig operationalMetricsConfig) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setOperationalMetricsConfig(operationalMetricsConfig);
        return this;
    }

    public o8 setPlatformId(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setPlatformId(str);
        return this;
    }

    public o8 setPlatformIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setPlatformIdBytes(byteString);
        return this;
    }

    public o8 setPublisherId(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setPublisherId(str);
        return this;
    }

    public o8 setPublisherIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setPublisherIdBytes(byteString);
        return this;
    }

    public o8 setResolvedRegion(e9 e9Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setResolvedRegion(e9Var);
        return this;
    }

    public o8 setResolvedRegionValue(int i10) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setResolvedRegionValue(i10);
        return this;
    }

    public o8 setVerifyBannerVisible(boolean z10) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setVerifyBannerVisible(z10);
        return this;
    }

    public o8 addAdUnits(int i10, Init$SDKInitResponse.AdUnit adUnit) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).addAdUnits(i10, adUnit);
        return this;
    }

    public o8 addExperimentalFeatureFlags(int i10, Init$SDKInitResponse.ExperimentalFeatureFlag experimentalFeatureFlag) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).addExperimentalFeatureFlags(i10, experimentalFeatureFlag);
        return this;
    }

    public o8 setAdUnits(int i10, c8 c8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setAdUnits(i10, (Init$SDKInitResponse.AdUnit) c8Var.build());
        return this;
    }

    public o8 setBidTokenConfig(m8 m8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setBidTokenConfig((Init$SDKInitResponse.BidTokenConfig) m8Var.build());
        return this;
    }

    public o8 setConfigs(j7 j7Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setConfigs((ConfigsOuterClass$Configs) j7Var.build());
        return this;
    }

    public o8 setCrashReportingConfig(p8 p8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setCrashReportingConfig((Init$SDKInitResponse.CrashReportingConfig) p8Var.build());
        return this;
    }

    public o8 setEventCollectionConfig(r8 r8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setEventCollectionConfig((Init$SDKInitResponse.EventCollectionConfig) r8Var.build());
        return this;
    }

    public o8 setExperimentalFeatureFlags(int i10, t8 t8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setExperimentalFeatureFlags(i10, (Init$SDKInitResponse.ExperimentalFeatureFlag) t8Var.build());
        return this;
    }

    public o8 setGeo(v8 v8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setGeo((Init$SDKInitResponse.Geo) v8Var.build());
        return this;
    }

    public o8 setIlrdConfig(y8 y8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setIlrdConfig((Init$SDKInitResponse.ILRDConfig) y8Var.build());
        return this;
    }

    public o8 setOperationalMetricsConfig(a9 a9Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).setOperationalMetricsConfig((Init$SDKInitResponse.OperationalMetricsConfig) a9Var.build());
        return this;
    }

    public o8 addAdUnits(c8 c8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).addAdUnits((Init$SDKInitResponse.AdUnit) c8Var.build());
        return this;
    }

    public o8 addExperimentalFeatureFlags(t8 t8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).addExperimentalFeatureFlags((Init$SDKInitResponse.ExperimentalFeatureFlag) t8Var.build());
        return this;
    }

    public o8 addAdUnits(int i10, c8 c8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).addAdUnits(i10, (Init$SDKInitResponse.AdUnit) c8Var.build());
        return this;
    }

    public o8 addExperimentalFeatureFlags(int i10, t8 t8Var) {
        copyOnWrite();
        ((Init$SDKInitResponse) this.instance).addExperimentalFeatureFlags(i10, (Init$SDKInitResponse.ExperimentalFeatureFlag) t8Var.build());
        return this;
    }
}
