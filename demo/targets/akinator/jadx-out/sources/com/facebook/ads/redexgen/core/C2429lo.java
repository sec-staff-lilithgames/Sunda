package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.lo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2429lo implements C1S {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;
    public static String[] A04 = {"0EeRaofkOnG82pPuB", "jcjJv", "T4n", "y6LXg9kPowsRJwalOEx6K", "cypgHvauDeb", "sGCac32Lryl6ta5A9qPel0ZSNDpSTc", "mAWrtqCYM7sM8yItQ0fM", "xdW2EE8FfL1ekapcbmlM6yOkR5Ux1S1"};
    public static final String A06 = AbstractC09264a.A0h(0);
    public static final String A07 = AbstractC09264a.A0h(1);
    public static final String A08 = AbstractC09264a.A0h(2);
    public static final C1R<C2429lo> A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.lp
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2429lo.A00(bundle);
        }
    };

    public C2429lo(int i10, int[] iArr, int i11) {
        this.A00 = i10;
        this.A03 = Arrays.copyOf(iArr, iArr.length);
        this.A01 = iArr.length;
        this.A02 = i11;
        Arrays.sort(this.A03);
    }

    public static /* synthetic */ C2429lo A00(Bundle bundle) {
        int i10 = bundle.getInt(A06, -1);
        int[] tracks = bundle.getIntArray(A07);
        int trackType = bundle.getInt(A08, -1);
        C3M.A07(i10 >= 0 && trackType >= 0);
        C3M.A01(tracks);
        return new C2429lo(i10, tracks, trackType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A04;
        if (strArr[5].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        A04[6] = "RoyHwRFBbL3TyB1YuYs";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2429lo c2429lo = (C2429lo) obj;
        if (this.A00 == c2429lo.A00 && Arrays.equals(this.A03, c2429lo.A03) && this.A02 == c2429lo.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.A00 * 31) + Arrays.hashCode(this.A03)) * 31;
        int hash = this.A02;
        return iHashCode + hash;
    }
}
