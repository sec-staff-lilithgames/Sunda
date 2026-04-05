package com.moloco.sdk.internal.services;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f47152b = new j0("SILENT", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f47153c = new j0("VIBRATE", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final j0 f47154e = new j0("NORMAL", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j0[] f47155f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f47156g;

    static {
        j0[] j0VarArrA = a();
        f47155f = j0VarArrA;
        f47156g = cv.b.enumEntries(j0VarArrA);
    }

    public j0(String str, int i10) {
    }

    public static final /* synthetic */ j0[] a() {
        return new j0[]{f47152b, f47153c, f47154e};
    }

    public static cv.a b() {
        return f47156g;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f47155f.clone();
    }
}
