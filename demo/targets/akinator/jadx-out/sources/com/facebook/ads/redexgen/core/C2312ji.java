package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.ji, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2312ji implements InterfaceC1330Kf {
    public static byte[] A0C;
    public static String[] A0D = {"PKE6bUnMb8YRJi5c3EKctidvnGObkWUW", "Sj6HMP0SOTonM2", "QNuElofm8mn1vxmEMVf480D516cE6c1A", "mo3DY2i4ZftrkN8KZEKpxWPbRUkrlx1j", "gCiGT026Vp", "", "zTp2xHG3y1GADYyWqYlevGmnNqTbrtlk", "l459osJydpsPWra20sllrfS"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C4R A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final KJ A0B;
    public final C4I A0A = new C4I(new byte[10]);
    public int A03 = 0;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-23, 54, 56, 59, 46, -23, 43, 66, 61, 46, 60, 49, 90, 96, 89, 79, 11, 89, 80, 82, 76, 95, 84, 97, 80, 11, 91, 76, 78, 86, 80, 95, 11, 91, 76, 100, 87, 90, 76, 79, 11, 94, 84, 101, 80, 37, 11, 36, 57, 71, 38, 57, 53, 56, 57, 70, -7, 18, 9, 28, 20, 9, 7, 24, 9, 8, -60, 23, 24, 5, 22, 24, -60, 7, 19, 8, 9, -60, 20, 22, 9, 10, 13, 28, -34, -60, 11, 36, 27, 46, 38, 27, 25, 42, 27, 26, -42, 41, 42, 23, 40, 42, -42, 31, 36, 26, 31, 25, 23, 42, 37, 40, -42, 40, 27, 23, 26, 31, 36, 29, -42, 27, 46, 42, 27, 36, 26, 27, 26, -42, 30, 27, 23, 26, 27, 40, 4, 29, 20, 39, 31, 20, 18, 35, 20, 19, -49, 34, 35, 16, 33, 35, -49, 24, 29, 19, 24, 18, 16, 35, 30, 33, -23, -49, 20, 39, 31, 20, 18, 35, 20, 19, -49};
    }

    static {
        A02();
    }

    public C2312ji(KJ kj2) {
        this.A0B = kj2;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void A01() {
        this.A0A.A08(0);
        this.A04 = C.TIME_UNSET;
        if (this.A08) {
            this.A0A.A09(4);
            this.A0A.A09(1);
            long pts = this.A0A.A04(15) << 15;
            long jA04 = (this.A0A.A04(3) << 30) | pts;
            this.A0A.A09(1);
            long pts2 = this.A0A.A04(15);
            long j10 = jA04 | pts2;
            this.A0A.A09(1);
            if (!this.A09 && this.A07) {
                this.A0A.A09(4);
                long pts3 = this.A0A.A04(3);
                this.A0A.A09(1);
                this.A0A.A09(1);
                this.A0A.A09(1);
                this.A05.A06((pts3 << 30) | (this.A0A.A04(15) << 15) | this.A0A.A04(15));
                this.A09 = true;
            }
            this.A04 = this.A05.A06(j10);
        }
    }

    private void A03(int i10) {
        this.A03 = i10;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0A.A08(0);
        int iA04 = this.A0A.A04(24);
        String strA00 = A00(47, 9, 94);
        if (iA04 != 1) {
            AnonymousClass44.A07(strA00, A00(56, 30, 46) + iA04);
            this.A02 = -1;
            return false;
        }
        this.A0A.A09(8);
        int iA042 = this.A0A.A04(16);
        this.A0A.A09(5);
        this.A06 = this.A0A.A0H();
        this.A0A.A09(2);
        this.A08 = this.A0A.A0H();
        this.A07 = this.A0A.A0H();
        this.A0A.A09(6);
        int startCodePrefix = this.A0A.A04(8);
        this.A01 = startCodePrefix;
        if (iA042 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix2 = iA042 + 6;
            int packetLength = startCodePrefix2 - 9;
            int startCodePrefix3 = this.A01;
            this.A02 = packetLength - startCodePrefix3;
            int startCodePrefix4 = this.A02;
            if (startCodePrefix4 < 0) {
                StringBuilder sbAppend = new StringBuilder().append(A00(11, 36, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
                int startCodePrefix5 = this.A02;
                AnonymousClass44.A07(strA00, sbAppend.append(startCodePrefix5).toString());
                this.A02 = -1;
            }
        }
        return true;
    }

    private boolean A05(C4J c4j, byte[] bArr, int i10) {
        int iMin = Math.min(c4j.A07(), i10 - this.A00);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c4j.A0g(iMin);
        } else {
            int bytesToRead = this.A00;
            c4j.A0k(bArr, bytesToRead, iMin);
        }
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1330Kf
    public final void A53(C4J c4j, int i10) throws C08822i {
        C3M.A02(this.A05);
        if ((i10 & 1) != 0) {
            int i11 = this.A03;
            String strA00 = A00(47, 9, 94);
            switch (i11) {
                case 0:
                case 1:
                    A03(1);
                    break;
                case 2:
                    AnonymousClass44.A07(strA00, A00(86, 50, 64));
                    A03(1);
                    break;
                case 3:
                    if (this.A02 != -1) {
                        AnonymousClass44.A07(strA00, A00(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 37, 57) + this.A02 + A00(0, 11, 83));
                    }
                    this.A0B.AG5();
                    A03(1);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
        while (c4j.A07() > 0) {
            switch (this.A03) {
                case 0:
                    c4j.A0g(c4j.A07());
                case 1:
                    if (A05(c4j, this.A0A.A00, 9)) {
                        boolean zA04 = A04();
                        if (A0D[5].length() == 12) {
                            break;
                        } else {
                            A0D[6] = "QQT4Wvnf7PZI1aBOQkpVRuEJ9a4y7TW0";
                            A03(zA04 ? 2 : 0);
                        }
                    } else {
                        continue;
                    }
                case 2:
                    int iMin = Math.min(10, this.A01);
                    byte[] bArr = this.A0A.A00;
                    if (A0D[1].length() != 20) {
                        A0D[4] = "l8YJPAfB3X";
                        if (A05(c4j, bArr, iMin) && A05(c4j, null, this.A01)) {
                            A01();
                            i10 |= this.A06 ? 4 : 0;
                            this.A0B.AG6(this.A04, i10);
                            A03(3);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                    break;
                case 3:
                    int iA07 = c4j.A07();
                    int readLength = this.A02;
                    if (readLength != -1) {
                        int readLength2 = this.A02;
                        i = iA07 - readLength2;
                    }
                    if (i > 0) {
                        iA07 -= i;
                        int iA09 = c4j.A09() + iA07;
                        if (A0D[6].charAt(7) == '6') {
                            break;
                        } else {
                            A0D[2] = "lFx9fkjTnk1xSHr5wh3B5PMDNRGZ6lqn";
                            c4j.A0e(iA09);
                        }
                    }
                    this.A0B.A52(c4j);
                    int readLength3 = this.A02;
                    if (readLength3 != -1) {
                        int readLength4 = this.A02;
                        this.A02 = readLength4 - iA07;
                        int readLength5 = this.A02;
                        if (readLength5 == 0) {
                            this.A0B.AG5();
                            A03(1);
                        }
                    }
                default:
                    throw new IllegalStateException();
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1330Kf
    public final void AA2(C4R c4r, GY gy, C1329Ke c1329Ke) {
        this.A05 = c4r;
        this.A0B.A5U(gy, c1329Ke);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1330Kf
    public final void AIL() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0B.AIL();
    }
}
