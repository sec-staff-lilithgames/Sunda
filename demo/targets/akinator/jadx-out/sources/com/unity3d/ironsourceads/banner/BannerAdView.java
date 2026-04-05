package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.Q2;
import com.ironsource.R2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BannerAdView extends FrameLayout implements R2 {

    /* renamed from: a, reason: collision with root package name */
    private Q2 f50609a;

    /* renamed from: b, reason: collision with root package name */
    private BannerAdViewListener f50610b;

    private BannerAdView(Context context) {
        super(context);
    }

    public final BannerAdInfo getAdInfo() {
        Q2 q22 = this.f50609a;
        if (q22 == null) {
            e0.throwUninitializedPropertyAccessException("bannerAdViewInternal");
            q22 = null;
        }
        return q22.c();
    }

    public final BannerAdViewListener getListener() {
        return this.f50610b;
    }

    @Override // com.ironsource.R2
    public void onBannerAdClicked() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdClicked adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f50610b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.R2
    public void onBannerAdShown() {
        IronLog.CALLBACK.info("BannerAdViewListener onBannerAdShown adInfo: " + getAdInfo());
        BannerAdViewListener bannerAdViewListener = this.f50610b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(BannerAdViewListener bannerAdViewListener) {
        this.f50610b = bannerAdViewListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAdView(Q2 bannerAdViewInternal) {
        e0.checkNotNullParameter(bannerAdViewInternal, "bannerAdViewInternal");
        Context context = bannerAdViewInternal.d().getContext();
        e0.checkNotNullExpressionValue(context, "bannerAdViewInternal.container.context");
        this(context);
        this.f50609a = bannerAdViewInternal;
        bannerAdViewInternal.a(new WeakReference<>(this));
        bannerAdViewInternal.b(new WeakReference<>(this));
    }
}
