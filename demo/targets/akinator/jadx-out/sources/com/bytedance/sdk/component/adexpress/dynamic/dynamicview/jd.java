package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends GradientDrawable {

    /* renamed from: jd, reason: collision with root package name */
    private final Paint f18219jd;
    protected Path jpo;

    public jd() {
        this.jpo = new Path();
        Paint paint = new Paint(1);
        this.f18219jd = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.jpo;
        if (path == null || path.isEmpty()) {
            jpo(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.f18219jd, 31);
        jpo(canvas);
        this.f18219jd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.jpo, this.f18219jd);
        this.f18219jd.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void jpo(Canvas canvas) {
        super.draw(canvas);
    }

    public void jpo(int i10, int i11, int i12, int i13) {
        this.jpo.addRect(i10, i11, i12, i13, Path.Direction.CW);
        invalidateSelf();
    }

    public jd(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.jpo = new Path();
        Paint paint = new Paint(1);
        this.f18219jd = paint;
        paint.setColor(-1);
    }
}
