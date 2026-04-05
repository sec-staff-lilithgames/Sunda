package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dw extends ee {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2072 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f2073 = null;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2074 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2075 = -1236290007;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2076 = {0, 0};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2077 = 84;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2078 = 1606991690;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ee[] f2079;

    public dw(List<ee> list, Cdo cdo) {
        super(cdo);
        ee[] eeVarArr = new ee[list.size()];
        this.f2079 = eeVarArr;
        list.toArray(eeVarArr);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2441(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2077;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2076;
                    i14 = bArr != null ? (byte) (bArr[f2078 + i11] + i13) : (short) (f2073[f2078 + i11] + i13);
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f2078 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f2075);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f2076;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f2073;
                            int i17 = n.f3165;
                            n.f3165 = i17 - 1;
                            n.f3162 = (char) (n.f3161 + (((short) (sArr[i17] + s10)) ^ n.f3163));
                        }
                        sb2.append(n.f3162);
                        n.f3161 = n.f3162;
                        n.f3164++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f2074 = (f2072 + 107) % 128;
            return true;
        }
        if (obj == null || dw.class != obj.getClass()) {
            return false;
        }
        boolean zEquals = Arrays.equals(this.f2079, ((dw) obj).f2079);
        f2072 = (f2074 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        return zEquals;
    }

    public final int hashCode() {
        f2072 = (f2074 + 3) % 128;
        int iHashCode = Arrays.hashCode(this.f2079);
        int i10 = f2072 + 7;
        f2074 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 85 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2441((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 83, (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 67), TextUtils.indexOf("", "", 0) - 1606991690, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 83), 1236290098 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        sb2.append(ee.m2472(this.f2079));
        String strI = com.google.android.gms.internal.play_billing.a.i(m2441(TextUtils.indexOf("", "", 0, 0) - 83, (short) (122 - Color.green(0)), (-1606991690) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 97), 1236290100 - ExpandableListView.getPackedPositionType(0L)), sb2);
        int i10 = f2074 + 19;
        f2072 = i10 % 128;
        if (i10 % 2 == 0) {
            return strI;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        ArrayList arrayList = new ArrayList();
        ee[] eeVarArr = this.f2079;
        int length = eeVarArr.length;
        f2072 = (f2074 + 11) % 128;
        int i10 = 0;
        while (i10 < length) {
            int i11 = f2074 + 95;
            f2072 = i11 % 128;
            if (i11 % 2 != 0) {
                arrayList.add(eeVarArr[i10].m2473(dsVar, cpVar).m2437());
                i10 += 97;
            } else {
                arrayList.add(eeVarArr[i10].m2473(dsVar, cpVar).m2437());
                i10++;
            }
        }
        return new du(arrayList);
    }
}
