package ol;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class f extends a implements kl.b {
    public f(Context context, nl.a aVar, kl.d dVar, com.unity3d.scar.adapter.common.d dVar2, com.unity3d.scar.adapter.common.h hVar) {
        super(context, dVar, aVar, dVar2);
        this.f79523e = new i(hVar, this);
    }

    @Override // ol.a
    public final void a(AdRequest adRequest) {
        InterstitialAd.load(this.f79520b, this.f79521c.getAdUnitId(), adRequest, ((i) this.f79523e).getAdLoadListener());
    }

    @Override // kl.b
    public void show(Activity activity) {
        Object obj = this.f79519a;
        if (obj != null) {
            ((InterstitialAd) obj).show(activity);
        } else {
            this.f79524f.handleError(com.unity3d.scar.adapter.common.b.AdNotLoadedError(this.f79521c));
        }
    }
}
