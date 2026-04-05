package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.rendering.RenderingOrBuilder;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface AdExtensionOrBuilder extends MessageOrBuilder {
    boolean containsCustomParams(String str);

    AdCacheControl getAdCacheControl();

    int getAdCacheControlValue();

    int getAdCacheMaxAge();

    boolean getAdFlexibleSize();

    int getAdMarkupLoadingTimeout();

    AdExtension.ControlAsset getCloseButton();

    AdExtension.ControlAssetOrBuilder getCloseButtonOrBuilder();

    int getCompanionSkipoffset();

    AdExtension.ControlAsset getCountdown();

    AdExtension.ControlAssetOrBuilder getCountdownOrBuilder();

    @Deprecated
    CreativeExtension getCreativeExtension();

    @Deprecated
    CreativeExtensionOrBuilder getCreativeExtensionOrBuilder();

    CreativeLoadingMethod getCreativeLoadingMethod();

    int getCreativeLoadingMethodValue();

    int getCreativeLoadingTimeout();

    boolean getCridMonitoringEnabled();

    @Deprecated
    Map<String, String> getCustomParams();

    int getCustomParamsCount();

    Map<String, String> getCustomParamsMap();

    String getCustomParamsOrDefault(String str, String str2);

    String getCustomParamsOrThrow(String str);

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Ad.Event getEvent(int i10);

    AdExtension.EventConfiguration getEventConfiguration();

    AdExtension.EventConfigurationOrBuilder getEventConfigurationOrBuilder();

    int getEventCount();

    List<Ad.Event> getEventList();

    Ad.EventOrBuilder getEventOrBuilder(int i10);

    List<? extends Ad.EventOrBuilder> getEventOrBuilderList();

    boolean getIgnoresSafeAreaLayoutGuide();

    @Deprecated
    int getLoadSkipoffset();

    boolean getMraidCreativeValidationRequired();

    float getPlaceholderTimeout();

    @Deprecated
    boolean getPreload();

    boolean getPreloadAd();

    AdExtension.ControlAsset getProgress();

    int getProgressDuration();

    AdExtension.ControlAssetOrBuilder getProgressOrBuilder();

    boolean getR1();

    int getR1Delay();

    boolean getR2();

    Rendering getRenderingConfiguration();

    RenderingOrBuilder getRenderingConfigurationOrBuilder();

    int getSkipoffset();

    String getStoreUrl();

    ByteString getStoreUrlBytes();

    boolean getUseEmbeddedBrowser();

    boolean getUseNativeClose();

    float getViewabilityDurationThreshold();

    boolean getViewabilityIgnoreOverlap();

    boolean getViewabilityIgnoreWindowFocus();

    float getViewabilityPixelThreshold();

    int getViewabilityTimeThreshold();

    boolean hasCloseButton();

    boolean hasCountdown();

    @Deprecated
    boolean hasCreativeExtension();

    boolean hasEventConfiguration();

    boolean hasProgress();

    boolean hasRenderingConfiguration();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
