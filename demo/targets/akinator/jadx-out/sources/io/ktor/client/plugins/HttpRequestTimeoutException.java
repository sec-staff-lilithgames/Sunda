package io.ktor.client.plugins;

import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestData;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestTimeoutException extends IOException {
    public HttpRequestTimeoutException(String url, Long l9) {
        e0.checkNotNullParameter(url, "url");
        StringBuilder sb2 = new StringBuilder("Request timeout has expired [url=");
        sb2.append(url);
        sb2.append(", request_timeout=");
        super(i.e(sb2, l9 == null ? "unknown" : l9, " ms]"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(HttpRequestBuilder request) {
        e0.checkNotNullParameter(request, "request");
        String strBuildString = request.getUrl().buildString();
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) request.getCapabilityOrNull(HttpTimeout.Plugin);
        this(strBuildString, httpTimeoutCapabilityConfiguration != null ? httpTimeoutCapabilityConfiguration.getRequestTimeoutMillis() : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(HttpRequestData request) {
        e0.checkNotNullParameter(request, "request");
        String string = request.getUrl().toString();
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) request.getCapabilityOrNull(HttpTimeout.Plugin);
        this(string, httpTimeoutCapabilityConfiguration != null ? httpTimeoutCapabilityConfiguration.getRequestTimeoutMillis() : null);
    }
}
