package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.jU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2298jU implements InterfaceC1334Kj {
    public static byte[] A08;
    public static String[] A09 = {"mF6wsmKEoSH0oaFjYCs54xiQsDf", "7fvgeHK83IOxRTsxSXxl4b3GDJCkJYIR", "3AWdxUjQjYm4RALX7ZxT6TNspaUhotFB", "ejd6qsjsHb99jkL857XJ5GpzVF9O4Dmm", "HjmRuX1Dl2gTeBJaQInX56gY9CThxDdt", "4dP72HMzoJKZI0lPLVreHOZSlD0czmst", "VabPsN9EmqWHNd02VeXfGkhVpY5qzzPo", "1TiSMCKkeVz3FItUT5PAcFJ22kgDAGxf"};
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C2614or A04;
    public final GY A05;
    public final H1 A06;
    public final C1336Kl A07;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-68, -95, -24, -16, -11, -69, -95, -34, 17, 9, -2, -4, 13, -2, -3, -71, -5, 5, 8, -4, 4, -71, 12, 2, 19, -2, -45, -71};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1334Kj
    public final boolean AI9(InterfaceC2403lN interfaceC2403lN, long j10) throws IOException {
        long j11 = j10;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(28) != strArr[5].charAt(28)) {
                throw new RuntimeException();
            }
            A09[7] = "xyHijgDe1t0LZE27YhGAb5keyZPdsLp6";
            if (j11 <= 0 || this.A00 >= this.A03) {
                break;
            }
            int iAI5 = this.A06.AI5(interfaceC2403lN, (int) Math.min(this.A03 - this.A00, j11), true);
            if (iAI5 == -1) {
                j11 = 0;
            } else {
                this.A00 += iAI5;
                j11 -= iAI5;
            }
        }
        int i10 = this.A07.A02;
        int i11 = this.A00 / i10;
        if (i11 > 0) {
            long jA0U = this.A02 + AbstractC09264a.A0U(this.A01, 1000000L, this.A07.A04);
            int i12 = i11 * i10;
            int i13 = this.A00 - i12;
            this.A06.AIA(jA0U, 1, i12, i13, null);
            this.A01 += i11;
            this.A00 = i13;
        }
        return j11 <= 0;
    }

    static {
        A01();
    }

    public C2298jU(GY gy, H1 h12, C1336Kl c1336Kl, String str, int i10) throws C08822i {
        this.A05 = gy;
        this.A06 = h12;
        this.A07 = c1336Kl;
        int i11 = (c1336Kl.A05 * c1336Kl.A01) / 8;
        int bytesPerFrame = c1336Kl.A02;
        if (bytesPerFrame == i11) {
            int bytesPerFrame2 = c1336Kl.A04;
            int constantBitrate = bytesPerFrame2 * i11 * 8;
            int bytesPerFrame3 = c1336Kl.A04;
            this.A03 = Math.max(i11, (bytesPerFrame3 * i11) / 10);
            C2D c2dA0j = new C2D().A11(str).A0a(constantBitrate).A0j(constantBitrate);
            int bytesPerFrame4 = this.A03;
            C2D c2dA0h = c2dA0j.A0h(bytesPerFrame4);
            int bytesPerFrame5 = c1336Kl.A05;
            C2D c2dA0b = c2dA0h.A0b(bytesPerFrame5);
            int bytesPerFrame6 = c1336Kl.A04;
            this.A04 = c2dA0b.A0m(bytesPerFrame6).A0i(i10).A14();
            return;
        }
        StringBuilder sbAppend = new StringBuilder().append(A00(7, 21, 72)).append(i11).append(A00(0, 7, 48));
        int bytesPerFrame7 = c1336Kl.A02;
        throw C08822i.A01(sbAppend.append(bytesPerFrame7).toString(), null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1334Kj
    public final void AA0(int i10, long j10) {
        this.A05.AIN(new C2296jS(this.A07, 1, i10, j10));
        this.A06.A6W(this.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1334Kj
    public final void AI0(long j10) {
        this.A02 = j10;
        this.A00 = 0;
        this.A01 = 0L;
    }
}
