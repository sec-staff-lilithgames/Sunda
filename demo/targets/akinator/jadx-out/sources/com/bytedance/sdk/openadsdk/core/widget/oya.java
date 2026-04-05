package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya extends com.bytedance.sdk.openadsdk.core.jj.cm {

    /* renamed from: jd, reason: collision with root package name */
    private RectF f20961jd;
    private Paint jpo;

    public oya(Context context) {
        super(context);
        jpo();
    }

    private void jpo() {
        Paint paint = new Paint();
        this.jpo = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.jpo.setColor(Color.parseColor("#99333333"));
        this.jpo.setAntiAlias(true);
        this.jpo.setStrokeWidth(0.0f);
        this.f20961jd = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f20961jd;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.jpo);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jj.cm, android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f20961jd.right == getMeasuredWidth() && this.f20961jd.bottom == getMeasuredHeight()) {
            return;
        }
        this.f20961jd.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
