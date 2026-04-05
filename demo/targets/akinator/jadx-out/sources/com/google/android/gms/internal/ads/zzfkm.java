package com.google.android.gms.internal.ads;

import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public enum zzfkm {
    SIGNALS("signals"),
    REQUEST_PARCEL("request-parcel"),
    SERVER_TRANSACTION("server-transaction"),
    RENDERER("renderer"),
    GMS_SIGNALS("gms-signals"),
    AD_REQUEST("ad_request"),
    BUILD_URL("build-url"),
    PREPARE_HTTP_REQUEST("prepare-http-request"),
    HTTP("http"),
    PROXY("proxy"),
    PRE_PROCESS("preprocess"),
    GET_SIGNALS("get-signals"),
    JS_SIGNALS("js-signals"),
    RENDER_CONFIG_INIT("render-config-init"),
    RENDER_CONFIG_WATERFALL("render-config-waterfall"),
    RENDER_CONFIG_PARALLEL("render-config-parallel"),
    ADAPTER_LOAD_AD_SYN("adapter-load-ad-syn"),
    ADAPTER_LOAD_AD_ACK("adapter-load-ad-ack"),
    ADAPTER_WRAP_ADAPTER("wrap-adapter"),
    CUSTOM_RENDER_SYN("custom-render-syn"),
    CUSTOM_RENDER_ACK(SUvoXnn.sqMUpBdPG),
    WEBVIEW_COOKIE("webview-cookie"),
    GENERATE_SIGNALS("generate-signals"),
    GET_CACHE_KEY("get-cache-key"),
    NOTIFY_CACHE_HIT("notify-cache-hit"),
    GET_URL_AND_CACHE_KEY("get-url-and-cache-key"),
    PRELOADED_LOADER("preloaded-loader");

    private final String zzB;

    zzfkm(String str) {
        this.zzB = str;
    }

    public final String zza() {
        return this.zzB;
    }
}
