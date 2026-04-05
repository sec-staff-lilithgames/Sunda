package u9;

import android.widget.FrameLayout;
import ca.m;
import ca.o;
import ca.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import kotlin.jvm.internal.e0;
import o9.j0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k implements z9.a {

    /* renamed from: b, reason: collision with root package name */
    public QuestionActivity f88170b;

    /* renamed from: c, reason: collision with root package name */
    public String f88171c;

    /* renamed from: e, reason: collision with root package name */
    public MaxAdView f88172e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f88173f;

    public k(QuestionActivity activity) {
        e0.checkNotNullParameter(activity, "activity");
        this.f88170b = activity;
        this.f88173f = new j0(this, 12);
    }

    public final QuestionActivity getActivity() {
        return this.f88170b;
    }

    @Override // z9.a
    public void itemPurchased(String itemName) {
        e0.checkNotNullParameter(itemName, "itemName");
        if (e0.areEqual(itemName, z9.e.getInstance().getSkuInappNoads()) || e0.areEqual(itemName, z9.e.getInstance().getSkuInappUltime())) {
            this.f88170b.runOnUiThread(new j(this, 1));
        }
    }

    @Override // z9.a
    public void onAllPurchasesRestored() throws NumberFormatException {
        this.f88170b.onAllPurchasesRestored();
    }

    @Override // z9.a
    public void onInitialization(boolean z10) {
        AkApplication.f21721h.execute(new al.b(11));
    }

    public final void processOnCreate() {
        if (ca.k.getInstance().getIdSdkPubInitialised() == 1) {
            this.f88172e = new MaxAdView("e2a4d2cd473f2a2e", this.f88170b);
        }
        this.f88170b.updateTextViewsSize();
        this.f88170b.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.imageCroixFermetureBanner.setOnClickListener(this.f88173f);
        String campaign = jb.c.f69226m.sharedInstance().getCampaign("AdsStatus");
        this.f88171c = campaign;
        if (campaign == null) {
            this.f88171c = "full ads";
        }
        y.getInstance(this.f88170b).initializeIfNecessary();
        if (!m.sharedInstance().isFreemium() || o.sharedInstance().isUnlocked()) {
            Timber.Forest.tag("ODEEO").d("Pas de pub Odeeo car freemium désactivé ou jeu débloqué", new Object[0]);
            return;
        }
        if (m.sharedInstance().getNbPartieAvantPremierLancementPubAudio() != -1) {
            if (this.f88170b.lastGameBeforeXMinutesAgo() && this.f88170b.shouldDisplayAudioPubAllXGame() && o.sharedInstance().getNbGamesInOneSessionWithoutClosingApp() > m.sharedInstance().getNbPartieAvantPremierLancementPubAudio() && !m.sharedInstance().isTTSEnabled()) {
                y.getInstance(this.f88170b).createAdUnit();
                Timber.Forest.tag("ODEEO").d("Lancement pub Odeeo", new Object[0]);
                return;
            }
            if (!this.f88170b.lastGameBeforeXMinutesAgo()) {
                Timber.Forest.tag("ODEEO").d("lastGameBeforeXMinutesAgo : false", new Object[0]);
            }
            if (!this.f88170b.shouldDisplayAudioPubAllXGame()) {
                Timber.Forest.tag("ODEEO").d("shouldDisplayAudioPubAllXGame : false", new Object[0]);
            }
            if (o.sharedInstance().getNbGamesInOneSessionWithoutClosingApp() <= m.sharedInstance().getNbPartieAvantPremierLancementPubAudio()) {
                Timber.Forest.tag("ODEEO").d(w0.i.a(o.sharedInstance().getNbGamesInOneSessionWithoutClosingApp(), m.sharedInstance().getNbPartieAvantPremierLancementPubAudio(), "getNbGamesInOneSessionWithoutClosingApp : ", " <= "), new Object[0]);
            }
            if (m.sharedInstance().isTTSEnabled()) {
                Timber.Forest.tag("ODEEO").d("isTTSEnabled : true", new Object[0]);
            }
        }
    }

    public final void processOnDestroy() {
        y.getInstance(this.f88170b).destroy();
    }

    public final void processOnPause() {
        String str;
        MaxAdView maxAdView;
        z9.e.getInstance().removeListener(this);
        if (o.sharedInstance().isUnlocked() || !o.sharedInstance().areAdsEnabled() || (str = this.f88171c) == null || e0.areEqual(str, "no ads")) {
            return;
        }
        y.getInstance(this.f88170b).pause();
        if (ca.k.getInstance().getIdSdkPubInitialised() == 1 && (maxAdView = this.f88172e) != null) {
            e0.checkNotNull(maxAdView);
            maxAdView.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            MaxAdView maxAdView2 = this.f88172e;
            e0.checkNotNull(maxAdView2);
            maxAdView2.stopAutoRefresh();
            try {
                this.f88170b.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.layoutBannerAd.removeAllViews();
                this.f88170b.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.imageCroixFermetureBanner.setVisibility(8);
            } catch (Exception unused) {
            }
        }
    }

    public final void processOnResume() {
        String str;
        String str2;
        String str3;
        z9.e.getInstance().addListener(this);
        if (!o.sharedInstance().areAdsEnabled() || o.sharedInstance().isUnlocked() || ((str3 = this.f88171c) != null && e0.areEqual(str3, "no ads"))) {
            this.f88170b.runOnUiThread(new j(this, 1));
        }
        AkApplication.f21721h.execute(new j(this, 0));
        if (!o.sharedInstance().isUnlocked() && o.sharedInstance().areAdsEnabled() && (str2 = this.f88171c) != null && !e0.areEqual(str2, "no ads")) {
            if (ca.k.getInstance().getIdSdkPubInitialised() == 1) {
                if (this.f88172e == null) {
                    this.f88172e = new MaxAdView("e2a4d2cd473f2a2e", this.f88170b);
                }
                int iDpToPx = AppLovinSdkUtils.dpToPx(this.f88170b, MaxAdFormat.BANNER.getAdaptiveSize(this.f88170b).getHeight());
                MaxAdView maxAdView = this.f88172e;
                e0.checkNotNull(maxAdView);
                maxAdView.setExtraParameter("adaptive_banner", "true");
                MaxAdView maxAdView2 = this.f88172e;
                e0.checkNotNull(maxAdView2);
                maxAdView2.setLayoutParams(new FrameLayout.LayoutParams(-1, iDpToPx));
                MaxAdView maxAdView3 = this.f88172e;
                e0.checkNotNull(maxAdView3);
                maxAdView3.setBackgroundColor(0);
                new FrameLayout.LayoutParams(-2, -2).gravity = 81;
                this.f88170b.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.layoutBannerAd.removeAllViews();
                try {
                    this.f88170b.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.layoutBannerAd.addView(this.f88172e);
                    this.f88170b.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.layoutBannerAd.setVisibility(0);
                    MaxAdView maxAdView4 = this.f88172e;
                    e0.checkNotNull(maxAdView4);
                    maxAdView4.loadAd();
                    MaxAdView maxAdView5 = this.f88172e;
                    e0.checkNotNull(maxAdView5);
                    maxAdView5.startAutoRefresh();
                } catch (Exception unused) {
                }
            }
            this.f88170b.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.imageCroixFermetureBanner.setVisibility(0);
        }
        if (o.sharedInstance().isUnlocked() || !o.sharedInstance().areAdsEnabled() || (str = this.f88171c) == null || e0.areEqual(str, "no ads")) {
            return;
        }
        y.getInstance(this.f88170b).resume();
    }

    public final void setActivity(QuestionActivity questionActivity) {
        e0.checkNotNullParameter(questionActivity, "<set-?>");
        this.f88170b = questionActivity;
    }

    @Override // z9.a
    public void skuDetailsUpdated() {
    }
}
