package ca;

import android.os.Handler;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g implements MaxAdListener {

    /* renamed from: b, reason: collision with root package name */
    public int f11945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f11946c;

    public g(k kVar) {
        this.f11946c = kVar;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f11946c.f11952c.loadAd();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        na.a.pauseMusic();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        k kVar = this.f11946c;
        kVar.f11952c.loadAd();
        Iterator it = kVar.f11955f.iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        na.a.startMusic(ma.c.f74126e);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f11945b = this.f11945b + 1;
        new Handler().postDelayed(new a2.s(this, 7), TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, Math.min(6, r5))));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f11945b = 0;
        Iterator it = this.f11946c.f11955f.iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
    }
}
