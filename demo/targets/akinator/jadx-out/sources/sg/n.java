package sg;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Log;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class n extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f85768g;

    /* renamed from: h, reason: collision with root package name */
    public final float f85769h;

    /* renamed from: i, reason: collision with root package name */
    public final float f85770i;

    public n(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f85768g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f85769h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f85770i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public void cancelBackProgress() {
        if (a() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f85744b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f85747e);
        animatorSet.start();
    }

    public void finishBackProgress(f.c cVar, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i11;
        boolean z10 = cVar.getSwipeEdge() == 0;
        View view = this.f85744b;
        boolean z11 = (Gravity.getAbsoluteGravity(i10, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i11 = z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i11 = 0;
        }
        float f10 = scaleX + i11;
        Property property = View.TRANSLATION_X;
        if (z11) {
            f10 = -f10;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f10);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new y4.b());
        objectAnimatorOfFloat.setDuration(vf.a.lerp(this.f85745c, this.f85746d, cVar.getProgress()));
        objectAnimatorOfFloat.addListener(new m(this, z10, i10));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void startBackProgress(f.c cVar) {
        this.f85748f = cVar;
    }

    public void updateBackProgress(f.c cVar, int i10) {
        if (this.f85748f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        f.c cVar2 = this.f85748f;
        this.f85748f = cVar;
        if (cVar2 == null) {
            return;
        }
        updateBackProgress(cVar.getProgress(), cVar.getSwipeEdge() == 0, i10);
    }

    public void updateBackProgress(float f10, boolean z10, int i10) {
        float fInterpolateProgress = interpolateProgress(f10);
        View view = this.f85744b;
        boolean z11 = (Gravity.getAbsoluteGravity(i10, view.getLayoutDirection()) & 3) == 3;
        boolean z12 = z10 == z11;
        int width = view.getWidth();
        int height = view.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f85768g / f11;
            float f14 = this.f85769h / f11;
            float f15 = this.f85770i / f12;
            if (z11) {
                f11 = 0.0f;
            }
            view.setPivotX(f11);
            if (!z12) {
                f14 = -f13;
            }
            float fLerp = vf.a.lerp(0.0f, f14, fInterpolateProgress);
            float f16 = fLerp + 1.0f;
            float fLerp2 = 1.0f - vf.a.lerp(0.0f, f15, fInterpolateProgress);
            if (Float.isNaN(f16) || Float.isNaN(fLerp2)) {
                return;
            }
            view.setScaleX(f16);
            view.setScaleY(fLerp2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(z11 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z12 ? 1.0f - fLerp : 1.0f;
                    float f18 = fLerp2 != 0.0f ? (f16 / fLerp2) * f17 : 1.0f;
                    if (!Float.isNaN(f17) && !Float.isNaN(f18)) {
                        childAt.setScaleX(f17);
                        childAt.setScaleY(f18);
                    }
                }
            }
        }
    }
}
