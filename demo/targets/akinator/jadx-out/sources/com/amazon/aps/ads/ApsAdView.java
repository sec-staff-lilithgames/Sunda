package com.amazon.aps.ads;

import android.content.Context;
import android.view.View;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsAdView extends DTBAdView {
    private final ApsAdListener apsAdListener;
    WeakReference<ApsAd> apsAdWeakReference;
    private final DTBAdBannerListener dtbAdBannerListener;
    private final DTBAdInterstitialListener dtbAdInterstitialListener;
    private boolean isAdAvailable;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.amazon.aps.ads.ApsAdView$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat;

        static {
            int[] iArr = new int[ApsAdFormat.values().length];
            $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat = iArr;
            try {
                iArr[ApsAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.BANNER_SMART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.MREC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.LEADERBOARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.INTERSTITIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.REWARDED_VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ApsAdView(Context context, ApsAdFormat apsAdFormat, ApsAdListener apsAdListener) {
        super(context);
        this.isAdAvailable = false;
        DTBAdInterstitialListener dTBAdInterstitialListener = new DTBAdInterstitialListener() { // from class: com.amazon.aps.ads.ApsAdView.1
            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdClicked(View view) {
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdClicked(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdClosed(View view) {
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdClosed(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdError(View view) {
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdError(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdFailed(View view) {
                ApsAdView.this.isAdAvailable = false;
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdFailedToLoad(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdLoaded(View view) {
                ApsAdView.this.isAdAvailable = true;
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdLoaded(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdOpen(View view) {
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdOpen(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onImpressionFired(View view) {
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onImpressionFired(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdVideoListener
            public void onVideoCompleted(View view) {
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onVideoCompleted(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdLeftApplication(View view) {
            }
        };
        this.dtbAdInterstitialListener = dTBAdInterstitialListener;
        DTBAdBannerListener dTBAdBannerListener = new DTBAdBannerListener() { // from class: com.amazon.aps.ads.ApsAdView.2
            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdClicked(View view) {
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdClicked(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdClosed(View view) {
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdClosed(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdError(View view) {
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdError(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdFailed(View view) {
                ApsAdView.this.isAdAvailable = false;
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdFailedToLoad(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdLoaded(View view) {
                ApsAdView.this.isAdAvailable = true;
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdLoaded(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdOpen(View view) {
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onAdOpen(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onImpressionFired(View view) {
                if (ApsAdView.this.apsAdListener != null) {
                    ApsAdView.this.apsAdListener.onImpressionFired(ApsAdView.this.getApsAd());
                }
            }

            @Override // com.amazon.device.ads.DTBAdListener
            public void onAdLeftApplication(View view) {
            }
        };
        this.dtbAdBannerListener = dTBAdBannerListener;
        this.apsAdListener = apsAdListener;
        switch (AnonymousClass3.$SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[apsAdFormat.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                initAdBannerListener(dTBAdBannerListener);
                break;
            case 5:
            case 6:
                initAdInterstitialListener(dTBAdInterstitialListener);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ApsAd getApsAd() {
        WeakReference<ApsAd> weakReference = this.apsAdWeakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewImpl, com.amazon.aps.ads.util.adview.ApsAdViewBase
    public void cleanup() {
        super.cleanup();
    }

    public void fetchAd(ApsAd apsAd) {
        ApsAdUtils.checkNullAndLogInvalidArg(apsAd);
        try {
            apsAd.setAdView(this);
            this.apsAdWeakReference = new WeakReference<>(apsAd);
            fetchAd(apsAd.getBidInfo(), apsAd.getRenderingBundle());
        } catch (RuntimeException e10) {
            this.isAdAvailable = false;
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in ApsAdView - fetchAd", e10);
        }
    }

    public boolean isAdAvailable() {
        return this.isAdAvailable;
    }

    public void setApsAd(ApsAd apsAd) {
        this.apsAdWeakReference = new WeakReference<>(apsAd);
    }
}
