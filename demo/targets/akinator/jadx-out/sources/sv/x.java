package sv;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p0.o2;
import qm.zMPW.GalEuEfxjome;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f86205e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f86206b;

    /* renamed from: c, reason: collision with root package name */
    public Set f86207c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static final int access$ensureUnicodeCase(a aVar, int i10) {
            aVar.getClass();
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        public final String escape(String literal) {
            kotlin.jvm.internal.e0.checkNotNullParameter(literal, "literal");
            String strQuote = Pattern.quote(literal);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strQuote, "quote(...)");
            return strQuote;
        }

        public final String escapeReplacement(String literal) {
            kotlin.jvm.internal.e0.checkNotNullParameter(literal, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(literal);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strQuoteReplacement, "quoteReplacement(...)");
            return strQuoteReplacement;
        }

        public final x fromLiteral(String literal) {
            kotlin.jvm.internal.e0.checkNotNullParameter(literal, "literal");
            return new x(literal, b0.f86123e);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements kv.l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f86208b;

        public b(int i10) {
            this.f86208b = i10;
        }

        @Override // kv.l
        public final Boolean invoke(b0 b0Var) {
            b0 b0Var2 = b0Var;
            return Boolean.valueOf((b0Var2.getMask() & this.f86208b) == b0Var2.getValue());
        }
    }

    public x(Pattern nativePattern) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativePattern, "nativePattern");
        this.f86206b = nativePattern;
    }

    public static /* synthetic */ t find$default(x xVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return xVar.find(charSequence, i10);
    }

    public static /* synthetic */ rv.t findAll$default(x xVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return xVar.findAll(charSequence, i10);
    }

    public static /* synthetic */ List split$default(x xVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return xVar.split(charSequence, i10);
    }

    public static /* synthetic */ rv.t splitToSequence$default(x xVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return xVar.splitToSequence(charSequence, i10);
    }

    public final boolean containsMatchIn(CharSequence input) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        return this.f86206b.matcher(input).find();
    }

    public final t find(CharSequence input, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        Matcher matcher = this.f86206b.matcher(input);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(matcher, "matcher(...)");
        return a0.access$findNext(matcher, i10, input);
    }

    public final rv.t findAll(CharSequence input, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        if (i10 >= 0 && i10 <= input.length()) {
            return rv.y.generateSequence((kv.a) new fw.o(this, input, i10), (kv.l) y.f86209b);
        }
        StringBuilder sbT = o2.t(i10, "Start index out of bounds: ", ", input length: ");
        sbT.append(input.length());
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final String getPattern() {
        String strPattern = this.f86206b.pattern();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strPattern, "pattern(...)");
        return strPattern;
    }

    public final t matchAt(CharSequence input, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        Matcher matcherRegion = this.f86206b.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        kotlin.jvm.internal.e0.checkNotNull(matcherRegion);
        return new w(matcherRegion, input);
    }

    public final t matchEntire(CharSequence input) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        Matcher matcher = this.f86206b.matcher(input);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(matcher, "matcher(...)");
        return a0.access$matchEntire(matcher, input);
    }

    public final boolean matches(CharSequence input) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        return this.f86206b.matcher(input).matches();
    }

    public final boolean matchesAt(CharSequence input, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        return this.f86206b.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length()).lookingAt();
    }

    public final String replace(CharSequence input, String replacement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        String strReplaceAll = this.f86206b.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String replaceFirst(CharSequence input, String replacement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        String strReplaceFirst = this.f86206b.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List<String> split(CharSequence input, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        n0.requireNonNegativeLimit(i10);
        Matcher matcher = this.f86206b.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return uu.o0.listOf(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? qv.v.coerceAtMost(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final rv.t splitToSequence(CharSequence input, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        n0.requireNonNegativeLimit(i10);
        return rv.w.sequence(new z(this, input, i10, null));
    }

    public final Pattern toPattern() {
        return this.f86206b;
    }

    public String toString() {
        String string = this.f86206b.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final Set<b0> getOptions() {
        Set<b0> set = this.f86207c;
        if (set != null) {
            return set;
        }
        int iFlags = this.f86206b.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(b0.class);
        kotlin.jvm.internal.e0.checkNotNull(enumSetAllOf);
        v0.retainAll(enumSetAllOf, new b(iFlags));
        Set<b0> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setUnmodifiableSet, GalEuEfxjome.hFVsz);
        this.f86207c = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    public final String replace(CharSequence input, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        int iIntValue = 0;
        t tVarFind$default = find$default(this, input, 0, 2, null);
        if (tVarFind$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, iIntValue, tVarFind$default.getRange().getStart().intValue());
            sb2.append((CharSequence) transform.invoke(tVarFind$default));
            iIntValue = tVarFind$default.getRange().getEndInclusive().intValue() + 1;
            tVarFind$default = tVarFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (tVarFind$default != null);
        if (iIntValue < length) {
            sb2.append(input, iIntValue, length);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(String pattern) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(String pattern, b0 option) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pattern, "pattern");
        kotlin.jvm.internal.e0.checkNotNullParameter(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, a.access$ensureUnicodeCase(f86205e, option.getValue()));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(String pattern, Set<? extends b0> options) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pattern, "pattern");
        kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
        Pattern patternCompile = Pattern.compile(pattern, a.access$ensureUnicodeCase(f86205e, a0.access$toInt(options)));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
