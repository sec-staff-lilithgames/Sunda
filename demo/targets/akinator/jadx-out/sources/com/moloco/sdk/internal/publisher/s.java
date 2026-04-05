package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class s implements AdShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final AdShowListener f46686a;

    public s(AdShowListener adShowListener) {
        this.f46686a = adShowListener;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(MolocoAd molocoAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        AdShowListener adShowListener = this.f46686a;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(MolocoAd molocoAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        AdShowListener adShowListener = this.f46686a;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(MolocoAdError molocoAdError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAdError, "molocoAdError");
        AdShowListener adShowListener = this.f46686a;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(MolocoAd molocoAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(molocoAd, "molocoAd");
        AdShowListener adShowListener = this.f46686a;
        if (adShowListener != null) {
            adShowListener.onAdShowSuccess(molocoAd);
        }
    }
}
