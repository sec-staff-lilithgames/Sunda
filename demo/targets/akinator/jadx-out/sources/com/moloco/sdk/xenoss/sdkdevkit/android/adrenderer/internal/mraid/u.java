package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final u f48118c = new u("Inline", 0, "inline");

    /* renamed from: e, reason: collision with root package name */
    public static final u f48119e = new u("Interstitial", 1, "interstitial");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u[] f48120f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f48121g;

    /* renamed from: b, reason: collision with root package name */
    public final String f48122b;

    static {
        u[] uVarArrA = a();
        f48120f = uVarArrA;
        f48121g = cv.b.enumEntries(uVarArrA);
    }

    public u(String str, int i10, String str2) {
        this.f48122b = str2;
    }

    public static final /* synthetic */ u[] a() {
        return new u[]{f48118c, f48119e};
    }

    public static cv.a b() {
        return f48121g;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f48120f.clone();
    }

    public final String c() {
        return this.f48122b;
    }
}
