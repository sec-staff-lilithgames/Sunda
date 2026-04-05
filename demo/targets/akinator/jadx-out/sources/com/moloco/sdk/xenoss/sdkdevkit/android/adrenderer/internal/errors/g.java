package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final g f47688b = new g("NATIVE_AD_ORTB_RESPONSE_NULL_ERROR", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f47689c = new g("NATIVE_AD_IMAGE_ASSET_MEDIA_FETCH_ERROR", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final g f47690e = new g("NATIVE_AD_IMAGE_PREPARE_ASSET_UNKNOWN_ERROR", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final g f47691f = new g("NATIVE_AD_VIDEO_ASSET_MEDIA_NOT_ENOUGH_ERROR", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final g f47692g = new g("NATIVE_AD_VIDEO_ASSET_MEDIA_FETCH_ERROR", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g[] f47693h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ cv.a f47694i;

    static {
        g[] gVarArrB = b();
        f47693h = gVarArrB;
        f47694i = cv.b.enumEntries(gVarArrB);
    }

    public g(String str, int i10) {
    }

    public static final /* synthetic */ g[] b() {
        return new g[]{f47688b, f47689c, f47690e, f47691f, f47692g};
    }

    public static cv.a c() {
        return f47694i;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f47693h.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
