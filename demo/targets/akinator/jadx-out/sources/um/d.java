package um;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d extends ProgressBar implements o {

    /* renamed from: b, reason: collision with root package name */
    public i f88559b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f88560c;

    public d(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f88560c = paint;
        paint.setColor(0);
        a(context);
    }

    public final void a(Context context) {
        float f10 = getResources().getDisplayMetrics().density;
        int iDpToPx = h0.dpToPx(context, 8.0f);
        setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        i iVar = new i(context);
        this.f88559b = iVar;
        iVar.setStrokeWidth(f10 * 4.0f);
        this.f88559b.setColorSchemeColors(-65536);
        this.f88559b.setStrokeCap(Paint.Cap.ROUND);
        setIndeterminateDrawable(this.f88559b);
        setIndeterminate(true);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, this.f88560c);
        super.onDraw(canvas);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f88559b.setCenterRadius((Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - this.f88559b.getStrokeWidth());
    }

    public void setColorSchemeColors(int... iArr) {
        this.f88559b.setColorSchemeColors(iArr);
    }

    public void setProgressBackgroundColor(int i10) {
        this.f88560c.setColor(i10);
    }

    @Override // um.o
    public void setStyle(p pVar) {
        this.f88559b.setStrokeWidth(pVar.getStrokeWidth(getContext()).floatValue());
        this.f88559b.setColorSchemeColors(pVar.getStrokeColor().intValue());
        this.f88560c.setColor(pVar.getFillColor().intValue());
        postInvalidate();
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f88560c = paint;
        paint.setColor(0);
        a(context);
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Paint paint = new Paint(1);
        this.f88560c = paint;
        paint.setColor(0);
        a(context);
    }
}
