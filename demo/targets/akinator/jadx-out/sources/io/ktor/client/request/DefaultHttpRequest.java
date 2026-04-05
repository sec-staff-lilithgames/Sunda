package io.ktor.client.request;

import io.ktor.client.call.HttpClientCall;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import io.ktor.util.InternalAPI;
import kotlin.jvm.internal.e0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalAPI
/* loaded from: classes7.dex */
public class DefaultHttpRequest implements HttpRequest {
    private final Attributes attributes;
    private final HttpClientCall call;
    private final OutgoingContent content;
    private final Headers headers;
    private final HttpMethod method;
    private final Url url;

    public DefaultHttpRequest(HttpClientCall call, HttpRequestData data) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(data, "data");
        this.call = call;
        this.method = data.getMethod();
        this.url = data.getUrl();
        this.content = data.getBody();
        this.headers = data.getHeaders();
        this.attributes = data.getAttributes();
    }

    @Override // io.ktor.client.request.HttpRequest
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Override // io.ktor.client.request.HttpRequest
    public HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.request.HttpRequest
    public OutgoingContent getContent() {
        return this.content;
    }

    @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return getCall().getCoroutineContext();
    }

    @Override // io.ktor.http.HttpMessage
    public Headers getHeaders() {
        return this.headers;
    }

    @Override // io.ktor.client.request.HttpRequest
    public HttpMethod getMethod() {
        return this.method;
    }

    @Override // io.ktor.client.request.HttpRequest
    public Url getUrl() {
        return this.url;
    }
}
