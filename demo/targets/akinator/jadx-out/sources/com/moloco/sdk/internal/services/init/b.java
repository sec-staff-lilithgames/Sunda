package com.moloco.sdk.internal.services.init;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f47064b = new b("RequestTimeout", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f47065c = new b("UnknownHostHttpError", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final b f47066e = new b("HttpSocketError", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final b f47067f = new b("HttpSslError", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final b f47068g = new b("PersistentHttpUnavailableError", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final b f47069h = new b("Unknown", 5);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f47070i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ cv.a f47071j;

    static {
        b[] bVarArrA = a();
        f47070i = bVarArrA;
        f47071j = cv.b.enumEntries(bVarArrA);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f47064b, f47065c, f47066e, f47067f, f47068g, f47069h};
    }

    public static cv.a b() {
        return f47071j;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f47070i.clone();
    }
}
