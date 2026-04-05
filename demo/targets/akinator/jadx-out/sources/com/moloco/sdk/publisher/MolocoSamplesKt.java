package com.moloco.sdk.publisher;

import a1.n;
import android.content.Context;
import android.widget.FrameLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import kotlin.jvm.internal.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MolocoSamplesKt {
    private static final void MolocoCreateBanner(FrameLayout frameLayout) {
        Moloco.createBanner$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new c(frameLayout, 1), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 MolocoCreateBanner$lambda$2(FrameLayout frameLayout, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        if (banner != null) {
            banner.load("bid_response", null);
            frameLayout.addView(banner);
            banner.destroy();
            frameLayout.removeView(banner);
        }
        return x0.f87415a;
    }

    private static final void MolocoCreateBannerTablet(FrameLayout frameLayout) {
        Moloco.createBannerTablet$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new c(frameLayout, 2), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 MolocoCreateBannerTablet$lambda$3(FrameLayout frameLayout, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        if (banner != null) {
            banner.load("bid_response", null);
            frameLayout.addView(banner);
            banner.destroy();
            frameLayout.removeView(banner);
        }
        return x0.f87415a;
    }

    private static final void MolocoCreateInterstitialAd() {
        Moloco.createInterstitial$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new n(3), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 MolocoCreateInterstitialAd$lambda$6(InterstitialAd interstitialAd, MolocoAdError.AdCreateError adCreateError) {
        if (interstitialAd != null) {
            interstitialAd.load("bid_response", null);
            interstitialAd.show(null);
            interstitialAd.destroy();
        }
        return x0.f87415a;
    }

    private static final void MolocoCreateMREC(FrameLayout frameLayout) {
        Moloco.createMREC$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new c(frameLayout, 0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 MolocoCreateMREC$lambda$4(FrameLayout frameLayout, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        if (banner != null) {
            banner.load("bid_response", null);
            frameLayout.addView(banner);
            banner.destroy();
            frameLayout.removeView(banner);
        }
        return x0.f87415a;
    }

    private static final void MolocoCreateNativeAd(String str) {
        Moloco.createNativeAd$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new n(2), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 MolocoCreateNativeAd$lambda$5(NativeAd nativeAd, MolocoAdError.AdCreateError adCreateError) {
        if (nativeAd != null) {
            nativeAd.load("bid_response", null);
        }
        return x0.f87415a;
    }

    private static final void MolocoCreateRewardedInterstitialAd() {
        Moloco.createRewardedInterstitial$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new n(1), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 MolocoCreateRewardedInterstitialAd$lambda$7(RewardedInterstitialAd rewardedInterstitialAd, MolocoAdError.AdCreateError adCreateError) {
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.load("bid_response", null);
            rewardedInterstitialAd.show(null);
            rewardedInterstitialAd.destroy();
        }
        return x0.f87415a;
    }

    private static final void MolocoInitializeSample(final Context context) {
        Moloco.initialize(new MolocoInitParams(context, "YOUR_APP_KEY", new MediationInfo("<YourMediationName>")), new MolocoInitializationListener() { // from class: com.moloco.sdk.publisher.d
            @Override // com.moloco.sdk.publisher.MolocoInitializationListener
            public final void onMolocoInitializationStatus(MolocoInitStatus molocoInitStatus) {
                MolocoSamplesKt.MolocoInitializeSample$lambda$1(context, molocoInitStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MolocoInitializeSample$lambda$1(Context context, MolocoInitStatus molocoInitStatus) {
        e0.checkNotNullParameter(molocoInitStatus, "molocoInitStatus");
        if (molocoInitStatus.getInitialization() == Initialization.SUCCESS) {
            Moloco.getBidToken(new MediationInfo("MY_MEDIATION"), context, new com.google.android.gms.internal.ads.a(11));
        } else {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, MBridgeConstans.DYNAMIC_VIEW_WX_APP, molocoInitStatus.getDescription(), null, false, 12, null);
        }
    }

    private static final void MolocoIsInitializedSample() {
        Moloco.isInitialized();
    }
}
