package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.or, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2614or implements C1S {
    public static byte[] A0Z;
    public static String[] A0a = {"V6MXy8T8VWr2uYzGQHXNST8x6mkuL2zq", "NPPhtSRrwFXlj8s5Lf5pJApSSy7nWvZn", "Zwnng2X5IOM1TKGeykh69gCIqoxpb9rN", "EKOvtoarjvrGIuXcg3PsyJc7", "ZiMxAAQ9qCUD5Rc2p4Bdqy2u", "SqcuONG3eBJEqSGEKSqUXXYdrjOnl4qF", "9lDPTqOcDpJIt3QmxvZawHsHRg6Gfk5X", "1hwbvE9Xb2ACzfbNO0itJVr"};
    public static final C1R<C2614or> A0b;
    public static final C2614or A0c;
    public static final String A0d;
    public static final String A0e;
    public static final String A0f;
    public static final String A0g;
    public static final String A0h;
    public static final String A0i;
    public static final String A0j;
    public static final String A0k;
    public static final String A0l;
    public static final String A0m;
    public static final String A0n;
    public static final String A0o;
    public static final String A0p;
    public static final String A0q;
    public static final String A0r;
    public static final String A0s;
    public static final String A0t;
    public static final String A0u;
    public static final String A0v;
    public static final String A0w;
    public static final String A0x;
    public static final String A0y;
    public static final String A0z;
    public static final String A10;
    public static final String A11;
    public static final String A12;
    public static final String A13;
    public static final String A14;
    public static final String A15;
    public static final String A16;
    public static final String A17;
    public static final String A18;
    public static final String A19;
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final long A0M;
    public final ColorInfo A0N;
    public final DrmInitData A0O;
    public final Metadata A0P;
    public final Object A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final List<byte[]> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> T A02(T t10, T t11) {
        return t10 != null ? t10 : t11;
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Z, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0Z = new byte[]{-38, -50, 0, -12, 47, 32, 73, 76, 71, 59, 78, 2, 81, 29, 37, -12, -24, 35, 31};
    }

    static {
        A05();
        A0c = new C2D().A14();
        A0q = AbstractC09264a.A0h(0);
        A0s = AbstractC09264a.A0h(1);
        A0t = AbstractC09264a.A0h(2);
        A14 = AbstractC09264a.A0h(3);
        A10 = AbstractC09264a.A0h(4);
        A0e = AbstractC09264a.A0h(5);
        A0x = AbstractC09264a.A0h(6);
        A0g = AbstractC09264a.A0h(7);
        A0v = AbstractC09264a.A0h(8);
        A0i = AbstractC09264a.A0h(9);
        A12 = AbstractC09264a.A0h(10);
        A0u = AbstractC09264a.A0h(11);
        A0r = AbstractC09264a.A0h(12);
        A0k = AbstractC09264a.A0h(13);
        A16 = AbstractC09264a.A0h(14);
        A19 = AbstractC09264a.A0h(15);
        A0p = AbstractC09264a.A0h(16);
        A0o = AbstractC09264a.A0h(17);
        A11 = AbstractC09264a.A0h(18);
        A0y = AbstractC09264a.A0h(19);
        A0z = AbstractC09264a.A0h(20);
        A15 = AbstractC09264a.A0h(21);
        A0h = AbstractC09264a.A0h(22);
        A0f = AbstractC09264a.A0h(23);
        A13 = AbstractC09264a.A0h(24);
        A0w = AbstractC09264a.A0h(25);
        A0l = AbstractC09264a.A0h(26);
        A0m = AbstractC09264a.A0h(27);
        A0d = AbstractC09264a.A0h(28);
        A0j = AbstractC09264a.A0h(29);
        A17 = AbstractC09264a.A0h(30);
        A18 = AbstractC09264a.A0h(31);
        A0n = AbstractC09264a.A0h(32);
        A0b = new C1R() { // from class: com.facebook.ads.redexgen.X.ot
            @Override // com.facebook.ads.redexgen.core.C1R
            public final C1S A6X(Bundle bundle) {
                return C2614or.A00(bundle);
            }
        };
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Language is not normalized")
    public C2614or(C2D c2d) {
        this.A0T = c2d.A0R;
        this.A0U = c2d.A0S;
        if (MetaExoPlayerUpgradeConfig.A03(EnumC2213i2.A0k)) {
            this.A0V = AbstractC09264a.A0k(c2d.A0T);
        } else {
            this.A0V = c2d.A0T;
        }
        this.A0H = c2d.A0F;
        this.A0E = c2d.A0C;
        this.A04 = c2d.A03;
        this.A0D = c2d.A0B;
        this.A05 = this.A0D != -1 ? this.A0D : this.A04;
        this.A0R = c2d.A0P;
        this.A0P = c2d.A0N;
        this.A0Q = c2d.A0O;
        this.A0S = c2d.A0Q;
        this.A0W = c2d.A0U;
        this.A0B = c2d.A09;
        this.A0X = c2d.A0V == null ? Collections.emptyList() : c2d.A0V;
        this.A0O = c2d.A0M;
        this.A0M = c2d.A0K;
        this.A0L = c2d.A0J;
        this.A0A = c2d.A08;
        this.A01 = c2d.A00;
        this.A0F = c2d.A0D == -1 ? 0 : c2d.A0D;
        this.A02 = c2d.A01 == -1.0f ? 1.0f : c2d.A01;
        this.A0Y = c2d.A0W;
        this.A0I = c2d.A0G;
        this.A0N = c2d.A0L;
        this.A06 = c2d.A04;
        this.A0G = c2d.A0E;
        this.A0C = c2d.A0A;
        this.A08 = c2d.A06 == -1 ? 0 : c2d.A06;
        this.A09 = c2d.A07 != -1 ? c2d.A07 : 0;
        this.A03 = c2d.A02;
        this.A0J = c2d.A0H;
        this.A0K = c2d.A0I;
        if (c2d.A05 != 0 || this.A0O == null) {
            this.A07 = c2d.A05;
        } else {
            this.A07 = 1;
        }
    }

    public static C2614or A00(Bundle bundle) {
        C2D c2d = new C2D();
        C3S.A02(bundle);
        c2d.A0y((String) A02(bundle.getString(A0q), A0c.A0T)).A0z((String) A02(bundle.getString(A0s), A0c.A0U)).A10((String) A02(bundle.getString(A0t), A0c.A0V)).A0n(bundle.getInt(A14, A0c.A0H)).A0k(bundle.getInt(A10, A0c.A0E)).A0a(bundle.getInt(A0e, A0c.A04)).A0j(bundle.getInt(A0x, A0c.A0D)).A0w((String) A02(bundle.getString(A0g), A0c.A0R)).A0v((Metadata) A02((Metadata) bundle.getParcelable(A0v), A0c.A0P)).A0x((String) A02(bundle.getString(A0i), A0c.A0S)).A11((String) A02(bundle.getString(A12), A0c.A0W)).A0h(bundle.getInt(A0u, A0c.A0B));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(A03(i10));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i10++;
        }
        c2d.A12(arrayList).A0u((DrmInitData) bundle.getParcelable(A0k)).A0s(bundle.getLong(A16, A0c.A0M)).A0r(bundle.getInt(A19, A0c.A0L)).A0f(bundle.getInt(A0p, A0c.A0A)).A0X(bundle.getFloat(A0o, A0c.A01)).A0l(bundle.getInt(A11, A0c.A0F)).A0Y(bundle.getFloat(A0y, A0c.A02)).A13(bundle.getByteArray(A0z)).A0o(bundle.getInt(A15, A0c.A0I));
        Bundle bundle2 = bundle.getBundle(A0h);
        if (bundle2 != null) {
            ColorInfo colorInfo = (ColorInfo) ColorInfo.A08.A6X(bundle2);
            String[] strArr = A0a;
            if (strArr[0].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0a;
            strArr2[0] = "Hj6q80mEs2TaNtyFDcR9WAdUhRzKpc2R";
            strArr2[2] = "QNxytj5q4fkMiXjNnIzm1WM2l3yCLldD";
            c2d.A0t(colorInfo);
        }
        c2d.A0b(bundle.getInt(A0f, A0c.A06)).A0m(bundle.getInt(A13, A0c.A0G)).A0i(bundle.getInt(A0w, A0c.A0C)).A0d(bundle.getInt(A0l, A0c.A08)).A0e(bundle.getInt(A0m, A0c.A09)).A0Z(bundle.getInt(A0d, A0c.A03)).A0p(bundle.getInt(A17, A0c.A0J)).A0q(bundle.getInt(A18, A0c.A0K)).A0c(bundle.getInt(A0j, A0c.A07));
        return c2d.A14();
    }

    public static String A03(int i10) {
        return A0r + A04(18, 1, 70) + Integer.toString(i10, 36);
    }

    public final int A06() {
        if (this.A0L == -1) {
            return -1;
        }
        int i10 = this.A0A;
        if (A0a[6].charAt(1) != 'l') {
            throw new RuntimeException();
        }
        A0a[7] = "26nMyN52vPpNzMdMA433IJJ";
        if (i10 == -1) {
            return -1;
        }
        return this.A0A * this.A0L;
    }

    public final C2D A07() {
        return new C2D(this);
    }

    public final C2614or A08(int i10) {
        return A07().A0c(i10).A14();
    }

    @Deprecated
    public final C2614or A09(DrmInitData drmInitData) {
        return A07().A0u(drmInitData).A14();
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0A(com.facebook.ads.redexgen.core.C2614or r5) {
        /*
            r4 = this;
            java.util.List<byte[]> r0 = r4.A0X
            int r1 = r0.size()
            java.util.List<byte[]> r0 = r5.A0X
            int r0 = r0.size()
            r3 = 0
            if (r1 == r0) goto L10
            return r3
        L10:
            r2 = 0
        L11:
            java.util.List<byte[]> r0 = r4.A0X
            int r0 = r0.size()
            if (r2 >= r0) goto L33
            java.util.List<byte[]> r0 = r4.A0X
            java.lang.Object r1 = r0.get(r2)
            byte[] r1 = (byte[]) r1
            java.util.List<byte[]> r0 = r5.A0X
            java.lang.Object r0 = r0.get(r2)
            byte[] r0 = (byte[]) r0
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L30
            return r3
        L30:
            int r2 = r2 + 1
            goto L11
        L33:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2614or.A0A(com.facebook.ads.redexgen.X.or):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2614or.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        if (this.A00 == 0) {
            int i10 = 17 * 31;
            int result = this.A0T == null ? 0 : this.A0T.hashCode();
            int result2 = (((i10 + result) * 31) + (this.A0U != null ? this.A0U.hashCode() : 0)) * 31;
            int result3 = this.A0V == null ? 0 : this.A0V.hashCode();
            int result4 = (((result2 + result3) * 31) + this.A0H) * 31;
            int result5 = this.A0E;
            int result6 = (((result4 + result5) * 31) + this.A04) * 31;
            int result7 = this.A0D;
            int i11 = (result6 + result7) * 31;
            if (this.A0R == null) {
                iHashCode = 0;
            } else {
                String str = this.A0R;
                String[] strArr = A0a;
                if (strArr[0].charAt(2) == strArr[2].charAt(2)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0a;
                strArr2[3] = "TXy1YAbF7Qkyl7ROldsNtIji";
                strArr2[4] = "lt4q3TmvSSK0Q54eRVJBBfw2";
                iHashCode = str.hashCode();
            }
            int result8 = (i11 + iHashCode) * 31;
            int result9 = this.A0P == null ? 0 : this.A0P.hashCode();
            int result10 = (((result8 + result9) * 31) + (this.A0Q == null ? 0 : this.A0Q.hashCode())) * 31;
            int result11 = this.A0S == null ? 0 : this.A0S.hashCode();
            int result12 = (result10 + result11) * 31;
            int iHashCode2 = this.A0W != null ? this.A0W.hashCode() : 0;
            int result13 = this.A0B;
            int result14 = (((((result12 + iHashCode2) * 31) + result13) * 31) + ((int) this.A0M)) * 31;
            int result15 = this.A0L;
            int result16 = (((result14 + result15) * 31) + this.A0A) * 31;
            int result17 = Float.floatToIntBits(this.A01);
            int result18 = (((result16 + result17) * 31) + this.A0F) * 31;
            int result19 = Float.floatToIntBits(this.A02);
            int result20 = (((result18 + result19) * 31) + this.A0I) * 31;
            int result21 = this.A06;
            int result22 = (((result20 + result21) * 31) + this.A0G) * 31;
            int result23 = this.A0C;
            int result24 = (((result22 + result23) * 31) + this.A08) * 31;
            int result25 = this.A09;
            int result26 = (((result24 + result25) * 31) + this.A03) * 31;
            int result27 = this.A0J;
            int result28 = (((result26 + result27) * 31) + this.A0K) * 31;
            int result29 = this.A07;
            this.A00 = result28 + result29;
        }
        return this.A00;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(A04(5, 7, 96)).append(this.A0T);
        String strA04 = A04(0, 2, 52);
        return sbAppend.append(strA04).append(this.A0U).append(strA04).append(this.A0S).append(strA04).append(this.A0W).append(strA04).append(this.A0R).append(strA04).append(this.A05).append(strA04).append(this.A0V).append(A04(2, 3, 90)).append(this.A0L).append(strA04).append(this.A0A).append(strA04).append(this.A01).append(A04(14, 4, 78)).append(this.A06).append(strA04).append(this.A0G).append(A04(12, 2, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)).toString();
    }
}
