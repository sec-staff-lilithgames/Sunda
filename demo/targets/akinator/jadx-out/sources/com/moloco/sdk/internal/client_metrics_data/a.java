package com.moloco.sdk.internal.client_metrics_data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {
    public static final /* synthetic */ a[] P;
    public static final /* synthetic */ cv.a Q;

    /* renamed from: b, reason: collision with root package name */
    public final String f45862b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f45839c = new a("SDKInitAttempt", 0, "sdk_init_attempt");

    /* renamed from: e, reason: collision with root package name */
    public static final a f45840e = new a("SDKInitSuccess", 1, "sdk_init_success");

    /* renamed from: f, reason: collision with root package name */
    public static final a f45841f = new a("SDKInitFailure", 2, "sdk_init_failure");

    /* renamed from: g, reason: collision with root package name */
    public static final a f45842g = new a("SDKPerformInitAttempt", 3, "sdk_perform_init_attempt");

    /* renamed from: h, reason: collision with root package name */
    public static final a f45843h = new a("SDKFetchInitAttempt", 4, "sdk_fetch_init_attempt");

    /* renamed from: i, reason: collision with root package name */
    public static final a f45844i = new a("SDKInitCacheRead", 5, "sdk_init_cache_read");

    /* renamed from: j, reason: collision with root package name */
    public static final a f45845j = new a("SDKInitCacheWrite", 6, "sdk_init_cache_write");

    /* renamed from: k, reason: collision with root package name */
    public static final a f45846k = new a("SDKInitCacheClear", 7, "sdk_init_cache_clear");

    /* renamed from: l, reason: collision with root package name */
    public static final a f45847l = new a("CreateAd", 8, "create_ad");

    /* renamed from: m, reason: collision with root package name */
    public static final a f45848m = new a("LoadAdAttempt", 9, "load_ad_attempted");

    /* renamed from: n, reason: collision with root package name */
    public static final a f45849n = new a("LoadAdSuccess", 10, "load_ad_success");

    /* renamed from: o, reason: collision with root package name */
    public static final a f45850o = new a("LoadAdFailed", 11, "load_ad_failed");

    /* renamed from: p, reason: collision with root package name */
    public static final a f45851p = new a("NativeAdLoadAdAttempted", 12, "native_ad_load_attempted");

    /* renamed from: q, reason: collision with root package name */
    public static final a f45852q = new a("NativeLoadAd", 13, "native_ad_load");

    /* renamed from: r, reason: collision with root package name */
    public static final a f45853r = new a("BidTokenGetRequest", 14, "bid_token_get_request");

    /* renamed from: s, reason: collision with root package name */
    public static final a f45854s = new a("BidTokenGetResponse", 15, "bid_token_get_response");

    /* renamed from: t, reason: collision with root package name */
    public static final a f45855t = new a("BidTokenFetch", 16, "bid_token_fetch");

    /* renamed from: u, reason: collision with root package name */
    public static final a f45856u = new a("BidTokenDurationTimeoutOneSecond", 17, "bid_token_duration_crossed_1s");

    /* renamed from: v, reason: collision with root package name */
    public static final a f45857v = new a("BidTokenDurationTimeoutThreeSecond", 18, "bid_token_duration_crossed_3s");

    /* renamed from: w, reason: collision with root package name */
    public static final a f45858w = new a("ServerBidTokenFetch", 19, "sbt_fetch");

    /* renamed from: x, reason: collision with root package name */
    public static final a f45859x = new a("ServerBidTokenCached", 20, "sbt_cached");

    /* renamed from: y, reason: collision with root package name */
    public static final a f45860y = new a("ServerBidTokenApiFetch", 21, "sbt_api_fetch");

    /* renamed from: z, reason: collision with root package name */
    public static final a f45861z = new a("ServerBidTokenAsyncRefresh", 22, "sbt_async_fetch");
    public static final a A = new a("ClientBidTokenBuild", 23, "bid_token_build");
    public static final a B = new a("ClientBidTokenCached", 24, "cbt_cached");
    public static final a C = new a("ShowAdAttempt", 25, "show_ad_attempted");
    public static final a D = new a("ShowAdSuccess", 26, "show_ad_success");
    public static final a E = new a("ShowAdFailed", 27, "show_ad_failed");
    public static final a F = new a("AdClicked", 28, "ad_clicked");
    public static final a G = new a("CrashDetected", 29, "crash_detected");
    public static final a H = new a("WebviewLoadAd", 30, "webview_load_ad");
    public static final a I = new a("WebviewHtmlAdError", 31, "webview_html_ad_error");
    public static final a J = new a("WebviewEventHandled", 32, "webview_event_handled");
    public static final a K = new a("WebviewEventMultipleHandlers", 33, "webview_event_multiple_handlers");
    public static final a L = new a("WebviewPageLoadStart", 34, "webview_page_load_start");
    public static final a M = new a("WebviewPageLoadEnd", 35, "webview_page_load_end");
    public static final a N = new a("WebviewPageLoadFinishCallback", 36, "webview_page_load_finish_callback");
    public static final a O = new a("WebviewRequiredContentLoaded", 37, "webview_required_content_loaded");

    static {
        a[] aVarArrA = a();
        P = aVarArrA;
        Q = cv.b.enumEntries(aVarArrA);
    }

    public a(String str, int i10, String str2) {
        this.f45862b = str2;
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f45839c, f45840e, f45841f, f45842g, f45843h, f45844i, f45845j, f45846k, f45847l, f45848m, f45849n, f45850o, f45851p, f45852q, f45853r, f45854s, f45855t, f45856u, f45857v, f45858w, f45859x, f45860y, f45861z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O};
    }

    public static cv.a b() {
        return Q;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) P.clone();
    }

    public final String c() {
        return this.f45862b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f45862b;
    }
}
