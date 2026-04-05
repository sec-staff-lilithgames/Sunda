package com.moloco.sdk.publisher;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.jvm.internal.e0;
import tu.u;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class BannerActivitySample extends Activity {
    private Banner banner;
    private final FrameLayout bannerContainer = new FrameLayout(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 onCreate$lambda$0(BannerActivitySample bannerActivitySample, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        x0 x0Var = x0.f87415a;
        if (banner == null) {
            bannerActivitySample.finish();
            return x0Var;
        }
        bannerActivitySample.banner = banner;
        bannerActivitySample.bannerContainer.addView(banner);
        banner.setAdShowListener(new BannerAdShowListener() { // from class: com.moloco.sdk.publisher.BannerActivitySample$onCreate$1$1
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
        });
        banner.load("bid response", new AdLoad.Listener() { // from class: com.moloco.sdk.publisher.BannerActivitySample$onCreate$1$2
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
        banner.isLoaded();
        banner.load("an_another_bid_response", null);
        bannerActivitySample.bannerContainer.removeView(banner);
        banner.load("", null);
        banner.load("some_other_bid_response", null);
        bannerActivitySample.bannerContainer.addView(banner);
        return x0Var;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        setContentView(this.bannerContainer);
        Moloco.createBanner$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new a(this, 0), 4, null);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Banner banner = this.banner;
        Banner banner2 = null;
        if (banner == null) {
            e0.throwUninitializedPropertyAccessException("banner");
            banner = null;
        }
        banner.destroy();
        Banner banner3 = this.banner;
        if (banner3 == null) {
            e0.throwUninitializedPropertyAccessException("banner");
            banner3 = null;
        }
        ViewParent parent = banner3.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            Banner banner4 = this.banner;
            if (banner4 == null) {
                e0.throwUninitializedPropertyAccessException("banner");
            } else {
                banner2 = banner4;
            }
            viewGroup.removeView(banner2);
        }
    }
}
