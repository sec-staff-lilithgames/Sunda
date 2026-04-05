package zm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import um.h0;
import um.o;
import um.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class d extends View implements o {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f98309b;

    /* renamed from: c, reason: collision with root package name */
    public float f98310c;

    /* renamed from: e, reason: collision with root package name */
    public float f98311e;

    /* renamed from: f, reason: collision with root package name */
    public int f98312f;

    /* renamed from: g, reason: collision with root package name */
    public int f98313g;

    public d(Context context) {
        super(context);
        this.f98309b = new Paint(1);
        this.f98310c = 0.0f;
        this.f98311e = 15.0f;
        this.f98312f = um.a.f88522a;
        this.f98313g = 0;
        this.f98311e = h0.dpToPx(getContext(), 4.0f);
    }

    public void changePercentage(float f10) {
        this.f98310c = f10;
        postInvalidate();
    }

    public int getLineColor() {
        return this.f98312f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        float f10 = this.f98311e;
        Paint paint = this.f98309b;
        paint.setStrokeWidth(f10);
        paint.setColor(this.f98313g);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f98309b);
        paint.setColor(this.f98312f);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f98310c) / 100.0f), measuredHeight, this.f98309b);
    }

    @Override // um.o
    public void setStyle(p pVar) {
        this.f98312f = pVar.getStrokeColor().intValue();
        this.f98313g = pVar.getFillColor().intValue();
        this.f98311e = pVar.getStrokeWidth(getContext()).floatValue();
        setAlpha(pVar.getOpacity().floatValue());
        postInvalidate();
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f98309b = new Paint(1);
        this.f98310c = 0.0f;
        this.f98311e = 15.0f;
        this.f98312f = um.a.f88522a;
        this.f98313g = 0;
        this.f98311e = h0.dpToPx(getContext(), 4.0f);
    }
}
