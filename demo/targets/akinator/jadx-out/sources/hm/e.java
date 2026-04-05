package hm;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import em.a0;
import em.g0;
import em.j0;
import em.l0;
import em.w;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends a0 {

    /* renamed from: k, reason: collision with root package name */
    public final AdSize f59006k;

    /* renamed from: l, reason: collision with root package name */
    public AdManagerAdView f59007l;

    public e(j0 j0Var, l0 l0Var, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, w wVar, AdSize adSize) {
        super(j0Var, l0Var, adsFormat, adUnit, wVar);
        this.f59006k = adSize;
    }

    @Override // em.u
    public final void b() {
        AdManagerAdView adManagerAdView = this.f59007l;
        if (adManagerAdView != null) {
            adManagerAdView.setOnPaidEventListener(null);
            this.f59007l.destroy();
            this.f59007l = null;
        }
    }

    @Override // em.a0
    public final AdManagerAdView d() {
        return this.f59007l;
    }

    @Override // em.u
    public void loadAd(Context context, g0 g0Var) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f59007l = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f59007l.setAdUnitId(getAdUnitId());
        this.f59007l.setAdListener(new c(this, g0Var));
        this.f59007l.setOnPaidEventListener(new d(this));
        this.f59007l.setAdSize(this.f59006k);
        this.f59007l.loadAd(n.a(getAdUnit()));
    }
}
