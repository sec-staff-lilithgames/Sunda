package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f28132f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final d f28133b;

    /* renamed from: c, reason: collision with root package name */
    public float f28134c;

    /* renamed from: e, reason: collision with root package name */
    public int f28135e;

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f28135e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f28134c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f28134c / f14) - 1.0f;
        float fAbs = Math.abs(f15);
        d dVar = this.f28133b;
        if (fAbs <= 0.01f) {
            dVar.scheduleUpdate(this.f28134c, f14, false);
            return;
        }
        int i12 = this.f28135e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f28134c;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f28134c;
                    } else {
                        f11 = this.f28134c;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f28134c;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f28134c;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f28134c;
            measuredWidth = (int) (f13 * f10);
        }
        dVar.scheduleUpdate(this.f28134c, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f28134c != f10) {
            this.f28134c = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f28135e != i10) {
            this.f28135e = i10;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28135e = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k.f28227a, 0, 0);
            try {
                this.f28135e = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f28133b = new d(this);
    }

    public void setAspectRatioListener(c cVar) {
    }
}
