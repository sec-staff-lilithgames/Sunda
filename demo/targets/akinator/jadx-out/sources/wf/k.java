package wf;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f90575a = {R.attr.stateListAnimator};

    public static void a(AppBarLayout appBarLayout, float f10) {
        int integer = appBarLayout.getResources().getInteger(com.digidust.elokence.akinator.freemium.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.digidust.elokence.akinator.freemium.R.attr.state_liftable, -2130969876}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
