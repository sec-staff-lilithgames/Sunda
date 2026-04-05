package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.o4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2567o4 implements C1S {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public static String[] A04 = {"W5WZRfo3traFBsuJqUeacov", "AOz8vYfc0kUMyRrWtsrS4pOQsYE8BP6P", "ocEUeDJ9UZl7Q6o8h21wMsDJowBHj84j", "pkgO1YjXdbsvKDgws3J49uWJB6yyqkG7", "vCvp8tg1JPxrxhdMnot9YI84PFBkssaD", "Dazl9IXOnyCH5QLsvPseWpscLh5D5M0t", "ZYJ1zYUUdaXBOvkE2t6KLICz8MhT9p2M", "ySOVjFSAiUWhoASiDo2jZct"};
    public static final C2567o4 A06 = new C2567o4(0, 0);
    public static final String A0A = AbstractC09264a.A0h(0);
    public static final String A07 = AbstractC09264a.A0h(1);
    public static final String A09 = AbstractC09264a.A0h(2);
    public static final String A08 = AbstractC09264a.A0h(3);
    public static final C1R<C2567o4> A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.o5
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2567o4.A00(bundle);
        }
    };

    public C2567o4(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public C2567o4(int i10, int i11, int i12, float f10) {
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A00 = f10;
    }

    public static /* synthetic */ C2567o4 A00(Bundle bundle) {
        int i10 = bundle.getInt(A0A, 0);
        int i11 = bundle.getInt(A07, 0);
        int height = bundle.getInt(A09, 0);
        return new C2567o4(i10, i11, height, bundle.getFloat(A08, 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z10 = obj instanceof C2567o4;
        String[] strArr = A04;
        if (strArr[4].charAt(6) == strArr[2].charAt(6)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "xwJKUsQcskzDCgeEWIG9ozPdTsTzWcW9";
        strArr2[2] = "cRblKPLDWf1oyG1RJoVr7n5QNKGN7idl";
        if (!z10) {
            return false;
        }
        C2567o4 c2567o4 = (C2567o4) obj;
        return this.A03 == c2567o4.A03 && this.A01 == c2567o4.A01 && this.A02 == c2567o4.A02 && this.A00 == c2567o4.A00;
    }

    public final int hashCode() {
        int result = this.A03;
        int result2 = ((((7 * 31) + result) * 31) + this.A01) * 31;
        int result3 = this.A02;
        return ((result2 + result3) * 31) + Float.floatToRawIntBits(this.A00);
    }
}
