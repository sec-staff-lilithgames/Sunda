package sl;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d extends AdListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f85913b;

    public d(e eVar) {
        this.f85913b = eVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        super.onAdClicked();
        this.f85913b.f85914b.onAdClicked();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        super.onAdClosed();
        this.f85913b.f85914b.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        e eVar = this.f85913b;
        eVar.f85915c.removeAdView();
        eVar.f85914b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        super.onAdImpression();
        this.f85913b.f85914b.onAdImpression();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        super.onAdLoaded();
        this.f85913b.f85914b.onAdLoaded();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        super.onAdOpened();
        this.f85913b.f85914b.onAdOpened();
    }
}
