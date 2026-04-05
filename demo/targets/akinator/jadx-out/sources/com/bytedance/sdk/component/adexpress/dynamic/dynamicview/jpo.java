package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends jd {
    private final Bitmap wqx;

    /* renamed from: jd, reason: collision with root package name */
    private final Rect f18229jd = new Rect();

    /* renamed from: cm, reason: collision with root package name */
    private final Paint f18228cm = new Paint(1);

    public jpo(Bitmap bitmap, jd jdVar) {
        this.wqx = bitmap;
        if (jdVar != null) {
            this.jpo = jdVar.jpo;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jd
    public void jpo(Canvas canvas) {
        canvas.drawBitmap(this.wqx, this.f18229jd, getBounds(), this.f18228cm);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.wqx.getWidth();
        int height = this.wqx.getHeight();
        this.f18229jd.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.f18229jd;
                int i10 = (width - iWidth) / 2;
                rect2.left = i10;
                rect2.right = i10 + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.f18229jd;
                int i11 = (height - iHeight) / 2;
                rect3.top = i11;
                rect3.bottom = i11 + iHeight;
                return;
            }
            return;
        }
        float f10 = iHeight;
        float f11 = f10 * 1.0f;
        float f12 = height;
        float f13 = f11 / f12;
        float f14 = iWidth;
        float f15 = 1.0f * f14;
        float f16 = width;
        if (Math.max(f13, f15 / f16) > f13) {
            int i12 = (int) ((f11 / f14) * f16);
            Rect rect4 = this.f18229jd;
            int i13 = (height - i12) / 2;
            rect4.top = i13;
            rect4.bottom = i13 + i12;
            return;
        }
        int i14 = (int) ((f15 / f10) * f12);
        Rect rect5 = this.f18229jd;
        int i15 = (width - i14) / 2;
        rect5.left = i15;
        rect5.right = i15 + i14;
    }
}
