package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fv extends fr {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2285 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2286 = 8100505761840843407L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2287;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<ee> f2288;

    public fv(List<ee> list) {
        this.f2288 = list;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2528(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2286, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2286));
                        i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public final String toString() {
        int i10 = f2285 + 83;
        f2287 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f2288 == null) {
            String strIntern = m2528("\ueee0䙇Ϊ镄\uee96\u0ca9集䫉쓧", 1 - View.resolveSize(0, 0)).intern();
            f2285 = (f2287 + 7) % 128;
            return strIntern;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2528("暕彪쀚ᒙ曣ᖄ啶쬔", 1 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        sb2.append(TextUtils.join(m2528("\ue246႔㌚䗬\ue26a娻", 1 - Drawable.resolveOpacity(0, 0)).intern(), this.f2288));
        return com.google.android.gms.internal.play_billing.a.i(m2528("ꩼ銋跘벷ꩇ", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), sb2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[PHI: r1
      0x0032: PHI (r1v6 com.ironsource.adqualitysdk.sdk.i.em) = (r1v16 com.ironsource.adqualitysdk.sdk.i.em), (r1v17 com.ironsource.adqualitysdk.sdk.i.em) binds: [B:11:0x0030, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[PHI: r1
      0x0036: PHI (r1v8 com.ironsource.adqualitysdk.sdk.i.em) = (r1v11 com.ironsource.adqualitysdk.sdk.i.em), (r1v12 com.ironsource.adqualitysdk.sdk.i.em) binds: [B:11:0x0030, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.ironsource.adqualitysdk.sdk.i.ee] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.ironsource.adqualitysdk.sdk.i.ee] */
    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.du mo2509(com.ironsource.adqualitysdk.sdk.i.ds r7, com.ironsource.adqualitysdk.sdk.i.cp r8) {
        /*
            r6 = this;
            java.util.List<com.ironsource.adqualitysdk.sdk.i.ee> r0 = r6.f2288
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L78
            int r1 = com.ironsource.adqualitysdk.sdk.i.fv.f2287
            int r1 = r1 + 25
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.fv.f2285 = r3
            int r1 = r1 % 2
            r3 = 0
            if (r1 != 0) goto L28
            java.lang.Object r1 = r0.next()
            com.ironsource.adqualitysdk.sdk.i.ee r1 = (com.ironsource.adqualitysdk.sdk.i.ee) r1
            boolean r4 = r1 instanceof com.ironsource.adqualitysdk.sdk.i.em
            r5 = 33
            int r5 = r5 / r3
            if (r4 == 0) goto L36
            goto L32
        L28:
            java.lang.Object r1 = r0.next()
            com.ironsource.adqualitysdk.sdk.i.ee r1 = (com.ironsource.adqualitysdk.sdk.i.ee) r1
            boolean r4 = r1 instanceof com.ironsource.adqualitysdk.sdk.i.em
            if (r4 == 0) goto L36
        L32:
            r2 = r1
            com.ironsource.adqualitysdk.sdk.i.em r2 = (com.ironsource.adqualitysdk.sdk.i.em) r2
            goto L49
        L36:
            boolean r4 = r1 instanceof com.ironsource.adqualitysdk.sdk.i.dz
            if (r4 == 0) goto L49
            int r2 = com.ironsource.adqualitysdk.sdk.i.fv.f2287
            int r2 = r2 + 109
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.fv.f2285 = r2
            r2 = r1
            com.ironsource.adqualitysdk.sdk.i.dz r2 = (com.ironsource.adqualitysdk.sdk.i.dz) r2
            com.ironsource.adqualitysdk.sdk.i.em r2 = r2.m2460()
        L49:
            if (r2 == 0) goto L74
            int r4 = com.ironsource.adqualitysdk.sdk.i.fv.f2285
            int r4 = r4 + 65
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.fv.f2287 = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L67
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r2 = r2.m2492()
            r4[r3] = r2
            java.util.List r2 = java.util.Arrays.asList(r4)
        L63:
            r7.m2421(r2)
            goto L74
        L67:
            java.lang.String r2 = r2.m2492()
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.util.List r2 = java.util.Arrays.asList(r2)
            goto L63
        L74:
            r1.mo2440(r7, r8)
            goto L6
        L78:
            com.ironsource.adqualitysdk.sdk.i.du r7 = new com.ironsource.adqualitysdk.sdk.i.du
            r7.<init>(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fv.mo2509(com.ironsource.adqualitysdk.sdk.i.ds, com.ironsource.adqualitysdk.sdk.i.cp):com.ironsource.adqualitysdk.sdk.i.du");
    }
}
