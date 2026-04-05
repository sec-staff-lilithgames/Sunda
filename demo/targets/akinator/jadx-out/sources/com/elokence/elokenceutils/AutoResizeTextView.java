package com.elokence.elokenceutils;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.shared.util.APSSharedUtil;
import java.lang.reflect.InvocationTargetException;
import kb.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AutoResizeTextView extends AppCompatTextView {

    /* renamed from: b, reason: collision with root package name */
    public boolean f21829b;

    /* renamed from: c, reason: collision with root package name */
    public float f21830c;

    /* renamed from: e, reason: collision with root package name */
    public float f21831e;

    /* renamed from: f, reason: collision with root package name */
    public float f21832f;

    /* renamed from: g, reason: collision with root package name */
    public float f21833g;

    /* renamed from: h, reason: collision with root package name */
    public float f21834h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21835i;

    public AutoResizeTextView(Context context) {
        this(context, null);
    }

    public boolean getAddEllipsis() {
        return this.f21835i;
    }

    public float getMaxTextSize() {
        return this.f21831e;
    }

    public float getMinTextSize() {
        return this.f21832f;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (z10 || this.f21829b) {
            resizeText(((i12 - i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i13 - i11) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f21829b = true;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f21829b = true;
        resetTextSize();
    }

    public void resetTextSize() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        float f10 = this.f21830c;
        if (f10 > 0.0f) {
            super.setTextSize(0, f10);
            this.f21831e = this.f21830c;
        }
    }

    public void resizeText() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        resizeText((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingBottom()) - getPaddingTop());
    }

    public void setAddEllipsis(boolean z10) {
        this.f21835i = z10;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.f21833g = f11;
        this.f21834h = f10;
    }

    public void setMaxTextSize(float f10) {
        this.f21831e = f10;
        requestLayout();
        invalidate();
    }

    public void setMinTextSize(float f10) {
        this.f21832f = f10;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        super.setTextSize(f10);
        this.f21830c = getTextSize();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21829b = false;
        this.f21831e = 0.0f;
        this.f21832f = 10.0f;
        this.f21833g = 1.0f;
        this.f21834h = 0.0f;
        this.f21835i = true;
        this.f21830c = getTextSize();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i10, float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.setTextSize(i10, f10);
        this.f21830c = getTextSize();
    }

    public void resizeText(int i10, int i11) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i11 <= 0 || i10 <= 0 || this.f21830c == 0.0f) {
            return;
        }
        if (getTransformationMethod() != null) {
            text = getTransformationMethod().getTransformation(text, this);
        }
        CharSequence charSequence = text;
        TextPaint paint = getPaint();
        paint.getTextSize();
        float f10 = this.f21831e;
        float fMin = f10 > 0.0f ? Math.min(this.f21830c, f10) : this.f21830c;
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize(fMin);
        int height = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, this.f21833g, this.f21834h, true).getHeight();
        while (height > i11) {
            float f11 = this.f21832f;
            if (fMin <= f11) {
                break;
            }
            fMin = Math.max(fMin - 2.0f, f11);
            TextPaint textPaint2 = new TextPaint(paint);
            textPaint2.setTextSize(fMin);
            height = new StaticLayout(charSequence, textPaint2, i10, Layout.Alignment.ALIGN_NORMAL, this.f21833g, this.f21834h, true).getHeight();
        }
        if (this.f21835i && fMin == this.f21832f && height > i11) {
            StaticLayout staticLayout = new StaticLayout(charSequence, new TextPaint(paint), i10, Layout.Alignment.ALIGN_NORMAL, this.f21833g, this.f21834h, false);
            if (staticLayout.getLineCount() > 0) {
                int lineForVertical = staticLayout.getLineForVertical(i11) - 1;
                if (lineForVertical < 0) {
                    setText("");
                } else {
                    int lineStart = staticLayout.getLineStart(lineForVertical);
                    int lineEnd = staticLayout.getLineEnd(lineForVertical);
                    float lineWidth = staticLayout.getLineWidth(lineForVertical);
                    float fMeasureText = paint.measureText(APSSharedUtil.TRUNCATE_SEPARATOR);
                    while (i10 < lineWidth + fMeasureText) {
                        int i12 = lineEnd - 1;
                        try {
                            float fMeasureText2 = paint.measureText(charSequence.subSequence(lineStart, lineEnd).toString());
                            lineEnd = i12;
                            lineWidth = fMeasureText2;
                        } catch (IndexOutOfBoundsException unused) {
                            setText(charSequence);
                        }
                    }
                    if (charSequence != null && lineEnd > 0) {
                        setText(((Object) charSequence.subSequence(0, lineEnd)) + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                }
            }
        }
        setTextSize(0, fMin);
        setLineSpacing(this.f21834h, this.f21833g);
        this.f21829b = false;
    }

    public void setOnResizeListener(a aVar) {
    }
}
