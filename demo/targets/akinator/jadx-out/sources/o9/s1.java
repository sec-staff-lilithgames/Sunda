package o9;

import com.digidust.elokence.akinator.activities.HomeActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements z9.b, z9.d, ca.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78513b;

    public /* synthetic */ s1(HomeActivity homeActivity) {
        this.f78513b = homeActivity;
    }

    @Override // z9.b
    public void onInappDetailsUpdate(boolean z10) {
        int i10 = HomeActivity.U;
        HomeActivity homeActivity = this.f78513b;
        if (z10) {
            z9.e.getInstance().requestAllPurchases(new s1(homeActivity));
        } else {
            homeActivity.runOnUiThread(new a(homeActivity, 4));
        }
    }

    @Override // z9.d
    public void onInappPurchasesRequested(boolean z10) {
        int i10 = HomeActivity.U;
        if (z10) {
            return;
        }
        HomeActivity homeActivity = this.f78513b;
        homeActivity.runOnUiThread(new a(homeActivity, 4));
    }

    @Override // ca.s
    public void onLoadingProgress(int i10, int i11) {
        HomeActivity homeActivity = this.f78513b;
        homeActivity.runOnUiThread(new t2(i10, i11, homeActivity));
    }
}
