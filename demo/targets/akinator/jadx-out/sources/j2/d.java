package j2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f69066b;

    public d(float f10) {
        this.f69066b = f10;
    }

    public final float getLetterSpacing() {
        return this.f69066b;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        e0.checkNotNullParameter(textPaint, "textPaint");
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f69066b / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        e0.checkNotNullParameter(textPaint, "textPaint");
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f69066b / textScaleX);
    }
}
