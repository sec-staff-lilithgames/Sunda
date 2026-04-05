package com.facebook.ads.redexgen.core;

import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.ju, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2324ju implements KJ {
    public static byte[] A0L;
    public static String[] A0M = {"mrTKvxULVENuxsX20WcrAJ4v", "LussONYVy0olIUlKNuZbFssmQ2DfHEVf", "zvJRCSTXMBsZ1hE0Mr7ze3FhUb04dJIh", "L0YacQwQPMjWe9KaI5mJ2LmFBjZFt0ZK", "1hx48ZBneHnM7bdYLzCUfsF2U1nSOVt0", "UVBTZnk6apz1fVZpxMzmfRHtaRIycLGw", "Y7M7p8C63xXJXfMDaPj4j21Etz7HrkAn", "dpgmp2dWdChOdFvADkjRIu4gRUIL2TAI"};
    public static final byte[] A0N;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public H1 A0A;
    public H1 A0B;
    public H1 A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C4I A0H;
    public final C4J A0I;
    public final String A0J;
    public final boolean A0K;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0L = new byte[]{99, 87, -103, -84, -85, 87, -104, -86, -86, -84, -92, -96, -91, -98, 87, 120, 120, 122, 87, -125, 122, 101, -98, -63, -47, -48, -81, -62, -66, -63, -62, -49, 77, 110, 125, 110, 108, 125, 110, 109, 41, 106, 126, 109, 114, 120, 41, 120, 107, 115, 110, 108, 125, 41, 125, -126, 121, 110, 67, 41, -47, -32, -32, -36, -39, -45, -47, -28, -39, -33, -34, -97, -39, -44, -93, -74, -54, -71, -66, -60, -124, -62, -59, -119, -74, -126, -63, -74, -55, -62};
    }

    static {
        A09();
        A0N = new byte[]{73, 68, 51};
    }

    public C2324ju(boolean z10) {
        this(z10, null);
    }

    public C2324ju(boolean z10, String str) {
        this.A0H = new C4I(new byte[7]);
        this.A0I = new C4J(Arrays.copyOf(A0N, 10));
        A06();
        this.A03 = -1;
        this.A02 = -1;
        this.A08 = C.TIME_UNSET;
        this.A09 = C.TIME_UNSET;
        this.A0K = z10;
        this.A0J = str;
    }

    @EnsuresNonNull({"output", "currentOutput", "id3Output"})
    private void A01() {
        C3M.A01(this.A0C);
    }

    @RequiresNonNull({"output"})
    private void A02() throws C08822i {
        this.A0H.A08(0);
        if (!this.A0G) {
            int iA04 = this.A0H.A04(2) + 1;
            if (iA04 != 2) {
                AnonymousClass44.A07(A00(22, 10, 84), A00(32, 28, 0) + iA04 + A00(0, 22, 46));
                iA04 = 2;
            }
            this.A0H.A09(5);
            int iA042 = this.A0H.A04(3);
            int audioObjectType = this.A02;
            byte[] bArrA07 = GB.A07(iA04, audioObjectType, iA042);
            GA aacConfig = GB.A03(bArrA07);
            C2D c2dA0w = new C2D().A0y(this.A0D).A11(A00(75, 15, 76)).A0w(aacConfig.A02);
            int audioObjectType2 = aacConfig.A00;
            C2D c2dA0b = c2dA0w.A0b(audioObjectType2);
            int audioObjectType3 = aacConfig.A01;
            C2614or c2614orA14 = c2dA0b.A0m(audioObjectType3).A12(Collections.singletonList(bArrA07)).A10(this.A0J).A14();
            int audioObjectType4 = c2614orA14.A0G;
            this.A08 = 1024000000 / audioObjectType4;
            this.A0C.A6W(c2614orA14);
            this.A0G = true;
        } else {
            this.A0H.A09(10);
        }
        this.A0H.A09(4);
        int iA043 = (this.A0H.A04(13) - 2) - 5;
        boolean z10 = this.A0F;
        String[] strArr = A0M;
        String str = strArr[5];
        String str2 = strArr[1];
        int iCharAt = str.charAt(31);
        int sampleSize = str2.charAt(31);
        if (iCharAt == sampleSize) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[5] = "giOljvViomSrN4IHC4QybJTR7ABLuXqE";
        strArr2[1] = "jFLriiyuw9puslkouPTFj8AuXirD2Rvz";
        if (z10) {
            iA043 -= 2;
        }
        A0D(this.A0C, this.A08, 0, iA043);
    }

    @RequiresNonNull({"id3Output"})
    private void A03() {
        this.A0B.AI7(this.A0I, 10);
        this.A0I.A0f(6);
        A0D(this.A0B, 0L, 10, this.A0I.A0H() + 10);
    }

    private void A04() {
        this.A0E = false;
        A06();
    }

    private void A05() {
        this.A06 = 1;
        this.A00 = 0;
    }

    private void A06() {
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    private void A07() {
        this.A06 = 3;
        this.A00 = 0;
    }

    private void A08() {
        this.A06 = 2;
        this.A00 = A0N.length;
        this.A05 = 0;
        this.A0I.A0f(0);
    }

    private void A0A(C4J c4j) {
        if (c4j.A07() == 0) {
            return;
        }
        this.A0H.A00[0] = c4j.A0l()[c4j.A09()];
        this.A0H.A08(2);
        int iA04 = this.A0H.A04(4);
        if (this.A02 != -1) {
            int i10 = this.A02;
            String[] strArr = A0M;
            String str = strArr[5];
            String str2 = strArr[1];
            int iCharAt = str.charAt(31);
            int currentFrameSampleRateIndex = str2.charAt(31);
            if (iCharAt == currentFrameSampleRateIndex) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[2] = "gsvCXwBusIGEB1WA3fanWinNUC0stLKn";
            strArr2[4] = "jdr5Xoms36XQNA1pdvYLzBfLUyE1GaLW";
            if (iA04 != i10) {
                A04();
                return;
            }
        }
        if (!this.A0E) {
            this.A0E = true;
            int currentFrameSampleRateIndex2 = this.A01;
            this.A03 = currentFrameSampleRateIndex2;
            this.A02 = iA04;
        }
        A07();
    }

    private void A0B(C4J c4j) {
        byte[] bArrA0l = c4j.A0l();
        int iA09 = c4j.A09();
        int iA0A = c4j.A0A();
        while (iA09 < iA0A) {
            int endOffset = iA09 + 1;
            int i10 = bArrA0l[iA09] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (this.A04 == 512 && A0E((byte) -1, (byte) i10) && (this.A0E || A0G(c4j, endOffset - 2))) {
                this.A01 = (i10 & 8) >> 3;
                this.A0F = (i10 & 1) == 0;
                if (!this.A0E) {
                    A05();
                } else {
                    A07();
                }
                c4j.A0f(endOffset);
                return;
            }
            switch (this.A04 | i10) {
                case 329:
                    this.A04 = 768;
                    iA09 = endOffset;
                case EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE:
                    this.A04 = 512;
                    iA09 = endOffset;
                case 836:
                    this.A04 = 1024;
                    iA09 = endOffset;
                case 1075:
                    A08();
                    c4j.A0f(endOffset);
                    return;
                default:
                    int data = this.A04;
                    if (data != 256) {
                        this.A04 = NotificationCompat.FLAG_LOCAL_ONLY;
                        iA09 = endOffset - 1;
                        int data2 = A0M[3].charAt(30);
                        if (data2 == 52) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0M;
                        strArr[5] = "GFWHNKn9X7s15i1eiUIDtSq2eHiOoz5U";
                        strArr[1] = "NE8NIWAGBkU3RGGIPZnBOUiADBs4e2Uh";
                    } else {
                        iA09 = endOffset;
                    }
            }
        }
        c4j.A0f(iA09);
    }

    @RequiresNonNull({"currentOutput"})
    private void A0C(C4J c4j) {
        int iMin = Math.min(c4j.A07(), this.A05 - this.A00);
        this.A0A.AI7(c4j, iMin);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + iMin;
        int i10 = this.A00;
        int bytesToRead2 = this.A05;
        if (i10 == bytesToRead2) {
            if (this.A09 != C.TIME_UNSET) {
                this.A0A.AIA(this.A09, 1, this.A05, 0, null);
                this.A09 += this.A07;
            }
            A06();
        }
    }

    private void A0D(H1 h12, long j10, int i10, int i11) {
        this.A06 = 4;
        this.A00 = i10;
        this.A0A = h12;
        this.A07 = j10;
        this.A05 = i11;
    }

    private boolean A0E(byte b10, byte b11) {
        return A0F(((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public static boolean A0F(int i10) {
        return (65526 & i10) == 65520;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0G(com.facebook.ads.redexgen.core.C4J r11, int r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2324ju.A0G(com.facebook.ads.redexgen.X.4J, int):boolean");
    }

    private boolean A0H(C4J c4j, byte[] bArr, int i10) {
        int iMin = Math.min(c4j.A07(), i10 - this.A00);
        int bytesToRead = this.A00;
        c4j.A0k(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i10;
    }

    private boolean A0I(C4J c4j, byte[] bArr, int i10) {
        if (c4j.A07() < i10) {
            return false;
        }
        c4j.A0k(bArr, 0, i10);
        return true;
    }

    public final long A0J() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) throws C08822i {
        A01();
        while (c4j.A07() > 0) {
            switch (this.A06) {
                case 0:
                    A0B(c4j);
                    break;
                case 1:
                    A0A(c4j);
                    break;
                case 2:
                    if (!A0H(c4j, this.A0I.A0l(), 10)) {
                        break;
                    } else {
                        A03();
                        break;
                    }
                case 3:
                    if (!A0H(c4j, this.A0H.A00, this.A0F ? 7 : 5)) {
                        break;
                    } else {
                        A02();
                        break;
                    }
                case 4:
                    A0C(c4j);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1329Ke c1329Ke) {
        c1329Ke.A05();
        this.A0D = c1329Ke.A04();
        this.A0C = gy.AJh(c1329Ke.A03(), 1);
        this.A0A = this.A0C;
        if (this.A0K) {
            c1329Ke.A05();
            this.A0B = gy.AJh(c1329Ke.A03(), 5);
            this.A0B.A6W(new C2D().A0y(c1329Ke.A04()).A11(A00(60, 15, 103)).A14());
            return;
        }
        this.A0B = new C2404lO();
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.A09 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        this.A09 = C.TIME_UNSET;
        A04();
    }
}
