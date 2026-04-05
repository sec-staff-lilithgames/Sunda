package u9;

import android.content.Intent;
import ca.m;
import ca.o;
import ca.u;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import java.util.Calendar;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final AkActivity f88151a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f88152b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88153c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f88154d = true;

    /* renamed from: e, reason: collision with root package name */
    public String f88155e = null;

    public a(AkActivity akActivity) {
        this.f88151a = akActivity;
    }

    public void disableAdOneTime() {
        this.f88152b = false;
    }

    public String getSfbxAppKey() {
        return "2b95312e-f190-4128-bf5c-7ca513606748";
    }

    public void onConsentInformedViaCMP(boolean z10, boolean z11) {
        Timber.tag("RGPD").d("Consent informed via CMP : " + z10 + " - " + z11, new Object[0]);
    }

    public void processOnCreate() {
        boolean z10 = false;
        this.f88152b = false;
        AkActivity akActivity = this.f88151a;
        if (akActivity instanceof SplashscreenActivity) {
            return;
        }
        if (!m.sharedInstance().isFreemium() || o.sharedInstance().isUnlocked() || !o.sharedInstance().areAdsEnabled()) {
            this.f88153c = false;
            this.f88154d = false;
            return;
        }
        String campaign = jb.c.sharedInstance().getCampaign("AdsStatus");
        this.f88155e = campaign;
        if (campaign == null) {
            this.f88155e = "full ads";
        }
        if (akActivity != null && (akActivity instanceof HomeActivity)) {
            Intent intent = akActivity.getIntent();
            if (intent == null) {
                this.f88153c = this.f88155e.equals("full ads");
            } else {
                this.f88153c = this.f88155e.equals("full ads") && intent.getBooleanExtra("ShowAdOnGameOver", true);
            }
        }
        if (akActivity == null || !(akActivity instanceof GameOverSliderActivity)) {
            return;
        }
        boolean zMustShowPubTemp = u.sharedInstance().mustShowPubTemp();
        Intent intent2 = akActivity.getIntent();
        if (intent2 == null) {
            if (!this.f88155e.equals("no ads") && zMustShowPubTemp) {
                z10 = true;
            }
            this.f88154d = z10;
            return;
        }
        if (!this.f88155e.equals("no ads") && zMustShowPubTemp && intent2.getBooleanExtra("ShowAdOnHome", false)) {
            z10 = true;
        }
        this.f88154d = z10;
    }

    public void processOnResume() {
        String str;
        AkActivity akActivity = this.f88151a;
        if (!(akActivity instanceof SplashscreenActivity) && m.sharedInstance().isFreemium() && !o.sharedInstance().isUnlocked() && o.sharedInstance().areAdsEnabled()) {
            if ((akActivity instanceof HomeActivity) && this.f88153c) {
                Timber.tag("Advertising").d("Show interstitial home !", new Object[0]);
                m.sharedInstance().setCanSendAnalytics(false);
                if (!ca.k.getInstance().showInterstitial(akActivity)) {
                    Timber.tag("Advertising").d("No ad for interstitial now (asked for home)", new Object[0]);
                }
                o.sharedInstance().setCanShowAd(false);
                this.f88153c = false;
                return;
            }
            if ((akActivity instanceof GameOverSliderActivity) && this.f88154d) {
                Timber.tag("Advertising").d("Show interstitial gameover !", new Object[0]);
                m.sharedInstance().setCanSendAnalytics(false);
                if (!ca.k.getInstance().showInterstitial(akActivity)) {
                    Timber.tag("Advertising").d("No ad for interstitial now (asked for gameover)", new Object[0]);
                }
                o.sharedInstance().setCanShowAd(false);
                this.f88154d = false;
                return;
            }
            if (!this.f88152b || !o.sharedInstance().canShowAd() || (str = this.f88155e) == null || !str.equals("full ads")) {
                this.f88152b = true;
                o.sharedInstance().setCanShowAd(true);
                return;
            }
            if (!o.sharedInstance().getClickedBanner() && Calendar.getInstance().getTimeInMillis() - u.sharedInstance().getTimeOfLastScreenOnPause() > TTAdConstant.AD_MAX_EVENT_TIME) {
                Timber.tag("Advertising").d("Show interstitial ad !", new Object[0]);
                m.sharedInstance().setCanSendAnalytics(false);
                if (ca.k.getInstance().showInterstitial(akActivity)) {
                    this.f88152b = false;
                } else {
                    Timber.tag("Advertising").d("No ad for interstitial now", new Object[0]);
                }
            }
            o.sharedInstance().setClickedBanner(false);
        }
    }

    public void processOnPause() {
    }
}
