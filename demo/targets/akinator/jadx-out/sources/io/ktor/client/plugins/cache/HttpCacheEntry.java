package io.ktor.client.plugins.cache;

import io.ktor.client.call.SavedHttpCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpCacheEntry {
    private final byte[] body;
    private final GMTDate expires;
    private final HttpResponse response;
    private final Headers responseHeaders;
    private final Map<String, String> varyKeys;

    public HttpCacheEntry(GMTDate expires, Map<String, String> varyKeys, HttpResponse response, byte[] body) {
        e0.checkNotNullParameter(expires, "expires");
        e0.checkNotNullParameter(varyKeys, "varyKeys");
        e0.checkNotNullParameter(response, "response");
        e0.checkNotNullParameter(body, "body");
        this.expires = expires;
        this.varyKeys = varyKeys;
        this.response = response;
        this.body = body;
        Headers.Companion companion = Headers.Companion;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        headersBuilder.appendAll(response.getHeaders());
        this.responseHeaders = headersBuilder.build();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof HttpCacheEntry)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return e0.areEqual(this.varyKeys, ((HttpCacheEntry) obj).varyKeys);
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final GMTDate getExpires() {
        return this.expires;
    }

    public final HttpResponse getResponse() {
        return this.response;
    }

    public final Headers getResponseHeaders$ktor_client_core() {
        return this.responseHeaders;
    }

    public final Map<String, String> getVaryKeys() {
        return this.varyKeys;
    }

    public int hashCode() {
        return this.varyKeys.hashCode();
    }

    public final HttpResponse produceResponse$ktor_client_core() {
        return new SavedHttpCall(this.response.getCall().getClient(), this.response.getCall().getRequest(), this.response, this.body).getResponse();
    }
}
