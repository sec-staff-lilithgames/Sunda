package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBRoundRectImageViewC extends MBImageView {

    /* renamed from: d, reason: collision with root package name */
    private Paint f39873d;

    public MBRoundRectImageViewC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39873d = new Paint();
    }

    private Bitmap a(Bitmap bitmap) {
        Bitmap bitmap2;
        Matrix matrix;
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap;
        }
        try {
            int width = getWidth();
            float height = getHeight() / bitmap.getHeight();
            matrix = new Matrix();
            matrix.postScale(width / bitmap.getWidth(), height);
            bitmap2 = bitmap;
        } catch (Exception e10) {
            e = e10;
            bitmap2 = bitmap;
        }
        try {
            return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e11) {
            e = e11;
            p0.b("MBRoundRectImageViewC", e.getMessage());
            return bitmap2;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                super.onDraw(canvas);
                return;
            }
            Bitmap bitmapA = a(((BitmapDrawable) drawable).getBitmap());
            if (bitmapA != null && !bitmapA.isRecycled()) {
                Bitmap bitmapA2 = a(bitmapA, 30);
                if (bitmapA2 != null && !bitmapA2.isRecycled()) {
                    Rect rect = new Rect(0, 0, bitmapA2.getWidth(), bitmapA2.getHeight());
                    this.f39873d.reset();
                    canvas.drawBitmap(bitmapA2, rect, rect, this.f39873d);
                    return;
                }
                super.onDraw(canvas);
                return;
            }
            super.onDraw(canvas);
        } catch (Exception e10) {
            p0.b("MBRoundRectImageViewC", e10.getMessage());
        }
    }

    private Bitmap a(Bitmap bitmap, int i10) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(bitmapShader);
                float f10 = i10;
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), f10, f10, paint);
                return bitmapCreateBitmap;
            } catch (Exception e10) {
                p0.b("MBRoundRectImageViewC", e10.getMessage());
            }
        }
        return bitmap;
    }
}
