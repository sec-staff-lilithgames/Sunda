package io.ktor.client.statement;

import io.ktor.client.call.HttpClientCall;
import io.ktor.http.HttpMessage;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.InternalAPI;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class HttpResponse implements HttpMessage, CoroutineScope {
    public abstract HttpClientCall getCall();

    public abstract ByteReadChannel getContent();

    public abstract GMTDate getRequestTime();

    public abstract GMTDate getResponseTime();

    public abstract HttpStatusCode getStatus();

    public abstract HttpProtocolVersion getVersion();

    public String toString() {
        return "HttpResponse[" + HttpResponseKt.getRequest(this).getUrl() + ", " + getStatus() + AbstractJsonLexerKt.END_LIST;
    }

    @InternalAPI
    public static /* synthetic */ void getContent$annotations() {
    }
}
