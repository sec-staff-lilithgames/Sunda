package dl;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LevelPlayNativeAd f52370c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdInfo f52371e;

    public /* synthetic */ a(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo, int i10) {
        this.f52369b = i10;
        this.f52370c = levelPlayNativeAd;
        this.f52371e = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52369b) {
            case 0:
                LevelPlayNativeAd.a(this.f52370c, this.f52371e);
                break;
            default:
                LevelPlayNativeAd.b(this.f52370c, this.f52371e);
                break;
        }
    }
}
