package com.unity3d.services.core.configuration;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface IExperiments {
    JSONObject getCurrentSessionExperiments();

    Map<String, String> getExperimentTags();

    JSONObject getExperimentsAsJson();

    JSONObject getNextSessionExperiments();

    String getScarBiddingManager();

    boolean isBoldSdkNextSessionEnabled();

    boolean isCaptureHDRCapabilitiesEnabled();

    boolean isJetpackLifecycle();

    boolean isNativeLoadTimeoutDisabled();

    boolean isNativeShowTimeoutDisabled();

    boolean isOkHttpEnabled();

    boolean isPCCheckEnabled();

    boolean isScarBannerHbEnabled();

    boolean isScarInitEnabled();

    boolean isWebAssetAdCaching();

    boolean isWebGestureNotRequired();

    boolean isWebMessageEnabled();

    boolean isWebViewAsyncDownloadEnabled();

    boolean shouldNativeTokenAwaitPrivacy();
}
