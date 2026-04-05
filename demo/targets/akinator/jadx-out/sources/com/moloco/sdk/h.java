package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum h implements Internal.EnumLite {
    CONNECTION_UNKNOWN(0),
    ETHERNET(1),
    WIFI(2),
    CELL_UNKNOWN(3),
    CELL_2G(4),
    CELL_3G(5),
    CELL_4G(6),
    CELL_5G(7);


    /* renamed from: l, reason: collision with root package name */
    public static final f f45807l = new f();

    /* renamed from: b, reason: collision with root package name */
    public final int f45809b;

    h(int i10) {
        this.f45809b = i10;
    }

    public static h forNumber(int i10) {
        switch (i10) {
            case 0:
                return CONNECTION_UNKNOWN;
            case 1:
                return ETHERNET;
            case 2:
                return WIFI;
            case 3:
                return CELL_UNKNOWN;
            case 4:
                return CELL_2G;
            case 5:
                return CELL_3G;
            case 6:
                return CELL_4G;
            case 7:
                return CELL_5G;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<h> internalGetValueMap() {
        return f45807l;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return g.f45780a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f45809b;
    }

    @Deprecated
    public static h valueOf(int i10) {
        return forNumber(i10);
    }
}
