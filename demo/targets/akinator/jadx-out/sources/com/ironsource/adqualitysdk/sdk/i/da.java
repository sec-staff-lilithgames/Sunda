package com.ironsource.adqualitysdk.sdk.i;

import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class da {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1848 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1849 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1850 = {'F', 183, 224, 215, 207, 174, 183, 222, 219, 219, 212, 191, 23, GMTDateParser.YEAR, 128, 'V'};

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <T> T m2180(List<Object> list, int i10, Class<T> cls) {
        T t10 = (T) list.get(i10);
        if (t10 != null) {
            f1849 = (f1848 + 47) % 128;
            if (!cls.isAssignableFrom(t10.getClass())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2181("\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000", true, new int[]{0, 12, 109, 0}).intern());
                sb2.append(t10.getClass().getName());
                sb2.append(m2181("\u0001\u0000\u0001\u0001", false, new int[]{12, 4, 15, 0}).intern());
                sb2.append(cls.getName());
                throw new ClassCastException(sb2.toString());
            }
        }
        int i11 = f1849 + 17;
        f1848 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 58 / 0;
        }
        return t10;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <T> boolean m2183(List<Object> list, int i10, Class<T> cls) {
        int i11 = f1849 + 57;
        f1848 = i11 % 128;
        if (i11 % 2 != 0) {
            list.get(i10);
            throw null;
        }
        Object obj = list.get(i10);
        if (obj != null && !cls.isAssignableFrom(obj.getClass())) {
            return false;
        }
        int i12 = f1849 + 103;
        f1848 = i12 % 128;
        if (i12 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List<Object> m2182(List<Object> list, int i10) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > i10) {
            f1848 = (f1849 + 81) % 128;
            if (m2183(list, i10, List.class)) {
                List<Object> list2 = (List) m2180(list, i10, List.class);
                f1849 = (f1848 + 69) % 128;
                return list2;
            }
        }
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2181(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (g.f2307) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1850, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    g.f2306 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = g.f2306;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        g.f2306 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    g.f2306 = 0;
                    while (true) {
                        int i16 = g.f2306;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        g.f2306 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    g.f2306 = 0;
                    while (true) {
                        int i17 = g.f2306;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        g.f2306 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
