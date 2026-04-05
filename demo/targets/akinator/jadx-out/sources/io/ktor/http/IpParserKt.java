package io.ktor.http;

import com.ironsource.C3191e4;
import io.ktor.http.parsing.Grammar;
import io.ktor.http.parsing.Parser;
import io.ktor.http.parsing.ParserDslKt;
import io.ktor.http.parsing.PrimitivesKt;
import io.ktor.http.parsing.regex.RegexParserGeneratorKt;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class IpParserKt {
    private static final Parser IP_PARSER;
    private static final Grammar IPv4address;
    private static final Grammar IPv6address;

    static {
        Grammar grammarThen = ParserDslKt.then(ParserDslKt.then(ParserDslKt.then(ParserDslKt.then(ParserDslKt.then(ParserDslKt.then(PrimitivesKt.getDigits(), "."), PrimitivesKt.getDigits()), "."), PrimitivesKt.getDigits()), "."), PrimitivesKt.getDigits());
        IPv4address = grammarThen;
        Grammar grammarThen2 = ParserDslKt.then(ParserDslKt.then(C3191e4.i.f36529d, ParserDslKt.atLeastOne(ParserDslKt.or(PrimitivesKt.getHex(), ":"))), C3191e4.i.f36531e);
        IPv6address = grammarThen2;
        IP_PARSER = RegexParserGeneratorKt.buildRegexParser(ParserDslKt.or(grammarThen, grammarThen2));
    }

    public static final boolean hostIsIp(String host) {
        e0.checkNotNullParameter(host, "host");
        return IP_PARSER.match(host);
    }
}
