package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public final class UJ {
    public static String[] A04 = {"VndfGBIDInq1AmGKWEXIYtH", "X1ufgR44W1Z84U", "n", "", "za8Aa", "xjBfTCMiG1bFh7NB9hwMlLVXQHNbTqdl", "vkDSrNK7CnANJUjGZxXcCXY", "njWPP"};
    public UG A01 = UG.A03;
    public UH A02 = UH.A06;
    public UI A03 = UI.A02;
    public UF A00 = UF.A02;

    public final void A00() {
        this.A00 = UF.A03;
    }

    public final void A01() {
        this.A02 = UH.A04;
    }

    public final void A02() {
        this.A02 = UH.A05;
    }

    public final void A03() {
        this.A03 = UI.A03;
    }

    public final boolean A04() {
        if (this.A02 != UH.A06) {
            UH uh2 = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "r152EQyYeE04Ovy9QYMfnLx";
            strArr2[0] = "I6yTYbMajK96Zgvn6mn7gLC";
            if (uh2 != UH.A02 && this.A02 != UH.A05) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == UH.A06 || this.A02 == UH.A02;
    }

    public final boolean A06() {
        return this.A03 == UI.A03;
    }

    public final boolean A07() {
        return this.A00 == UF.A03;
    }
}
