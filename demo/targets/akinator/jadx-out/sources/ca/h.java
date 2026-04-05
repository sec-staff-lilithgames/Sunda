package ca;

import android.os.Handler;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h implements MaxRewardedAdListener {

    /* renamed from: b, reason: collision with root package name */
    public int f11947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f11948c;

    public h(k kVar) {
        this.f11948c = kVar;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f11948c.f11953d.loadAd();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        na.a.pauseMusic();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        this.f11948c.f11953d.loadAd();
        na.a.startMusic(ma.c.f74126e);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f11947b = this.f11947b + 1;
        new Handler().postDelayed(new a2.s(this, 8), TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, Math.min(6, r5))));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f11947b = 0;
        Iterator it = this.f11948c.f11954e.iterator();
        while (it.hasNext()) {
            ((j) it.next()).onReady();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        Iterator it = this.f11948c.f11954e.iterator();
        while (it.hasNext()) {
            ((j) it.next()).onRewardEarned();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
    }
}
