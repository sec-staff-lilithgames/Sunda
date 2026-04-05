package o9;

import android.view.animation.Animation;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n0 implements Animation.AnimationListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefiDuJourActivity f78377b;

    public n0(DefiDuJourActivity defiDuJourActivity) {
        this.f78377b = defiDuJourActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        DefiDuJourActivity defiDuJourActivity = this.f78377b;
        defiDuJourActivity.H.setOnClickListener(defiDuJourActivity);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
