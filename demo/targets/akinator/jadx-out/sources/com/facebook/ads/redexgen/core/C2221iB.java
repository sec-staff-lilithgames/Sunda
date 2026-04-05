package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.iB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2221iB implements MK {
    public static byte[] A0j;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final Uri A09;
    public final MJ A0A;
    public final AbstractC2212hy A0B;
    public final C1595Up A0C;
    public final C1595Up A0D;
    public final C1595Up A0E;
    public final C1596Uq A0F;
    public final EnumC1600Uu A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final Collection<String> A0d;
    public final List<C2221iB> A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;

    static {
        A01();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 59 out of bounds for length 50
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C2221iB(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, C1595Up c1595Up, AbstractC2212hy abstractC2212hy, C1595Up c1595Up2, C1595Up c1595Up3, C1596Uq c1596Uq, String str16, String str17, long j10, EnumC1600Uu enumC1600Uu, boolean z10, int i10, int i11, List<C2221iB> list, String str18, String str19, int i12, String str20, Uri uri, String str21, boolean z11, boolean z12, int i13, int i14, int i15, int i16, MJ mj2, Collection<String> collection, int i17, boolean z13) {
        this.A0J = str;
        this.A0H = str2;
        this.A0V = str3;
        this.A0W = str4;
        this.A0T = str5;
        this.A0S = str6;
        this.A0L = str7;
        this.A0Q = str8;
        this.A0M = str9;
        this.A0R = str10;
        this.A0U = str11;
        this.A0P = str12;
        this.A0O = str13;
        this.A0N = str14;
        this.A0I = str15;
        this.A0C = c1595Up;
        this.A0B = abstractC2212hy;
        this.A0D = c1595Up2;
        this.A0E = c1595Up3;
        this.A0F = c1596Uq;
        this.A0c = str16;
        this.A0b = str17;
        this.A08 = j10;
        this.A0G = enumC1600Uu;
        this.A0g = z10;
        this.A0e = list;
        this.A0X = str18;
        this.A0Z = str19;
        this.A0K = A00(0, 9, 50);
        this.A02 = i10;
        this.A01 = i11;
        this.A00 = i12;
        this.A0Y = str20;
        this.A09 = uri;
        this.A0a = str21;
        this.A0h = z11;
        this.A0i = z12;
        this.A04 = i13;
        this.A05 = i14;
        this.A06 = i15;
        this.A07 = i16;
        this.A0A = mj2;
        this.A0d = collection;
        this.A03 = i17;
        this.A0f = z13;
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0j, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0j = new byte[]{-122, -87, -120, -83, -76, -82, -88, -86, -72};
    }

    public C2221iB() {
        this.A0J = null;
        this.A0H = null;
        this.A0V = null;
        this.A0W = null;
        this.A0T = null;
        this.A0S = null;
        this.A0L = null;
        this.A0Q = null;
        this.A0M = null;
        this.A0R = null;
        this.A0U = null;
        this.A0P = null;
        this.A0O = null;
        this.A0N = null;
        this.A0I = null;
        this.A0K = null;
        this.A0B = null;
        this.A0D = null;
        this.A0E = null;
        this.A0F = null;
        this.A0b = null;
        this.A0c = null;
        this.A0C = null;
        this.A08 = -1L;
        this.A0G = EnumC1600Uu.A03;
        this.A0g = false;
        this.A02 = -1;
        this.A01 = 0;
        this.A0f = false;
        String strA00 = A00(0, 0, 51);
        this.A0X = strA00;
        this.A0Z = strA00;
        this.A00 = 0;
        this.A0Y = null;
        this.A09 = null;
        this.A0a = null;
        this.A0h = false;
        this.A0i = false;
        this.A04 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        this.A0A = null;
        this.A0d = null;
        this.A03 = 0;
        this.A0e = null;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04() {
        return this.A02;
    }

    public final int A05() {
        return this.A03;
    }

    public final int A06() {
        return this.A04;
    }

    public final int A07() {
        return this.A05;
    }

    public final int A08() {
        return this.A06;
    }

    public final int A09() {
        return this.A07;
    }

    public final long A0A() {
        return this.A08;
    }

    public final Uri A0B() {
        return this.A09;
    }

    public final AbstractC2212hy A0C() {
        return this.A0B;
    }

    public final C1595Up A0D() {
        return this.A0C;
    }

    public final C1595Up A0E() {
        return this.A0E;
    }

    public final C1595Up A0F() {
        return this.A0D;
    }

    public final C1596Uq A0G() {
        return this.A0F;
    }

    public final EnumC1600Uu A0H() {
        return this.A0G;
    }

    public final String A0I() {
        return this.A0H;
    }

    public final String A0J() {
        return this.A0J;
    }

    public final String A0K() {
        return this.A0K;
    }

    public final String A0L() {
        return this.A0L;
    }

    public final String A0M() {
        return this.A0M;
    }

    public final String A0N() {
        return this.A0N;
    }

    public final String A0O() {
        return this.A0O;
    }

    public final String A0P() {
        return this.A0P;
    }

    public final String A0Q() {
        return this.A0Q;
    }

    public final String A0R() {
        return this.A0R;
    }

    public final String A0S() {
        return this.A0T;
    }

    public final String A0T() {
        return this.A0U;
    }

    public final String A0U() {
        return this.A0V;
    }

    public final String A0V() {
        return this.A0W;
    }

    public final String A0W() {
        return this.A0I;
    }

    public final String A0X() {
        return this.A0Y;
    }

    public final String A0Y() {
        return this.A0Z;
    }

    public final String A0Z() {
        return this.A0a;
    }

    public final String A0a() {
        return this.A0b;
    }

    public final String A0b() {
        return this.A0c;
    }

    public final List<C2221iB> A0c() {
        return this.A0e;
    }

    public final boolean A0d() {
        return this.A0f;
    }

    public final boolean A0e() {
        return this.A0g;
    }

    public final boolean A0f() {
        return this.A0h;
    }

    public final boolean A0g() {
        return this.A0i;
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final String A7G() {
        return this.A0X;
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final Collection<String> A7h() {
        return this.A0d;
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final MJ A8C() {
        return this.A0A;
    }
}
