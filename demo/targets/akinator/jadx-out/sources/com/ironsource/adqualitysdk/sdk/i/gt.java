package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ogury.ad.OguryReward;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import io.presage.Presage;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gt extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2403 = {930799085, -283775668, 784808802, 1550604047, 679766051, 1084462479, -1476998636, 2064875382, -1717347803, 27682390, 17009683, 96445115, 156809764, 829696164, -1734920438, 1436704840, 304865201, 231600766};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2404 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2405;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends gk {

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f2406 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2407 = 35782;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f2408 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char f2409 = 55659;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char f2410 = 46870;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char f2411 = 9662;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static String m2557(String str, int i10) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (o.f3166) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    o.f3167 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = o.f3167;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c10 = cArr3[1];
                                char c11 = cArr3[0];
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2407)) ^ ((c11 >>> 5) + f2411)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2410) ^ ((c12 + i12) ^ ((c12 << 4) + f2409))));
                                i12 -= 40503;
                            }
                            int i14 = o.f3167;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            o.f3167 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻐ */
        public final String mo2524() {
            f2408 = (f2406 + 73) % 128;
            String strIntern = m2557("ڗ輂炌ዬזּ\ue792", 5 - (ViewConfiguration.getTapTimeout() >> 16)).intern();
            f2406 = (f2408 + 15) % 128;
            return strIntern;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﻛ */
        public final Class mo2525() {
            int i10 = f2406;
            f2408 = (i10 + 99) % 128;
            int i11 = i10 + 115;
            f2408 = i11 % 128;
            if (i11 % 2 == 0) {
                return OguryReward.class;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾇ */
        public final bg mo2526() {
            bz bzVar = new bz(mo2524());
            int i10 = f2406 + 87;
            f2408 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 32 / 0;
            }
            return bzVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gk
        /* renamed from: ﾒ */
        public final String mo2527() {
            int i10 = f2408 + 113;
            f2406 = i10 % 128;
            return m2557("\uf226\udf8a⹍팛ڗ輂炌ዬ耪浌\ued3a閪㰮پ戴䐂⋣搷韺쾇敞䥆\uf177\ue0e5", i10 % 2 == 0 ? ViewConfiguration.getLongPressTimeout() * EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE : 24 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        int i10 = f2405 + 89;
        f2404 = i10 % 128;
        return (i10 % 2 == 0 ? m2556(new int[]{-570995582, 1365358459, -1604324763, -1424340170}, 5 / View.combineMeasuredStates(1, 1)) : m2556(new int[]{-570995582, 1365358459, -1604324763, -1424340170}, View.combineMeasuredStates(0, 0) + 5)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        int i10 = f2405 + 5;
        f2404 = i10 % 128;
        if (i10 % 2 != 0) {
            return Presage.class;
        }
        int i11 = 79 / 0;
        return Presage.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        ca caVar = new ca(mo2524());
        f2404 = (f2405 + 19) % 128;
        return caVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        int i10 = f2404 + 1;
        f2405 = i10 % 128;
        String strIntern = (i10 % 2 != 0 ? m2556(new int[]{120849321, 2086902534, -1074874137, -1111997718, -1521863757, 663215572, -1074874137, -1111997718, -1671005845, -2080980542}, ExpandableListView.getPackedPositionChild(0L) * Sdk.SDKError.Reason.TPAT_ERROR_VALUE) : m2556(new int[]{120849321, 2086902534, -1074874137, -1111997718, -1521863757, 663215572, -1074874137, -1111997718, -1671005845, -2080980542}, 17 - ExpandableListView.getPackedPositionChild(0L))).intern();
        int i11 = f2405 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2404 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 68 / 0;
        }
        return strIntern;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2556(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2403.clone();
                d.f1846 = 0;
                while (true) {
                    int i11 = d.f1846;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        d.f1844 = (c10 << 16) + c11;
                        d.f1847 = (c12 << 16) + c13;
                        d.m2179(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = d.f1844 ^ iArr2[i13];
                            d.f1844 = i14;
                            int iM2178 = d.m2178(i14) ^ d.f1847;
                            int i15 = d.f1844;
                            d.f1844 = iM2178;
                            d.f1847 = i15;
                        }
                        int i16 = d.f1844;
                        int i17 = d.f1847;
                        d.f1844 = i17;
                        d.f1847 = i16;
                        int i18 = i16 ^ iArr2[16];
                        d.f1847 = i18;
                        int i19 = i17 ^ iArr2[17];
                        d.f1844 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        d.m2179(iArr2);
                        int i20 = d.f1846;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        d.f1846 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
