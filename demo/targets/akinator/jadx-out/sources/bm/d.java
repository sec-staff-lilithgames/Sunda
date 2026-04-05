package bm;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import zl.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends FullScreenContentCallback {

    /* renamed from: b, reason: collision with root package name */
    public final z f9712b;

    public d(z zVar) {
        this.f9712b = zVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        ((zl.c) this.f9712b).onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        z zVar = this.f9712b;
        ((zl.d) zVar).onAdComplete();
        ((zl.d) zVar).onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        ((zl.c) this.f9712b).onAdShowFailed(new pr.a(pr.a.f81799q, adError.getCode(), adError.getMessage()));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        ((zl.c) this.f9712b).onAdShown();
    }
}
