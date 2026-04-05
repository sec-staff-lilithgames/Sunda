package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.za, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC3108za {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3108za f33720a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3108za f33721b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3108za f33722c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3108za f33723d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC3108za[] f33724e;

    static {
        EnumC3108za enumC3108za = new EnumC3108za("PORTRAIT", 0);
        f33720a = enumC3108za;
        EnumC3108za enumC3108za2 = new EnumC3108za("LANDSCAPE", 1);
        f33721b = enumC3108za2;
        EnumC3108za enumC3108za3 = new EnumC3108za("REVERSE_PORTRAIT", 2);
        f33722c = enumC3108za3;
        EnumC3108za enumC3108za4 = new EnumC3108za("REVERSE_LANDSCAPE", 3);
        f33723d = enumC3108za4;
        EnumC3108za[] enumC3108zaArr = {enumC3108za, enumC3108za2, enumC3108za3, enumC3108za4};
        f33724e = enumC3108zaArr;
        cv.b.enumEntries(enumC3108zaArr);
    }

    public EnumC3108za(String str, int i10) {
    }

    public static EnumC3108za valueOf(String str) {
        return (EnumC3108za) Enum.valueOf(EnumC3108za.class, str);
    }

    public static EnumC3108za[] values() {
        return (EnumC3108za[]) f33724e.clone();
    }
}
