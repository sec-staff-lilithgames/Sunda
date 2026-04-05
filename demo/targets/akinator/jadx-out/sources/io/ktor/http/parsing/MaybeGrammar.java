package io.ktor.http.parsing;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MaybeGrammar extends Grammar implements SimpleGrammar {
    private final Grammar grammar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaybeGrammar(Grammar grammar) {
        super(null);
        e0.checkNotNullParameter(grammar, "grammar");
        this.grammar = grammar;
    }

    @Override // io.ktor.http.parsing.SimpleGrammar
    public Grammar getGrammar() {
        return this.grammar;
    }
}
