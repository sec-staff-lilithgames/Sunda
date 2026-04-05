package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.og, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2603og implements C1S {
    public final Uri A00;
    public final Uri A01;
    public final Bundle A02;
    public final AbstractC2592oU A03;
    public final AbstractC2592oU A04;
    public final Boolean A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final CharSequence A0A;
    public final CharSequence A0B;
    public final CharSequence A0C;
    public final CharSequence A0D;
    public final CharSequence A0E;
    public final CharSequence A0F;
    public final CharSequence A0G;
    public final CharSequence A0H;
    public final CharSequence A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Integer A0O;
    public final Integer A0P;
    public final Integer A0Q;
    public final Integer A0R;
    public final Integer A0S;
    public final Integer A0T;
    public final Integer A0U;

    @Deprecated
    public final Integer A0V;
    public final byte[] A0W;
    public static String[] A0X = {"zubbJHIGN62aQpEy91CnZekmJL7fZhcj", "Tf6Wii3TFEDBDD0h8UvX5qaY8eXSzTkW", "PzB8ZoZFbpUrc7pgJ0ghLttm", "08PAkH52X5piiuzTKugWbIZJ7g2fzjWB", "K8DhncAAf645aMURmZckD", "VnMvQYKg2m3XsU3GlEglt4TQFPWPFThI", "CnA0hK2Gvuh", "oHxylVIJyzccCX3kgnuGG4BXvpn"};
    public static final C2603og A0Z = new C2V().A11();
    public static final C1R<C2603og> A0Y = new C1R() { // from class: com.facebook.ads.redexgen.X.oh
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2603og.A00(bundle);
        }
    };

    public C2603og(C2V c2v) {
        this.A0H = c2v.A0H;
        this.A08 = c2v.A08;
        this.A07 = c2v.A07;
        this.A06 = c2v.A06;
        this.A0D = c2v.A0D;
        this.A0G = c2v.A0G;
        this.A0C = c2v.A0C;
        this.A01 = c2v.A01;
        this.A04 = c2v.A04;
        this.A03 = c2v.A03;
        this.A0W = c2v.A0V;
        this.A0J = c2v.A0J;
        this.A00 = c2v.A00;
        this.A0U = c2v.A0U;
        this.A0T = c2v.A0T;
        this.A0L = c2v.A0L;
        this.A05 = c2v.A05;
        this.A0V = c2v.A0O;
        this.A0O = c2v.A0O;
        this.A0N = c2v.A0N;
        this.A0M = c2v.A0M;
        this.A0R = c2v.A0R;
        this.A0Q = c2v.A0Q;
        this.A0P = c2v.A0P;
        this.A0I = c2v.A0I;
        this.A0A = c2v.A0A;
        this.A0B = c2v.A0B;
        this.A0K = c2v.A0K;
        this.A0S = c2v.A0S;
        this.A0E = c2v.A0E;
        this.A09 = c2v.A09;
        this.A0F = c2v.A0F;
        this.A02 = c2v.A02;
    }

    public static C2603og A00(Bundle bundle) {
        Integer numValueOf;
        Bundle fieldBundle;
        Bundle fieldBundle2;
        C2V c2v = new C2V();
        C2V c2vA0X = c2v.A0n(bundle.getCharSequence(A02(0))).A0e(bundle.getCharSequence(A02(1))).A0d(bundle.getCharSequence(A02(2))).A0c(bundle.getCharSequence(A02(3))).A0j(bundle.getCharSequence(A02(4))).A0m(bundle.getCharSequence(A02(5))).A0i(bundle.getCharSequence(A02(6))).A0X((Uri) bundle.getParcelable(A02(7)));
        byte[] byteArray = bundle.getByteArray(A02(10));
        if (bundle.containsKey(A02(29))) {
            numValueOf = Integer.valueOf(bundle.getInt(A02(29)));
        } else {
            numValueOf = null;
        }
        c2vA0X.A10(byteArray, numValueOf).A0W((Uri) bundle.getParcelable(A02(11))).A0o(bundle.getCharSequence(A02(22))).A0g(bundle.getCharSequence(A02(23))).A0h(bundle.getCharSequence(A02(24))).A0k(bundle.getCharSequence(A02(27))).A0f(bundle.getCharSequence(A02(28))).A0l(bundle.getCharSequence(A02(30))).A0Y(bundle.getBundle(A02(1000)));
        if (bundle.containsKey(A02(8)) && (fieldBundle2 = bundle.getBundle(A02(8))) != null) {
            c2v.A0a((AbstractC2592oU) AbstractC2592oU.A03.A6X(fieldBundle2));
        }
        if (bundle.containsKey(A02(9)) && (fieldBundle = bundle.getBundle(A02(9))) != null) {
            c2v.A0Z((AbstractC2592oU) AbstractC2592oU.A03.A6X(fieldBundle));
        }
        if (bundle.containsKey(A02(12))) {
            c2v.A0z(Integer.valueOf(bundle.getInt(A02(12))));
        }
        if (bundle.containsKey(A02(13))) {
            c2v.A0y(Integer.valueOf(bundle.getInt(A02(13))));
        }
        if (bundle.containsKey(A02(14))) {
            c2v.A0q(Integer.valueOf(bundle.getInt(A02(14))));
        }
        if (bundle.containsKey(A02(15))) {
            c2v.A0b(Boolean.valueOf(bundle.getBoolean(A02(15))));
        }
        if (bundle.containsKey(A02(16))) {
            c2v.A0t(Integer.valueOf(bundle.getInt(A02(16))));
        }
        if (bundle.containsKey(A02(17))) {
            c2v.A0s(Integer.valueOf(bundle.getInt(A02(17))));
        }
        if (bundle.containsKey(A02(18))) {
            c2v.A0r(Integer.valueOf(bundle.getInt(A02(18))));
        }
        if (bundle.containsKey(A02(19))) {
            c2v.A0w(Integer.valueOf(bundle.getInt(A02(19))));
        }
        if (bundle.containsKey(A02(20))) {
            c2v.A0v(Integer.valueOf(bundle.getInt(A02(20))));
        }
        if (bundle.containsKey(A02(21))) {
            c2v.A0u(Integer.valueOf(bundle.getInt(A02(21))));
        }
        if (bundle.containsKey(A02(25))) {
            c2v.A0p(Integer.valueOf(bundle.getInt(A02(25))));
        }
        if (bundle.containsKey(A02(26))) {
            c2v.A0x(Integer.valueOf(bundle.getInt(A02(26))));
        }
        return c2v.A11();
    }

    public static String A02(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2603og.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return BX.A00(this.A0H, this.A08, this.A07, this.A06, this.A0D, this.A0G, this.A0C, this.A01, this.A04, this.A03, Integer.valueOf(Arrays.hashCode(this.A0W)), this.A0J, this.A00, this.A0U, this.A0T, this.A0L, this.A05, this.A0O, this.A0N, this.A0M, this.A0R, this.A0Q, this.A0P, this.A0I, this.A0A, this.A0B, this.A0K, this.A0S, this.A0E, this.A09, this.A0F);
    }
}
