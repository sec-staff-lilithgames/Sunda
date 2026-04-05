package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f13554c = new Paint(1);

    /* renamed from: d, reason: collision with root package name */
    private static final Paint f13555d = new Paint(1);

    /* renamed from: e, reason: collision with root package name */
    private static final Paint f13556e = new Paint(1);

    public n(Context context) {
        super(context);
        f13554c.setColor(-1);
        f13555d.setColor(-16777216);
        Paint paint = f13556e;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f13526a * 10.0f;
    }

    public float getInnerCircleOffset() {
        return this.f13526a * 2.0f;
    }

    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    public float getStrokeWidth() {
        return this.f13526a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f13554c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f13555d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f13556e;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
