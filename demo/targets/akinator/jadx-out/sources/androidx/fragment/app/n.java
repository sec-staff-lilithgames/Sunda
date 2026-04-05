package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: c, reason: collision with root package name */
    public boolean f6413c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6414d;

    /* renamed from: e, reason: collision with root package name */
    public n0 f6415e;

    public final n0 c(Context context) throws Resources.NotFoundException {
        Animation animationLoadAnimation;
        n0 n0Var;
        if (this.f6414d) {
            return this.f6415e;
        }
        a3 a3Var = this.f6422a;
        Fragment fragment = a3Var.getFragment();
        boolean z10 = a3Var.getFinalState() == z2.f6508c;
        boolean z11 = this.f6413c;
        int nextTransition = fragment.getNextTransition();
        int popEnterAnim = z11 ? z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        n0 n0Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, popEnterAnim);
            if (animationOnCreateAnimation != null) {
                n0Var2 = new n0(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, popEnterAnim);
                if (animatorOnCreateAnimator != null) {
                    n0Var2 = new n0(animatorOnCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z10 ? kotlin.jvm.internal.d0.H(context, android.R.attr.activityOpenEnterAnimation) : kotlin.jvm.internal.d0.H(context, android.R.attr.activityOpenExitAnimation) : z10 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z10 ? kotlin.jvm.internal.d0.H(context, android.R.attr.activityCloseEnterAnimation) : kotlin.jvm.internal.d0.H(context, android.R.attr.activityCloseExitAnimation) : z10 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z10 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    }
                    if (popEnterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        if (zEquals) {
                            try {
                                animationLoadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                            } catch (Resources.NotFoundException e10) {
                                throw e10;
                            } catch (RuntimeException unused) {
                            }
                            if (animationLoadAnimation != null) {
                                n0Var = new n0(animationLoadAnimation);
                                n0Var2 = n0Var;
                            }
                        } else {
                            try {
                                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                if (animatorLoadAnimator != null) {
                                    n0Var = new n0(animatorLoadAnimator);
                                    n0Var2 = n0Var;
                                }
                            } catch (RuntimeException e11) {
                                if (zEquals) {
                                    throw e11;
                                }
                                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                if (animationLoadAnimation2 != null) {
                                    n0Var2 = new n0(animationLoadAnimation2);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f6415e = n0Var2;
        this.f6414d = true;
        return n0Var2;
    }
}
