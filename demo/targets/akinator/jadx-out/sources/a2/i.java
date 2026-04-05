package a2;

import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f3615d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static i f3616e;

    /* renamed from: c, reason: collision with root package name */
    public final BreakIterator f3617c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final i getInstance(Locale locale) {
            kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
            if (i.f3616e == null) {
                i.f3616e = new i(locale, null);
            }
            i iVar = i.f3616e;
            if (iVar != null) {
                return iVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
        }
    }

    public i(Locale locale, kotlin.jvm.internal.u uVar) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
        this.f3617c = wordInstance;
    }

    public final boolean c(int i10) {
        if (i10 <= 0 || !d(i10 - 1)) {
            return false;
        }
        return i10 == b().length() || !d(i10);
    }

    public final boolean d(int i10) {
        if (i10 < 0 || i10 >= b().length()) {
            return false;
        }
        return Character.isLetterOrDigit(b().codePointAt(i10));
    }

    @Override // a2.c, a2.h
    public int[] following(int i10) {
        if (b().length() > 0 && i10 < b().length()) {
            if (i10 < 0) {
                i10 = 0;
            }
            while (!d(i10) && (!d(i10) || (i10 != 0 && d(i10 - 1)))) {
                BreakIterator breakIterator = this.f3617c;
                if (breakIterator == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                i10 = breakIterator.following(i10);
                if (i10 == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.f3617c;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int iFollowing = breakIterator2.following(i10);
            if (iFollowing != -1 && c(iFollowing)) {
                return a(i10, iFollowing);
            }
        }
        return null;
    }

    @Override // a2.c
    public void initialize(String text) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        super.initialize(text);
        BreakIterator breakIterator = this.f3617c;
        if (breakIterator == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
            breakIterator = null;
        }
        breakIterator.setText(text);
    }

    @Override // a2.c, a2.h
    public int[] preceding(int i10) {
        int length = b().length();
        if (length > 0 && i10 > 0) {
            if (i10 > length) {
                i10 = length;
            }
            while (i10 > 0 && !d(i10 - 1) && !c(i10)) {
                BreakIterator breakIterator = this.f3617c;
                if (breakIterator == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                i10 = breakIterator.preceding(i10);
                if (i10 == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.f3617c;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int iPreceding = breakIterator2.preceding(i10);
            if (iPreceding != -1 && d(iPreceding) && (iPreceding == 0 || !d(iPreceding - 1))) {
                return a(iPreceding, i10);
            }
        }
        return null;
    }
}
