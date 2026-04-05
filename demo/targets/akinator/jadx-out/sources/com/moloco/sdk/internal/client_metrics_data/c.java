package com.moloco.sdk.internal.client_metrics_data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f45872c = new c("SDKInit", 0, "sdk_init_time");

    /* renamed from: e, reason: collision with root package name */
    public static final c f45873e = new c("SDKPerformInitAttempt", 1, "sdk_perform_init_time_ms");

    /* renamed from: f, reason: collision with root package name */
    public static final c f45874f = new c("SDKInitHttpRequest", 2, "sdk_init_request_time_ms");

    /* renamed from: g, reason: collision with root package name */
    public static final c f45875g = new c("SDKInitCacheRead", 3, "sdk_init_cache_read_time_ms");

    /* renamed from: h, reason: collision with root package name */
    public static final c f45876h = new c("SDKInitCacheWrite", 4, "sdk_init_cache_write_time_ms");

    /* renamed from: i, reason: collision with root package name */
    public static final c f45877i = new c("SDKInitCacheClear", 5, "sdk_init_cache_clear_time_ms");

    /* renamed from: j, reason: collision with root package name */
    public static final c f45878j = new c("CreateAd", 6, "create_ad_time_ms");

    /* renamed from: k, reason: collision with root package name */
    public static final c f45879k = new c("CreateAdAwaitAdFactory", 7, "create_ad_await_ad_factory_time_ms");

    /* renamed from: l, reason: collision with root package name */
    public static final c f45880l = new c("LoadAd", 8, "load_ad_time");

    /* renamed from: m, reason: collision with root package name */
    public static final c f45881m = new c("NativePrepareAd", 9, "native_ad_load_prepare_time");

    /* renamed from: n, reason: collision with root package name */
    public static final c f45882n = new c("BidTokenFetch", 10, "bid_token_fetch_time");

    /* renamed from: o, reason: collision with root package name */
    public static final c f45883o = new c("ServerBidTokenFetch", 11, "sbt_fetch_time_ms");

    /* renamed from: p, reason: collision with root package name */
    public static final c f45884p = new c("ServerBidTokenApiFetchTime", 12, "sbt_api_fetch_time_ms");

    /* renamed from: q, reason: collision with root package name */
    public static final c f45885q = new c("ClientBidTokenBuild", 13, "bid_token_build_time_ms");

    /* renamed from: r, reason: collision with root package name */
    public static final c f45886r = new c("LoadToShow", 14, "load_to_show_time");

    /* renamed from: s, reason: collision with root package name */
    public static final c f45887s = new c("CreateToLoad", 15, "ad_create_to_load_ms");

    /* renamed from: t, reason: collision with root package name */
    public static final c f45888t = new c("WebviewLoadAd", 16, "webview_load_ad_ms");

    /* renamed from: u, reason: collision with root package name */
    public static final c f45889u = new c("WebviewEventHandled", 17, "webview_event_handled_time_ms");

    /* renamed from: v, reason: collision with root package name */
    public static final c f45890v = new c("WebviewEventHandlerLatency", 18, "webview_event_handler_latency_ms");

    /* renamed from: w, reason: collision with root package name */
    public static final c f45891w = new c("WebviewPageLoadLatency", 19, "webview_page_load_ms");

    /* renamed from: x, reason: collision with root package name */
    public static final c f45892x = new c("WebviewRequiredContentLoadLatency", 20, "webview_required_content_load_ms");

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ c[] f45893y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ cv.a f45894z;

    /* renamed from: b, reason: collision with root package name */
    public final String f45895b;

    static {
        c[] cVarArrA = a();
        f45893y = cVarArrA;
        f45894z = cv.b.enumEntries(cVarArrA);
    }

    public c(String str, int i10, String str2) {
        this.f45895b = str2;
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f45872c, f45873e, f45874f, f45875g, f45876h, f45877i, f45878j, f45879k, f45880l, f45881m, f45882n, f45883o, f45884p, f45885q, f45886r, f45887s, f45888t, f45889u, f45890v, f45891w, f45892x};
    }

    public static cv.a b() {
        return f45894z;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f45893y.clone();
    }

    public final String c() {
        return this.f45895b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f45895b;
    }
}
