package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.9s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10619s extends AbstractC2592oU {
    public final boolean A00;
    public final boolean A01;
    public static final String A04 = AbstractC09264a.A0h(1);
    public static final String A03 = AbstractC09264a.A0h(2);
    public static final C1R<C10619s> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.op
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C10619s.A00(bundle);
        }
    };

    public C10619s() {
        this.A01 = false;
        this.A00 = false;
    }

    public C10619s(boolean z10) {
        this.A01 = true;
        this.A00 = z10;
    }

    public static C10619s A00(Bundle bundle) {
        boolean isRated = bundle.getInt(AbstractC2592oU.A02, -1) == 0;
        C3M.A07(isRated);
        boolean isRated2 = bundle.getBoolean(A04, false);
        if (isRated2) {
            return new C10619s(bundle.getBoolean(A03, false));
        }
        return new C10619s();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10619s)) {
            return false;
        }
        C10619s c10619s = (C10619s) obj;
        return this.A00 == c10619s.A00 && this.A01 == c10619s.A01;
    }

    public final int hashCode() {
        return BX.A00(Boolean.valueOf(this.A01), Boolean.valueOf(this.A00));
    }
}
