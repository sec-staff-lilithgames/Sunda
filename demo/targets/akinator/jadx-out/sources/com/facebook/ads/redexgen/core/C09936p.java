package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* renamed from: com.facebook.ads.redexgen.X.6p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09936p extends AbstractC2171hD {
    public static String[] A02 = {"eAQfPHHoyWilLfBxOFaJj1G06pGOxPq", "94FVrmFRVghPmyms9ar5cFWRdDurlkVe", "0NqQX4CUu3LD8PHaDMvmRAbh4clEtoM7", "DpSRaNejvtQ52XA7I6oeLqqk6ldlwRKU", "AVeirdKHq7BiC91JmOFjEM59wAwHTkmS", "1THCMBeh6DIPctxeAaB65wntvUu4aFha", "yEsJBiLTEnojRHdtAiiv5fZXbmAhiMSc", "YuG6RWvr5fcVmyx3SnaQUPOafyGz2fG"};
    public C2155gw A00;
    public final C2145gm A01;

    public C09936p(C2145gm c2145gm, String str) {
        super(c2145gm.A0B, str, A00(c2145gm));
        this.A01 = c2145gm;
    }

    public static C2144gl A00(C2145gm c2145gm) {
        return new C2144gl(c2145gm);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2171hD
    public final void A08() {
        if (super.A01.A01) {
            this.A05.A5n();
        }
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AIc(NZ.A03);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2171hD
    public final void A09() {
        this.A00 = new C2155gw(this.A01, this, A04());
        this.A00.A0J(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2171hD
    public final void A0D(boolean z10) {
        this.A05.AJ3(z10);
    }

    public final C2145gm A0E() {
        return this.A01;
    }

    public final void A0F(Ad ad2, String str, AdExperienceType adExperienceType, boolean z10) {
        if (super.A00.A6M()) {
            return;
        }
        this.A01.A02(ad2);
        if (this.A00 != null) {
            this.A00.A0J(str, adExperienceType, z10);
            return;
        }
        this.A01.A05 = str;
        this.A01.A02 = adExperienceType;
        this.A01.A08 = z10;
        if (UA.A09(this.A02) && UA.A0B(this.A02)) {
            if (UA.A0M(str)) {
                A05();
                return;
            } else {
                A09();
                return;
            }
        }
        A09();
    }

    public final void A0G(RewardData rewardData) {
        this.A01.A03 = rewardData;
        if (super.A01.A01) {
            super.A01.A0F(2003, AbstractC1422Nu.A00(new Bundle(), rewardData));
        } else if (this.A00 != null) {
            this.A00.A0I(rewardData);
        }
    }

    public final boolean A0H() {
        if (this.A00 != null) {
            return this.A00.A0K();
        }
        return this.A01.A01 > 0 && XG.A00() > this.A01.A01;
    }

    public final boolean A0I() {
        if (this.A00 != null) {
            return this.A00.A0L();
        }
        return super.A00.A6h() == NZ.A05;
    }

    public final boolean A0J(Ad ad2, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int iA00 = ((C1505Rb) rewardedVideoShowAdConfig).A00();
        long jA01 = ((C1505Rb) rewardedVideoShowAdConfig).A01();
        if (super.A00.A6N()) {
            return false;
        }
        this.A01.A02(ad2);
        String[] strArr = A02;
        String str = strArr[7];
        String str2 = strArr[0];
        int length = str.length();
        int appOrientation = str2.length();
        if (length == appOrientation) {
            String[] strArr2 = A02;
            strArr2[5] = "m9KaRECdYgffkM0tCirP5ynC5R03VfN7";
            strArr2[6] = "WVyWW47u948M29zNqYDy5rdzHxlGG88k";
            if (super.A01.A01) {
                A0A(iA00);
                return true;
            }
            C2155gw c2155gw = this.A00;
            String[] strArr3 = A02;
            String str3 = strArr3[2];
            String str4 = strArr3[1];
            int iCharAt = str3.charAt(27);
            int appOrientation2 = str4.charAt(27);
            if (iCharAt != appOrientation2) {
                String[] strArr4 = A02;
                strArr4[7] = "SVQKcBS7FHKRAHC3EplGepZBNeGcwFJ";
                strArr4[0] = "IfCkczTPSOxE6DmqSLPQVuiWAstWVdL";
                if (c2155gw != null) {
                    return this.A00.A0M(iA00, jA01);
                }
                this.A00 = new C2155gw(this.A01, this, A04());
                this.A00.A0M(iA00, jA01);
                return false;
            }
        }
        throw new RuntimeException();
    }
}
