package io.ktor.client.plugins;

import io.ktor.client.statement.HttpResponse;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ServerResponseException extends ResponseException {
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerResponseException(HttpResponse response, String cachedResponseText) {
        super(response, cachedResponseText);
        e0.checkNotNullParameter(response, "response");
        e0.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        StringBuilder sb2 = new StringBuilder("Server error(");
        sb2.append(response.getCall().getRequest().getMethod().getValue());
        sb2.append(' ');
        sb2.append(response.getCall().getRequest().getUrl());
        sb2.append(": ");
        sb2.append(response.getStatus());
        sb2.append(". Text: \"");
        this.message = o2.q(sb2, cachedResponseText, AbstractJsonLexerKt.STRING);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @f
    public ServerResponseException(HttpResponse response) {
        this(response, "<no response text provided>");
        e0.checkNotNullParameter(response, "response");
    }
}
