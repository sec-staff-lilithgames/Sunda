package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Aa {
    public static final EnumC3108za a(byte b10) {
        return b10 == 1 ? EnumC3108za.f33720a : b10 == 2 ? EnumC3108za.f33722c : b10 == 3 ? EnumC3108za.f33721b : b10 == 4 ? EnumC3108za.f33723d : EnumC3108za.f33720a;
    }

    public static final boolean b(EnumC3108za enumC3108za) {
        kotlin.jvm.internal.e0.checkNotNullParameter(enumC3108za, "<this>");
        return enumC3108za == EnumC3108za.f33721b || enumC3108za == EnumC3108za.f33723d;
    }

    public static final int a(EnumC3108za enumC3108za) {
        kotlin.jvm.internal.e0.checkNotNullParameter(enumC3108za, "<this>");
        int iOrdinal = enumC3108za.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 90;
        }
        if (iOrdinal == 2) {
            return 180;
        }
        if (iOrdinal == 3) {
            return 270;
        }
        throw new tu.t();
    }
}
