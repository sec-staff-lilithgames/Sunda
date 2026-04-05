package com.bytedance.sdk.openadsdk.core.widget;

import a.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr extends com.bytedance.sdk.openadsdk.core.jj.xyk {

    /* renamed from: jd, reason: collision with root package name */
    private RectF f20962jd;
    private Paint jpo;
    private int wqx;

    public prr(Context context) {
        this(context, null);
    }

    private void jpo() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.jpo = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.jpo.setColor(Color.parseColor("#99333333"));
        this.jpo.setAntiAlias(true);
        this.jpo.setStrokeWidth(0.0f);
        this.f20962jd = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f20962jd;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.jpo);
        canvas.translate((this.f20962jd.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jj.xyk, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f20962jd.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.wqx = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int iA = b.A(measuredHeight, 2, 2, measuredWidth);
        setMeasuredDimension(iA, measuredHeight);
        this.f20962jd.set(0.0f, 0.0f, iA, measuredHeight);
    }

    public prr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public prr(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.wqx = 0;
        jpo();
    }
}
