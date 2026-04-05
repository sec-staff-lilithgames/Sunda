package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.a3;
import com.applovin.impl.b6;
import com.applovin.impl.g5;
import com.applovin.impl.i;
import com.applovin.impl.j;
import com.applovin.impl.k7;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.o3;
import com.applovin.impl.p6;
import com.applovin.impl.q2;
import com.applovin.impl.s1;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0038a, j.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* renamed from: a, reason: collision with root package name */
    private final c f14575a;

    /* renamed from: b, reason: collision with root package name */
    private String f14576b;

    /* renamed from: c, reason: collision with root package name */
    private String f14577c;

    /* renamed from: d, reason: collision with root package name */
    private i f14578d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f14579e;

    /* renamed from: f, reason: collision with root package name */
    private MaxNativeAdListener f14580f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f14581g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f14582h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f14583a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f14584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f14585c;

        public a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f14583a = maxNativeAd;
            this.f14584b = list;
            this.f14585c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f14583a.prepareForInteraction(this.f14584b, this.f14585c)) {
                return;
            }
            o.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f14587a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f14588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f14589c;

        public b(MaxNativeAdView maxNativeAdView, a3 a3Var, MaxNativeAd maxNativeAd) {
            this.f14587a = maxNativeAdView;
            this.f14588b = a3Var;
            this.f14589c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.f14587a);
            }
            MaxNativeAdLoaderImpl.this.sdk.z().d(this.f14588b);
            this.f14587a.render(this.f14588b, MaxNativeAdLoaderImpl.this.f14575a, MaxNativeAdLoaderImpl.this.sdk);
            this.f14589c.setNativeAdView(this.f14587a);
            if (this.f14589c.prepareForInteraction(this.f14587a.getClickableViews(), this.f14587a)) {
                return;
            }
            this.f14589c.prepareViewForInteraction(this.f14587a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements a.InterfaceC0034a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f14580f);
            }
            q2.a(MaxNativeAdLoaderImpl.this.f14580f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f14580f);
            }
            q2.a(MaxNativeAdLoaderImpl.this.f14580f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new g(0, this, maxAd));
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            q2.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        public /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            a3 a3Var = (a3) maxAd;
            a3Var.g(MaxNativeAdLoaderImpl.this.f14576b);
            a3Var.f(MaxNativeAdLoaderImpl.this.f14577c);
            synchronized (MaxNativeAdLoaderImpl.this.f14579e) {
                MaxNativeAdLoaderImpl.this.f14582h.add(a3Var);
            }
            MaxNativeAdView maxNativeAdViewA = MaxNativeAdLoaderImpl.this.a(a3Var.J());
            if (maxNativeAdViewA == null) {
                o oVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (o.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                o oVar3 = MaxNativeAdLoaderImpl.this.logger;
                if (o.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl3.logger.a(maxNativeAdLoaderImpl3.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f14580f);
                }
                q2.a(MaxNativeAdLoaderImpl.this.f14580f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(a3Var);
                return;
            }
            a(maxNativeAdViewA);
            MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA, a3Var, a3Var.getNativeAd());
            o oVar4 = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + maxNativeAdViewA + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f14580f);
            }
            q2.a(MaxNativeAdLoaderImpl.this.f14580f, maxNativeAdViewA, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(a3Var);
            MaxNativeAdLoaderImpl.this.a(maxNativeAdViewA);
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            a3 a3VarB;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (a3VarB = adViewTracker.b()) == null) {
                return;
            }
            o oVar = MaxNativeAdLoaderImpl.this.logger;
            if (o.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(a3VarB);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }
    }

    public MaxNativeAdLoaderImpl(String str, k kVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", kVar);
        this.f14575a = new c(this, null);
        this.f14578d = i.PUBLISHER_INITIATED;
        this.f14579e = new Object();
        this.f14581g = new HashMap();
        this.f14582h = new HashSet();
        kVar.j().a(this);
        if (o.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f14580f = null;
        this.sdk.j().b(this);
        synchronized (this.f14579e) {
            this.f14581g.clear();
            this.f14582h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.f14576b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((a3) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (o.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.c();
        } else if (o.a()) {
            this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (o.a()) {
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f14575a + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.X().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f14578d, this.localExtraParameters, this.extraParameters, k.o(), this.f14575a);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0038a
    public void onAdExpired(s1 s1Var) {
        if (o.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (o.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + s1Var + "), listener=" + this.f14580f);
        }
        q2.b(this.f14580f, (MaxAd) s1Var, true);
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        a3 a3Var;
        Iterator it = this.f14582h.iterator();
        while (true) {
            if (!it.hasNext()) {
                a3Var = null;
                break;
            } else {
                a3Var = (a3) it.next();
                if (a3Var.P().equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        if (a3Var != null) {
            a3Var.h(str2);
            q2.b(this.adReviewListener, str2, a3Var);
            synchronized (this.f14579e) {
                this.f14582h.remove(a3Var);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        a3 a3Var = (a3) maxAd;
        MaxNativeAd nativeAd = a3Var.getNativeAd();
        if (nativeAd == null) {
            if (o.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        a3Var.a(viewGroup);
        this.sdk.z().d(a3Var);
        a((v2) a3Var);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(a3Var, viewGroup, this.f14575a, this.sdk));
        a aVar = new a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.r0().a((g5) new p6(this.sdk, "renderMaxNativeAd", aVar), b6.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof a3)) {
            o.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            o.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        a3 a3Var = (a3) maxAd;
        MaxNativeAd nativeAd = a3Var.getNativeAd();
        if (nativeAd == null) {
            if (o.a()) {
                this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(o3.K7)).booleanValue()) {
            o.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, a3Var, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        k7.b(str, this.tag);
        this.f14577c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof i)) {
            this.f14578d = (i) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (o.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f14580f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f14576b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f14580f + ", revenueListener=" + this.revenueListener + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var) {
        if (a3Var.o0().get()) {
            return;
        }
        this.sdk.f().a(a3Var, this);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f14579e) {
            this.f14581g.put(str, maxNativeAdView);
        }
    }

    public void destroy(MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof a3) {
            a3 a3Var = (a3) maxAd;
            if (a3Var.r0()) {
                if (o.a()) {
                    this.logger.a(this.tag, "Native ad (" + a3Var + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.f14579e) {
                this.f14582h.remove(a3Var);
            }
            MaxNativeAdView maxNativeAdViewM0 = a3Var.m0();
            if (maxNativeAdViewM0 != null && (adViewTracker = maxNativeAdViewM0.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                maxNativeAdViewM0.recycle();
            }
            MaxNativeAd nativeAd = a3Var.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(a3Var);
            this.sdk.X().destroyAd(a3Var);
            if (this.sdk.R() != null) {
                this.sdk.R().c(this.adUnitId, a3Var.J());
                return;
            } else {
                this.sdk.Q().c(this.adUnitId, a3Var.J());
                return;
            }
        }
        if (o.a()) {
            this.logger.a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f14579e) {
            maxNativeAdView = (MaxNativeAdView) this.f14581g.remove(str);
        }
        return maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView, a3 a3Var, MaxNativeAd maxNativeAd) {
        a3Var.a(maxNativeAdView);
        a((v2) a3Var);
        b bVar = new b(maxNativeAdView, a3Var, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.r0().a((g5) new p6(this.sdk, "renderMaxNativeAd", bVar), b6.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker == null || !maxNativeAdView.isAttachedToWindow()) {
            return;
        }
        adViewTracker.c();
    }
}
