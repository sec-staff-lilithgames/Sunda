package io.bidmachine.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f61630f = 0;

    /* renamed from: b, reason: collision with root package name */
    public final b f61631b;

    /* renamed from: c, reason: collision with root package name */
    public float f61632c;

    /* renamed from: e, reason: collision with root package name */
    public int f61633e;

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f61633e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f61632c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f61632c / f14) - 1.0f;
        float fAbs = Math.abs(f15);
        b bVar = this.f61631b;
        if (fAbs <= 0.01f) {
            bVar.scheduleUpdate(this.f61632c, f14, false);
            return;
        }
        int i12 = this.f61633e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f61632c;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f61632c;
                    } else {
                        f11 = this.f61632c;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f61632c;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f61632c;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f61632c;
            measuredWidth = (int) (f13 * f10);
        }
        bVar.scheduleUpdate(this.f61632c, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f61632c != f10) {
            this.f61632c = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f61633e != i10) {
            this.f61633e = i10;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61633e = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g0.f61754a, 0, 0);
            try {
                this.f61633e = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f61631b = new b(this);
    }

    public void setAspectRatioListener(a aVar) {
    }
}
