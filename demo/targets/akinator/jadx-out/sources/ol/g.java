package ol;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g extends InterstitialAdLoadCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f79534b;

    public g(i iVar) {
        this.f79534b = iVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f79534b.f79537c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(InterstitialAd interstitialAd) {
        super.onAdLoaded((g) interstitialAd);
        i iVar = this.f79534b;
        iVar.f79537c.onAdLoaded();
        interstitialAd.setFullScreenContentCallback(iVar.f79539e);
        iVar.f79536b.setGmaAd(interstitialAd);
        kl.c cVar = iVar.f79525a;
        if (cVar != null) {
            cVar.onAdLoaded();
        }
    }
}
