package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.k0;
import com.applovin.impl.k7;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class MediationAdapterBase implements MaxAdapter, MaxNativeAdAdapter, MaxInterstitialAdViewAdapter, MaxRewardedAdViewAdapter, MaxAppOpenAdapter {
    private static final String ADAPTIVE_AD_VIEW_TYPE_INLINE = "inline";
    private boolean alwaysRewardUser;
    private final o mLogger;
    private final k mSdk;
    private final String mTag;
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        k kVarA = appLovinSdk.a();
        this.mSdk = kVarA;
        this.mLogger = kVarA.O();
        this.mTag = getClass().getSimpleName();
    }

    public static String mediationTag() {
        return "AppLovinSdk_" + AppLovinSdk.VERSION;
    }

    public void checkExistence(Class<?>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        for (Class<?> cls : clsArr) {
            log("Found: ".concat(cls.getName()));
        }
    }

    public void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i10 = BundleUtils.getInt("amount", 0, serverParameters);
        String string = BundleUtils.getString("currency", "", serverParameters);
        log("Creating reward: " + i10 + " " + string);
        this.reward = MaxRewardImpl.create(i10, string);
    }

    public Future<Drawable> createDrawableFuture(final String str, final Resources resources) {
        return getCachingExecutorService().submit(new Callable<Drawable>() { // from class: com.applovin.mediation.adapters.MediationAdapterBase.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Drawable call() throws Exception {
                InputStream inputStreamOpenStream = new URL(str).openStream();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(inputStreamOpenStream));
                inputStreamOpenStream.close();
                return bitmapDrawable;
            }
        });
    }

    public void d(String str) {
        if (o.a()) {
            this.mLogger.a(this.mTag, str);
        }
    }

    public void e(String str) {
        if (o.a()) {
            this.mLogger.b(this.mTag, str);
        }
    }

    public int getAdaptiveAdViewWidth(MaxAdapterParameters maxAdapterParameters, Context context) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_width");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj != null) {
            e("Expected parameter \"adaptive_banner_width\" to be of type Integer, received: " + obj.getClass());
        }
        return AppLovinSdkUtils.pxToDp(context, o0.a(context).x);
    }

    public Context getApplicationContext() {
        return k.o();
    }

    public ExecutorService getCachingExecutorService() {
        return this.mSdk.r0().c();
    }

    public int getInlineAdaptiveAdViewMaximumHeight(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("inline_adaptive_banner_max_height");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj == null) {
            return -1;
        }
        e("Expected parameter \"inline_adaptive_banner_max_height\" to be of type Integer, received: " + obj.getClass());
        return -1;
    }

    public MaxReward getReward() {
        MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : MaxRewardImpl.createDefault();
    }

    public String getVersionString(Class cls, String str) {
        String strB = k7.b(cls, str);
        if (strB == null) {
            log("Failed to retrieve version string.");
        }
        return strB;
    }

    public AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    public void i(String str) {
        if (o.a()) {
            this.mLogger.d(this.mTag, str);
        }
    }

    public boolean isAdaptiveAdViewFormat(MaxAdFormat maxAdFormat, MaxAdapterParameters maxAdapterParameters) {
        return (maxAdFormat == MaxAdFormat.MREC && isInlineAdaptiveAdView(maxAdapterParameters)) || maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public boolean isBeta() {
        return false;
    }

    public boolean isInlineAdaptiveAdView(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_type");
        if (obj instanceof String) {
            return ADAPTIVE_AD_VIEW_TYPE_INLINE.equalsIgnoreCase((String) obj);
        }
        if (obj == null) {
            return false;
        }
        e("Expected parameter \"adaptive_banner_type\" to be of type String, received: " + obj.getClass());
        return false;
    }

    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support native ads.");
        maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void log(String str) {
        if (o.a()) {
            this.mLogger.d(this.mTag, str);
        }
    }

    public boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldCollectSignalsOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldDestroyOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldInitializeOnUiThread() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return null;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldShowAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return null;
    }

    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support app open ads.");
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, k0 k0Var, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support interstitial ad view ads.");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, k0 k0Var, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        d("This adapter (" + getAdapterVersion() + ") does not support rewarded ad view ads.");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void userError(String str) {
        userError(str, null);
    }

    public void w(String str) {
        if (o.a()) {
            this.mLogger.k(this.mTag, str);
        }
    }

    public void e(String str, Throwable th2) {
        if (o.a()) {
            this.mLogger.a(this.mTag, str, th2);
        }
    }

    public void log(String str, Throwable th2) {
        if (o.a()) {
            this.mLogger.a(this.mTag, str, th2);
        }
    }

    public void userError(String str, Throwable th2) {
        o.c(this.mTag, str, th2);
    }

    public void checkActivities(Context context, Class<?>... clsArr) {
    }
}
