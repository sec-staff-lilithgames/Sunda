package j2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f69065b;

    public c(float f10) {
        this.f69065b = f10;
    }

    public final float getLetterSpacing() {
        return this.f69065b;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        e0.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f69065b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        e0.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f69065b);
    }
}
