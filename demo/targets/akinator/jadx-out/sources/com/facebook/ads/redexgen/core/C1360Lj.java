package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Lj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1360Lj {
    public static byte[] A0W;
    public static String[] A0X = {"lVJcyHuE1PJb579Sb1LAAlg5vS4NZYMV", "qyLkbqfl0JpOOnDgJdZjiTPjgkzmhXwK", "qCNdEz7ripOZNNb3yCY8Ki49zW8UWRt4", "Cjqz4QIw8w0k6KevPFem8GYP4yUKgFOK", "ptM4eVx6M57F8Ll6MNcW2L659ErB2sOY", "McIwIiSAB", "OKPGVpQZykPiX00cv", "DTBK8GKi"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final C1358Lh A0H;
    public final C1359Li A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final Map<String, String> A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0W, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 89);
            if (A0X[4].charAt(24) == 'w') {
                throw new RuntimeException();
            }
            A0X[3] = "PXVGXjtmkErHxa13ZrhtcOEvw3ek";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0W = new byte[]{72, 68};
    }

    static {
        A01();
    }

    public C1360Lj() {
        this(A00(0, 0, 39), -1L, false, -1, -1, -1, -1, false, false, -1, -1L, new C1359Li(), -1L, false, -1, -1, -1L, -1L, -1, null, -1, null, null, C1358Lh.A02, -1, false, A00(0, 0, 39), A00(0, 0, 39), A00(0, 0, 39), null, -1L, -1L);
    }

    public C1360Lj(C1360Lj c1360Lj) {
        this(c1360Lj, c1360Lj.A0N);
    }

    public C1360Lj(C1360Lj c1360Lj, String str) {
        this(c1360Lj.A0M, c1360Lj.A0A, c1360Lj.A0T, c1360Lj.A08, c1360Lj.A07, c1360Lj.A00, c1360Lj.A09, c1360Lj.A0V, c1360Lj.A0S, c1360Lj.A05, c1360Lj.A0C, c1360Lj.A0I, c1360Lj.A0F, c1360Lj.A0U, c1360Lj.A06, c1360Lj.A02, c1360Lj.A0E, c1360Lj.A0B, c1360Lj.A01, c1360Lj.A0Q, c1360Lj.A04, c1360Lj.A0K, c1360Lj.A0J, c1360Lj.A0H, c1360Lj.A03, c1360Lj.A0R, c1360Lj.A0O, c1360Lj.A0L, c1360Lj.A0P, str, -1L, -1L);
    }

    public C1360Lj(String str, long j10, boolean z10, int i10, int i11, int i12, int i13, boolean z11, boolean z12, int i14, long j11, C1359Li c1359Li, long j12, boolean z13, int i15, int i16, long j13, long j14, int i17, Map<String, String> map, int i18, String str2, String str3, C1358Lh c1358Lh, int i19, boolean z14, String str4, String str5, String str6, String str7, long j15, long j16) {
        this.A0Q = new HashMap();
        this.A0M = str;
        this.A0A = j10;
        this.A0T = z10;
        this.A08 = i10;
        this.A07 = i11;
        this.A00 = i12;
        this.A09 = i13;
        this.A0V = z11;
        this.A0S = z12;
        this.A05 = i14;
        this.A0C = j11;
        this.A0I = c1359Li;
        this.A0F = j12;
        this.A0U = z13;
        this.A06 = i15;
        this.A02 = i16;
        this.A0E = j13;
        this.A0B = j14;
        this.A01 = i17;
        this.A04 = i18;
        this.A0J = str3;
        this.A0K = str2;
        if (map != null) {
            this.A0Q.putAll(map);
        }
        this.A0H = c1358Lh;
        this.A03 = i19;
        this.A0R = z14;
        this.A0O = str4;
        this.A0L = str5;
        this.A0P = str6;
        this.A0N = str7;
        this.A0G = j15;
        this.A0D = j16;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(this.A0M);
        String strA00 = A00(0, 2, 61);
        return sbAppend.append(strA00).append(this.A0A).append(strA00).append(this.A0T).append(strA00).append(this.A08).append(strA00).append(this.A07).append(strA00).append(this.A00).append(strA00).append(this.A09).append(strA00).append(this.A0V).append(strA00).append(this.A0S).append(strA00).append(this.A05).append(strA00).append(this.A0E).append(strA00).append(this.A0B).append(strA00).append(this.A01).append(strA00).append(this.A04).append(strA00).append(this.A06).append(strA00).append(this.A02).append(strA00).append(this.A03).append(strA00).append(this.A0R).append(strA00).append(this.A0O).toString();
    }
}
