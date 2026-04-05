package sg;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class i extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f85756g;

    /* renamed from: h, reason: collision with root package name */
    public final float f85757h;

    public i(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f85756g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f85757h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet b() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f85744b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new y4.b());
        return animatorSet;
    }

    public void cancelBackProgress() {
        if (a() == null) {
            return;
        }
        AnimatorSet animatorSetB = b();
        animatorSetB.setDuration(this.f85747e);
        animatorSetB.start();
    }

    public void finishBackProgressNotPersistent(f.c cVar, Animator.AnimatorListener animatorListener) {
        View view = this.f85744b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new y4.b());
        objectAnimatorOfFloat.setDuration(vf.a.lerp(this.f85745c, this.f85746d, cVar.getProgress()));
        objectAnimatorOfFloat.addListener(new h(this));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void finishBackProgressPersistent(f.c cVar, Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSetB = b();
        animatorSetB.setDuration(vf.a.lerp(this.f85745c, this.f85746d, cVar.getProgress()));
        if (animatorListener != null) {
            animatorSetB.addListener(animatorListener);
        }
        animatorSetB.start();
    }

    public void startBackProgress(f.c cVar) {
        this.f85748f = cVar;
    }

    public void updateBackProgress(float f10) {
        float fInterpolateProgress = interpolateProgress(f10);
        View view = this.f85744b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.f85756g / width;
        float f12 = this.f85757h / height;
        float fLerp = 1.0f - vf.a.lerp(0.0f, f11, fInterpolateProgress);
        float fLerp2 = 1.0f - vf.a.lerp(0.0f, f12, fInterpolateProgress);
        if (Float.isNaN(fLerp) || Float.isNaN(fLerp2)) {
            return;
        }
        view.setScaleX(fLerp);
        view.setPivotY(height);
        view.setScaleY(fLerp2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fLerp2 != 0.0f ? fLerp / fLerp2 : 1.0f);
            }
        }
    }

    public void updateBackProgress(f.c cVar) {
        if (this.f85748f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        f.c cVar2 = this.f85748f;
        this.f85748f = cVar;
        if (cVar2 == null) {
            return;
        }
        updateBackProgress(cVar.getProgress());
    }
}
