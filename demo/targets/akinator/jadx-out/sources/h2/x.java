package h2;

import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.v f58693a = new tu.v(0, 0);

    public static final tu.v access$getLineHeightPaddings(w wVar) {
        j2.f[] lineHeightStyleSpans;
        if (wVar.getText() instanceof Spanned) {
            lineHeightStyleSpans = (j2.f[]) ((Spanned) wVar.getText()).getSpans(0, wVar.getText().length(), j2.f.class);
            e0.checkNotNullExpressionValue(lineHeightStyleSpans, "lineHeightStyleSpans");
            if (lineHeightStyleSpans.length == 0) {
                lineHeightStyleSpans = new j2.f[0];
            }
        } else {
            lineHeightStyleSpans = new j2.f[0];
        }
        int iMax = 0;
        int iMax2 = 0;
        for (j2.f fVar : lineHeightStyleSpans) {
            if (fVar.getFirstAscentDiff() < 0) {
                iMax = Math.max(iMax, Math.abs(fVar.getFirstAscentDiff()));
            }
            if (fVar.getLastDescentDiff() < 0) {
                iMax2 = Math.max(iMax, Math.abs(fVar.getLastDescentDiff()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f58693a : new tu.v(Integer.valueOf(iMax), Integer.valueOf(iMax2));
    }

    public static final tu.v access$getVerticalPaddings(w wVar) {
        if (wVar.getIncludePadding() || wVar.isFallbackLinespacingApplied$ui_text_release()) {
            return new tu.v(0, 0);
        }
        TextPaint paint = wVar.getLayout().getPaint();
        CharSequence text = wVar.getLayout().getText();
        e0.checkNotNullExpressionValue(paint, "paint");
        e0.checkNotNullExpressionValue(text, "text");
        Rect charSequenceBounds = m.getCharSequenceBounds(paint, text, wVar.getLayout().getLineStart(0), wVar.getLayout().getLineEnd(0));
        int lineAscent = wVar.getLayout().getLineAscent(0);
        int i10 = charSequenceBounds.top;
        int topPadding = i10 < lineAscent ? lineAscent - i10 : wVar.getLayout().getTopPadding();
        if (wVar.getLineCount() != 1) {
            int lineCount = wVar.getLayout().getLineCount() - 1;
            charSequenceBounds = m.getCharSequenceBounds(paint, text, wVar.getLayout().getLineStart(lineCount), wVar.getLayout().getLineEnd(lineCount));
        }
        int lineDescent = wVar.getLayout().getLineDescent(wVar.getLayout().getLineCount() - 1);
        int i11 = charSequenceBounds.bottom;
        int bottomPadding = i11 > lineDescent ? i11 - lineDescent : wVar.getLayout().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f58693a : new tu.v(Integer.valueOf(topPadding), Integer.valueOf(bottomPadding));
    }

    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i10) {
        if (i10 == 0) {
            TextDirectionHeuristic LTR = TextDirectionHeuristics.LTR;
            e0.checkNotNullExpressionValue(LTR, "LTR");
            return LTR;
        }
        if (i10 == 1) {
            TextDirectionHeuristic RTL = TextDirectionHeuristics.RTL;
            e0.checkNotNullExpressionValue(RTL, "RTL");
            return RTL;
        }
        if (i10 == 2) {
            TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            e0.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR;
        }
        if (i10 == 3) {
            TextDirectionHeuristic FIRSTSTRONG_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            e0.checkNotNullExpressionValue(FIRSTSTRONG_RTL, "FIRSTSTRONG_RTL");
            return FIRSTSTRONG_RTL;
        }
        if (i10 == 4) {
            TextDirectionHeuristic ANYRTL_LTR = TextDirectionHeuristics.ANYRTL_LTR;
            e0.checkNotNullExpressionValue(ANYRTL_LTR, "ANYRTL_LTR");
            return ANYRTL_LTR;
        }
        if (i10 != 5) {
            TextDirectionHeuristic FIRSTSTRONG_LTR2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            e0.checkNotNullExpressionValue(FIRSTSTRONG_LTR2, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR2;
        }
        TextDirectionHeuristic LOCALE = TextDirectionHeuristics.LOCALE;
        e0.checkNotNullExpressionValue(LOCALE, "LOCALE");
        return LOCALE;
    }
}
