package o9;

import android.animation.Animator;
import android.widget.ImageView;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l6 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78322a;

    public l6(QuestionActivity questionActivity) {
        this.f78322a = questionActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animator, "animator");
        Timber.Forest.tag("QuestionActivity").d("QCM fade-in animation completed", new Object[0]);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animator, "animator");
        QuestionActivity questionActivity = this.f78322a;
        ImageView imageView = questionActivity.f21692o;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().layoutQCM.setVisibility(0);
        questionActivity.getBinding$akinatorGL_gplayFreemiumRelease().adBanner.getRoot().setVisibility(0);
    }
}
