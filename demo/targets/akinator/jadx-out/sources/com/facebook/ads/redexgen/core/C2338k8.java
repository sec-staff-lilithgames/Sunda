package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.k8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2338k8 implements J7 {
    public static String[] A02 = {"HEj97KvUnOVi99GyCemBfj1IlRVMCYKa", "bKpF78P6yplIZiN4oLHJNmT5FnU1SEKu", "7Sc49g8U0pFUCwWrHEqt4gm3cHokAbZL", "cD1aak7SOkYBFQ5WYMuE6fCzYSMr5rzP", "nFSB3U7GisPQJq8UC8oIR6SGnDGaOjWF", "F8IIvOctPHFdHQL4x7ywQ6I9IFbldSVz", "cjwMlxT4uAsHz8zserTiMsrkd8r9G7hR", "hk7t5bmYHUtAqM49rcYSiap2RmT4cwS9"};
    public final List<Long> A00;
    public final List<List<C2565o2>> A01;

    public C2338k8(List<List<C2565o2>> list, List<Long> cueTimesUs) {
        this.A01 = list;
        this.A00 = cueTimesUs;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C2565o2> A7P(long j10) {
        int iA0H = AbstractC09264a.A0H(this.A00, Long.valueOf(j10), true, false);
        if (iA0H == -1) {
            return Collections.emptyList();
        }
        List<C2565o2> list = this.A01.get(iA0H);
        if (A02[7].charAt(14) == 'Q') {
            throw new RuntimeException();
        }
        A02[7] = "T22AU4Idz2xqABMljk02WspyVqHPQCmG";
        return list;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i10) {
        boolean z10 = true;
        C3M.A07(i10 >= 0);
        if (i10 >= this.A00.size()) {
            z10 = false;
        }
        C3M.A07(z10);
        return this.A00.get(i10).longValue();
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j10) {
        int iA0G = AbstractC09264a.A0G(this.A00, Long.valueOf(j10), false, false);
        int index = this.A00.size();
        if (iA0G < index) {
            return iA0G;
        }
        return -1;
    }
}
