package com.inmobi.media;

import com.ironsource.C3271ic;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Lc {

    /* renamed from: a, reason: collision with root package name */
    public static final Lc f32009a;

    /* renamed from: b, reason: collision with root package name */
    public static final Lc f32010b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Lc[] f32011c;

    static {
        Lc lc2 = new Lc(C3271ic.f36943a, 0);
        f32009a = lc2;
        Lc lc3 = new Lc(C3271ic.f36944b, 1);
        f32010b = lc3;
        Lc[] lcArr = {lc2, lc3, new Lc("PUT", 2), new Lc("DELETE", 3), new Lc("PATCH", 4)};
        f32011c = lcArr;
        cv.b.enumEntries(lcArr);
    }

    public Lc(String str, int i10) {
    }

    public static Lc valueOf(String str) {
        return (Lc) Enum.valueOf(Lc.class, str);
    }

    public static Lc[] values() {
        return (Lc[]) f32011c.clone();
    }
}
