package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f50233b = new o("VAST", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final o f50234c = new o("MRAID", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final o f50235e = new o("STATIC", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o[] f50236f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f50237g;

    static {
        o[] oVarArrA = a();
        f50236f = oVarArrA;
        f50237g = cv.b.enumEntries(oVarArrA);
    }

    public o(String str, int i10) {
    }

    public static final /* synthetic */ o[] a() {
        return new o[]{f50233b, f50234c, f50235e};
    }

    public static cv.a b() {
        return f50237g;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f50236f.clone();
    }
}
