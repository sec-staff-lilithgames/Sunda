package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.b6;
import com.applovin.impl.b8;
import com.applovin.impl.c2;
import com.applovin.impl.c8;
import com.applovin.impl.d8;
import com.applovin.impl.g5;
import com.applovin.impl.i;
import com.applovin.impl.j;
import com.applovin.impl.k7;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.o0;
import com.applovin.impl.o3;
import com.applovin.impl.p6;
import com.applovin.impl.q2;
import com.applovin.impl.s;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements f.a, d8.a, j.b {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;

    /* renamed from: a, reason: collision with root package name */
    private final Context f14520a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdView f14521b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14522c;

    /* renamed from: d, reason: collision with root package name */
    private final View f14523d;

    /* renamed from: e, reason: collision with root package name */
    private long f14524e;

    /* renamed from: f, reason: collision with root package name */
    private y2 f14525f;

    /* renamed from: g, reason: collision with root package name */
    private String f14526g;

    /* renamed from: h, reason: collision with root package name */
    private String f14527h;

    /* renamed from: i, reason: collision with root package name */
    private final MaxAdViewConfiguration f14528i;

    /* renamed from: j, reason: collision with root package name */
    private final b f14529j;

    /* renamed from: k, reason: collision with root package name */
    private final d f14530k;

    /* renamed from: l, reason: collision with root package name */
    private final com.applovin.impl.sdk.f f14531l;

    /* renamed from: m, reason: collision with root package name */
    private final c8 f14532m;

    /* renamed from: n, reason: collision with root package name */
    private final d8 f14533n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f14534o;

    /* renamed from: p, reason: collision with root package name */
    private final Object f14535p;

    /* renamed from: q, reason: collision with root package name */
    private y2 f14536q;

    /* renamed from: r, reason: collision with root package name */
    private MaxAd f14537r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14538s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f14539t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f14540u;

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f14541v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14542w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f14543x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f14544y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f14545z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class b extends c {
        private b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                o oVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                e2.z(sb2, MaxAdViewImpl.this.adListener, oVar2, str2);
            }
            q2.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
                return;
            }
            y2 y2Var = (y2) maxAd;
            y2Var.g(MaxAdViewImpl.this.f14526g);
            y2Var.f(MaxAdViewImpl.this.f14527h);
            if (y2Var.y() == null) {
                MaxAdViewImpl.this.sdk.X().destroyAd(y2Var);
                onAdLoadFailed(y2Var.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (y2Var.q0()) {
                long jL0 = y2Var.l0();
                MaxAdViewImpl.this.sdk.O();
                if (o.a()) {
                    o oVarO = MaxAdViewImpl.this.sdk.O();
                    String str = MaxAdViewImpl.this.tag;
                    StringBuilder sbR = e2.r(jL0, "Scheduling banner ad refresh ", " milliseconds from now for '");
                    sbR.append(MaxAdViewImpl.this.adUnitId);
                    sbR.append("'...");
                    oVarO.a(str, sbR.toString());
                }
                MaxAdViewImpl.this.f14531l.a(jL0);
                if (MaxAdViewImpl.this.f14531l.g() || MaxAdViewImpl.this.f14540u) {
                    o oVar2 = MaxAdViewImpl.this.logger;
                    if (o.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f14531l.j();
                }
            }
            o oVar3 = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                o oVar4 = maxAdViewImpl3.logger;
                String str2 = maxAdViewImpl3.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdLoaded(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                e2.z(sb2, MaxAdViewImpl.this.adListener, oVar4, str2);
            }
            q2.f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.d(y2Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0034a {
        private c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f14536q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdClicked(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    e2.z(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                q2.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f14537r)) {
                MaxAdViewImpl.this.f14537r = null;
                if ((MaxAdViewImpl.this.f14536q.r0() || MaxAdViewImpl.this.B) && MaxAdViewImpl.this.f14538s) {
                    MaxAdViewImpl.this.f14538s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdCollapsed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    e2.z(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                q2.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f14536q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                    sb2.append(maxAd);
                    sb2.append(", error=");
                    sb2.append(maxError);
                    sb2.append("), listener=");
                    e2.z(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                q2.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f14536q)) {
                MaxAdViewImpl.this.f14537r = maxAd;
                if ((MaxAdViewImpl.this.f14536q.r0() || MaxAdViewImpl.this.B) && !MaxAdViewImpl.this.f14531l.g()) {
                    MaxAdViewImpl.this.f14538s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdViewAdListener.onAdExpanded(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    e2.z(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                q2.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f14536q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdHidden(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    e2.z(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                q2.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                o oVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sbO = e3.g.o("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbO.append(MaxAdViewImpl.this.requestListener);
                oVar2.a(str2, sbO.toString());
            }
            q2.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            q2.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f14536q)) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    o oVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayed(ad=");
                    sb2.append(maxAd);
                    sb2.append(duhsDlGWdBkekB.MAjU);
                    e2.z(sb2, MaxAdViewImpl.this.adListener, oVar2, str);
                }
                q2.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class d extends c {
        private d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            o oVar = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f14543x) {
                o oVar = MaxAdViewImpl.this.logger;
                if (o.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.a(o3.f14977y7)).booleanValue()) {
                    MaxAdViewImpl.this.b(maxAd);
                    return;
                } else {
                    MaxAdViewImpl.this.a(maxAd);
                    return;
                }
            }
            o oVar2 = MaxAdViewImpl.this.logger;
            if (o.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.X().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).a());
        this.f14522c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f14524e = Long.MAX_VALUE;
        this.f14534o = new Object();
        this.f14535p = new Object();
        this.f14536q = null;
        this.f14537r = null;
        this.f14541v = new AtomicBoolean();
        this.f14543x = false;
        this.f14520a = context.getApplicationContext();
        this.f14521b = maxAdView;
        this.f14523d = view;
        this.f14529j = new b();
        this.f14530k = new d();
        this.f14531l = new com.applovin.impl.sdk.f(this.sdk, this);
        this.f14532m = new c8(maxAdView, this.sdk);
        this.f14533n = new d8(maxAdView, this.sdk, this);
        this.f14528i = maxAdViewConfiguration;
        this.sdk.j().a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        if (o.a()) {
            this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        if (((Boolean) this.sdk.a(o3.f14978z7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.c(this, 0));
        } else {
            g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f14526g;
    }

    public void loadAd() {
        loadAd(i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.a(o3.f14977y7)).booleanValue()) {
            f();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        y2 y2Var = this.f14536q;
        if (y2Var != null && y2Var.P().equalsIgnoreCase(str)) {
            this.f14536q.h(str2);
            q2.b(this.adReviewListener, str2, this.f14536q);
            return;
        }
        y2 y2Var2 = this.f14525f;
        if (y2Var2 == null || !y2Var2.P().equalsIgnoreCase(str)) {
            return;
        }
        this.f14525f.h(str2);
    }

    @Override // com.applovin.impl.d8.a
    public void onLogVisibilityImpression() {
        a(this.f14536q, this.f14532m.a(this.f14536q));
    }

    public void onWindowVisibilityChanged(int i10) {
        if (((Boolean) this.sdk.a(o3.f14974v7)).booleanValue() && this.f14531l.h()) {
            if (b8.b(i10)) {
                if (o.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f14531l.d();
            } else {
                if (o.a()) {
                    this.logger.a(this.tag, "Ad view hidden");
                }
                this.f14531l.c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f14536q != null && o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbO = e3.g.o("Setting custom data (", str, ") for Ad Unit ID (");
            sbO.append(this.adUnitId);
            sbO.append(") after an ad has been loaded already.");
            oVar.k(str2, sbO.toString());
        }
        k7.b(str, this.tag);
        this.f14527h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f14536q != null && o.a()) {
            o oVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbO = e3.g.o("Setting placement (", str, ") for Ad Unit ID (");
            sbO.append(this.adUnitId);
            sbO.append(") after an ad has been loaded already.");
            oVar.k(str2, sbO.toString());
        }
        this.f14526g = str;
    }

    public void setPublisherBackgroundColor(int i10) {
        this.f14524e = i10;
    }

    public void startAutoRefresh() {
        this.f14540u = false;
        if (!this.f14531l.g()) {
            if (o.a()) {
                this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.f14531l.m();
        if (o.a()) {
            this.logger.a(this.tag, "Resumed auto-refresh with remaining time: " + this.f14531l.b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.f14536q == null) {
            if (this.f14544y || ((Boolean) this.sdk.a(o3.f14976x7)).booleanValue()) {
                this.f14540u = true;
                return;
            } else {
                o.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (o.a()) {
            this.logger.a(this.tag, "Pausing auto-refresh with remaining time: " + this.f14531l.b() + "ms");
        }
        this.f14531l.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdView{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f14521b) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", isDestroyed=");
        return a.b.p(sb2, a(), AbstractJsonLexerKt.END_OBJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(y2 y2Var) {
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.d(this, y2Var, 1));
    }

    private void e() {
        this.f14541v.set(false);
        if (this.f14525f != null) {
            i();
            return;
        }
        if (!b()) {
            if (o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(i.REFRESH);
        } else if (this.f14539t) {
            if (o.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(i.REFRESH);
        } else {
            if (o.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f14541v.set(true);
        }
    }

    private void f() {
        boolean z10;
        boolean z11;
        synchronized (this.f14535p) {
            try {
                z10 = false;
                this.f14541v.set(false);
                z11 = this.f14525f != null;
                if (!z11) {
                    if (b()) {
                        if (!this.f14539t) {
                            if (o.a()) {
                                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                            }
                            this.f14541v.set(true);
                        } else if (o.a()) {
                            this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                        }
                    } else if (o.a()) {
                        this.logger.a(this.tag, "Refreshing ad from network...");
                    }
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            i();
        } else if (z10) {
            loadAd(i.REFRESH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        h();
        if (this.f14525f != null) {
            this.sdk.X().destroyAd(this.f14525f);
        }
        synchronized (this.f14534o) {
            this.f14543x = true;
        }
        this.f14531l.a();
        this.sdk.j().b(this);
        if (this.sdk.R() != null) {
            this.sdk.R().c(this.adUnitId, this.f14522c);
        } else {
            this.sdk.Q().c(this.adUnitId, this.f14522c);
        }
        super.destroy();
    }

    private void h() {
        y2 y2Var;
        MaxAdView maxAdView = this.f14521b;
        if (maxAdView != null) {
            s.a(maxAdView, this.f14523d);
        }
        this.f14533n.b();
        synchronized (this.f14534o) {
            y2Var = this.f14536q;
        }
        MaxAd maxAd = this.f14537r;
        if (maxAd != null && maxAd.equals(y2Var)) {
            if (o.a()) {
                this.logger.a(this.tag, "Collapsing ad manually for removed ad.");
            }
            q2.b(this.f14529j, maxAd);
        }
        if (y2Var != null) {
            this.sdk.X().destroyAd(y2Var);
        }
    }

    private void i() {
        if (o.a()) {
            this.logger.a(this.tag, "Rendering for cached ad: " + this.f14525f + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.f14529j.onAdLoaded(this.f14525f);
        this.f14525f = null;
    }

    public void loadAd(i iVar) {
        if (o.a()) {
            this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        boolean z10 = this.f14544y || ((Boolean) this.sdk.a(o3.f14976x7)).booleanValue();
        if (z10 && !this.f14531l.g() && this.f14531l.h()) {
            o.h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f14531l.b()) + " seconds.");
            return;
        }
        if (!z10) {
            if (o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.f14529j);
        } else if (this.f14525f != null) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            i();
        } else if (this.f14542w) {
            if (o.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f14541v.set(true);
        } else {
            if (o.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(iVar, this.f14529j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(y2 y2Var) {
        View viewY = y2Var.y();
        String str = viewY == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f14521b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (o.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("MaxAdListener.onAdDisplayFailed(ad=");
                sb2.append(y2Var);
                sb2.append(", error=");
                sb2.append(maxErrorImpl);
                sb2.append("), listener=");
                e2.z(sb2, this.adListener, oVar, str2);
            }
            q2.a(this.adListener, (MaxAd) y2Var, (MaxError) maxErrorImpl, true);
            this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, y2Var);
            return;
        }
        h();
        a((v2) y2Var);
        if (y2Var.k0()) {
            this.f14533n.a(y2Var);
        }
        maxAdView.setDescendantFocusability(393216);
        if (y2Var.m0() != Long.MAX_VALUE) {
            this.f14523d.setBackgroundColor((int) y2Var.m0());
        } else {
            long j10 = this.f14524e;
            if (j10 != Long.MAX_VALUE) {
                this.f14523d.setBackgroundColor((int) j10);
            } else {
                this.f14523d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewY);
        a(viewY, y2Var);
        this.sdk.z().d(y2Var);
        c(y2Var);
        synchronized (this.f14534o) {
            this.f14536q = y2Var;
        }
        if (o.a()) {
            this.logger.a(this.tag, NyKZx.uRbvOOLBaTdyNPJ);
        }
        this.sdk.X().processRawAdImpression(y2Var, this.f14529j);
        if (StringUtils.isValidString(this.f14536q.getAdReviewCreativeId())) {
            q2.a(this.adReviewListener, this.f14536q.getAdReviewCreativeId(), (MaxAd) this.f14536q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new com.applovin.impl.mediation.ads.d(this, y2Var, 0), y2Var.o0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (o.a()) {
            this.logger.a(this.tag, "Loading ad for precache request...");
        }
        a(i.SEQUENTIAL_OR_PRECACHE, this.f14530k);
    }

    private void d() {
        if (b()) {
            if (o.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f14542w = true;
            this.sdk.r0().a((g5) new p6(this.sdk, "loadMaxAdForPrecacheRequest", new com.applovin.impl.mediation.ads.c(this, 1)), b6.b.MEDIATION);
        }
    }

    private void c(y2 y2Var) {
        int height = this.f14521b.getHeight();
        int width = this.f14521b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f14520a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f14520a, width);
            MaxAdFormat format = y2Var.getFormat();
            int height2 = (this.D ? format.getAdaptiveSize(iPxToDp2, this.f14521b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), o0.b(this.f14520a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sbF = w0.i.f(iPxToDp2, iPxToDp, "\n**************************************************\n`MaxAdView` size ", "x", " dp smaller than required ");
                sbF.append(this.D ? "adaptive " : "");
                sbF.append("size: ");
                sbF.append(iMin);
                sbF.append("x");
                String strF = a.b.f(height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n", sbF);
                if (o.a()) {
                    this.logger.b("AppLovinSdk", strF);
                }
            }
        }
    }

    private void a(i iVar, a.InterfaceC0034a interfaceC0034a) {
        if (a()) {
            boolean zC = k7.c(this.sdk);
            this.sdk.E().a(c2.E0, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + zC));
            if (!zC) {
                o.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            } else {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        AppLovinSdkUtils.runOnUiThread(true, new androidx.browser.customtabs.g(this, 15, interfaceC0034a, iVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a.InterfaceC0034a interfaceC0034a, i iVar) {
        int adaptiveWidth;
        y2 y2Var = this.f14536q;
        if (y2Var != null) {
            long jA = this.f14532m.a(y2Var);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f14536q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jA));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f14521b.getContext(), this.f14521b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f14521b.getContext(), this.f14521b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f14531l.g() || this.f14540u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f14545z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.f14528i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && iPxToDp != adaptiveWidth) {
            o.j(this.tag, o2.i(adaptiveWidth, iPxToDp, "The requested adaptive ad view width (", " dp) is different from the MaxAdView width (", " dp)."));
        }
        if (o.a()) {
            this.logger.a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + interfaceC0034a + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.sdk.X().loadAd(this.adUnitId, this.f14522c, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, this.f14520a, interfaceC0034a);
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (o.a()) {
                e2.y("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.f14544y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (o.a()) {
                e2.y("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.f14545z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (o.a()) {
                e2.y("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (o.a()) {
                e2.y("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.B = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (o.a()) {
                e2.y("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.C = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (o.a()) {
                e2.y("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            if (this.f14528i == null) {
                o.h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://developers.applovin.com/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        boolean zCompareAndSet;
        this.f14542w = false;
        synchronized (this.f14535p) {
            try {
                zCompareAndSet = this.f14541v.compareAndSet(true, false);
                if (!zCompareAndSet) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Saving precache ad...");
                    }
                    y2 y2Var = (y2) maxAd;
                    this.f14525f = y2Var;
                    y2Var.g(this.f14526g);
                    this.f14525f.f(this.f14527h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zCompareAndSet) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f14529j.onAdLoaded(maxAd);
        }
    }

    private boolean b() {
        if (this.A) {
            return false;
        }
        return ((Boolean) this.sdk.a(o3.E7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(y2 y2Var) {
        long jA = this.f14532m.a(y2Var);
        if (!y2Var.k0()) {
            a(y2Var, jA);
        }
        a(jA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (o.a()) {
                this.logger.a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.c(o3.f14968r7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.O();
            if (o.a()) {
                this.sdk.O().a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f14540u && !this.f14531l.g()) {
            this.f14539t = true;
            this.f14542w = false;
            long jLongValue = ((Long) this.sdk.a(o3.f14966q7)).longValue();
            if (jLongValue >= 0) {
                this.sdk.O();
                if (o.a()) {
                    o oVarO = this.sdk.O();
                    String str = this.tag;
                    StringBuilder sbR = e2.r(jLongValue, "Scheduling failed banner ad refresh ", " milliseconds from now for '");
                    sbR.append(this.adUnitId);
                    sbR.append("'...");
                    oVarO.a(str, sbR.toString());
                }
                this.f14531l.a(jLongValue);
                return;
            }
            return;
        }
        if (this.f14542w) {
            if (o.a()) {
                this.logger.a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f14542w = false;
        }
        if (this.f14541v.get()) {
            if (o.a()) {
                o oVar = this.logger;
                String str2 = this.tag;
                StringBuilder sb2 = new StringBuilder("Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(this.adUnitId);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                e2.z(sb2, this.adListener, oVar, str2);
            }
            q2.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(View view, y2 y2Var) {
        int iP0 = y2Var.p0();
        int iN0 = y2Var.n0();
        int iDpToPx = iP0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iP0);
        int iDpToPx2 = iN0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iN0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (o.a()) {
                this.logger.a(this.tag, o2.i(iDpToPx, iDpToPx2, "Pinning ad view to MAX ad view with width: ", " and height: ", "."));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i10 : b8.a(this.f14521b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i10);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    private void a(y2 y2Var, long j10) {
        if (o.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.X().processViewabilityAdImpressionPostback(y2Var, j10, this.f14529j);
    }

    private void a(long j10) {
        if (k7.a(j10, ((Long) this.sdk.a(o3.D7)).longValue()) && !this.C) {
            if (o.a()) {
                this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j10) + ", undesired: " + Long.toBinaryString(j10));
            }
            if (o.a()) {
                this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
            }
            this.f14539t = true;
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
        }
        this.f14539t = false;
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f14542w = false;
        if (this.f14541v.compareAndSet(true, false)) {
            if (o.a()) {
                this.logger.a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f14529j.onAdLoaded(maxAd);
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Saving precache ad...");
        }
        y2 y2Var = (y2) maxAd;
        this.f14525f = y2Var;
        y2Var.g(this.f14526g);
        this.f14525f.f(this.f14527h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        boolean z10;
        synchronized (this.f14534o) {
            z10 = this.f14543x;
        }
        return z10;
    }
}
