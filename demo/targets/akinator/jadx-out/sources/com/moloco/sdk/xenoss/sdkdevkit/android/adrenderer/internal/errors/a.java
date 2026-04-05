package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f47656b = new a("STATIC_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f47657c = new a("VAST_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final a f47658e = new a("MRAID_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final a f47659f = new a("NATIVE_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final a f47660g = new a("VAST_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final a f47661h = new a("MRAID_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 5);

    /* renamed from: i, reason: collision with root package name */
    public static final a f47662i = new a("STATIC_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 6);

    /* renamed from: j, reason: collision with root package name */
    public static final a f47663j = new a("VAST_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 7);

    /* renamed from: k, reason: collision with root package name */
    public static final a f47664k = new a("MRAID_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 8);

    /* renamed from: l, reason: collision with root package name */
    public static final a f47665l = new a("STATIC_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 9);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a[] f47666m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ cv.a f47667n;

    static {
        a[] aVarArrB = b();
        f47666m = aVarArrB;
        f47667n = cv.b.enumEntries(aVarArrB);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] b() {
        return new a[]{f47656b, f47657c, f47658e, f47659f, f47660g, f47661h, f47662i, f47663j, f47664k, f47665l};
    }

    public static cv.a c() {
        return f47667n;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f47666m.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
