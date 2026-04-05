package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.widget.MBImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class RoundImageView extends MBImageView {

    /* renamed from: c, reason: collision with root package name */
    private int f45402c;

    /* renamed from: d, reason: collision with root package name */
    private int f45403d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f45404e;

    /* renamed from: f, reason: collision with root package name */
    private int f45405f;

    /* renamed from: g, reason: collision with root package name */
    private Matrix f45406g;

    /* renamed from: h, reason: collision with root package name */
    private BitmapShader f45407h;

    /* renamed from: i, reason: collision with root package name */
    private int f45408i;

    /* renamed from: j, reason: collision with root package name */
    private RectF f45409j;

    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45406g = new Matrix();
        Paint paint = new Paint();
        this.f45404e = paint;
        paint.setAntiAlias(true);
        this.f45403d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f45402c = 1;
    }

    private Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            p0.b("View", th2.getMessage());
            return null;
        }
    }

    private void b() {
        Bitmap bitmapA;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (bitmapA = a(drawable)) == null || bitmapA.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f45407h = new BitmapShader(bitmapA, tileMode, tileMode);
            int i10 = this.f45402c;
            float fMax = 1.0f;
            if (i10 == 0) {
                fMax = (this.f45408i * 1.0f) / Math.min(bitmapA.getWidth(), bitmapA.getHeight());
            } else if (i10 == 1) {
                fMax = Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
            }
            this.f45406g.setScale(fMax, fMax);
            this.f45407h.setLocalMatrix(this.f45406g);
            this.f45404e.setShader(this.f45407h);
        } catch (Throwable th2) {
            p0.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            if (getDrawable() == null) {
                return;
            }
            b();
            if (this.f45402c != 1) {
                float f10 = this.f45405f;
                canvas.drawCircle(f10, f10, f10, this.f45404e);
            } else {
                RectF rectF = this.f45409j;
                float f11 = this.f45403d;
                canvas.drawRoundRect(rectF, f11, f11, this.f45404e);
            }
        } catch (Throwable th2) {
            p0.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f45402c == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f45408i = iMin;
            this.f45405f = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
        this.f45402c = bundle.getInt("state_type");
        this.f45403d = bundle.getInt("state_border_radius");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f45402c);
        bundle.putInt("state_border_radius", this.f45403d);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f45402c == 1) {
            this.f45409j = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i10) {
        int iA = u0.a(getContext(), i10);
        if (this.f45403d != iA) {
            this.f45403d = iA;
            invalidate();
        }
    }

    public void setType(int i10) {
        if (this.f45402c != i10) {
            this.f45402c = i10;
            if (i10 != 1 && i10 != 0) {
                this.f45402c = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45406g = new Matrix();
        Paint paint = new Paint();
        this.f45404e = paint;
        paint.setAntiAlias(true);
        this.f45403d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f45402c = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.f45406g = new Matrix();
        Paint paint = new Paint();
        this.f45404e = paint;
        paint.setAntiAlias(true);
        this.f45403d = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f45402c = 1;
    }
}
