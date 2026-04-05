package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.g7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC2784g7 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2784g7 f32870a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2784g7 f32871b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2784g7 f32872c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2784g7 f32873d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC2784g7[] f32874e;

    static {
        EnumC2784g7 enumC2784g7 = new EnumC2784g7("INFO", 0);
        f32870a = enumC2784g7;
        EnumC2784g7 enumC2784g72 = new EnumC2784g7("DEBUG", 1);
        f32871b = enumC2784g72;
        EnumC2784g7 enumC2784g73 = new EnumC2784g7("ERROR", 2);
        f32872c = enumC2784g73;
        EnumC2784g7 enumC2784g74 = new EnumC2784g7("STATE", 3);
        f32873d = enumC2784g74;
        EnumC2784g7[] enumC2784g7Arr = {enumC2784g7, enumC2784g72, enumC2784g73, enumC2784g74};
        f32874e = enumC2784g7Arr;
        cv.b.enumEntries(enumC2784g7Arr);
    }

    public EnumC2784g7(String str, int i10) {
    }

    public static EnumC2784g7 valueOf(String str) {
        return (EnumC2784g7) Enum.valueOf(EnumC2784g7.class, str);
    }

    public static EnumC2784g7[] values() {
        return (EnumC2784g7[]) f32874e.clone();
    }
}
