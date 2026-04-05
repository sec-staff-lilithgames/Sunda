package io.ktor.http.parsing;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kv.a;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class GrammarBuilder {
    private final List<Grammar> grammars = new ArrayList();

    public final Grammar build() {
        return this.grammars.size() == 1 ? (Grammar) y0.first((List) this.grammars) : new SequenceGrammar(this.grammars);
    }

    public final GrammarBuilder then(Grammar grammar) {
        e0.checkNotNullParameter(grammar, "grammar");
        this.grammars.add(grammar);
        return this;
    }

    public final void unaryPlus(a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        this.grammars.add(aVar.invoke());
    }

    public final GrammarBuilder then(String value) {
        e0.checkNotNullParameter(value, "value");
        this.grammars.add(new StringGrammar(value));
        return this;
    }

    public final void unaryPlus(Grammar grammar) {
        e0.checkNotNullParameter(grammar, "<this>");
        this.grammars.add(grammar);
    }

    public final void unaryPlus(String str) {
        e0.checkNotNullParameter(str, "<this>");
        this.grammars.add(new StringGrammar(str));
    }
}
