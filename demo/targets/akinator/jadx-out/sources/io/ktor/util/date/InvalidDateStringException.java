package io.ktor.util.date;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InvalidDateStringException extends IllegalStateException {
    public InvalidDateStringException(String data, int i10, String pattern) {
        e0.checkNotNullParameter(data, "data");
        e0.checkNotNullParameter(pattern, "pattern");
        StringBuilder sb2 = new StringBuilder("Failed to parse date string: \"");
        sb2.append(data);
        sb2.append("\" at index ");
        sb2.append(i10);
        sb2.append(". Pattern: \"");
        super(o2.q(sb2, pattern, AbstractJsonLexerKt.STRING));
    }
}
