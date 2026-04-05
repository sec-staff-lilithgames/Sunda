package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f16577b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f16578c;

    /* renamed from: e, reason: collision with root package name */
    public static final l f16579e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f16580f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l[] f16581g;

    static {
        l lVar = new l("IMMEDIATE", 0);
        f16577b = lVar;
        l lVar2 = new l("HIGH", 1);
        f16578c = lVar2;
        l lVar3 = new l("NORMAL", 2);
        f16579e = lVar3;
        l lVar4 = new l("LOW", 3);
        f16580f = lVar4;
        f16581g = new l[]{lVar, lVar2, lVar3, lVar4};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f16581g.clone();
    }
}
