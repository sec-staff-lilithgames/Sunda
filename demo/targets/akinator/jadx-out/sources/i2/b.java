package i2;

import e3.g;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f59371e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f59372a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59373b;

    /* renamed from: c, reason: collision with root package name */
    public final int f59374c;

    /* renamed from: d, reason: collision with root package name */
    public final BreakIterator f59375d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final boolean isPunctuation$ui_text_release(int i10) {
            int type = Character.getType(i10);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public b(CharSequence charSequence, int i10, int i11, Locale locale) {
        e0.checkNotNullParameter(charSequence, "charSequence");
        this.f59372a = charSequence;
        if (i10 < 0 || i10 > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i11 < 0 || i11 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        e0.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
        this.f59375d = wordInstance;
        this.f59373b = Math.max(0, i10 - 50);
        this.f59374c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new h2.b(charSequence, i10, i11));
    }

    public final void a(int i10) {
        int i11 = this.f59373b;
        int i12 = this.f59374c;
        if (i10 > i12 || i11 > i10) {
            throw new IllegalArgumentException(g.m(i.f(i10, i11, "Invalid offset: ", ". Valid range is [", " , "), i12, AbstractJsonLexerKt.END_LIST).toString());
        }
    }

    public final boolean b(int i10) {
        return i10 <= this.f59374c && this.f59373b + 1 <= i10 && Character.isLetterOrDigit(Character.codePointBefore(this.f59372a, i10));
    }

    public final boolean c(int i10) {
        return i10 < this.f59374c && this.f59373b <= i10 && Character.isLetterOrDigit(Character.codePointAt(this.f59372a, i10));
    }

    public final int getNextWordEndOnTwoWordBoundary(int i10) {
        a(i10);
        boolean zB = b(i10);
        BreakIterator breakIterator = this.f59375d;
        if (zB) {
            return (!breakIterator.isBoundary(i10) || c(i10)) ? breakIterator.following(i10) : i10;
        }
        if (c(i10)) {
            return breakIterator.following(i10);
        }
        return -1;
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i10) {
        a(i10);
        boolean zC = c(i10);
        BreakIterator breakIterator = this.f59375d;
        if (zC) {
            return (!breakIterator.isBoundary(i10) || b(i10)) ? breakIterator.preceding(i10) : i10;
        }
        if (b(i10)) {
            return breakIterator.preceding(i10);
        }
        return -1;
    }

    public final int getPunctuationBeginning(int i10) {
        a(i10);
        while (i10 != -1) {
            if (isOnPunctuation(i10) && !isAfterPunctuation(i10)) {
                return i10;
            }
            i10 = prevBoundary(i10);
        }
        return i10;
    }

    public final int getPunctuationEnd(int i10) {
        a(i10);
        while (i10 != -1) {
            if (!isOnPunctuation(i10) && isAfterPunctuation(i10)) {
                return i10;
            }
            i10 = nextBoundary(i10);
        }
        return i10;
    }

    public final boolean isAfterPunctuation(int i10) {
        int i11 = this.f59373b + 1;
        if (i10 > this.f59374c || i11 > i10) {
            return false;
        }
        return f59371e.isPunctuation$ui_text_release(Character.codePointBefore(this.f59372a, i10));
    }

    public final boolean isOnPunctuation(int i10) {
        if (i10 >= this.f59374c || this.f59373b > i10) {
            return false;
        }
        return f59371e.isPunctuation$ui_text_release(Character.codePointAt(this.f59372a, i10));
    }

    public final int nextBoundary(int i10) {
        a(i10);
        return this.f59375d.following(i10);
    }

    public final int prevBoundary(int i10) {
        a(i10);
        return this.f59375d.preceding(i10);
    }
}
