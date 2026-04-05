package com.facebook.ads.redexgen.core;

import android.text.Layout;
import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public final class JC {
    public static final Comparator<JC> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.JB
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((JC) obj2).A00, ((JC) obj).A00);
        }
    };
    public final int A00;
    public final C2565o2 A01;

    public JC(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
        C3C cueBuilder = new C3C().A0G(charSequence).A0F(alignment).A07(f10, i10).A09(i11).A04(f11).A0A(i12).A06(f12);
        if (z10) {
            cueBuilder.A0C(i13);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i14;
    }
}
