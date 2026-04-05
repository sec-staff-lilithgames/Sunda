package ol;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d extends AdListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f79530b;

    public d(e eVar) {
        this.f79530b = eVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        super.onAdClicked();
        this.f79530b.f79531b.onAdClicked();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        super.onAdClosed();
        this.f79530b.f79531b.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        e eVar = this.f79530b;
        eVar.f79532c.removeAdView();
        eVar.f79531b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        super.onAdImpression();
        this.f79530b.f79531b.onAdImpression();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        super.onAdLoaded();
        this.f79530b.f79531b.onAdLoaded();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        super.onAdOpened();
        this.f79530b.f79531b.onAdOpened();
    }
}
