package o9;

import android.animation.Animator;
import com.digidust.elokence.akinator.activities.HomeActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u1 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78584a;

    public u1(HomeActivity homeActivity) {
        this.f78584a = homeActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        this.f78584a.runOnUiThread(new al.b(10));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
    }
}
