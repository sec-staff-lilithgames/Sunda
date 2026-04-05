package com.facebook.ads.redexgen.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ln, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2428ln extends E5<C2428ln> implements Comparable<C2428ln> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C2428ln> list, List<C2428ln> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2428ln(int i10, C2580oH c2580oH, int i11, AnonymousClass93 anonymousClass93, int i12, String str) {
        List<String> listA03;
        super(i10, c2580oH, i11);
        int i13 = 0;
        this.A08 = AnonymousClass92.A0S(i12, false);
        int i14 = super.A02.A0H & (~((C2573oA) anonymousClass93).A00);
        this.A06 = (i14 & 1) != 0;
        this.A07 = (i14 & 2) != 0;
        int i15 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (anonymousClass93.A0K.isEmpty()) {
            listA03 = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            listA03 = anonymousClass93.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= listA03.size()) {
                break;
            }
            int iA02 = AnonymousClass92.A02(super.A02, listA03.get(bestLanguageIndex), anonymousClass93.A0P);
            if (iA02 > 0) {
                i15 = bestLanguageIndex;
                bestLanguageScore = iA02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i15;
        this.A01 = bestLanguageScore;
        this.A02 = AnonymousClass92.A00(super.A02.A0E, ((C2573oA) anonymousClass93).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = AnonymousClass92.A02(super.A02, str, AnonymousClass92.A0K(str) == null);
        boolean z10 = this.A01 > 0 || (anonymousClass93.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (AnonymousClass92.A0S(i12, anonymousClass93.A0B) && z10) {
            i13 = 1;
        }
        this.A04 = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2428ln c2428ln) {
        AbstractC2445m4 abstractC2445m4A06 = AbstractC2445m4.A01().A09(this.A08, c2428ln.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c2428ln.A00), AbstractC2593oV.A03().A06()).A06(this.A01, c2428ln.A01).A06(this.A02, c2428ln.A02).A09(this.A06, c2428ln.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c2428ln.A07), this.A01 == 0 ? AbstractC2593oV.A03() : AbstractC2593oV.A03().A06()).A06(this.A03, c2428ln.A03);
        if (this.A02 == 0) {
            abstractC2445m4A06 = abstractC2445m4A06.A0A(this.A05, c2428ln.A05);
        }
        return abstractC2445m4A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static AbstractC1081Am<C2428ln> A02(int i10, C2580oH c2580oH, AnonymousClass93 anonymousClass93, int[] iArr, String str) {
        C08571h c08571hA01 = AbstractC1081Am.A01();
        for (int i11 = 0; i11 < c2580oH.A01; i11++) {
            c08571hA01.A04(new C2428ln(i10, c2580oH, i11, anonymousClass93, iArr[i11], str));
        }
        return c08571hA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.E5
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2428ln c2428ln) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.E5
    public final int A08() {
        return this.A04;
    }
}
