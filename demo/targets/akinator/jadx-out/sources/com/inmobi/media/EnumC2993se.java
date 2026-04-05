package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.se, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC2993se {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2993se f33373a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2993se f33374b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC2993se[] f33375c;

    static {
        EnumC2993se enumC2993se = new EnumC2993se("SDK", 0);
        f33373a = enumC2993se;
        EnumC2993se enumC2993se2 = new EnumC2993se("TEMPLATE", 1);
        f33374b = enumC2993se2;
        EnumC2993se[] enumC2993seArr = {enumC2993se, enumC2993se2};
        f33375c = enumC2993seArr;
        cv.b.enumEntries(enumC2993seArr);
    }

    public EnumC2993se(String str, int i10) {
    }

    public static EnumC2993se valueOf(String str) {
        return (EnumC2993se) Enum.valueOf(EnumC2993se.class, str);
    }

    public static EnumC2993se[] values() {
        return (EnumC2993se[]) f33375c.clone();
    }
}
