package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fq extends fr {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f2266 = 21582;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2267 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f2268 = 41192;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2269 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2270 = 30239;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2271 = 49190;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private fr f2272;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ee f2273;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private fr f2274;

    public fq(ee eeVar, fr frVar, fr frVar2) {
        this.f2273 = eeVar;
        this.f2272 = frVar;
        this.f2274 = frVar2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2520(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2268)) ^ ((c11 >>> 5) + f2266)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2271) ^ ((c12 + i12) ^ ((c12 << 4) + f2270))));
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r2.equals(r5.f2272) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r5.f2272 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        r2 = r4.f2274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.fq.f2267 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        com.ironsource.adqualitysdk.sdk.i.fq.f2269 = r0 % 128;
        r0 = r0 % 2;
        r5 = r5.f2274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (r0 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        return r2.equals(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        r2.equals(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        if (r5.f2274 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto Lc
            int r5 = com.ironsource.adqualitysdk.sdk.i.fq.f2267
            int r5 = r5 + 87
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2269 = r5
            return r0
        Lc:
            r1 = 0
            if (r5 == 0) goto L6f
            int r2 = com.ironsource.adqualitysdk.sdk.i.fq.f2267
            int r2 = r2 + 27
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2269 = r2
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.fq> r2 = com.ironsource.adqualitysdk.sdk.i.fq.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L20
            goto L6f
        L20:
            com.ironsource.adqualitysdk.sdk.i.fq r5 = (com.ironsource.adqualitysdk.sdk.i.fq) r5
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f2273
            if (r2 == 0) goto L2f
            com.ironsource.adqualitysdk.sdk.i.ee r3 = r5.f2273
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L34
            goto L33
        L2f:
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r5.f2273
            if (r2 == 0) goto L34
        L33:
            return r1
        L34:
            com.ironsource.adqualitysdk.sdk.i.fr r2 = r4.f2272
            if (r2 == 0) goto L49
            int r3 = com.ironsource.adqualitysdk.sdk.i.fq.f2267
            int r3 = r3 + 65
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2269 = r3
            com.ironsource.adqualitysdk.sdk.i.fr r3 = r5.f2272
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4e
            goto L4d
        L49:
            com.ironsource.adqualitysdk.sdk.i.fr r2 = r5.f2272
            if (r2 == 0) goto L4e
        L4d:
            return r1
        L4e:
            com.ironsource.adqualitysdk.sdk.i.fr r2 = r4.f2274
            if (r2 == 0) goto L6a
            int r0 = com.ironsource.adqualitysdk.sdk.i.fq.f2267
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2269 = r1
            int r0 = r0 % 2
            com.ironsource.adqualitysdk.sdk.i.fr r5 = r5.f2274
            if (r0 == 0) goto L65
            boolean r5 = r2.equals(r5)
            return r5
        L65:
            r2.equals(r5)
            r5 = 0
            throw r5
        L6a:
            com.ironsource.adqualitysdk.sdk.i.fr r5 = r5.f2274
            if (r5 != 0) goto L6f
            return r0
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        ee eeVar = this.f2273;
        if (eeVar != null) {
            int i10 = f2267 + 81;
            f2269 = i10 % 128;
            if (i10 % 2 == 0) {
                eeVar.hashCode();
                throw null;
            }
            iHashCode = eeVar.hashCode();
        } else {
            iHashCode = 0;
        }
        int i11 = iHashCode * 31;
        fr frVar = this.f2272;
        if (frVar != null) {
            iHashCode2 = frVar.hashCode();
        } else {
            f2269 = (f2267 + 5) % 128;
            iHashCode2 = 0;
        }
        int i12 = (i11 + iHashCode2) * 31;
        fr frVar2 = this.f2274;
        return i12 + (frVar2 != null ? frVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2520("蓧擰閑\ud81a", 4 - Color.green(0)).intern());
        sb2.append(this.f2273);
        sb2.append(m2520("좧厸", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
        if (this.f2272 instanceof fk) {
            sb2.append(m2520("Ꙩꨑ", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1).intern());
        } else {
            sb2.append(m2520("볈\ue2d7", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        }
        sb2.append(this.f2272);
        fr frVar = this.f2274;
        if (frVar != null) {
            if (frVar instanceof fk) {
                sb2.append(m2520("Ꙩꨑ", 1 - View.MeasureSpec.getMode(0)).intern());
            } else {
                sb2.append(m2520("볈\ue2d7", (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern());
            }
            sb2.append(m2520("뾭氀磢쩬", 4 - ExpandableListView.getPackedPositionGroup(0L)).intern());
            if (this.f2274 instanceof fk) {
                int i10 = f2267 + 113;
                f2269 = i10 % 128;
                sb2.append(m2520("Ꙩꨑ", i10 % 2 == 0 ? 1 % (ViewConfiguration.getLongPressTimeout() / 95) : 1 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
            } else {
                sb2.append(m2520("볈\ue2d7", 1 - View.MeasureSpec.getMode(0)).intern());
                f2269 = (f2267 + 5) % 128;
            }
            sb2.append(this.f2274);
        }
        String string = sb2.toString();
        f2267 = (f2269 + 3) % 128;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* renamed from: ﻐ */
    public final du mo2509(ds dsVar, cp cpVar) {
        if (this.f2273.m2473(dsVar, cpVar).m2434()) {
            f2267 = (f2269 + 57) % 128;
            return this.f2272.mo2509(dsVar, cpVar);
        }
        fr frVar = this.f2274;
        if (frVar == null) {
            return new du(Boolean.FALSE);
        }
        du duVarMo2509 = frVar.mo2509(dsVar, cpVar);
        int i10 = f2267 + 35;
        f2269 = i10 % 128;
        if (i10 % 2 != 0) {
            return duVarMo2509;
        }
        throw null;
    }
}
