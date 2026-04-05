package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.localbroadcastmanager.content.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import vf.a;
import vf.h;
import vf.i;
import vf.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: e, reason: collision with root package name */
    public final Rect f29586e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f29587f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f29588g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f29589h;

    /* renamed from: i, reason: collision with root package name */
    public float f29590i;

    /* renamed from: j, reason: collision with root package name */
    public float f29591j;

    public FabTransformationBehavior() {
        this.f29586e = new Rect();
        this.f29587f = new RectF();
        this.f29588g = new RectF();
        this.f29589h = new int[2];
    }

    public static Pair c(float f10, float f11, boolean z10, b bVar) {
        i timing;
        i timing2;
        if (f10 == 0.0f || f11 == 0.0f) {
            timing = ((h) bVar.f6756a).getTiming("translationXLinear");
            timing2 = ((h) bVar.f6756a).getTiming("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            timing = ((h) bVar.f6756a).getTiming("translationXCurveDownwards");
            timing2 = ((h) bVar.f6756a).getTiming("translationYCurveDownwards");
        } else {
            timing = ((h) bVar.f6756a).getTiming("translationXCurveUpwards");
            timing2 = ((h) bVar.f6756a).getTiming("translationYCurveUpwards");
        }
        return new Pair(timing, timing2);
    }

    public static float f(b bVar, i iVar, float f10) {
        long delay = iVar.getDelay();
        long duration = iVar.getDuration();
        i timing = ((h) bVar.f6756a).getTiming("expansion");
        return a.lerp(f10, 0.0f, iVar.getInterpolator().getInterpolation((((timing.getDuration() + timing.getDelay()) + 17) - delay) / duration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032f  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet b(android.view.View r26, android.view.View r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.b(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float d(View view, View view2, j jVar) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f29587f;
        g(view, rectF);
        rectF.offset(this.f29590i, this.f29591j);
        RectF rectF2 = this.f29588g;
        g(view2, rectF2);
        int i10 = jVar.f89259a & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i10 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i10 != 5) {
                f10 = 0.0f;
                return f10 + jVar.f89260b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + jVar.f89260b;
    }

    public final float e(View view, View view2, j jVar) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f29587f;
        g(view, rectF);
        rectF.offset(this.f29590i, this.f29591j);
        RectF rectF2 = this.f29588g;
        g(view2, rectF2);
        int i10 = jVar.f89259a & 112;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i10 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i10 != 80) {
                f10 = 0.0f;
                return f10 + jVar.f89261c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + jVar.f89261c;
    }

    public final void g(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f29589h);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b h(Context context, boolean z10);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void onAttachedToLayoutParams(CoordinatorLayout.b bVar) {
        if (bVar.f5614h == 0) {
            bVar.f5614h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29586e = new Rect();
        this.f29587f = new RectF();
        this.f29588g = new RectF();
        this.f29589h = new int[2];
    }
}
