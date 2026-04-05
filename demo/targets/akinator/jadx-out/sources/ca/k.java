package ca;

import android.app.Activity;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.digidust.elokence.akinator.factories.AkApplication;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static k f11949g;

    /* renamed from: a, reason: collision with root package name */
    public AkApplication f11950a;

    /* renamed from: b, reason: collision with root package name */
    public int f11951b;

    /* renamed from: c, reason: collision with root package name */
    public MaxInterstitialAd f11952c;

    /* renamed from: d, reason: collision with root package name */
    public MaxRewardedAd f11953d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f11954e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f11955f;

    public static k getInstance() {
        if (f11949g == null) {
            k kVar = new k();
            kVar.f11950a = null;
            kVar.f11951b = -1;
            kVar.f11954e = new ArrayList();
            kVar.f11955f = new ArrayList();
            f11949g = kVar;
        }
        return f11949g;
    }

    public void addInterstitialVideoListener(i iVar) {
        this.f11955f.add(iVar);
    }

    public void addRewardedVideoListener(j jVar) {
        this.f11954e.add(jVar);
    }

    public int getIdSdkPubInitialised() {
        return this.f11951b;
    }

    public void initApplovinAdPlacements() {
        this.f11951b = 1;
        MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("0fa265fcbb019551", this.f11950a);
        this.f11952c = maxInterstitialAd;
        maxInterstitialAd.setListener(new g(this));
        this.f11952c.loadAd();
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance("11c328f1a5660b4b", this.f11950a);
        this.f11953d = maxRewardedAd;
        maxRewardedAd.setListener(new h(this));
        this.f11953d.loadAd();
    }

    public boolean isInterstitialReady() {
        if (this.f11951b != 1) {
            return false;
        }
        return this.f11952c.isReady();
    }

    public boolean isRewardedReady() {
        if (this.f11951b != 1) {
            return false;
        }
        return this.f11953d.isReady();
    }

    public void removeInterstitialVideoListener(i iVar) {
        this.f11955f.remove(iVar);
    }

    public void removeRewardedVideoListener(j jVar) {
        this.f11954e.remove(jVar);
    }

    public boolean showInterstitial(Activity activity) {
        if (this.f11951b != 1 || !this.f11952c.isReady()) {
            return false;
        }
        this.f11952c.showAd(activity);
        return true;
    }

    public void showRewarded(Activity activity) {
        if (this.f11951b == 1 && this.f11953d.isReady()) {
            this.f11953d.showAd(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }
}
