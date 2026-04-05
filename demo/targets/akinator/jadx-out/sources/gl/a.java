package gl;

import com.ironsource.Cb;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f57704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Cb f57705c;

    public /* synthetic */ a(Cb cb2, int i10) {
        this.f57704b = i10;
        this.f57705c = cb2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57704b) {
            case 0:
                BannerAdLoader.a(this.f57705c);
                break;
            case 1:
                InterstitialAdLoader.a(this.f57705c);
                break;
            default:
                RewardedAdLoader.a(this.f57705c);
                break;
        }
    }
}
