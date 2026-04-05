package io.ktor.http.parsing;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class NamedGrammar extends Grammar {
    private final Grammar grammar;
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NamedGrammar(String name, Grammar grammar) {
        super(null);
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(grammar, "grammar");
        this.name = name;
        this.grammar = grammar;
    }

    public final Grammar getGrammar() {
        return this.grammar;
    }

    public final String getName() {
        return this.name;
    }
}
