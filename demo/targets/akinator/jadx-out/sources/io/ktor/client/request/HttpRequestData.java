package io.ktor.client.request;

import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.engine.HttpClientEngineCapabilityKt;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.Attributes;
import io.ktor.util.InternalAPI;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Job;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestData {
    private final Attributes attributes;
    private final OutgoingContent body;
    private final Job executionContext;
    private final Headers headers;
    private final HttpMethod method;
    private final Set<HttpClientEngineCapability<?>> requiredCapabilities;
    private final Url url;

    @InternalAPI
    public HttpRequestData(Url url, HttpMethod method, Headers headers, OutgoingContent body, Job executionContext, Attributes attributes) {
        Set<HttpClientEngineCapability<?>> setKeySet;
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(method, "method");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(executionContext, "executionContext");
        e0.checkNotNullParameter(attributes, "attributes");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = body;
        this.executionContext = executionContext;
        this.attributes = attributes;
        Map map = (Map) attributes.getOrNull(HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        this.requiredCapabilities = (map == null || (setKeySet = map.keySet()) == null) ? c2.emptySet() : setKeySet;
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public final OutgoingContent getBody() {
        return this.body;
    }

    public final <T> T getCapabilityOrNull(HttpClientEngineCapability<T> key) {
        e0.checkNotNullParameter(key, "key");
        Map map = (Map) this.attributes.getOrNull(HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    public final Job getExecutionContext() {
        return this.executionContext;
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final Set<HttpClientEngineCapability<?>> getRequiredCapabilities$ktor_client_core() {
        return this.requiredCapabilities;
    }

    public final Url getUrl() {
        return this.url;
    }

    public String toString() {
        return "HttpRequestData(url=" + this.url + ", method=" + this.method + ')';
    }
}
