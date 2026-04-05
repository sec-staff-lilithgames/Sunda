package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.jl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2315jl implements KJ {
    public static byte[] A0L;
    public static String[] A0M = {"j9JFF3HN4WHOogTAo3Zp2vJcrDXalLKC", "xTu", "o", "YpEMu", "L", "xqkbJV3NP5tWtCpR6dlW7fuQWbu0Okpq", "9ZwPJyvjhOXD2", "3pAsgJTRE4XOqhE7"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public C2614or A0C;
    public H1 A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public final String A0K;
    public final C4J A0J = new C4J(1024);
    public final C4I A0I = new C4I(this.A0J.A0l());
    public long A0B = C.TIME_UNSET;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0M;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0M[5] = "ZyB29Ut14cj6jISqnQaPpNUB2bA7E60q";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 57);
            i13++;
        }
    }

    public static void A04() {
        A0L = new byte[]{3, 23, 6, 11, 13, 77, 15, 18, 86, 3, 79, 14, 3, 22, 15};
    }

    static {
        A04();
    }

    public C2315jl(String str) {
        this.A0K = str;
    }

    private int A00(C4I c4i) throws C08822i {
        int iA01 = c4i.A01();
        GA config = GB.A02(c4i, true);
        this.A0E = config.A02;
        int bitsLeft = config.A01;
        this.A05 = bitsLeft;
        int bitsLeft2 = config.A00;
        this.A02 = bitsLeft2;
        int bitsLeft3 = c4i.A01();
        return iA01 - bitsLeft3;
    }

    private int A01(C4I c4i) throws C08822i {
        int tmp;
        int i10 = 0;
        int muxSlotLengthBytes = this.A03;
        if (muxSlotLengthBytes == 0) {
            do {
                tmp = c4i.A04(8);
                i10 += tmp;
            } while (tmp == 255);
            return i10;
        }
        throw C08822i.A01(null, null);
    }

    public static long A02(C4I c4i) {
        int bytesForValue = c4i.A04(2);
        return c4i.A04((bytesForValue + 1) * 8);
    }

    private void A05(int i10) {
        this.A0J.A0d(i10);
        this.A0I.A0D(this.A0J.A0l());
    }

    @RequiresNonNull({"output"})
    private void A06(C4I c4i) throws C08822i {
        boolean useSameStreamMux = c4i.A0H();
        if (!useSameStreamMux) {
            this.A0H = true;
            A08(c4i);
        } else {
            boolean useSameStreamMux2 = this.A0H;
            if (!useSameStreamMux2) {
                return;
            }
        }
        if (this.A00 == 0) {
            if (this.A04 == 0) {
                A09(c4i, A01(c4i));
                boolean useSameStreamMux3 = this.A0G;
                if (useSameStreamMux3) {
                    c4i.A09((int) this.A09);
                    return;
                }
                return;
            }
            throw C08822i.A01(null, null);
        }
        throw C08822i.A01(null, null);
    }

    private void A07(C4I c4i) {
        this.A03 = c4i.A04(3);
        switch (this.A03) {
            case 0:
                c4i.A09(8);
                return;
            case 1:
                c4i.A09(9);
                return;
            case 2:
            default:
                throw new IllegalStateException();
            case 3:
            case 4:
            case 5:
                c4i.A09(6);
                return;
            case 6:
            case 7:
                c4i.A09(1);
                return;
        }
    }

    @RequiresNonNull({"output"})
    private void A08(C4I c4i) throws C08822i {
        int iA04;
        boolean zA0H;
        int iA042 = c4i.A04(1);
        if (iA042 == 1) {
            iA04 = c4i.A04(1);
        } else {
            iA04 = 0;
        }
        this.A00 = iA04;
        if (this.A00 == 0) {
            if (iA042 == 1) {
                A02(c4i);
            }
            if (c4i.A0H()) {
                this.A04 = c4i.A04(6);
                int iA043 = c4i.A04(4);
                int audioMuxVersion = A0M[5].charAt(25);
                if (audioMuxVersion != 98) {
                    throw new RuntimeException();
                }
                A0M[5] = "b1jqAFGEyfNrz2WgotNy1OFmmbCQivCc";
                int iA044 = c4i.A04(3);
                if (iA043 == 0 && iA044 == 0) {
                    if (iA042 == 0) {
                        int iA03 = c4i.A03();
                        int audioMuxVersion2 = A00(c4i);
                        c4i.A08(iA03);
                        byte[] bArr = new byte[(audioMuxVersion2 + 7) / 8];
                        c4i.A0F(bArr, 0, audioMuxVersion2);
                        C2614or c2614orA14 = new C2D().A0y(this.A0F).A11(A03(0, 15, 91)).A0w(this.A0E).A0b(this.A02).A0m(this.A05).A12(Collections.singletonList(bArr)).A10(this.A0K).A14();
                        if (!c2614orA14.equals(this.A0C)) {
                            this.A0C = c2614orA14;
                            this.A0A = 1024000000 / c2614orA14.A0G;
                            this.A0D.A6W(c2614orA14);
                        }
                    } else {
                        int audioMuxVersion3 = (int) A02(c4i);
                        c4i.A09(audioMuxVersion3 - A00(c4i));
                    }
                    A07(c4i);
                    this.A0G = c4i.A0H();
                    this.A09 = 0L;
                    if (this.A0G) {
                        if (iA042 == 1) {
                            this.A09 = A02(c4i);
                        } else {
                            do {
                                zA0H = c4i.A0H();
                                this.A09 = (this.A09 << 8) + c4i.A04(8);
                            } while (zA0H);
                        }
                    }
                    boolean crcCheckPresent = c4i.A0H();
                    if (crcCheckPresent) {
                        c4i.A09(8);
                        return;
                    }
                    return;
                }
                throw C08822i.A01(null, null);
            }
            throw C08822i.A01(null, null);
        }
        throw C08822i.A01(null, null);
    }

    @RequiresNonNull({"output"})
    private void A09(C4I c4i, int i10) {
        int iA03 = c4i.A03();
        int bitPosition = iA03 & 7;
        if (bitPosition == 0) {
            int bitPosition2 = iA03 >> 3;
            this.A0J.A0f(bitPosition2);
        } else {
            int bitPosition3 = i10 * 8;
            c4i.A0F(this.A0J.A0l(), 0, bitPosition3);
            this.A0J.A0f(0);
        }
        this.A0D.AI7(this.A0J, i10);
        if (this.A0B != C.TIME_UNSET) {
            this.A0D.AIA(this.A0B, 1, i10, 0, null);
            this.A0B += this.A0A;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) throws C08822i {
        C3M.A02(this.A0D);
        while (c4j.A07() > 0) {
            switch (this.A08) {
                case 0:
                    int secondByte = c4j.A0I();
                    if (secondByte != 86) {
                        break;
                    } else {
                        this.A08 = 1;
                        break;
                    }
                case 1:
                    int iA0I = c4j.A0I();
                    if ((iA0I & 224) == 224) {
                        this.A07 = iA0I;
                        this.A08 = 2;
                        break;
                    } else if (iA0I == 86) {
                        break;
                    } else {
                        this.A08 = 0;
                        break;
                    }
                case 2:
                    int bytesToRead = this.A07;
                    this.A06 = ((bytesToRead & (-225)) << 8) | c4j.A0I();
                    if (this.A06 > this.A0J.A0l().length) {
                        A05(this.A06);
                    }
                    this.A01 = 0;
                    this.A08 = 3;
                    break;
                case 3:
                    int iMin = Math.min(c4j.A07(), this.A06 - this.A01);
                    byte[] bArr = this.A0I.A00;
                    int bytesToRead2 = this.A01;
                    c4j.A0k(bArr, bytesToRead2, iMin);
                    int bytesToRead3 = this.A01;
                    this.A01 = bytesToRead3 + iMin;
                    int i10 = this.A01;
                    int bytesToRead4 = this.A06;
                    if (i10 != bytesToRead4) {
                        break;
                    } else {
                        this.A0I.A08(0);
                        A06(this.A0I);
                        this.A08 = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1329Ke c1329Ke) {
        c1329Ke.A05();
        this.A0D = gy.AJh(c1329Ke.A03(), 1);
        this.A0F = c1329Ke.A04();
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.A0B = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        this.A08 = 0;
        this.A0B = C.TIME_UNSET;
        this.A0H = false;
    }
}
