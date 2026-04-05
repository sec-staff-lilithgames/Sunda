package com.moloco.sdk.internal.services.bidtoken;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f46787c = new d("UNKNOWN", 0, -100);

    /* renamed from: e, reason: collision with root package name */
    public static final d f46788e = new d("HTTP_REQUEST_TIMEOUT", 1, -101);

    /* renamed from: f, reason: collision with root package name */
    public static final d f46789f = new d("UNKNOWN_HOST", 2, -102);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d[] f46790g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cv.a f46791h;

    /* renamed from: b, reason: collision with root package name */
    public final int f46792b;

    static {
        d[] dVarArrA = a();
        f46790g = dVarArrA;
        f46791h = cv.b.enumEntries(dVarArrA);
    }

    public d(String str, int i10, int i11) {
        this.f46792b = i11;
    }

    public static final /* synthetic */ d[] a() {
        return new d[]{f46787c, f46788e, f46789f};
    }

    public static cv.a b() {
        return f46791h;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f46790g.clone();
    }

    public final int c() {
        return this.f46792b;
    }
}
