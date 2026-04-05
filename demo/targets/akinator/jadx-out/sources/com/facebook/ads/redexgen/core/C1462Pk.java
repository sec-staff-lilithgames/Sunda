package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Pk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1462Pk {
    public static byte[] A02;
    public static String[] A03 = {"eKMrgqlCE6gemHc3i8XP3AKPCikI", "F056EMXFpemItrIKSNHDMT", "UP7tmvacf", "VwJuHcYZb6pOUF9c5fygzqO1xhwXl8", "rbSS0TX92cN6cYo9TUPXDkEXEuy61J", "qalk034xToBy0kTaZmHtwYGALLiE8EwC", "z1", "iDDMQnl7H0FoGDQAr6PhZLTqZy2Xncag"};
    public long A00 = 0;
    public C1462Pk A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{47, 47};
    }

    static {
        A02();
    }

    private void A01() {
        if (this.A01 == null) {
            this.A01 = new C1462Pk();
        }
    }

    public final int A03(int i10) {
        if (this.A01 == null) {
            if (i10 >= 64) {
                return Long.bitCount(this.A00);
            }
            long j10 = this.A00;
            long j11 = (1 << i10) - 1;
            if (A03[6].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "eBNk3oMk3zKdgPZGJWBoIC6ya78Y9W";
            strArr[4] = "SZljZRIwDL4qj86IVN03h7W6Ja49N5";
            return Long.bitCount(j10 & j11);
        }
        if (i10 < 64) {
            return Long.bitCount(this.A00 & ((1 << i10) - 1));
        }
        return this.A01.A03(i10 - 64) + Long.bitCount(this.A00);
    }

    public final void A04() {
        this.A00 = 0L;
        if (this.A01 != null) {
            C1462Pk c1462Pk = this.A01;
            String[] strArr = A03;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "MSI1mtfoMLAkHcYJR6PW0K";
            strArr2[7] = "fUjJFSbhC3MyLq7bD4XnyNju1VoRa1IS";
            c1462Pk.A04();
        }
    }

    public final void A05(int i10) {
        if (i10 >= 64) {
            if (this.A01 != null) {
                C1462Pk c1462Pk = this.A01;
                int i11 = i10 - 64;
                if (A03[6].length() != 2) {
                    throw new RuntimeException();
                }
                A03[6] = "gh";
                c1462Pk.A05(i11);
                return;
            }
            return;
        }
        this.A00 &= ~(1 << i10);
    }

    public final void A06(int i10) {
        if (i10 >= 64) {
            A01();
            this.A01.A06(i10 - 64);
        } else {
            this.A00 |= 1 << i10;
        }
    }

    public final void A07(int i10, boolean z10) {
        if (i10 >= 64) {
            A01();
            this.A01.A07(i10 - 64, z10);
            return;
        }
        boolean z11 = (this.A00 & Long.MIN_VALUE) != 0;
        long j10 = (1 << i10) - 1;
        long j11 = this.A00 & j10;
        long j12 = this.A00;
        long mask = ~j10;
        this.A00 = j11 | ((j12 & mask) << 1);
        if (z10) {
            A06(i10);
        } else {
            A05(i10);
        }
        if (!z11 && this.A01 == null) {
            return;
        }
        A01();
        this.A01.A07(0, z11);
    }

    public final boolean A08(int i10) {
        if (i10 < 64) {
            return (this.A00 & (1 << i10)) != 0;
        }
        A01();
        return this.A01.A08(i10 - 64);
    }

    public final boolean A09(int i10) {
        if (i10 >= 64) {
            A01();
            return this.A01.A09(i10 - 64);
        }
        long j10 = 1 << i10;
        boolean z10 = (this.A00 & j10) != 0;
        long mask = this.A00;
        this.A00 = mask & (~j10);
        long j11 = j10 - 1;
        long j12 = this.A00 & j11;
        long mask2 = this.A00;
        long before = ~j11;
        this.A00 = j12 | Long.rotateRight(mask2 & before, 1);
        if (this.A01 != null) {
            if (this.A01.A08(0)) {
                A06(63);
            }
            this.A01.A09(0);
        }
        return z10;
    }

    public final String toString() {
        return this.A01 == null ? Long.toBinaryString(this.A00) : this.A01.toString() + A00(0, 2, 114) + Long.toBinaryString(this.A00);
    }
}
