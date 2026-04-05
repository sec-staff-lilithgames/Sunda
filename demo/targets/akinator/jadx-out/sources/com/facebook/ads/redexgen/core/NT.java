package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class NT {
    public static String[] A0E = {"e4QKd0vFJKlBfNQUlIHhfqQvs", "ktN6BUw9VrN2JTOHJ8TIrrXahMZ3fTmV", "DLbbL7kcZ5O", "9b4HlLYHdUSJ33wbgi9UrYdebMHGJs2L", "z1qfKPKzPcrrDsrmM", "3k9SvbOHIOGx0S2BWPTRCyg1cNUtQJE0", "0GDGJhxXKJqU0yOd0NeRuUkLVmalwgCj", "KW1MjCrhBg"};
    public int A00;
    public long A01;
    public RewardData A02;
    public EnumC1591Ul A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final TL A07;
    public final V4 A08;
    public final V6 A09;
    public final String A0A;
    public final EnumSet<CacheFlag> A0B;
    public final int A0C;
    public final AdPlacementType A0D;

    public NT(String str, V6 v62, AdPlacementType adPlacementType, V4 v42, int i10, TL tl2) {
        this(str, v62, adPlacementType, v42, i10, EnumSet.of(CacheFlag.NONE), tl2);
    }

    public NT(String str, V6 v62, AdPlacementType adPlacementType, V4 v42, int i10, EnumSet<CacheFlag> cacheFlags, TL tl2) {
        this.A0A = str;
        this.A0D = adPlacementType;
        this.A08 = v42;
        this.A0C = i10;
        this.A0B = cacheFlags;
        this.A09 = v62;
        this.A00 = -1;
        this.A07 = tl2;
    }

    public final VR A00(C1937dL c1937dL, VB vb2, AdExperienceType adExperienceType) {
        return new VR(c1937dL, this.A0A, this.A08 != null ? new X1(this.A08.A04(), this.A08.A03()) : null, this.A09, this.A0C, vb2, X7.A01(U7.A0N(c1937dL)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null, this.A07);
    }

    public final Set<AdPlacementType> A01() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(2);
        if (this.A0D == AdPlacementType.BANNER && this.A09 == V6.A0D) {
            linkedHashSet.add(AdPlacementType.BANNER);
            AdPlacementType adPlacementType = AdPlacementType.MEDIUM_RECTANGLE;
            String[] strArr = A0E;
            if (strArr[4].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[4] = "dJCx3L7RUa0HYA9jO";
            strArr2[0] = "pYtnX6DZAplUTv76Lm34k0kqX";
            linkedHashSet.add(adPlacementType);
            return linkedHashSet;
        }
        if (this.A0D != null) {
            linkedHashSet.add(this.A0D);
            return linkedHashSet;
        }
        if (this.A08 == null) {
            linkedHashSet.add(AdPlacementType.NATIVE);
            return linkedHashSet;
        }
        if (this.A08 == V4.A08) {
            linkedHashSet.add(AdPlacementType.INTERSTITIAL);
            return linkedHashSet;
        }
        linkedHashSet.add(AdPlacementType.BANNER);
        return linkedHashSet;
    }

    public final void A02(int i10) {
        this.A00 = i10;
    }

    public final void A03(long j10) {
        this.A01 = j10;
    }

    public final void A04(RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(EnumC1591Ul enumC1591Ul) {
        this.A03 = enumC1591Ul;
    }

    public final void A06(String str) {
        this.A04 = str;
    }

    public final void A07(String str) {
        this.A05 = str;
    }

    public final void A08(boolean z10) {
        this.A06 = z10;
    }
}
