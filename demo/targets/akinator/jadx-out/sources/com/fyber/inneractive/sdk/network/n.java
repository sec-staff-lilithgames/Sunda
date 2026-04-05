package com.fyber.inneractive.sdk.network;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum n {
    AD_TIMEOUT("X-IA-SESSION-TIMEOUT"),
    RETURNED_AD_TYPE("X-IA-Ad-Type"),
    HEIGHT("X-IA-Ad-Height"),
    WIDTH("X-IA-Ad-Width"),
    AD_NETWORK("X-IA-AdNetwork"),
    AD_NETWORK_ID("X-IA-AdNetwork-Id"),
    CLIENT_UNIQUE_ID("X-IA-Cuid"),
    ERROR_CODE("X-IA-Error"),
    SESSION_ID("X-IA-Session"),
    CONTENT_ID("X-IA-Content"),
    PUBLISHER_ID("X-IA-Publisher"),
    AD_UNIT_ID("X-IA-Ad-Unit-ID"),
    AD_UNIT_TYPE("X-IA-Ad-Unit-Type"),
    AD_COMPLETION_URL("X-IA-Completion"),
    AD_UNIT_DISPLAY_TYPE("X-IA-Ad-Unit-Display-Type"),
    AD_DOMAIN("X-IA-Adomain"),
    APP_BUNDLE("X-IA-App-Bundle"),
    CAMPAIGN_ID("X-IA-Campaign-ID"),
    CREATIVE_ID("X-IA-Creative-ID"),
    SDK_ADAPTER_NAME("X-IA-SdkAdapterName"),
    SDK_ADAPTER_DATA("X-IA-SdkAdapterData"),
    CPM_VALUE("X-IA-Pricing-Value"),
    CPM_CURRENCY("X-IA-Pricing-Currency"),
    LOCATION("Location"),
    SDK_IMPRESSION_URL("X-IA-sdkImpressionUrl"),
    SDK_CLICK_URL("X-IA-sdkClickUrl"),
    ATTRIBUTION_IMPRESSION_URL("X-DT-Attribution-Impression-URL"),
    ATTRIBUTION_CLICK_URL("X-DT-Attribution-Click-URL"),
    BANNER_MRC_PERCENT("X-IA-MRC-Percent"),
    BANNER_MRC_DURATION("X-IA-MRC-Duration"),
    BANNER_MRC_IMPRESSION_URL("X-IA-MRC-Impression"),
    INTERSTITIAL_SKIP_MODE("X-IA-skipMode"),
    IGNITE_INSTALL_URL("X-IA-Ignite-InstallUrl"),
    IGNITE_MODE("X-IA-Ignite-Mode"),
    APP_BUNDLE_LAUNCHER("X-IA-App-Bundle-Launcher"),
    BRAND_BIDDER_SHOW_ENDCARD("X-IA-Brand-Bidder-Dont-Show-Endcard"),
    BRAND_BIDDER_CTA_TEXT("X-IA-Brand-Bidder-Cta-Text"),
    MRAID_VIDEO_SIGNAL("X-DT-MRAID-Video"),
    CREATIVE_TYPE("X-IA-Creative-Type");

    final String key;

    n(String str) {
        this.key = str;
    }

    public final String a() {
        return this.key;
    }
}
