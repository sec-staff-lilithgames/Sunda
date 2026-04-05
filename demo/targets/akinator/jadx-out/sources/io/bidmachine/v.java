package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v implements AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdView f62031a;

    public v(AdView adView) {
        this.f62031a = adView;
    }

    @Override // io.bidmachine.AdListener
    public void onAdClicked(ViewAd<Object, Object, Object, ?, AdListener<Object>> viewAd) {
        AdView adView = this.f62031a;
        if (adView.externalListener != null) {
            adView.externalListener.onAdClicked(adView);
        }
    }

    @Override // io.bidmachine.AdListener
    public void onAdExpired(ViewAd<Object, Object, Object, ?, AdListener<Object>> viewAd) {
        AdView adView = this.f62031a;
        if (adView.externalListener != null) {
            adView.externalListener.onAdExpired(adView);
        }
    }

    @Override // io.bidmachine.AdListener
    public void onAdImpression(ViewAd<Object, Object, Object, ?, AdListener<Object>> viewAd) {
        AdView adView = this.f62031a;
        if (adView.externalListener != null) {
            adView.externalListener.onAdImpression(adView);
        }
    }

    @Override // io.bidmachine.AdListener
    public void onAdLoadFailed(ViewAd<Object, Object, Object, ?, AdListener<Object>> viewAd, pr.a aVar) {
        AdView adView = this.f62031a;
        if (adView.externalListener != null) {
            adView.externalListener.onAdLoadFailed(adView, aVar);
        }
    }

    @Override // io.bidmachine.AdListener
    public void onAdLoaded(ViewAd<Object, Object, Object, ?, AdListener<Object>> viewAd) {
        AdView adView = this.f62031a;
        if (adView.externalListener != null) {
            adView.externalListener.onAdLoaded(adView);
        }
        adView.performShow();
    }

    @Override // io.bidmachine.AdListener
    public void onAdShowFailed(ViewAd<Object, Object, Object, ?, AdListener<Object>> viewAd, pr.a aVar) {
        AdView adView = this.f62031a;
        if (adView.externalListener != null) {
            adView.externalListener.onAdShowFailed(adView, aVar);
        }
    }
}
