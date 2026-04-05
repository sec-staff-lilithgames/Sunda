package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.mE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2454mE implements H1 {
    public static byte[] A0Y;
    public static String[] A0Z = {"85R60pw", "bhfqNyhgsMMcgxDZV18ZYvPWnAETveJ8", "tBTQ49uE8lCvjdowyQOxeOaVlddkkQsD", "cRYvTCVhA9B6pxggP4HMUODB0FrVm2He", "qWsUB7mYWdY8z", "PljQg4leV4XdGi9pMhsrxdm25IT3iHNc", "UH2NGYtrpmiPe", "fmnhpkR"};
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A08;

    @MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public Uri A0A;
    public C2614or A0B;
    public C2614or A0C;
    public C2614or A0D;
    public C9G A0E;
    public InterfaceC1131Cn A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final C9P A0T;
    public final C9U A0U;
    public final C1127Cj A0V;
    public final C1129Cl A0W = new C1129Cl();
    public int A01 = 1000;
    public int[] A0P = new int[this.A01];
    public long[] A0Q = new long[this.A01];
    public long[] A0R = new long[this.A01];
    public int[] A0N = new int[this.A01];
    public int[] A0O = new int[this.A01];
    public C1247Gz[] A0S = new C1247Gz[this.A01];
    public final D2<C1130Cm> A0X = new D2<>(new C3X() { // from class: com.facebook.ads.redexgen.X.mF
        @Override // com.facebook.ads.redexgen.core.C3X
        public final void A31(Object obj) {
            ((C1130Cm) obj).A01.AGr();
        }
    });
    public long A09 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public boolean A0L = true;
    public boolean A0M = true;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized int A03(C6N c6n, C2536nY c2536nY, boolean z10, boolean z11, C1129Cl c1129Cl) {
        c2536nY.A04 = false;
        if (!A0K()) {
            if (!z11 && !this.A0G) {
                if (this.A0D == null || (!z10 && this.A0D == this.A0B)) {
                    return -3;
                }
                A0H((C2614or) C3M.A01(this.A0D), c6n);
                return -5;
            }
            c2536nY.A02(4);
            return -4;
        }
        C2614or c2614or = this.A0X.A01(A0O()).A00;
        if (z10 || c2614or != this.A0B) {
            A0H(c2614or, c6n);
            return -5;
        }
        int iA00 = A00(this.A03);
        if (!A0L(iA00)) {
            c2536nY.A04 = true;
            return -3;
        }
        c2536nY.A02(this.A0N[iA00]);
        c2536nY.A01 = this.A0R[iA00];
        if (c2536nY.A01 < this.A09) {
            c2536nY.A00(Integer.MIN_VALUE);
        }
        c1129Cl.A00 = this.A0O[iA00];
        c1129Cl.A01 = this.A0Q[iA00];
        c1129Cl.A02 = this.A0S[iA00];
        return -4;
    }

    public static String A0C(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Y, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0Y = new byte[]{35, 74, 57, 70, 70, 61, 56, 61, 66, 59, -12, 73, 66, 57, 76, 68, 57, 55, 72, 57, 56, -12, 66, 67, 66, 1, 71, 77, 66, 55, -12, 71, 53, 65, 68, 64, 57, -12, 58, 67, 70, -12, 58, 67, 70, 65, 53, 72, 14, -12, -62, -48, -36, -33, -37, -44, -64, -28, -44, -28, -44};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A0G(long j10, int i10, long j11, int i11, C1247Gz c1247Gz) {
        if (this.A02 > 0) {
            int iA00 = A00(this.A02 - 1);
            C3M.A07(this.A0Q[iA00] + ((long) this.A0O[iA00]) <= j11);
        }
        this.A0G = (536870912 & i10) != 0;
        this.A07 = Math.max(this.A07, j10);
        int iA002 = A00(this.A02);
        this.A0R[iA002] = j10;
        this.A0Q[iA002] = j11;
        this.A0O[iA002] = i11;
        this.A0N[iA002] = i10;
        this.A0S[iA002] = c1247Gz;
        this.A0P[iA002] = this.A05;
        if (this.A0X.A06() || !this.A0X.A00().A00.equals(this.A0D)) {
            this.A0X.A05(A0P(), new C1130Cm((C2614or) C3M.A01(this.A0D), this.A0U != null ? this.A0U.AGJ(this.A0T, this.A0D) : C9T.A00));
        }
        this.A02++;
        if (this.A02 == this.A01) {
            int i12 = this.A01 + 1000;
            int[] iArr = new int[i12];
            long[] jArr = new long[i12];
            long[] jArr2 = new long[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            C1247Gz[] c1247GzArr = new C1247Gz[i12];
            int i13 = this.A01 - this.A04;
            System.arraycopy(this.A0Q, this.A04, jArr, 0, i13);
            System.arraycopy(this.A0R, this.A04, jArr2, 0, i13);
            System.arraycopy(this.A0N, this.A04, iArr2, 0, i13);
            System.arraycopy(this.A0O, this.A04, iArr3, 0, i13);
            System.arraycopy(this.A0S, this.A04, c1247GzArr, 0, i13);
            System.arraycopy(this.A0P, this.A04, iArr, 0, i13);
            int i14 = this.A04;
            System.arraycopy(this.A0Q, 0, jArr, i13, i14);
            System.arraycopy(this.A0R, 0, jArr2, i13, i14);
            System.arraycopy(this.A0N, 0, iArr2, i13, i14);
            System.arraycopy(this.A0O, 0, iArr3, i13, i14);
            System.arraycopy(this.A0S, 0, c1247GzArr, i13, i14);
            System.arraycopy(this.A0P, 0, iArr, i13, i14);
            this.A0Q = jArr;
            this.A0R = jArr2;
            this.A0N = iArr2;
            this.A0O = iArr3;
            this.A0S = c1247GzArr;
            this.A0P = iArr;
            this.A04 = 0;
            this.A01 = i12;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized long A0S() {
        return this.A02 == 0 ? Long.MIN_VALUE : this.A0R[this.A04];
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final /* synthetic */ int AI5(AnonymousClass20 anonymousClass20, int i10, boolean z10) {
        return AbstractC1246Gy.A00(this, anonymousClass20, i10, z10);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final /* synthetic */ void AI7(C4J c4j, int i10) {
        AbstractC1246Gy.A01(this, c4j, i10);
    }

    static {
        A0E();
    }

    public C2454mE(EO eo2, C9U c9u, C9P c9p) {
        this.A0U = c9u;
        this.A0T = c9p;
        this.A0V = new C1127Cj(eo2);
    }

    private int A00(int i10) {
        int i11 = this.A04 + i10;
        int relativeIndex = this.A01;
        if (i11 < relativeIndex) {
            return i11;
        }
        int relativeIndex2 = this.A01;
        return i11 - relativeIndex2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(int r6, int r7, long r8, boolean r10) {
        /*
            r5 = this;
            r4 = -1
            r3 = 0
        L2:
            if (r3 >= r7) goto L1f
            long[] r0 = r5.A0R
            r1 = r0[r6]
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L1f
            if (r10 == 0) goto L16
            int[] r0 = r5.A0N
            r0 = r0[r6]
            r0 = r0 & 1
            if (r0 == 0) goto L20
        L16:
            r4 = r3
            long[] r0 = r5.A0R
            r1 = r0[r6]
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L20
        L1f:
            return r4
        L20:
            int r6 = r6 + 1
            int r0 = r5.A01
            if (r6 != r0) goto L27
            r6 = 0
        L27:
            int r3 = r3 + 1
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2454mE.A01(int, int, long, boolean):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A02(long r6) {
        /*
            r5 = this;
            int r4 = r5.A02
            int r0 = r5.A02
            int r0 = r0 + (-1)
            int r3 = r5.A00(r0)
        La:
            int r0 = r5.A03
            if (r4 <= r0) goto L42
            long[] r0 = r5.A0R
            r1 = r0[r3]
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L42
            int r4 = r4 + (-1)
            int r3 = r3 + (-1)
            r0 = -1
            if (r3 != r0) goto La
            int r3 = r5.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2454mE.A0Z
            r0 = 5
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L38
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L38:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2454mE.A0Z
            java.lang.String r1 = "AmG8zl9kQR5zaFQB0ENdPerRnzM6g9Ua"
            r0 = 1
            r2[r0] = r1
            int r3 = r3 + (-1)
            goto La
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2454mE.A02(long):int");
    }

    private synchronized long A04() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A06(this.A02);
    }

    private final synchronized long A05() {
        return Math.max(this.A06, A08(this.A03));
    }

    private long A06(int i10) {
        this.A06 = Math.max(this.A06, A08(i10));
        this.A02 -= i10;
        this.A00 += i10;
        this.A04 += i10;
        if (this.A04 >= this.A01) {
            this.A04 -= this.A01;
        }
        this.A03 -= i10;
        if (this.A03 < 0) {
            this.A03 = 0;
        }
        this.A0X.A04(this.A00);
        if (this.A02 == 0) {
            int relativeLastDiscardIndex = this.A04 == 0 ? this.A01 : this.A04;
            int i11 = relativeLastDiscardIndex - 1;
            long j10 = this.A0Q[i11];
            int relativeLastDiscardIndex2 = this.A0O[i11];
            return j10 + relativeLastDiscardIndex2;
        }
        return this.A0Q[this.A04];
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A07(int r8) {
        /*
            r7 = this;
            int r6 = r7.A0P()
            int r6 = r6 - r8
            r4 = 0
            r5 = 1
            if (r6 < 0) goto L43
            int r1 = r7.A02
            int r0 = r7.A03
            int r1 = r1 - r0
            if (r6 > r1) goto L43
            r0 = 1
        L11:
            com.facebook.ads.redexgen.core.C3M.A07(r0)
            int r0 = r7.A02
            int r0 = r0 - r6
            r7.A02 = r0
            long r2 = r7.A06
            int r0 = r7.A02
            long r0 = r7.A08(r0)
            long r0 = java.lang.Math.max(r2, r0)
            r7.A07 = r0
            if (r6 != 0) goto L54
            boolean r3 = r7.A0G
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2454mE.A0Z
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L45
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L43:
            r0 = 0
            goto L11
        L45:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2454mE.A0Z
            java.lang.String r1 = "9q2py6RZjKVKU"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "N5i42TN5jvK54"
            r0 = 6
            r2[r0] = r1
            if (r3 == 0) goto L54
            r4 = 1
        L54:
            r7.A0G = r4
            com.facebook.ads.redexgen.X.D2<com.facebook.ads.redexgen.X.Cm> r0 = r7.A0X
            r0.A03(r8)
            int r0 = r7.A02
            if (r0 == 0) goto L71
            int r0 = r7.A02
            int r0 = r0 - r5
            int r1 = r7.A00(r0)
            long[] r0 = r7.A0Q
            r2 = r0[r1]
            int[] r0 = r7.A0O
            r0 = r0[r1]
            long r0 = (long) r0
            long r2 = r2 + r0
            return r2
        L71:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2454mE.A07(int):long");
    }

    private long A08(int i10) {
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        long jMax = Long.MIN_VALUE;
        int iA00 = A00(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.A0R[iA00]);
            int i12 = this.A0N[iA00];
            if ((i12 & 1) != 0) {
                break;
            }
            iA00--;
            if (iA00 == -1) {
                iA00 = this.A01 - 1;
            }
        }
        return jMax;
    }

    private synchronized long A09(long j10, boolean z10, boolean z11) {
        if (this.A02 != 0 && j10 >= this.A0R[this.A04]) {
            int iA01 = A01(this.A04, (!z11 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j10, z10);
            if (iA01 == -1) {
                return -1L;
            }
            return A06(iA01);
        }
        return -1L;
    }

    private final C2614or A0A(C2614or c2614or) {
        if (this.A08 != 0 && c2614or.A0M != Long.MAX_VALUE) {
            return c2614or.A07().A0s(c2614or.A0M + this.A08).A14();
        }
        return c2614or;
    }

    public static C2454mE A0B(EO eo2, C9U c9u, C9P c9p) {
        return new C2454mE(eo2, (C9U) C3M.A01(c9u), (C9P) C3M.A01(c9p));
    }

    private void A0D() {
        if (this.A0E != null) {
            this.A0E.AGs(this.A0T);
            this.A0E = null;
            this.A0B = null;
        }
    }

    private synchronized void A0F() {
        this.A03 = 0;
        this.A0V.A0B();
    }

    private void A0H(C2614or c2614or, C6N c6n) {
        C2614or c2614orA08;
        boolean z10 = this.A0B == null;
        DrmInitData newDrmInitData = z10 ? null : this.A0B.A0O;
        this.A0B = c2614or;
        DrmInitData oldDrmInitData = c2614or.A0O;
        if (this.A0U != null) {
            c2614orA08 = c2614or.A08(this.A0U.A7O(c2614or));
        } else {
            c2614orA08 = c2614or;
        }
        c6n.A00 = c2614orA08;
        c6n.A01 = this.A0E;
        if (this.A0U == null) {
            return;
        }
        if (!z10) {
            boolean zA1E = AbstractC09264a.A1E(newDrmInitData, oldDrmInitData);
            String[] strArr = A0Z;
            if (strArr[5].charAt(3) != strArr[2].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Z;
            strArr2[5] = "kvzQNhfSOapIkFZHH0bucpMR2mlOE4Ro";
            strArr2[2] = "pNWQqJuQrvmashmvXYzFnQ0x9nljUjVN";
            if (zA1E) {
                return;
            }
        }
        if (Looper.myLooper() == null) {
            return;
        }
        C9G c9g = this.A0E;
        this.A0E = this.A0U.A34(this.A0T, c2614or);
        c6n.A01 = this.A0E;
        if (c9g != null) {
            c9g.AGs(this.A0T);
        }
    }

    private final void A0J(boolean z10) {
        this.A0V.A0A();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0M = true;
        this.A09 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        this.A0G = false;
        this.A0X.A02();
        if (z10) {
            this.A0C = null;
            this.A0D = null;
            this.A0L = true;
        }
    }

    private boolean A0K() {
        return this.A03 != this.A02;
    }

    private boolean A0L(int i10) {
        return this.A0E == null || this.A0E.A92() == 4 || ((this.A0N[i10] & 1073741824) == 0 && this.A0E.AGH());
    }

    private synchronized boolean A0M(long j10) {
        boolean z10 = true;
        if (this.A02 == 0) {
            if (j10 <= this.A06) {
                z10 = false;
            }
            return z10;
        }
        if (A05() >= j10) {
            return false;
        }
        int iA02 = A02(j10);
        int retainCount = this.A00;
        A07(retainCount + iA02);
        return true;
    }

    private synchronized boolean A0N(C2614or c2614or) {
        this.A0L = false;
        if (AbstractC09264a.A1E(c2614or, this.A0D)) {
            return false;
        }
        if (!this.A0X.A06() && this.A0X.A00().A00.equals(c2614or)) {
            this.A0D = this.A0X.A00().A00;
        } else {
            this.A0D = c2614or;
        }
        this.A0J = AbstractC08812h.A0G(this.A0D.A0W, this.A0D.A0R);
        this.A0H = false;
        return true;
    }

    public final int A0O() {
        return this.A00 + this.A03;
    }

    public final int A0P() {
        return this.A00 + this.A02;
    }

    public final synchronized int A0Q(long j10, boolean z10) {
        int iA00 = A00(this.A03);
        if (A0K() && j10 >= this.A0R[iA00]) {
            if (j10 > this.A07 && z10) {
                int i10 = this.A02;
                int relativeReadIndex = this.A03;
                return i10 - relativeReadIndex;
            }
            int i11 = this.A02;
            int relativeReadIndex2 = this.A03;
            int offset = A01(iA00, i11 - relativeReadIndex2, j10, true);
            if (offset == -1) {
                return 0;
            }
            return offset;
        }
        return 0;
    }

    public final int A0R(C6N c6n, C2536nY c2536nY, int i10, boolean z10) {
        int iA03 = A03(c6n, c2536nY, (i10 & 2) != 0, z10, this.A0W);
        if (iA03 == -4 && !c2536nY.A05()) {
            int result = i10 & 1;
            boolean z11 = result != 0;
            int result2 = i10 & 4;
            if (result2 == 0) {
                if (z11) {
                    this.A0V.A0E(c2536nY, this.A0W);
                } else {
                    this.A0V.A0F(c2536nY, this.A0W);
                }
            }
            if (!z11) {
                int result3 = this.A03;
                this.A03 = result3 + 1;
            }
        }
        return iA03;
    }

    public final synchronized long A0T() {
        return this.A07;
    }

    public final synchronized C2614or A0U() {
        return this.A0L ? null : this.A0D;
    }

    public final void A0V() {
        this.A0V.A0C(A04());
    }

    public final void A0W() throws IOException {
        if (this.A0E == null || this.A0E.A92() != 1) {
        } else {
            throw ((C9E) C3M.A01(this.A0E.A7s()));
        }
    }

    public final void A0X() {
        A0V();
        A0D();
    }

    public final void A0Y() {
        A0J(true);
        A0D();
    }

    public final void A0Z() {
        A0J(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0a(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Lc
            int r1 = r2.A03     // Catch: java.lang.Throwable -> L17
            int r1 = r1 + r3
            int r0 = r2.A02     // Catch: java.lang.Throwable -> L17
            if (r1 > r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.facebook.ads.redexgen.core.C3M.A07(r0)     // Catch: java.lang.Throwable -> L17
            int r0 = r2.A03     // Catch: java.lang.Throwable -> L17
            int r0 = r0 + r3
            r2.A03 = r0     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return
        L17:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2454mE.A0a(int):void");
    }

    public final void A0b(long j10) {
        this.A09 = j10;
    }

    public final void A0c(long j10, boolean z10, boolean z11) {
        this.A0V.A0C(A09(j10, z10, z11));
    }

    public final void A0d(InterfaceC1131Cn interfaceC1131Cn) {
        this.A0F = interfaceC1131Cn;
    }

    public final synchronized boolean A0e() {
        return this.A0G;
    }

    public final synchronized boolean A0f(long j10, boolean z10) {
        A0F();
        int iA00 = A00(this.A03);
        if (!A0K() || j10 < this.A0R[iA00] || (j10 > this.A07 && !z10)) {
            return false;
        }
        int i10 = this.A02;
        int relativeReadIndex = this.A03;
        int offset = A01(iA00, i10 - relativeReadIndex, j10, true);
        if (offset == -1) {
            return false;
        }
        this.A09 = j10;
        int relativeReadIndex2 = this.A03;
        this.A03 = relativeReadIndex2 + offset;
        return true;
    }

    public final synchronized boolean A0g(boolean z10) {
        boolean z11 = true;
        if (!A0K()) {
            if (!z10 && !this.A0G && (this.A0D == null || this.A0D == this.A0B)) {
                z11 = false;
            }
            return z11;
        }
        if (this.A0X.A01(A0O()).A00 != this.A0B) {
            return true;
        }
        return A0L(A00(this.A03));
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void A6W(C2614or c2614or) {
        C2614or c2614orA0A = A0A(c2614or);
        this.A0K = false;
        this.A0C = c2614or;
        boolean upstreamFormatChanged = A0N(c2614orA0A);
        if (this.A0F != null && upstreamFormatChanged) {
            this.A0F.AFb(c2614orA0A);
        }
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final int AI6(AnonymousClass20 anonymousClass20, int i10, boolean z10, int i11) throws IOException {
        return this.A0V.A08(anonymousClass20, i10, z10);
    }

    @Override // com.facebook.ads.redexgen.core.H1
    public final void AI8(C4J c4j, int i10, int i11) {
        this.A0V.A0D(c4j, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    @Override // com.facebook.ads.redexgen.core.H1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AIA(long r16, int r18, int r19, int r20, com.facebook.ads.redexgen.core.C1247Gz r21) {
        /*
            r15 = this;
            r10 = r18
            r8 = r16
            r5 = r15
            boolean r0 = r5.A0K
            if (r0 == 0) goto L14
            com.facebook.ads.redexgen.X.or r0 = r5.A0C
            java.lang.Object r0 = com.facebook.ads.redexgen.core.C3M.A02(r0)
            com.facebook.ads.redexgen.X.or r0 = (com.facebook.ads.redexgen.core.C2614or) r0
            r5.A6W(r0)
        L14:
            r0 = r10 & 1
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L22
            r7 = 1
        L1b:
            boolean r0 = r5.A0M
            if (r0 == 0) goto L26
            if (r7 != 0) goto L24
            return
        L22:
            r7 = 0
            goto L1b
        L24:
            r5.A0M = r4
        L26:
            long r0 = r5.A08
            long r8 = r8 + r0
            boolean r0 = r5.A0J
            if (r0 == 0) goto L69
            long r0 = r5.A09
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L34
            return
        L34:
            r0 = r10 & 1
            if (r0 != 0) goto L69
            boolean r0 = r5.A0H
            if (r0 != 0) goto L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
            r1 = 50
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r0 = A0C(r2, r1, r0)
            java.lang.StringBuilder r1 = r3.append(r0)
            com.facebook.ads.redexgen.X.or r0 = r5.A0D
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r3 = r0.toString()
            r2 = 50
            r1 = 11
            r0 = 13
            java.lang.String r0 = A0C(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A07(r0, r3)
            r5.A0H = r6
        L67:
            r10 = r10 | 1
        L69:
            boolean r0 = r5.A0I
            if (r0 == 0) goto L97
            if (r7 == 0) goto L94
            boolean r3 = r5.A0M(r8)
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2454mE.A0Z
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L8b
        L85:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L8b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2454mE.A0Z
            java.lang.String r1 = "Q9ljdKDjpshc47nqlMYBFO0YDotnOqX8"
            r0 = 3
            r2[r0] = r1
            if (r3 != 0) goto L95
        L94:
            return
        L95:
            r5.A0I = r4
        L97:
            com.facebook.ads.redexgen.X.Cj r0 = r5.A0V
            long r11 = r0.A09()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2454mE.A0Z
            r0 = 1
            r1 = r1[r0]
            r0 = 24
            char r1 = r1.charAt(r0)
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto Lad
            goto L85
        Lad:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2454mE.A0Z
            java.lang.String r1 = "281h4YOhy96mUgaRFHojQOWi7hgLUzVm"
            r0 = 3
            r2[r0] = r1
            r13 = r19
            long r0 = (long) r13
            long r11 = r11 - r0
            r0 = r20
            long r0 = (long) r0
            long r11 = r11 - r0
            r7 = r15
            r14 = r21
            r7.A0G(r8, r10, r11, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2454mE.AIA(long, int, int, int, com.facebook.ads.redexgen.X.Gz):void");
    }

    @Override // com.facebook.ads.redexgen.core.H1
    @MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public final void AJu(Uri uri) {
        this.A0A = uri;
    }
}
