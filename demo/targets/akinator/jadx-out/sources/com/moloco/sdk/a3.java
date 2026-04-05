package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum a3 implements Internal.EnumLite {
    UNKNOWN_EVENT(0),
    MAKE_BID(6),
    WIN(1),
    IMP(2),
    IMP_EXTRA(14),
    CLICK(3),
    POSTBACK(5),
    INSTALL(4),
    CUSTOM_ACTION(23),
    CUSTOM_KPI_ACTION(24),
    FIRST_PURCHASE(9),
    PURCHASE(10),
    LEGACY_FIRST_PURCHASE(11),
    CALL(12),
    FIRST_CALL(13),
    DELIVERY(15),
    REENGAGE(16),
    REGISTER(17),
    AUTHORIZE(20),
    VAST(7),
    SPEND(8),
    OPEN_COMMUNITY(18),
    INVITE(19),
    INSTALL_CT(21),
    INSTALL_VT(22),
    CUSTOM_ACTION_00(100),
    CUSTOM_ACTION_01(101),
    CUSTOM_ACTION_02(102),
    CUSTOM_ACTION_03(103),
    CUSTOM_ACTION_04(104),
    CUSTOM_ACTION_05(105),
    CUSTOM_ACTION_06(106),
    CUSTOM_ACTION_07(107),
    CUSTOM_ACTION_08(108),
    CUSTOM_ACTION_09(109),
    CUSTOM_ACTION_10(110),
    CUSTOM_ACTION_11(111),
    CUSTOM_ACTION_12(112),
    CUSTOM_ACTION_13(113),
    CUSTOM_ACTION_14(114),
    CUSTOM_ACTION_15(115);

    public static final y2 S = new y2();

    /* renamed from: b, reason: collision with root package name */
    public final int f45474b;

    a3(int i10) {
        this.f45474b = i10;
    }

    public static a3 forNumber(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN_EVENT;
            case 1:
                return WIN;
            case 2:
                return IMP;
            case 3:
                return CLICK;
            case 4:
                return INSTALL;
            case 5:
                return POSTBACK;
            case 6:
                return MAKE_BID;
            case 7:
                return VAST;
            case 8:
                return SPEND;
            case 9:
                return FIRST_PURCHASE;
            case 10:
                return PURCHASE;
            case 11:
                return LEGACY_FIRST_PURCHASE;
            case 12:
                return CALL;
            case 13:
                return FIRST_CALL;
            case 14:
                return IMP_EXTRA;
            case 15:
                return DELIVERY;
            case 16:
                return REENGAGE;
            case 17:
                return REGISTER;
            case 18:
                return OPEN_COMMUNITY;
            case 19:
                return INVITE;
            case 20:
                return AUTHORIZE;
            case 21:
                return INSTALL_CT;
            case 22:
                return INSTALL_VT;
            case 23:
                return CUSTOM_ACTION;
            case 24:
                return CUSTOM_KPI_ACTION;
            default:
                switch (i10) {
                    case 100:
                        return CUSTOM_ACTION_00;
                    case 101:
                        return CUSTOM_ACTION_01;
                    case 102:
                        return CUSTOM_ACTION_02;
                    case 103:
                        return CUSTOM_ACTION_03;
                    case 104:
                        return CUSTOM_ACTION_04;
                    case 105:
                        return CUSTOM_ACTION_05;
                    case 106:
                        return CUSTOM_ACTION_06;
                    case 107:
                        return CUSTOM_ACTION_07;
                    case 108:
                        return CUSTOM_ACTION_08;
                    case 109:
                        return CUSTOM_ACTION_09;
                    case 110:
                        return CUSTOM_ACTION_10;
                    case 111:
                        return CUSTOM_ACTION_11;
                    case 112:
                        return CUSTOM_ACTION_12;
                    case 113:
                        return CUSTOM_ACTION_13;
                    case 114:
                        return CUSTOM_ACTION_14;
                    case 115:
                        return CUSTOM_ACTION_15;
                    default:
                        return null;
                }
        }
    }

    public static Internal.EnumLiteMap<a3> internalGetValueMap() {
        return S;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return z2.f50319a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f45474b;
    }

    @Deprecated
    public static a3 valueOf(int i10) {
        return forNumber(i10);
    }
}
