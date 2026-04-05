package o9;

import android.animation.Animator;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t6 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78568a;

    public t6(QuestionActivity questionActivity) {
        this.f78568a = questionActivity;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animator, "animator");
        QuestionActivity questionActivity = this.f78568a;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(questionActivity), null, null, new s6(questionActivity, null), 3, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animator, "animator");
    }
}
