package o9;

import android.view.animation.Animation;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o0 implements Animation.AnimationListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefiDuJourActivity f78409b;

    public o0(DefiDuJourActivity defiDuJourActivity) {
        this.f78409b = defiDuJourActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        DefiDuJourActivity defiDuJourActivity = this.f78409b;
        defiDuJourActivity.H.setVisibility(8);
        defiDuJourActivity.H.setClickable(false);
        jb.h.sharedInstance().createOrUpdateMetricCompteur("gz_gain_playing", 1000);
        if (ca.m.sharedInstance().isUserConnected()) {
            DefiDuJourActivity.v(1000);
        } else {
            ca.r.sharedInstance().depositGenizWithoutNotif(1000);
        }
        ca.o.sharedInstance().setCharacterScreenshotDefi(AkActivity.k(defiDuJourActivity.findViewById(R.id.mainLayout)));
        defiDuJourActivity.C.setEnabled(true);
        AkApplication.f21721h.execute(new al.b(9));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
