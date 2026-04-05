package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f49901b = new b("DisplayStarted", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f49902c = new b("ClickThrough", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f49903e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f49904f;

    static {
        b[] bVarArrA = a();
        f49903e = bVarArrA;
        f49904f = cv.b.enumEntries(bVarArrA);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f49901b, f49902c};
    }

    public static cv.a b() {
        return f49904f;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49903e.clone();
    }
}
