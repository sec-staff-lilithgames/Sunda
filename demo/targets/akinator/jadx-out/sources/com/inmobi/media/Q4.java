package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q4 extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public O4 f32156a;

    /* renamed from: b, reason: collision with root package name */
    public float f32157b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32158c;

    /* renamed from: d, reason: collision with root package name */
    public String f32159d;

    public Q4(Context context) {
        super(context, null);
        this.f32157b = 1.0f;
        this.f32158c = true;
        this.f32159d = "unspecified";
        setLayerType(1, null);
    }

    private final int getDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!(getContext() instanceof Activity)) {
            return PsExtractor.VIDEO_STREAM_MASK;
        }
        Context context = getContext();
        kotlin.jvm.internal.e0.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    private final float getScale() {
        float density = getContext().getResources().getDisplayMetrics().densityDpi / getDensity();
        this.f32157b = density;
        if (density < 0.1f) {
            this.f32157b = 0.1f;
        }
        if (this.f32157b > 5.0f) {
            this.f32157b = 5.0f;
        }
        return this.f32157b;
    }

    public final void a(Canvas canvas) {
        float fMin;
        float f10;
        float f11;
        canvas.save();
        float f12 = this.f32157b;
        canvas.scale(f12, f12);
        float width = getWidth();
        float height = getHeight();
        float fC = (this.f32156a != null ? r2.c() : 0) * this.f32157b;
        float fA = (this.f32156a != null ? r4.a() : 0) * this.f32157b;
        String str = this.f32159d;
        if (kotlin.jvm.internal.e0.areEqual(str, "aspectFill")) {
            fMin = Math.max(height / fA, width / fC);
            float f13 = width - (fC * fMin);
            float f14 = 2;
            float f15 = this.f32157b * fMin;
            f10 = (f13 / f14) / f15;
            f11 = ((height - (fA * fMin)) / f14) / f15;
            canvas.scale(fMin, fMin);
        } else if (kotlin.jvm.internal.e0.areEqual(str, "aspectFit")) {
            fMin = Math.min(height / fA, width / fC);
            float f16 = width - (fC * fMin);
            float f17 = 2;
            float f18 = this.f32157b * fMin;
            f10 = (f16 / f17) / f18;
            f11 = ((height - (fA * fMin)) / f17) / f18;
            canvas.scale(fMin, fMin);
        } else {
            fMin = height / fA;
            canvas.scale(width / fC, fMin);
            f10 = 0.0f;
            f11 = 0.0f;
        }
        float[] fArr = {f10, f11, fMin};
        O4 o42 = this.f32156a;
        if (o42 != null) {
            o42.a(canvas, fArr[0], fArr[1]);
        }
        canvas.restore();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        O4 o42 = this.f32156a;
        if (o42 != null) {
            if (!o42.b()) {
                a(canvas);
                return;
            }
            o42.d();
            a(canvas);
            if (this.f32158c) {
                postInvalidateOnAnimation();
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f32158c = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        this.f32157b = getScale();
        Drawable drawable = getDrawable();
        O4 o42 = this.f32156a;
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = 1;
            }
            if (intrinsicHeight > 0) {
                i = intrinsicHeight;
            }
        } else if (o42 != null) {
            int iC = o42.c();
            int iA = o42.a();
            if (iC <= 0) {
                iC = 1;
            }
            i = iA > 0 ? iA : 1;
            intrinsicWidth = iC;
        } else {
            i = 0;
            intrinsicWidth = 0;
        }
        setMeasuredDimension(View.resolveSize(Math.max(getPaddingLeft() + getPaddingRight() + intrinsicWidth, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(getPaddingTop() + getPaddingBottom() + i, getSuggestedMinimumHeight()), i11));
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        boolean z10 = i10 == 1;
        this.f32158c = z10;
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        boolean z10 = i10 == 0;
        this.f32158c = z10;
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        boolean z10 = i10 == 0;
        this.f32158c = z10;
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    public final void setContentMode(String contentMode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(contentMode, "contentMode");
        this.f32159d = contentMode;
    }

    public final void setGifImpl(O4 o42) {
        this.f32156a = o42;
        if (o42 != null) {
            o42.a(this);
            o42.start();
        }
        requestLayout();
    }

    public final void setPaused(boolean z10) {
        O4 o42 = this.f32156a;
        if (o42 != null) {
            o42.a(z10);
        }
    }

    private static /* synthetic */ void getMContentMode$annotations() {
    }
}
