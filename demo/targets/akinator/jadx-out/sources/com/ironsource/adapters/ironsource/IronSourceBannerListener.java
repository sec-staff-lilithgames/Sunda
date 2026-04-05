package com.ironsource.adapters.ironsource;

import android.widget.FrameLayout;
import com.google.android.gms.internal.play_billing.a;
import com.ironsource.C3267i8;
import com.ironsource.C3302k8;
import com.ironsource.Jc;
import com.ironsource.M9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class IronSourceBannerListener implements Jc {
    private WeakReference<IronSourceAdapter> mAdapter;
    private final String mDemandSourceName;
    private final BannerSmashListener mListener;

    public IronSourceBannerListener(IronSourceAdapter ironSourceAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = bannerSmashListener;
        this.mAdapter = new WeakReference<>(ironSourceAdapter);
    }

    @Override // com.ironsource.Jc
    public void onBannerClick() {
        a.A(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdClicked();
    }

    @Override // com.ironsource.Jc
    public void onBannerInitFailed(String str) {
        a.A(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Jc
    public void onBannerInitSuccess() {
        a.A(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.Jc
    public void onBannerLoadFail(String str) {
        a.A(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("load failed - error = " + str));
    }

    @Override // com.ironsource.Jc
    public void onBannerLoadSuccess(M9 m9, C3302k8 c3302k8) {
        a.A(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        if (this.mAdapter.get() != null) {
            if (c3302k8 == null) {
                this.mListener.onBannerAdLoadFailed(ErrorBuilder.adContainerIsNull(this.mAdapter.get().getProviderName()));
                return;
            }
            ConcurrentHashMap<String, ArrayList<M9>> concurrentHashMap = this.mAdapter.get().mDemandSourceToBnAd;
            if (concurrentHashMap.get(this.mDemandSourceName) == null) {
                concurrentHashMap.put(this.mDemandSourceName, new ArrayList<>());
            }
            concurrentHashMap.get(this.mDemandSourceName).add(m9);
            C3267i8 size = c3302k8.getSize();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size.c(), size.a());
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(c3302k8, layoutParams);
        }
    }

    @Override // com.ironsource.Jc
    public void onBannerShowSuccess() {
        a.A(new StringBuilder(), this.mDemandSourceName, " onBannerShowSuccess", IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
