package com.bytedance.sdk.component.adexpress.jj;

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
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.zz.cm.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nq extends ImageView {

    /* renamed from: cm, reason: collision with root package name */
    private Matrix f18465cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f18466jd;
    private Paint jpo;
    private int wqx;

    public nq(Context context) {
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
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && a.d(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmapJpo = jpo(drawable);
        if (bitmapJpo == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapJpo, tileMode, tileMode);
        float fMax = (bitmapJpo.getWidth() == getWidth() && bitmapJpo.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapJpo.getWidth(), (getHeight() * 1.0f) / bitmapJpo.getHeight());
        this.f18465cm.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.f18465cm);
        this.jpo.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f18466jd, this.wqx, this.jpo);
    }

    public void setXRound(int i10) {
        this.f18466jd = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.wqx = i10;
        postInvalidate();
    }

    public nq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nq(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18466jd = 25;
        this.wqx = 25;
        Paint paint = new Paint();
        this.jpo = paint;
        paint.setAntiAlias(true);
        this.jpo.setFilterBitmap(true);
        this.f18465cm = new Matrix();
    }
}
