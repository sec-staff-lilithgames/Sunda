package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1740a9 extends ImageView {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Bitmap A03;

    public C1740a9(C1937dL c1937dL, int i10, int i11, XX xx) {
        super(c1937dL);
        this.A00 = 1.0f;
        this.A01 = i10;
        this.A02 = i11;
        this.A03 = XY.A01(xx);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(2);
        paint.setColorFilter(new PorterDuffColorFilter(this.A01, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.A03, (Rect) null, new Rect(0, 0, getWidth(), getHeight()), paint);
        paint.setColorFilter(new PorterDuffColorFilter(this.A02, PorterDuff.Mode.SRC_ATOP));
        Rect fillRect = new Rect(0, 0, (int) (this.A03.getWidth() * 1.0f), this.A03.getHeight());
        Rect drawRect = new Rect(0, 0, (int) (getWidth() * 1.0f), getHeight());
        canvas.drawBitmap(this.A03, fillRect, drawRect, paint);
    }
}
