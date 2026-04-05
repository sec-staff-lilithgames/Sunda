package o9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.Guideline;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l0 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefiDuJourActivity f78312a;

    public l0(DefiDuJourActivity defiDuJourActivity) {
        this.f78312a = defiDuJourActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        DefiDuJourActivity defiDuJourActivity = this.f78312a;
        defiDuJourActivity.F.getLocationInWindow(new int[2]);
        defiDuJourActivity.G.getLocationInWindow(new int[2]);
        int i10 = defiDuJourActivity.F.getLayoutParams().width;
        int i11 = defiDuJourActivity.F.getLayoutParams().height;
        int left = ((Guideline) defiDuJourActivity.findViewById(R.id.rightPhoto_guide)).getLeft() - ((Guideline) defiDuJourActivity.findViewById(R.id.leftPhoto_guide)).getLeft();
        int top = ((Guideline) defiDuJourActivity.findViewById(R.id.bottomPhoto_guide)).getTop() - ((Guideline) defiDuJourActivity.findViewById(R.id.topPhoto_guide)).getTop();
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderWith = animatorSet.play(ObjectAnimator.ofFloat(defiDuJourActivity.F, (Property<ImageView, Float>) View.TRANSLATION_X, (left / 2) + ((r2[0] - (i10 / 2)) - r1[0])).setDuration(1000L)).with(ObjectAnimator.ofFloat(defiDuJourActivity.F, (Property<ImageView, Float>) View.TRANSLATION_Y, (top / 2) + ((r2[1] - (i11 / 2)) - r1[1])).setDuration(1000L)).with(ObjectAnimator.ofFloat(defiDuJourActivity.F, (Property<ImageView, Float>) View.SCALE_X, left / i10).setDuration(1000L)).with(ObjectAnimator.ofFloat(defiDuJourActivity.F, (Property<ImageView, Float>) View.SCALE_Y, top / i11).setDuration(1000L));
        ImageView imageView = defiDuJourActivity.F;
        Property property = View.ROTATION_Y;
        builderWith.with(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 1080.0f).setDuration(1000L)).with(ObjectAnimator.ofFloat(defiDuJourActivity.E, (Property<RelativeLayout, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(1000L)).after(ObjectAnimator.ofFloat(defiDuJourActivity.F, (Property<ImageView, Float>) property, 0.0f, 540.0f).setDuration(1200L));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new m0(defiDuJourActivity));
        animatorSet.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
