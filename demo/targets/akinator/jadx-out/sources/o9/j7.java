package o9;

import com.digidust.elokence.akinator.activities.SelectLanguageActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j7 implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectLanguageActivity f78267a;

    public j7(SelectLanguageActivity selectLanguageActivity) {
        this.f78267a = selectLanguageActivity;
    }

    @Override // da.g
    public void onCloseConfirme() {
        SelectLanguageActivity selectLanguageActivity = this.f78267a;
        if (selectLanguageActivity.G != 0 || ca.m.sharedInstance().isPrio()) {
            return;
        }
        selectLanguageActivity.disableAdOneTime();
        z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappUltime(), selectLanguageActivity);
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }

    @Override // da.g
    public void onClosedRefuse() {
    }
}
