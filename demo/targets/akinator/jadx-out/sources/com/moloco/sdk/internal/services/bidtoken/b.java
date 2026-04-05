package com.moloco.sdk.internal.services.bidtoken;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f46781b = new b("NEEDS_REFRESH", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f46782c = new b("EXPIRING", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final b f46783e = new b("NO_REFRESH_NEEDED", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f46784f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f46785g;

    static {
        b[] bVarArrA = a();
        f46784f = bVarArrA;
        f46785g = cv.b.enumEntries(bVarArrA);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f46781b, f46782c, f46783e};
    }

    public static cv.a c() {
        return f46785g;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f46784f.clone();
    }

    public final boolean b() {
        return this == f46782c || this == f46783e;
    }
}
