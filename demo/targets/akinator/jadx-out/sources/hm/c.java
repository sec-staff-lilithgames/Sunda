package hm;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import em.g0;
import em.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends AdListener {

    /* renamed from: b, reason: collision with root package name */
    public final e f59003b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f59004c;

    public c(e eVar, g0 g0Var) {
        this.f59003b = eVar;
        this.f59004c = g0Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        z adPresentListener = this.f59003b.getAdPresentListener();
        if (adPresentListener != null) {
            ((em.g) adPresentListener).onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f59003b.c(new gm.c(13, this, loadAdError));
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        z adPresentListener = this.f59003b.getAdPresentListener();
        if (adPresentListener != null) {
            ((em.g) adPresentListener).onAdShown();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        this.f59003b.c(new com.unity3d.services.banners.view.a(this, 19));
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
    }
}
