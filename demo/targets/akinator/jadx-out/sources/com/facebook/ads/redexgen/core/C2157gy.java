package com.facebook.ads.redexgen.core;

import com.facebook.ads.RewardedVideoAd;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.gy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2157gy extends MQ {
    public static byte[] A01;
    public final /* synthetic */ C2155gw A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, 24, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C2157gy(C2155gw c2155gw) {
        this.A00 = c2155gw;
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A06() {
        this.A00.A08.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A07() {
        this.A00.A08.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A08() {
        if (this.A00.A03 == null) {
            this.A00.A08.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A09() {
        if (this.A00.A03 == null) {
            this.A00.A08.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0A() {
        if (this.A00.A03 != null) {
            C1505Rb c1505Rb = (C1505Rb) this.A00.A03.buildShowAdConfig();
            c1505Rb.A02(System.currentTimeMillis() - this.A00.A02);
            this.A00.A03.show(c1505Rb.build());
            return;
        }
        this.A00.A08.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0C() {
        this.A00.A07.A0F().A3C();
        this.A00.A08.onAdClicked(this.A00.A09.A6c());
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0D() {
        this.A00.A08.onLoggingImpression(this.A00.A09.A6c());
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0F(MP mp2) {
        if (this.A00.A05 == null) {
            this.A00.A07.A08().AAy(A00(0, 3, 67), AbstractC1550Sv.A0N, new C1551Sw(A00(3, 18, 108)));
            return;
        }
        AbstractC2220iA abstractC2220iA = (AbstractC2220iA) mp2;
        if (this.A00.A09.A03 != null) {
            abstractC2220iA.A02(this.A00.A09.A03);
        }
        this.A00.A09.A00 = abstractC2220iA.A0H();
        this.A00.A06 = true;
        this.A00.A04 = this.A00.A05.A0I();
        if (this.A00.A04 != null) {
            int iA1x = 0;
            if (!this.A00.A04.A1T()) {
                iA1x = ((AbstractC2212hy) this.A00.A04).A1x();
            }
            if (iA1x > 0) {
                WR wr2 = new WR();
                if (wr2.A09(this.A00.A07, this.A00.A09.A06, iA1x)) {
                    wr2.A08(this.A00.A07, true);
                    this.A00.A03 = wr2.A07(this.A00.A07, this.A00.A09.A0D, this.A00.A09.A06);
                } else {
                    wr2.A08(this.A00.A07, false);
                }
            }
        }
        if (this.A00.A03 != null) {
            ((AbstractC2212hy) this.A00.A04).A2A(true);
            RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = this.A00.A03.buildLoadAdConfig().withFailOnCacheFailureEnabled(true).withRewardData(this.A00.A04.A0p()).withAdExperience(this.A00.A09.A02).withAdListener(new C1406Ne(this)).build();
            this.A00.A03.loadAd(loadAdConfig);
            return;
        }
        this.A00.A08.onAdLoaded(this.A00.A09.A6c());
    }

    @Override // com.facebook.ads.redexgen.core.MQ
    public final void A0G(V1 v12) {
        this.A00.A0D(true);
        this.A00.A09.A0B.A0F().A3F(XG.A01(this.A00.A01), v12.A03().getErrorCode(), v12.A04());
        this.A00.A08.onError(this.A00.A09.A6c(), WT.A00(v12));
    }
}
