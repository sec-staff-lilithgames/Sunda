package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Mc {

    /* renamed from: a, reason: collision with root package name */
    public static final Mc f32035a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Mc[] f32036b;

    static {
        Mc mc2 = new Mc("HIGH", 0);
        Mc mc3 = new Mc("LOW", 1);
        f32035a = mc3;
        Mc[] mcArr = {mc2, mc3};
        f32036b = mcArr;
        cv.b.enumEntries(mcArr);
    }

    public Mc(String str, int i10) {
    }

    public static Mc valueOf(String str) {
        return (Mc) Enum.valueOf(Mc.class, str);
    }

    public static Mc[] values() {
        return (Mc[]) f32036b.clone();
    }
}
