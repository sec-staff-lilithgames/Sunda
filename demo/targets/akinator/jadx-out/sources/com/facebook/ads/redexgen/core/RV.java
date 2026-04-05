package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class RV implements RewardedInterstitialAdApi, Repairable {
    public static byte[] A01;
    public final RZ A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 2, 86, 83, 84, 91, 81, 0, 55, 48, 52, 51, 51, 48, 54, 54, 111, 58, 59, 104, 61, 96, 105, 108, 12, 8, 13, 95, 15, 2, 14, 11, 64, 119, 101, 115, 96, 118, 119, 118, 50, 123, 124, 102, 119, 96, 97, 102, 123, 102, 123, 115, 126, 50, 115, 118, 50, 118, 119, 97, 102, 96, 125, 107, 119, 118, 30, 41, 59, 45, 62, 40, 41, 40, 108, 37, 34, 56, 41, 62, Utf8.REPLACEMENT_BYTE, 56, 37, 56, 37, 45, 32, 108, 45, 40, 108, 32, 35, 45, 40, 108, 62, 41, 61, 57, 41, Utf8.REPLACEMENT_BYTE, 56, 41, 40, 122, 77, 95, 73, 90, 76, 77, 76, 8, 65, 70, 92, 77, 90, 91, 92, 65, 92, 65, 73, 68, 8, 73, 76, 8, 91, 64, 71, 95, 8, 75, 73, 68, 68, 77, 76, 126, AbstractJsonLexerKt.TC_INVALID, 105, 110, 104, 117, 99, 31, 28, 18, 23, 50, 23, 41, 50, 53, 45};
    }

    public RV(Context context, String str, RewardedInterstitialAd rewardedInterstitialAd) {
        this.A00 = new RZ(context, str, rewardedInterstitialAd);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new RX(this.A00.buildLoadAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new RY(this.A00.buildShowAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void destroy() {
        VF.A05(A00(141, 7, 88), A00(32, 34, 80), A00(8, 8, 64));
        this.A00.A04();
    }

    public final void finalize() {
        this.A00.finalize();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A00.getPlacementId();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final int getVideoDuration() {
        return this.A00.getVideoDuration();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        return this.A00.isAdInvalidated();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A00.isAdLoaded();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        VF.A05(A00(148, 6, 49), A00(66, 39, 14), A00(0, 8, 33));
        this.A00.A07(null, AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void loadAd(RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        ((RX) rewardedInterstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        this.A00.repair(th2);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A00.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        VF.A05(A00(154, 4, 24), A00(105, 36, 106), A00(24, 8, Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
        return this.A00.A08(new C1505Rb().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean show(RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        VF.A05(A00(154, 4, 24), A00(105, 36, 106), A00(16, 8, 27));
        return this.A00.A08(((RY) rewardedInterstitialShowAdConfig).A00());
    }
}
