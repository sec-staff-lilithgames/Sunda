package zm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import um.o;
import um.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b extends TextView implements o {

    /* renamed from: b, reason: collision with root package name */
    public final RectF f98303b;

    /* renamed from: c, reason: collision with root package name */
    public GradientDrawable f98304c;

    /* renamed from: e, reason: collision with root package name */
    public Paint f98305e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f98306f;

    public b(Context context) {
        super(context);
        this.f98303b = new RectF();
        this.f98306f = false;
        a(context);
    }

    public final void a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f98304c = gradientDrawable;
        gradientDrawable.setColor(um.a.f88523b);
        this.f98304c.setShape(0);
        setBackgroundDrawable(this.f98304c);
        setGravity(17);
        setMaxLines(1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f98306f || this.f98305e == null) {
            return;
        }
        float height = getHeight() / 2.0f;
        canvas.drawRoundRect(this.f98303b, height, height, this.f98305e);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            float size = (View.MeasureSpec.getSize(i11) - getCompoundPaddingTop()) - getCompoundPaddingRight();
            if (getTextSize() != size) {
                setTextSize(0, size);
            }
        }
        if (mode == 1073741824 && getText() != null) {
            int size2 = (View.MeasureSpec.getSize(i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            float fMeasureText = getPaint().measureText(getText(), 0, getText().length());
            float f10 = size2;
            if (f10 < fMeasureText) {
                float textSize = (int) (getTextSize() * (f10 / fMeasureText));
                if (getTextSize() != textSize) {
                    setTextSize(0, textSize);
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        Paint paint;
        super.onSizeChanged(i10, i11, i12, i13);
        GradientDrawable gradientDrawable = this.f98304c;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(i11 / 2.0f);
        }
        if (!this.f98306f || (paint = this.f98305e) == null) {
            return;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f10 = 0.0f + strokeWidth;
        this.f98303b.set(f10, f10, i10 - strokeWidth, i11 - strokeWidth);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = this.f98304c;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i10);
        }
    }

    @Override // um.o
    public void setStyle(p pVar) {
        boolean zBooleanValue = pVar.isOutlined().booleanValue();
        this.f98306f = zBooleanValue;
        if (zBooleanValue) {
            Paint paint = new Paint(1);
            this.f98305e = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f98305e.setColor(pVar.getStrokeColor().intValue());
            this.f98305e.setStrokeWidth(pVar.getStrokeWidth(getContext()).floatValue());
        }
        setTextColor(pVar.getStrokeColor().intValue());
        setBackgroundColor(pVar.getFillColor().intValue());
        setTextSize(0, pVar.getFontSize(getContext()).floatValue());
        setTypeface(Typeface.create(Typeface.DEFAULT, pVar.getFontStyle().intValue()));
        setAlpha(pVar.getOpacity().floatValue());
        setPadding(pVar.getPaddingLeft(getContext()).intValue(), pVar.getPaddingTop(getContext()).intValue(), pVar.getPaddingRight(getContext()).intValue(), pVar.getPaddingBottom(getContext()).intValue());
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f98303b = new RectF();
        this.f98306f = false;
        a(context);
    }
}
