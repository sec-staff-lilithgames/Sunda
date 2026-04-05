package sl;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m extends FullScreenContentCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f85925b;

    public m(n nVar) {
        this.f85925b = nVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        super.onAdClicked();
        this.f85925b.f85927c.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        super.onAdDismissedFullScreenContent();
        this.f85925b.f85927c.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        super.onAdFailedToShowFullScreenContent(adError);
        this.f85925b.f85927c.onAdFailedToShow(adError.getCode(), adError.toString());
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        super.onAdImpression();
        this.f85925b.f85927c.onAdImpression();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent();
        this.f85925b.f85927c.onAdOpened();
    }
}
