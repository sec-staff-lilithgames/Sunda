package j2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final String f69064b;

    public b(String fontFeatureSettings) {
        e0.checkNotNullParameter(fontFeatureSettings, "fontFeatureSettings");
        this.f69064b = fontFeatureSettings;
    }

    public final String getFontFeatureSettings() {
        return this.f69064b;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        e0.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f69064b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        e0.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f69064b);
    }
}
