package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1752aL extends RelativeLayout {
    public static final int A04 = (int) (AbstractC1640Wl.A02 * 4.0f);
    public static final float[] A05 = {A04, A04, A04, A04, A04, A04, A04, A04};
    public boolean A00;
    public float[] A01;
    public final Path A02;
    public final RectF A03;

    public C1752aL(C1937dL c1937dL) {
        super(c1937dL);
        this.A01 = A05;
        this.A00 = false;
        this.A02 = new Path();
        this.A03 = new RectF();
        XP.A0K(this, 0);
    }

    private float[] getRadiiForCircularImage() {
        int radiusForCircle = Math.min(getWidth(), getHeight()) / 2;
        return new float[]{radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle, radiusForCircle};
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A03.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A02.reset();
        this.A02.addRoundRect(this.A03, this.A00 ? getRadiiForCircularImage() : this.A01, Path.Direction.CW);
        canvas.clipPath(this.A02);
        super.onDraw(canvas);
    }

    public void setFullCircleCorners(boolean z10) {
        this.A00 = z10;
    }

    public void setRadius(int i10) {
        int densityAdjustedRadius = (int) (i10 * AbstractC1640Wl.A02);
        this.A01 = new float[]{densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius, densityAdjustedRadius};
    }

    public void setRadius(float[] fArr) {
        this.A01 = fArr;
    }
}
