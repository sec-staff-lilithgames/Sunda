package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.sdk.Configuration;
import io.bidmachine.protobuf.sdk.ConfigurationOrBuilder;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface InitResponseOrBuilder extends MessageOrBuilder {
    boolean containsAdCachePlacementControl(String str);

    AdCacheControl getAdCacheControl();

    int getAdCacheControlValue();

    int getAdCacheMaxAge();

    @Deprecated
    Map<String, AdCachePlacementControl> getAdCachePlacementControl();

    int getAdCachePlacementControlCount();

    Map<String, AdCachePlacementControl> getAdCachePlacementControlMap();

    AdCachePlacementControl getAdCachePlacementControlOrDefault(String str, AdCachePlacementControl adCachePlacementControl);

    AdCachePlacementControl getAdCachePlacementControlOrThrow(String str);

    AdNetwork getAdNetworks(int i10);

    int getAdNetworksCount();

    List<AdNetwork> getAdNetworksList();

    int getAdNetworksLoadingTimeout();

    AdNetworkOrBuilder getAdNetworksOrBuilder(int i10);

    List<? extends AdNetworkOrBuilder> getAdNetworksOrBuilderList();

    int getAdRequestTmax();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getEndpoint();

    ByteString getEndpointBytes();

    Ad.Event getEvent(int i10);

    AdExtension.EventConfiguration getEventConfiguration();

    AdExtension.EventConfigurationOrBuilder getEventConfigurationOrBuilder();

    int getEventCount();

    List<Ad.Event> getEventList();

    Ad.EventOrBuilder getEventOrBuilder(int i10);

    List<? extends Ad.EventOrBuilder> getEventOrBuilderList();

    Extras getExtras();

    ExtrasOrBuilder getExtrasOrBuilder();

    SdkAnalyticConfig getSdkAnalyticConfig();

    SdkAnalyticConfigOrBuilder getSdkAnalyticConfigOrBuilder();

    Configuration getSdkAnalyticConfigV2();

    ConfigurationOrBuilder getSdkAnalyticConfigV2OrBuilder();

    int getSessionResetAfter();

    boolean getShowWithoutInternet();

    TokenConfiguration getTokenConfigurations(int i10);

    int getTokenConfigurationsCount();

    List<TokenConfiguration> getTokenConfigurationsList();

    TokenConfigurationOrBuilder getTokenConfigurationsOrBuilder(int i10);

    List<? extends TokenConfigurationOrBuilder> getTokenConfigurationsOrBuilderList();

    boolean hasEventConfiguration();

    boolean hasExtras();

    boolean hasSdkAnalyticConfig();

    boolean hasSdkAnalyticConfigV2();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
