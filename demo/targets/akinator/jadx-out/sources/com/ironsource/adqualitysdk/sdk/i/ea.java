package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ea extends ee {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2111 = 5367734982562869474L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2112 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2113 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f2114;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ee f2115;

    public ea(ee eeVar, String str, Cdo cdo) {
        super(cdo);
        this.f2115 = eeVar;
        this.f2114 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        r0 = r0 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        com.ironsource.adqualitysdk.sdk.i.ea.f2112 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r0 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ea.class == r5.getClass()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r5 = (com.ironsource.adqualitysdk.sdk.i.ea) r5;
        r0 = r4.f2115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r0.equals(r5.f2115) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r5.f2115 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r0 = r4.f2114;
        r5 = r5.f2114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        return r0.equals(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r5 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ea.f2112 = (com.ironsource.adqualitysdk.sdk.i.ea.f2113 + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r5 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ea.f2113
            int r1 = r0 + 75
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f2112 = r2
            int r1 = r1 % 2
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = 68
            int r1 = r1 / r3
            if (r4 != r5) goto L17
            goto L16
        L14:
            if (r4 != r5) goto L17
        L16:
            return r2
        L17:
            if (r5 == 0) goto L59
            int r0 = r0 + 125
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f2112 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L57
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ea> r0 = com.ironsource.adqualitysdk.sdk.i.ea.class
            java.lang.Class r1 = r5.getClass()
            if (r0 == r1) goto L2c
            goto L59
        L2c:
            com.ironsource.adqualitysdk.sdk.i.ea r5 = (com.ironsource.adqualitysdk.sdk.i.ea) r5
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f2115
            if (r0 == 0) goto L3b
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r5.f2115
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L3f
        L3b:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r5.f2115
            if (r0 == 0) goto L40
        L3f:
            return r3
        L40:
            java.lang.String r0 = r4.f2114
            java.lang.String r5 = r5.f2114
            if (r0 == 0) goto L4b
            boolean r5 = r0.equals(r5)
            return r5
        L4b:
            if (r5 != 0) goto L4e
            return r2
        L4e:
            int r5 = com.ironsource.adqualitysdk.sdk.i.ea.f2113
            int r5 = r5 + 17
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.ea.f2112 = r5
            return r3
        L57:
            r5 = 0
            throw r5
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ea.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        f2113 = (f2112 + 63) % 128;
        ee eeVar = this.f2115;
        int iHashCode = 0;
        int iHashCode2 = (eeVar != null ? eeVar.hashCode() : 0) * 31;
        String str = this.f2114;
        if (str != null) {
            int i10 = f2113 + 105;
            f2112 = i10 % 128;
            if (i10 % 2 != 0) {
                str.hashCode();
                throw null;
            }
            iHashCode = str.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2115.toString());
        sb2.append(m2461("\uf2a7\uf289☨\ue654쒚", View.combineMeasuredStates(0, 0)).intern());
        sb2.append(this.f2114);
        String string = sb2.toString();
        int i10 = f2112 + 25;
        f2113 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 66 / 0;
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        f2113 = (f2112 + 61) % 128;
        Object objM2437 = this.f2115.m2473(dsVar, cpVar).m2437();
        if (!(objM2437 instanceof cp)) {
            try {
                return new du(objM2437.getClass().getDeclaredField(this.f2114).get(objM2437));
            } catch (Exception unused) {
                return new du(null);
            }
        }
        du duVar = new du(((cp) objM2437).m2013(this.f2114));
        int i10 = f2112 + 101;
        f2113 = i10 % 128;
        if (i10 % 2 != 0) {
            return duVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2461(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2111, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2111));
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
}
