package com.moloco.sdk.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class p implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* renamed from: b, reason: collision with root package name */
    public static final p f46220b = new p("AD_LOAD_LIMIT_REACHED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final p f46221c = new p("BID_LOAD_ERROR_CANNOT_PROCESS_BID_RESPONSE", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final p f46222e = new p("BID_LOAD_ERROR_CANNOT_PARSE_BID_RESPONSE", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final p f46223f = new p("AD_SHOW_ERROR_NOT_LOADED", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final p f46224g = new p("AD_SHOW_ERROR_ALREADY_DISPLAYING", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ p[] f46225h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ cv.a f46226i;

    static {
        p[] pVarArrB = b();
        f46225h = pVarArrB;
        f46226i = cv.b.enumEntries(pVarArrB);
    }

    public p(String str, int i10) {
    }

    public static final /* synthetic */ p[] b() {
        return new p[]{f46220b, f46221c, f46222e, f46223f, f46224g};
    }

    public static cv.a c() {
        return f46226i;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f46225h.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
