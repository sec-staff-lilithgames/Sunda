package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ze, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3112ze {
    public static final short a(EnumC3017u4 errorCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        int iOrdinal = errorCode.ordinal();
        if (iOrdinal == 0) {
            return (short) 2122;
        }
        if (iOrdinal == 18) {
            return (short) 2229;
        }
        switch (iOrdinal) {
            case 12:
                return (short) 2123;
            case 13:
                return (short) 2124;
            case 14:
                return (short) 2125;
            case 15:
                return (short) 2126;
            case 16:
                return (short) 2127;
            default:
                return (short) 2122;
        }
    }
}
