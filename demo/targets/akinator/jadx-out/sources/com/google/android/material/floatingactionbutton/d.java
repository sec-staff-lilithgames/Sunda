package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;
import vf.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface d {
    void addAnimationListener(Animator.AnimatorListener animatorListener);

    AnimatorSet createAnimator();

    h getCurrentMotionSpec();

    int getDefaultMotionSpecResource();

    List<Animator.AnimatorListener> getListeners();

    h getMotionSpec();

    void onAnimationCancel();

    void onAnimationEnd();

    void onAnimationStart(Animator animator);

    void onChange(ExtendedFloatingActionButton.b bVar);

    void performNow();

    void removeAnimationListener(Animator.AnimatorListener animatorListener);

    void setMotionSpec(h hVar);

    boolean shouldCancel();
}
