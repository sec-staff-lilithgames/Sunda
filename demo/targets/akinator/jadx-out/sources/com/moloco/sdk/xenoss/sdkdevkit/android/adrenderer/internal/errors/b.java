package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f47668b = new b("FULLSCREEN_AD_SHOW_FAILED_NO_SUPPORTED_TYPE", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f47669c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cv.a f47670e;

    static {
        b[] bVarArrB = b();
        f47669c = bVarArrB;
        f47670e = cv.b.enumEntries(bVarArrB);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] b() {
        return new b[]{f47668b};
    }

    public static cv.a c() {
        return f47670e;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f47669c.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
