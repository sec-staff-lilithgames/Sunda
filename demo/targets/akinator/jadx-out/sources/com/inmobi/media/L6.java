package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class L6 {

    /* renamed from: d, reason: collision with root package name */
    public static final L6 f31990d;

    /* renamed from: e, reason: collision with root package name */
    public static final L6 f31991e;

    /* renamed from: f, reason: collision with root package name */
    public static final L6 f31992f;

    /* renamed from: g, reason: collision with root package name */
    public static final L6 f31993g;

    /* renamed from: h, reason: collision with root package name */
    public static final L6 f31994h;

    /* renamed from: i, reason: collision with root package name */
    public static final L6 f31995i;

    /* renamed from: j, reason: collision with root package name */
    public static final L6 f31996j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ L6[] f31997k;

    /* renamed from: a, reason: collision with root package name */
    public final String f31998a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31999b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32000c;

    static {
        L6 l62 = new L6("LPClickStart", 0, "clickStartCalled", "sdk_click_detected", 0);
        f31990d = l62;
        L6 l63 = new L6("LPStartFailed", 1, "landingsStartFailed", "valid_click_failed", 1);
        f31991e = l63;
        L6 l64 = new L6("LPStartSuccess", 2, "landingsStartSuccess", "browser_open_success", 2);
        f31992f = l64;
        L6 l65 = new L6("LPBrowserOpenFailed", 3, "browserOpenFailed", "browser_open_failed", 2);
        f31993g = l65;
        L6 l66 = new L6("LPPageStart", 4, "landingsPageStarted", "on_page_started", 3);
        f31994h = l66;
        L6 l67 = new L6("LPCompleteSuccess", 5, "landingsCompleteSuccess", "landing_success", 4);
        f31995i = l67;
        L6 l68 = new L6("LPCompleteFailed", 6, "landingsCompleteFailed", "landing_failed", 4);
        f31996j = l68;
        L6[] l6Arr = {l62, l63, l64, l65, l66, l67, l68};
        f31997k = l6Arr;
        cv.b.enumEntries(l6Arr);
    }

    public L6(String str, int i10, String str2, String str3, int i11) {
        this.f31998a = str2;
        this.f31999b = str3;
        this.f32000c = i11;
    }

    public static L6 valueOf(String str) {
        return (L6) Enum.valueOf(L6.class, str);
    }

    public static L6[] values() {
        return (L6[]) f31997k.clone();
    }
}
