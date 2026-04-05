package sl;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class c extends a {

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f85909g;

    /* renamed from: h, reason: collision with root package name */
    public final int f85910h;

    /* renamed from: i, reason: collision with root package name */
    public final int f85911i;

    /* renamed from: j, reason: collision with root package name */
    public final AdView f85912j;

    public c(Context context, RelativeLayout relativeLayout, rl.a aVar, kl.d dVar, int i10, int i11, com.unity3d.scar.adapter.common.d dVar2, com.unity3d.scar.adapter.common.g gVar) {
        super(context, dVar, aVar, dVar2);
        this.f85909g = relativeLayout;
        this.f85910h = i10;
        this.f85911i = i11;
        this.f85912j = new AdView(this.f85903b);
        this.f85906e = new e(gVar, this);
    }

    @Override // sl.a
    public final void a(AdRequest adRequest) {
        AdView adView;
        RelativeLayout relativeLayout = this.f85909g;
        if (relativeLayout == null || (adView = this.f85912j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        adView.setAdSize(new AdSize(this.f85910h, this.f85911i));
        adView.setAdUnitId(this.f85904c.getAdUnitId());
        adView.setAdListener(((e) this.f85906e).getAdListener());
        adView.loadAd(adRequest);
    }

    public void removeAdView() {
        AdView adView;
        RelativeLayout relativeLayout = this.f85909g;
        if (relativeLayout == null || (adView = this.f85912j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }
}
