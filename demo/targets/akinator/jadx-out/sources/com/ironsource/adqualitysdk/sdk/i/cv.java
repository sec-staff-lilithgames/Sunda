package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cv extends da {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1724 = {AbstractJsonLexerKt.STRING, AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'I', GMTDateParser.SECONDS, 'q', 'n', 'k', 'k', 'j', 'C', 'F', 'g', GMTDateParser.HOURS, 'O', 'J', 'j', 'p', AbstractJsonLexerKt.BEGIN_LIST, 'S', 'b', 'e', 'D', 'G', 'n', 'G', 'F', 'j', 'n', GMTDateParser.SECONDS, 'P', 182, 205, 203, 203, 164, 164, 206, 204, 201, 198, 198, 197, 158, 158, 194, 197, 203, 199, 198, 164, 162, 201, 162, 161, 197, 201, 206};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1725 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1726;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Object m2117(cp cpVar, List<Object> list) {
        cp cpVar2;
        List list2 = (List) da.m2180(list, 0, List.class);
        try {
            dq dqVar = (dq) da.m2180(list, 1, dq.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                f1726 = (f1725 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
                if (da.m2183(list, 2, cp.class)) {
                    cpVar2 = (cp) da.m2180(list, 2, cp.class);
                    if (list.size() > 3) {
                        f1726 = (f1725 + 113) % 128;
                        arrayList = da.m2182(list, 3);
                    }
                } else {
                    arrayList = da.m2182(list, 2);
                    cpVar2 = cpVar;
                }
            } else {
                cpVar2 = cpVar;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < list2.size(); i10++) {
                arrayList.add(0, list2.get(i10));
                arrayList2.add(dqVar.m2365(cpVar2.m2006(), cpVar2, arrayList).m2437());
                arrayList.remove(0);
            }
            return arrayList2;
        } catch (Exception e10) {
            co.m1955(cpVar.m2007(), m2116("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", false, new int[]{0, 33, 0, 0}).intern(), e10);
            return list2;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Object m2118(cp cpVar, List<Object> list) {
        cp cpVar2;
        List list2 = (List) da.m2180(list, 0, List.class);
        try {
            dq dqVar = (dq) da.m2180(list, 1, dq.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() <= 2) {
                cpVar2 = cpVar;
            } else if (da.m2183(list, 2, cp.class)) {
                cpVar2 = (cp) da.m2180(list, 2, cp.class);
                if (list.size() > 3) {
                    f1725 = (f1726 + 99) % 128;
                    arrayList = da.m2182(list, 3);
                }
            } else {
                arrayList = da.m2182(list, 2);
                f1726 = (f1725 + 23) % 128;
                cpVar2 = cpVar;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < list2.size(); i10++) {
                arrayList.add(0, list2.get(i10));
                if (dqVar.m2365(cpVar2.m2006(), cpVar2, arrayList).m2434()) {
                    arrayList2.add(list2.get(i10));
                }
                arrayList.remove(0);
            }
            return arrayList2;
        } catch (Exception e10) {
            co.m1955(cpVar.m2007(), m2116("\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", false, new int[]{33, 28, 91, 0}).intern(), e10);
            return list2;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m2119(cp cpVar, List<Object> list) {
        f1725 = (f1726 + 101) % 128;
        m2117(cpVar, list);
        f1726 = (f1725 + 5) % 128;
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2116(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f1724, i10, cArr, 0, i11);
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
