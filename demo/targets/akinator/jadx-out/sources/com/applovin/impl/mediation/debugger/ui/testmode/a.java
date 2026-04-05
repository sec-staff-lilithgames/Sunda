package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.amazon.aps.ads.ApsConstants;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.b3;
import com.applovin.impl.k3;
import com.applovin.impl.k7;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w;
import com.applovin.impl.x;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.ironsource.Mf;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class a extends k3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, w.a {

    /* renamed from: a, reason: collision with root package name */
    private b3 f14661a;

    /* renamed from: b, reason: collision with root package name */
    private k f14662b;

    /* renamed from: c, reason: collision with root package name */
    private MaxAdView f14663c;

    /* renamed from: d, reason: collision with root package name */
    private MaxAdView f14664d;

    /* renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f14665e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f14666f;

    /* renamed from: g, reason: collision with root package name */
    private MaxRewardedAd f14667g;

    /* renamed from: h, reason: collision with root package name */
    private MaxAd f14668h;

    /* renamed from: i, reason: collision with root package name */
    private MaxNativeAdLoader f14669i;

    /* renamed from: j, reason: collision with root package name */
    private List f14670j;

    /* renamed from: k, reason: collision with root package name */
    private String f14671k;

    /* renamed from: l, reason: collision with root package name */
    private AdControlButton f14672l;

    /* renamed from: m, reason: collision with root package name */
    private AdControlButton f14673m;

    /* renamed from: n, reason: collision with root package name */
    private AdControlButton f14674n;

    /* renamed from: o, reason: collision with root package name */
    private AdControlButton f14675o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f14676p;

    /* renamed from: q, reason: collision with root package name */
    private AdControlButton f14677q;

    /* renamed from: r, reason: collision with root package name */
    private Button f14678r;

    /* renamed from: s, reason: collision with root package name */
    private Button f14679s;

    /* renamed from: t, reason: collision with root package name */
    private FrameLayout f14680t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f14681u;

    /* renamed from: v, reason: collision with root package name */
    private Switch f14682v;

    /* renamed from: w, reason: collision with root package name */
    private Switch f14683w;

    /* renamed from: x, reason: collision with root package name */
    private Map f14684x;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    public class C0035a extends MaxNativeAdListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f14685a;

        public C0035a(MaxNativeAdView maxNativeAdView) {
            this.f14685a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f14668h != null) {
                a.this.f14669i.destroy(a.this.f14668h);
            }
            a.this.f14668h = maxAd;
            a.this.f14669i.render(this.f14685a, maxAd);
            a.this.f14681u.removeAllViews();
            a.this.f14681u.addView(this.f14685a);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List listR = this.f14661a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f14661a.m();
        this.f14671k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f14662b.z0(), this);
        this.f14667g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.f14667g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f14676p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f14676p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.k3
    public k getSdk() {
        return this.f14662b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f14661a.x() == null || !this.f14661a.x().containsKey(maxAdFormat)) ? this.f14661a.m() : (String) this.f14661a.x().get(maxAdFormat);
    }

    public void initialize(b3 b3Var) {
        this.f14661a = b3Var;
        this.f14662b = b3Var.o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        k7.a(Mf.f34998f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        k7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        k7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        k7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        k7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        k7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        k7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f14663c.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f14664d.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f14665e.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f14666f.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f14667g.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f14669i.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        k7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map map = this.f14684x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((w) this.f14684x.get(format)).a();
        }
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalArgumentException {
        super.onCreate(bundle);
        if (this.f14661a == null) {
            o.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f14661a.g() + " Test Ads");
        this.f14670j = this.f14662b.t0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f14678r = (Button) findViewById(R.id.show_mrec_button);
        this.f14679s = (Button) findViewById(R.id.show_native_button);
        if (this.f14661a.J() && this.f14661a.r().contains(MaxAdFormat.MREC)) {
            this.f14681u.setVisibility(8);
            this.f14678r.setBackgroundColor(-1);
            this.f14679s.setBackgroundColor(-3355444);
            final int i10 = 0;
            this.f14678r.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f14688c;

                {
                    this.f14688c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f14688c.a(view);
                            break;
                        case 1:
                            this.f14688c.b(view);
                            break;
                        case 2:
                            this.f14688c.c(view);
                            break;
                        default:
                            this.f14688c.d(view);
                            break;
                    }
                }
            });
            final int i11 = 1;
            this.f14679s.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f14688c;

                {
                    this.f14688c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f14688c.a(view);
                            break;
                        case 1:
                            this.f14688c.b(view);
                            break;
                        case 2:
                            this.f14688c.c(view);
                            break;
                        default:
                            this.f14688c.d(view);
                            break;
                    }
                }
            });
        } else {
            this.f14678r.setVisibility(8);
            this.f14679s.setVisibility(8);
        }
        this.f14682v = (Switch) findViewById(R.id.native_banner_switch);
        this.f14683w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f14661a.K()) {
            final int i12 = 2;
            this.f14682v.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f14688c;

                {
                    this.f14688c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            this.f14688c.a(view);
                            break;
                        case 1:
                            this.f14688c.b(view);
                            break;
                        case 2:
                            this.f14688c.c(view);
                            break;
                        default:
                            this.f14688c.d(view);
                            break;
                    }
                }
            });
            final int i13 = 3;
            this.f14683w.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f14688c;

                {
                    this.f14688c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            this.f14688c.a(view);
                            break;
                        case 1:
                            this.f14688c.b(view);
                            break;
                        case 2:
                            this.f14688c.c(view);
                            break;
                        default:
                            this.f14688c.d(view);
                            break;
                    }
                }
            });
        } else {
            this.f14682v.setVisibility(8);
            this.f14683w.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f14661a.e()) && this.f14661a.d() != null && this.f14661a.d().size() > 0) {
            AdRegistration.getInstance(this.f14661a.e(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap map = new HashMap(this.f14661a.d().size());
            for (MaxAdFormat maxAdFormat : this.f14661a.d().keySet()) {
                map.put(maxAdFormat, new w((x) this.f14661a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
            }
            this.f14684x = map;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th2) {
            o.c("AppLovinSdk", "Failed to set portrait orientation", th2);
        }
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f14662b.t0().a(this.f14670j);
        MaxAdView maxAdView = this.f14663c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f14664d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f14665e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f14667g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f14669i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f14668h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f14669i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        k7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f14664d.removeAllViews();
        this.f14673m.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f14681u.setVisibility(0);
        this.f14680t.setVisibility(8);
        this.f14679s.setBackgroundColor(-1);
        this.f14678r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f14663c.removeAllViews();
        this.f14672l.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f14680t.setVisibility(0);
        this.f14681u.setVisibility(8);
        this.f14678r.setBackgroundColor(-1);
        this.f14679s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f14681u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f14661a.J()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.f14669i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f14669i.setNativeAdListener(new C0035a(maxNativeAdView));
            this.f14669i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f14677q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f14677q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f14681u.setVisibility(8);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f14664d.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f14665e.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f14666f.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f14667g.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f14669i.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            }
        } else {
            this.f14663c.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.f14680t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f14661a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f14662b.z0(), this);
            this.f14664d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f14664d.setExtraParameter("disable_precache", "true");
            this.f14664d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f14664d.stopAutoRefresh();
            this.f14664d.setListener(this);
            this.f14680t.addView(this.f14664d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f14673m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f14673m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f14680t.setVisibility(8);
    }

    private void b() {
        List listR = this.f14661a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f14662b.z0(), this);
            this.f14665e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f14665e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f14674n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f14674n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f14661a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f14662b.z0(), this);
            this.f14663c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f14663c.setExtraParameter("disable_auto_retries", "true");
            this.f14663c.setExtraParameter("disable_precache", "true");
            this.f14663c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f14663c.stopAutoRefresh();
            this.f14663c.setListener(this);
            frameLayout.addView(this.f14663c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f14672l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f14672l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f14661a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f14665e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f14666f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f14667g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f14661a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = false;
        boolean z11 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f14682v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f14683w.isChecked()) {
            z10 = true;
        }
        if (!z11 && !z10) {
            this.f14662b.t0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f14662b.t0().a(this.f14661a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f14663c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f14664d.loadAd();
            this.f14678r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f14665e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f14666f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f14667g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f14669i.loadAd();
            this.f14679s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f14673m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f14674n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f14675o;
            }
            if (str.equals(this.f14671k)) {
                return this.f14676p;
            }
            if (str.equals("test_mode_native")) {
                return this.f14677q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
        }
        return this.f14672l;
    }
}
