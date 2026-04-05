package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2422lh implements EO {
    public int A00;
    public int A01;
    public int A02;
    public EM[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public C2422lh(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public C2422lh(boolean z10, int i10, int i11) {
        C3M.A07(i10 > 0);
        C3M.A07(i11 >= 0);
        this.A05 = z10;
        this.A04 = i10;
        this.A01 = i11;
        this.A03 = new EM[i11 + 100];
        if (i11 > 0) {
            this.A06 = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.A03[i12] = new EM(this.A06, i12 * i10);
            }
            return;
        }
        this.A06 = null;
    }

    public final synchronized int A00() {
        return this.A00 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i10) {
        boolean targetBufferSizeReduced = i10 < this.A02;
        this.A02 = i10;
        if (targetBufferSizeReduced) {
            AJi();
        }
    }

    @Override // com.facebook.ads.redexgen.core.EO
    public final synchronized EM A41() {
        EM em2;
        this.A00++;
        if (this.A01 > 0) {
            EM[] emArr = this.A03;
            int i10 = this.A01 - 1;
            this.A01 = i10;
            em2 = (EM) C3M.A01(emArr[i10]);
            this.A03[this.A01] = null;
        } else {
            em2 = new EM(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (EM[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return em2;
    }

    @Override // com.facebook.ads.redexgen.core.EO
    public final int A8A() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.EO
    public final synchronized void AGt(EM em2) {
        EM[] emArr = this.A03;
        int i10 = this.A01;
        this.A01 = i10 + 1;
        emArr[i10] = em2;
        this.A00--;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.EO
    public final synchronized void AGu(EN en2) {
        while (en2 != null) {
            EM[] emArr = this.A03;
            int i10 = this.A01;
            this.A01 = i10 + 1;
            emArr[i10] = en2.A6m();
            this.A00--;
            en2 = en2.AC3();
        }
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.EO
    public final synchronized void AJi() {
        int iA05 = AbstractC09264a.A05(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int iMax = Math.max(0, iA05 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (iMax >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                EM highAllocation = (EM) C3M.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    EM lowAllocation = (EM) C3M.A01(this.A03[highIndex]);
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            iMax = Math.max(iMax, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (iMax >= targetAllocationCount5) {
                return;
            }
        }
        EM[] emArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(emArr, iMax, targetAvailableCount, (Object) null);
        this.A01 = iMax;
    }
}
