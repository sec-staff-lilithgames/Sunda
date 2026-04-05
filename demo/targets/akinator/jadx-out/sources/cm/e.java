package cm;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import zl.e0;
import zl.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends AdListener {

    /* renamed from: b, reason: collision with root package name */
    public final f f12378b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f12379c;

    public e(f fVar, e0 e0Var) {
        this.f12378b = fVar;
        this.f12379c = e0Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        v adPresentListener = this.f12378b.getAdPresentListener();
        if (adPresentListener != null) {
            ((zl.c) adPresentListener).onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        ((zl.j) this.f12379c).onAdLoadFailed(this.f12378b, new pr.a(pr.a.f81798p, loadAdError.getCode(), loadAdError.getMessage()));
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        v adPresentListener = this.f12378b.getAdPresentListener();
        if (adPresentListener != null) {
            ((zl.c) adPresentListener).onAdShown();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        f fVar = this.f12378b;
        fVar.onAdLoaded();
        ((zl.j) this.f12379c).onAdLoaded(fVar);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
    }
}
