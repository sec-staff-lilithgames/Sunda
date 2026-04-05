package com.facebook.ads.redexgen.core;

import android.view.WindowInsets;

/* loaded from: assets/audience_network.dex */
public final class PK {
    public final Object A00;

    public PK(Object obj) {
        this.A00 = obj;
    }

    public static PK A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new PK(obj);
    }

    public static Object A01(PK pk2) {
        if (pk2 == null) {
            return null;
        }
        return pk2.A00;
    }

    public final int A02() {
        return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
    }

    public final int A03() {
        return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
    }

    public final int A04() {
        return ((WindowInsets) this.A00).getSystemWindowInsetRight();
    }

    public final int A05() {
        return ((WindowInsets) this.A00).getSystemWindowInsetTop();
    }

    public final PK A06(int i10, int i11, int i12, int i13) {
        return new PK(((WindowInsets) this.A00).replaceSystemWindowInsets(i10, i11, i12, i13));
    }

    public final boolean A07() {
        return ((WindowInsets) this.A00).isConsumed();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PK pk2 = (PK) obj;
        return this.A00 == null ? pk2.A00 == null : this.A00.equals(pk2.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
