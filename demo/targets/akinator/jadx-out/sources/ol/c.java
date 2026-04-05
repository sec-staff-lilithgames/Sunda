package ol;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class c extends a {

    /* renamed from: g, reason: collision with root package name */
    public final RelativeLayout f79526g;

    /* renamed from: h, reason: collision with root package name */
    public final int f79527h;

    /* renamed from: i, reason: collision with root package name */
    public final int f79528i;

    /* renamed from: j, reason: collision with root package name */
    public final AdView f79529j;

    public c(Context context, RelativeLayout relativeLayout, nl.a aVar, kl.d dVar, int i10, int i11, com.unity3d.scar.adapter.common.d dVar2, com.unity3d.scar.adapter.common.g gVar) {
        super(context, dVar, aVar, dVar2);
        this.f79526g = relativeLayout;
        this.f79527h = i10;
        this.f79528i = i11;
        this.f79529j = new AdView(this.f79520b);
        this.f79523e = new e(gVar, this);
    }

    @Override // ol.a
    public final void a(AdRequest adRequest) {
        AdView adView;
        RelativeLayout relativeLayout = this.f79526g;
        if (relativeLayout == null || (adView = this.f79529j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        adView.setAdSize(new AdSize(this.f79527h, this.f79528i));
        adView.setAdUnitId(this.f79521c.getAdUnitId());
        adView.setAdListener(((e) this.f79523e).getAdListener());
        adView.loadAd(adRequest);
    }

    public void removeAdView() {
        AdView adView;
        RelativeLayout relativeLayout = this.f79526g;
        if (relativeLayout == null || (adView = this.f79529j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }
}
