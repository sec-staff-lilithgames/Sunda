package com.amazon.aps.ads.util.adview;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface ApsAdViewConstants {
    public static final String ADDITIONAL_WEBVIEW_METRICS = "additional_webview_metric";
    public static final String AD_INFO_FEATURE = "webviewAdInfo_feature";
    public static final int AD_INFO_MATCHER_NUMBER = 4;
    public static final String AD_INFO_PATTERN = "amzn.dtb.loadAd\\(\\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\".*isv: (\\w+)";
    public static final String AMAZON_AD_INFO = "amazon_ad_info";
    public static final String AMAZON_BRIDGE = "amzn_bridge";
    public static final String AMAZON_INFO = "{bidID:'%s',aaxHost:'%s',pricePoint:'%s'}";
    public static final String BID_HTML = "bid_html_template";
    public static final String BID_IDENTIFIER = "bid_identifier";
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String ENV_TEMPLATE = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,impFired:true,mobileDeviceInfo:%s};";
    public static final String ENV_TEMPLATE_INFO = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,amznAdInfo:%s,impFired:true,mobileDeviceInfo:%s};";
    public static final String EVENT_JSON_SUBTYPE = "subtype";
    public static final String EVENT_SERVER_PARAMETER = "event_server_parameter";
    public static final String EXPECTED_HEIGHT = "expected_height";
    public static final String EXPECTED_WIDTH = "expected_width";
    public static final String HOSTNAME_IDENTIFIER = "hostname_identifier";
    public static final String MOBILE_DEVICE_INFO = "{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}";
    public static final String MRAID_IDENTIFIER = "MRAID_ENV";
    public static final String ON_DISPLAY_AD_FAILED_TO_LOAD = "onAdFailedToLoad";
    public static final String ON_DISPLAY_AD_LOADED = "onAdLoaded";
    public static final String ON_END_CARD_CLOSED = "END_CARD_VIDEO_CLOSED";
    public static final String ON_END_CARD_COMPANION_AD_START = "END_CARD_COMPANION_AD_START";
    public static final String ON_VIDEO_AD_FAILED_TO_LOAD = "AD_FAILED_TO_LOAD";
    public static final String ON_VIDEO_AD_LOADED = "AD_LOADED";
    public static final String REQUEST_QUEUE = "amazon_request_queue";
    public static final String SMARTBANNER_STATE = "smart_banner_state";
    public static final String START_LOAD_TIME = "start_load_time";
    public static final String VIDEO = "video_flag";
    public static final String VIDEO_CLICK_EVENT = "AD_VIDEO_PLAYER_CLICKED";
    public static final String VIDEO_COMPLETE_EVENT = "AD_VIDEO_PLAYER_COMPLETED";
    public static final String VIDEO_EVENT_JS_COMMAND_TYPE = "apsvid";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ADDITIONAL_WEBVIEW_METRICS = "additional_webview_metric";
        public static final String AD_INFO_FEATURE = "webviewAdInfo_feature";
        public static final int AD_INFO_MATCHER_NUMBER = 4;
        public static final String AD_INFO_PATTERN = "amzn.dtb.loadAd\\(\\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\".*isv: (\\w+)";
        public static final String AMAZON_AD_INFO = "amazon_ad_info";
        public static final String AMAZON_BRIDGE = "amzn_bridge";
        public static final String AMAZON_INFO = "{bidID:'%s',aaxHost:'%s',pricePoint:'%s'}";
        public static final String BID_HTML = "bid_html_template";
        public static final String BID_IDENTIFIER = "bid_identifier";
        public static final String ENV_TEMPLATE = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,impFired:true,mobileDeviceInfo:%s};";
        public static final String ENV_TEMPLATE_INFO = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,amznAdInfo:%s,impFired:true,mobileDeviceInfo:%s};";
        public static final String EVENT_JSON_SUBTYPE = "subtype";
        public static final String EVENT_SERVER_PARAMETER = "event_server_parameter";
        public static final String EXPECTED_HEIGHT = "expected_height";
        public static final String EXPECTED_WIDTH = "expected_width";
        public static final String HOSTNAME_IDENTIFIER = "hostname_identifier";
        public static final String MOBILE_DEVICE_INFO = "{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}";
        public static final String MRAID_IDENTIFIER = "MRAID_ENV";
        public static final String ON_DISPLAY_AD_FAILED_TO_LOAD = "onAdFailedToLoad";
        public static final String ON_DISPLAY_AD_LOADED = "onAdLoaded";
        public static final String ON_END_CARD_CLOSED = "END_CARD_VIDEO_CLOSED";
        public static final String ON_END_CARD_COMPANION_AD_START = "END_CARD_COMPANION_AD_START";
        public static final String ON_VIDEO_AD_FAILED_TO_LOAD = "AD_FAILED_TO_LOAD";
        public static final String ON_VIDEO_AD_LOADED = "AD_LOADED";
        public static final String REQUEST_QUEUE = "amazon_request_queue";
        public static final String SMARTBANNER_STATE = "smart_banner_state";
        public static final String START_LOAD_TIME = "start_load_time";
        public static final String VIDEO = "video_flag";
        public static final String VIDEO_CLICK_EVENT = "AD_VIDEO_PLAYER_CLICKED";
        public static final String VIDEO_COMPLETE_EVENT = "AD_VIDEO_PLAYER_COMPLETED";
        public static final String VIDEO_EVENT_JS_COMMAND_TYPE = "apsvid";

        private Companion() {
        }
    }
}
