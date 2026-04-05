package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class em extends ee {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2171 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2172;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2173 = {-2002080791, -51528864, -551116782, 786789840, -1949180761, -1005955512, -1042971662, -1042815385, -1248218234, 465343091, 258255428, 841309549, 1245560600, 513696751, 1664105015, -330481033, 1630909286, -1073472269};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f2174;

    public em(String str, Cdo cdo) {
        super(cdo);
        this.f2174 = dy.m2458(str);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2491(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2173.clone();
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            int i10 = f2172 + 103;
            f2171 = i10 % 128;
            return i10 % 2 != 0;
        }
        if (obj == null || em.class != obj.getClass()) {
            return false;
        }
        boolean zEquals = this.f2174.equals(((em) obj).f2174);
        f2171 = (f2172 + 53) % 128;
        return zEquals;
    }

    public final int hashCode() {
        int i10 = f2172 + 107;
        int i11 = i10 % 128;
        f2171 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f2174;
        if (str != null) {
            int iHashCode = str.hashCode();
            f2172 = (f2171 + 55) % 128;
            return iHashCode;
        }
        int i12 = i11 + 11;
        f2172 = i12 % 128;
        if (i12 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public final String toString() {
        int i10 = f2171 + 77;
        f2172 = i10 % 128;
        if (i10 % 2 == 0) {
            return m2492();
        }
        m2492();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m2492() {
        int i10 = f2171;
        int i11 = i10 + 5;
        f2172 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = this.f2174;
        f2172 = (i10 + 35) % 128;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        try {
            return new du(dsVar.m2420(m2492()));
        } catch (Exception e10) {
            dq dqVarM2013 = cpVar.m2013(m2492());
            if (dqVarM2013 != null) {
                return new du(dqVarM2013);
            }
            String strM2007 = cpVar.m2007();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2491(new int[]{1870176689, 1525152017, -185096401, 1489983307, -397235227, 2021718326, 1488656948, -232627910, -478678032, 516040955, -1568532006, 1432229200, -1310798347, 851920209}, 28 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
            sb2.append(this);
            sb2.append(m2474());
            co.m1955(strM2007, sb2.toString(), e10);
            du duVar = new du(null);
            int i10 = f2171 + 97;
            f2172 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 50 / 0;
            }
            return duVar;
        }
    }
}
