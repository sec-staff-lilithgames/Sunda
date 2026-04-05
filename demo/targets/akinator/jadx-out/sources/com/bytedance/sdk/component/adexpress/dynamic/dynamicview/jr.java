package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jr extends Drawable {

    /* renamed from: cm, reason: collision with root package name */
    private RectF f18230cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f18231jd;
    private Paint jpo;
    private int wqx;

    public jr(int i10, int i11) {
        this.wqx = i10;
        this.f18231jd = i11;
        Paint paint = new Paint();
        this.jpo = paint;
        paint.setColor(0);
        this.jpo.setAntiAlias(true);
        this.jpo.setShadowLayer(i11, 0.0f, 0.0f, -16777216);
        this.jpo.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.f18230cm;
        int i10 = this.wqx;
        canvas.drawRoundRect(rectF, i10, i10, this.jpo);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.jpo.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = this.f18231jd;
        this.f18230cm = new RectF(i10 + i14, i11 + i14, i12 - i14, i13 - i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.jpo.setColorFilter(colorFilter);
    }
}
