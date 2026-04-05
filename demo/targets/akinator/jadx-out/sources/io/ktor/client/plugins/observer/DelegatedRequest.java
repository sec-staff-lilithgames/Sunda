package io.ktor.client.plugins.observer;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequest;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import kotlin.jvm.internal.e0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DelegatedRequest implements HttpRequest {
    private final /* synthetic */ HttpRequest $$delegate_0;
    private final HttpClientCall call;

    public DelegatedRequest(HttpClientCall call, HttpRequest origin) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(origin, "origin");
        this.call = call;
        this.$$delegate_0 = origin;
    }

    @Override // io.ktor.client.request.HttpRequest
    public Attributes getAttributes() {
        return this.$$delegate_0.getAttributes();
    }

    @Override // io.ktor.client.request.HttpRequest
    public HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.request.HttpRequest
    public OutgoingContent getContent() {
        return this.$$delegate_0.getContent();
    }

    @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // io.ktor.http.HttpMessage
    public Headers getHeaders() {
        return this.$$delegate_0.getHeaders();
    }

    @Override // io.ktor.client.request.HttpRequest
    public HttpMethod getMethod() {
        return this.$$delegate_0.getMethod();
    }

    @Override // io.ktor.client.request.HttpRequest
    public Url getUrl() {
        return this.$$delegate_0.getUrl();
    }
}
