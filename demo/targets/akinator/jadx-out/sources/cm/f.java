package cm;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import io.bidmachine.AdsFormat;
import zl.e0;
import zl.l;
import zl.s;
import zl.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends w {

    /* renamed from: h, reason: collision with root package name */
    public final AdSize f12380h;

    /* renamed from: i, reason: collision with root package name */
    public AdManagerAdView f12381i;

    public f(l lVar, AdsFormat adsFormat, s sVar, AdSize adSize) {
        super(lVar, adsFormat, sVar);
        this.f12380h = adSize;
    }

    @Override // zl.t
    public final void b() {
        AdManagerAdView adManagerAdView = this.f12381i;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.f12381i = null;
        }
    }

    @Override // zl.w
    public final AdManagerAdView c() {
        return this.f12381i;
    }

    @Override // zl.t
    public void loadAd(Context context, e0 e0Var) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f12381i = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f12381i.setAdUnitId(getAdUnitId());
        this.f12381i.setAdListener(new e(this, e0Var));
        this.f12381i.setAdSize(this.f12380h);
        this.f12381i.loadAd(c.a(getGamLoader(), getGamUnitData()));
    }
}
