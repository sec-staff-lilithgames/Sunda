package io.ktor.util.internal;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class Symbol {
    private final String symbol;

    public Symbol(String symbol) {
        e0.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public String toString() {
        return this.symbol;
    }
}
