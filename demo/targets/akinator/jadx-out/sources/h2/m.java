package h2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {
    public static final Rect getCharSequenceBounds(TextPaint textPaint, CharSequence text, int i10, int i11) {
        e0.checkNotNullParameter(textPaint, "<this>");
        e0.checkNotNullParameter(text, "text");
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            if (n.hasSpan(spanned, MetricAffectingSpan.class, i10, i11)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i10 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i10, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] spans = (MetricAffectingSpan[]) spanned.getSpans(i10, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    e0.checkNotNullExpressionValue(spans, "spans");
                    for (MetricAffectingSpan metricAffectingSpan : spans) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        l.getTextBounds(textPaint2, text, i10, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(text.toString(), i10, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i10 = iNextSpanTransition;
                }
                return rect;
            }
        }
        return getStringBounds(textPaint, text, i10, i11);
    }

    public static final Rect getStringBounds(Paint paint, CharSequence text, int i10, int i11) {
        e0.checkNotNullParameter(paint, "<this>");
        e0.checkNotNullParameter(text, "text");
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            l.getTextBounds(paint, text, i10, i11, rect);
            return rect;
        }
        paint.getTextBounds(text.toString(), i10, i11, rect);
        return rect;
    }
}
