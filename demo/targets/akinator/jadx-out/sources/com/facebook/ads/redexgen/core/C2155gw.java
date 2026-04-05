package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.gw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2155gw implements InterfaceC1404Nc {
    public static byte[] A0A;
    public static final String A0B;
    public long A02;
    public RewardedVideoAd A03;
    public AbstractC1390Mo A04;
    public C09956r A05;
    public final C1937dL A07;
    public final S2SRewardedVideoAdExtendedListener A08;
    public final C2145gm A09;
    public int A00 = 0;
    public boolean A06 = false;
    public long A01 = -1;

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0A = new byte[]{116, -95, 83, -108, -105, 83, -97, -94, -108, -105, 83, -100, -90, 83, -108, -97, -91, -104, -108, -105, -84, 83, -100, -95, 83, -93, -91, -94, -102, -91, -104, -90, -90, 97, 83, -116, -94, -88, 83, -90, -101, -94, -88, -97, -105, 83, -86, -108, -100, -89, 83, -103, -94, -91, 83, -108, -105, AbstractJsonLexerKt.TC_INVALID, -94, -108, -105, -104, -105, 91, 92, 83, -89, -94, 83, -107, -104, 83, -106, -108, -97, -97, -104, -105, -60, -15, -15, -18, -15, -97, -21, -18, -32, -29, -24, -19, -26, -97, -15, -28, -10, -32, -15, -29, -28, -29, -97, -11, -24, -29, -28, -18, -97, -32, -29, -19, -4, -11};
    }

    static {
        A0A();
        A0B = C2155gw.class.getSimpleName();
    }

    public C2155gw(C2145gm c2145gm, InterfaceC1420Ns interfaceC1420Ns, String str) {
        this.A09 = c2145gm;
        this.A07 = c2145gm.A0B;
        this.A08 = new C2142gj(str, interfaceC1420Ns, this, c2145gm);
    }

    private void A0C(String str, AdExperienceType adExperienceType, boolean z10) {
        String extraHints;
        if (!this.A06 && this.A05 != null) {
            Log.w(A0B, A09(0, 78, 37));
        }
        A0D(false);
        this.A06 = false;
        NT nt2 = new NT(this.A09.A0D, V6.A07, AdPlacementType.REWARDED_VIDEO, V4.A08, 1, this.A09.A0C);
        nt2.A08(z10);
        if (U7.A2Y(this.A07) && (extraHints = WR.A02(this.A07, this.A09.A06)) != null) {
            this.A09.A06 = extraHints;
        }
        nt2.A06(this.A09.A06);
        nt2.A07(this.A09.A07);
        this.A05 = new C09956r(this.A09.A0B, nt2);
        this.A05.A0S(new C2157gy(this));
        this.A05.A0X(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z10) {
        if (this.A05 != null) {
            this.A05.A0S(new C2156gx(this));
            this.A05.A0Y(z10);
            this.A05.A0K();
            this.A05 = null;
        }
    }

    public final long A0F() {
        if (this.A05 != null) {
            return this.A05.A0G();
        }
        return -1L;
    }

    public final C2145gm A0G() {
        return this.A09;
    }

    public final C1937dL A0H() {
        return this.A07;
    }

    public final void A0I(RewardData rewardData) {
        this.A09.A03 = rewardData;
        if (this.A06 && this.A05 != null) {
            this.A05.A0a(rewardData);
        }
    }

    public final void A0J(String str, AdExperienceType adExperienceType, boolean z10) {
        this.A01 = System.currentTimeMillis();
        try {
            A0C(str, adExperienceType, z10);
        } catch (Exception e10) {
            Log.e(A0B, A09(78, 31, 113), e10);
            this.A09.A0B.A08().AAy(A09(109, 3, 126), AbstractC1550Sv.A0b, new C1551Sw(e10));
            AdError adErrorInternalError = AdError.internalError(2004);
            this.A09.A0B.A0F().A3F(XG.A01(this.A01), adErrorInternalError.getErrorCode(), adErrorInternalError.getErrorMessage());
            this.A08.onError(this.A09.A6c(), adErrorInternalError);
        }
    }

    public final boolean A0K() {
        return this.A05 == null || this.A05.A0Z();
    }

    public final boolean A0L() {
        return this.A06;
    }

    public final boolean A0M(int i10, long j10) {
        if (!this.A06) {
            this.A08.onError(this.A09.A6c(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A08.A02(i10);
            this.A05.A08.A03(j10);
            this.A05.A0M();
            this.A06 = false;
            return true;
        }
        this.A06 = false;
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1404Nc
    public final void destroy() {
        A0D(true);
    }
}
