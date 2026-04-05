package hg;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static Animator createCircularReveal(j jVar, float f10, float f11, float f12) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(jVar, g.f58774a, f.f58772b, new i(f10, f11, f12));
        i revealInfo = jVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) jVar, (int) f10, (int) f11, revealInfo.f58778c, f12);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    public static Animator.AnimatorListener createCircularRevealListener(j jVar) {
        return new a(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator createCircularReveal(j jVar, float f10, float f11, float f12, float f13) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(jVar, g.f58774a, f.f58772b, new i(f10, f11, f12), new i(f10, f11, f13));
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) jVar, (int) f10, (int) f11, f12, f13);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }
}
