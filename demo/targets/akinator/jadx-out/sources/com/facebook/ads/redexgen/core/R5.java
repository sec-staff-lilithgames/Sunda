package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Build;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class R5 {
    public static byte[] A04;
    public static String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final Intent A00;
    public final R0 A01;
    public final C1937dL A02;
    public final US A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private C1353Lc A06() {
        AnonymousClass77 anonymousClass77A02 = A02();
        if (anonymousClass77A02 == null) {
            return null;
        }
        LY ly = new LY();
        return new C1353Lc(this.A02, this.A03, new C2096fw(this.A01), anonymousClass77A02, null, ly, A0K(ly, anonymousClass77A02));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private C1353Lc A07() {
        AnonymousClass73 anonymousClass73A03 = A03();
        if (anonymousClass73A03 == null) {
            return null;
        }
        LX lx = new LX();
        return new C1353Lc(this.A02, this.A03, new C6P(this.A01), anonymousClass73A03, anonymousClass73A03.A1A(), lx, A0K(lx, anonymousClass73A03));
    }

    public static String A0L(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A04 = new byte[]{99, AbstractJsonLexerKt.TC_INVALID, 4, 1, 58, 1, 4, 17, 4, 58, 7, 16, 11, 1, 9, 0, 43, 41, 36, 36, 45, 58, 28, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, 26, 38, 41, 44, 38, 46, 26, 33, 32, 41, 36, 60, 26, 40, 54, 124, 115, 102, 123, 100, 119, 83, 118, 86, 115, 102, 115, 80, 103, 124, 118, 126, 119, 106, 118, 123, 121, AbstractJsonLexerKt.TC_INVALID, 119, AbstractJsonLexerKt.TC_INVALID, 116, 110, 32, 55, 37, 51, 32, 54, 55, 54, 4, 59, 54, 55, 61, 19, 54, 22, 51, 38, 51, 16, 39, 60, 54, 62, 55, 22, 9, 4, 5, 15, Utf8.REPLACEMENT_BYTE, 20, 9, 13, 5, Utf8.REPLACEMENT_BYTE, 16, 15, 12, 12, 9, 14, 7, Utf8.REPLACEMENT_BYTE, 9, 14, 20, 5, 18, 22, 1, 12};
    }

    static {
        A0M();
    }

    public R5(R0 r02, Intent intent, US us, C1937dL c1937dL) {
        this.A01 = r02;
        this.A00 = intent;
        this.A03 = us;
        this.A02 = c1937dL;
    }

    private AbstractC2212hy A00() {
        int i10 = Build.VERSION.SDK_INT;
        String strA0L = A0L(68, 18, 41);
        if (i10 >= 33) {
            return (AbstractC2212hy) this.A00.getSerializableExtra(strA0L, AbstractC2212hy.class);
        }
        Intent intent = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (AbstractC2212hy) intent.getSerializableExtra(strA0L);
    }

    private C2210hw A01() {
        int i10 = Build.VERSION.SDK_INT;
        String strA0L = A0L(26, 19, 47);
        if (i10 >= 33) {
            return (C2210hw) this.A00.getSerializableExtra(strA0L, C2210hw.class);
        }
        return (C2210hw) this.A00.getSerializableExtra(strA0L);
    }

    private AnonymousClass77 A02() {
        int i10 = Build.VERSION.SDK_INT;
        String strA0L = A0L(2, 14, 94);
        if (i10 >= 33) {
            return (AnonymousClass77) this.A00.getSerializableExtra(strA0L, AnonymousClass77.class);
        }
        return (AnonymousClass77) this.A00.getSerializableExtra(strA0L);
    }

    private AnonymousClass73 A03() {
        int i10 = Build.VERSION.SDK_INT;
        String strA0L = A0L(95, 25, 105);
        if (i10 >= 33) {
            return (AnonymousClass73) this.A00.getSerializableExtra(strA0L, AnonymousClass73.class);
        }
        return (AnonymousClass73) this.A00.getSerializableExtra(strA0L);
    }

    private InterfaceC1669Xo A05() throws NumberFormatException {
        if (U7.A2o(this.A02)) {
            String stringExtra = this.A00.getStringExtra(A0L(45, 23, 126));
            R0 r02 = this.A01;
            C1937dL c1937dL = this.A02;
            US us = this.A03;
            C2096fw c2096fw = new C2096fw(this.A01);
            Intent intent = this.A00;
            String clickDelayMs = A0L(16, 10, 115);
            String stringExtra2 = intent.getStringExtra(clickDelayMs);
            if (stringExtra == null) {
                stringExtra = A0L(0, 2, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            }
            int i10 = Integer.parseInt(stringExtra);
            if (A05[5].charAt(3) != 'i') {
                throw new RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new C6H(r02, c1937dL, us, c2096fw, stringExtra2, i10);
        }
        return new OD(this.A01, this.A02, this.A03, new C2096fw(this.A01));
    }

    private final C1352Lb A08() {
        return new C1352Lb(this.A02, this.A01);
    }

    private LZ A09(RelativeLayout relativeLayout) {
        LZ lz = new LZ(this.A02, new C2095fv(this), this.A03, new C2096fw(this.A01));
        lz.A05(relativeLayout);
        lz.A04(this.A00.getIntExtra(A0L(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 27, 91), 200));
        XP.A0K(relativeLayout, -16777216);
        return lz;
    }

    private C5K A0A() {
        AnonymousClass77 anonymousClass77A02 = A02();
        if (anonymousClass77A02 == null) {
            return null;
        }
        return new C5K(this.A02, this.A03, new C2096fw(this.A01), anonymousClass77A02, new LY(), 1);
    }

    private C5K A0B() {
        AnonymousClass73 anonymousClass73A03 = A03();
        if (anonymousClass73A03 == null) {
            return null;
        }
        return new C5K(this.A02, this.A03, new C2096fw(this.A01), anonymousClass73A03, new LX(), 0);
    }

    private IG A0C() {
        C1848bt c1848btA02;
        AbstractC2212hy abstractC2212hyA00 = A00();
        if (abstractC2212hyA00 == null || (c1848btA02 = AbstractC1849bu.A02(abstractC2212hyA00.A17())) == null) {
            return null;
        }
        return new IG(this.A02, new C2096fw(this.A01), c1848btA02, abstractC2212hyA00.A25());
    }

    private C1220Fy A0D(EnumC1607Vb enumC1607Vb) {
        YY lx;
        InterfaceC1668Xn c6p;
        C2210hw c2210hwA01 = A01();
        if (c2210hwA01 == null) {
            return null;
        }
        if (enumC1607Vb == EnumC1607Vb.A04) {
            lx = new LY();
            c6p = new C2096fw(this.A01);
        } else {
            lx = new LX();
            c6p = new C6P(this.A01);
        }
        return new C1220Fy(this.A02, lx, this.A03, c2210hwA01, new SF(this.A02), c6p);
    }

    private C4H A0E() {
        AnonymousClass77 anonymousClass77A02 = A02();
        if (anonymousClass77A02 != null) {
            return new C4H(this.A02, new LY(), this.A03, anonymousClass77A02, new SF(this.A02), new C2096fw(this.A01));
        }
        if (A05[1].charAt(5) != 'X') {
            throw new RuntimeException();
        }
        A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
        return null;
    }

    private C09173r A0F() {
        AnonymousClass77 anonymousClass77A02 = A02();
        if (anonymousClass77A02 == null) {
            return null;
        }
        return new C09173r(this.A02, new LY(), this.A03, anonymousClass77A02, new SF(this.A02), new C2096fw(this.A01));
    }

    private C09173r A0G() {
        AnonymousClass73 anonymousClass73A03 = A03();
        if (anonymousClass73A03 == null) {
            return null;
        }
        return new C09173r(this.A02, new LX(), this.A03, anonymousClass73A03, new SF(this.A02), new C6P(this.A01));
    }

    private FL A0H() {
        AnonymousClass73 anonymousClass73A03;
        AnonymousClass73 anonymousClass73A032 = A03();
        if (anonymousClass73A032 == null || (anonymousClass73A03 = A03()) == null) {
            return null;
        }
        return new FL(this.A02, this.A03, anonymousClass73A032, anonymousClass73A03, new C6P(this.A01), this.A01);
    }

    private C09163q A0I() {
        AnonymousClass77 dataBundle = A02();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A1G(this.A01.A08());
        return new C09163q(this.A02, this.A03, new SF(this.A02), new C2096fw(this.A01), dataBundle);
    }

    private C09163q A0J() {
        AnonymousClass73 dataBundle = A03();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A1G(this.A01.A08());
        return new C09163q(this.A02, this.A03, new SF(this.A02), new C2096fw(this.A01), dataBundle);
    }

    private C1916cz A0K(YY yy, AbstractC2212hy abstractC2212hy) {
        NB nbA07 = abstractC2212hy.A20().A0H().A07();
        if (nbA07 == null || !nbA07.A0M()) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(A0L(86, 9, 33), yy.A8d());
        return new C1916cz(this.A02, abstractC2212hy, nbA07, this.A03, null, map);
    }

    public final InterfaceC1669Xo A0N(EnumC1607Vb enumC1607Vb, RelativeLayout relativeLayout) {
        if (enumC1607Vb == null) {
            return null;
        }
        switch (R4.A00[enumC1607Vb.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A09(relativeLayout);
                }
                return null;
            case 2:
                return A0J();
            case 3:
                return A0G();
            case 4:
                return A07();
            case 5:
                return A05();
            case 6:
                C09173r c09173rA0F = A0F();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return c09173rA0F;
                }
                String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return c09173rA0F;
            case 7:
                return A0E();
            case 8:
                return A0I();
            case 9:
                return A06();
            case 10:
                return A0C();
            case 11:
                C5K c5kA0A = A0A();
                if (A05[5].charAt(3) != 'i') {
                    throw new RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return c5kA0A;
            case 12:
                return A0B();
            case 13:
            case 14:
                return A0D(enumC1607Vb);
            case 15:
                return A08();
            case 16:
                return A0H();
            default:
                return null;
        }
    }
}
