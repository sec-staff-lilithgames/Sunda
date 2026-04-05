package v3;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f88956a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f88957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88958c;

    /* renamed from: d, reason: collision with root package name */
    public final int f88959d;

    /* renamed from: e, reason: collision with root package name */
    public final PrecomputedText.Params f88960e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f88961a;

        /* renamed from: c, reason: collision with root package name */
        public int f88963c = 1;

        /* renamed from: d, reason: collision with root package name */
        public int f88964d = 1;

        /* renamed from: b, reason: collision with root package name */
        public TextDirectionHeuristic f88962b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

        public a(TextPaint textPaint) {
            this.f88961a = textPaint;
        }

        public f build() {
            return new f(this.f88961a, this.f88962b, this.f88963c, this.f88964d);
        }

        public a setBreakStrategy(int i10) {
            this.f88963c = i10;
            return this;
        }

        public a setHyphenationFrequency(int i10) {
            this.f88964d = i10;
            return this;
        }

        public a setTextDirection(TextDirectionHeuristic textDirectionHeuristic) {
            this.f88962b = textDirectionHeuristic;
            return this;
        }
    }

    public f(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f88960e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
        } else {
            this.f88960e = null;
        }
        this.f88956a = textPaint;
        this.f88957b = textDirectionHeuristic;
        this.f88958c = i10;
        this.f88959d = i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return equalsWithoutTextDirection(fVar) && this.f88957b == fVar.getTextDirection();
    }

    public boolean equalsWithoutTextDirection(f fVar) {
        if (this.f88958c != fVar.getBreakStrategy() || this.f88959d != fVar.getHyphenationFrequency()) {
            return false;
        }
        TextPaint textPaint = this.f88956a;
        if (textPaint.getTextSize() == fVar.getTextPaint().getTextSize() && textPaint.getTextScaleX() == fVar.getTextPaint().getTextScaleX() && textPaint.getTextSkewX() == fVar.getTextPaint().getTextSkewX() && textPaint.getLetterSpacing() == fVar.getTextPaint().getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), fVar.getTextPaint().getFontFeatureSettings()) && textPaint.getFlags() == fVar.getTextPaint().getFlags() && textPaint.getTextLocales().equals(fVar.getTextPaint().getTextLocales())) {
            return textPaint.getTypeface() == null ? fVar.getTextPaint().getTypeface() == null : textPaint.getTypeface().equals(fVar.getTextPaint().getTypeface());
        }
        return false;
    }

    public int getBreakStrategy() {
        return this.f88958c;
    }

    public int getHyphenationFrequency() {
        return this.f88959d;
    }

    public TextDirectionHeuristic getTextDirection() {
        return this.f88957b;
    }

    public TextPaint getTextPaint() {
        return this.f88956a;
    }

    public int hashCode() {
        TextPaint textPaint = this.f88956a;
        return w3.d.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f88957b, Integer.valueOf(this.f88958c), Integer.valueOf(this.f88959d));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f88956a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f88957b);
        sb2.append(", breakStrategy=" + this.f88958c);
        sb2.append(", hyphenationFrequency=" + this.f88959d);
        sb2.append("}");
        return sb2.toString();
    }

    public f(PrecomputedText.Params params) {
        this.f88956a = params.getTextPaint();
        this.f88957b = params.getTextDirection();
        this.f88958c = params.getBreakStrategy();
        this.f88959d = params.getHyphenationFrequency();
        this.f88960e = Build.VERSION.SDK_INT < 29 ? null : params;
    }
}
