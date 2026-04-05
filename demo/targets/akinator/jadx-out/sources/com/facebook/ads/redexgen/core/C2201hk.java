package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.hk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2201hk implements NG {
    public static String[] A07 = {"LaTcnwnUfzgLTffZJQ1IPucRbglpEgMo", "12hOZJfgSqwHBnuTqXHxpHxEQ0NbZO7A", "Dr9pHE3G5odEHWCsCqxBSNpdFpwa86Mh", "MDWd5GjifHIGoqp8wS2KmhLcZ8", "Ozio236b3SA3ZtX", "C3UkekSSOdUqAnfYGByVev7l4a4YpLBv", "Q070rE4WAmrDPncHn0R1JG2tySYrh7TO", ""};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC2212hy A01;
    public final /* synthetic */ C2210hw A02;
    public final /* synthetic */ NG A03;
    public final /* synthetic */ NH A04;
    public final /* synthetic */ C1937dL A05;
    public final /* synthetic */ EnumSet A06;

    public C2201hk(NH nh2, C1937dL c1937dL, AbstractC2212hy abstractC2212hy, C2210hw c2210hw, int i10, NG ng2, EnumSet enumSet) {
        this.A04 = nh2;
        this.A05 = c1937dL;
        this.A01 = abstractC2212hy;
        this.A02 = c2210hw;
        this.A00 = i10;
        this.A03 = ng2;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 < this.A02.A1u()) {
            this.A04.A0A(this.A05, this.A06, this.A02, this.A02.A1x(this.A00 + 1), this.A00 + 1, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void ACF(AdError adError) {
        if (this.A00 == 0) {
            this.A03.ACF(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void ACG() {
        this.A05.A01().AIU(this.A01.A25(), this.A02.A1y());
        if (this.A00 == 0) {
            NG ng2 = this.A03;
            String[] strArr = A07;
            if (strArr[5].charAt(13) != strArr[6].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "Mfrds6r17BKRZSfVfcuH4MZ0YR";
            strArr2[4] = "cdrsota1fCopt7F";
            ng2.ACG();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void AGo() {
        if (this.A00 == 0) {
            this.A03.AGo();
        }
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void AJm() {
        if (this.A00 == 0) {
            this.A03.AJm();
        }
    }
}
