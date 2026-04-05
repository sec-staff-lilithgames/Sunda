package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public final class F9 {
    public static String[] A06 = {"dMFZX87GqTT9Fs0Ar6j3E2RThJ3xoo5C", "EZFFHtKPOVGLUG8dVwtPTz8nzxupRUs1", "DY3mC9", "dvwRzkCZI4VqlMgEqzZkoiwb96J7xIXP", "wd3MOH", "qlWDoilZ8SCd72klWsfV9j8AsjQ0qExG", "jWVrW2Cr0ltYhYujxpjcdhq8TPZz7fCz", "Hjt9g6OfaYlBY6sAvmXw7jkFi98u1lZw"};
    public int A00;
    public boolean A04;
    public boolean A05;
    public F8 A03 = new F8();
    public F8 A02 = new F8();
    public long A01 = C.TIME_UNSET;

    public final float A00() {
        if (A06()) {
            return (float) (1.0E9d / this.A03.A01());
        }
        return -1.0f;
    }

    public final int A01() {
        return this.A00;
    }

    public final long A02() {
        return A06() ? this.A03.A01() : C.TIME_UNSET;
    }

    public final long A03() {
        return A06() ? this.A03.A02() : C.TIME_UNSET;
    }

    public final void A04() {
        this.A03.A03();
        this.A02.A03();
        this.A04 = false;
        this.A01 = C.TIME_UNSET;
        this.A00 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(long r8) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.F8 r0 = r7.A03
            r0.A04(r8)
            com.facebook.ads.redexgen.X.F8 r0 = r7.A03
            boolean r0 = r0.A06()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L29
            boolean r5 = r7.A05
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.F9.A06
            r0 = 2
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L54
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L29:
            long r1 = r7.A01
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L64
            boolean r0 = r7.A04
            if (r0 == 0) goto L40
            com.facebook.ads.redexgen.X.F8 r0 = r7.A02
            boolean r0 = r0.A05()
            if (r0 == 0) goto L4c
        L40:
            com.facebook.ads.redexgen.X.F8 r0 = r7.A02
            r0.A03()
            com.facebook.ads.redexgen.X.F8 r2 = r7.A02
            long r0 = r7.A01
            r2.A04(r0)
        L4c:
            r7.A04 = r4
            com.facebook.ads.redexgen.X.F8 r0 = r7.A02
            r0.A04(r8)
            goto L64
        L54:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.F9.A06
            java.lang.String r1 = "Bgvzqe"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "uyRQxe"
            r0 = 4
            r2[r0] = r1
            if (r5 != 0) goto L29
            r7.A04 = r3
        L64:
            boolean r0 = r7.A04
            if (r0 == 0) goto L7c
            com.facebook.ads.redexgen.X.F8 r0 = r7.A02
            boolean r0 = r0.A06()
            if (r0 == 0) goto L7c
            com.facebook.ads.redexgen.X.F8 r1 = r7.A03
            com.facebook.ads.redexgen.X.F8 r0 = r7.A02
            r7.A03 = r0
            r7.A02 = r1
            r7.A04 = r3
            r7.A05 = r3
        L7c:
            r7.A01 = r8
            com.facebook.ads.redexgen.X.F8 r0 = r7.A03
            boolean r0 = r0.A06()
            if (r0 == 0) goto L89
        L86:
            r7.A00 = r3
            return
        L89:
            int r0 = r7.A00
            int r3 = r0 + 1
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.F9.A05(long):void");
    }

    public final boolean A06() {
        return this.A03.A06();
    }
}
