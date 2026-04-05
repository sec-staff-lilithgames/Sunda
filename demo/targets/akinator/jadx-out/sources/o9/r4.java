package o9;

import com.digidust.elokence.akinator.activities.PostHomeSliderActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.ActivityPostHomeSliderBinding;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r4 implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PostHomeSliderActivity f78481a;

    public r4(PostHomeSliderActivity postHomeSliderActivity) {
        this.f78481a = postHomeSliderActivity;
    }

    @Override // da.g
    public void onCloseConfirme() {
        PostHomeSliderActivity postHomeSliderActivity = this.f78481a;
        ca.m.sharedInstance().setChildProtectEnabled(false);
        try {
            ActivityPostHomeSliderBinding activityPostHomeSliderBinding = postHomeSliderActivity.C;
            if (activityPostHomeSliderBinding == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                activityPostHomeSliderBinding = null;
            }
            activityPostHomeSliderBinding.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_off);
        } catch (Exception unused) {
        }
        postHomeSliderActivity.t();
    }

    @Override // da.g
    public void onClosedRefuse() {
        PostHomeSliderActivity postHomeSliderActivity = this.f78481a;
        ca.m.sharedInstance().setChildProtectEnabled(true);
        try {
            ActivityPostHomeSliderBinding activityPostHomeSliderBinding = postHomeSliderActivity.C;
            if (activityPostHomeSliderBinding == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                activityPostHomeSliderBinding = null;
            }
            activityPostHomeSliderBinding.imageFiltreEnfant.setImageResource(R.drawable.contenu_sensible_on);
        } catch (Exception unused) {
        }
        postHomeSliderActivity.t();
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
    }
}
