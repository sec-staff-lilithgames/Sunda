package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public final class KR {
    public static String[] A0D = {"ITeGogKqorZ7bSCIE87s8DTmQOo7Fv11", "MgkbApIEYzpKXgGasWREFXTi3GTadnaL", "OAixFelLhBe3iSBS2M", "ijopPBuuJeE4Ltql3uBrQuSo8nqq7R3R", "1SB5ttJ09JcNeK6D9rJTpC1clnicerw7", "nbktskyiJneEJjHZifeKEa33HsJGsJ62", "ZYvdfmJVTREWWhesr4Tm9ps4syTvrO", "VkO2l5JSpUAFzoG39IjRbEodOO78G96O"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final H1 A0C;

    public KR(H1 h12) {
        this.A0C = h12;
    }

    private void A00(int i10) {
        if (this.A04 == C.TIME_UNSET) {
            return;
        }
        boolean z10 = this.A0B;
        this.A0C.AIA(this.A04, z10 ? 1 : 0, (int) (this.A01 - this.A03), i10, null);
    }

    public static boolean A01(int i10) {
        return (32 <= i10 && i10 <= 35) || i10 == 39;
    }

    public static boolean A02(int i10) {
        return i10 < 32 || i10 == 40;
    }

    public final void A03() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A0A = false;
        this.A09 = false;
    }

    public final void A04(long j10, int i10, int i11, long j11, boolean z10) {
        this.A06 = false;
        this.A05 = false;
        this.A02 = j11;
        this.A00 = 0;
        this.A01 = j10;
        if (!A02(i11)) {
            if (this.A0A && !this.A09) {
                if (z10) {
                    A00(i10);
                }
                this.A0A = false;
            }
            if (A01(i11)) {
                this.A05 = !this.A09;
                this.A09 = true;
            }
        }
        this.A08 = i11 >= 16 && i11 <= 21;
        this.A07 = this.A08 || i11 <= 9;
        if (A0D[6].length() != 30) {
            throw new RuntimeException();
        }
        A0D[6] = "HIa27EP0rmwgvhPEN5RK7GL0DsepbL";
    }

    public final void A05(long j10, int i10, boolean z10) {
        if (this.A09 && this.A06) {
            this.A0B = this.A08;
            this.A09 = false;
        } else {
            if (!this.A05 && !this.A06) {
                return;
            }
            if (z10 && this.A0A) {
                A00(i10 + ((int) (j10 - this.A01)));
            }
            this.A03 = this.A01;
            this.A04 = this.A02;
            this.A0B = this.A08;
            this.A0A = true;
        }
    }

    public final void A06(byte[] bArr, int i10, int i11) {
        if (this.A07) {
            int i12 = (i10 + 2) - this.A00;
            if (i12 < i11) {
                int headerOffset = bArr[i12];
                this.A06 = (headerOffset & 128) != 0;
                this.A07 = false;
                return;
            }
            this.A00 += i11 - i10;
        }
    }
}
