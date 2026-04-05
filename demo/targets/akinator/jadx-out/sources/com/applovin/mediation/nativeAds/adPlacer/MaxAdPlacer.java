package com.applovin.mediation.nativeAds.adPlacer;

import a2.s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.browser.customtabs.h;
import com.applovin.impl.a3;
import com.applovin.impl.adview.p;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t2;
import com.applovin.impl.u2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxAdPlacer implements u2.a {

    /* renamed from: a, reason: collision with root package name */
    private AppLovinSdkUtils.Size f16477a;

    /* renamed from: b, reason: collision with root package name */
    private MaxNativeAdViewBinder f16478b;

    /* renamed from: c, reason: collision with root package name */
    private final t2 f16479c;

    /* renamed from: d, reason: collision with root package name */
    private final u2 f16480d;

    /* renamed from: e, reason: collision with root package name */
    private Listener f16481e;
    protected final o logger;
    protected final k sdk;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i10);

        void onAdRemoved(int i10);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings) {
        this(maxAdPlacerSettings, k.o());
    }

    public void clearAds() {
        a(this.f16479c.b(), new s(this, 18));
    }

    public Collection<Integer> clearTrailingAds(int i10) {
        Collection<Integer> collectionE = this.f16479c.e(i10);
        if (!collectionE.isEmpty()) {
            a(collectionE, new h(this, i10, collectionE, 1));
        }
        return collectionE;
    }

    public void destroy() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f16480d.c();
    }

    public long getAdItemId(int i10) {
        if (isFilledPosition(i10)) {
            return -System.identityHashCode(this.f16479c.a(i10));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i10) {
        if (isFilledPosition(i10)) {
            boolean z10 = this.f16477a != AppLovinSdkUtils.Size.ZERO;
            a3 a3Var = (a3) this.f16479c.a(i10);
            if (z10) {
                return this.f16477a;
            }
            if (a3Var.m0() != null) {
                View mainView = a3Var.m0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i10) {
        return this.f16479c.b(i10);
    }

    public int getAdjustedPosition(int i10) {
        return this.f16479c.c(i10);
    }

    public int getOriginalPosition(int i10) {
        return this.f16479c.d(i10);
    }

    public void insertItem(int i10) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i10);
        }
        this.f16479c.f(i10);
    }

    public boolean isAdPosition(int i10) {
        return this.f16479c.g(i10);
    }

    public boolean isFilledPosition(int i10) {
        return this.f16479c.h(i10);
    }

    public void loadAds() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.f16480d.e();
    }

    public void moveItem(int i10, int i11) {
        this.f16479c.b(i10, i11);
    }

    @Override // com.applovin.impl.u2.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f16481e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.u2.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f16481e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.u2.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (o.a()) {
            this.logger.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.u2.a
    public void onNativeAdLoaded() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(int i10) {
        a(isFilledPosition(i10) ? Collections.singletonList(Integer.valueOf(i10)) : Collections.EMPTY_LIST, new p(this, i10, 2));
    }

    public void renderAd(int i10, ViewGroup viewGroup) {
        MaxAd maxAdA = this.f16479c.a(i10);
        if (maxAdA == null) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i10);
                return;
            }
            return;
        }
        MaxNativeAdView maxNativeAdViewM0 = ((a3) maxAdA).m0();
        if (maxNativeAdViewM0 == null) {
            if (this.f16478b == null) {
                if (o.a()) {
                    this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            maxNativeAdViewM0 = new MaxNativeAdView(this.f16478b, viewGroup.getContext());
            if (this.f16480d.a(maxNativeAdViewM0, maxAdA)) {
                if (o.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i10);
                }
            } else if (o.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i10);
            }
        } else if (o.a()) {
            this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i10);
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewM0.getParent() != null) {
            ((ViewGroup) maxNativeAdViewM0.getParent()).removeView(maxNativeAdViewM0);
        }
        viewGroup.addView(maxNativeAdViewM0, -1, -1);
    }

    public void setAdSize(int i10, int i11) {
        this.f16477a = new AppLovinSdkUtils.Size(i10, i11);
    }

    public void setListener(Listener listener) {
        this.f16481e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f16478b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i10, int i11) {
        this.f16479c.c(i10, i11);
        if (i10 == -1 || i11 == -1) {
            return;
        }
        a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10, Collection collection) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i10);
        }
        this.f16479c.a(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f16479c.a();
        this.f16480d.a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f16477a = AppLovinSdkUtils.Size.ZERO;
        k kVarA = appLovinSdk.a();
        this.sdk = kVarA;
        o oVarO = kVarA.O();
        this.logger = oVarO;
        this.f16479c = new t2(maxAdPlacerSettings);
        this.f16480d = new u2(maxAdPlacerSettings, context, this);
        if (o.a()) {
            oVarO.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i10);
        }
        this.f16479c.i(i10);
    }

    private void a() {
        int iC;
        while (this.f16480d.d() && (iC = this.f16479c.c()) != -1) {
            if (o.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + iC);
            }
            this.f16479c.a(this.f16480d.b(), iC);
            Listener listener = this.f16481e;
            if (listener != null) {
                listener.onAdLoaded(iC);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f16480d.a(this.f16479c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (o.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f16481e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f16481e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
