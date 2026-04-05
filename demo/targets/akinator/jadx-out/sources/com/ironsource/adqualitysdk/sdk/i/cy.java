package com.ironsource.adqualitysdk.sdk.i;

import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cy extends da {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1839 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1840 = -301621572;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1841 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1842 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1843;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static char m2169(List<Object> list) {
        f1843 = (f1842 + 17) % 128;
        char cIntValue = (char) ((Number) da.m2180(list, 0, Number.class)).intValue();
        int i10 = f1842 + 59;
        f1843 = i10 % 128;
        if (i10 % 2 == 0) {
            return cIntValue;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Class m2170(List<Object> list) {
        f1843 = (f1842 + 69) % 128;
        Class<?> cls = Array.newInstance((Class<?>) da.m2180(list, 0, Class.class), 0).getClass();
        int i10 = f1843 + 83;
        f1842 = i10 % 128;
        if (i10 % 2 != 0) {
            return cls;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m2172(cp cpVar, List<Object> list) {
        List list2;
        String string;
        Class cls = (Class) da.m2180(list, 0, Class.class);
        List arrayList = new ArrayList();
        if (list.size() > 1) {
            arrayList = (List) da.m2180(list, 1, List.class);
        }
        if (list.size() > 2) {
            f1842 = (f1843 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
            list2 = (List) da.m2180(list, 2, List.class);
        } else {
            list2 = null;
        }
        try {
            if (list2 == null) {
                return jz.m3118(cls, (List<Object>) arrayList);
            }
            Class[] clsArr = new Class[list2.size()];
            list2.toArray(clsArr);
            return jz.m3115(cls, arrayList, clsArr);
        } catch (Exception e10) {
            String strM1950 = cpVar.m2014().m1950();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2171("뤔墋㴭磄", (char) (50237 - (ViewConfiguration.getJumpTapTimeout() >> 16)), "䛊Η瓲䃾꽸뾴䙰䛸魰Ⰽ\udf3a䴫䙄\udca0엣ꄓ釘ꗊ폏", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 760777656, "\u0000\u0000\u0000\u0000").intern());
            sb2.append(cls.getName());
            sb2.append(m2171("쁚\uea79\uf169蘦", (char) ExpandableListView.getPackedPositionType(0L), "효\uf2ad곙\ue03bᱬ\ue82c듔䲀튙㺳ྟ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1776974272, "\u0000\u0000\u0000\u0000").intern());
            sb2.append(arrayList);
            if (list2 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m2171("\ud8d8ऍ\udc25\ue1a6", (char) (42716 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), "ㅥ깿덊\ue364頗ᠲ嚄찼㤘\ud810∓\uf11f殯", (ViewConfiguration.getLongPressTimeout() >> 16) + 621350360, "\u0000\u0000\u0000\u0000").intern());
                sb3.append(list2);
                string = sb3.toString();
                f1842 = (f1843 + 95) % 128;
            } else {
                string = "";
            }
            sb2.append(string);
            co.m1955(strM1950, sb2.toString(), e10);
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2171(String str, char c10, String str2, int i10, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (f.f2212) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                f.f2213 = 0;
                while (true) {
                    int i11 = f.f2213;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2211 = c12;
                        cArr5[i13] = (char) e3.g.e(cArr4[i13], 32718, c11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c12;
                        int i15 = f.f2213;
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f1839) ^ f1840) ^ f1841);
                        f.f2213 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2173(List<Object> list) {
        int i10 = f1842 + 103;
        f1843 = i10 % 128;
        if (i10 % 2 == 0 ? jz.m3126(da.m2180(list, 0, Object.class), (String) da.m2180(list, 1, String.class), (List) da.m2180(list, 2, List.class)) != null : jz.m3126(da.m2180(list, 1, Object.class), (String) da.m2180(list, 1, String.class), (List) da.m2180(list, 4, List.class)) != null) {
            return true;
        }
        f1842 = (f1843 + 61) % 128;
        return false;
    }
}
