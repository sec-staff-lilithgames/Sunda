package o9;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.digidust.elokence.akinator.activities.CompteActivity;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.activities.MenuActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.ActivityHomeBinding;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78478c;

    public /* synthetic */ r1(HomeActivity homeActivity, int i10) {
        this.f78477b = i10;
        this.f78478c = homeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f78477b;
        HomeActivity homeActivity = this.f78478c;
        switch (i10) {
            case 0:
                int i11 = HomeActivity.U;
                homeActivity.startSlideUpAnimation();
                ActivityHomeBinding activityHomeBinding = homeActivity.D;
                ActivityHomeBinding activityHomeBinding2 = null;
                if (activityHomeBinding == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
                    activityHomeBinding = null;
                }
                activityHomeBinding.overlayThemeSelection.setVisibility(8);
                ActivityHomeBinding activityHomeBinding3 = homeActivity.D;
                if (activityHomeBinding3 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
                    activityHomeBinding3 = null;
                }
                activityHomeBinding3.buttonProfile.setClickable(true);
                ActivityHomeBinding activityHomeBinding4 = homeActivity.D;
                if (activityHomeBinding4 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
                    activityHomeBinding4 = null;
                }
                activityHomeBinding4.playButton.setClickable(true);
                ActivityHomeBinding activityHomeBinding5 = homeActivity.D;
                if (activityHomeBinding5 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
                    activityHomeBinding5 = null;
                }
                activityHomeBinding5.buttonOpenMenu.setClickable(true);
                ActivityHomeBinding activityHomeBinding6 = homeActivity.D;
                if (activityHomeBinding6 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
                    activityHomeBinding6 = null;
                }
                activityHomeBinding6.themeImageChoosen.setClickable(true);
                ActivityHomeBinding activityHomeBinding7 = homeActivity.D;
                if (activityHomeBinding7 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    activityHomeBinding2 = activityHomeBinding7;
                }
                activityHomeBinding2.themeSelectionLayout.setClickable(true);
                break;
            case 1:
                int i12 = HomeActivity.U;
                ca.m.sharedInstance().setHomeBannerOpened(true ^ ca.m.sharedInstance().isHomeBannerOpened());
                homeActivity.runOnUiThread(new ji.t(homeActivity, 26));
                break;
            case 2:
                int i13 = HomeActivity.U;
                try {
                    homeActivity.disableAdOneTime();
                    String homeBannerUrl = ca.o.sharedInstance().getHomeBannerUrl();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(homeBannerUrl, "getHomeBannerUrl(...)");
                    homeActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(homeBannerUrl)));
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 3:
                int i14 = HomeActivity.U;
                homeActivity.startActivity(new Intent(homeActivity, (Class<?>) MenuActivity.class));
                break;
            default:
                int i15 = HomeActivity.U;
                if (!ca.m.sharedInstance().isUserConnected()) {
                    homeActivity.startActivity(new Intent(homeActivity, (Class<?>) ConnectActivity.class), ActivityOptions.makeCustomAnimation(homeActivity, R.anim.slide_in_bottom, R.anim.slide_out_bottom).toBundle());
                    homeActivity.finish();
                    break;
                } else {
                    homeActivity.startActivity(new Intent(homeActivity, (Class<?>) CompteActivity.class));
                    homeActivity.finish();
                    break;
                }
        }
    }
}
