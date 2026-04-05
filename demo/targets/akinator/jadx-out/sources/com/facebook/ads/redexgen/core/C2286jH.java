package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.jH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2286jH {
    public final int A00;
    public final BZ A01;
    public final InterfaceC2285jG A02;
    public final boolean A03;

    public C2286jH(InterfaceC2285jG strategy) {
        this(strategy, false, BZ.A03(), Integer.MAX_VALUE);
    }

    public C2286jH(InterfaceC2285jG strategy, boolean omitEmptyStrings, BZ trimmer, int limit) {
        this.A02 = strategy;
        this.A03 = omitEmptyStrings;
        this.A01 = trimmer;
        this.A00 = limit;
    }

    public static C2286jH A02(char separator) {
        return A03(BZ.A02(separator));
    }

    public static C2286jH A03(final BZ separatorMatcher) {
        AbstractC2279jA.A04(separatorMatcher);
        return new C2286jH(new BK(separatorMatcher));
    }

    private Iterator<String> A04(CharSequence sequence) {
        return this.A02.AAc(this, sequence);
    }

    public final List<String> A06(CharSequence sequence) {
        AbstractC2279jA.A04(sequence);
        Iterator<String> itA04 = A04(sequence);
        List<String> result = new ArrayList<>();
        while (itA04.hasNext()) {
            result.add(itA04.next());
        }
        return Collections.unmodifiableList(result);
    }
}
