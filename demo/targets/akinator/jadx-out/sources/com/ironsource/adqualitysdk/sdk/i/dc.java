package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dc extends da {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1859 = {AbstractJsonLexerKt.STRING, AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'A', 'j', 'k', 'c', 'j', 'n', 'k', 'j', 'C', 'F', 'i', 'l', 'n', 'k', 'i', 'B', 'I', GMTDateParser.SECONDS, 'q', 'n', 'g', 'a', 'g', GMTDateParser.HOURS};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1860 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1861 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final Object m2195(cp cpVar, List<Object> list, ds dsVar) {
        int i10 = f1861 + 57;
        f1860 = i10 % 128;
        if (i10 % 2 != 0) {
            p.m3247(m2199(cpVar, list, dsVar));
            int i11 = 81 / 0;
        } else {
            p.m3247(m2199(cpVar, list, dsVar));
        }
        int i12 = f1860 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1861 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 26 / 0;
        }
        return null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final Object m2196(cp cpVar, List<Object> list, ds dsVar) {
        f1860 = (f1861 + 79) % 128;
        p.m3257(m2199(cpVar, list, dsVar), m2193(list));
        int i10 = f1860 + 59;
        f1861 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 64 / 0;
        }
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Object m2197(cp cpVar, List<Object> list, ds dsVar) {
        f1860 = (f1861 + 65) % 128;
        p.m3248(m2199(cpVar, list, dsVar));
        f1860 = (f1861 + 61) % 128;
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Object m2198(cp cpVar, List<Object> list, ds dsVar) {
        f1861 = (f1860 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        p.m3253(m2199(cpVar, list, dsVar));
        int i10 = f1860 + 35;
        f1861 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final iu m2199(final cp cpVar, List<Object> list, final ds dsVar) {
        final List<Object> listM2182;
        try {
            if (da.m2183(list, 0, iu.class)) {
                return (iu) da.m2180(list, 0, iu.class);
            }
            final dq dqVar = (dq) da.m2180(list, 0, dq.class);
            if (list.size() > 2) {
                listM2182 = da.m2182(list, 2);
            } else {
                listM2182 = da.m2182(list, 1);
                f1860 = (f1861 + 75) % 128;
            }
            iu iuVar = new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.dc.1
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    listM2182.add(0, this);
                    dqVar.m2365(dsVar, cpVar, listM2182);
                    listM2182.remove(0);
                }
            };
            int i10 = f1860 + 115;
            f1861 = i10 % 128;
            if (i10 % 2 != 0) {
                return iuVar;
            }
            throw null;
        } catch (Exception e10) {
            co.m1955(cpVar.m2007(), m2194("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", false, new int[]{0, 30, 0, 0}).intern(), e10);
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object m2200(cp cpVar, List<Object> list, ds dsVar) {
        int i10 = f1860 + 111;
        f1861 = i10 % 128;
        if (i10 % 2 != 0) {
            p.m3254(m2199(cpVar, list, dsVar), m2193(list));
            return null;
        }
        p.m3254(m2199(cpVar, list, dsVar), m2193(list));
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m2201(cp cpVar, List<Object> list, ds dsVar) {
        int i10 = f1860 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f1861 = i10 % 128;
        if (i10 % 2 != 0) {
            p.m3251(m2199(cpVar, list, dsVar));
            return null;
        }
        p.m3251(m2199(cpVar, list, dsVar));
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long m2193(List<Object> list) {
        if (list.size() > 1) {
            f1860 = (f1861 + 1) % 128;
            if (da.m2183(list, 1, Integer.class)) {
                int i10 = f1860 + 51;
                f1861 = i10 % 128;
                int i11 = i10 % 2;
                return ((Integer) da.m2180(list, 1, Integer.class)).intValue();
            }
        }
        if (list.size() <= 2) {
            return 0L;
        }
        f1860 = (f1861 + 65) % 128;
        return ((Integer) da.m2180(list, 2, Integer.class)).intValue();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2194(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f1859, i10, cArr, 0, i11);
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
