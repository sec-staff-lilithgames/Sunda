package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final d f47671b = new d("MRAID_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f47672c = new d("MRAID_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final d f47673e = new d("MRAID_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final d f47674f = new d("MRAID_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final d f47675g = new d("MRAID_WEBVIEW_INTERNAL_TIMEOUT_ERROR", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final d f47676h = new d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 5);

    /* renamed from: i, reason: collision with root package name */
    public static final d f47677i = new d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 6);

    /* renamed from: j, reason: collision with root package name */
    public static final d f47678j = new d("MRAID_FULLSCREEN_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 7);

    /* renamed from: k, reason: collision with root package name */
    public static final d f47679k = new d("MRAID_FULLSCREEN_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 8);

    /* renamed from: l, reason: collision with root package name */
    public static final d f47680l = new d("MRAID_FULLSCREEN_AD_ACTIVITY_SHOW_FAILED_ERROR", 9);

    /* renamed from: m, reason: collision with root package name */
    public static final d f47681m = new d("MRAID_BANNER_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 10);

    /* renamed from: n, reason: collision with root package name */
    public static final d f47682n = new d("MRAID_BANNER_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 11);

    /* renamed from: o, reason: collision with root package name */
    public static final d f47683o = new d("MRAID_BANNER_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 12);

    /* renamed from: p, reason: collision with root package name */
    public static final d f47684p = new d("MRAID_BANNER_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 13);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ d[] f47685q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ cv.a f47686r;

    static {
        d[] dVarArrB = b();
        f47685q = dVarArrB;
        f47686r = cv.b.enumEntries(dVarArrB);
    }

    public d(String str, int i10) {
    }

    public static final /* synthetic */ d[] b() {
        return new d[]{f47671b, f47672c, f47673e, f47674f, f47675g, f47676h, f47677i, f47678j, f47679k, f47680l, f47681m, f47682n, f47683o, f47684p};
    }

    public static cv.a c() {
        return f47686r;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f47685q.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
