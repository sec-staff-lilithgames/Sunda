package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final h f47695b = new h("STATIC_AD_UNKNOWN_ERROR", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f47696c = new h("STATIC_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final h f47697e = new h("STATIC_AD_WEBVIEW_RECEIVED_ERROR", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final h f47698f = new h("STATIC_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h[] f47699g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cv.a f47700h;

    static {
        h[] hVarArrB = b();
        f47699g = hVarArrB;
        f47700h = cv.b.enumEntries(hVarArrB);
    }

    public h(String str, int i10) {
    }

    public static final /* synthetic */ h[] b() {
        return new h[]{f47695b, f47696c, f47697e, f47698f};
    }

    public static cv.a c() {
        return f47700h;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f47699g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
