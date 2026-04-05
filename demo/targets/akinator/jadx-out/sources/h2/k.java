package h2;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k {
    public static final boolean access$shouldIncreaseMaxIntrinsic(float f10, CharSequence charSequence, TextPaint textPaint) {
        if (f10 == 0.0f || !(charSequence instanceof Spanned)) {
            return false;
        }
        if (textPaint.getLetterSpacing() != 0.0f) {
            return true;
        }
        Spanned spanned = (Spanned) charSequence;
        return n.hasSpan(spanned, j2.d.class) || n.hasSpan(spanned, j2.c.class);
    }

    public static final float minIntrinsicWidth(CharSequence text, TextPaint paint) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(paint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(paint.getTextLocale());
        int i10 = 0;
        lineInstance.setText(new b(text, 0, text.length()));
        PriorityQueue<tu.v> priorityQueue = new PriorityQueue(10, new af.i(22));
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new tu.v(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                tu.v vVar = (tu.v) priorityQueue.peek();
                if (vVar != null && ((Number) vVar.getSecond()).intValue() - ((Number) vVar.getFirst()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new tu.v(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        float fMax = 0.0f;
        for (tu.v vVar2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(text, ((Number) vVar2.component1()).intValue(), ((Number) vVar2.component2()).intValue(), paint));
        }
        return fMax;
    }
}
