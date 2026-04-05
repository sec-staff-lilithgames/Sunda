package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public Path f29289b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f29290c;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
        this.f29290c = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f29289b == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.f29289b);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float[] getCornerRadii() {
        return this.f29290c;
    }

    public void resetClipBoundsAndCornerRadii() {
        this.f29289b = null;
        this.f29290c = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        invalidate();
    }

    public void updateClipBoundsAndCornerRadii(Rect rect, float[] fArr) {
        updateClipBoundsAndCornerRadii(rect.left, rect.top, rect.right, rect.bottom, fArr);
    }

    public void updateCornerRadii(float[] fArr) {
        updateClipBoundsAndCornerRadii(getLeft(), getTop(), getRight(), getBottom(), fArr);
    }

    public void updateClipBoundsAndCornerRadii(float f10, float f11, float f12, float f13, float[] fArr) {
        updateClipBoundsAndCornerRadii(new RectF(f10, f11, f12, f13), fArr);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29290c = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public void updateClipBoundsAndCornerRadii(RectF rectF, float[] fArr) {
        if (this.f29289b == null) {
            this.f29289b = new Path();
        }
        this.f29290c = fArr;
        this.f29289b.reset();
        this.f29289b.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.f29289b.close();
        invalidate();
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29290c = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }
}
