package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.iS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2238iS implements MP, NG {
    public static byte[] A0B;
    public static String[] A0C = {"Tri2", "1D6RXHNY", "CY2J", "FG3HLf7FRck3Q4", "aTw9XxKg19aD2PWH35UjlgQd", "aN0Sboz7ddtAAnQUWG6qQ4oJRDDzSUBt", "pWs", "z"};
    public long A00;
    public RewardData A01;
    public InterfaceC1377Ma A02;
    public C1378Mb A03;
    public NH A04;
    public C1937dL A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{-37, -7, 6, -65, 12, -72, 11, 12, -7, 10, 12, -72, -39, 13, -4, 1, -3, 6, -5, -3, -26, -3, 12, 15, 7, 10, 3, -39, -5, 12, 1, 14, 1, 12, 17, -58, -72, -27, -7, 3, -3, -72, 11, 13, 10, -3, -72, 12, 0, -7, 12, -72, 1, 12, -65, 11, -72, 1, 6, -72, 17, 7, 13, 10, -72, -39, 6, -4, 10, 7, 1, -4, -27, -7, 6, 1, -2, -3, 11, 12, -58, 16, 5, 4, -72, -2, 1, 4, -3, -58, -16, -20, -21, 31, 14, 19, 15, 24, 13, 15, -8, 15, 30, 33, 25, 28, 21, -55, -48, -35, -50, -48, -46, -29, -40, -27, -40, -29, -24, -1, -9, -10, -5, -13, 6, -5, 1, 0, -42, -13, 6, -13, 16, 12, 1, 3, 5, 13, 5, 14, 20, -23, 4, -55, -53, -66, -67, -66, -65, -62, -57, -66, -67, -88, -53, -62, -66, -57, -51, -70, -51, -62, -56, -57, -92, -66, -46, -7, -20, -8, -4, -20, -6, -5, -37, -16, -12, -20, -6, -13, -18, -10, -6, -22, -50, -23, 34, 21, 17, 35, 0, 37, 28, 17, 12, -2, 3, -7, 4, 12};
    }

    static {
        A05();
    }

    private int A00() {
        WindowManager windowManager = (WindowManager) this.A05.getSystemService(A03(194, 6, 65));
        int rotation = windowManager.getDefaultDisplay().getRotation();
        EnumC1726Zt enumC1726ZtA02 = A02();
        if (enumC1726ZtA02 == EnumC1726Zt.A05) {
            String[] strArr = A0C;
            String str = strArr[4];
            String str2 = strArr[7];
            int rotation2 = str.length();
            if (rotation2 != str2.length()) {
                String[] strArr2 = A0C;
                strArr2[6] = "b7o";
                strArr2[3] = "Q7inAkPu5HYVeU";
                return -1;
            }
        } else if (enumC1726ZtA02 == EnumC1726Zt.A03) {
            switch (rotation) {
                case 2:
                case 3:
                    int rotation3 = A0C[1].length();
                    if (rotation3 != 29) {
                        String[] strArr3 = A0C;
                        strArr3[6] = "bcp";
                        strArr3[3] = "BEZRNTMscmchpM";
                        return 8;
                    }
                    break;
                default:
                    return 0;
            }
        } else {
            switch (rotation) {
                case 2:
                    return 9;
                default:
                    String[] strArr4 = A0C;
                    String str3 = strArr4[4];
                    String str4 = strArr4[7];
                    int rotation4 = str3.length();
                    if (rotation4 == str4.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A0C;
                    strArr5[0] = "VdY7";
                    strArr5[2] = "KFhl";
                    return 1;
            }
        }
        throw new RuntimeException();
    }

    private final EnumC1607Vb A01() {
        return this.A04.A0E();
    }

    private EnumC1726Zt A02() {
        return this.A04.A0F();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        this.A04.A0I(intent, this.A01, C1934dI.A03(this.A01, this.A0A, this.A06));
    }

    private final void A07(C1937dL c1937dL, InterfaceC1377Ma interfaceC1377Ma, NU nu2, EnumSet<CacheFlag> cacheFlags, String str) {
        NH nh2 = new NH(c1937dL, nu2, this, str);
        AbstractC1390Mo abstractC1390MoA0D = nh2.A0D();
        if (U7.A0v(c1937dL) && (abstractC1390MoA0D instanceof AbstractC2212hy) && ML.A06(this.A05, ML.A01(c1937dL, nu2.A03(), ((AbstractC2212hy) abstractC1390MoA0D).A25()), c1937dL.A0A())) {
            this.A05.A0F().A4u();
            this.A02.ADc(this, AdError.NO_FILL);
        } else {
            this.A04 = nh2;
            A08(nh2.A0E());
            nh2.A0J(c1937dL, cacheFlags);
        }
    }

    private void A08(EnumC1607Vb enumC1607Vb) {
        if (enumC1607Vb.equals(EnumC1607Vb.A04)) {
            this.A05.A0F().AJ9(LT.A05);
            return;
        }
        if (enumC1607Vb.equals(EnumC1607Vb.A0A)) {
            this.A05.A0F().AJ9(LT.A04);
            return;
        }
        if (enumC1607Vb.equals(EnumC1607Vb.A0B)) {
            this.A05.A0F().AJ9(LT.A0B);
            return;
        }
        if (enumC1607Vb.equals(EnumC1607Vb.A0D)) {
            this.A05.A0F().AJ9(LT.A0D);
            return;
        }
        if (enumC1607Vb.equals(EnumC1607Vb.A0C)) {
            this.A05.A0F().AJ9(LT.A0C);
            return;
        }
        if (!enumC1607Vb.equals(EnumC1607Vb.A06)) {
            return;
        }
        if (this.A04.A0K()) {
            this.A05.A0F().AJ9(LT.A08);
            return;
        }
        if ((A09() instanceof AbstractC2212hy) && this.A04.A0L((AbstractC2212hy) A09())) {
            LH lhA0F = this.A05.A0F();
            if (A0C[1].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[6] = "5zP";
            strArr[3] = "kcwn0HZtMTZNOx";
            lhA0F.AJ9(LT.A0A);
            return;
        }
        this.A05.A0F().AJ9(LT.A09);
    }

    public final AbstractC1390Mo A09() {
        return this.A04.A0D();
    }

    public final void A0A(C1937dL c1937dL, InterfaceC1377Ma interfaceC1377Ma, NU nu2, EnumSet<CacheFlag> enumSet, String str, String str2, RewardData rewardData) {
        this.A05 = c1937dL;
        this.A02 = interfaceC1377Ma;
        this.A08 = nu2.A02();
        this.A06 = this.A08 != null ? this.A08.split(A03(107, 1, 22))[0] : A03(0, 0, 85);
        this.A00 = nu2.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c1937dL, interfaceC1377Ma, nu2, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            if (this.A02 != null) {
                this.A02.ADc(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent adActivityIntentA05 = WB.A05(this.A05);
        adActivityIntentA05.putExtra(A03(143, 24, 5), A00());
        adActivityIntentA05.putExtra(A03(178, 8, 49), this.A0A);
        adActivityIntentA05.putExtra(A03(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 11, 76), this.A08);
        adActivityIntentA05.putExtra(A03(167, 11, 51), this.A00);
        EnumC1607Vb enumC1607VbA01 = A01();
        A08(enumC1607VbA01);
        adActivityIntentA05.putExtra(A03(186, 8, 88), enumC1607VbA01);
        if (this.A07 != null) {
            adActivityIntentA05.putExtra(A03(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 13, 62), this.A07);
        }
        A06(adActivityIntentA05);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            String[] strArr = A0C;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "Sc68";
            strArr2[2] = "wieN";
            adActivityIntentA05.addFlags(268435456);
        }
        try {
            ActivityUtils.A03(this.A05);
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!WB.A0I(this.A05, adActivityIntentA05)) {
                    this.A05.A0F().AHS();
                    if (this.A02 != null) {
                        this.A02.ADc(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            WB.A0B(this.A05, adActivityIntentA05);
            return true;
        } catch (W9 e10) {
            Throwable cause = e10.getCause();
            Throwable cause2 = e10;
            if (cause != null) {
                cause2 = e10.getCause();
            }
            this.A05.A08().AAy(A03(108, 11, 27), AbstractC1550Sv.A0D, new C1551Sw(cause2));
            Log.e(A03(90, 17, 86), A03(0, 90, 68), cause2);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final String A7G() {
        return this.A04.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final AdPlacementType A8c() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void ACF(AdError adError) {
        if (this.A02 != null) {
            this.A02.ADc(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void ACG() {
        A04();
        this.A02.ADb(this);
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void AGo() {
        this.A03 = new C1378Mb(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final boolean AJa() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void AJm() {
        if (this.A03 != null) {
            C1378Mb c1378Mb = this.A03;
            String[] strArr = A0C;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "DiF0";
            strArr2[2] = "lQT3";
            c1378Mb.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A0H();
        }
    }
}
