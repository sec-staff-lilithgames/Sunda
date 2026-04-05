package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.f4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC2764f4 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2764f4 f32833a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2764f4[] f32834b;

    static {
        EnumC2764f4 enumC2764f4 = new EnumC2764f4("URL", 0);
        f32833a = enumC2764f4;
        EnumC2764f4[] enumC2764f4Arr = {enumC2764f4, new EnumC2764f4("HTML", 1)};
        f32834b = enumC2764f4Arr;
        cv.b.enumEntries(enumC2764f4Arr);
    }

    public EnumC2764f4(String str, int i10) {
    }

    public static EnumC2764f4 valueOf(String str) {
        return (EnumC2764f4) Enum.valueOf(EnumC2764f4.class, str);
    }

    public static EnumC2764f4[] values() {
        return (EnumC2764f4[]) f32834b.clone();
    }
}
