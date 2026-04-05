package io.ktor.http.parsing;

import io.ktor.util.date.GMTDateParser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class PrimitivesKt {
    public static final Grammar getAlpha() {
        return ParserDslKt.or(ParserDslKt.to('a', GMTDateParser.ZONE), ParserDslKt.to('A', 'Z'));
    }

    public static final Grammar getAlphaDigit() {
        return ParserDslKt.or(getAlpha(), getDigit());
    }

    public static final Grammar getAlphas() {
        return ParserDslKt.atLeastOne(getAlpha());
    }

    public static final RawGrammar getDigit() {
        return new RawGrammar("\\d");
    }

    public static final Grammar getDigits() {
        return ParserDslKt.atLeastOne(getDigit());
    }

    public static final Grammar getHex() {
        return ParserDslKt.or(ParserDslKt.or(getDigit(), ParserDslKt.to('A', 'F')), ParserDslKt.to('a', 'f'));
    }

    public static final Grammar getLowAlpha() {
        return ParserDslKt.to('a', GMTDateParser.ZONE);
    }
}
