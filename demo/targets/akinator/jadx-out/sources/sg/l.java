package sg;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import qg.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class l extends a {

    /* renamed from: g, reason: collision with root package name */
    public final float f85759g;

    /* renamed from: h, reason: collision with root package name */
    public final float f85760h;

    /* renamed from: i, reason: collision with root package name */
    public float f85761i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f85762j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f85763k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f85764l;

    public l(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f85759g = resources.getDimension(R.dimen.m3_back_progress_main_container_min_edge_gap);
        this.f85760h = resources.getDimension(R.dimen.m3_back_progress_main_container_max_translation_y);
    }

    public final AnimatorSet b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        View view2 = this.f85744b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new k(view));
        return animatorSet;
    }

    public void cancelBackProgress(View view) {
        if (a() == null) {
            return;
        }
        AnimatorSet animatorSetB = b(view);
        View view2 = this.f85744b;
        if (view2 instanceof ClippableRoundedCornerLayout) {
            ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view2;
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new j(), clippableRoundedCornerLayout.getCornerRadii(), getExpandedCornerRadii());
            valueAnimatorOfObject.addUpdateListener(new com.google.android.exoplayer2.ui.g(clippableRoundedCornerLayout, 7));
            animatorSetB.playTogether(valueAnimatorOfObject);
        }
        animatorSetB.setDuration(this.f85747e);
        animatorSetB.start();
        this.f85761i = 0.0f;
        this.f85762j = null;
        this.f85763k = null;
    }

    public void clearExpandedCornerRadii() {
        this.f85764l = null;
    }

    public void finishBackProgress(long j10, View view) {
        AnimatorSet animatorSetB = b(view);
        animatorSetB.setDuration(j10);
        animatorSetB.start();
        this.f85761i = 0.0f;
        this.f85762j = null;
        this.f85763k = null;
    }

    public float[] getExpandedCornerRadii() {
        float[] fArr;
        View view;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        if (this.f85764l == null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = (view = this.f85744b).getRootWindowInsets()) == null) {
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            } else {
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                int i10 = displayMetrics.widthPixels;
                int i11 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i12 = iArr[0];
                int i13 = iArr[1];
                int width = view.getWidth();
                int height = view.getHeight();
                int radius = (i12 == 0 && i13 == 0 && (roundedCorner4 = rootWindowInsets.getRoundedCorner(0)) != null) ? roundedCorner4.getRadius() : 0;
                int i14 = width + i12;
                int radius2 = (i14 < i10 || i13 != 0 || (roundedCorner3 = rootWindowInsets.getRoundedCorner(1)) == null) ? 0 : roundedCorner3.getRadius();
                int radius3 = (i14 < i10 || i13 + height < i11 || (roundedCorner2 = rootWindowInsets.getRoundedCorner(2)) == null) ? 0 : roundedCorner2.getRadius();
                int radius4 = (i12 != 0 || i13 + height < i11 || (roundedCorner = rootWindowInsets.getRoundedCorner(3)) == null) ? 0 : roundedCorner.getRadius();
                float f10 = radius;
                float f11 = radius2;
                float f12 = radius3;
                float f13 = radius4;
                fArr = new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
            }
            this.f85764l = fArr;
        }
        return this.f85764l;
    }

    public Rect getInitialHideFromClipBounds() {
        return this.f85763k;
    }

    public Rect getInitialHideToClipBounds() {
        return this.f85762j;
    }

    public void startBackProgress(f.c cVar, View view) {
        this.f85748f = cVar;
        startBackProgress(cVar.getTouchY(), view);
    }

    public void updateBackProgress(f.c cVar, View view, float f10) {
        if (this.f85748f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        f.c cVar2 = this.f85748f;
        this.f85748f = cVar;
        if (cVar2 == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        updateBackProgress(cVar.getProgress(), cVar.getSwipeEdge() == 0, cVar.getTouchY(), f10);
    }

    public void startBackProgress(float f10, View view) {
        View view2 = this.f85744b;
        this.f85762j = t0.calculateRectFromBounds(view2);
        if (view != null) {
            this.f85763k = t0.calculateOffsetRectFromBounds(view2, view);
        }
        this.f85761i = f10;
    }

    public void updateBackProgress(float f10, boolean z10, float f11, float f12) {
        float fInterpolateProgress = interpolateProgress(f10);
        View view = this.f85744b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float fLerp = vf.a.lerp(1.0f, 0.9f, fInterpolateProgress);
        float f13 = this.f85759g;
        float fLerp2 = vf.a.lerp(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - f13), fInterpolateProgress) * (z10 ? 1 : -1);
        float fMin = Math.min(Math.max(0.0f, ((height - (fLerp * height)) / 2.0f) - f13), this.f85760h);
        float f14 = f11 - this.f85761i;
        float fLerp3 = vf.a.lerp(0.0f, fMin, Math.abs(f14) / height) * Math.signum(f14);
        if (Float.isNaN(fLerp) || Float.isNaN(fLerp2) || Float.isNaN(fLerp3)) {
            return;
        }
        view.setScaleX(fLerp);
        view.setScaleY(fLerp);
        view.setTranslationX(fLerp2);
        view.setTranslationY(fLerp3);
        if (view instanceof ClippableRoundedCornerLayout) {
            float[] expandedCornerRadii = getExpandedCornerRadii();
            ((ClippableRoundedCornerLayout) view).updateCornerRadii(new float[]{vf.a.lerp(expandedCornerRadii[0], f12, fInterpolateProgress), vf.a.lerp(expandedCornerRadii[1], f12, fInterpolateProgress), vf.a.lerp(expandedCornerRadii[2], f12, fInterpolateProgress), vf.a.lerp(expandedCornerRadii[3], f12, fInterpolateProgress), vf.a.lerp(expandedCornerRadii[4], f12, fInterpolateProgress), vf.a.lerp(expandedCornerRadii[5], f12, fInterpolateProgress), vf.a.lerp(expandedCornerRadii[6], f12, fInterpolateProgress), vf.a.lerp(expandedCornerRadii[7], f12, fInterpolateProgress)});
        }
    }
}
