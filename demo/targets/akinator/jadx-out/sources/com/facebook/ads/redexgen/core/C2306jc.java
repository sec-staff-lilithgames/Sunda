package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.jc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2306jc implements GP {
    public static String[] A04 = {"sdKdmhexVnrlWGhX9TH5KtuHBxlX2", "B98Zkm438dg3YkwTFsWcwjYsIqopE2cW", "q7DFl2FydsE0DWNk8QJk98tFdBPGU17r", "uw89PlDwsU5CTp5ALy1o", "HmpI", "x0Unc4LQNUVImDERNKiE", "Klo4tVDdc3zNBBgsT3eAMryjwXw3w", "mmy2vPNb8zCZX"};
    public final int A00;
    public final int A01;
    public final C4J A02 = new C4J();
    public final C4R A03;

    public C2306jc(int i10, C4R c4r, int i11) {
        this.A00 = i10;
        this.A03 = c4r;
        this.A01 = i11;
    }

    private GN A00(C4J c4j, long j10, long j11) {
        int iA00;
        int iA002;
        int iA0A = c4j.A0A();
        long j12 = -1;
        long j13 = -1;
        long lastPcrTimeUsInRange = C.TIME_UNSET;
        while (c4j.A07() >= 188 && (iA002 = (iA00 = AbstractC1331Kg.A00(c4j.A0l(), c4j.A09(), iA0A)) + 188) <= iA0A) {
            long jA01 = AbstractC1331Kg.A01(c4j, iA00, this.A00);
            if (jA01 != C.TIME_UNSET) {
                long jA06 = this.A03.A06(jA01);
                if (jA06 > j10) {
                    String[] strArr = A04;
                    if (strArr[1].charAt(12) == strArr[2].charAt(12)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[3] = "aExFpEIrb6zE8t35yvld";
                    strArr2[5] = "jMLoot3yN0lnttWSwPI3";
                    if (lastPcrTimeUsInRange == C.TIME_UNSET) {
                        return GN.A04(jA06, j11);
                    }
                    return GN.A03(j11 + j12);
                }
                long j14 = jA06 + 100000;
                String[] strArr3 = A04;
                if (strArr3[1].charAt(12) != strArr3[2].charAt(12)) {
                    String[] strArr4 = A04;
                    strArr4[3] = "ZHgwZuqrkfLn2FTfbKUV";
                    strArr4[5] = "99YI6qOyfmrUQVvNk1ZB";
                    if (j14 > j10) {
                        return GN.A03(iA00 + j11);
                    }
                    j12 = iA00;
                    lastPcrTimeUsInRange = jA06;
                } else {
                    A04[4] = "5ynNf";
                    if (j14 > j10) {
                        return GN.A03(iA00 + j11);
                    }
                    j12 = iA00;
                    lastPcrTimeUsInRange = jA06;
                }
            }
            c4j.A0f(iA002);
            j13 = iA002;
        }
        if (lastPcrTimeUsInRange != C.TIME_UNSET) {
            return GN.A05(lastPcrTimeUsInRange, j11 + j13);
        }
        return GN.A03;
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final void AFA() {
        this.A02.A0i(AbstractC09264a.A07);
    }

    @Override // com.facebook.ads.redexgen.core.GP
    public final GN AIC(InterfaceC2403lN interfaceC2403lN, long j10) throws IOException {
        long jA8f = interfaceC2403lN.A8f();
        int iMin = (int) Math.min(this.A01, interfaceC2403lN.A8G() - jA8f);
        this.A02.A0d(iMin);
        interfaceC2403lN.AG9(this.A02.A0l(), 0, iMin);
        return A00(this.A02, j10, jA8f);
    }
}
