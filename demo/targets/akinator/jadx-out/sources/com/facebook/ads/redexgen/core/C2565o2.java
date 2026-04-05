package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.o2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2565o2 implements C1S {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Bitmap A0C;
    public final Layout.Alignment A0D;
    public final Layout.Alignment A0E;
    public final CharSequence A0F;
    public final boolean A0G;
    public static String[] A0H = {"KUNE", "raA8kdJusqhSRQUihDErH9yYSlb7Q0pc", "a1YC1OeN6dpIjzX6IUyhBFBaZFiOBPar", "NtybfxE4AhM4u1v", "wsqusZh9gWXwGZdOs5jqqsOsuYO68ouK", "hrWhj8FC8bQIQnfwmhsxP3BdiVuQ0H3H", "RcL5HtL", "cuPzI7wmuuTc6v"};
    public static final C2565o2 A0J = new C3C().A0G("").A0H();
    public static final String A0U = AbstractC09264a.A0h(0);
    public static final String A0V = AbstractC09264a.A0h(1);
    public static final String A0P = AbstractC09264a.A0h(2);
    public static final String A0K = AbstractC09264a.A0h(3);
    public static final String A0M = AbstractC09264a.A0h(4);
    public static final String A0O = AbstractC09264a.A0h(5);
    public static final String A0N = AbstractC09264a.A0h(6);
    public static final String A0Q = AbstractC09264a.A0h(7);
    public static final String A0R = AbstractC09264a.A0h(8);
    public static final String A0X = AbstractC09264a.A0h(9);
    public static final String A0W = AbstractC09264a.A0h(10);
    public static final String A0T = AbstractC09264a.A0h(11);
    public static final String A0L = AbstractC09264a.A0h(12);
    public static final String A0Z = AbstractC09264a.A0h(13);
    public static final String A0a = AbstractC09264a.A0h(14);
    public static final String A0Y = AbstractC09264a.A0h(15);
    public static final String A0S = AbstractC09264a.A0h(16);
    public static final C1R<C2565o2> A0I = new C1R() { // from class: com.facebook.ads.redexgen.X.o3
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2565o2.A00(bundle);
        }
    };

    public C2565o2(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            C3M.A01(bitmap);
        } else {
            C3M.A07(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.A0F = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.A0F = charSequence.toString();
        } else {
            this.A0F = null;
        }
        this.A0E = alignment;
        this.A0D = alignment2;
        this.A0C = bitmap;
        this.A01 = f10;
        this.A07 = i10;
        this.A06 = i11;
        this.A02 = f11;
        this.A08 = i12;
        this.A04 = f13;
        this.A00 = f14;
        this.A0G = z10;
        this.A0B = i14;
        this.A09 = i13;
        this.A05 = f12;
        this.A0A = i15;
        this.A03 = f15;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.ads.redexgen.core.C2565o2 A00(android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2565o2.A00(android.os.Bundle):com.facebook.ads.redexgen.X.o2");
    }

    public final C3C A02() {
        return new C3C(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2565o2 c2565o2 = (C2565o2) obj;
        if (TextUtils.equals(this.A0F, c2565o2.A0F) && this.A0E == c2565o2.A0E && this.A0D == c2565o2.A0D && (this.A0C != null ? !(c2565o2.A0C == null || !this.A0C.sameAs(c2565o2.A0C)) : c2565o2.A0C == null) && this.A01 == c2565o2.A01 && this.A07 == c2565o2.A07 && this.A06 == c2565o2.A06) {
            float f10 = this.A02;
            if (A0H[4].charAt(16) == 'F') {
                throw new RuntimeException();
            }
            A0H[6] = "OaHYrPsvOOcaJ1wPKUjhJjBsa";
            if (f10 == c2565o2.A02 && this.A08 == c2565o2.A08 && this.A04 == c2565o2.A04 && this.A00 == c2565o2.A00 && this.A0G == c2565o2.A0G && this.A0B == c2565o2.A0B && this.A09 == c2565o2.A09 && this.A05 == c2565o2.A05 && this.A0A == c2565o2.A0A && this.A03 == c2565o2.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return BX.A00(this.A0F, this.A0E, this.A0D, this.A0C, Float.valueOf(this.A01), Integer.valueOf(this.A07), Integer.valueOf(this.A06), Float.valueOf(this.A02), Integer.valueOf(this.A08), Float.valueOf(this.A04), Float.valueOf(this.A00), Boolean.valueOf(this.A0G), Integer.valueOf(this.A0B), Integer.valueOf(this.A09), Float.valueOf(this.A05), Integer.valueOf(this.A0A), Float.valueOf(this.A03));
    }
}
