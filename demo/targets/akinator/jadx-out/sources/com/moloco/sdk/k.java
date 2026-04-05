package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum k implements Internal.EnumLite {
    MOBILE(1),
    PERSONAL_COMPUTER(2),
    CONNECTED_TV(3),
    HIGHEND_PHONE(4),
    TABLET(5),
    CONNECTED_DEVICE(6),
    SET_TOP_BOX(7),
    OOH_DEVICE(8);


    /* renamed from: l, reason: collision with root package name */
    public static final i f47270l = new i();

    /* renamed from: b, reason: collision with root package name */
    public final int f47272b;

    k(int i10) {
        this.f47272b = i10;
    }

    public static k forNumber(int i10) {
        switch (i10) {
            case 1:
                return MOBILE;
            case 2:
                return PERSONAL_COMPUTER;
            case 3:
                return CONNECTED_TV;
            case 4:
                return HIGHEND_PHONE;
            case 5:
                return TABLET;
            case 6:
                return CONNECTED_DEVICE;
            case 7:
                return SET_TOP_BOX;
            case 8:
                return OOH_DEVICE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<k> internalGetValueMap() {
        return f47270l;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return j.f47250a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f47272b;
    }

    @Deprecated
    public static k valueOf(int i10) {
        return forNumber(i10);
    }
}
