package hm;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import em.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends FullScreenContentCallback {

    /* renamed from: b, reason: collision with root package name */
    public final d0 f59008b;

    public f(d0 d0Var) {
        this.f59008b = d0Var;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        ((em.g) this.f59008b).onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        d0 d0Var = this.f59008b;
        ((em.k) d0Var).onAdComplete();
        ((em.k) d0Var).onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        ((em.g) this.f59008b).onAdShowFailed(new pr.a(pr.a.f81799q, adError.getCode(), adError.getMessage()));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        ((em.g) this.f59008b).onAdShown();
    }
}
