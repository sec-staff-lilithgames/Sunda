package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ma {

    /* renamed from: a, reason: collision with root package name */
    public static final Ma f32031a;

    /* renamed from: b, reason: collision with root package name */
    public static final Ma f32032b;

    /* renamed from: c, reason: collision with root package name */
    public static final Ma f32033c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Ma[] f32034d;

    static {
        Ma ma2 = new Ma("STOPPED", 0);
        f32031a = ma2;
        Ma ma3 = new Ma("PAUSED", 1);
        f32032b = ma3;
        Ma ma4 = new Ma("STARTED", 2);
        f32033c = ma4;
        Ma[] maArr = {ma2, ma3, ma4};
        f32034d = maArr;
        cv.b.enumEntries(maArr);
    }

    public Ma(String str, int i10) {
    }

    public static Ma valueOf(String str) {
        return (Ma) Enum.valueOf(Ma.class, str);
    }

    public static Ma[] values() {
        return (Ma[]) f32034d.clone();
    }
}
