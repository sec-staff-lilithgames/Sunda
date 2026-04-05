package io.ktor.http.parsing;

import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.k0;
import sv.x;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DebugKt {
    public static final void printDebug(Grammar grammar, int i10) {
        e0.checkNotNullParameter(grammar, "<this>");
        if (grammar instanceof StringGrammar) {
            printlnWithOffset(i10, "STRING[" + x.f86205e.escape(((StringGrammar) grammar).getValue()) + AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (grammar instanceof RawGrammar) {
            printlnWithOffset(i10, "STRING[" + ((RawGrammar) grammar).getValue() + AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (grammar instanceof NamedGrammar) {
            StringBuilder sb2 = new StringBuilder("NAMED[");
            NamedGrammar namedGrammar = (NamedGrammar) grammar;
            sb2.append(namedGrammar.getName());
            sb2.append(AbstractJsonLexerKt.END_LIST);
            printlnWithOffset(i10, sb2.toString());
            printDebug(namedGrammar.getGrammar(), i10 + 2);
            return;
        }
        if (grammar instanceof SequenceGrammar) {
            printlnWithOffset(i10, "SEQUENCE");
            Iterator<T> it = ((SequenceGrammar) grammar).getGrammars().iterator();
            while (it.hasNext()) {
                printDebug((Grammar) it.next(), i10 + 2);
            }
            return;
        }
        if (grammar instanceof OrGrammar) {
            printlnWithOffset(i10, "OR");
            Iterator<T> it2 = ((OrGrammar) grammar).getGrammars().iterator();
            while (it2.hasNext()) {
                printDebug((Grammar) it2.next(), i10 + 2);
            }
            return;
        }
        if (grammar instanceof MaybeGrammar) {
            printlnWithOffset(i10, "MAYBE");
            printDebug(((MaybeGrammar) grammar).getGrammar(), i10 + 2);
            return;
        }
        if (grammar instanceof ManyGrammar) {
            printlnWithOffset(i10, "MANY");
            printDebug(((ManyGrammar) grammar).getGrammar(), i10 + 2);
            return;
        }
        if (grammar instanceof AtLeastOne) {
            printlnWithOffset(i10, "MANY_NOT_EMPTY");
            printDebug(((AtLeastOne) grammar).getGrammar(), i10 + 2);
            return;
        }
        if (grammar instanceof AnyOfGrammar) {
            printlnWithOffset(i10, "ANY_OF[" + x.f86205e.escape(((AnyOfGrammar) grammar).getValue()) + AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (!(grammar instanceof RangeGrammar)) {
            throw new t();
        }
        StringBuilder sb3 = new StringBuilder("RANGE[");
        RangeGrammar rangeGrammar = (RangeGrammar) grammar;
        sb3.append(rangeGrammar.getFrom());
        sb3.append('-');
        sb3.append(rangeGrammar.getTo());
        sb3.append(AbstractJsonLexerKt.END_LIST);
        printlnWithOffset(i10, sb3.toString());
    }

    public static /* synthetic */ void printDebug$default(Grammar grammar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        printDebug(grammar, i10);
    }

    private static final void printlnWithOffset(int i10, Object obj) {
        System.out.println((Object) (k0.repeat(" ", i10) + (i10 / 2) + ": " + obj));
    }
}
