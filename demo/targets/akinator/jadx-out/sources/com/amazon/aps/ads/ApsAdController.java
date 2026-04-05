package com.amazon.aps.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import b0.e2;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.bidder.adapter.ApsBidderInterstitialAdAdapter;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DtbConstants;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class ApsAdController {
    private final String HTTPS_WEB_URL;
    private final String TAG;
    private ApsAd apsAd;
    private final ApsAdListener apsAdListener;
    private final ApsAdController$apsAdListenerInternal$1 apsAdListenerInternal;
    private ApsAdView apsAdView;
    private ApsBidderInterstitialAdAdapter apsBidderInterstitialAdAdapter;
    private final Context context;
    private boolean isAdAvailable;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApsAdFormat.values().length];
            try {
                iArr[ApsAdFormat.LEADERBOARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApsAdFormat.MREC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApsAdFormat.BANNER_SMART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApsAdFormat.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApsAdFormat.REWARDED_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApsAdFormat.INTERSTITIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApsAdFormat.INSTREAM_VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ApsAdController(Context context, ApsAdListener listener) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.HTTPS_WEB_URL = "https://c.amazon-adsystem.com/";
        this.TAG = c1.getOrCreateKotlinClass(getClass()).getSimpleName();
        this.apsAdListener = listener;
        ApsAdUtils.checkNullAndLogInvalidArg(context, listener);
        this.apsAdListenerInternal = new ApsAdController$apsAdListenerInternal$1(this);
    }

    private final void fetchBannerAd(ApsAd apsAd) {
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.BANNER, this.apsAdListenerInternal);
        getApsAdView().fetchAd(apsAd);
    }

    private final boolean fetchBidderAdInterstitialAd(String str) {
        ApsAd apsAd = null;
        try {
            if (!ApsAdUtils.sdkRenderingBridgeEnabled(str)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(str);
            ApsAd apsAd2 = this.apsAd;
            if (apsAd2 == null) {
                e0.throwUninitializedPropertyAccessException("apsAd");
                apsAd2 = null;
            }
            apsAd2.setBidder(jSONObject.getString(DtbConstants.AMZN_SDK_BIDDER_ID_KEY));
            ApsAd apsAd3 = this.apsAd;
            if (apsAd3 == null) {
                e0.throwUninitializedPropertyAccessException("apsAd");
                apsAd3 = null;
            }
            apsAd3.setBridgingBidderExtra(jSONObject.getJSONObject(DtbConstants.AMZN_BIDDER_REQUEST_KEY));
            ApsAd apsAd4 = this.apsAd;
            if (apsAd4 == null) {
                e0.throwUninitializedPropertyAccessException("apsAd");
                apsAd4 = null;
            }
            apsAd4.setImpressionUrl(jSONObject.getString(DtbConstants.AMZN_IMP_URL_KEY));
            Context context = this.context;
            ApsAd apsAd5 = this.apsAd;
            if (apsAd5 == null) {
                e0.throwUninitializedPropertyAccessException("apsAd");
                apsAd5 = null;
            }
            this.apsBidderInterstitialAdAdapter = ApsAdUtils.fetchBidderInterstitialAd(context, apsAd5, this.apsAdListenerInternal);
            return true;
        } catch (Exception e10) {
            APSEventSeverity aPSEventSeverity = APSEventSeverity.FATAL;
            APSEventType aPSEventType = APSEventType.EXCEPTION;
            ApsAd apsAd6 = this.apsAd;
            if (apsAd6 == null) {
                e0.throwUninitializedPropertyAccessException("apsAd");
            } else {
                apsAd = apsAd6;
            }
            APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, e2.m("SDKB : Failed to call fetch Bidder : %s Interstitial ad", "format(...)", 1, new Object[]{apsAd.getBidder()}), e10);
            return false;
        }
    }

    private final void fetchInterstitialAd(ApsAd apsAd) {
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.INTERSTITIAL, this.apsAdListenerInternal);
        if (apsAd.bidderRenderingFlowEnabled()) {
            this.apsBidderInterstitialAdAdapter = ApsAdUtils.fetchBidderInterstitialAd(this.context, apsAd, this.apsAdListenerInternal);
            ApsLog.d("Fetch Bidder Interstitial ad");
        } else {
            getApsAdView().setApsAd(apsAd);
            getApsAdView().fetchAd(apsAd.getBidInfo(), apsAd.getRenderingBundle());
            apsAd.setAdView(getApsAdView());
        }
    }

    private final void startOMSDKSession() {
        try {
            DtbOmSdkSessionManager omSdkManager = getApsAdView().getOmSdkManager();
            if (omSdkManager != null) {
                if (getApsAdView().isVideo()) {
                    omSdkManager.initJavaScriptOmAdSession(getApsAdView(), this.HTTPS_WEB_URL);
                } else {
                    omSdkManager.initHtmlDisplayOmAdSession(getApsAdView(), this.HTTPS_WEB_URL);
                }
                omSdkManager.registerAdView(getApsAdView());
                omSdkManager.startAdSession();
                omSdkManager.displayAdEventLoaded();
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Unable to start OM SDK session for Interstitial ad", e10);
        }
    }

    public final void addInViewGroup(ViewGroup parent) {
        e0.checkNotNullParameter(parent, "parent");
        try {
            ApsAd apsAd = this.apsAd;
            if (apsAd != null) {
                if (apsAd == null) {
                    e0.throwUninitializedPropertyAccessException("apsAd");
                }
                ApsAd apsAd2 = this.apsAd;
                ApsAd apsAd3 = null;
                if (apsAd2 == null) {
                    e0.throwUninitializedPropertyAccessException("apsAd");
                    apsAd2 = null;
                }
                if (apsAd2.getAdView() != null) {
                    ApsAd apsAd4 = this.apsAd;
                    if (apsAd4 == null) {
                        e0.throwUninitializedPropertyAccessException("apsAd");
                    } else {
                        apsAd3 = apsAd4;
                    }
                    parent.addView(apsAd3.getAdView());
                }
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:ApsAdController - addInViewGroup", e10);
        }
    }

    public final void fetchAd(ApsAd apsAd) {
        e0.checkNotNullParameter(apsAd, "apsAd");
        ApsAdUtils.checkNullAndLogInvalidArg(apsAd);
        try {
            this.apsAd = apsAd;
            ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
            switch (apsAdFormat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[apsAdFormat.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    fetchBannerAd(apsAd);
                    return;
                case 5:
                case 6:
                    fetchInterstitialAd(apsAd);
                    return;
                case 7:
                    ApsAdUtils.throwExceptionOrRemoteLog("InStream video adFormat not supported");
                    return;
                default:
                    throw new t();
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:ApsAdController - fetchAd", e10);
        }
    }

    public final void fetchRewardedAd(String extraInfoAsString) {
        e0.checkNotNullParameter(extraInfoAsString, "extraInfoAsString");
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.REWARDED_VIDEO, this.apsAdListenerInternal);
        this.apsAd = new ApsAd(extraInfoAsString, ApsAdFormatUtils.getAdFormat(AdType.VIDEO, 9999, 9999));
        if (fetchBidderAdInterstitialAd(extraInfoAsString)) {
            ApsLog.d("Fetch Bidder Interstitial ad");
            return;
        }
        ApsAd apsAd = this.apsAd;
        ApsAd apsAd2 = null;
        if (apsAd == null) {
            e0.throwUninitializedPropertyAccessException("apsAd");
            apsAd = null;
        }
        apsAd.setAdView(getApsAdView());
        ApsAdView apsAdView = getApsAdView();
        ApsAd apsAd3 = this.apsAd;
        if (apsAd3 == null) {
            e0.throwUninitializedPropertyAccessException("apsAd");
        } else {
            apsAd2 = apsAd3;
        }
        apsAdView.setApsAd(apsAd2);
        getApsAdView().fetchAd(extraInfoAsString);
    }

    public final ApsAdView getApsAdView() {
        ApsAdView apsAdView = this.apsAdView;
        if (apsAdView != null) {
            return apsAdView;
        }
        e0.throwUninitializedPropertyAccessException("apsAdView");
        return null;
    }

    public final String getHTTPS_WEB_URL() {
        return this.HTTPS_WEB_URL;
    }

    public final boolean isAdAvailable() {
        return this.isAdAvailable;
    }

    public final void safeCall(kv.a action) {
        e0.checkNotNullParameter(action, "action");
        try {
            action.invoke();
        } catch (AbstractMethodError unused) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "AbstractMethodError listener method not implemented:ApsAdController - safeCall");
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Unexpected exception:ApsAdController - safeCall", e10);
        }
    }

    public final void show() {
        try {
            ApsBidderInterstitialAdAdapter apsBidderInterstitialAdAdapter = this.apsBidderInterstitialAdAdapter;
            if (apsBidderInterstitialAdAdapter != null) {
                if (apsBidderInterstitialAdAdapter != null) {
                    Context context = this.context;
                    ApsAd apsAd = this.apsAd;
                    if (apsAd == null) {
                        e0.throwUninitializedPropertyAccessException("apsAd");
                        apsAd = null;
                    }
                    apsBidderInterstitialAdAdapter.showInterstitialAd(context, apsAd, this.apsAdListenerInternal);
                }
                ApsLog.d("Show Bidder Interstitial ad");
                return;
            }
            if (getApsAdView().getMraidHandler() == null) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "There is no controller before showing the interstitial ad");
                return;
            }
            DTBAdMRAIDController mraidHandler = getApsAdView().getMraidHandler();
            if (mraidHandler != null) {
                mraidHandler.startOMSDKSession();
            }
            ApsLog.d(this.TAG, "Starting the Aps interstitial activity");
            ApsInterstitialActivity.Companion.setAdViewRefPassed(new WeakReference<>(getApsAdView()));
            this.context.startActivity(new Intent(this.context, (Class<?>) ApsInterstitialActivity.class));
            ApsLog.d(this.TAG, "Sending the ApsAdView in live data");
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:ApsAdController - show", e10);
        }
    }

    public final void fetchBannerAd(Bundle extraInfo, int i10, int i11) {
        e0.checkNotNullParameter(extraInfo, "extraInfo");
        this.apsAd = new ApsAd(extraInfo, ApsAdFormatUtils.getAdFormat(AdType.DISPLAY, i11, i10));
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.BANNER, this.apsAdListenerInternal);
        ApsAd apsAd = this.apsAd;
        ApsAd apsAd2 = null;
        if (apsAd == null) {
            e0.throwUninitializedPropertyAccessException("apsAd");
            apsAd = null;
        }
        apsAd.setAdView(getApsAdView());
        ApsAdView apsAdView = getApsAdView();
        ApsAd apsAd3 = this.apsAd;
        if (apsAd3 == null) {
            e0.throwUninitializedPropertyAccessException("apsAd");
        } else {
            apsAd2 = apsAd3;
        }
        apsAdView.setApsAd(apsAd2);
        getApsAdView().fetchAd(extraInfo);
    }

    public final void fetchBannerAd(String extraInfoAsString, int i10, int i11) {
        e0.checkNotNullParameter(extraInfoAsString, "extraInfoAsString");
        this.apsAd = new ApsAd(extraInfoAsString, ApsAdFormatUtils.getAdFormat(AdType.DISPLAY, i11, i10));
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.BANNER, this.apsAdListenerInternal);
        ApsAd apsAd = this.apsAd;
        ApsAd apsAd2 = null;
        if (apsAd == null) {
            e0.throwUninitializedPropertyAccessException("apsAd");
            apsAd = null;
        }
        apsAd.setAdView(getApsAdView());
        ApsAdView apsAdView = getApsAdView();
        ApsAd apsAd3 = this.apsAd;
        if (apsAd3 == null) {
            e0.throwUninitializedPropertyAccessException("apsAd");
        } else {
            apsAd2 = apsAd3;
        }
        apsAdView.setApsAd(apsAd2);
        getApsAdView().fetchAd(extraInfoAsString);
    }

    public final void fetchInterstitialAd(Bundle extraInfo) {
        e0.checkNotNullParameter(extraInfo, "extraInfo");
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.INTERSTITIAL, this.apsAdListenerInternal);
        this.apsAd = new ApsAd(extraInfo, ApsAdFormatUtils.getAdFormat(AdType.INTERSTITIAL, 9999, 9999));
        boolean zSdkRenderingBridgeEnabled = ApsAdUtils.sdkRenderingBridgeEnabled(extraInfo);
        String str = yFkbx.UAjX;
        ApsAd apsAd = null;
        if (zSdkRenderingBridgeEnabled) {
            ApsAd apsAd2 = this.apsAd;
            if (apsAd2 == null) {
                e0.throwUninitializedPropertyAccessException(str);
                apsAd2 = null;
            }
            apsAd2.setBidder(extraInfo.getString(DtbConstants.AMZN_SDK_BIDDER_ID_KEY));
            ApsAd apsAd3 = this.apsAd;
            if (apsAd3 == null) {
                e0.throwUninitializedPropertyAccessException(str);
                apsAd3 = null;
            }
            String string = extraInfo.getString(DtbConstants.AMZN_BIDDER_REQUEST_KEY);
            apsAd3.setBridgingBidderExtra(string != null ? new JSONObject(string) : null);
            ApsAd apsAd4 = this.apsAd;
            if (apsAd4 == null) {
                e0.throwUninitializedPropertyAccessException(str);
                apsAd4 = null;
            }
            apsAd4.setImpressionUrl(extraInfo.getString(DtbConstants.AMZN_IMP_URL_KEY));
            Context context = this.context;
            ApsAd apsAd5 = this.apsAd;
            if (apsAd5 == null) {
                e0.throwUninitializedPropertyAccessException(str);
            } else {
                apsAd = apsAd5;
            }
            this.apsBidderInterstitialAdAdapter = ApsAdUtils.fetchBidderInterstitialAd(context, apsAd, this.apsAdListenerInternal);
            return;
        }
        ApsAd apsAd6 = this.apsAd;
        if (apsAd6 == null) {
            e0.throwUninitializedPropertyAccessException(str);
            apsAd6 = null;
        }
        apsAd6.setAdView(getApsAdView());
        ApsAdView apsAdView = getApsAdView();
        ApsAd apsAd7 = this.apsAd;
        if (apsAd7 == null) {
            e0.throwUninitializedPropertyAccessException(str);
        } else {
            apsAd = apsAd7;
        }
        apsAdView.setApsAd(apsAd);
        getApsAdView().fetchAd(extraInfo);
    }

    public final void fetchInterstitialAd(String extraInfoAsString) {
        e0.checkNotNullParameter(extraInfoAsString, "extraInfoAsString");
        this.apsAdView = new ApsAdView(this.context, ApsAdFormat.INTERSTITIAL, this.apsAdListenerInternal);
        this.apsAd = new ApsAd(extraInfoAsString, ApsAdFormatUtils.getAdFormat(AdType.INTERSTITIAL, 9999, 9999));
        if (fetchBidderAdInterstitialAd(extraInfoAsString)) {
            ApsLog.d("Fetch Bidder Interstitial ad");
            return;
        }
        ApsAd apsAd = this.apsAd;
        ApsAd apsAd2 = null;
        if (apsAd == null) {
            e0.throwUninitializedPropertyAccessException("apsAd");
            apsAd = null;
        }
        apsAd.setAdView(getApsAdView());
        ApsAdView apsAdView = getApsAdView();
        ApsAd apsAd3 = this.apsAd;
        if (apsAd3 == null) {
            e0.throwUninitializedPropertyAccessException("apsAd");
        } else {
            apsAd2 = apsAd3;
        }
        apsAdView.setApsAd(apsAd2);
        getApsAdView().fetchAd(extraInfoAsString);
    }
}
