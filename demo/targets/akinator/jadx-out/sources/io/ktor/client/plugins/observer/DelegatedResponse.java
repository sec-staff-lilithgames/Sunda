package io.ktor.client.plugins.observer;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
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
public final class DelegatedResponse extends HttpResponse {
    private final HttpClientCall call;
    private final ByteReadChannel content;
    private final m coroutineContext;
    private final HttpResponse origin;

    public DelegatedResponse(HttpClientCall call, ByteReadChannel content, HttpResponse origin) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(content, "content");
        e0.checkNotNullParameter(origin, "origin");
        this.call = call;
        this.content = content;
        this.origin = origin;
        this.coroutineContext = origin.getCoroutineContext();
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
        return this.origin.getHeaders();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public GMTDate getRequestTime() {
        return this.origin.getRequestTime();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public GMTDate getResponseTime() {
        return this.origin.getResponseTime();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public HttpStatusCode getStatus() {
        return this.origin.getStatus();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public HttpProtocolVersion getVersion() {
        return this.origin.getVersion();
    }
}
