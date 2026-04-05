package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;

/* renamed from: com.facebook.ads.redexgen.X.2B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2B {
    public static String[] A01 = {"ZtAeFZn0B1qTMkAv4TimNf", "onjqbWPlpraCurTtWuR0R", "izLFZdnLPv7lUm1GFercP1dDHTQqqlbm", "06udDjCQiMTHlo", "ThrPk51efRSGKxf", "UllMG4WENFsjBGTIREywCD", "xUDuL0NOtKss50bSSzha3FmKwjhZHM", "2ZQ9"};
    public final SparseBooleanArray A00;

    public C2B(SparseBooleanArray sparseBooleanArray) {
        this.A00 = sparseBooleanArray;
    }

    public final int A00() {
        return this.A00.size();
    }

    public final int A01(int i10) {
        C3M.A00(i10, 0, A00());
        return this.A00.keyAt(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r4 != r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r4 != r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r5 >= A00()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r4 = A01(r5);
        r3 = r9.A01(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (com.facebook.ads.redexgen.core.C2B.A01[5].length() == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        r2 = com.facebook.ads.redexgen.core.C2B.A01;
        r2[4] = "0EnUC3S7s3BqIyD";
        r2[7] = "m0OD";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (r4 == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 1
            if (r8 != r9) goto L4
            return r7
        L4:
            boolean r0 = r9 instanceof com.facebook.ads.redexgen.core.C2B
            r6 = 0
            if (r0 != 0) goto La
            return r6
        La:
            com.facebook.ads.redexgen.X.2B r9 = (com.facebook.ads.redexgen.core.C2B) r9
            int r3 = com.facebook.ads.redexgen.core.AbstractC09264a.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2B.A01
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L21
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L21:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2B.A01
            java.lang.String r1 = "V79UaeNQVFwVWh"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "sTKtjiNlOf72YkaUZZtiJ"
            r0 = 1
            r2[r0] = r1
            r0 = 24
            if (r3 >= r0) goto L87
            int r4 = r8.A00()
            int r3 = r9.A00()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2B.A01
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L49
            if (r4 == r3) goto L53
        L48:
            return r6
        L49:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2B.A01
            java.lang.String r1 = "gWINzXnVkNSV1XpcBprNZ7cfktAxvgY6"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto L53
            goto L48
        L53:
            r5 = 0
        L54:
            int r0 = r8.A00()
            if (r5 >= r0) goto L86
            int r4 = r8.A01(r5)
            int r3 = r9.A01(r5)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2B.A01
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L80
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2B.A01
            java.lang.String r1 = "0EnUC3S7s3BqIyD"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "m0OD"
            r0 = 7
            r2[r0] = r1
            if (r4 == r3) goto L7d
            return r6
        L7d:
            int r5 = r5 + 1
            goto L54
        L80:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L86:
            return r7
        L87:
            android.util.SparseBooleanArray r1 = r8.A00
            android.util.SparseBooleanArray r0 = r9.A00
            boolean r0 = r1.equals(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2B.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r5 = this;
            int r1 = com.facebook.ads.redexgen.core.AbstractC09264a.A02
            r0 = 24
            if (r1 >= r0) goto L36
            int r3 = r5.A00()
            r4 = 0
        Lb:
            int r0 = r5.A00()
            if (r4 >= r0) goto L35
            int r3 = r3 * 31
            int r0 = r5.A01(r4)
            int r3 = r3 + r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2B.A01
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 12
            if (r1 == r0) goto L2f
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2B.A01
            java.lang.String r1 = "oTlXYQnTcFkgjJigc1HTEJLN2hql86lz"
            r0 = 2
            r2[r0] = r1
            int r4 = r4 + 1
            goto Lb
        L2f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L35:
            return r3
        L36:
            android.util.SparseBooleanArray r0 = r5.A00
            int r0 = r0.hashCode()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2B.hashCode():int");
    }
}
