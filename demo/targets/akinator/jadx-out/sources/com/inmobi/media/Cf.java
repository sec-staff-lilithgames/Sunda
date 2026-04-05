package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Cf {

    /* renamed from: a, reason: collision with root package name */
    public static final Cf f31716a;

    /* renamed from: b, reason: collision with root package name */
    public static final Cf f31717b;

    /* renamed from: c, reason: collision with root package name */
    public static final Cf f31718c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Cf[] f31719d;

    static {
        Cf cf2 = new Cf("UNKNOWN", 0);
        f31716a = cf2;
        Cf cf3 = new Cf("HIDDEN", 1);
        f31717b = cf3;
        Cf cf4 = new Cf("VISIBLE", 2);
        f31718c = cf4;
        Cf[] cfArr = {cf2, cf3, cf4};
        f31719d = cfArr;
        cv.b.enumEntries(cfArr);
    }

    public Cf(String str, int i10) {
    }

    public static Cf valueOf(String str) {
        return (Cf) Enum.valueOf(Cf.class, str);
    }

    public static Cf[] values() {
        return (Cf[]) f31719d.clone();
    }
}
