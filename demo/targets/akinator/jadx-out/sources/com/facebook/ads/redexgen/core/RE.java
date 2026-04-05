package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class RE implements InterstitialAdApi, Repairable {
    public static byte[] A04;
    public final InterstitialAd A00;
    public final C2154gv A01;
    public final C09946q A02;
    public final C1937dL A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-61, -63, -61, -57, -58, -61, -14, -63, -26, 21, -30, -29, -29, 23, -26, -38, -38, -38, -36, 9, 5, 9, 2, 39, 45, 30, 43, 39, 26, 37, -39, 30, 43, 43, 40, 43, -25, -61, 44, 81, 87, 72, 85, 86, 87, 76, 87, 76, 68, 79, 3, 68, 71, 3, 71, 72, 86, 87, 85, 82, 92, 72, 71, 50, 87, 93, 78, 91, 92, 93, 82, 93, 82, 74, 85, 9, 74, 77, 9, 85, 88, 74, 77, 9, 91, 78, 90, 94, 78, 92, 93, 78, 77, 39, 76, 82, 67, 80, 81, 82, 71, 82, 71, Utf8.REPLACEMENT_BYTE, 74, -2, Utf8.REPLACEMENT_BYTE, 66, -2, 81, 70, 77, 85, -2, 65, Utf8.REPLACEMENT_BYTE, 74, 74, 67, 66, -13, -12, 2, 3, 1, -2, 8, 88, 99, 64, 99, 85, 88, 53, 88, -8, -19, -12, -4};
    }

    public RE(Context context, String str, InterstitialAd interstitialAd) {
        String string;
        this.A00 = interstitialAd;
        if (context instanceof C1937dL) {
            this.A03 = (C1937dL) context;
            string = this.A03.A0F().getId();
        } else {
            string = UUID.randomUUID().toString();
            this.A03 = RB.A06(context, string);
        }
        LH lhA0F = this.A03.A0F();
        String adId = AdPlacementType.INTERSTITIAL.toString();
        lhA0F.A3L(adId, str);
        this.A01 = new C2154gv(this.A03, interstitialAd, str);
        this.A03.A0O(this);
        this.A02 = new C09946q(this.A01, string);
    }

    public final void A02(InterstitialAdListener interstitialAdListener) {
        this.A03.A0F().A3E(interstitialAdListener != null);
        this.A01.A0E(interstitialAdListener);
    }

    public final void A03(RewardData rewardData) {
        this.A02.A0F(rewardData);
    }

    public final void A04(RewardedAdListener rewardedAdListener) {
        this.A01.A0G(rewardedAdListener);
    }

    public final void A05(EnumSet<CacheFlag> enumSet, String str) {
        VF.A05(A00(127, 8, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), A00(63, 30, 111), A00(15, 7, 42));
        if (str == null) {
            this.A03.A0F().A3I();
        } else {
            this.A03.A0F().A3H();
        }
        this.A02.A0E(this.A00, enumSet, str);
        this.A03.A0F().A3G();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new RF(this);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new RG();
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        VF.A05(A00(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 7, 21), A00(38, 25, 105), A00(0, 8, 21));
        if (U7.A2F(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0F().A3M();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A0A();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0G = this.A02.A0G();
        this.A03.A0F().A5X(zA0G);
        return zA0G;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0H();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        A05(CacheFlag.ALL, null);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((RF) interstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        if (this.A01.A6g() != null) {
            this.A01.A6g().onError(this.A00, new AdError(2001, A00(22, 16, 63) + X7.A03(this.A03, th2)));
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A0I(extraHints.getHints());
        this.A01.A0J(extraHints.getMediationData());
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        VF.A05(A00(135, 4, 11), A00(93, 27, 100), A00(8, 7, 56));
        this.A03.A0F().A3R();
        boolean zA0I = this.A02.A0I(this.A00, new RG());
        this.A03.A0F().A3Q(zA0I);
        return zA0I;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A03.A0F().A3R();
        boolean zA0I = this.A02.A0I(this.A00, interstitialShowAdConfig);
        this.A03.A0F().A3Q(zA0I);
        return zA0I;
    }
}
