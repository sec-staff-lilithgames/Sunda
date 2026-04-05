package io.ktor.http.parsing.regex;

import com.ironsource.C3191e4;
import io.ktor.http.parsing.AnyOfGrammar;
import io.ktor.http.parsing.AtLeastOne;
import io.ktor.http.parsing.ComplexGrammar;
import io.ktor.http.parsing.Grammar;
import io.ktor.http.parsing.ManyGrammar;
import io.ktor.http.parsing.MaybeGrammar;
import io.ktor.http.parsing.NamedGrammar;
import io.ktor.http.parsing.OrGrammar;
import io.ktor.http.parsing.Parser;
import io.ktor.http.parsing.RangeGrammar;
import io.ktor.http.parsing.RawGrammar;
import io.ktor.http.parsing.SimpleGrammar;
import io.ktor.http.parsing.StringGrammar;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import sv.x;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RegexParserGeneratorKt {
    private static final void add(Map<String, List<Integer>> map, String str, int i10) {
        if (!map.containsKey(str)) {
            map.put(str, new ArrayList());
        }
        Integer numValueOf = Integer.valueOf(i10);
        List<Integer> list = map.get(str);
        e0.checkNotNull(list);
        list.add(numValueOf);
    }

    public static final Parser buildRegexParser(Grammar grammar) {
        e0.checkNotNullParameter(grammar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        return new RegexParser(new x(toRegex$default(grammar, linkedHashMap, 0, false, 6, null).getRegex()), linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final GrammarRegex toRegex(Grammar grammar, Map<String, List<Integer>> map, int i10, boolean z10) {
        char c10;
        if (grammar instanceof StringGrammar) {
            return new GrammarRegex(x.f86205e.escape(((StringGrammar) grammar).getValue()), 0, false, 6, null);
        }
        if (grammar instanceof RawGrammar) {
            return new GrammarRegex(((RawGrammar) grammar).getValue(), 0, false, 6, null);
        }
        if (grammar instanceof NamedGrammar) {
            NamedGrammar namedGrammar = (NamedGrammar) grammar;
            GrammarRegex regex$default = toRegex$default(namedGrammar.getGrammar(), map, i10 + 1, false, 4, null);
            add(map, namedGrammar.getName(), i10);
            return new GrammarRegex(regex$default.getRegex(), regex$default.getGroupsCount(), true);
        }
        if (grammar instanceof ComplexGrammar) {
            StringBuilder sb2 = new StringBuilder();
            int groupsCount = z10 ? i10 + 1 : i10;
            int i11 = 0;
            for (Object obj : ((ComplexGrammar) grammar).getGrammars()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    p0.throwIndexOverflow();
                }
                GrammarRegex regex = toRegex((Grammar) obj, map, groupsCount, true);
                if (i11 != 0 && (grammar instanceof OrGrammar)) {
                    sb2.append("|");
                }
                sb2.append(regex.getRegex());
                groupsCount += regex.getGroupsCount();
                i11 = i12;
            }
            int i13 = groupsCount - i10;
            if (z10) {
                i13--;
            }
            String string = sb2.toString();
            e0.checkNotNullExpressionValue(string, "expression.toString()");
            return new GrammarRegex(string, i13, z10);
        }
        if (grammar instanceof SimpleGrammar) {
            if (grammar instanceof MaybeGrammar) {
                c10 = '?';
            } else if (grammar instanceof ManyGrammar) {
                c10 = GMTDateParser.ANY;
            } else {
                if (!(grammar instanceof AtLeastOne)) {
                    throw new IllegalStateException(("Unsupported simple grammar element: " + grammar).toString());
                }
                c10 = '+';
            }
            GrammarRegex regex2 = toRegex(((SimpleGrammar) grammar).getGrammar(), map, i10, true);
            return new GrammarRegex(o2.q(new StringBuilder(), regex2.getRegex(), c10), regex2.getGroupsCount(), false, 4, null);
        }
        if (grammar instanceof AnyOfGrammar) {
            return new GrammarRegex(C3191e4.i.f36529d + x.f86205e.escape(((AnyOfGrammar) grammar).getValue()) + AbstractJsonLexerKt.END_LIST, 0, false, 6, null);
        }
        if (!(grammar instanceof RangeGrammar)) {
            throw new IllegalStateException(("Unsupported grammar element: " + grammar).toString());
        }
        StringBuilder sb3 = new StringBuilder(C3191e4.i.f36529d);
        RangeGrammar rangeGrammar = (RangeGrammar) grammar;
        sb3.append(rangeGrammar.getFrom());
        sb3.append('-');
        sb3.append(rangeGrammar.getTo());
        sb3.append(AbstractJsonLexerKt.END_LIST);
        return new GrammarRegex(sb3.toString(), 0, false, 6, null);
    }

    public static /* synthetic */ GrammarRegex toRegex$default(Grammar grammar, Map map, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return toRegex(grammar, map, i10, z10);
    }
}
