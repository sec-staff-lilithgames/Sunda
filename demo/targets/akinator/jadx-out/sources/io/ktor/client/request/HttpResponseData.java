package io.ktor.client.request;

import io.ktor.http.Headers;
import io.ktor.http.HttpProtocolVersion;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.date.DateJvmKt;
import io.ktor.util.date.GMTDate;
import kotlin.jvm.internal.e0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpResponseData {
    private final Object body;
    private final m callContext;
    private final Headers headers;
    private final GMTDate requestTime;
    private final GMTDate responseTime;
    private final HttpStatusCode statusCode;
    private final HttpProtocolVersion version;

    public HttpResponseData(HttpStatusCode statusCode, GMTDate requestTime, Headers headers, HttpProtocolVersion version, Object body, m callContext) {
        e0.checkNotNullParameter(statusCode, "statusCode");
        e0.checkNotNullParameter(requestTime, "requestTime");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(version, "version");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(callContext, "callContext");
        this.statusCode = statusCode;
        this.requestTime = requestTime;
        this.headers = headers;
        this.version = version;
        this.body = body;
        this.callContext = callContext;
        this.responseTime = DateJvmKt.GMTDate$default(null, 1, null);
    }

    public final Object getBody() {
        return this.body;
    }

    public final m getCallContext() {
        return this.callContext;
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

    public final HttpProtocolVersion getVersion() {
        return this.version;
    }

    public String toString() {
        return "HttpResponseData=(statusCode=" + this.statusCode + ')';
    }
}
