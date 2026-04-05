package com.applovin.impl;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.aps.ads.ApsConstants;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.m;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.w;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class l extends k3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, w.a {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f14265a;

    /* renamed from: b, reason: collision with root package name */
    private n f14266b;

    /* renamed from: c, reason: collision with root package name */
    private f8 f14267c;

    /* renamed from: d, reason: collision with root package name */
    private m f14268d;

    /* renamed from: e, reason: collision with root package name */
    private MaxAdView f14269e;

    /* renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f14270f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f14271g;

    /* renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f14272h;

    /* renamed from: i, reason: collision with root package name */
    private MaxNativeAdView f14273i;

    /* renamed from: j, reason: collision with root package name */
    private MaxNativeAdLoader f14274j;

    /* renamed from: k, reason: collision with root package name */
    private MaxAd f14275k;

    /* renamed from: l, reason: collision with root package name */
    private r f14276l;

    /* renamed from: m, reason: collision with root package name */
    private List f14277m;

    /* renamed from: n, reason: collision with root package name */
    private ListView f14278n;

    /* renamed from: o, reason: collision with root package name */
    private View f14279o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f14280p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f14281q;

    /* renamed from: r, reason: collision with root package name */
    private w f14282r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends MaxNativeAdListener {
        public a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (l.this.f14275k != null) {
                l.this.f14274j.destroy(l.this.f14275k);
            }
            l.this.f14275k = maxAd;
            l.this.f14274j.render(l.this.f14273i, maxAd);
            l.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.k3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f14265a;
    }

    public void initialize(n nVar, o oVar, f8 f8Var, com.applovin.impl.sdk.k kVar) {
        List listA;
        this.f14265a = kVar;
        this.f14266b = nVar;
        this.f14267c = f8Var;
        this.f14277m = kVar.t0().b();
        m mVar = new m(nVar, oVar, f8Var, this);
        this.f14268d = mVar;
        mVar.a(new o9(this, kVar, nVar, oVar));
        b();
        if (nVar.f().f()) {
            if ((f8Var != null && !f8Var.b().d().D()) || (listA = kVar.U().a(nVar.c())) == null || listA.isEmpty()) {
                return;
            }
            this.f14282r = new w(listA, nVar.a(), getApplicationContext(), this);
        }
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
        this.f14280p.setControlState(AdControlButton.b.LOAD);
        this.f14281q.setText("");
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
        this.f14280p.setControlState(AdControlButton.b.LOAD);
        this.f14281q.setText("");
        if (204 == maxError.getCode()) {
            k7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        k7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f14281q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f14280p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f14269e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f14266b.a()) {
            a(this.f14273i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f14269e.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f14270f.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f14271g.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f14272h.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f14274j.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        k7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f14265a.t0().c()) {
            k7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f14268d.j() != this.f14266b.f()) {
            k7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.f14266b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            w wVar = this.f14282r;
            if (wVar != null) {
                wVar.a();
                return;
            } else {
                a(maxAdFormatA);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatA.isAdViewAd() && maxAdFormatA != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(maxAdFormatA);
        }
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f14268d.k());
        this.f14278n = (ListView) findViewById(R.id.listView);
        this.f14279o = findViewById(R.id.ad_presenter_view);
        this.f14280p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f14281q = (TextView) findViewById(R.id.status_textview);
        this.f14278n.setAdapter((ListAdapter) this.f14268d);
        this.f14281q.setText(a());
        this.f14281q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f14280p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f14279o.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.k3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f14267c != null) {
            this.f14265a.t0().a(this.f14277m);
        }
        MaxAdView maxAdView = this.f14269e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f14270f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f14271g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f14272h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f14274j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f14275k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f14274j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        k7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, n nVar, o oVar, i2 i2Var, o2 o2Var) {
        if (o2Var instanceof m.b) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new o9(o2Var, nVar, oVar, kVar));
        }
    }

    private void b() {
        String strC = this.f14266b.c();
        if (this.f14266b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.f14266b.a());
            this.f14269e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f14269e.setExtraParameter("disable_auto_retries", "true");
            this.f14269e.setExtraParameter("disable_precache", "true");
            this.f14269e.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f14269e.stopAutoRefresh();
            this.f14269e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f14266b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC);
            this.f14270f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f14270f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f14266b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC);
            this.f14271g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f14271g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f14266b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC);
            this.f14272h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f14272h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f14266b.a()) {
            this.f14273i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), com.applovin.impl.sdk.k.o());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC);
            this.f14274j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f14274j.setNativeAdListener(new a());
            this.f14274j.setRevenueListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(o2 o2Var, n nVar, o oVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, oVar, ((m.b) o2Var).v(), kVar);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f14269e.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f14270f.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f14271g.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f14272h.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f14274j.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder("Loading live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        f8 f8Var = this.f14267c;
        sb2.append(f8Var != null ? f8Var.b().a() : this.f14268d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (this.f14267c != null) {
            this.f14265a.t0().a(this.f14267c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f14269e.setPlacement("[Mediation Debugger Live Ad]");
            this.f14269e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f14266b.a()) {
            this.f14270f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f14266b.a()) {
            this.f14271g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f14266b.a()) {
            this.f14272h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f14266b.a()) {
            this.f14274j.setPlacement("[Mediation Debugger Live Ad]");
            this.f14274j.loadAd();
        } else {
            k7.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f14276l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.f14276l = rVar;
        rVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.p9
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f15053b.a(dialogInterface);
            }
        });
        this.f14276l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f14276l = null;
    }

    private String a() {
        if (this.f14265a.t0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.f14268d.j() != this.f14266b.f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder("Showing live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        f8 f8Var = this.f14267c;
        sb2.append(f8Var != null ? f8Var.b().a() : this.f14268d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f14269e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f14266b.a()) {
            this.f14270f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f14266b.a()) {
            this.f14271g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f14266b.a()) {
            this.f14272h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f14266b.a()) {
            a(this.f14273i, MaxAdFormat.MREC.getSize());
        }
    }
}
