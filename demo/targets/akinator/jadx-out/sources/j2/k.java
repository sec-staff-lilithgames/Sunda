package j2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f69094b;

    public k(float f10) {
        this.f69094b = f10;
    }

    public final float getSkewX() {
        return this.f69094b;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        e0.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f69094b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        e0.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f69094b);
    }
}
