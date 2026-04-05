package e6;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d0 {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j10) {
        ((AnimatorSet) animator).setCurrentPlayTime(j10);
    }
}
