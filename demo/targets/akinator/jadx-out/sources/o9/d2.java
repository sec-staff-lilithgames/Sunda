package o9;

import com.digidust.elokence.akinator.activities.HomeActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d2 implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78087a;

    public d2(HomeActivity homeActivity) {
        this.f78087a = homeActivity;
    }

    @Override // da.g
    public void onCloseConfirme() {
        int iCanPlay = ca.m.sharedInstance().canPlay();
        HomeActivity homeActivity = this.f78087a;
        if (iCanPlay == 0 && !ca.m.sharedInstance().isPrio()) {
            homeActivity.disableAdOneTime();
            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), homeActivity);
        } else if (ca.m.sharedInstance().canPlay() == -1) {
            homeActivity.j();
        }
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }

    @Override // da.g
    public void onClosedRefuse() {
    }
}
