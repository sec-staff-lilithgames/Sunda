package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1125Ch {
    public static String[] A02 = {"4TwA1o2Ep92EJf2kWsTxgSvY7XFLVqxb", "SzLaCQdX0pGKHOEOuI88qU4Xa6V3gjjn", "mTjGFAU84gG5amLKxmHz14L2RlN7AEMU", "k8pgVKm75DJXQCu6A3JyW6XocEHCMitL", "Dt5DaTGTZuM8JcFDSObTqaWbrPY1DBAg", "KOI07PnFBeZ1Xb1RPLCsygCZDxdIvUV5", "t49dzbEAn9Axd4L5SSbOFdqKA0HDLlVI", "LyI4lmghWi20pkpR0r6qTAUyYqODE3a9"};
    public final int A00;
    public final boolean A01;

    public C1125Ch(int i10, boolean z10) {
        this.A00 = i10;
        this.A01 = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String[] strArr = A02;
        if (strArr[1].charAt(14) == strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[2] = "Ep9mp6taO3R9ZcsruaKBGqDLxq8mMAmY";
        strArr2[0] = "0oDwj4GIzGtUTBPxtG85JLkkQ4P5go2r";
        C1125Ch c1125Ch = (C1125Ch) obj;
        return this.A00 == c1125Ch.A00 && this.A01 == c1125Ch.A01;
    }

    public final int hashCode() {
        return (this.A00 * 31) + (this.A01 ? 1 : 0);
    }
}
