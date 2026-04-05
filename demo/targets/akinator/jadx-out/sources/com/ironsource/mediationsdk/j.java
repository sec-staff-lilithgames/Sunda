package com.ironsource.mediationsdk;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.L2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j extends AbstractC3345a<BannerAdListener> implements BannerSmashListener {
    public j(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, UUID uuid) {
        super(abstractAdapter, networkSettings, IronSource.a.BANNER, uuid);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData) {
        Integer num = adData.getInt("instanceType");
        q qVar = (q) adData.getAdUnitData().get(L2.f34791t);
        if (qVar == null) {
            IronLog.INTERNAL.error(a("Banner layout is null, cannot load banner ad"));
            if (this.f37259b.get() != null) {
                ((BannerAdListener) this.f37259b.get()).onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 615, "Banner layout is null");
                return;
            }
            return;
        }
        if (num == null || num.intValue() != 1) {
            this.f37258a.loadBannerForBidding(jSONObject, jSONObject2, adData.getServerData(), qVar.getSize(), this);
        } else {
            this.f37258a.loadBanner(jSONObject, jSONObject2, qVar.getSize(), this);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public IronSource.a b() {
        return IronSource.a.BANNER;
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public void c(JSONObject jSONObject) {
        this.f37258a.onBannerViewBound(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public void d(JSONObject jSONObject) {
        this.f37258a.onBannerViewWillBind(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((BannerAdListener) this.f37259b.get()).onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((BannerAdListener) this.f37259b.get()).onAdLeftApplication();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose(a("error = " + ironSourceError));
        if (this.f37259b.get() != null) {
            ((BannerAdListener) this.f37259b.get()).onAdLoadFailed(a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((BannerAdListener) this.f37259b.get()).onAdLoadSuccess(view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((BannerAdListener) this.f37259b.get()).onAdScreenDismissed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((BannerAdListener) this.f37259b.get()).onAdScreenPresented();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose(a());
        if (this.f37259b.get() != null) {
            ((BannerAdListener) this.f37259b.get()).onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public void a(JSONObject jSONObject) {
        this.f37258a.destroyBanner(jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractC3345a
    public void a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        this.f37258a.collectBannerBiddingData(jSONObject, jSONObject2, biddingDataCallback);
    }

    public boolean a(IronSourceError ironSourceError) {
        return ironSourceError.getErrorCode() == 606;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
    }
}
