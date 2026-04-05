package io.ktor.client.plugins;

import io.ktor.client.statement.HttpResponse;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ResponseException extends IllegalStateException {
    private final transient HttpResponse response;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseException(HttpResponse response, String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + AbstractJsonLexerKt.STRING);
        e0.checkNotNullParameter(response, "response");
        e0.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        this.response = response;
    }

    public final HttpResponse getResponse() {
        return this.response;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @f
    public ResponseException(HttpResponse response) {
        this(response, "<no response text provided>");
        e0.checkNotNullParameter(response, "response");
    }
}
