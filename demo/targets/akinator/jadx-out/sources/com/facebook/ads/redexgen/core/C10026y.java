package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10026y extends AbstractC2183hQ {
    public C10026y(C1937dL c1937dL, NT nt2) {
        super(c1937dL, nt2);
    }

    private C2181hO A00(Runnable runnable) {
        return new C2181hO(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2183hQ
    public final AbstractC1390Mo A0I() {
        C2238iS successfullyLoadedAdapter = (C2238iS) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2183hQ
    public final void A0P() {
        C2238iS interstitialAdapter = (C2238iS) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2183hQ
    public final void A0R(MP mp2, TE te2, TC tc2, NU nu2) {
        C2238iS c2238iS = (C2238iS) mp2;
        C2182hP c2182hP = new C2182hP(this, nu2, c2238iS);
        A0H().postDelayed(c2182hP, te2.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2238iS.A0A(this.A0B, A00(c2182hP), nu2, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
