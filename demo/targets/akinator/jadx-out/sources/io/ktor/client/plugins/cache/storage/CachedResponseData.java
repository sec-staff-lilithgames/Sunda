package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.Url;
import io.ktor.util.date.GMTDate;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CachedResponseData {
    private final byte[] body;
    private final GMTDate expires;
    private final Headers headers;
    private final GMTDate requestTime;
    private final GMTDate responseTime;
    private final HttpStatusCode statusCode;
    private final Url url;
    private final Map<String, String> varyKeys;
    private final HttpProtocolVersion version;

    public CachedResponseData(Url url, HttpStatusCode statusCode, GMTDate requestTime, GMTDate responseTime, HttpProtocolVersion version, GMTDate expires, Headers headers, Map<String, String> varyKeys, byte[] body) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(statusCode, "statusCode");
        e0.checkNotNullParameter(requestTime, "requestTime");
        e0.checkNotNullParameter(responseTime, "responseTime");
        e0.checkNotNullParameter(version, "version");
        e0.checkNotNullParameter(expires, "expires");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(varyKeys, "varyKeys");
        e0.checkNotNullParameter(body, "body");
        this.url = url;
        this.statusCode = statusCode;
        this.requestTime = requestTime;
        this.responseTime = responseTime;
        this.version = version;
        this.expires = expires;
        this.headers = headers;
        this.varyKeys = varyKeys;
        this.body = body;
    }

    public final CachedResponseData copy$ktor_client_core(Map<String, String> varyKeys, GMTDate expires) {
        e0.checkNotNullParameter(varyKeys, "varyKeys");
        e0.checkNotNullParameter(expires, "expires");
        return new CachedResponseData(this.url, this.statusCode, this.requestTime, this.responseTime, this.version, expires, this.headers, varyKeys, this.body);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedResponseData)) {
            return false;
        }
        CachedResponseData cachedResponseData = (CachedResponseData) obj;
        return e0.areEqual(this.url, cachedResponseData.url) && e0.areEqual(this.varyKeys, cachedResponseData.varyKeys);
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final GMTDate getExpires() {
        return this.expires;
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final GMTDate getRequestTime() {
        return this.requestTime;
    }

    public final GMTDate getResponseTime() {
        return this.responseTime;
    }

    public final HttpStatusCode getStatusCode() {
        return this.statusCode;
    }

    public final Url getUrl() {
        return this.url;
    }

    public final Map<String, String> getVaryKeys() {
        return this.varyKeys;
    }

    public final HttpProtocolVersion getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.varyKeys.hashCode() + (this.url.hashCode() * 31);
    }
}
