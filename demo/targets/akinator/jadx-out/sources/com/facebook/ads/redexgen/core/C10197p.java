package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.7p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10197p {
    public static byte[] A02;
    public static String[] A03 = {"n0jQ8SeFa80EBLo4BXhwXwPS4Wjubjck", "v64BeMF4Y1fRwWGkqW0btQJWsOcnPY4V", "TgQc", "Ri1mjPnDGJYW0mGh81XgbTSSpeaxgcJq", "RtYQoh190WxakJNXNOvGF0rP0AmdpNRb", "fbDVM5YfIDSRqB6n56hfMufsgfpcQx7k", "HNWTUdzo11zzvmCb4ifQA88FoSPuiiKn", "CiEa"};
    public static final C10197p A04;
    public static final C10197p A05;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Prevent throwing when building the map")
    public static final AbstractC2485mj<Integer, Integer> A06;
    public final int A00;
    public final int[] A01;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        byte[] bArr = {5, 9, 90, 92, 89, 89, 70, 91, 93, 76, 77, 108, 71, 74, 70, 77, 64, 71, 78, 90, 20, 81, 125, 113, 106, AbstractJsonLexerKt.TC_INVALID, 126, 6, 50, 35, 46, 40, 4, 38, 55, 38, 37, 46, 43, 46, 51, 46, 34, 52, 28, 42, 38, Utf8.REPLACEMENT_BYTE, 4, 47, 38, 41, 41, 34, 43, 4, 40, 50, 41, 51, 122, 123, 74, 66, 76, 78, 74, 68, 52, 59, 49, 39, 58, 60, 49, 123, 56, 48, 49, 60, 52, 123, 52, 54, 33, 60, 58, 59, 123, 29, 17, 24, 28, 10, 20, 0, 17, 28, 26, 10, 5, 25, 0, 18, 30, 17, 27, 13, 16, 22, 27, 81, 18, 26, 27, 22, 30, 81, 26, 7, 11, 13, 30, 81, 62, 42, 59, 54, 48, 32, 47, 51, 42, 56, 32, 44, 43, 62, 43, 58, 114, 125, 119, 97, 124, 122, 119, 61, 126, 118, 119, 122, 114, 61, 118, 107, 103, 97, 114, 61, 86, 93, 80, 92, 87, 90, 93, 84, 64, 17, 30, 20, 2, 31, 25, 20, 94, 29, 21, 20, 25, 17, 94, 21, 8, 4, 2, 17, 94, 61, 49, 40, 47, 51, 56, 49, 62, 62, 53, 60, 47, 51, Utf8.REPLACEMENT_BYTE, 37, 62, 36, 123, 102, 106, 123, 108, 112, AbstractJsonLexerKt.TC_INVALID, 114, 65, 109, 107, 108, 108, 113, 107, 112, 122, 65, 109, 113, 107, 112, 122, 65, 123, 112, AbstractJsonLexerKt.TC_INVALID, 124, 114, 123, 122, 117, 102, 116, 102};
        String[] strArr = A03;
        if (strArr[7].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "fFCHGQkYTOkakvUkxnOWQDFO0G2COwX4";
        strArr2[3] = "aKWONvT57JCa0OWG4uWHvxhg88ypYICi";
        A02 = bArr;
    }

    static {
        A06();
        A04 = new C10197p(new int[]{2}, 8);
        A05 = new C10197p(new int[]{2, 5, 6}, 8);
        A06 = new C2483mh().A05(5, 6).A05(17, 6).A05(7, 6).A05(18, 6).A05(6, 8).A05(8, 8).A05(14, 8).A07();
    }

    public C10197p(int[] iArr, int i10) {
        if (iArr != null) {
            this.A01 = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.A01);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(int r4) {
        /*
            int r1 = com.facebook.ads.redexgen.core.AbstractC09264a.A02
            r0 = 28
            if (r1 > r0) goto Lb
            r0 = 7
            if (r4 != r0) goto L2b
            r4 = 8
        Lb:
            int r1 = com.facebook.ads.redexgen.core.AbstractC09264a.A02
            r0 = 26
            if (r1 > r0) goto L26
            r2 = 237(0xed, float:3.32E-43)
            r1 = 4
            r0 = 55
            java.lang.String r1 = A05(r2, r1, r0)
            java.lang.String r0 = com.facebook.ads.redexgen.core.AbstractC09264a.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L26
            r0 = 1
            if (r4 != r0) goto L26
            r4 = 2
        L26:
            int r0 = com.facebook.ads.redexgen.core.AbstractC09264a.A01(r4)
            return r0
        L2b:
            r0 = 3
            if (r4 == r0) goto L65
            r3 = 4
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C10197p.A03
            r0 = 1
            r1 = r1[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            r0 = 49
            if (r1 == r0) goto L6d
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10197p.A03
            java.lang.String r1 = "n1qXVCZQxk2N8nhnGA5Su8h2HHCkXbDi"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "3IkXI2X5X2wTbaqU0wEl3DE4dRdq07f0"
            r0 = 3
            r2[r0] = r1
            if (r4 == r3) goto L65
            r3 = 5
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C10197p.A03
            r0 = 0
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L67
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10197p.A03
            java.lang.String r1 = "tECYq4G9CXONPArggxwQRVOEprBCIxCW"
            r0 = 1
            r2[r0] = r1
            if (r4 != r3) goto Lb
        L65:
            r4 = 6
            goto Lb
        L67:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10197p.A00(int):int");
    }

    public static int A01(int i10, int i11) {
        if (AbstractC09264a.A02 >= 29) {
            return C10187o.A00(i10, i11);
        }
        Integer orDefault = A06.getOrDefault(Integer.valueOf(i10), 0);
        if (A03[1].charAt(21) == '1') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[5] = "4LwyKZxV9xzADs3TG4HwkSSUmTpMdFHu";
        strArr[4] = "TU5gCkHzG3bOz42CgVjxZ9enmRnhlx9h";
        return ((Integer) C3M.A01(orDefault)).intValue();
    }

    public static C10197p A02(Context context) {
        Intent intent = context.registerReceiver(null, new IntentFilter(A05(68, 36, 113)));
        return A03(context, intent);
    }

    public static C10197p A03(Context context, Intent intent) {
        if (A07() && Settings.Global.getInt(context.getContentResolver(), A05(206, 31, 58), 0) == 1) {
            return A05;
        }
        if (AbstractC09264a.A02 >= 29 && (AbstractC09264a.A18(context) || AbstractC09264a.A17(context))) {
            return new C10197p(C10187o.A01(), 8);
        }
        if (intent == null || intent.getIntExtra(A05(104, 36, 91), 0) == 0) {
            return A04;
        }
        return new C10197p(intent.getIntArrayExtra(A05(140, 29, 55)), intent.getIntExtra(A05(169, 37, 84), 8));
    }

    public static boolean A07() {
        if (AbstractC09264a.A02 >= 17) {
            if (A05(21, 6, 52).equals(AbstractC09264a.A05) || A05(61, 6, 7).equals(AbstractC09264a.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> A09(com.facebook.ads.redexgen.core.C2614or r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.A0W
            java.lang.Object r1 = com.facebook.ads.redexgen.core.C3M.A01(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r9.A0R
            int r4 = com.facebook.ads.redexgen.core.AbstractC08812h.A03(r1, r0)
            com.facebook.ads.redexgen.X.mj<java.lang.Integer, java.lang.Integer> r1 = com.facebook.ads.redexgen.core.C10197p.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r1.containsKey(r0)
            r7 = 0
            if (r0 != 0) goto L1c
            return r7
        L1c:
            r6 = 18
            if (r4 != r6) goto L2e
            boolean r0 = r8.A0A(r6)
            if (r0 != 0) goto L2e
            r4 = 6
        L27:
            boolean r0 = r8.A0A(r4)
            if (r0 != 0) goto L3a
            return r7
        L2e:
            r0 = 8
            if (r4 != r0) goto L27
            boolean r0 = r8.A0A(r0)
            if (r0 != 0) goto L27
            r4 = 7
            goto L27
        L3a:
            int r5 = r9.A06
            r3 = -1
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10197p.A03
            r0 = 7
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L55
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L55:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10197p.A03
            java.lang.String r1 = "4KpokJkqLEvhjIg40C82zBlUQNBiJ4Nh"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "qYsciqDft0GPV223mm2sV4x00h8r6ql4"
            r0 = 3
            r2[r0] = r1
            if (r5 == r3) goto L65
            if (r4 != r6) goto L9f
        L65:
            int r5 = r9.A0G
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C10197p.A03
            r0 = 1
            r1 = r1[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            r0 = 49
            if (r1 == r0) goto L8c
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10197p.A03
            java.lang.String r1 = "PeibxLIDNQepcsKrVJzxdcnxdYsUjYYR"
            r0 = 0
            r2[r0] = r1
            if (r5 == r3) goto L9b
        L7f:
            int r0 = r9.A0G
        L81:
            int r1 = A01(r4, r0)
        L85:
            int r0 = A00(r1)
            if (r0 != 0) goto La6
            return r7
        L8c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10197p.A03
            java.lang.String r1 = "BgZH8BuYmZ4E43z5yTU6VaJsu5Ivkzql"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "qg4irZvxQMOGKPEC5vFhWWygbOBgLyYA"
            r0 = 3
            r2[r0] = r1
            if (r5 == r3) goto L9b
            goto L7f
        L9b:
            r0 = 48000(0xbb80, float:6.7262E-41)
            goto L81
        L9f:
            int r1 = r9.A06
            int r0 = r8.A00
            if (r1 <= r0) goto L85
            return r7
        La6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10197p.A09(com.facebook.ads.redexgen.X.or):android.util.Pair");
    }

    public final boolean A0A(int i10) {
        return Arrays.binarySearch(this.A01, i10) >= 0;
    }

    public final boolean A0B(C2614or c2614or) {
        return A09(c2614or) != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10197p)) {
            return false;
        }
        C10197p c10197p = (C10197p) obj;
        return Arrays.equals(this.A01, c10197p.A01) && this.A00 == c10197p.A00;
    }

    public final int hashCode() {
        return this.A00 + (Arrays.hashCode(this.A01) * 31);
    }

    public final String toString() {
        return A05(27, 34, 99) + this.A00 + A05(0, 21, 13) + Arrays.toString(this.A01) + A05(67, 1, 61);
    }
}
