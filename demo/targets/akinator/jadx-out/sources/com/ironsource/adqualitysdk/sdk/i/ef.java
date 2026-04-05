package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ef extends ej {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2139 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2140 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2141 = 56232;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2142 = 54978;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2143 = 58608;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2144 = 41651;

    public ef(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2476(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2144)) ^ ((c11 >>> 5) + f2142)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2143) ^ ((c12 + i12) ^ ((c12 << 4) + f2141))));
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if ((r8 instanceof org.json.JSONObject) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.du(((org.json.JSONObject) r8).opt((java.lang.String) r0.m2437()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if ((r8 instanceof org.json.JSONArray) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        r4 = new com.ironsource.adqualitysdk.sdk.i.du(((org.json.JSONArray) r8).opt(r0.m2436().intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        r8 = com.ironsource.adqualitysdk.sdk.i.ef.f2139 + 51;
        com.ironsource.adqualitysdk.sdk.i.ef.f2140 = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if ((r8 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if ((r8 instanceof java.util.Map) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.du(((java.util.Map) r8).get(r0.m2437()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if ((r8 instanceof java.util.List) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.du(((java.util.List) r8).get(r0.m2436().intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r8.getClass().isArray() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.du(((java.lang.Object[]) r8)[r0.m2436().intValue()]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        r0 = r9.m2007();
        r4 = new java.lang.StringBuilder();
        r4.append(m2476("\ueb66杕\ua954ꡥﮥᳪ\uf66c髶촠\uda68\uf5ee촭죾\udb79䀑倰\u12bf誒ㄔ\ue448帎撿檴䪸\uf8ed鉱\ufaf2믯Ꞵ管\u2073涌몭鐎\uecce蝍榣適隕垵\uf5fcꥇ", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 42).intern());
        r4.append(r7);
        r4.append(m2474());
        r4.append(m2476("\ue6a1╦ሖ㐬쟪\uf630䀑倰棕㡕麄璬芆\ued01䝽醽鄈墥샜짿\uf5fcꥇᏘ䟀죛ㆨ댶\ua7ec膏桐\ua634➃橥팎ꆢ艹鿴᷈\ue49c\ud917䰀ᧅ", 40 - android.graphics.ImageFormat.getBitsPerPixel(0)).intern());
        r4.append(r8);
        com.ironsource.adqualitysdk.sdk.i.co.m1955(r0, r4.toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if ((r8 instanceof org.json.JSONObject) != false) goto L17;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.du mo2440(com.ironsource.adqualitysdk.sdk.i.ds r8, com.ironsource.adqualitysdk.sdk.i.cp r9) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ef.mo2440(com.ironsource.adqualitysdk.sdk.i.ds, com.ironsource.adqualitysdk.sdk.i.cp):com.ironsource.adqualitysdk.sdk.i.du");
    }
}
