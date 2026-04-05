package o9;

import com.digidust.elokence.akinator.activities.HomeActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k2 implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78287a;

    public k2(HomeActivity homeActivity) {
        this.f78287a = homeActivity;
    }

    @Override // da.g
    public void onCloseConfirme() {
        HomeActivity.access$exitApp(this.f78287a);
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }

    @Override // da.g
    public void onClosedRefuse() {
    }
}
