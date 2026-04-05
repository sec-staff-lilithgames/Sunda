package com.ironsource.adqualitysdk.sdk.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cr extends da {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1711 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1712 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f1713 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1714 = 1475937969;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1715 = 39;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1716 = -372370128;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1717 = {0};

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9 A[PHI: r0
      0x00a9: PHI (r0v16 org.json.JSONObject) = (r0v15 org.json.JSONObject), (r0v19 org.json.JSONObject) binds: [B:13:0x00a7, B:9:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m2070(com.ironsource.adqualitysdk.sdk.i.cp r10, java.util.List<java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cr.m2070(com.ironsource.adqualitysdk.sdk.i.cp, java.util.List):java.lang.Object");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2071(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1715;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1717;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1714 + i11] + i13);
                    } else {
                        i14 = (short) (f1713[f1714 + i11] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f1714 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f1716);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f1717;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f1713;
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
}
