package com.bytedance.sdk.openadsdk.core.widget;

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
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.adsdk.ugeno.zz.cm.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq extends com.bytedance.sdk.openadsdk.core.jj.cm {

    /* renamed from: cm, reason: collision with root package name */
    private final Matrix f20966cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f20967jd;

    /* renamed from: jj, reason: collision with root package name */
    private BitmapShader f20968jj;
    private final Paint jpo;
    private final RectF my;
    private int wqx;

    public sq(Context context) {
        this(context, null);
    }

    private Bitmap jpo(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmapJpo;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && a.d(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f20968jj == null && (bitmapJpo = jpo(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f20968jj = new BitmapShader(bitmapJpo, tileMode, tileMode);
            float fMax = (bitmapJpo.getWidth() == getWidth() && bitmapJpo.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapJpo.getWidth(), (getHeight() * 1.0f) / bitmapJpo.getHeight());
            this.f20966cm.setScale(fMax, fMax);
            this.f20968jj.setLocalMatrix(this.f20966cm);
        }
        BitmapShader bitmapShader = this.f20968jj;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.jpo.setShader(bitmapShader);
            canvas.drawRoundRect(this.my, this.f20967jd, this.wqx, this.jpo);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.my.set(0.0f, 0.0f, i10, i11);
    }

    public void setXRound(int i10) {
        this.f20967jd = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.wqx = i10;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.f20968jj = null;
    }

    public sq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public sq(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20967jd = 25;
        this.wqx = 25;
        this.my = new RectF();
        Paint paint = new Paint();
        this.jpo = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.f20966cm = new Matrix();
    }
}
