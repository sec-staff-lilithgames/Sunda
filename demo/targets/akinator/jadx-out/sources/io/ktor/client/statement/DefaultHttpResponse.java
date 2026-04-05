package io.ktor.client.statement;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpResponseData;
import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.InternalAPI;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.internal.e0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalAPI
/* loaded from: classes7.dex */
public final class DefaultHttpResponse extends HttpResponse {
    private final HttpClientCall call;
    private final ByteReadChannel content;
    private final m coroutineContext;
    private final Headers headers;
    private final GMTDate requestTime;
    private final GMTDate responseTime;
    private final HttpStatusCode status;
    private final HttpProtocolVersion version;

    public DefaultHttpResponse(HttpClientCall call, HttpResponseData responseData) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(responseData, "responseData");
        this.call = call;
        this.coroutineContext = responseData.getCallContext();
        this.status = responseData.getStatusCode();
        this.version = responseData.getVersion();
        this.requestTime = responseData.getRequestTime();
        this.responseTime = responseData.getResponseTime();
        Object body = responseData.getBody();
        ByteReadChannel byteReadChannel = body instanceof ByteReadChannel ? (ByteReadChannel) body : null;
        this.content = byteReadChannel == null ? ByteReadChannel.Companion.getEmpty() : byteReadChannel;
        this.headers = responseData.getHeaders();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public ByteReadChannel getContent() {
        return this.content;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.http.HttpMessage
    public Headers getHeaders() {
        return this.headers;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public GMTDate getRequestTime() {
        return this.requestTime;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public GMTDate getResponseTime() {
        return this.responseTime;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public HttpStatusCode getStatus() {
        return this.status;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public HttpProtocolVersion getVersion() {
        return this.version;
    }
}
