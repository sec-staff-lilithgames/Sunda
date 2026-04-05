package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.Init$SDKInitResponse;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface i9 extends MessageLiteOrBuilder {
    String getAdServerUrl();

    ByteString getAdServerUrlBytes();

    Init$SDKInitResponse.AdUnit getAdUnits(int i10);

    int getAdUnitsCount();

    List<Init$SDKInitResponse.AdUnit> getAdUnitsList();

    String getAppId();

    ByteString getAppIdBytes();

    Init$SDKInitResponse.BidTokenConfig getBidTokenConfig();

    ConfigsOuterClass$Configs getConfigs();

    String getCountryIso2Code();

    ByteString getCountryIso2CodeBytes();

    String getCountryIso3Code();

    ByteString getCountryIso3CodeBytes();

    Init$SDKInitResponse.CrashReportingConfig getCrashReportingConfig();

    Init$SDKInitResponse.EventCollectionConfig getEventCollectionConfig();

    Init$SDKInitResponse.ExperimentalFeatureFlag getExperimentalFeatureFlags(int i10);

    int getExperimentalFeatureFlagsCount();

    List<Init$SDKInitResponse.ExperimentalFeatureFlag> getExperimentalFeatureFlagsList();

    Init$SDKInitResponse.Geo getGeo();

    Init$SDKInitResponse.ILRDConfig getIlrdConfig();

    Init$SDKInitResponse.OperationalMetricsConfig getOperationalMetricsConfig();

    String getPlatformId();

    ByteString getPlatformIdBytes();

    String getPublisherId();

    ByteString getPublisherIdBytes();

    e9 getResolvedRegion();

    int getResolvedRegionValue();

    boolean getVerifyBannerVisible();

    boolean hasBidTokenConfig();

    boolean hasConfigs();

    boolean hasCrashReportingConfig();

    boolean hasEventCollectionConfig();

    boolean hasGeo();

    boolean hasIlrdConfig();

    boolean hasOperationalMetricsConfig();
}
