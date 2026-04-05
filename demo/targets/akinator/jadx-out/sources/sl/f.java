package sl;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class f extends a implements kl.b {
    public f(Context context, rl.a aVar, kl.d dVar, com.unity3d.scar.adapter.common.d dVar2, com.unity3d.scar.adapter.common.h hVar) {
        super(context, dVar, aVar, dVar2);
        this.f85906e = new i(hVar, this);
    }

    @Override // sl.a
    public final void a(AdRequest adRequest) {
        InterstitialAd.load(this.f85903b, this.f85904c.getAdUnitId(), adRequest, ((i) this.f85906e).getAdLoadListener());
    }

    @Override // kl.b
    public void show(Activity activity) {
        Object obj = this.f85902a;
        if (obj != null) {
            ((InterstitialAd) obj).show(activity);
        } else {
            this.f85907f.handleError(com.unity3d.scar.adapter.common.b.AdNotLoadedError(this.f85904c));
        }
    }
}
