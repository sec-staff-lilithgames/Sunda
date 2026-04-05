package io.ktor.http;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InvalidCookieDateException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidCookieDateException(String data, String reason) {
        super("Failed to parse date string: \"" + data + "\". Reason: \"" + reason + AbstractJsonLexerKt.STRING);
        e0.checkNotNullParameter(data, "data");
        e0.checkNotNullParameter(reason, "reason");
    }
}
