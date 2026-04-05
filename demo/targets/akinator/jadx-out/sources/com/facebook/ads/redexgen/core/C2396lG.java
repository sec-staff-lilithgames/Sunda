package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.applovin.shadow.okio.Utf8;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2396lG implements GX {
    public static byte[] A0F;
    public static String[] A0G = {"nCYubXqvd8ypcUhOSOVlYAWiNtNg5aTx", "kK9obhnzrC8LOV4nIDjH0fRMkLxjM4hw", "y066yKC5U0", "cE1K3Th7x6hTx4uAy2DDcaRqLgqPomcW", "7FhRQrMCUcKubfGBASNqeIg", "2Nytx4SBEfNcp68myMLwYRuSH7vsFm1u", "ZlttTssTlgjvAvH32uYzHDtT6TE9W794", "80ncat3y6qUdob6xQVasiz6qbkfE4w7J"};
    public static final InterfaceC1223Gb A0H;
    public static final int A0I;
    public static final byte[] A0J;
    public static final byte[] A0K;
    public static final int[] A0L;
    public static final int[] A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public GY A07;
    public InterfaceC1244Gw A08;
    public H1 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final byte[] A0E;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0F = new byte[]{-115, -45, -33, -50, -38, -46, -115, -31, -26, -35, -46, -115, -120, -122, -90, -78, -73, 111, -53, -55, -23, -11, -6, -43, -1, -22, -78, -15, 29, 35, 26, 18, -50, 28, 29, 34, -50, 20, 23, 28, 18, -50, -17, -5, 0, -50, 22, 19, 15, 18, 19, 32, -36, 28, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 56, 58, 52, Utf8.REPLACEMENT_BYTE, -13, 20, 32, 37, -13, 23, 60, 68, 47, 58, 55, 50, -18, 62, 47, 50, 50, 55, 60, 53, -18, 48, 55, 66, 65, -18, 52, 61, 64, -18, 52, 64, 47, 59, 51, -18, 54, 51, 47, 50, 51, 64, -18, -40, -52, -35, -56, -26, -6, -23, -18, -12, -76, -72, -20, -11, -11, -46, -26, -43, -38, -32, -96, -46, -34, -29, -98, -24, -45};
    }

    static {
        A08();
        A0H = new InterfaceC1223Gb() { // from class: com.facebook.ads.redexgen.X.lH
            @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
            public final GX[] A5F() {
                return C2396lG.A0F();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC1222Ga.A01(this, uri, map);
            }
        };
        A0L = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        A0M = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0J = AbstractC09264a.A1G(A05(12, 6, 14));
        A0K = AbstractC09264a.A1G(A05(18, 9, 81));
        A0I = A0M[8];
    }

    public C2396lG() {
        this(0);
    }

    public C2396lG(int i10) {
        this.A0D = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.A0E = new byte[1];
        this.A02 = -1;
    }

    private int A00(int i10) throws C08822i {
        if (!A0B(i10)) {
            throw C08822i.A01(A05(53, 12, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) + (this.A0C ? A05(105, 2, 47) : A05(103, 2, 51)) + A05(0, 12, 22) + i10, null);
        }
        boolean z10 = this.A0C;
        if (A0G[4].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "XAVUjCRC3hebivW774juK0oqwk2i4xqh";
        strArr[7] = "ZJ3GnAAJbhmZqGnHED8y3IWqixRJo44l";
        return z10 ? A0M[i10] : A0L[i10];
    }

    public static int A01(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private int A02(InterfaceC2403lN interfaceC2403lN) throws IOException {
        interfaceC2403lN.AI1();
        interfaceC2403lN.AG9(this.A0E, 0, 1);
        byte b10 = this.A0E[0];
        if ((b10 & 131) <= 0) {
            return A00((b10 >> 3) & 15);
        }
        throw C08822i.A01(A05(65, 38, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) + ((int) b10), null);
    }

    @RequiresNonNull({"trackOutput"})
    private int A03(InterfaceC2403lN interfaceC2403lN) throws IOException {
        if (this.A00 == 0) {
            try {
                this.A01 = A02(interfaceC2403lN);
                this.A00 = this.A01;
                if (this.A02 == -1) {
                    this.A05 = interfaceC2403lN.A8f();
                    this.A02 = this.A01;
                }
                if (this.A02 == this.A01) {
                    this.A03++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iAI5 = this.A09.AI5(interfaceC2403lN, this.A00, true);
        if (iAI5 == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - iAI5;
        if (A0G[5].charAt(6) != 'S') {
            throw new RuntimeException();
        }
        A0G[4] = "CzfhB3PuIPzemLKFV0N6DKx";
        if (this.A00 > 0) {
            return 0;
        }
        this.A09.AIA(this.A06 + this.A04, 1, this.A01, 0, null);
        this.A04 += 20000;
        return 0;
    }

    private C2407lS A04(long j10, boolean z10) {
        return new C2407lS(j10, this.A05, A01(this.A02, 20000L), this.A02, z10);
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void A06() {
        C3M.A02(this.A09);
    }

    @RequiresNonNull({"trackOutput"})
    private void A07() {
        if (!this.A0A) {
            this.A0A = true;
            String mimeType = this.A0C ? A05(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 12, 26) : A05(107, 10, 46);
            this.A09.A6W(new C2D().A11(mimeType).A0h(A0I).A0b(1).A0m(this.A0C ? 16000 : 8000).A14());
        }
    }

    @RequiresNonNull({"extractorOutput"})
    private void A09(long j10, int i10) {
        if (this.A0B) {
            return;
        }
        if ((this.A0D & 1) == 0 || j10 == -1 || (this.A02 != -1 && this.A02 != this.A01)) {
            this.A08 = new C2398lI(C.TIME_UNSET);
            this.A07.AIN(this.A08);
            this.A0B = true;
        } else {
            if (this.A03 < 20 && i10 != -1) {
                return;
            }
            this.A08 = A04(j10, (this.A0D & 2) != 0);
            this.A07.AIN(this.A08);
            this.A0B = true;
        }
    }

    private boolean A0A(int i10) {
        return !this.A0C && (i10 < 12 || i10 > 14);
    }

    private boolean A0B(int i10) {
        return i10 >= 0 && i10 <= 15 && (A0C(i10) || A0A(i10));
    }

    private boolean A0C(int i10) {
        return this.A0C && (i10 < 10 || i10 > 13);
    }

    private boolean A0D(InterfaceC2403lN interfaceC2403lN) throws IOException {
        if (A0E(interfaceC2403lN, A0J)) {
            this.A0C = false;
            interfaceC2403lN.AJJ(A0J.length);
            return true;
        }
        if (!A0E(interfaceC2403lN, A0K)) {
            return false;
        }
        this.A0C = true;
        interfaceC2403lN.AJJ(A0K.length);
        return true;
    }

    public static boolean A0E(InterfaceC2403lN interfaceC2403lN, byte[] bArr) throws IOException {
        interfaceC2403lN.AI1();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC2403lN.AG9(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public static /* synthetic */ GX[] A0F() {
        return new GX[]{new C2396lG()};
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A07 = gy;
        this.A09 = gy.AJh(0, 1);
        gy.A6G();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt) throws IOException {
        A06();
        if (interfaceC2403lN.A8f() != 0 || A0D(interfaceC2403lN)) {
            A07();
            int iA03 = A03(interfaceC2403lN);
            A09(interfaceC2403lN.A8G(), iA03);
            return iA03;
        }
        throw C08822i.A01(A05(27, 26, 87), null);
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j10, long j11) {
        this.A04 = 0L;
        this.A01 = 0;
        this.A00 = 0;
        if (j10 != 0) {
            boolean z10 = this.A08 instanceof C2407lS;
            if (A0G[1].charAt(14) != '4') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[3] = "NQLxubHlf0cB1xHoee3lgwNqGMjiyHKA";
            strArr[7] = "Tv4bI2EMm7rGcVq8cNVXYB9qzgEcyYlQ";
            if (z10) {
                this.A06 = ((C2407lS) this.A08).A02(j10);
                return;
            }
        }
        this.A06 = 0L;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC2403lN interfaceC2403lN) throws IOException {
        return A0D(interfaceC2403lN);
    }
}
