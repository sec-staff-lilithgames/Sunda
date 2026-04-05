package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final n f47738b = new n("VAST_AD_EXOPLAYER_VIDEO_LAYER_ERROR", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final n f47739c = new n("VAST_AD_EXOPLAYER_STYLED_PLAYER_VIEW_INFLATE_EXCEPTION_ERROR", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final n f47740e = new n("VAST_AD_EXOPLAYER_SET_MEDIA_ITEM_EXCEPTION_ERROR", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final n f47741f = new n("VAST_AD_EXOPLAYER_SET_MEDIA_FILE_NOT_EXISTS_ERROR", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n[] f47742g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cv.a f47743h;

    static {
        n[] nVarArrB = b();
        f47742g = nVarArrB;
        f47743h = cv.b.enumEntries(nVarArrB);
    }

    public n(String str, int i10) {
    }

    public static final /* synthetic */ n[] b() {
        return new n[]{f47738b, f47739c, f47740e, f47741f};
    }

    public static cv.a c() {
        return f47743h;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f47742g.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
