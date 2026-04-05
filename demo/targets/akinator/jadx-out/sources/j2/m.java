package j2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends MetricAffectingSpan {

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f69097b;

    public m(Typeface typeface) {
        e0.checkNotNullParameter(typeface, "typeface");
        this.f69097b = typeface;
    }

    public final Typeface getTypeface() {
        return this.f69097b;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds2) {
        e0.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(this.f69097b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        e0.checkNotNullParameter(paint, "paint");
        paint.setTypeface(this.f69097b);
    }
}
