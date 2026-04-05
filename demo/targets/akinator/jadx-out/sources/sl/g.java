package sl;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g extends InterstitialAdLoadCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f85917b;

    public g(i iVar) {
        this.f85917b = iVar;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f85917b.f85920c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public void onAdLoaded(InterstitialAd interstitialAd) {
        super.onAdLoaded((g) interstitialAd);
        i iVar = this.f85917b;
        iVar.f85920c.onAdLoaded();
        interstitialAd.setFullScreenContentCallback(iVar.f85922e);
        iVar.f85919b.setGmaAd(interstitialAd);
        kl.c cVar = iVar.f85908a;
        if (cVar != null) {
            cVar.onAdLoaded();
        }
    }
}
