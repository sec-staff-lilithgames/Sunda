package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.oC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2575oC implements C1S {
    public final C2580oH A00;
    public final AbstractC1081Am<Integer> A01;
    public static final String A04 = AbstractC09264a.A0h(0);
    public static final String A03 = AbstractC09264a.A0h(1);
    public static final C1R<C2575oC> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oD
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2575oC.A00(bundle);
        }
    };

    public C2575oC(C2580oH c2580oH, List<Integer> trackIndices) {
        if (trackIndices.isEmpty() || (((Integer) Collections.min(trackIndices)).intValue() >= 0 && ((Integer) Collections.max(trackIndices)).intValue() < c2580oH.A01)) {
            this.A00 = c2580oH;
            this.A01 = AbstractC1081Am.A05(trackIndices);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ C2575oC A00(Bundle bundle) {
        return new C2575oC((C2580oH) C2580oH.A06.A6X((Bundle) C3M.A01(bundle.getBundle(A04))), AD.A0A((int[]) C3M.A01(bundle.getIntArray(A03))));
    }

    public final int A01() {
        return this.A00.A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2575oC c2575oC = (C2575oC) obj;
        return this.A00.equals(c2575oC.A00) && this.A01.equals(c2575oC.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}
