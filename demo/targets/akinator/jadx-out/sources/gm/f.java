package gm;

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
public final class f extends a0 {

    /* renamed from: k, reason: collision with root package name */
    public final AdSize f57713k;

    /* renamed from: l, reason: collision with root package name */
    public AdManagerAdView f57714l;

    public f(j0 j0Var, l0 l0Var, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, w wVar, AdSize adSize) {
        super(j0Var, l0Var, adsFormat, adUnit, wVar);
        this.f57713k = adSize;
    }

    @Override // em.u
    public final void b() {
        AdManagerAdView adManagerAdView = this.f57714l;
        if (adManagerAdView != null) {
            adManagerAdView.setOnPaidEventListener(null);
            this.f57714l.destroy();
            this.f57714l = null;
        }
    }

    @Override // em.a0
    public final AdManagerAdView d() {
        return this.f57714l;
    }

    @Override // em.u
    public void loadAd(Context context, g0 g0Var) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f57714l = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f57714l.setAdUnitId(getAdUnitId());
        this.f57714l.setAdListener(new d(this, g0Var));
        this.f57714l.setOnPaidEventListener(new e(this));
        this.f57714l.setAdSize(this.f57713k);
        this.f57714l.loadAd(o.a(getAdUnit()));
    }
}
