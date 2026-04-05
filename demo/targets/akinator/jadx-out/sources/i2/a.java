package i2;

import java.util.Locale;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f59370a;

    public a(Locale locale, CharSequence text) {
        e0.checkNotNullParameter(locale, "locale");
        e0.checkNotNullParameter(text, "text");
        this.f59370a = new b(text, 0, text.length(), locale);
    }

    public final int getWordEnd(int i10) {
        b bVar = this.f59370a;
        int punctuationEnd = bVar.isAfterPunctuation(bVar.nextBoundary(i10)) ? bVar.getPunctuationEnd(i10) : bVar.getNextWordEndOnTwoWordBoundary(i10);
        return punctuationEnd == -1 ? i10 : punctuationEnd;
    }

    public final int getWordStart(int i10) {
        b bVar = this.f59370a;
        int punctuationBeginning = bVar.isOnPunctuation(bVar.prevBoundary(i10)) ? bVar.getPunctuationBeginning(i10) : bVar.getPrevWordBeginningOnTwoWordsBoundary(i10);
        return punctuationBeginning == -1 ? i10 : punctuationBeginning;
    }
}
