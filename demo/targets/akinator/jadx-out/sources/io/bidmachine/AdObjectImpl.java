package io.bidmachine;

import android.app.Activity;
import android.content.Context;
import hr.b;
import hr.c;
import hr.d;
import io.bidmachine.AdRequest;
import java.util.Map;
import up.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class AdObjectImpl<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectParamsType extends up.b, UnifiedAdType extends hr.b, UnifiedAdCallbackType extends hr.c, UnifiedAdRequestParamsType extends hr.d> implements up.a {
    private final AdObjectParamsType adObjectParams;
    private final AdRequestType adRequest;
    private final ContextProvider contextProvider;
    private final AdProcessCallback processCallback;
    private final UnifiedAdType unifiedAd;
    private final UnifiedAdCallbackType unifiedAdCallback;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class BaseUnifiedAdCallback implements hr.c {
        protected final AdProcessCallback processCallback;

        public BaseUnifiedAdCallback(AdProcessCallback adProcessCallback) {
            this.processCallback = adProcessCallback;
        }

        @Override // hr.c
        public void onAdClicked() {
            this.processCallback.processClicked();
        }

        @Override // hr.c
        public void onAdExpired() {
            this.processCallback.processExpired();
        }

        @Override // hr.c
        public void onAdLoadFailed(pr.a aVar) {
            this.processCallback.processLoadFail(aVar);
        }

        @Override // hr.c
        public void onAdShowFailed(pr.a aVar) {
            this.processCallback.processShowFail(aVar);
        }

        @Override // hr.c
        public void onAdShown() {
            this.processCallback.processShown();
        }

        @Override // hr.c
        public void onBrokenCreativeEvent(Map<String, Object> map) {
            this.processCallback.onBrokenCreativeEvent(map);
        }

        @Override // hr.c
        public void setVisibilitySource(nm.m mVar) {
            this.processCallback.setVisibilitySource(mVar);
        }
    }

    public AdObjectImpl(ContextProvider contextProvider, AdProcessCallback adProcessCallback, AdRequestType adrequesttype, AdObjectParamsType adobjectparamstype, UnifiedAdType unifiedadtype) {
        this.contextProvider = contextProvider;
        this.processCallback = adProcessCallback;
        this.adRequest = adrequesttype;
        this.adObjectParams = adobjectparamstype;
        this.unifiedAd = unifiedadtype;
        this.unifiedAdCallback = (UnifiedAdCallbackType) createUnifiedCallback(adProcessCallback);
    }

    @Override // up.a
    public abstract /* synthetic */ hr.c createUnifiedCallback(AdProcessCallback adProcessCallback);

    public Activity getActivity() {
        return this.contextProvider.getActivity();
    }

    public AdRequestType getAdRequest() {
        return this.adRequest;
    }

    public Context getApplicationContext() {
        return this.contextProvider.getApplicationContext();
    }

    @Override // up.a
    public Map<String, Object> getCustomParams() {
        return getUnifiedAd().getCustomParams();
    }

    @Override // up.a
    public AdObjectParamsType getParams() {
        return this.adObjectParams;
    }

    public AdProcessCallback getProcessCallback() {
        return this.processCallback;
    }

    public UnifiedAdType getUnifiedAd() {
        return this.unifiedAd;
    }

    public UnifiedAdCallbackType getUnifiedAdCallback() {
        return this.unifiedAdCallback;
    }

    @Override // up.a
    public void load(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, NetworkAdUnit networkAdUnit) throws Throwable {
        this.unifiedAd.load(contextProvider, this.unifiedAdCallback, unifiedadrequestparamstype, this.adObjectParams.getMediationParams(), networkAdUnit);
    }

    @Override // up.a
    public void onClicked() {
        getUnifiedAd().onClicked();
    }

    @Override // up.a
    public void onClosed(boolean z10) {
        hr.b unifiedAd = getUnifiedAd();
        if (unifiedAd instanceof hr.h) {
            ((hr.h) unifiedAd).onClosed(z10);
        }
    }

    @Override // up.a
    public void onDestroy() {
        getUnifiedAd().onDestroy();
    }

    @Override // up.a
    public void onExpired() {
        getUnifiedAd().onExpired();
    }

    @Override // up.a
    public void onFinished() {
        hr.b unifiedAd = getUnifiedAd();
        if (unifiedAd instanceof hr.h) {
            ((hr.h) unifiedAd).onFinished();
        }
    }

    @Override // up.a
    public void onImpression() {
        getUnifiedAd().onImpression();
    }

    @Override // up.a
    public void onShowFailed() {
        getUnifiedAd().onShowFailed();
    }

    @Override // up.a
    public void onShown() {
        getUnifiedAd().onShown();
    }

    @Override // up.a
    public void hide() {
    }
}
