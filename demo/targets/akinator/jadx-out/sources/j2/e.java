package j2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements LineHeightSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f69067b;

    public e(float f10) {
        this.f69067b = f10;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        if (g.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = iCeil;
        fontMetricsInt.ascent = iCeil - ((int) Math.ceil(this.f69067b));
    }

    public final float getLineHeight() {
        return this.f69067b;
    }
}
