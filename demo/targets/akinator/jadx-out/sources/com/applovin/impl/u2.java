package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class u2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f15794a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f15795b;

    /* renamed from: c, reason: collision with root package name */
    private final Queue f15796c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f15797d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Object f15798e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private a f15799f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public u2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f15794a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f15799f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f15795b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, i.NATIVE_AD_PLACER);
    }

    public void a(MaxAd maxAd) {
        this.f15795b.destroy(maxAd);
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f15798e) {
            maxAd = null;
            while (!this.f15796c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                try {
                    maxAd = (MaxAd) this.f15796c.remove();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f15799f = null;
        a();
        this.f15795b.destroy();
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f15798e) {
            z10 = !this.f15796c.isEmpty();
        }
        return z10;
    }

    public void e() {
        synchronized (this.f15798e) {
            try {
                if (!this.f15797d && this.f15796c.size() < this.f15794a) {
                    this.f15797d = true;
                    this.f15795b.loadAd();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f15799f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f15799f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f15799f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f15798e) {
            this.f15796c.add(maxAd);
            this.f15797d = false;
            e();
        }
        a aVar = this.f15799f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a() {
        synchronized (this.f15798e) {
            try {
                Iterator it = this.f15796c.iterator();
                while (it.hasNext()) {
                    a((MaxAd) it.next());
                }
                this.f15796c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f15795b.render(maxNativeAdView, maxAd);
    }
}
