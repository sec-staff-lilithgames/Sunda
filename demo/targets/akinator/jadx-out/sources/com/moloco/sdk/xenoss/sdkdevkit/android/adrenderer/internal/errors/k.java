package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final k f47702b = new k("STATIC_BANNER_AD_UNKNOWN_ERROR", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final k f47703c = new k("STATIC_BANNER_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final k f47704e = new k("STATIC_BANNER_AD_WEBVIEW_RECEIVED_ERROR", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final k f47705f = new k("STATIC_BANNER_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ k[] f47706g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cv.a f47707h;

    static {
        k[] kVarArrB = b();
        f47706g = kVarArrB;
        f47707h = cv.b.enumEntries(kVarArrB);
    }

    public k(String str, int i10) {
    }

    public static final /* synthetic */ k[] b() {
        return new k[]{f47702b, f47703c, f47704e, f47705f};
    }

    public static cv.a c() {
        return f47707h;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f47706g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
