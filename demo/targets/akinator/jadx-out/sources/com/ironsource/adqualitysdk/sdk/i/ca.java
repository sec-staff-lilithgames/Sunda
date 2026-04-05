package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.ironsource.adqualitysdk.sdk.i.bg;
import io.presage.Presage;
import io.presage.common.PresageSdk;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ca extends bg {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1376 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1377 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1378 = -1708596126;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f1379 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1380 = 244390236;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1381 = 34;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1382 = {10, -54, -60, 60, -62, 58, -34, -19, 26, -60, 55, 58, -60, 58, -50, -50, -62, 62, -55, -22, -44, 13, -60, 55, 58, -60, 58, -50, -50, -62, 62, -55, -54, -12, 6, 49, -55, 33, -63, 60, -51, -115, 112, -55, 13, 64, 78, -74, 72, -80, 84, 103, -112, 78, -67, -80, 78, -80, 68, 68, 72, -76, 67, 96, 94, -128, -79, 2, -121, 78, -67, -80, 78, -80, 68, 68, 72, -76, 67, 64, 126, -116, -69, 67, -85, 75, -74, 71, 7, -6, 67, -12, -38, -44, 44, -46, 42, -50, -3, 10, -44, 39, 42, -44, 42, -34, -34, -46, 46, -39, -6, Utf8.REPLACEMENT_BYTE, -53, -27, -25, 31, -9, 23, -22, 59, -24, -36, -54, 53, 37, -35, 53, -43, 40, -7, -15, -73, 68, 73, -73, 73, -67, -67, -79, 77, -70, -103, 88, 66, -70, 82, -78, 79, -98, -7, -125, -119, 116, 125, -117, -128, -107, 92, -128, 115, 126, -128, 126, -118, -118, -122, 122, -115, -82, 111, 117, -115, 101, -123, 120, -87, -17, 40, 35, -39, 49, -54, 39, -41, 38, 3, -56, -36, 36, -52, 44, -47, 0, -9, 108, 102, -101, -110, 100, 111, 122, -80, 110, 101, -97, 119, -116, 97, -111, 96, 69, -114, -102, 98, -118, 106, -105, 70, -24, -80, 73, -109, 93, 74, -87, 82, -86, -85, 13, -117, 67, 88, -82, 87, -118, 114, -71, 69, -82, -125, 120, 87, -68, 81, 91, -71, 94, -83, 95, -91, 85, -83, -86, -93, -128, 96, 85, -109, 104, 87, -86, -88, 86, -92, -99, 97, 86, -82, 70, -90, 91, -86, -22, 23, -82, -33};

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int[] f1375 = {429523600, 1499974250, -723680537, 1720019924, -1430292830, 1415148872, 699472325, -1951459174, -682477124, 1854681414, -2131493628, 1773502688, -580523385, -1773823622, 1905505384, 1450913745, -578549288, 1716067149};

    public ca(String str) {
        super(str);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Presage m1697() {
        int i10 = f1376 + 39;
        f1377 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1698();
        }
        m1698();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static Presage m1698() {
        int i10 = f1377 + 63;
        f1376 = i10 % 128;
        if (i10 % 2 == 0) {
            Presage.getInstance();
            throw null;
        }
        Presage presage = Presage.getInstance();
        int i11 = f1376 + 83;
        f1377 = i11 % 128;
        if (i11 % 2 == 0) {
            return presage;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1700(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i10 = f1377 + 21;
        f1376 = i10 % 128;
        int i11 = i10 % 2;
        m1701(presageOptinVideo, presageOptinVideoCallback);
        if (i11 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m1701(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i10 = f1377 + 65;
        f1376 = i10 % 128;
        int i11 = i10 % 2;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        if (i11 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1704(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i10 = f1376 + 73;
        f1377 = i10 % 128;
        int i11 = i10 % 2;
        m1703(presageInterstitial, presageInterstitialCallback);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f1377 + 77;
        f1376 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        String strMo1165 = mo1165();
        if (strMo1165 == null) {
            return null;
        }
        f1376 = (f1377 + 107) % 128;
        String str = strMo1165.split(m1699(new int[]{-1990836538, 1935152448}, 1 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())[0];
        f1376 = (f1377 + 63) % 128;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1699(new int[]{1066884616, -1774381027, 1164728445, -382356484, -1872369215, -2082468003, 2119769399, 724610906, -1465636368, 1627657779}, 18 - (Process.myTid() >> 22)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ca.m1697();
            }
        });
        map.put(m1699(new int[]{1053480464, 312464122, 20540270, 1367573922, 557044023, 1740168388, -1709557147, 410028119, 1137006336, -2034667021, -193207869, 1652834209}, View.MeasureSpec.getSize(0) + 23).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                ca.m1704((PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1));
                return null;
            }
        });
        map.put(m1699(new int[]{-1044102973, -1997217085, -236091042, -627515088, -121140098, -989056877, -1094809627, 456307685, 1986128876, -1319427628, -1270851319, -1585663026}, ExpandableListView.getPackedPositionGroup(0L) + 21).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                ca.m1700((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        int i10 = f1376 + 31;
        f1377 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo1110(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ca.mo1110(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1699(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1375.clone();
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m1703(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        int i10 = f1377 + 43;
        f1376 = i10 % 128;
        int i11 = i10 % 2;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        if (i11 == 0) {
            int i12 = 35 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1702(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1381;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1382;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1378 + i11] + i13);
                    } else {
                        i14 = (short) (f1379[f1378 + i11] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f1378 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f1380);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f1382;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f1379;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final String mo1165() {
        f1377 = (f1376 + 47) % 128;
        try {
            try {
                String str = (String) Class.forName(m1702(View.combineMeasuredStates(0, 0) - 35, (short) Drawable.resolveOpacity(0, 0), 1708596354 - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) ((KeyEvent.getMaxKeyCode() >> 16) - 88), (-244390132) - TextUtils.lastIndexOf("", '0', 0, 0)).intern()).getMethod(m1702((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 35, (short) ((-1) - TextUtils.lastIndexOf("", '0')), Color.rgb(0, 0, 0) + 1725373617, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 70), (-244390140) - TextUtils.lastIndexOf("", '0', 0)).intern(), null).invoke(null, null);
                int i10 = f1377 + 37;
                f1376 = i10 % 128;
                if (i10 % 2 != 0) {
                    return str;
                }
                throw null;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Exception unused2) {
            return PresageSdk.getAdsSdkVersion();
        }
    }
}
