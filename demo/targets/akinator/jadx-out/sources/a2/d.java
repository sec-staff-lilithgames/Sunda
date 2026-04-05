package a2;

import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f3486d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static d f3487e;

    /* renamed from: c, reason: collision with root package name */
    public final BreakIterator f3488c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final d getInstance(Locale locale) {
            kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
            if (d.f3487e == null) {
                d.f3487e = new d(locale, null);
            }
            d dVar = d.f3487e;
            if (dVar != null) {
                return dVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
        }
    }

    public d(Locale locale, kotlin.jvm.internal.u uVar) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(locale)");
        this.f3488c = characterInstance;
    }

    @Override // a2.c, a2.h
    public int[] following(int i10) {
        int length = b().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f3488c;
            if (breakIterator == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f3488c;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i10);
                if (iFollowing == -1) {
                    return null;
                }
                return a(i10, iFollowing);
            }
            BreakIterator breakIterator3 = this.f3488c;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.following(i10);
        } while (i10 != -1);
        return null;
    }

    @Override // a2.c
    public void initialize(String text) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        super.initialize(text);
        BreakIterator breakIterator = this.f3488c;
        if (breakIterator == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
            breakIterator = null;
        }
        breakIterator.setText(text);
    }

    @Override // a2.c, a2.h
    public int[] preceding(int i10) {
        int length = b().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        do {
            BreakIterator breakIterator = this.f3488c;
            if (breakIterator == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f3488c;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i10);
                if (iPreceding == -1) {
                    return null;
                }
                return a(iPreceding, i10);
            }
            BreakIterator breakIterator3 = this.f3488c;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.preceding(i10);
        } while (i10 != -1);
        return null;
    }
}
