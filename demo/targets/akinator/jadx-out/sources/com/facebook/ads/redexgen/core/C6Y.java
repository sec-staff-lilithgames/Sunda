package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Y {
    public static byte[] A0E;
    public static String[] A0F = {"qTjlphzGhjtz23pZpbkrfGV3", "gcvQ0aFRAZsVeDDMvPpq9fmBIR43z3dS", "1g2pSH5s64tGUAh3eJ0e3X43Q9jzw3mq", "lB1M4R9KcDs1NZsKBVQ3JQYLP4RbMvTH", "7AgciWFjZyCuzmH359m88XAJrahqi7eF", "Et2BwvNp", "Oz1eJxJHgMWzrYsZQ0zZlFN1YCxGY3CZ", "Iy7o67ktSbvMBIxm3lxnuK7UTKgUaVFx"};
    public C6Z A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public C6Y A04;
    public C2451mA A05 = C2451mA.A06;
    public EL A06;
    public final InterfaceC2462mM A07;
    public final Object A08;
    public final InterfaceC1135Cr[] A09;
    public final C6X A0A;
    public final EK A0B;
    public final C7D[] A0C;
    public final boolean[] A0D;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{81, 121, 120, 117, 125, 76, 121, 110, 117, 115, 120, 84, 115, 112, 120, 121, 110, 28, 41, 62, 37, 35, 40, 108, 62, 41, 32, 41, 45, Utf8.REPLACEMENT_BYTE, 41, 108, 42, 45, 37, 32, 41, 40, 98};
    }

    static {
        A04();
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old exoplayer method. requires deleting")
    public C6Y(C7D[] c7dArr, long j10, EK ek2, EO eo2, CL cl, C6Z c6z, EL el2) {
        this.A0C = c7dArr;
        this.A03 = j10 - c6z.A03;
        this.A0B = ek2;
        this.A08 = C3M.A01(c6z.A04.A04);
        this.A00 = c6z;
        this.A06 = el2;
        this.A09 = new InterfaceC1135Cr[c7dArr.length];
        this.A0D = new boolean[c7dArr.length];
        this.A0A = new C2525nN(this, cl);
        this.A07 = A00(c6z.A04, this.A0A, eo2, c6z.A03, c6z.A01);
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceList is temporarily changed to MediaSourceAdapter")
    public static InterfaceC2462mM A00(C2461mL c2461mL, C6X c6x, EO eo2, long j10, long j11) {
        InterfaceC2462mM interfaceC2462mMA5O = c6x.A5O(c2461mL, eo2, j10);
        if (j11 != C.TIME_UNSET) {
            return new C9F(interfaceC2462mMA5O, true, 0L, j11);
        }
        return interfaceC2462mMA5O;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            r3 = this;
            boolean r0 = r3.A08()
            if (r0 != 0) goto L7
            return
        L7:
            r2 = 0
        L8:
            com.facebook.ads.redexgen.X.EL r0 = r3.A06
            int r0 = r0.A00
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.EL r0 = r3.A06
            boolean r1 = r0.A00(r2)
            com.facebook.ads.redexgen.X.EL r0 = r3.A06
            com.facebook.ads.redexgen.X.lj[] r0 = r0.A04
            r0 = r0[r2]
            if (r1 == 0) goto L21
            if (r0 == 0) goto L21
            r0.A5p()
        L21:
            int r2 = r2 + 1
            goto L8
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C6Y.A02():void");
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A03() {
        /*
            r3 = this;
            boolean r0 = r3.A08()
            if (r0 != 0) goto L7
            return
        L7:
            r2 = 0
        L8:
            com.facebook.ads.redexgen.X.EL r0 = r3.A06
            int r0 = r0.A00
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.EL r0 = r3.A06
            boolean r1 = r0.A00(r2)
            com.facebook.ads.redexgen.X.EL r0 = r3.A06
            com.facebook.ads.redexgen.X.lj[] r0 = r0.A04
            r0 = r0[r2]
            if (r1 == 0) goto L21
            if (r0 == 0) goto L21
            r0.A6C()
        L21:
            int r2 = r2 + 1
            goto L8
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C6Y.A03():void");
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary bridging of MediaSourceList with MediaSourceAdapter")
    public static void A05(C6X c6x, InterfaceC2462mM interfaceC2462mM) {
        try {
            if (interfaceC2462mM instanceof C9F) {
                c6x.AH0(((C9F) interfaceC2462mM).A05);
            } else {
                c6x.AH0(interfaceC2462mM);
            }
        } catch (RuntimeException e10) {
            AnonymousClass44.A08(A01(0, 17, 10), A01(17, 22, 90), e10);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(com.facebook.ads.redexgen.core.InterfaceC1135Cr[] r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.7D[] r0 = r3.A0C
            int r0 = r0.length
            if (r2 >= r0) goto L23
            com.facebook.ads.redexgen.X.7D[] r0 = r3.A0C
            r0 = r0[r2]
            int r1 = r0.A9F()
            r0 = -2
            if (r1 != r0) goto L20
            com.facebook.ads.redexgen.X.EL r0 = r3.A06
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L20
            com.facebook.ads.redexgen.X.mO r0 = new com.facebook.ads.redexgen.X.mO
            r0.<init>()
            r4[r2] = r0
        L20:
            int r2 = r2 + 1
            goto L1
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C6Y.A06(com.facebook.ads.redexgen.X.Cr[]):void");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(com.facebook.ads.redexgen.core.InterfaceC1135Cr[] r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.7D[] r0 = r3.A0C
            int r0 = r0.length
            if (r2 >= r0) goto L17
            com.facebook.ads.redexgen.X.7D[] r0 = r3.A0C
            r0 = r0[r2]
            int r1 = r0.A9F()
            r0 = -2
            if (r1 != r0) goto L14
            r0 = 0
            r4[r2] = r0
        L14:
            int r2 = r2 + 1
            goto L1
        L17:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C6Y.A07(com.facebook.ads.redexgen.X.Cr[]):void");
    }

    private boolean A08() {
        return this.A04 == null;
    }

    public final long A09() {
        if (!this.A02) {
            return this.A00.A03;
        }
        long jA70 = this.A01 ? this.A07.A70() : Long.MIN_VALUE;
        return jA70 == Long.MIN_VALUE ? this.A00.A00 : jA70;
    }

    public final long A0A() {
        if (this.A02) {
            return this.A07.A8T();
        }
        return 0L;
    }

    public final long A0B() {
        return this.A03;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"})
    public final long A0C(long j10) {
        return this.A07.A6y(j10);
    }

    public final long A0D(long j10) {
        return j10 - A0B();
    }

    public final long A0E(long j10) {
        return A0B() + j10;
    }

    public final long A0F(EL el2, long j10, boolean z10) {
        return A0G(el2, j10, z10, new boolean[this.A0C.length]);
    }

    public final long A0G(EL el2, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = false;
            if (i10 < el2.A00) {
                boolean[] zArr2 = this.A0D;
                if (!z10) {
                    boolean zA01 = el2.A01(this.A06, i10);
                    if (A0F[5].length() != 8) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0F;
                    strArr[4] = "ZW5cY05fUZ7YDJtoLiROAD1s3u7pqZaY";
                    strArr[3] = "DBvv8TdqbKzS7YgGUgxEKNMIgeBwY4FK";
                    if (zA01) {
                        z11 = true;
                    }
                }
                zArr2[i10] = z11;
                i10++;
            } else {
                A07(this.A09);
                A02();
                this.A06 = el2;
                A03();
                long jAIP = this.A07.AIP(el2.A04, this.A0D, this.A09, zArr, j10);
                A06(this.A09);
                this.A01 = false;
                for (int i11 = 0; i11 < this.A09.length; i11++) {
                    if (this.A09[i11] != null) {
                        C3M.A08(el2.A00(i11));
                        if (this.A0C[i11].A9F() != -2) {
                            this.A01 = true;
                        }
                    } else {
                        C3M.A08(el2.A04[i11] == null);
                    }
                }
                return jAIP;
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"})
    public final long A0H(boolean z10) {
        if (!z10) {
            return this.A03;
        }
        return this.A00.A03 + this.A03;
    }

    public final C6Y A0I() {
        return this.A04;
    }

    public final C2451mA A0J() {
        return this.A05;
    }

    public final EL A0K() {
        return this.A06;
    }

    public final EL A0L(float f10, Timeline timeline) throws C9Y {
        EL elA0b = this.A0B.A0b(this.A0C, A0J(), this.A00.A04, timeline);
        for (InterfaceC2424lj interfaceC2424lj : elA0b.A04) {
            if (interfaceC2424lj != null) {
                interfaceC2424lj.AEc(f10);
            }
        }
        return elA0b;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceAdapter to be replaced with MediaSourceList")
    public final void A0M() {
        A02();
        A05(this.A0A, this.A07);
    }

    public final void A0N(float f10, Timeline timeline) throws C9Y {
        this.A02 = true;
        this.A05 = this.A07.A9E();
        long jA0F = A0F(A0L(f10, timeline), this.A00.A03, false);
        this.A03 += this.A00.A03 - jA0F;
        this.A00 = this.A00.A00(jA0F);
    }

    public final void A0O(long j10) {
        C3M.A08(A08());
        this.A07.A54(A0D(j10));
    }

    public final void A0P(long j10) {
        C3M.A08(A08());
        if (this.A02) {
            this.A07.AGm(A0D(j10));
        }
    }

    public final void A0Q(C6Y c6y) {
        if (c6y == this.A04) {
            return;
        }
        A02();
        this.A04 = c6y;
        A03();
    }

    public final boolean A0R() {
        return this.A02 && (!this.A01 || this.A07.A70() == Long.MIN_VALUE);
    }
}
