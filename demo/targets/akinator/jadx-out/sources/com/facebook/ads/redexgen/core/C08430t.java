package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.0t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08430t extends C10137j implements Comparable<C08430t> {
    public static String[] A01 = {"kvWdB3TE4F02CvBMsBFKzpbhVf73VbPo", "pIhQPOOT2xsrqrTjtTEUrnlklrU2j4Xx", "pdYckjhCIzgQgDgJpRux4fo9y3MK9tam", "XLFgtw4chSUawlDhyOF7PI6ZgPIPNXPT", "wXiI6RESjxFaJi9cRzlxvGX2h498oRyj", "Xh6QYYa7B1600WPBULoDPW4oSxfbsPz9", "bCs754CcQZSDfR1NSOnMEHTumHpSYrD0", "OFiOLoEO5ZOYdCRe7y5ePAMAMobk5MLR"};
    public long A00;

    public C08430t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C08430t c08430t) {
        if (A05() != c08430t.A05()) {
            return A05() ? 1 : -1;
        }
        long j10 = this.A01 - c08430t.A01;
        if (j10 == 0) {
            long j11 = this.A00;
            long delta = c08430t.A00;
            j10 = j11 - delta;
            if (j10 == 0) {
                return 0;
            }
        }
        String[] strArr = A01;
        if (strArr[7].charAt(9) != strArr[6].charAt(9)) {
            throw new RuntimeException();
        }
        A01[5] = "UnaoajjPsJhIzAMYj8TXxoU3mdsqoDpP";
        return j10 > 0 ? 1 : -1;
    }
}
