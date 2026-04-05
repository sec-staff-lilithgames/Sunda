package com.moloco.sdk.internal.services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f47045b = new h("UNKNOWN", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f47046c = new h("PORTRAIT", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final h f47047e = new h("LANDSCAPE", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h[] f47048f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f47049g;

    static {
        h[] hVarArrA = a();
        f47048f = hVarArrA;
        f47049g = cv.b.enumEntries(hVarArrA);
    }

    public h(String str, int i10) {
    }

    public static final /* synthetic */ h[] a() {
        return new h[]{f47045b, f47046c, f47047e};
    }

    public static cv.a b() {
        return f47049g;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f47048f.clone();
    }
}
