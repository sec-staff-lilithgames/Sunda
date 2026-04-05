package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Aq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1085Aq extends AbstractC2445m4 {
    public final int A00;

    public C1085Aq(int result) {
        super(null);
        this.A00 = result;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2445m4
    public final int A05() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2445m4
    public final AbstractC2445m4 A06(int left, int right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2445m4
    public final AbstractC2445m4 A07(long left, long right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2445m4
    public final <T> AbstractC2445m4 A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2445m4
    public final AbstractC2445m4 A09(boolean left, boolean right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2445m4
    public final AbstractC2445m4 A0A(boolean left, boolean right) {
        return this;
    }
}
