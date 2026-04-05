package com.moloco.sdk.publisher;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.jvm.internal.e0;
import tu.u;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class RewardedInterstitialAdSample extends Activity {
    private RewardedInterstitialAd rewardedInterstitialAd;

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onCreate$lambda$0(RewardedInterstitialAdSample rewardedInterstitialAdSample, RewardedInterstitialAd rewardedInterstitialAd, MolocoAdError.AdCreateError adCreateError) {
        x0 x0Var = x0.f87415a;
        if (rewardedInterstitialAd == null) {
            rewardedInterstitialAdSample.finish();
            return x0Var;
        }
        rewardedInterstitialAdSample.rewardedInterstitialAd = rewardedInterstitialAd;
        rewardedInterstitialAd.load("bid response", new AdLoad.Listener() { // from class: com.moloco.sdk.publisher.RewardedInterstitialAdSample$onCreate$1$1
            @Override // com.moloco.sdk.publisher.AdLoad.Listener
            public void onAdLoadFailed(MolocoAdError molocoAdError) {
                e0.checkNotNullParameter(molocoAdError, "molocoAdError");
                throw new u("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdLoad.Listener
            public void onAdLoadSuccess(MolocoAd molocoAd) {
                e0.checkNotNullParameter(molocoAd, "molocoAd");
                throw new u("An operation is not implemented: Not yet implemented");
            }
        });
        rewardedInterstitialAd.isLoaded();
        rewardedInterstitialAd.show(new RewardedInterstitialAdShowListener() { // from class: com.moloco.sdk.publisher.RewardedInterstitialAdSample$onCreate$1$2
            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdClicked(MolocoAd molocoAd) {
                e0.checkNotNullParameter(molocoAd, "molocoAd");
                throw new u("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdHidden(MolocoAd molocoAd) {
                e0.checkNotNullParameter(molocoAd, "molocoAd");
                throw new u("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdShowFailed(MolocoAdError molocoAdError) {
                e0.checkNotNullParameter(molocoAdError, "molocoAdError");
                throw new u("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdShowSuccess(MolocoAd molocoAd) {
                e0.checkNotNullParameter(molocoAd, "molocoAd");
                throw new u("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
            public void onRewardedVideoCompleted(MolocoAd molocoAd) {
                e0.checkNotNullParameter(molocoAd, "molocoAd");
                throw new u("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
            public void onRewardedVideoStarted(MolocoAd molocoAd) {
                e0.checkNotNullParameter(molocoAd, "molocoAd");
                throw new u("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
            public void onUserRewarded(MolocoAd molocoAd) {
                e0.checkNotNullParameter(molocoAd, "molocoAd");
                throw new u("An operation is not implemented: Not yet implemented");
            }
        });
        rewardedInterstitialAd.load("an_another_bid_response", null);
        return x0Var;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        Moloco.createRewardedInterstitial(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new a(this, 2));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RewardedInterstitialAd rewardedInterstitialAd = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd == null) {
            e0.throwUninitializedPropertyAccessException("rewardedInterstitialAd");
            rewardedInterstitialAd = null;
        }
        rewardedInterstitialAd.destroy();
    }
}
