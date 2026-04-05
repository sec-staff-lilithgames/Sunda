package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.k0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2330k0 implements KJ {
    public static byte[] A0C;
    public static String[] A0D = {"zgZfEJGGgdHtew2g1FfNkkcnB", "zHXWmVVfspRqZTFEHweYGYwJXvEszQMx", "7abqffqd10TBp3FWdGN7VvMrN7O1UkYM", "p0MVW5l5", "JyEkXe6y14TztCHpc8kpfDGRXJv0nuKA", "euIGF7oBB7KZa", "ak0CBs2Ex4lMz9dSuXO", "PviIixxcvW6ZcpMh0sztGl9"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C2614or A05;
    public H1 A06;
    public String A07;
    public boolean A08;
    public final C4I A09;
    public final C4J A0A;
    public final String A0B;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{40, 60, 45, 32, 38, 102, 40, 42, 122};
    }

    static {
        A02();
    }

    public C2330k0() {
        this(null);
    }

    public C2330k0(String str) {
        this.A09 = new C4I(new byte[128]);
        this.A0A = new C4J(this.A09.A00);
        this.A02 = 0;
        this.A04 = C.TIME_UNSET;
        this.A0B = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.4I r1 = r6.A09
            r0 = 0
            r1.A08(r0)
            com.facebook.ads.redexgen.X.4I r0 = r6.A09
            com.facebook.ads.redexgen.X.GE r3 = com.facebook.ads.redexgen.core.GF.A09(r0)
            com.facebook.ads.redexgen.X.or r0 = r6.A05
            if (r0 == 0) goto L6a
            int r5 = r3.A01
            com.facebook.ads.redexgen.X.or r0 = r6.A05
            int r4 = r0.A06
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2330k0.A0D
            r0 = 2
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Ld0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2330k0.A0D
            java.lang.String r1 = "s5ZnNr7Ga7MlLfd70p6uFHM8x"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "utwzV9oXgtTkd"
            r0 = 5
            r2[r0] = r1
            if (r5 != r4) goto L6a
            int r4 = r3.A04
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2330k0.A0D
            r0 = 4
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 13
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lca
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2330k0.A0D
            java.lang.String r1 = "MPTvnFyqCCYkwFwXTKwYW3O2KaIbPHbI"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "dVnQ4greYxNN5pQgdCf"
            r0 = 6
            r2[r0] = r1
            com.facebook.ads.redexgen.X.or r0 = r6.A05
            int r0 = r0.A0G
            if (r4 != r0) goto L6a
            java.lang.String r1 = r3.A06
            com.facebook.ads.redexgen.X.or r0 = r6.A05
            java.lang.String r0 = r0.A0W
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC09264a.A1E(r1, r0)
            if (r0 != 0) goto Lb6
        L6a:
            com.facebook.ads.redexgen.X.2D r1 = new com.facebook.ads.redexgen.X.2D
            r1.<init>()
            java.lang.String r0 = r6.A07
            com.facebook.ads.redexgen.X.2D r1 = r1.A0y(r0)
            java.lang.String r0 = r3.A06
            com.facebook.ads.redexgen.X.2D r1 = r1.A11(r0)
            int r0 = r3.A01
            com.facebook.ads.redexgen.X.2D r1 = r1.A0b(r0)
            int r0 = r3.A04
            com.facebook.ads.redexgen.X.2D r1 = r1.A0m(r0)
            java.lang.String r0 = r6.A0B
            com.facebook.ads.redexgen.X.2D r1 = r1.A10(r0)
            int r0 = r3.A00
            com.facebook.ads.redexgen.X.2D r4 = r1.A0j(r0)
            r2 = 0
            r1 = 9
            r0 = 31
            java.lang.String r1 = A00(r2, r1, r0)
            java.lang.String r0 = r3.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La9
            int r0 = r3.A00
            r4.A0a(r0)
        La9:
            com.facebook.ads.redexgen.X.or r0 = r4.A14()
            r6.A05 = r0
            com.facebook.ads.redexgen.X.H1 r1 = r6.A06
            com.facebook.ads.redexgen.X.or r0 = r6.A05
            r1.A6W(r0)
        Lb6:
            int r0 = r3.A02
            r6.A01 = r0
            int r0 = r3.A03
            long r2 = (long) r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            com.facebook.ads.redexgen.X.or r0 = r6.A05
            int r0 = r0.A0G
            long r0 = (long) r0
            long r2 = r2 / r0
            r6.A03 = r2
            return
        Lca:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Ld0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2330k0.A01():void");
    }

    private boolean A03(C4J c4j) {
        while (true) {
            if (c4j.A07() <= 0) {
                return false;
            }
            boolean z10 = this.A08;
            if (A0D[3].length() != 8) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[4] = "9XFIg7618hJvvA4xETZzayJ4sl88kXfd";
            strArr[1] = "F6kFQyxnROPq81yNs7RnOkiGPjgAvEmB";
            if (!z10) {
                this.A08 = c4j.A0I() == 11;
            } else {
                int iA0I = c4j.A0I();
                if (iA0I == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = iA0I == 11;
            }
        }
    }

    private boolean A04(C4J c4j, byte[] bArr, int i10) {
        int iMin = Math.min(c4j.A07(), i10 - this.A00);
        int bytesToRead = this.A00;
        c4j.A0k(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i10;
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) {
        C3M.A02(this.A06);
        while (c4j.A07() > 0) {
            int i10 = this.A02;
            String[] strArr = A0D;
            if (strArr[0].length() != strArr[5].length()) {
                String[] strArr2 = A0D;
                strArr2[0] = "xuhMWsLm7IhyfpFjlZpQdmw9F";
                strArr2[5] = "BOgMYXTSIypYk";
                switch (i10) {
                    case 0:
                        if (!A03(c4j)) {
                            break;
                        } else {
                            this.A02 = 1;
                            this.A0A.A0l()[0] = 11;
                            this.A0A.A0l()[1] = 119;
                            this.A00 = 2;
                            break;
                        }
                    case 1:
                        if (!A04(c4j, this.A0A.A0l(), 128)) {
                            break;
                        } else {
                            A01();
                            this.A0A.A0f(0);
                            this.A06.AI7(this.A0A, 128);
                            this.A02 = 2;
                            break;
                        }
                    case 2:
                        int iMin = Math.min(c4j.A07(), this.A01 - this.A00);
                        this.A06.AI7(c4j, iMin);
                        this.A00 += iMin;
                        if (this.A00 == this.A01) {
                            if (this.A04 != C.TIME_UNSET) {
                                this.A06.AIA(this.A04, 1, this.A01, 0, null);
                                this.A04 += this.A03;
                            }
                            this.A02 = 0;
                            break;
                        } else {
                            break;
                        }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1329Ke c1329Ke) {
        c1329Ke.A05();
        this.A07 = c1329Ke.A04();
        this.A06 = gy.AJh(c1329Ke.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.A04 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A04 = C.TIME_UNSET;
    }
}
