package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: assets/audience_network.dex */
public final class KN {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final H1 A07;

    public KN(H1 h12) {
        this.A07 = h12;
    }

    public final void A00() {
        this.A05 = false;
        this.A04 = false;
        this.A06 = false;
        this.A00 = -1;
    }

    public final void A01(int i10, long j10) {
        this.A00 = i10;
        this.A06 = false;
        boolean z10 = true;
        this.A05 = i10 == 182 || i10 == 179;
        if (i10 != 182) {
            z10 = false;
        }
        this.A04 = z10;
        this.A01 = 0;
        this.A03 = j10;
    }

    public final void A02(long j10, int i10, boolean z10) {
        if (this.A00 == 182 && z10 && this.A05 && this.A03 != C.TIME_UNSET) {
            this.A07.AIA(this.A03, this.A06 ? 1 : 0, (int) (j10 - this.A02), i10, null);
        }
        if (this.A00 != 179) {
            this.A02 = j10;
        }
    }

    public final void A03(byte[] bArr, int i10, int i11) {
        if (this.A04) {
            int i12 = (i10 + 1) - this.A01;
            if (i12 < i11) {
                int headerOffset = bArr[i12];
                this.A06 = ((headerOffset & PsExtractor.AUDIO_STREAM) >> 6) == 0;
                this.A04 = false;
                return;
            }
            this.A01 += i11 - i10;
        }
    }
}
