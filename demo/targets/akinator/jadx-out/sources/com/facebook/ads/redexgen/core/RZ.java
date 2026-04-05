package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class RZ implements RewardedVideoAdApi, Repairable {
    public static byte[] A04;
    public static String[] A05 = {"k8yEFjaDDmJNEMKVrce3vEWkKDhb9GrD", "5HJZEEaowyWiZ6x5JcW91LnqKILZK9iv", "JCdbC5zohUOjfclxz", "cbOkRGwJ0he66t85Zev39Ck1DLyP", "QnWh1EoQaEskbAIVlUx7Y0ywxM6b", "GMmjAnpO", "8CCIVLGxcMAoQXrfALv1hDyohO9DfryR", "UYxyoZ6BjjTfNK3ar4eEie7WMpDsFwCV"};
    public final Ad A00;
    public final C2145gm A01;
    public final C09936p A02;
    public final C1937dL A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 9);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{122, 43, 126, 45, 122, 45, 121, 124, 25, 76, 31, 78, 75, 26, 23, 24, 102, 52, 102, 53, 96, 104, 102, 104, 94, 121, 99, 114, 101, 121, 118, 123, 55, 114, 101, 101, 120, 101, 57, 29, 47, 24, 10, 28, 15, 25, 24, 25, 93, 11, 20, 25, 24, 18, 93, 28, 25, 93, 25, 24, 14, 9, 15, 18, 4, 24, 25, 105, 94, 76, 90, 73, 95, 94, 95, 27, 77, 82, 95, 94, 84, 27, 90, 95, 27, 87, 84, 90, 95, 27, 73, 94, 74, 78, 94, 72, 79, 94, 95, 59, 12, 30, 8, 27, 13, 12, 13, 73, 31, 0, 13, 12, 6, 73, 8, 13, 73, 26, 1, 6, 30, 73, 10, 8, 5, 5, 12, 13, 16, 74, 67, 23, 64, 75, 23, 66, 67, 85, 82, 84, 73, 95, 73, 74, 68, 65, 100, 65, 22, 13, 10, 18};
    }

    static {
        A01();
    }

    public RZ(Context context, String str, Ad ad2) {
        String string;
        this.A00 = ad2;
        if (context instanceof C1937dL) {
            this.A03 = (C1937dL) context;
            string = this.A03.A0F().getId();
        } else {
            string = UUID.randomUUID().toString();
            this.A03 = RB.A07(context, string);
        }
        LH lhA0F = this.A03.A0F();
        String adId = AdPlacementType.REWARDED_VIDEO.toString();
        lhA0F.A3L(adId, str);
        this.A01 = new C2145gm(this.A03, str, this.A00, new C2169hB());
        this.A03.A0O(this);
        this.A02 = new C09936p(this.A01, string);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C1504Ra buildLoadAdConfig() {
        return new C1504Ra(this);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final C1505Rb buildShowAdConfig() {
        return new C1505Rb();
    }

    public final void A04() {
        if (U7.A2F(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0F().A3M();
    }

    public final void A05(RewardData rewardData) {
        this.A02.A0G(rewardData);
    }

    public final void A06(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A04 = rewardedVideoAdListener;
        this.A03.A0F().A3E(rewardedVideoAdListener != null);
        String[] strArr = A05;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        A05[6] = "1SRpemADNZd8xb9i9fuLSYNF0AwY2Tu2";
    }

    public final void A07(String str, AdExperienceType adExperienceType, boolean z10) {
        if (str == null) {
            this.A03.A0F().A3I();
        } else {
            C1937dL c1937dL = this.A03;
            if (A05[6].charAt(25) == 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "67CWYk6q7caxeYWX3cgidRuGJDEH";
            strArr[4] = "JzT9b8y5FiDfchRrDecE58hhFV9F";
            c1937dL.A0F().A3H();
        }
        this.A02.A0F(this.A00, str, adExperienceType, z10);
        this.A03.A0F().A3G();
    }

    public final boolean A08(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        this.A03.A0F().A3R();
        boolean zA0J = this.A02.A0J(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0F().A3Q(zA0J);
        return zA0J;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void destroy() {
        VF.A05(A00(135, 7, 47), A00(40, 27, 116), A00(128, 7, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE));
        A04();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A0D;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0H = this.A02.A0H();
        this.A03.A0F().A5X(zA0H);
        return zA0H;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0I();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        VF.A05(A00(142, 6, 44), A00(67, 32, 50), A00(8, 8, 38));
        A07(null, null, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((C1504Ra) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new AdError(2001, A00(24, 16, 30) + X7.A03(this.A01.A0B, th2)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        VF.A05(A00(148, 4, 108), A00(99, 29, 96), A00(0, 8, 64));
        return A08(new C1505Rb().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        VF.A05(A00(148, 4, 108), A00(99, 29, 96), A00(16, 8, 88));
        return A08(rewardedVideoShowAdConfig);
    }
}
