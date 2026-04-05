package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import i2.hQ.aTNDubNmpwAqdU;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final l f47708b = new l("STATIC_FULLSCREEN_AD_UNKNOWN_ERROR", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f47709c = new l("STATIC_FULLSCREEN_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final l f47710e = new l(aTNDubNmpwAqdU.JpuvnkvyYmeT, 2);

    /* renamed from: f, reason: collision with root package name */
    public static final l f47711f = new l("STATIC_FULLSCREEN_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l[] f47712g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cv.a f47713h;

    public l(String str, int i10) {
    }

    public static final /* synthetic */ l[] b() {
        return new l[]{f47708b, f47709c, f47710e, f47711f};
    }

    public static cv.a c() {
        return f47713h;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f47712g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }

    static {
        l[] lVarArrB = b();
        f47712g = lVarArrB;
        f47713h = cv.b.enumEntries(lVarArrB);
    }
}
