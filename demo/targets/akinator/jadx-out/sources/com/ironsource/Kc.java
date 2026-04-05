package com.ironsource;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Kc implements Jc {

    /* renamed from: a, reason: collision with root package name */
    private B2 f34765a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<D2> f34766b = new WeakReference<>(null);

    public final void a(B2 loadListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loadListener, "loadListener");
        this.f34765a = loadListener;
    }

    @Override // com.ironsource.Jc
    public void onBannerClick() {
        D2 d22 = this.f34766b.get();
        if (d22 != null) {
            d22.onBannerClick();
        }
    }

    @Override // com.ironsource.Jc
    public void onBannerLoadFail(String description) {
        kotlin.jvm.internal.e0.checkNotNullParameter(description, "description");
        B2 b22 = this.f34765a;
        if (b22 != null) {
            b22.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.Jc
    public void onBannerLoadSuccess(M9 adInstance, C3302k8 adContainer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(adContainer, "adContainer");
        B2 b22 = this.f34765a;
        if (b22 != null) {
            b22.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.Jc
    public void onBannerShowSuccess() {
        D2 d22 = this.f34766b.get();
        if (d22 != null) {
            d22.onBannerShowSuccess();
        }
    }

    public final void a(D2 showListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(showListener, "showListener");
        this.f34766b = new WeakReference<>(showListener);
    }

    @Override // com.ironsource.Jc
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Jc
    public void onBannerInitFailed(String str) {
    }
}
