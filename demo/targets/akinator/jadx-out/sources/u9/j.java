package u9;

import ca.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88168b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f88169c;

    public /* synthetic */ j(k kVar, int i10) {
        this.f88168b = i10;
        this.f88169c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f88168b) {
            case 0:
                if (!z9.e.getInstance().isInit()) {
                    z9.e.getInstance().init(this.f88169c.f88170b, null);
                    break;
                } else {
                    z9.e.getInstance().requestAllPurchases(null);
                    break;
                }
            default:
                k kVar = this.f88169c;
                kVar.f88170b.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.layoutBannerAd.setVisibility(8);
                kVar.f88170b.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.imageCroixFermetureBanner.setVisibility(8);
                y.getInstance(kVar.f88170b).pause();
                y.getInstance(kVar.f88170b).destroy();
                break;
        }
    }
}
