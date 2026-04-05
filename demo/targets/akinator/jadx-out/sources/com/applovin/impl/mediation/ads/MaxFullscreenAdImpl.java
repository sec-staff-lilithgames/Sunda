package com.applovin.impl.mediation.ads;

import a2.s;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.k0;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.b6;
import com.applovin.impl.c2;
import com.applovin.impl.g0;
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
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.v2;
import com.applovin.impl.v4;
import com.applovin.impl.x4;
import com.applovin.impl.z2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import j1.o2;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0038a, j.b {

    /* renamed from: a, reason: collision with root package name */
    private final a f14549a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f14550b;

    /* renamed from: c, reason: collision with root package name */
    private final b f14551c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.b f14552d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f14553e;

    /* renamed from: f, reason: collision with root package name */
    private z2 f14554f;

    /* renamed from: g, reason: collision with root package name */
    private c f14555g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f14556h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f14557i;

    /* renamed from: j, reason: collision with root package name */
    private g0 f14558j;

    /* renamed from: k, reason: collision with root package name */
    private long f14559k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14560l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f14561m;

    /* renamed from: n, reason: collision with root package name */
    private String f14562n;

    /* renamed from: o, reason: collision with root package name */
    private String f14563o;

    /* renamed from: p, reason: collision with root package name */
    private String f14564p;

    /* renamed from: q, reason: collision with root package name */
    private WeakReference f14565q;

    /* renamed from: r, reason: collision with root package name */
    private WeakReference f14566r;

    /* renamed from: s, reason: collision with root package name */
    private WeakReference f14567s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        Activity getActivity();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements MaxAdListener, MaxAdRevenueListener, a.InterfaceC0034a {
        public b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                e2.z(sb2, MaxFullscreenAdImpl.this.adListener, oVar2, str);
            }
            q2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            z2 z2Var = (z2) maxAd;
            MaxFullscreenAdImpl.this.d();
            boolean z10 = MaxFullscreenAdImpl.this.f14561m;
            if (z10) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Ad failover failed");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(c2.f13726n0, z2Var, CollectionUtils.hashMap("details", z2Var.o0()));
                MaxFullscreenAdImpl.this.f14561m = false;
            }
            MaxFullscreenAdImpl.this.a(c.IDLE, new f(this, maxAd, z10, z2Var, maxError, 0));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            z2 z2Var = (z2) maxAd;
            if (MaxFullscreenAdImpl.this.f14561m) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Ad failover succeeded");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(c2.f13724m0, z2Var, CollectionUtils.hashMap("details", z2Var.o0()));
                MaxFullscreenAdImpl.this.f14561m = false;
            }
            MaxFullscreenAdImpl.this.sdk.f().a(z2Var);
            MaxFullscreenAdImpl.this.b(z2Var);
            MaxFullscreenAdImpl.this.f();
            if (((Integer) MaxFullscreenAdImpl.this.sdk.a(o3.f14946f8)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.r0().b(new p6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new g(3, this, z2Var)), b6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                o oVar3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                e2.z(sb2, MaxFullscreenAdImpl.this.adListener, oVar3, str);
            }
            q2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f14561m = false;
            MaxFullscreenAdImpl.this.d();
            MaxFullscreenAdImpl.this.a(c.IDLE, new g(2, this, maxAd));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxFullscreenAdImpl.this.e();
            MaxFullscreenAdImpl.this.a(c.IDLE, new androidx.browser.customtabs.g(this, 17, str, maxError));
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            z2 z2Var;
            synchronized (MaxFullscreenAdImpl.this.f14553e) {
                z2Var = MaxFullscreenAdImpl.this.f14554f;
            }
            MaxFullscreenAdImpl.this.sdk.I().a(MaxFullscreenAdImpl.this.adUnitId);
            z2 z2Var2 = (z2) maxAd;
            MaxFullscreenAdImpl.this.a(z2Var2);
            if (!MaxFullscreenAdImpl.this.f14556h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new androidx.browser.customtabs.g(this, 16, z2Var2, maxAd));
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f14557i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.g();
            }
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + z2Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            q2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) z2Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sbO = e3.g.o("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbO.append(MaxFullscreenAdImpl.this.requestListener);
                oVar2.a(str2, sbO.toString());
            }
            q2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            q2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(z2 z2Var, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f14561m) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Attempting ad failover");
                }
                z2Var.j(MaxFullscreenAdImpl.this.f14564p);
                MaxFullscreenAdImpl.this.sdk.P().a(c2.f13722l0, z2Var, CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.f14564p));
                MaxFullscreenAdImpl.this.g();
                return;
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                o oVar3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                e2.z(sb2, MaxFullscreenAdImpl.this.adListener, oVar3, str);
            }
            q2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                e2.z(sb2, MaxFullscreenAdImpl.this.adListener, oVar2, str2);
            }
            q2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(z2 z2Var) {
            if (z2Var.w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.P().a(c2.f13710f0, z2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                o oVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                e2.z(sb2, MaxFullscreenAdImpl.this.adListener, oVar2, str);
            }
            q2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z10, z2 z2Var, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z10 && z2Var.t0()) {
                if (MaxFullscreenAdImpl.this.b()) {
                    AppLovinSdkUtils.runOnUiThread(true, new s(this, 12));
                    return;
                }
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Unable to attempt ad failover due to missing cached ad");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(c2.f13720k0, z2Var);
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                o oVar3 = maxFullscreenAdImpl2.logger;
                String str = maxFullscreenAdImpl2.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(maxAd);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                e2.z(sb2, MaxFullscreenAdImpl.this.adListener, oVar3, str);
            }
            q2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.f14561m = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, k kVar, Context context) {
        super(str, maxAdFormat, str2, kVar);
        this.f14553e = new Object();
        this.f14554f = null;
        this.f14555g = c.IDLE;
        this.f14556h = new AtomicBoolean();
        this.f14557i = new AtomicBoolean();
        this.f14565q = new WeakReference(null);
        this.f14566r = new WeakReference(null);
        this.f14567s = new WeakReference(null);
        this.f14549a = aVar;
        this.f14551c = createAdListenerWrapper();
        this.f14552d = new com.applovin.impl.mediation.b(kVar);
        this.f14550b = new WeakReference(context);
        kVar.j().a(this);
        o.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    public b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new s(this, 11));
    }

    public boolean isReady() {
        boolean z10;
        synchronized (this.f14553e) {
            try {
                z2 z2Var = this.f14554f;
                z10 = z2Var != null && z2Var.V() && this.f14555g == c.READY;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            this.sdk.I().c(this.adUnitId);
        }
        return z10;
    }

    public void loadAd() {
        loadAd(i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0038a
    public void onAdExpired(s1 s1Var) {
        if (o.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f14556h.set(true);
        a aVar = this.f14549a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            e();
            this.f14551c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f14551c);
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        z2 z2Var = this.f14554f;
        if (z2Var == null || !z2Var.P().equalsIgnoreCase(str)) {
            return;
        }
        this.f14554f.h(str2);
        q2.b(this.adReviewListener, str2, this.f14554f);
    }

    public void showAd(String str, String str2, Activity activity) {
        z2 z2Var;
        List listB = this.sdk.t0().b();
        if (!this.sdk.t0().d() || listB == null || (z2Var = this.f14554f) == null || listB.contains(z2Var.c())) {
            if (activity == null) {
                activity = this.sdk.v0();
            }
            Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new al.a(9, str, (Object) this, (Object) str2, (Object) activity2));
                return;
            }
            return;
        }
        String str3 = "Attempting to show ad from <" + this.f14554f.c() + "> which is not in the list of selected ad networks " + listB;
        o.h(this.tag, str3);
        a(c.IDLE, new e(this, str3, 2));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f14549a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", requestListener");
        sb2.append(this.requestListener);
        sb2.append(", adReviewListener");
        sb2.append(this.adReviewListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        z2 z2Var = this.f14554f;
        a((MaxAd) z2Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(z2Var);
            sb2.append(", error=");
            sb2.append(maxErrorImpl);
            sb2.append("), listener=");
            e2.z(sb2, this.adListener, oVar, str2);
        }
        q2.a(this.adListener, (MaxAd) z2Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, z2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        z2 z2Var;
        if (this.f14556h.compareAndSet(true, false)) {
            synchronized (this.f14553e) {
                z2Var = this.f14554f;
                this.f14554f = null;
            }
            this.sdk.X().destroyAd(z2Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Long l9 = (Long) this.sdk.a(v4.B2);
        if (l9.longValue() <= 0) {
            return;
        }
        this.f14558j = g0.a(l9.longValue(), true, this.sdk, new g(1, this, l9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Activity activityV0 = (Activity) this.f14565q.get();
        if (activityV0 == null) {
            activityV0 = this.sdk.v0();
        }
        Activity activity = activityV0;
        if (this.f14560l) {
            showAd(this.f14562n, this.f14563o, (ViewGroup) this.f14566r.get(), (k0) this.f14567s.get(), activity);
        } else {
            showAd(this.f14562n, this.f14563o, activity);
        }
    }

    public void loadAd(i iVar) {
        if (o.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f14555g == c.DESTROYED) {
            boolean zC = k7.c(this.sdk);
            this.sdk.E().a(c2.E0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.f14549a;
            a(c.LOADING, new al.a(this, aVar != null ? aVar.getActivity() : null, (Context) this.f14550b.get(), iVar));
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (o.a()) {
            o oVar = this.logger;
            String str = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
            sb2.append(this.f14554f);
            sb2.append("), listener=");
            e2.z(sb2, this.adListener, oVar, str);
        }
        q2.f(this.adListener, (MaxAd) this.f14554f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f14553e) {
            try {
                if (this.f14554f != null) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f14554f + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    this.sdk.X().destroyAd(this.f14554f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.sdk.j().b(this);
        this.f14552d.a();
        g0 g0Var = this.f14558j;
        if (g0Var != null) {
            g0Var.a();
            this.f14558j = null;
        }
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (((Boolean) this.sdk.a(v4.A2)).booleanValue()) {
            this.sdk.q0().b(x4.Q);
        }
        if (this.f14558j != null) {
            this.sdk.q0().b(x4.R);
            this.f14558j.a();
            this.f14558j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, Context context, i iVar) {
        Context context2;
        Context contextO = activity;
        if (activity != null) {
            context2 = contextO;
        } else if (context != null) {
            context2 = context;
        } else {
            if (this.sdk.v0() != null) {
                contextO = this.sdk.v0();
            } else {
                contextO = k.o();
            }
            context2 = contextO;
        }
        this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, context2, this.f14551c);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, k0 k0Var, Activity activity) {
        z2 z2Var;
        if (viewGroup != null && k0Var != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(o3.f14938a8)).booleanValue()) {
                o.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                q2.a(this.adListener, (MaxAd) this.f14554f, (MaxError) maxErrorImpl, true);
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f14554f);
                return;
            }
            List listB = this.sdk.t0().b();
            if (this.sdk.t0().d() && listB != null && (z2Var = this.f14554f) != null && !listB.contains(z2Var.c())) {
                String str3 = "Attempting to show ad from <" + this.f14554f.c() + "> which is not in the list of selected ad networks " + listB;
                o.h(this.tag, str3);
                a(c.IDLE, new e(this, str3, 0));
                return;
            }
            if (activity == null) {
                activity = this.sdk.v0();
            }
            Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new com.applovin.impl.mediation.j(this, str, str2, activity2, viewGroup, k0Var));
                return;
            }
            return;
        }
        o.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (o.a()) {
            o oVar = this.logger;
            String str4 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(this.f14554f);
            sb2.append(", error=");
            sb2.append(maxErrorImpl2);
            sb2.append("), listener=");
            e2.z(sb2, this.adListener, oVar, str4);
        }
        q2.a(this.adListener, (MaxAd) this.f14554f, (MaxError) maxErrorImpl2, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f14554f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f14560l = false;
        this.f14565q = new WeakReference(activity);
        this.sdk.X().showFullscreenAd(this.f14554f, activity, this.f14551c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(v2 v2Var) {
        if (((Boolean) this.sdk.a(v4.A2)).booleanValue()) {
            List listB = v2Var.b("mappk_urls");
            if (CollectionUtils.isEmpty(listB)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) listB));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(com.applovin.impl.e2.a(v2Var)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(t3.a(v2Var, this.sdk)));
            this.sdk.q0().b(x4.Q, jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, k0 k0Var) {
        a(str, str2);
        this.f14560l = true;
        this.f14565q = new WeakReference(activity);
        this.f14566r = new WeakReference(viewGroup);
        this.f14567s = new WeakReference(k0Var);
        this.sdk.X().showFullscreenAd(this.f14554f, viewGroup, k0Var, activity, this.f14551c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        z2 z2Var = this.f14554f;
        a((MaxAd) z2Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb2.append(z2Var);
            sb2.append(", error=");
            sb2.append(maxErrorImpl);
            sb2.append("), listener=");
            e2.z(sb2, this.adListener, oVar, str2);
        }
        q2.a(this.adListener, (MaxAd) z2Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, z2Var);
    }

    private boolean a(Activity activity, String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f14555g == c.DESTROYED) {
            boolean zC = k7.c(this.sdk);
            this.sdk.E().a(c2.E0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String strO = o2.o(new StringBuilder("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
            o.h(this.tag, strO);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, strO);
            u3 u3Var = new u3(this.adUnitId, this.adFormat, str);
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(u3Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                e2.z(sb2, this.adListener, oVar, str2);
            }
            q2.a(this.adListener, (MaxAd) u3Var, (MaxError) maxErrorImpl, true);
            if (this.f14554f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f14554f);
            }
            return false;
        }
        Long l9 = (Long) this.sdk.a(o3.M7);
        Long l10 = (Long) this.sdk.a(o3.F7);
        if (l9.longValue() > 0 && (this.f14554f.getTimeToLiveMillis() < l10.longValue() || this.f14556h.get())) {
            this.f14557i.set(true);
            this.sdk.r0().a(new p6(this.sdk, "handleShowOnLoadTimeoutError", new e(this, str, 1)), b6.b.TIMEOUT, l9.longValue());
            return false;
        }
        if (k7.a(k.o()) != 0 && this.sdk.o0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!k7.c(this.sdk)) {
                if (((Boolean) this.sdk.a(o3.Z7)).booleanValue()) {
                    o.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (o.a()) {
                        o oVar2 = this.logger;
                        String str3 = this.tag;
                        StringBuilder sb3 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                        sb3.append(this.f14554f);
                        sb3.append(", error=");
                        sb3.append(maxErrorImpl2);
                        sb3.append("), listener=");
                        e2.z(sb3, this.adListener, oVar2, str3);
                    }
                    q2.a(this.adListener, (MaxAd) this.f14554f, (MaxError) maxErrorImpl2, true);
                    this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f14554f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.I().d() && !this.sdk.I().c()) {
            return true;
        }
        o.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (o.a()) {
            o oVar3 = this.logger;
            String str4 = this.tag;
            StringBuilder sb4 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
            sb4.append(this.f14554f);
            sb4.append(", error=");
            sb4.append(maxErrorImpl3);
            sb4.append("), listener=");
            e2.z(sb4, this.adListener, oVar3, str4);
        }
        q2.a(this.adListener, (MaxAd) this.f14554f, (MaxError) maxErrorImpl3, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f14554f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        if (this.sdk.R() != null) {
            return this.sdk.R().e(this.adUnitId);
        }
        return this.sdk.Q().d(this.adUnitId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.f14557i.compareAndSet(true, false)) {
            o.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.I().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            u3 u3Var = new u3(this.adUnitId, this.adFormat, str);
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(u3Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                e2.z(sb2, this.adListener, oVar, str2);
            }
            q2.a(this.adListener, (MaxAd) u3Var, (MaxError) maxErrorImpl, true);
            if (this.f14554f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f14554f);
            }
        }
    }

    private void a(String str, String str2) {
        this.f14552d.e(this.f14554f);
        this.f14554f.g(str);
        this.f14554f.f(str2);
        this.f14562n = str;
        this.f14563o = str2;
        this.f14564p = this.f14554f.getNetworkName();
        this.sdk.z().d(this.f14554f);
        if (o.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f14554f + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        a((v2) this.f14554f);
    }

    private void a() {
        z2 z2Var;
        synchronized (this.f14553e) {
            z2Var = this.f14554f;
            this.f14554f = null;
        }
        this.sdk.X().destroyAd(z2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l9) {
        this.f14559k = l9.longValue() + this.f14559k;
        this.sdk.q0().b(x4.R, Long.valueOf(this.f14559k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(z2 z2Var) {
        if (this.sdk.f().a(z2Var, this)) {
            if (o.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + z2Var);
            }
            this.f14554f = z2Var;
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(z2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z10;
        c cVar2 = this.f14555g;
        synchronized (this.f14553e) {
            try {
                c cVar3 = c.IDLE;
                if (cVar2 == cVar3) {
                    if (cVar == c.LOADING || cVar == c.DESTROYED) {
                        z10 = true;
                    } else {
                        if (cVar == c.SHOWING) {
                            o.h(this.tag, "No ad is loading or loaded");
                        } else if (o.a()) {
                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                        }
                        z10 = false;
                    }
                } else {
                    c cVar4 = c.LOADING;
                    if (cVar2 == cVar4) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                o.h(this.tag, "An ad is already loading");
                            } else if (cVar != c.READY) {
                                if (cVar == c.SHOWING) {
                                    o.h(this.tag, "An ad is not ready to be shown yet");
                                } else if (cVar != c.DESTROYED) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z10 = false;
                        }
                        z10 = true;
                    } else {
                        c cVar5 = c.READY;
                        if (cVar2 == cVar5) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    o.h(this.tag, "An ad is already loaded");
                                } else if (cVar == cVar5) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "An ad is already marked as ready");
                                    }
                                } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                                z10 = false;
                            }
                            z10 = true;
                        } else {
                            c cVar6 = c.SHOWING;
                            if (cVar2 == cVar6) {
                                if (cVar != cVar3) {
                                    if (cVar == cVar4) {
                                        o.h(this.tag, "Can not load another ad while the ad is showing");
                                    } else if (cVar == cVar5) {
                                        if (o.a()) {
                                            this.logger.b(this.tag, "An ad is already showing, ignoring");
                                        }
                                    } else if (cVar == cVar6) {
                                        o.h(this.tag, "The ad is already showing, not showing another one");
                                    } else if (cVar != c.DESTROYED) {
                                        if (o.a()) {
                                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                        }
                                    }
                                }
                                z10 = true;
                            } else if (cVar2 == c.DESTROYED) {
                                o.h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (o.a()) {
                                this.logger.b(this.tag, "Unknown state: " + this.f14555g);
                            }
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Transitioning from " + this.f14555g + " to " + cVar + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    this.f14555g = cVar;
                } else if (o.a()) {
                    this.logger.k(this.tag, "Not allowed to transition from " + this.f14555g + " to " + cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((z2) maxAd);
        this.f14552d.a();
        a();
        this.sdk.a0().a((v2) maxAd);
    }
}
