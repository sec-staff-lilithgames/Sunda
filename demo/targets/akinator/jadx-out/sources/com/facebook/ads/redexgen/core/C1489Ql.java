package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ql, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1489Ql {
    public C1486Qi A00 = new C1486Qi();
    public final InterfaceC1487Qj A01;

    public C1489Ql(InterfaceC1487Qj interfaceC1487Qj) {
        this.A01 = interfaceC1487Qj;
    }

    public final View A00(int i10, int i11, int i12, int i13) {
        int iA8Z = this.A01.A8Z();
        int next = this.A01.A8Y();
        int childEnd = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA79 = this.A01.A79(i10);
            int iA7C = this.A01.A7C(viewA79);
            int i14 = this.A01.A7B(viewA79);
            this.A00.A03(iA8Z, next, iA7C, i14);
            if (i12 != 0) {
                this.A00.A01();
                this.A00.A02(i12);
                if (this.A00.A04()) {
                    return viewA79;
                }
            }
            if (i13 != 0) {
                this.A00.A01();
                this.A00.A02(i13);
                if (this.A00.A04()) {
                    view = viewA79;
                }
            }
            i10 += childEnd;
        }
        return view;
    }
}
