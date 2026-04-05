package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7B extends AbstractC2220iA {
    public static SF A0D;
    public static byte[] A0E;
    public static String[] A0F = {"g9SdUg6XNSnvVCS02jX19aczyGq48qDV", "lGSQ9LsgX83H3UqklEPZgAjaPEKabNT0", "y0oXMo4BXc2on8MNFvJxgBv", "Ulfd9L14l0ScyK0QB689zsPu0EZ5wfqr", "W3xKKEfUMxBXJmvfztSkCM8j4ls7Vw3H", "lNYBpqeQZYlfeCveDiVEAZh", "rx8", "elj"};
    public long A00;
    public InterfaceC1384Mh A01;
    public C1385Mi A02;
    public AbstractC1390Mo A03;
    public C1937dL A04;
    public EnumC1607Vb A05;
    public C1848bt A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0E = new byte[]{-98, -16, -14, -14, -12, -5, -12, 1, -2, -4, -12, 3, -12, 1, -18, 1, -2, 3, -16, 3, -8, -2, -3, -58, -45, -60, -58, -56, -39, -50, -37, -50, -39, -34, 1, 6, -1, 7, 12, 3, 2, -33, 2, -30, -1, 18, -1, -32, 19, 12, 2, 10, 3, 29, 21, 20, 25, 17, 36, 25, 31, 30, -12, 17, 36, 17, 16, 12, 1, 3, 5, 13, 5, 14, 20, -23, 4, -68, -66, -79, -80, -79, -78, -75, -70, -79, -80, -101, -66, -75, -79, -70, -64, -83, -64, -75, -69, -70, -105, -79, -59, -17, -30, -18, -14, -30, -16, -15, -47, -26, -22, -30, -2, -15, 3, -19, -2, -16, -33, -15, -2, 2, -15, -2, -31, -34, -40, -13, -26, -8, -30, -13, -27, -26, -27, -41, -22, -27, -26, -16, -62, -27, -59, -30, -11, -30, -61, -10, -17, -27, -19, -26, 28, 15, 33, 11, 28, 14, 15, 14, 9, 32, 19, 14, 15, 25, -61, -68, -73, -65, -61, -77, -105, -78, -4, -17, -21, -3, -38, -1, -10, -21};
    }

    static {
        A09();
    }

    private void A07() {
        OO.A00(this.A04).A06(this.A02, this.A02.A00());
    }

    private void A08() {
        if (this.A02 != null) {
            try {
                OO.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A0A(Intent intent) {
        int i10 = super.A00;
        String strA05 = A05(77, 24, 25);
        if (i10 != -1 && Settings.System.getInt(this.A04.getContentResolver(), A05(1, 22, 92), 0) != 1) {
            int i11 = super.A00;
            String[] strArr = A0F;
            if (strArr[4].charAt(19) == strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "RWC7frN5DjKRH0uo4BJmLzj";
            strArr2[2] = "FPcb0UYEDF6wwONX6Ty9E2F";
            intent.putExtra(strA05, i11);
            return;
        }
        C1937dL c1937dL = this.A04;
        String[] strArr3 = A0F;
        if (strArr3[7].length() == strArr3[6].length()) {
            String[] strArr4 = A0F;
            strArr4[5] = "O4w3do1khQsKhsE3USwlJ7C";
            strArr4[2] = "rALKIAVwphrvKmHx0hqaLzY";
            if (U7.A0h(c1937dL)) {
                return;
            }
        } else if (U7.A0h(c1937dL)) {
            return;
        }
        intent.putExtra(strA05, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(final C1937dL c1937dL, final C2210hw c2210hw, final int i10) {
        if (i10 >= c2210hw.A1u()) {
            return;
        }
        final AnonymousClass73 anonymousClass73 = (AnonymousClass73) c2210hw.A1x(i10);
        A0D = new SF(c1937dL);
        A0D.A0e(new C1580Ua(anonymousClass73.A25(), c1937dL.A0A()));
        NS.A02(c1937dL, A0D, anonymousClass73);
        final boolean z10 = i10 == 0;
        A0D.A0X(new AbstractC2187hU(z10) { // from class: com.facebook.ads.redexgen.X.7C
            @Override // com.facebook.ads.redexgen.core.AbstractC2187hU
            public final void A00() {
                this.A01.A01.AF7(this.A01, AdError.CACHE_ERROR);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2187hU
            public final void A01(boolean z11) {
                C7B.A0D = null;
                if (z11) {
                    c1937dL.A01().AIU(anonymousClass73.A25(), c2210hw.A1y());
                }
                if (i10 == 0) {
                    this.A01.A0C.set(true);
                    this.A01.A01.AF4(this.A01);
                }
                this.A01.A0C(c1937dL, c2210hw, i10 + 1);
            }
        }, new S8(anonymousClass73.A17(), A05(152, 14, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), i10));
    }

    private void A0D(boolean z10) {
        if (this.A05 == EnumC1607Vb.A0F) {
            A0F(z10);
            return;
        }
        if (this.A05 == EnumC1607Vb.A0H) {
            A0G(z10);
        } else if (this.A05 == EnumC1607Vb.A0G) {
            A0E(z10);
        } else {
            A0G(z10);
        }
    }

    private void A0E(boolean z10) {
        SF sf2 = new SF(this.A04);
        boolean z11 = U7.A2A(this.A04) && C1509Rf.A0A(this.A03.A1C());
        if (z11) {
            C1509Rf unifiedAssetsLoader = new C1509Rf(sf2, this.A03.A1C(), this.A03.A0v(), this.A03.A17(), z11, new C2228iI(this));
            sf2.A0e(new C1580Ua(((AbstractC2212hy) this.A03).A25(), this.A04.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        NR.A02(this.A04, (AbstractC2212hy) this.A03, z10, new C2227iH(this));
    }

    private void A0F(boolean z10) {
        SF sf2 = new SF(this.A04);
        sf2.A0e(new C1580Ua(((AbstractC2212hy) this.A03).A25(), this.A04.A0A()));
        NS.A03(this.A04, sf2, (AnonymousClass73) this.A03);
        sf2.A0X(new C2232iM(this), new S8(this.A03.A17(), A05(152, 14, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)));
    }

    private void A0G(boolean z10) {
        boolean z11 = false;
        if (this.A03.A1T()) {
            C2210hw c2210hw = (C2210hw) this.A03;
            for (int i10 = 0; i10 < c2210hw.A1u(); i10++) {
                if (TextUtils.isEmpty(c2210hw.A1x(i10).A20().A0H().A09())) {
                    this.A01.AF7(this, AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0C(this.A04, c2210hw, 0);
            return;
        }
        SF sf2 = new SF(this.A04);
        sf2.A0e(new C1580Ua(((AbstractC2212hy) this.A03).A25(), this.A04.A0A()));
        if (U7.A2A(this.A04) && C1509Rf.A0A(this.A03.A1C())) {
            z11 = true;
        }
        boolean zA1Y = this.A03.A1Y();
        if (z11) {
            C1509Rf unifiedAssetsLoader = new C1509Rf(sf2, this.A03.A1C(), this.A03.A0v(), this.A03.A17(), z11, new C2230iK(this, zA1Y));
            unifiedAssetsLoader.A0B();
            return;
        }
        AnonymousClass73 anonymousClass73 = (AnonymousClass73) this.A03;
        if (TextUtils.isEmpty(anonymousClass73.A20().A0H().A09())) {
            if (this.A05 == EnumC1607Vb.A0I) {
                this.A04.A0F().ADm();
            }
            this.A01.AF7(this, AdError.INTERNAL_ERROR);
        } else {
            NS.A02(this.A04, sf2, anonymousClass73);
            sf2.A0X(new C7E(this, z10, zA1Y, anonymousClass73, this), new S8(anonymousClass73.A17(), A05(152, 14, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2220iA
    public final int A0H() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A03.A0m();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2220iA
    public final AbstractC1390Mo A0I() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2220iA
    public final boolean A0J() throws SecurityException {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A1E(super.A01);
        String strA03 = C1934dI.A03(super.A02, this.A0B, this.A07);
        this.A03.A1F(super.A02);
        this.A03.A1J(strA03);
        AdActivityIntent adActivityIntentA05 = WB.A05(this.A04);
        adActivityIntentA05.putExtra(A05(174, 8, 83), this.A05);
        adActivityIntentA05.putExtra(A05(127, 25, 78), this.A03);
        adActivityIntentA05.putExtra(A05(34, 19, 107), this.A03);
        adActivityIntentA05.putExtra(A05(166, 8, 27), this.A0B);
        if (strA03 != null) {
            adActivityIntentA05.putExtra(A05(112, 15, 89), strA03);
        }
        adActivityIntentA05.putExtra(A05(66, 11, 109), this.A0A);
        adActivityIntentA05.putExtra(A05(101, 11, 74), this.A00);
        if (this.A09 != null) {
            adActivityIntentA05.putExtra(A05(53, 13, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), this.A09);
        }
        A0A(adActivityIntentA05);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            adActivityIntentA05.setFlags(adActivityIntentA05.getFlags() | 268435456);
        }
        ActivityUtils.A03(this.A04);
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!WB.A0I(this.A04, adActivityIntentA05)) {
                    this.A04.A0F().AHS();
                    if (this.A01 != null) {
                        this.A01.AF7(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            WB.A0B(this.A04, adActivityIntentA05);
            return true;
        } catch (W9 e10) {
            String[] strArr = A0F;
            if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[7] = "zr3";
            strArr2[6] = "zCM";
            Throwable cause = e10.getCause();
            Throwable cause2 = e10;
            if (cause != null) {
                cause2 = e10.getCause();
            }
            this.A04.A08().AAy(A05(23, 11, 50), AbstractC1550Sv.A01, new C1551Sw(cause2));
            return true;
        }
    }

    public final void A0K(C1937dL c1937dL, InterfaceC1384Mh interfaceC1384Mh, NU nu2, boolean z10, String str, String str2) {
        String strA05;
        this.A0C.set(false);
        this.A04 = c1937dL;
        this.A01 = interfaceC1384Mh;
        this.A0A = nu2.A02();
        this.A00 = nu2.A00();
        this.A09 = str2;
        if (this.A0A != null) {
            String str3 = this.A0A;
            String strA052 = A05(0, 1, 12);
            String[] strArr = A0F;
            if (strArr[7].length() == strArr[6].length()) {
                String[] strArr2 = A0F;
                strArr2[7] = "x5W";
                strArr2[6] = "dMK";
                strA05 = str3.split(strA052)[0];
            }
            throw new RuntimeException();
        }
        strA05 = A05(0, 0, 100);
        this.A07 = strA05;
        this.A03 = AbstractC1390Mo.A03(nu2.A03(), this.A04);
        this.A03.A1H(str);
        this.A03.A1D(nu2.A01().A06());
        if (this.A03.A1T()) {
            this.A08 = ((C2210hw) this.A03).A20();
        } else {
            this.A08 = ((AbstractC2212hy) this.A03).A25();
        }
        if (this.A03.A1Y()) {
            this.A05 = EnumC1607Vb.A08;
            if (this.A03.A1P()) {
                this.A04.A0F().AJ9(LT.A08);
            } else {
                this.A04.A0F().AJ9(LT.A0A);
            }
        } else {
            switch (this.A03.A0l()) {
                case 0:
                    this.A05 = EnumC1607Vb.A0H;
                    this.A04.A0F().AJ9(LT.A0D);
                    break;
                case 1:
                    this.A05 = EnumC1607Vb.A0G;
                    this.A04.A0F().AJ9(LT.A0C);
                    break;
                case 2:
                    this.A05 = EnumC1607Vb.A05;
                    this.A04.A0F().AJ9(LT.A05);
                    break;
                case 3:
                    this.A05 = EnumC1607Vb.A0F;
                    this.A04.A0F().AJ9(LT.A04);
                    break;
                case 4:
                    this.A05 = EnumC1607Vb.A0I;
                    this.A04.A0F().AJ9(LT.A0E);
                    break;
            }
        }
        if (U7.A0v(c1937dL)) {
            AbstractC1390Mo abstractC1390Mo = this.A03;
            String[] strArr3 = A0F;
            if (strArr3[4].charAt(19) != strArr3[0].charAt(19)) {
                String[] strArr4 = A0F;
                strArr4[4] = "c2SjyVfNFMTSQhwflPzyjFy3Fjr2snH4";
                strArr4[0] = "k4vT1WhZbJ1Mlr1eks5fTJscMmdnfo8D";
                if (abstractC1390Mo.A1T()) {
                    C2210hw c2210hw = (C2210hw) this.A03;
                    for (int iA1u = c2210hw.A1u() - 1; iA1u >= 0; iA1u--) {
                        AbstractC2212hy abstractC2212hyA1x = c2210hw.A1x(iA1u);
                        if (ML.A06(this.A04, ML.A01(c1937dL, abstractC2212hyA1x.A1C(), abstractC2212hyA1x.A25()), c1937dL.A0A())) {
                            this.A04.A0F().A4u();
                            c2210hw.A22(iA1u);
                            return;
                        }
                    }
                    if (c2210hw.A1u() == 0) {
                        this.A01.AF7(this, AdError.NO_FILL);
                        return;
                    }
                } else if (ML.A06(this.A04, ML.A01(c1937dL, nu2.A03(), ((AbstractC2212hy) this.A03).A25()), c1937dL.A0A())) {
                    this.A04.A0F().A4u();
                    this.A01.AF7(this, AdError.NO_FILL);
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A02 = new C1385Mi(this.A0B, this, interfaceC1384Mh);
        A07();
        A0D(z10);
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final String A7G() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final boolean AJa() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final void onDestroy() {
        A08();
    }
}
