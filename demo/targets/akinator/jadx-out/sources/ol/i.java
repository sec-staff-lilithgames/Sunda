package ol;

import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class i extends b {

    /* renamed from: b, reason: collision with root package name */
    public final f f79536b;

    /* renamed from: c, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.h f79537c;

    /* renamed from: d, reason: collision with root package name */
    public final g f79538d = new g(this);

    /* renamed from: e, reason: collision with root package name */
    public final h f79539e = new h(this);

    public i(com.unity3d.scar.adapter.common.h hVar, f fVar) {
        this.f79537c = hVar;
        this.f79536b = fVar;
    }

    public InterstitialAdLoadCallback getAdLoadListener() {
        return this.f79538d;
    }
}
