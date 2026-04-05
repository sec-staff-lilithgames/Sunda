package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;

/* renamed from: com.facebook.ads.redexgen.X.2A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2A {
    public static String[] A02 = {"GJxubYlXsZiu90nLIAtZt0ZPoHJfDn5s", "BS8EJfUuntSU9isaC3nv1ANhy", "Gs0aOb6gQMfpDwhZyZjPrCKqfhvLXKwh", "iN3iHRJ6T765oBofKZIxuh5bzIdVCLFB", "wNf5fiO3vn7igkhJYRlF92Iu10jGyY95", "PRW1z97xqqsLulYYbCVWRoDib", "FY0aCr3Onb0", "4J82hMkwk7B8La5ZKR1JgNOMoJvqL0p2"};
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final C2A A00(int i10) {
        C3M.A08(!this.A00);
        this.A01.append(i10, true);
        return this;
    }

    public final C2A A01(int i10, boolean z10) {
        if (z10) {
            C2A c2aA00 = A00(i10);
            if (A02[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "oVNjkypXGUiIrzEYrZV4GsKas1KVyN3y";
            strArr[3] = "tIVTdGxG4MXYUs0uHZXzBbuDNAp7p6hg";
            return c2aA00;
        }
        return this;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.C2A A02(com.facebook.ads.redexgen.core.C2B r3) {
        /*
            r2 = this;
            r1 = 0
        L1:
            int r0 = r3.A00()
            if (r1 >= r0) goto L11
            int r0 = r3.A01(r1)
            r2.A00(r0)
            int r1 = r1 + 1
            goto L1
        L11:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2A.A02(com.facebook.ads.redexgen.X.2B):com.facebook.ads.redexgen.X.2A");
    }

    public final C2A A03(int... iArr) {
        for (int i10 : iArr) {
            A00(i10);
        }
        return this;
    }

    public final C2B A04() {
        C3M.A08(!this.A00);
        this.A00 = true;
        return new C2B(this.A01);
    }
}
